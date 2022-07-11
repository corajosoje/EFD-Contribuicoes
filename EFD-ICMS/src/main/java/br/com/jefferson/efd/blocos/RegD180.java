
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
@Table(name = "reg_d180")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD180.findAll", query = "SELECT r FROM RegD180 r"),
    @NamedQuery(name = "RegD180.findById", query = "SELECT r FROM RegD180 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD180.findByIdPai", query = "SELECT r FROM RegD180 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD180.findByLinha", query = "SELECT r FROM RegD180 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD180.findByHash", query = "SELECT r FROM RegD180 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD180.findByReg", query = "SELECT r FROM RegD180 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD180.findByNumSeq", query = "SELECT r FROM RegD180 r WHERE r.numSeq = :numSeq"),
    @NamedQuery(name = "RegD180.findByIndEmit", query = "SELECT r FROM RegD180 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegD180.findByCnpjCpfEmit", query = "SELECT r FROM RegD180 r WHERE r.cnpjCpfEmit = :cnpjCpfEmit"),
    @NamedQuery(name = "RegD180.findByUfEmit", query = "SELECT r FROM RegD180 r WHERE r.ufEmit = :ufEmit"),
    @NamedQuery(name = "RegD180.findByIeEmit", query = "SELECT r FROM RegD180 r WHERE r.ieEmit = :ieEmit"),
    @NamedQuery(name = "RegD180.findByCodMunOrig", query = "SELECT r FROM RegD180 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD180.findByCnpjCpfTom", query = "SELECT r FROM RegD180 r WHERE r.cnpjCpfTom = :cnpjCpfTom"),
    @NamedQuery(name = "RegD180.findByUfTom", query = "SELECT r FROM RegD180 r WHERE r.ufTom = :ufTom"),
    @NamedQuery(name = "RegD180.findByIeTom", query = "SELECT r FROM RegD180 r WHERE r.ieTom = :ieTom"),
    @NamedQuery(name = "RegD180.findByCodMunDest", query = "SELECT r FROM RegD180 r WHERE r.codMunDest = :codMunDest"),
    @NamedQuery(name = "RegD180.findByCodMod", query = "SELECT r FROM RegD180 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD180.findBySer", query = "SELECT r FROM RegD180 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD180.findBySub", query = "SELECT r FROM RegD180 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD180.findByNumDoc", query = "SELECT r FROM RegD180 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegD180.findByDtDoc", query = "SELECT r FROM RegD180 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD180.findByVlDoc", query = "SELECT r FROM RegD180 r WHERE r.vlDoc = :vlDoc")})
public class RegD180 implements Serializable {

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
    @Column(name = "NUM_SEQ")
    private String numSeq;
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Column(name = "CNPJ_CPF_EMIT")
    private String cnpjCpfEmit;
    @Column(name = "UF_EMIT")
    private String ufEmit;
    @Column(name = "IE_EMIT")
    private String ieEmit;
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Column(name = "CNPJ_CPF_TOM")
    private String cnpjCpfTom;
    @Column(name = "UF_TOM")
    private String ufTom;
    @Column(name = "IE_TOM")
    private String ieTom;
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "SER")
    private String ser;
    @Column(name = "SUB")
    private String sub;
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;

    public RegD180() {
    }

    public RegD180(Long id) {
        this.id = id;
    }

    public RegD180(Long id, long idPai, long linha, long hash) {
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

    public String getNumSeq() {
        return numSeq;
    }

    public void setNumSeq(String numSeq) {
        this.numSeq = numSeq;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getCnpjCpfEmit() {
        return cnpjCpfEmit;
    }

    public void setCnpjCpfEmit(String cnpjCpfEmit) {
        this.cnpjCpfEmit = cnpjCpfEmit;
    }

    public String getUfEmit() {
        return ufEmit;
    }

    public void setUfEmit(String ufEmit) {
        this.ufEmit = ufEmit;
    }

    public String getIeEmit() {
        return ieEmit;
    }

    public void setIeEmit(String ieEmit) {
        this.ieEmit = ieEmit;
    }

    public String getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public String getCnpjCpfTom() {
        return cnpjCpfTom;
    }

    public void setCnpjCpfTom(String cnpjCpfTom) {
        this.cnpjCpfTom = cnpjCpfTom;
    }

    public String getUfTom() {
        return ufTom;
    }

    public void setUfTom(String ufTom) {
        this.ufTom = ufTom;
    }

    public String getIeTom() {
        return ieTom;
    }

    public void setIeTom(String ieTom) {
        this.ieTom = ieTom;
    }

    public String getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
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

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
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
        if (!(object instanceof RegD180)) {
            return false;
        }
        RegD180 other = (RegD180) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD180[ id=" + id + " ]";
    }

}
