
package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_d101")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD101.findAll", query = "SELECT r FROM RegD101 r"),
    @NamedQuery(name = "RegD101.findById", query = "SELECT r FROM RegD101 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD101.findByIdPai", query = "SELECT r FROM RegD101 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD101.findByLinha", query = "SELECT r FROM RegD101 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD101.findByHash", query = "SELECT r FROM RegD101 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD101.findByReg", query = "SELECT r FROM RegD101 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD101.findByVlFcpUfDest", query = "SELECT r FROM RegD101 r WHERE r.vlFcpUfDest = :vlFcpUfDest"),
    @NamedQuery(name = "RegD101.findByVlIcmsUfDest", query = "SELECT r FROM RegD101 r WHERE r.vlIcmsUfDest = :vlIcmsUfDest"),
    @NamedQuery(name = "RegD101.findByVlIcmsUfRem", query = "SELECT r FROM RegD101 r WHERE r.vlIcmsUfRem = :vlIcmsUfRem")})
public class RegD101 implements Serializable {

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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_FCP_UF_DEST")
    private BigDecimal vlFcpUfDest;
    @Column(name = "VL_ICMS_UF_DEST")
    private BigDecimal vlIcmsUfDest;
    @Column(name = "VL_ICMS_UF_REM")
    private BigDecimal vlIcmsUfRem;

    public RegD101() {
    }

    public RegD101(Long id) {
        this.id = id;
    }

    public RegD101(Long id, long idPai, long linha, String hash) {
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

    public BigDecimal getVlFcpUfDest() {
        return vlFcpUfDest;
    }

    public void setVlFcpUfDest(BigDecimal vlFcpUfDest) {
        this.vlFcpUfDest = vlFcpUfDest;
    }

    public BigDecimal getVlIcmsUfDest() {
        return vlIcmsUfDest;
    }

    public void setVlIcmsUfDest(BigDecimal vlIcmsUfDest) {
        this.vlIcmsUfDest = vlIcmsUfDest;
    }

    public BigDecimal getVlIcmsUfRem() {
        return vlIcmsUfRem;
    }

    public void setVlIcmsUfRem(BigDecimal vlIcmsUfRem) {
        this.vlIcmsUfRem = vlIcmsUfRem;
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
        if (!(object instanceof RegD101)) {
            return false;
        }
        RegD101 other = (RegD101) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD101[ id=" + id + " ]";
    }

}
