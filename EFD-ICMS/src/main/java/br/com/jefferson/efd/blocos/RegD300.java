package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_d300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD300.findAll", query = "SELECT r FROM RegD300 r"),
    @NamedQuery(name = "RegD300.findById", query = "SELECT r FROM RegD300 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD300.findByIdPai", query = "SELECT r FROM RegD300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD300.findByLinha", query = "SELECT r FROM RegD300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD300.findByHash", query = "SELECT r FROM RegD300 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD300.findByReg", query = "SELECT r FROM RegD300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD300.findByCodMod", query = "SELECT r FROM RegD300 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD300.findBySer", query = "SELECT r FROM RegD300 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD300.findBySub", query = "SELECT r FROM RegD300 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD300.findByNumDocIni", query = "SELECT r FROM RegD300 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "RegD300.findByNumDocFin", query = "SELECT r FROM RegD300 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "RegD300.findByCstIcms", query = "SELECT r FROM RegD300 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegD300.findByCfop", query = "SELECT r FROM RegD300 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegD300.findByAliqIcms", query = "SELECT r FROM RegD300 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegD300.findByDtDoc", query = "SELECT r FROM RegD300 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD300.findByVlOpr", query = "SELECT r FROM RegD300 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegD300.findByVlDesc", query = "SELECT r FROM RegD300 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD300.findByVlServ", query = "SELECT r FROM RegD300 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD300.findByVlSeg", query = "SELECT r FROM RegD300 r WHERE r.vlSeg = :vlSeg"),
    @NamedQuery(name = "RegD300.findByVlOutDesp", query = "SELECT r FROM RegD300 r WHERE r.vlOutDesp = :vlOutDesp"),
    @NamedQuery(name = "RegD300.findByVlBcIcms", query = "SELECT r FROM RegD300 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD300.findByVlIcms", query = "SELECT r FROM RegD300 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD300.findByVlRedBc", query = "SELECT r FROM RegD300 r WHERE r.vlRedBc = :vlRedBc"),
    @NamedQuery(name = "RegD300.findByCodObs", query = "SELECT r FROM RegD300 r WHERE r.codObs = :codObs"),
    @NamedQuery(name = "RegD300.findByCodCta", query = "SELECT r FROM RegD300 r WHERE r.codCta = :codCta")})
public class RegD300 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_PAI")
    private long idPai;
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "SER")
    private String ser;
    @Column(name = "SUB")
    private int sub;
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Column(name = "CFOP")
    private String cfop;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALIQ_ICMS")
    private BigDecimal aliqIcms;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "VL_OPR")
    private BigDecimal vlOpr;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "VL_SERV")
    private BigDecimal vlServ;
    @Column(name = "VL_SEG")
    private BigDecimal vlSeg;
    @Column(name = "VL_OUT_DESP")
    private BigDecimal vlOutDesp;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_RED_BC")
    private BigDecimal vlRedBc;
    @Column(name = "COD_OBS")
    private String codObs;
    @Column(name = "COD_CTA")
    private String codCta;

    public RegD300() {
    }

    public RegD300(Long id) {
        this.id = id;
    }

    public RegD300(Long id, long idPai, long linha, String hash) {
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

    public long getIdPai() {
        return idPai;
    }

    public void setIdPai(long idPai) {
        this.idPai = idPai;
    }

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

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(int numDocIni) {
        this.numDocIni = numDocIni;
    }

    public int getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(int numDocFin) {
        this.numDocFin = numDocFin;
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

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }

    public BigDecimal getVlSeg() {
        return vlSeg;
    }

    public void setVlSeg(BigDecimal vlSeg) {
        this.vlSeg = vlSeg;
    }

    public BigDecimal getVlOutDesp() {
        return vlOutDesp;
    }

    public void setVlOutDesp(BigDecimal vlOutDesp) {
        this.vlOutDesp = vlOutDesp;
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

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
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
        if (!(object instanceof RegD300)) {
            return false;
        }
        RegD300 other = (RegD300) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD300[ id=" + id + " ]";
    }

}
