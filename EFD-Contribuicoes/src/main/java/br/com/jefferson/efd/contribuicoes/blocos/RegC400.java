package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
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
@Registros(nivel = 3)
public class RegC400 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC010 idPai;

    @Override
    public RegC010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC010) idPai;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @PrePersist
    @Override
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Override
    public long getLinha() {
        return this.linha;
    }

    @Override
    public void setLinha(long linha) {
        this.linha = linha;
    }
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Override
    public String getHashfile() {
        return this.hashfile;
    }

    @Override
    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC405> regC405;

    public List<RegC405> getRegC405() {
        return regC405;
    }

    public void setRegC405(List<RegC405> regC405) {
        this.regC405 = regC405;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC489> regC489;

    public List<RegC489> getRegC489() {
        return regC489;
    }

    public void setRegC489(List<RegC489> regC489) {
        this.regC489 = regC489;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Override
    public String getReg() {
        return this.reg;
    }

    @Override
    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "ECF_MOD")
    private String ecfMod;

    public String getEcfMod() {
        return this.ecfMod;
    }

    public void setEcfMod(String ecfMod) {
        this.ecfMod = ecfMod;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "ECF_FAB")
    private String ecfFab;

    public String getEcfFab() {
        return this.ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "ECF_CX")
    private String ecfCx;

    public String getEcfCx() {
        return this.ecfCx;
    }

    public void setEcfCx(String ecfCx) {
        this.ecfCx = ecfCx;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegC400 other = (RegC400) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC400{" + "id=" + id + '}';
    }
}
