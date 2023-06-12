package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "reg_m800")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM800.findAll", query = "SELECT r FROM RegM800 r"),
    @NamedQuery(name = "RegM800.findById", query = "SELECT r FROM RegM800 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM800.findByIdPai", query = "SELECT r FROM RegM800 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM800.findByLinha", query = "SELECT r FROM RegM800 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM800.findByHashfile", query = "SELECT r FROM RegM800 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM800.findByReg", query = "SELECT r FROM RegM800 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM800.findByCstCofins", query = "SELECT r FROM RegM800 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegM800.findByVlTotRec", query = "SELECT r FROM RegM800 r WHERE r.vlTotRec = :vlTotRec"),
    @NamedQuery(name = "RegM800.findByCodCta", query = "SELECT r FROM RegM800 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegM800.findByDescCompl", query = "SELECT r FROM RegM800 r WHERE r.descCompl = :descCompl")})
@Registros(nivel = 2)
public class RegM800 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM001 idPai;

    @Override
    public RegM001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM001) idPai;
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
    private List<RegM810> regM810;

    public List<RegM810> getRegM810() {
        return regM810;
    }

    public void setRegM810(List<RegM810> regM810) {
        this.regM810 = regM810;
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
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_TOT_REC", precision = 15, scale = 6)
    private BigDecimal vlTotRec;

    public BigDecimal getVlTotRec() {
        return this.vlTotRec;
    }

    public void setVlTotRec(BigDecimal vlTotRec) {
        this.vlTotRec = vlTotRec;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "DESC_COMPL")
    private String descCompl;

    public String getDescCompl() {
        return this.descCompl;
    }

    public void setDescCompl(String descCompl) {
        this.descCompl = descCompl;
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
        final RegM800 other = (RegM800) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM800{" + "id=" + id + '}';
    }
}
