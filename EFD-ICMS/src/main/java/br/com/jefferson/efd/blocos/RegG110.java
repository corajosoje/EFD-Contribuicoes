
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
@Table(name = "reg_g110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegG110.findAll", query = "SELECT r FROM RegG110 r"),
    @NamedQuery(name = "RegG110.findById", query = "SELECT r FROM RegG110 r WHERE r.id = :id"),
    @NamedQuery(name = "RegG110.findByIdPai", query = "SELECT r FROM RegG110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegG110.findByLinha", query = "SELECT r FROM RegG110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegG110.findByHash", query = "SELECT r FROM RegG110 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegG110.findByReg", query = "SELECT r FROM RegG110 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegG110.findByDtIni", query = "SELECT r FROM RegG110 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "RegG110.findByDtFin", query = "SELECT r FROM RegG110 r WHERE r.dtFin = :dtFin"),
    @NamedQuery(name = "RegG110.findBySaldoInIcms", query = "SELECT r FROM RegG110 r WHERE r.saldoInIcms = :saldoInIcms"),
    @NamedQuery(name = "RegG110.findBySomParc", query = "SELECT r FROM RegG110 r WHERE r.somParc = :somParc"),
    @NamedQuery(name = "RegG110.findByVlTribExp", query = "SELECT r FROM RegG110 r WHERE r.vlTribExp = :vlTribExp"),
    @NamedQuery(name = "RegG110.findByVlTotal", query = "SELECT r FROM RegG110 r WHERE r.vlTotal = :vlTotal"),
    @NamedQuery(name = "RegG110.findByIndPerSai", query = "SELECT r FROM RegG110 r WHERE r.indPerSai = :indPerSai"),
    @NamedQuery(name = "RegG110.findByIcmsAprop", query = "SELECT r FROM RegG110 r WHERE r.icmsAprop = :icmsAprop"),
    @NamedQuery(name = "RegG110.findBySomIcmsOc", query = "SELECT r FROM RegG110 r WHERE r.somIcmsOc = :somIcmsOc")})
public class RegG110 implements Serializable {

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
    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    private Date dtIni;
    @Column(name = "DT_FIN")
    @Temporal(TemporalType.DATE)
    private Date dtFin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALDO_IN_ICMS")
    private BigDecimal saldoInIcms;
    @Column(name = "SOM_PARC")
    private BigDecimal somParc;
    @Column(name = "VL_TRIB_EXP")
    private BigDecimal vlTribExp;
    @Column(name = "VL_TOTAL")
    private BigDecimal vlTotal;
    @Column(name = "IND_PER_SAI")
    private BigDecimal indPerSai;
    @Column(name = "ICMS_APROP")
    private BigDecimal icmsAprop;
    @Column(name = "SOM_ICMS_OC")
    private BigDecimal somIcmsOc;

    public RegG110() {
    }

    public RegG110(Long id) {
        this.id = id;
    }

    public RegG110(Long id, long idPai, long linha, String hash) {
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

    public Date getDtIni() {
        return dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    public Date getDtFin() {
        return dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }

    public BigDecimal getSaldoInIcms() {
        return saldoInIcms;
    }

    public void setSaldoInIcms(BigDecimal saldoInIcms) {
        this.saldoInIcms = saldoInIcms;
    }

    public BigDecimal getSomParc() {
        return somParc;
    }

    public void setSomParc(BigDecimal somParc) {
        this.somParc = somParc;
    }

    public BigDecimal getVlTribExp() {
        return vlTribExp;
    }

    public void setVlTribExp(BigDecimal vlTribExp) {
        this.vlTribExp = vlTribExp;
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    public BigDecimal getIndPerSai() {
        return indPerSai;
    }

    public void setIndPerSai(BigDecimal indPerSai) {
        this.indPerSai = indPerSai;
    }

    public BigDecimal getIcmsAprop() {
        return icmsAprop;
    }

    public void setIcmsAprop(BigDecimal icmsAprop) {
        this.icmsAprop = icmsAprop;
    }

    public BigDecimal getSomIcmsOc() {
        return somIcmsOc;
    }

    public void setSomIcmsOc(BigDecimal somIcmsOc) {
        this.somIcmsOc = somIcmsOc;
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
        if (!(object instanceof RegG110)) {
            return false;
        }
        RegG110 other = (RegG110) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegG110[ id=" + id + " ]";
    }

}
