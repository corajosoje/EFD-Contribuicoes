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
@Table(name = "reg_c350")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC350.findAll", query = "SELECT r FROM RegC350 r"),
    @NamedQuery(name = "RegC350.findById", query = "SELECT r FROM RegC350 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC350.findByIdPai", query = "SELECT r FROM RegC350 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC350.findByLinha", query = "SELECT r FROM RegC350 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC350.findByHash", query = "SELECT r FROM RegC350 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC350.findByReg", query = "SELECT r FROM RegC350 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC350.findBySer", query = "SELECT r FROM RegC350 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC350.findBySubSer", query = "SELECT r FROM RegC350 r WHERE r.subSer = :subSer"),
    @NamedQuery(name = "RegC350.findByNumDoc", query = "SELECT r FROM RegC350 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC350.findByDtDoc", query = "SELECT r FROM RegC350 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC350.findByCnpjCpf", query = "SELECT r FROM RegC350 r WHERE r.cnpjCpf = :cnpjCpf"),
    @NamedQuery(name = "RegC350.findByVlMerc", query = "SELECT r FROM RegC350 r WHERE r.vlMerc = :vlMerc"),
    @NamedQuery(name = "RegC350.findByVlDoc", query = "SELECT r FROM RegC350 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC350.findByVlDesc", query = "SELECT r FROM RegC350 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC350.findByVlPis", query = "SELECT r FROM RegC350 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC350.findByVlCofis", query = "SELECT r FROM RegC350 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC350.findByCodCta", query = "SELECT r FROM RegC350 r WHERE r.codCta = :codCta")})
public class RegC350 implements Serializable {

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
    @Column(name = "SER")
    private String ser;
    @Column(name = "SUB_SER")
    private String subSer;
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "CNPJ_CPF")
    private String cnpjCpf;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_MERC")
    private BigDecimal vlMerc;
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "COD_CTA")
    private String codCta;

    public RegC350() {
    }

    public RegC350(Long id) {
        this.id = id;
    }

    public RegC350(Long id, long idPai, long linha, String hash) {
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

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSubSer() {
        return subSer;
    }

    public void setSubSer(String subSer) {
        this.subSer = subSer;
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

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegC350)) {
            return false;
        }
        RegC350 other = (RegC350) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC350[ id=" + id + " ]";
    }

}
