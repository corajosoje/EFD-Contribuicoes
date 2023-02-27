package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c400")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC400.findAll", query = "SELECT r FROM RegC400 r"),
    @NamedQuery(name = "RegC400.findById", query = "SELECT r FROM RegC400 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC400.findByIdPai", query = "SELECT r FROM RegC400 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC400.findByLinha", query = "SELECT r FROM RegC400 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC400.findByHashfile", query = "SELECT r FROM RegC400 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC400.findByReg", query = "SELECT r FROM RegC400 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC400.findByCodMod", query = "SELECT r FROM RegC400 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC400.findByEcfMod", query = "SELECT r FROM RegC400 r WHERE r.ecfMod = :ecfMod"),
    @NamedQuery(name = "RegC400.findByEcfFab", query = "SELECT r FROM RegC400 r WHERE r.ecfFab = :ecfFab"),
    @NamedQuery(name = "RegC400.findByEcfCx", query = "SELECT r FROM RegC400 r WHERE r.ecfCx = :ecfCx")})
@Registros(nivel = 2)
public class RegC400 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC001 idPai;

    public RegC001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC001) idPai;
    }

    public RegC400() {
    }

    public RegC400(String id) {
        this.id = id;
    }

    public RegC400(String id, RegC001 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC405> regC405;

    public List<RegC405> getRegC405() {
        return regC405;
    }

    public void setRegC405(List<RegC405> regC405) {
        this.regC405 = regC405;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "ECF_MOD")
    private String ecfMod;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "ECF_FAB")
    private String ecfFab;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "ECF_CX")
    private int ecfCx;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHashfile() {
        return hashfile;
    }

    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getEcfMod() {
        return ecfMod;
    }

    public void setEcfMod(String ecfMod) {
        this.ecfMod = ecfMod;
    }

    public String getEcfFab() {
        return ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }

    public int getEcfCx() {
        return ecfCx;
    }

    public void setEcfCx(int ecfCx) {
        this.ecfCx = ecfCx;
    }

    @Override
    public int hashCode() {
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegC400)) {
            return false;
        }
        RegC400 other = (RegC400) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC400[ id=" + id + " ]";
    }

}
