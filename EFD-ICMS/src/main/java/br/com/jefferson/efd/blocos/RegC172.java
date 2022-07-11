
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
@Table(name = "reg_c172")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC172.findAll", query = "SELECT r FROM RegC172 r"),
    @NamedQuery(name = "RegC172.findById", query = "SELECT r FROM RegC172 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC172.findByIdPai", query = "SELECT r FROM RegC172 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC172.findByLinha", query = "SELECT r FROM RegC172 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC172.findByHash", query = "SELECT r FROM RegC172 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC172.findByReg", query = "SELECT r FROM RegC172 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC172.findByVlBcIssqn", query = "SELECT r FROM RegC172 r WHERE r.vlBcIssqn = :vlBcIssqn"),
    @NamedQuery(name = "RegC172.findByAliqIssqn", query = "SELECT r FROM RegC172 r WHERE r.aliqIssqn = :aliqIssqn"),
    @NamedQuery(name = "RegC172.findByVlIssqn", query = "SELECT r FROM RegC172 r WHERE r.vlIssqn = :vlIssqn")})
public class RegC172 implements Serializable {

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
    @Column(name = "VL_BC_ISSQN")
    private BigDecimal vlBcIssqn;
    @Column(name = "ALIQ_ISSQN")
    private BigDecimal aliqIssqn;
    @Column(name = "VL_ISSQN")
    private BigDecimal vlIssqn;

    public RegC172() {
    }

    public RegC172(Long id) {
        this.id = id;
    }

    public RegC172(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(BigDecimal vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public BigDecimal getAliqIssqn() {
        return aliqIssqn;
    }

    public void setAliqIssqn(BigDecimal aliqIssqn) {
        this.aliqIssqn = aliqIssqn;
    }

    public BigDecimal getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(BigDecimal vlIssqn) {
        this.vlIssqn = vlIssqn;
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
        if (!(object instanceof RegC172)) {
            return false;
        }
        RegC172 other = (RegC172) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC172[ id=" + id + " ]";
    }

}
