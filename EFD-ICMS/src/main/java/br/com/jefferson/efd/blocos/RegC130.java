
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
@Table(name = "reg_c130")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC130.findAll", query = "SELECT r FROM RegC130 r"),
    @NamedQuery(name = "RegC130.findById", query = "SELECT r FROM RegC130 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC130.findByIdPai", query = "SELECT r FROM RegC130 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC130.findByLinha", query = "SELECT r FROM RegC130 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC130.findByHash", query = "SELECT r FROM RegC130 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC130.findByReg", query = "SELECT r FROM RegC130 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC130.findByVlServNt", query = "SELECT r FROM RegC130 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "RegC130.findByVlBcIssqn", query = "SELECT r FROM RegC130 r WHERE r.vlBcIssqn = :vlBcIssqn"),
    @NamedQuery(name = "RegC130.findByVlIssqn", query = "SELECT r FROM RegC130 r WHERE r.vlIssqn = :vlIssqn"),
    @NamedQuery(name = "RegC130.findByVlBcIrrf", query = "SELECT r FROM RegC130 r WHERE r.vlBcIrrf = :vlBcIrrf"),
    @NamedQuery(name = "RegC130.findByVlIrrf", query = "SELECT r FROM RegC130 r WHERE r.vlIrrf = :vlIrrf"),
    @NamedQuery(name = "RegC130.findByVlBcPrev", query = "SELECT r FROM RegC130 r WHERE r.vlBcPrev = :vlBcPrev"),
    @NamedQuery(name = "RegC130.findByVlPrev", query = "SELECT r FROM RegC130 r WHERE r.vlPrev = :vlPrev")})
public class RegC130 implements Serializable {

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
    @Column(name = "VL_SERV_NT")
    private BigDecimal vlServNt;
    @Column(name = "VL_BC_ISSQN")
    private BigDecimal vlBcIssqn;
    @Column(name = "VL_ISSQN")
    private BigDecimal vlIssqn;
    @Column(name = "VL_BC_IRRF")
    private BigDecimal vlBcIrrf;
    @Column(name = "VL_IRRF")
    private BigDecimal vlIrrf;
    @Column(name = "VL_BC_PREV")
    private BigDecimal vlBcPrev;
    @Column(name = "VL_PREV")
    private BigDecimal vlPrev;

    public RegC130() {
    }

    public RegC130(Long id) {
        this.id = id;
    }

    public RegC130(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(BigDecimal vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public BigDecimal getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(BigDecimal vlIssqn) {
        this.vlIssqn = vlIssqn;
    }

    public BigDecimal getVlBcIrrf() {
        return vlBcIrrf;
    }

    public void setVlBcIrrf(BigDecimal vlBcIrrf) {
        this.vlBcIrrf = vlBcIrrf;
    }

    public BigDecimal getVlIrrf() {
        return vlIrrf;
    }

    public void setVlIrrf(BigDecimal vlIrrf) {
        this.vlIrrf = vlIrrf;
    }

    public BigDecimal getVlBcPrev() {
        return vlBcPrev;
    }

    public void setVlBcPrev(BigDecimal vlBcPrev) {
        this.vlBcPrev = vlBcPrev;
    }

    public BigDecimal getVlPrev() {
        return vlPrev;
    }

    public void setVlPrev(BigDecimal vlPrev) {
        this.vlPrev = vlPrev;
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
        if (!(object instanceof RegC130)) {
            return false;
        }
        RegC130 other = (RegC130) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC130[ id=" + id + " ]";
    }

}
