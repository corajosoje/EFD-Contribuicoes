
package br.com.jefferson.efd.blocos;

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
@Table(name = "reg_c100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC100.findAll", query = "SELECT r FROM RegC100 r"),
    @NamedQuery(name = "RegC100.findById", query = "SELECT r FROM RegC100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC100.findByIdPai", query = "SELECT r FROM RegC100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC100.findByLinha", query = "SELECT r FROM RegC100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC100.findByHash", query = "SELECT r FROM RegC100 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC100.findByReg", query = "SELECT r FROM RegC100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC100.findByIndOper", query = "SELECT r FROM RegC100 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegC100.findByIndEmit", query = "SELECT r FROM RegC100 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegC100.findByCodPart", query = "SELECT r FROM RegC100 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC100.findByCodMod", query = "SELECT r FROM RegC100 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC100.findByCodSit", query = "SELECT r FROM RegC100 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegC100.findBySer", query = "SELECT r FROM RegC100 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC100.findByNumDoc", query = "SELECT r FROM RegC100 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC100.findByChvNfe", query = "SELECT r FROM RegC100 r WHERE r.chvNfe = :chvNfe"),
    @NamedQuery(name = "RegC100.findByDtDoc", query = "SELECT r FROM RegC100 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC100.findByDtES", query = "SELECT r FROM RegC100 r WHERE r.dtES = :dtES"),
    @NamedQuery(name = "RegC100.findByVlDoc", query = "SELECT r FROM RegC100 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC100.findByIndPgto", query = "SELECT r FROM RegC100 r WHERE r.indPgto = :indPgto"),
    @NamedQuery(name = "RegC100.findByVlDesc", query = "SELECT r FROM RegC100 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC100.findByVlAbatNt", query = "SELECT r FROM RegC100 r WHERE r.vlAbatNt = :vlAbatNt"),
    @NamedQuery(name = "RegC100.findByVlMerc", query = "SELECT r FROM RegC100 r WHERE r.vlMerc = :vlMerc"),
    @NamedQuery(name = "RegC100.findByIndFrt", query = "SELECT r FROM RegC100 r WHERE r.indFrt = :indFrt"),
    @NamedQuery(name = "RegC100.findByVlFrt", query = "SELECT r FROM RegC100 r WHERE r.vlFrt = :vlFrt"),
    @NamedQuery(name = "RegC100.findByVlSeg", query = "SELECT r FROM RegC100 r WHERE r.vlSeg = :vlSeg"),
    @NamedQuery(name = "RegC100.findByVlOutDa", query = "SELECT r FROM RegC100 r WHERE r.vlOutDa = :vlOutDa"),
    @NamedQuery(name = "RegC100.findByVlBcIcms", query = "SELECT r FROM RegC100 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC100.findByVlIcms", query = "SELECT r FROM RegC100 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC100.findByVlBcIcmsSt", query = "SELECT r FROM RegC100 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC100.findByVlIcmsSt", query = "SELECT r FROM RegC100 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC100.findByVlIpi", query = "SELECT r FROM RegC100 r WHERE r.vlIpi = :vlIpi"),
    @NamedQuery(name = "RegC100.findByVlPis", query = "SELECT r FROM RegC100 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC100.findByVlCofins", query = "SELECT r FROM RegC100 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC100.findByVlPisSt", query = "SELECT r FROM RegC100 r WHERE r.vlPisSt = :vlPisSt"),
    @NamedQuery(name = "RegC100.findByVlCofinsSt", query = "SELECT r FROM RegC100 r WHERE r.vlCofinsSt = :vlCofinsSt")})
public class RegC100 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
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
    private long hash;
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
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "CHV_NFE")
    private String chvNfe;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "DT_E_S")
    @Temporal(TemporalType.DATE)
    private Date dtES;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "IND_PGTO")
    private String indPgto;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "VL_ABAT_NT")
    private BigDecimal vlAbatNt;
    @Column(name = "VL_MERC")
    private BigDecimal vlMerc;
    @Column(name = "IND_FRT")
    private String indFrt;
    @Column(name = "VL_FRT")
    private BigDecimal vlFrt;
    @Column(name = "VL_SEG")
    private BigDecimal vlSeg;
    @Column(name = "VL_OUT_DA")
    private BigDecimal vlOutDa;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_BC_ICMS_ST")
    private BigDecimal vlBcIcmsSt;
    @Column(name = "VL_ICMS_ST")
    private BigDecimal vlIcmsSt;
    @Column(name = "VL_IPI")
    private BigDecimal vlIpi;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "VL_PIS_ST")
    private BigDecimal vlPisSt;
    @Column(name = "VL_COFINS_ST")
    private BigDecimal vlCofinsSt;

    public RegC100() {
    }

    public RegC100(Long id) {
        this.id = id;
    }

    public RegC100(Long id, long idPai, long linha, long hash) {
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

    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
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

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Date getDtES() {
        return dtES;
    }

    public void setDtES(Date dtES) {
        this.dtES = dtES;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public String getIndPgto() {
        return indPgto;
    }

    public void setIndPgto(String indPgto) {
        this.indPgto = indPgto;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public String getIndFrt() {
        return indFrt;
    }

    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
    }

    public BigDecimal getVlFrt() {
        return vlFrt;
    }

    public void setVlFrt(BigDecimal vlFrt) {
        this.vlFrt = vlFrt;
    }

    public BigDecimal getVlSeg() {
        return vlSeg;
    }

    public void setVlSeg(BigDecimal vlSeg) {
        this.vlSeg = vlSeg;
    }

    public BigDecimal getVlOutDa() {
        return vlOutDa;
    }

    public void setVlOutDa(BigDecimal vlOutDa) {
        this.vlOutDa = vlOutDa;
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

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
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

    public BigDecimal getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(BigDecimal vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public BigDecimal getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(BigDecimal vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
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
        if (!(object instanceof RegC100)) {
            return false;
        }
        RegC100 other = (RegC100) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC100[ id=" + id + " ]";
    }

}
