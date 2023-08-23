package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
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
@Registros(nivel = 3)
public class RegC100 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC010 idPai;

    @Override
    public RegC010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC010) idPai;
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
    private List<RegC110> regC110;

    public List<RegC110> getRegC110() {
        return regC110;
    }

    public void setRegC110(List<RegC110> regC110) {
        this.regC110 = regC110;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC111> regC111;

    public List<RegC111> getRegC111() {
        return regC111;
    }

    public void setRegC111(List<RegC111> regC111) {
        this.regC111 = regC111;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC120> regC120;

    public List<RegC120> getRegC120() {
        return regC120;
    }

    public void setRegC120(List<RegC120> regC120) {
        this.regC120 = regC120;
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
    private List<RegC175> regC175;

    public List<RegC175> getRegC175() {
        return regC175;
    }

    public void setRegC175(List<RegC175> regC175) {
        this.regC175 = regC175;
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
    @Column(name = "IND_OPER")
    private String indOper;

    public String getIndOper() {
        return this.indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_EMIT")
    private String indEmit;

    public String getIndEmit() {
        return this.indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;

    public String getCodPart() {
        return this.codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_SIT")
    private String codSit;

    public String getCodSit() {
        return this.codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    public String getSer() {
        return this.ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;

    public int getNumDoc() {
        return this.numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CHV_NFE")
    private String chvNfe;

    public String getChvNfe() {
        return this.chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    @Campos(posicao = 10, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDoc;

    public Date getDtDoc() {
        return this.dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    @Campos(posicao = 11, tipo = 'D')
    @Column(name = "DT_E_S")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtES;

    public Date getDtES() {
        return this.dtES;
    }

    public void setDtES(Date dtES) {
        this.dtES = dtES;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;

    public BigDecimal getVlDoc() {
        return this.vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "IND_PGTO")
    private String indPgto;

    public String getIndPgto() {
        return this.indPgto;
    }

    public void setIndPgto(String indPgto) {
        this.indPgto = indPgto;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_ABAT_NT", precision = 15, scale = 6)
    private BigDecimal vlAbatNt;

    public BigDecimal getVlAbatNt() {
        return this.vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_MERC", precision = 15, scale = 6)
    private BigDecimal vlMerc;

    public BigDecimal getVlMerc() {
        return this.vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "IND_FRT")
    private String indFrt;

    public String getIndFrt() {
        return this.indFrt;
    }

    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_FRT", precision = 15, scale = 6)
    private BigDecimal vlFrt;

    public BigDecimal getVlFrt() {
        return this.vlFrt;
    }

    public void setVlFrt(BigDecimal vlFrt) {
        this.vlFrt = vlFrt;
    }
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_SEG", precision = 15, scale = 6)
    private BigDecimal vlSeg;

    public BigDecimal getVlSeg() {
        return this.vlSeg;
    }

    public void setVlSeg(BigDecimal vlSeg) {
        this.vlSeg = vlSeg;
    }
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_OUT_DA", precision = 15, scale = 6)
    private BigDecimal vlOutDa;

    public BigDecimal getVlOutDa() {
        return this.vlOutDa;
    }

    public void setVlOutDa(BigDecimal vlOutDa) {
        this.vlOutDa = vlOutDa;
    }
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;

    public BigDecimal getVlBcIcms() {
        return this.vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    @Campos(posicao = 22, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;

    public BigDecimal getVlIcms() {
        return this.vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }
    @Campos(posicao = 23, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;

    public BigDecimal getVlBcIcmsSt() {
        return this.vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    @Campos(posicao = 24, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;

    public BigDecimal getVlIcmsSt() {
        return this.vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    @Campos(posicao = 25, tipo = 'R')
    @Column(name = "VL_IPI", precision = 15, scale = 6)
    private BigDecimal vlIpi;

    public BigDecimal getVlIpi() {
        return this.vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }
    @Campos(posicao = 26, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 27, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 28, tipo = 'R')
    @Column(name = "VL_PIS_ST", precision = 15, scale = 6)
    private BigDecimal vlPisSt;

    public BigDecimal getVlPisSt() {
        return this.vlPisSt;
    }

    public void setVlPisSt(BigDecimal vlPisSt) {
        this.vlPisSt = vlPisSt;
    }
    @Campos(posicao = 29, tipo = 'R')
    @Column(name = "VL_COFINS_ST", precision = 15, scale = 6)
    private BigDecimal vlCofinsSt;

    public BigDecimal getVlCofinsSt() {
        return this.vlCofinsSt;
    }

    public void setVlCofinsSt(BigDecimal vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
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
        final RegC100 other = (RegC100) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC100{" + "id=" + id + '}';
    }
}
