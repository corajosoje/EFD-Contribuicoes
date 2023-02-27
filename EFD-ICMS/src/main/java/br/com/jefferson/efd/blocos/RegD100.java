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
@Table(name = "reg_d100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD100.findAll", query = "SELECT r FROM RegD100 r"),
    @NamedQuery(name = "RegD100.findById", query = "SELECT r FROM RegD100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD100.findByIdPai", query = "SELECT r FROM RegD100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD100.findByLinha", query = "SELECT r FROM RegD100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD100.findByHashfile", query = "SELECT r FROM RegD100 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 2)
public class RegD100 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD001 idPai;

    public RegD001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD001) idPai;
    }

    public RegD100() {
    }

    public RegD100(String id) {
        this.id = id;
    }

    public RegD100(String id, RegD001 idPai, long linha, String hashfile) {
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
    private RegD101 regD101;

    public RegD101 getRegD101() {
        return regD101;
    }

    public void setRegD101(RegD101 regD101) {
        this.regD101 = regD101;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD110> regD110;

    public List<RegD110> getRegD110() {
        return regD110;
    }

    public void setRegD110(List<RegD110> regD110) {
        this.regD110 = regD110;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD130> regD130;

    public List<RegD130> getRegD130() {
        return regD130;
    }

    public void setRegD130(List<RegD130> regD130) {
        this.regD130 = regD130;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegD140 regD140;

    public RegD140 getRegD140() {
        return regD140;
    }

    public void setRegD140(RegD140 regD140) {
        this.regD140 = regD140;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegD150 regD150;

    public RegD150 getRegD150() {
        return regD150;
    }

    public void setRegD150(RegD150 regD150) {
        this.regD150 = regD150;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD160> regD160;

    public List<RegD160> getRegD160() {
        return regD160;
    }

    public void setRegD160(List<RegD160> regD160) {
        this.regD160 = regD160;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegD170 regD170;

    public RegD170 getRegD170() {
        return regD170;
    }

    public void setRegD170(RegD170 regD170) {
        this.regD170 = regD170;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD180> regD180;

    public List<RegD180> getRegD180() {
        return regD180;
    }

    public void setRegD180(List<RegD180> regD180) {
        this.regD180 = regD180;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD190> regD190;

    public List<RegD190> getRegD190() {
        return regD190;
    }

    public void setRegD190(List<RegD190> regD190) {
        this.regD190 = regD190;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD195> regD195;

    public List<RegD195> getRegD195() {
        return regD195;
    }

    public void setRegD195(List<RegD195> regD195) {
        this.regD195 = regD195;
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
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "SUB")
    private String sub;
    @Campos(posicao = 9, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CHV_CTE")
    private String chvCte;
    @Campos(posicao = 11, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 12, tipo = 'D')
    @Column(name = "DT_A_P")
    @Temporal(TemporalType.DATE)
    private Date dtAP;
    @Campos(posicao = 13, tipo = 'I')
    @Column(name = "TP_CT_E")
    private int tpCtE;
    @Campos(posicao = 14, tipo = 'C')
    @Column(name = "CHV_CTE_REF")
    private String chvCteRef;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "IND_FRT")
    private String indFrt;
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_SERV", precision = 15, scale = 6)
    private BigDecimal vlServ;
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_NT", precision = 15, scale = 6)
    private BigDecimal vlNt;
    @Campos(posicao = 22, tipo = 'C')
    @Column(name = "COD_INF")
    private String codInf;
    @Campos(posicao = 23, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;
    @Campos(posicao = 24, tipo = 'C')
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Campos(posicao = 25, tipo = 'C')
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;

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

    public int getTpCtE() {
        return tpCtE;
    }

    public void setTpCtE(int tpCtE) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
