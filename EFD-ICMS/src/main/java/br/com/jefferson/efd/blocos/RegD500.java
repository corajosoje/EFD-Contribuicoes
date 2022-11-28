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
@Registros(nivel = 2)
public class RegD500 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD001 idPai;

    public RegD001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD001) idPai;
    }

    public RegD500() {
    }

    public RegD500(Long id) {
        this.id = id;
    }

    public RegD500(Long id, RegD001 idPai, long linha, String hash) {
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
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD510> regD510;

    public List<RegD510> getRegD510() {
        return regD510;
    }

    public void setRegD510(List<RegD510> regD510) {
        this.regD510 = regD510;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD530> regD530;

    public List<RegD530> getRegD530() {
        return regD530;
    }

    public void setRegD530(List<RegD530> regD530) {
        this.regD530 = regD530;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD590> regD590;

    public List<RegD590> getRegD590() {
        return regD590;
    }

    public void setRegD590(List<RegD590> regD590) {
        this.regD590 = regD590;
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
    @Campos(posicao = 10, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 11, tipo = 'D')
    @Column(name = "DT_A_P")
    @Temporal(TemporalType.DATE)
    private Date dtAP;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_SERV")
    private BigDecimal vlServ;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_SERV_NT")
    private BigDecimal vlServNt;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_TERC")
    private BigDecimal vlTerc;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_DA")
    private BigDecimal vlDa;
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Campos(posicao = 20, tipo = 'C')
    @Column(name = "COD_INF")
    private String codInf;
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Campos(posicao = 22, tipo = 'R')
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Campos(posicao = 23, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;
    @Campos(posicao = 24, tipo = 'C')
    @Column(name = "TP_ASSINANTE")
    private String tpAssinante;

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
