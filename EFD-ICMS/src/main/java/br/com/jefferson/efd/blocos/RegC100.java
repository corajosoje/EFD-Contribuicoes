package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC100.findAll", query = "SELECT r FROM RegC100 r"),
    @NamedQuery(name = "RegC100.findById", query = "SELECT r FROM RegC100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC100.findByIdPai", query = "SELECT r FROM RegC100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC100.findByLinha", query = "SELECT r FROM RegC100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC100.findByHashfile", query = "SELECT r FROM RegC100 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 2)
public class RegC100 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC001 idPai;

    public RegC001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC001) idPai;
    }

    public RegC100() {
    }

    public RegC100(String id) {
        this.id = id;
    }

    public RegC100(String id, RegC001 idPai, long linha, String hashfile) {
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC101 regC101;

    public RegC101 getRegC101() {
        return regC101;
    }

    public void setRegC101(RegC101 regC101) {
        this.regC101 = regC101;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC105 regC105;

    public RegC105 getRegC105() {
        return regC105;
    }

    public void setRegC105(RegC105 regC105) {
        this.regC105 = regC105;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC110> regC110;

    public List<RegC110> getRegC110() {
        return regC110;
    }

    public void setRegC110(List<RegC110> regC110) {
        this.regC110 = regC110;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC120> regC120;

    public List<RegC120> getRegC120() {
        return regC120;
    }

    public void setRegC120(List<RegC120> regC120) {
        this.regC120 = regC120;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC130 regC130;

    public RegC130 getRegC130() {
        return regC130;
    }

    public void setRegC130(RegC130 regC130) {
        this.regC130 = regC130;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC140 regC140;

    public RegC140 getRegC140() {
        return regC140;
    }

    public void setRegC140(RegC140 regC140) {
        this.regC140 = regC140;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC160 regC160;

    public RegC160 getRegC160() {
        return regC160;
    }

    public void setRegC160(RegC160 regC160) {
        this.regC160 = regC160;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC165> regC165;

    public List<RegC165> getRegC165() {
        return regC165;
    }

    public void setRegC165(List<RegC165> regC165) {
        this.regC165 = regC165;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC170> regC170;

    public List<RegC170> getRegC170() {
        return regC170;
    }

    public void setRegC170(List<RegC170> regC170) {
        this.regC170 = regC170;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC185> regC185;

    public List<RegC185> getRegC185() {
        return regC185;
    }

    public void setRegC185(List<RegC185> regC185) {
        this.regC185 = regC185;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC186> regC186;

    public List<RegC186> getRegC186() {
        return regC186;
    }

    public void setRegC186(List<RegC186> regC186) {
        this.regC186 = regC186;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC190> regC190;

    public List<RegC190> getRegC190() {
        return regC190;
    }

    public void setRegC190(List<RegC190> regC190) {
        this.regC190 = regC190;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC195> regC195;

    public List<RegC195> getRegC195() {
        return regC195;
    }

    public void setRegC195(List<RegC195> regC195) {
        this.regC195 = regC195;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_OPER")
    private String indOper;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_SIT")
    private String codSit;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CHV_NFE")
    private String chvNfe;
    @Campos(posicao = 10, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 11, tipo = 'D')
    @Column(name = "DT_E_S")
    @Temporal(TemporalType.DATE)
    private Date dtES;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "IND_PGTO")
    private String indPgto;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_ABAT_NT", precision = 15, scale = 6)
    private BigDecimal vlAbatNt;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_MERC", precision = 15, scale = 6)
    private BigDecimal vlMerc;
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "IND_FRT")
    private String indFrt;
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_FRT", precision = 15, scale = 6)
    private BigDecimal vlFrt;
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_SEG", precision = 15, scale = 6)
    private BigDecimal vlSeg;
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_OUT_DA", precision = 15, scale = 6)
    private BigDecimal vlOutDa;
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 22, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 23, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;
    @Campos(posicao = 24, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;
    @Campos(posicao = 25, tipo = 'R')
    @Column(name = "VL_IPI", precision = 15, scale = 6)
    private BigDecimal vlIpi;
    @Campos(posicao = 26, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 27, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 28, tipo = 'R')
    @Column(name = "VL_PIS_ST", precision = 15, scale = 6)
    private BigDecimal vlPisSt;
    @Campos(posicao = 29, tipo = 'R')
    @Column(name = "VL_COFINS_ST", precision = 15, scale = 6)
    private BigDecimal vlCofinsSt;

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

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
