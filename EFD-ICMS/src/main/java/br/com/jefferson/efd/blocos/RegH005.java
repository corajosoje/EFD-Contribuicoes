
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
@Table(name = "reg_h005")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegH005.findAll", query = "SELECT r FROM RegH005 r"),
    @NamedQuery(name = "RegH005.findById", query = "SELECT r FROM RegH005 r WHERE r.id = :id"),
    @NamedQuery(name = "RegH005.findByIdPai", query = "SELECT r FROM RegH005 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegH005.findByLinha", query = "SELECT r FROM RegH005 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegH005.findByHash", query = "SELECT r FROM RegH005 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegH005.findByReg", query = "SELECT r FROM RegH005 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegH005.findByDtInv", query = "SELECT r FROM RegH005 r WHERE r.dtInv = :dtInv"),
    @NamedQuery(name = "RegH005.findByVlInv", query = "SELECT r FROM RegH005 r WHERE r.vlInv = :vlInv"),
    @NamedQuery(name = "RegH005.findByMotInv", query = "SELECT r FROM RegH005 r WHERE r.motInv = :motInv")})
public class RegH005 implements Serializable {

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
    @Column(name = "DT_INV")
    @Temporal(TemporalType.DATE)
    private Date dtInv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_INV")
    private BigDecimal vlInv;
    @Column(name = "MOT_INV")
    private String motInv;

    public RegH005() {
    }

    public RegH005(Long id) {
        this.id = id;
    }

    public RegH005(Long id, long idPai, long linha, long hash) {
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

    public Date getDtInv() {
        return dtInv;
    }

    public void setDtInv(Date dtInv) {
        this.dtInv = dtInv;
    }

    public BigDecimal getVlInv() {
        return vlInv;
    }

    public void setVlInv(BigDecimal vlInv) {
        this.vlInv = vlInv;
    }

    public String getMotInv() {
        return motInv;
    }

    public void setMotInv(String motInv) {
        this.motInv = motInv;
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
        if (!(object instanceof RegH005)) {
            return false;
        }
        RegH005 other = (RegH005) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegH005[ id=" + id + " ]";
    }

}
