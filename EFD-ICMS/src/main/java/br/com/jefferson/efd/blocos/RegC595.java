package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
@Table(name = "reg_c595")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC595.findAll", query = "SELECT r FROM RegC595 r"),
    @NamedQuery(name = "RegC595.findById", query = "SELECT r FROM RegC595 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC595.findByIdPai", query = "SELECT r FROM RegC595 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC595.findByLinha", query = "SELECT r FROM RegC595 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC595.findByHashfile", query = "SELECT r FROM RegC595 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC595.findByReg", query = "SELECT r FROM RegC595 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC595.findByCodObs", query = "SELECT r FROM RegC595 r WHERE r.codObs = :codObs"),
    @NamedQuery(name = "RegC595.findByTxtCompl", query = "SELECT r FROM RegC595 r WHERE r.txtCompl = :txtCompl")})
@Registros(nivel = 3)
public class RegC595 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC500 idPai;

    public RegC500 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC500) idPai;
    }

    public RegC595() {
    }

    public RegC595(String id) {
        this.id = id;
    }

    public RegC595(String id, RegC500 idPai, long linha, String hashfile) {
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
    private List<RegC597> regC597;

    public List<RegC597> getRegC597() {
        return regC597;
    }

    public void setRegC597(List<RegC597> regC597) {
        this.regC597 = regC597;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_OBS")
    private String codObs;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "TXT_COMPL")
    private String txtCompl;

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

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
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
        if (!(object instanceof RegC595)) {
            return false;
        }
        RegC595 other = (RegC595) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC595[ id=" + id + " ]";
    }

}
