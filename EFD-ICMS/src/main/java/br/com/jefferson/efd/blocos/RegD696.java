package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import static br.com.jefferson.efd.blocos.Reg1510_.vlBcIcmsSt;
import static br.com.jefferson.efd.blocos.Reg1510_.vlIcmsSt;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * @author 88717
 */
@Entity
@Table(name = "reg_d696")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD696.findAll", query = "SELECT r FROM RegD696 r"),
    @NamedQuery(name = "RegD696.findById", query = "SELECT r FROM RegD696 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD696.findByIdPai", query = "SELECT r FROM RegD696 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD696.findByLinha", query = "SELECT r FROM RegD696 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD696.findByHash", query = "SELECT r FROM RegD696 r WHERE r.hash = :hash"),
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
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

    public RegD696(Long id) {
        this.id = id;
    }

    public RegD696(Long id, RegD695 idPai, long linha, String hash) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hash = hash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
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
    @Column(name = "ALIQ_ICMS")
    private BigDecimal aliqIcms;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_OPR")
    private BigDecimal vlOpr;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_BC_ICMS_UF")
    private BigDecimal vlBcIcmsUf;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_ICMS_UF")
    private BigDecimal vlIcmsUf;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_RED_BC")
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

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
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
