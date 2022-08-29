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
@Table(name = "reg_c800")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC800.findAll", query = "SELECT r FROM RegC800 r"),
    @NamedQuery(name = "RegC800.findById", query = "SELECT r FROM RegC800 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC800.findByIdPai", query = "SELECT r FROM RegC800 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC800.findByLinha", query = "SELECT r FROM RegC800 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC800.findByHash", query = "SELECT r FROM RegC800 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC800.findByReg", query = "SELECT r FROM RegC800 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC800.findByCodMod", query = "SELECT r FROM RegC800 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC800.findByCodSit", query = "SELECT r FROM RegC800 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegC800.findByNumCfe", query = "SELECT r FROM RegC800 r WHERE r.numCfe = :numCfe"),
    @NamedQuery(name = "RegC800.findByDtDoc", query = "SELECT r FROM RegC800 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC800.findByVlCfe", query = "SELECT r FROM RegC800 r WHERE r.vlCfe = :vlCfe"),
    @NamedQuery(name = "RegC800.findByVlPis", query = "SELECT r FROM RegC800 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC800.findByVlCofins", query = "SELECT r FROM RegC800 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC800.findByCnpjCpf", query = "SELECT r FROM RegC800 r WHERE r.cnpjCpf = :cnpjCpf"),
    @NamedQuery(name = "RegC800.findByNrSat", query = "SELECT r FROM RegC800 r WHERE r.nrSat = :nrSat"),
    @NamedQuery(name = "RegC800.findByChvCfe", query = "SELECT r FROM RegC800 r WHERE r.chvCfe = :chvCfe"),
    @NamedQuery(name = "RegC800.findByVlDesc", query = "SELECT r FROM RegC800 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC800.findByVlMerc", query = "SELECT r FROM RegC800 r WHERE r.vlMerc = :vlMerc"),
    @NamedQuery(name = "RegC800.findByVlOutDa", query = "SELECT r FROM RegC800 r WHERE r.vlOutDa = :vlOutDa"),
    @NamedQuery(name = "RegC800.findByVlIcms", query = "SELECT r FROM RegC800 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC800.findByVlPisSt", query = "SELECT r FROM RegC800 r WHERE r.vlPisSt = :vlPisSt"),
    @NamedQuery(name = "RegC800.findByVlCofinsSt", query = "SELECT r FROM RegC800 r WHERE r.vlCofinsSt = :vlCofinsSt")})
public class RegC800 implements Serializable {

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
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "COD_SIT")
    private String codSit;
    @Column(name = "NUM_CFE")
    private int numCfe;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_CFE")
    private BigDecimal vlCfe;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "CNPJ_CPF")
    private String cnpjCpf;
    @Column(name = "NR_SAT")
    private String nrSat;
    @Column(name = "CHV_CFE")
    private String chvCfe;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "VL_MERC")
    private BigDecimal vlMerc;
    @Column(name = "VL_OUT_DA")
    private BigDecimal vlOutDa;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_PIS_ST")
    private BigDecimal vlPisSt;
    @Column(name = "VL_COFINS_ST")
    private BigDecimal vlCofinsSt;

    public RegC800() {
    }

    public RegC800(Long id) {
        this.id = id;
    }

    public RegC800(Long id, long idPai, long linha, String hash) {
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

    public int getNumCfe() {
        return numCfe;
    }

    public void setNumCfe(int numCfe) {
        this.numCfe = numCfe;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlCfe() {
        return vlCfe;
    }

    public void setVlCfe(BigDecimal vlCfe) {
        this.vlCfe = vlCfe;
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

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getNrSat() {
        return nrSat;
    }

    public void setNrSat(String nrSat) {
        this.nrSat = nrSat;
    }

    public String getChvCfe() {
        return chvCfe;
    }

    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public BigDecimal getVlOutDa() {
        return vlOutDa;
    }

    public void setVlOutDa(BigDecimal vlOutDa) {
        this.vlOutDa = vlOutDa;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
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
        if (!(object instanceof RegC800)) {
            return false;
        }
        RegC800 other = (RegC800) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC800[ id=" + id + " ]";
    }

}
