
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_e520")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE520.findAll", query = "SELECT r FROM RegE520 r"),
    @NamedQuery(name = "RegE520.findById", query = "SELECT r FROM RegE520 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE520.findByIdPai", query = "SELECT r FROM RegE520 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE520.findByLinha", query = "SELECT r FROM RegE520 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE520.findByHash", query = "SELECT r FROM RegE520 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE520.findByReg", query = "SELECT r FROM RegE520 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE520.findByVlSdAntIpi", query = "SELECT r FROM RegE520 r WHERE r.vlSdAntIpi = :vlSdAntIpi"),
    @NamedQuery(name = "RegE520.findByVlDebIpi", query = "SELECT r FROM RegE520 r WHERE r.vlDebIpi = :vlDebIpi"),
    @NamedQuery(name = "RegE520.findByVlCredIpi", query = "SELECT r FROM RegE520 r WHERE r.vlCredIpi = :vlCredIpi"),
    @NamedQuery(name = "RegE520.findByVlOdIpi", query = "SELECT r FROM RegE520 r WHERE r.vlOdIpi = :vlOdIpi"),
    @NamedQuery(name = "RegE520.findByVlOcIpi", query = "SELECT r FROM RegE520 r WHERE r.vlOcIpi = :vlOcIpi"),
    @NamedQuery(name = "RegE520.findByVlScIpi", query = "SELECT r FROM RegE520 r WHERE r.vlScIpi = :vlScIpi"),
    @NamedQuery(name = "RegE520.findByVlSdIpi", query = "SELECT r FROM RegE520 r WHERE r.vlSdIpi = :vlSdIpi")})
public class RegE520 implements Serializable {

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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_SD_ANT_IPI")
    private BigDecimal vlSdAntIpi;
    @Column(name = "VL_DEB_IPI")
    private BigDecimal vlDebIpi;
    @Column(name = "VL_CRED_IPI")
    private BigDecimal vlCredIpi;
    @Column(name = "VL_OD_IPI")
    private BigDecimal vlOdIpi;
    @Column(name = "VL_OC_IPI")
    private BigDecimal vlOcIpi;
    @Column(name = "VL_SC_IPI")
    private BigDecimal vlScIpi;
    @Column(name = "VL_SD_IPI")
    private BigDecimal vlSdIpi;

    public RegE520() {
    }

    public RegE520(Long id) {
        this.id = id;
    }

    public RegE520(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getVlSdAntIpi() {
        return vlSdAntIpi;
    }

    public void setVlSdAntIpi(BigDecimal vlSdAntIpi) {
        this.vlSdAntIpi = vlSdAntIpi;
    }

    public BigDecimal getVlDebIpi() {
        return vlDebIpi;
    }

    public void setVlDebIpi(BigDecimal vlDebIpi) {
        this.vlDebIpi = vlDebIpi;
    }

    public BigDecimal getVlCredIpi() {
        return vlCredIpi;
    }

    public void setVlCredIpi(BigDecimal vlCredIpi) {
        this.vlCredIpi = vlCredIpi;
    }

    public BigDecimal getVlOdIpi() {
        return vlOdIpi;
    }

    public void setVlOdIpi(BigDecimal vlOdIpi) {
        this.vlOdIpi = vlOdIpi;
    }

    public BigDecimal getVlOcIpi() {
        return vlOcIpi;
    }

    public void setVlOcIpi(BigDecimal vlOcIpi) {
        this.vlOcIpi = vlOcIpi;
    }

    public BigDecimal getVlScIpi() {
        return vlScIpi;
    }

    public void setVlScIpi(BigDecimal vlScIpi) {
        this.vlScIpi = vlScIpi;
    }

    public BigDecimal getVlSdIpi() {
        return vlSdIpi;
    }

    public void setVlSdIpi(BigDecimal vlSdIpi) {
        this.vlSdIpi = vlSdIpi;
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
        if (!(object instanceof RegE520)) {
            return false;
        }
        RegE520 other = (RegE520) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE520[ id=" + id + " ]";
    }

}
