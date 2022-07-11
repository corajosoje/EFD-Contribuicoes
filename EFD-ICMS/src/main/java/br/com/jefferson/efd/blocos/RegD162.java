
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
@Table(name = "reg_d162")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD162.findAll", query = "SELECT r FROM RegD162 r"),
    @NamedQuery(name = "RegD162.findById", query = "SELECT r FROM RegD162 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD162.findByIdPai", query = "SELECT r FROM RegD162 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD162.findByLinha", query = "SELECT r FROM RegD162 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD162.findByHash", query = "SELECT r FROM RegD162 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD162.findByReg", query = "SELECT r FROM RegD162 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD162.findByCodMod", query = "SELECT r FROM RegD162 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD162.findBySer", query = "SELECT r FROM RegD162 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD162.findByNumDoc", query = "SELECT r FROM RegD162 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegD162.findByDtDoc", query = "SELECT r FROM RegD162 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD162.findByVlDoc", query = "SELECT r FROM RegD162 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD162.findByVlMerc", query = "SELECT r FROM RegD162 r WHERE r.vlMerc = :vlMerc"),
    @NamedQuery(name = "RegD162.findByQtdVol", query = "SELECT r FROM RegD162 r WHERE r.qtdVol = :qtdVol"),
    @NamedQuery(name = "RegD162.findByPesoBrt", query = "SELECT r FROM RegD162 r WHERE r.pesoBrt = :pesoBrt"),
    @NamedQuery(name = "RegD162.findByPesoLiq", query = "SELECT r FROM RegD162 r WHERE r.pesoLiq = :pesoLiq")})
public class RegD162 implements Serializable {

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
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "SER")
    private String ser;
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "VL_MERC")
    private BigDecimal vlMerc;
    @Column(name = "QTD_VOL")
    private String qtdVol;
    @Column(name = "PESO_BRT")
    private BigDecimal pesoBrt;
    @Column(name = "PESO_LIQ")
    private BigDecimal pesoLiq;

    public RegD162() {
    }

    public RegD162(Long id) {
        this.id = id;
    }

    public RegD162(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public String getQtdVol() {
        return qtdVol;
    }

    public void setQtdVol(String qtdVol) {
        this.qtdVol = qtdVol;
    }

    public BigDecimal getPesoBrt() {
        return pesoBrt;
    }

    public void setPesoBrt(BigDecimal pesoBrt) {
        this.pesoBrt = pesoBrt;
    }

    public BigDecimal getPesoLiq() {
        return pesoLiq;
    }

    public void setPesoLiq(BigDecimal pesoLiq) {
        this.pesoLiq = pesoLiq;
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
        if (!(object instanceof RegD162)) {
            return false;
        }
        RegD162 other = (RegD162) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD162[ id=" + id + " ]";
    }

}
