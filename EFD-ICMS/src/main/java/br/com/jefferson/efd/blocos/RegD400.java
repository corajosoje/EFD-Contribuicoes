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
@Table(name = "reg_d400")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD400.findAll", query = "SELECT r FROM RegD400 r"),
    @NamedQuery(name = "RegD400.findById", query = "SELECT r FROM RegD400 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD400.findByIdPai", query = "SELECT r FROM RegD400 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD400.findByLinha", query = "SELECT r FROM RegD400 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD400.findByHash", query = "SELECT r FROM RegD400 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD400.findByReg", query = "SELECT r FROM RegD400 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD400.findByCodPart", query = "SELECT r FROM RegD400 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegD400.findByCodMod", query = "SELECT r FROM RegD400 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD400.findByCodSit", query = "SELECT r FROM RegD400 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegD400.findBySer", query = "SELECT r FROM RegD400 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD400.findBySub", query = "SELECT r FROM RegD400 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD400.findByNumDoc", query = "SELECT r FROM RegD400 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegD400.findByDtDoc", query = "SELECT r FROM RegD400 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD400.findByVlDoc", query = "SELECT r FROM RegD400 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD400.findByVlDesc", query = "SELECT r FROM RegD400 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD400.findByVlServ", query = "SELECT r FROM RegD400 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD400.findByVlBcIcms", query = "SELECT r FROM RegD400 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD400.findByVlIcms", query = "SELECT r FROM RegD400 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD400.findByVlPis", query = "SELECT r FROM RegD400 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegD400.findByVlCofins", query = "SELECT r FROM RegD400 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegD400.findByCodCta", query = "SELECT r FROM RegD400 r WHERE r.codCta = :codCta")})
public class RegD400 implements Serializable {

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
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "COD_SIT")
    private String codSit;
    @Column(name = "SER")
    private String ser;
    @Column(name = "SUB")
    private int sub;
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "VL_SERV")
    private BigDecimal vlServ;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "COD_CTA")
    private String codCta;

    public RegD400() {
    }

    public RegD400(Long id) {
        this.id = id;
    }

    public RegD400(Long id, long idPai, long linha, String hash) {
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

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
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

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
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

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
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
        if (!(object instanceof RegD400)) {
            return false;
        }
        RegD400 other = (RegD400) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD400[ id=" + id + " ]";
    }

}
