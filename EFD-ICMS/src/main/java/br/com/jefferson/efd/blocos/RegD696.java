package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "reg_d696")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD696.findAll", query = "SELECT r FROM RegD696 r"),
    @NamedQuery(name = "RegD696.findById", query = "SELECT r FROM RegD696 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD696.findByIdPai", query = "SELECT r FROM RegD696 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD696.findByLinha", query = "SELECT r FROM RegD696 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD696.findByHashfile", query = "SELECT r FROM RegD696 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD696.findByReg", query = "SELECT r FROM RegD696 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD696.findByCstIcms", query = "SELECT r FROM RegD696 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegD696.findByCfop", query = "SELECT r FROM RegD696 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegD696.findByAliqIcms", query = "SELECT r FROM RegD696 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegD696.findByVlOpr", query = "SELECT r FROM RegD696 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegD696.findByVlBcIcms", query = "SELECT r FROM RegD696 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD696.findByVlIcms", query = "SELECT r FROM RegD696 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD696.findByVlBcIcmsUf", query = "SELECT r FROM RegD696 r WHERE r.vlBcIcmsUf = :vlBcIcmsUf"),
    @NamedQuery(name = "RegD696.findByVlIcmsUf", query = "SELECT r FROM RegD696 r WHERE r.vlIcmsUf = :vlIcmsUf"),
    @NamedQuery(name = "RegD696.findByVlRedBc", query = "SELECT r FROM RegD696 r WHERE r.vlRedBc = :vlRedBc"),
    @NamedQuery(name = "RegD696.findByCodObs", query = "SELECT r FROM RegD696 r WHERE r.codObs = :codObs")})
@Registros(nivel = 3)
public class RegD696 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD695 idPai;

    public RegD695 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD695) idPai;
    }

    public RegD696() {
    }

    public RegD696(String id) {
        this.id = id;
    }

    public RegD696(String id, RegD695 idPai, long linha, String hashfile) {
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
    private List<RegD697> regD697;

    public List<RegD697> getRegD697() {
        return regD697;
    }

    public void setRegD697(List<RegD697> regD697) {
        this.regD697 = regD697;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_OPR", precision = 15, scale = 6)
    private BigDecimal vlOpr;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_BC_ICMS_UF", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsUf;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_ICMS_UF", precision = 15, scale = 6)
    private BigDecimal vlIcmsUf;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_RED_BC", precision = 15, scale = 6)
    private BigDecimal vlRedBc;
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_OBS")
    private String codObs;

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

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsUf() {
        return vlBcIcmsUf;
    }

    public void setVlBcIcmsUf(BigDecimal vlBcIcmsUf) {
        this.vlBcIcmsUf = vlBcIcmsUf;
    }

    public BigDecimal getVlIcmsUf() {
        return vlIcmsUf;
    }

    public void setVlIcmsUf(BigDecimal vlIcmsUf) {
        this.vlIcmsUf = vlIcmsUf;
    }

    public BigDecimal getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(BigDecimal vlRedBc) {
        this.vlRedBc = vlRedBc;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
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
        if (!(object instanceof RegD696)) {
            return false;
        }
        RegD696 other = (RegD696) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD696[ id=" + id + " ]";
    }

}
