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
@Table(name = "reg_c500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC500.findAll", query = "SELECT r FROM RegC500 r"),
    @NamedQuery(name = "RegC500.findById", query = "SELECT r FROM RegC500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC500.findByIdPai", query = "SELECT r FROM RegC500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC500.findByLinha", query = "SELECT r FROM RegC500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC500.findByHash", query = "SELECT r FROM RegC500 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC500.findByReg", query = "SELECT r FROM RegC500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC500.findByIndOper", query = "SELECT r FROM RegC500 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegC500.findByIndEmit", query = "SELECT r FROM RegC500 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegC500.findByCodPart", query = "SELECT r FROM RegC500 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC500.findByCodMod", query = "SELECT r FROM RegC500 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC500.findByCodSit", query = "SELECT r FROM RegC500 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegC500.findBySer", query = "SELECT r FROM RegC500 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC500.findBySub", query = "SELECT r FROM RegC500 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegC500.findByCodCons", query = "SELECT r FROM RegC500 r WHERE r.codCons = :codCons"),
    @NamedQuery(name = "RegC500.findByNumDoc", query = "SELECT r FROM RegC500 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC500.findByDtDoc", query = "SELECT r FROM RegC500 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC500.findByDtES", query = "SELECT r FROM RegC500 r WHERE r.dtES = :dtES"),
    @NamedQuery(name = "RegC500.findByVlDoc", query = "SELECT r FROM RegC500 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC500.findByVlDesc", query = "SELECT r FROM RegC500 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC500.findByVlForn", query = "SELECT r FROM RegC500 r WHERE r.vlForn = :vlForn"),
    @NamedQuery(name = "RegC500.findByVlServNt", query = "SELECT r FROM RegC500 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "RegC500.findByVlTerc", query = "SELECT r FROM RegC500 r WHERE r.vlTerc = :vlTerc"),
    @NamedQuery(name = "RegC500.findByVlDa", query = "SELECT r FROM RegC500 r WHERE r.vlDa = :vlDa"),
    @NamedQuery(name = "RegC500.findByVlBcIcms", query = "SELECT r FROM RegC500 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC500.findByVlIcms", query = "SELECT r FROM RegC500 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC500.findByVlBcIcmsSt", query = "SELECT r FROM RegC500 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC500.findByVlIcmsSt", query = "SELECT r FROM RegC500 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC500.findByCodInf", query = "SELECT r FROM RegC500 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "RegC500.findByVlPis", query = "SELECT r FROM RegC500 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC500.findByVlCofins", query = "SELECT r FROM RegC500 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC500.findByTpLigacao", query = "SELECT r FROM RegC500 r WHERE r.tpLigacao = :tpLigacao"),
    @NamedQuery(name = "RegC500.findByCodGrupoTensao", query = "SELECT r FROM RegC500 r WHERE r.codGrupoTensao = :codGrupoTensao"),
    @NamedQuery(name = "RegC500.findByChvDoce", query = "SELECT r FROM RegC500 r WHERE r.chvDoce = :chvDoce"),
    @NamedQuery(name = "RegC500.findByFinDoce", query = "SELECT r FROM RegC500 r WHERE r.finDoce = :finDoce"),
    @NamedQuery(name = "RegC500.findByChvDoceRef", query = "SELECT r FROM RegC500 r WHERE r.chvDoceRef = :chvDoceRef"),
    @NamedQuery(name = "RegC500.findByIndDest", query = "SELECT r FROM RegC500 r WHERE r.indDest = :indDest"),
    @NamedQuery(name = "RegC500.findByCodMunDest", query = "SELECT r FROM RegC500 r WHERE r.codMunDest = :codMunDest"),
    @NamedQuery(name = "RegC500.findByCodCta", query = "SELECT r FROM RegC500 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegC500.findByCodModDocRef", query = "SELECT r FROM RegC500 r WHERE r.codModDocRef = :codModDocRef"),
    @NamedQuery(name = "RegC500.findByHashDocRef", query = "SELECT r FROM RegC500 r WHERE r.hashDocRef = :hashDocRef"),
    @NamedQuery(name = "RegC500.findBySerDocRef", query = "SELECT r FROM RegC500 r WHERE r.serDocRef = :serDocRef"),
    @NamedQuery(name = "RegC500.findByNumDocRef", query = "SELECT r FROM RegC500 r WHERE r.numDocRef = :numDocRef"),
    @NamedQuery(name = "RegC500.findByMesDocRef", query = "SELECT r FROM RegC500 r WHERE r.mesDocRef = :mesDocRef"),
    @NamedQuery(name = "RegC500.findByEnerInjet", query = "SELECT r FROM RegC500 r WHERE r.enerInjet = :enerInjet"),
    @NamedQuery(name = "RegC500.findByOutrasDed", query = "SELECT r FROM RegC500 r WHERE r.outrasDed = :outrasDed")})
public class RegC500 implements Serializable {

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
    private int sub;
    @Column(name = "COD_CONS")
    private String codCons;
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "DT_E_S")
    @Temporal(TemporalType.DATE)
    private Date dtES;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "VL_FORN")
    private BigDecimal vlForn;
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
    @Column(name = "VL_BC_ICMS_ST")
    private BigDecimal vlBcIcmsSt;
    @Column(name = "VL_ICMS_ST")
    private BigDecimal vlIcmsSt;
    @Column(name = "COD_INF")
    private String codInf;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "TP_LIGACAO")
    private String tpLigacao;
    @Column(name = "COD_GRUPO_TENSAO")
    private String codGrupoTensao;
    @Column(name = "CHV_DOCE")
    private String chvDoce;
    @Column(name = "FIN_DOCE")
    private String finDoce;
    @Column(name = "CHV_DOCE_REF")
    private String chvDoceRef;
    @Column(name = "IND_DEST")
    private String indDest;
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Column(name = "COD_CTA")
    private String codCta;
    @Column(name = "COD_MOD_DOC_REF")
    private String codModDocRef;
    @Column(name = "HASH_DOC_REF")
    private String hashDocRef;
    @Column(name = "SER_DOC_REF")
    private String serDocRef;
    @Column(name = "NUM_DOC_REF")
    private int numDocRef;
    @Column(name = "MES_DOC_REF")
    private String mesDocRef;
    @Column(name = "ENER_INJET")
    private BigDecimal enerInjet;
    @Column(name = "OUTRAS_DED")
    private BigDecimal outrasDed;

    public RegC500() {
    }

    public RegC500(Long id) {
        this.id = id;
    }

    public RegC500(Long id, long idPai, long linha, String hash) {
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

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public String getCodCons() {
        return codCons;
    }

    public void setCodCons(String codCons) {
        this.codCons = codCons;
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

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlForn() {
        return vlForn;
    }

    public void setVlForn(BigDecimal vlForn) {
        this.vlForn = vlForn;
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

    public String getTpLigacao() {
        return tpLigacao;
    }

    public void setTpLigacao(String tpLigacao) {
        this.tpLigacao = tpLigacao;
    }

    public String getCodGrupoTensao() {
        return codGrupoTensao;
    }

    public void setCodGrupoTensao(String codGrupoTensao) {
        this.codGrupoTensao = codGrupoTensao;
    }

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
    }

    public String getFinDoce() {
        return finDoce;
    }

    public void setFinDoce(String finDoce) {
        this.finDoce = finDoce;
    }

    public String getChvDoceRef() {
        return chvDoceRef;
    }

    public void setChvDoceRef(String chvDoceRef) {
        this.chvDoceRef = chvDoceRef;
    }

    public String getIndDest() {
        return indDest;
    }

    public void setIndDest(String indDest) {
        this.indDest = indDest;
    }

    public String getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getCodModDocRef() {
        return codModDocRef;
    }

    public void setCodModDocRef(String codModDocRef) {
        this.codModDocRef = codModDocRef;
    }

    public String getHashDocRef() {
        return hashDocRef;
    }

    public void setHashDocRef(String hashDocRef) {
        this.hashDocRef = hashDocRef;
    }

    public String getSerDocRef() {
        return serDocRef;
    }

    public void setSerDocRef(String serDocRef) {
        this.serDocRef = serDocRef;
    }

    public int getNumDocRef() {
        return numDocRef;
    }

    public void setNumDocRef(int numDocRef) {
        this.numDocRef = numDocRef;
    }

    public String getMesDocRef() {
        return mesDocRef;
    }

    public void setMesDocRef(String mesDocRef) {
        this.mesDocRef = mesDocRef;
    }

    public BigDecimal getEnerInjet() {
        return enerInjet;
    }

    public void setEnerInjet(BigDecimal enerInjet) {
        this.enerInjet = enerInjet;
    }

    public BigDecimal getOutrasDed() {
        return outrasDed;
    }

    public void setOutrasDed(BigDecimal outrasDed) {
        this.outrasDed = outrasDed;
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
        if (!(object instanceof RegC500)) {
            return false;
        }
        RegC500 other = (RegC500) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC500[ id=" + id + " ]";
    }

}
