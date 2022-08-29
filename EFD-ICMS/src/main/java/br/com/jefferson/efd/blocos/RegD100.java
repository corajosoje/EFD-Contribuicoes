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
@Table(name = "reg_d100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD100.findAll", query = "SELECT r FROM RegD100 r"),
    @NamedQuery(name = "RegD100.findById", query = "SELECT r FROM RegD100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD100.findByIdPai", query = "SELECT r FROM RegD100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD100.findByLinha", query = "SELECT r FROM RegD100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD100.findByHash", query = "SELECT r FROM RegD100 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD100.findByReg", query = "SELECT r FROM RegD100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD100.findByIndOper", query = "SELECT r FROM RegD100 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegD100.findByIndEmit", query = "SELECT r FROM RegD100 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegD100.findByCodPart", query = "SELECT r FROM RegD100 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegD100.findByCodMod", query = "SELECT r FROM RegD100 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD100.findByCodSit", query = "SELECT r FROM RegD100 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegD100.findBySer", query = "SELECT r FROM RegD100 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD100.findBySub", query = "SELECT r FROM RegD100 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD100.findByNumDoc", query = "SELECT r FROM RegD100 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegD100.findByChvCte", query = "SELECT r FROM RegD100 r WHERE r.chvCte = :chvCte"),
    @NamedQuery(name = "RegD100.findByDtDoc", query = "SELECT r FROM RegD100 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD100.findByDtAP", query = "SELECT r FROM RegD100 r WHERE r.dtAP = :dtAP"),
    @NamedQuery(name = "RegD100.findByTpCtE", query = "SELECT r FROM RegD100 r WHERE r.tpCtE = :tpCtE"),
    @NamedQuery(name = "RegD100.findByChvCteRef", query = "SELECT r FROM RegD100 r WHERE r.chvCteRef = :chvCteRef"),
    @NamedQuery(name = "RegD100.findByVlDoc", query = "SELECT r FROM RegD100 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD100.findByVlDesc", query = "SELECT r FROM RegD100 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD100.findByIndFrt", query = "SELECT r FROM RegD100 r WHERE r.indFrt = :indFrt"),
    @NamedQuery(name = "RegD100.findByVlServ", query = "SELECT r FROM RegD100 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD100.findByVlBcIcms", query = "SELECT r FROM RegD100 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD100.findByVlIcms", query = "SELECT r FROM RegD100 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD100.findByVlNt", query = "SELECT r FROM RegD100 r WHERE r.vlNt = :vlNt"),
    @NamedQuery(name = "RegD100.findByCodInf", query = "SELECT r FROM RegD100 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "RegD100.findByCodCta", query = "SELECT r FROM RegD100 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegD100.findByCodMunOrig", query = "SELECT r FROM RegD100 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD100.findByCodMunDest", query = "SELECT r FROM RegD100 r WHERE r.codMunDest = :codMunDest")})
public class RegD100 implements Serializable {

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
    @Column(name = "CHV_CTE")
    private String chvCte;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "DT_A_P")
    @Temporal(TemporalType.DATE)
    private Date dtAP;
    @Column(name = "TP_CT_E")
    private String tpCtE;
    @Column(name = "CHV_CTE_REF")
    private String chvCteRef;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "IND_FRT")
    private String indFrt;
    @Column(name = "VL_SERV")
    private BigDecimal vlServ;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_NT")
    private BigDecimal vlNt;
    @Column(name = "COD_INF")
    private String codInf;
    @Column(name = "COD_CTA")
    private String codCta;
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;

    public RegD100() {
    }

    public RegD100(Long id) {
        this.id = id;
    }

    public RegD100(Long id, long idPai, long linha, String hash) {
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

    public String getChvCte() {
        return chvCte;
    }

    public void setChvCte(String chvCte) {
        this.chvCte = chvCte;
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

    public String getTpCtE() {
        return tpCtE;
    }

    public void setTpCtE(String tpCtE) {
        this.tpCtE = tpCtE;
    }

    public String getChvCteRef() {
        return chvCteRef;
    }

    public void setChvCteRef(String chvCteRef) {
        this.chvCteRef = chvCteRef;
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

    public String getIndFrt() {
        return indFrt;
    }

    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
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

    public BigDecimal getVlNt() {
        return vlNt;
    }

    public void setVlNt(BigDecimal vlNt) {
        this.vlNt = vlNt;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public String getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
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
        if (!(object instanceof RegD100)) {
            return false;
        }
        RegD100 other = (RegD100) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD100[ id=" + id + " ]";
    }

}
