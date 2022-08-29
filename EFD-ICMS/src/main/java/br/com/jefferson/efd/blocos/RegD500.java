
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
@Table(name = "reg_d500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD500.findAll", query = "SELECT r FROM RegD500 r"),
    @NamedQuery(name = "RegD500.findById", query = "SELECT r FROM RegD500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD500.findByIdPai", query = "SELECT r FROM RegD500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD500.findByLinha", query = "SELECT r FROM RegD500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD500.findByHash", query = "SELECT r FROM RegD500 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD500.findByReg", query = "SELECT r FROM RegD500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD500.findByIndOper", query = "SELECT r FROM RegD500 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegD500.findByIndEmit", query = "SELECT r FROM RegD500 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegD500.findByCodPart", query = "SELECT r FROM RegD500 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegD500.findByCodMod", query = "SELECT r FROM RegD500 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD500.findByCodSit", query = "SELECT r FROM RegD500 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegD500.findBySer", query = "SELECT r FROM RegD500 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD500.findBySub", query = "SELECT r FROM RegD500 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD500.findByNumDoc", query = "SELECT r FROM RegD500 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegD500.findByDtDoc", query = "SELECT r FROM RegD500 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD500.findByDtAP", query = "SELECT r FROM RegD500 r WHERE r.dtAP = :dtAP"),
    @NamedQuery(name = "RegD500.findByVlDoc", query = "SELECT r FROM RegD500 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD500.findByVlDesc", query = "SELECT r FROM RegD500 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD500.findByVlServ", query = "SELECT r FROM RegD500 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD500.findByVlServNt", query = "SELECT r FROM RegD500 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "RegD500.findByVlTerc", query = "SELECT r FROM RegD500 r WHERE r.vlTerc = :vlTerc"),
    @NamedQuery(name = "RegD500.findByVlDa", query = "SELECT r FROM RegD500 r WHERE r.vlDa = :vlDa"),
    @NamedQuery(name = "RegD500.findByVlBcIcms", query = "SELECT r FROM RegD500 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD500.findByVlIcms", query = "SELECT r FROM RegD500 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD500.findByCodInf", query = "SELECT r FROM RegD500 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "RegD500.findByVlPis", query = "SELECT r FROM RegD500 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegD500.findByVlCofins", query = "SELECT r FROM RegD500 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegD500.findByCodCta", query = "SELECT r FROM RegD500 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegD500.findByTpAssinante", query = "SELECT r FROM RegD500 r WHERE r.tpAssinante = :tpAssinante")})
public class RegD500 implements Serializable {

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
    @Column(name = "IND_OPER")
    private String indOper;
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "COD_SIT")
    private String codSit;
    @Column(name = "SER")
    private String ser;
    @Column(name = "SUB")
    private String sub;
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "DT_A_P")
    @Temporal(TemporalType.DATE)
    private Date dtAP;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "VL_SERV")
    private BigDecimal vlServ;
    @Column(name = "VL_SERV_NT")
    private BigDecimal vlServNt;
    @Column(name = "VL_TERC")
    private BigDecimal vlTerc;
    @Column(name = "VL_DA")
    private BigDecimal vlDa;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "COD_INF")
    private String codInf;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "COD_CTA")
    private String codCta;
    @Column(name = "TP_ASSINANTE")
    private String tpAssinante;

    public RegD500() {
    }

    public RegD500(Long id) {
        this.id = id;
    }

    public RegD500(Long id, long idPai, long linha, String hash) {
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

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
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

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
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

    public Date getDtAP() {
        return dtAP;
    }

    public void setDtAP(Date dtAP) {
        this.dtAP = dtAP;
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

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlTerc() {
        return vlTerc;
    }

    public void setVlTerc(BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
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

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
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

    public String getTpAssinante() {
        return tpAssinante;
    }

    public void setTpAssinante(String tpAssinante) {
        this.tpAssinante = tpAssinante;
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
        if (!(object instanceof RegD500)) {
            return false;
        }
        RegD500 other = (RegD500) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD500[ id=" + id + " ]";
    }

}
