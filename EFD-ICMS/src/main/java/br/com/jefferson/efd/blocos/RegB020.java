package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_b020")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB020.findAll", query = "SELECT r FROM RegB020 r"),
    @NamedQuery(name = "RegB020.findById", query = "SELECT r FROM RegB020 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB020.findByIdPai", query = "SELECT r FROM RegB020 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB020.findByLinha", query = "SELECT r FROM RegB020 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB020.findByHash", query = "SELECT r FROM RegB020 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB020.findByReg", query = "SELECT r FROM RegB020 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB020.findByIndOper", query = "SELECT r FROM RegB020 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegB020.findByIndEmit", query = "SELECT r FROM RegB020 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegB020.findByCodPart", query = "SELECT r FROM RegB020 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegB020.findByCodMod", query = "SELECT r FROM RegB020 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegB020.findByCodSit", query = "SELECT r FROM RegB020 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegB020.findBySer", query = "SELECT r FROM RegB020 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegB020.findByNumDoc", query = "SELECT r FROM RegB020 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegB020.findByChvNfe", query = "SELECT r FROM RegB020 r WHERE r.chvNfe = :chvNfe"),
    @NamedQuery(name = "RegB020.findByDtDoc", query = "SELECT r FROM RegB020 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegB020.findByCodMunServ", query = "SELECT r FROM RegB020 r WHERE r.codMunServ = :codMunServ"),
    @NamedQuery(name = "RegB020.findByVlCont", query = "SELECT r FROM RegB020 r WHERE r.vlCont = :vlCont"),
    @NamedQuery(name = "RegB020.findByVlMatTerc", query = "SELECT r FROM RegB020 r WHERE r.vlMatTerc = :vlMatTerc"),
    @NamedQuery(name = "RegB020.findByVlSub", query = "SELECT r FROM RegB020 r WHERE r.vlSub = :vlSub"),
    @NamedQuery(name = "RegB020.findByVlIsntIss", query = "SELECT r FROM RegB020 r WHERE r.vlIsntIss = :vlIsntIss"),
    @NamedQuery(name = "RegB020.findByVlDedBc", query = "SELECT r FROM RegB020 r WHERE r.vlDedBc = :vlDedBc"),
    @NamedQuery(name = "RegB020.findByVlBcIss", query = "SELECT r FROM RegB020 r WHERE r.vlBcIss = :vlBcIss"),
    @NamedQuery(name = "RegB020.findByVlBcIssRt", query = "SELECT r FROM RegB020 r WHERE r.vlBcIssRt = :vlBcIssRt"),
    @NamedQuery(name = "RegB020.findByVlIssRt", query = "SELECT r FROM RegB020 r WHERE r.vlIssRt = :vlIssRt"),
    @NamedQuery(name = "RegB020.findByVlIss", query = "SELECT r FROM RegB020 r WHERE r.vlIss = :vlIss"),
    @NamedQuery(name = "RegB020.findByCodInfObs", query = "SELECT r FROM RegB020 r WHERE r.codInfObs = :codInfObs")})
@Registros(nivel = 2)
public class RegB020 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegB001 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;

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

    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_MUN_SERV")
    private String codMunServ;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_CONT")
    private BigDecimal vlCont;

    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_MAT_TERC")
    private BigDecimal vlMatTerc;

    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_SUB")
    private BigDecimal vlSub;

    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_ISNT_ISS")
    private BigDecimal vlIsntIss;

    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_DED_BC")
    private BigDecimal vlDedBc;

    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_BC_ISS")
    private BigDecimal vlBcIss;

    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_BC_ISS_RT")
    private BigDecimal vlBcIssRt;

    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_ISS_RT")
    private BigDecimal vlIssRt;

    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_ISS")
    private BigDecimal vlIss;

    @Campos(posicao = 21, tipo = 'C')
    @Column(name = "COD_INF_OBS")
    private String codInfObs;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegB025> regB025;

    public RegB020() {
    }

    public RegB020(Long id) {
        this.id = id;
    }

    public RegB020(Long id, RegB001 idPai, long linha, String hash) {
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

    public RegB001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegB001) idPai;
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

    public String getCodMunServ() {
        return codMunServ;
    }

    public void setCodMunServ(String codMunServ) {
        this.codMunServ = codMunServ;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlMatTerc() {
        return vlMatTerc;
    }

    public void setVlMatTerc(BigDecimal vlMatTerc) {
        this.vlMatTerc = vlMatTerc;
    }

    public BigDecimal getVlSub() {
        return vlSub;
    }

    public void setVlSub(BigDecimal vlSub) {
        this.vlSub = vlSub;
    }

    public BigDecimal getVlIsntIss() {
        return vlIsntIss;
    }

    public void setVlIsntIss(BigDecimal vlIsntIss) {
        this.vlIsntIss = vlIsntIss;
    }

    public BigDecimal getVlDedBc() {
        return vlDedBc;
    }

    public void setVlDedBc(BigDecimal vlDedBc) {
        this.vlDedBc = vlDedBc;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getVlBcIssRt() {
        return vlBcIssRt;
    }

    public void setVlBcIssRt(BigDecimal vlBcIssRt) {
        this.vlBcIssRt = vlBcIssRt;
    }

    public BigDecimal getVlIssRt() {
        return vlIssRt;
    }

    public void setVlIssRt(BigDecimal vlIssRt) {
        this.vlIssRt = vlIssRt;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public String getCodInfObs() {
        return codInfObs;
    }

    public void setCodInfObs(String codInfObs) {
        this.codInfObs = codInfObs;
    }

    public List<RegB025> getRegB025() {
        return regB025;
    }

    public void setRegB025(List<RegB025> regB025) {
        this.regB025 = regB025;
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
        if (!(object instanceof RegB020)) {
            return false;
        }
        RegB020 other = (RegB020) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB020[ id=" + id + " ]";
    }

}
