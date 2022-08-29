
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
@Table(name = "reg_c591")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC591.findAll", query = "SELECT r FROM RegC591 r"),
    @NamedQuery(name = "RegC591.findById", query = "SELECT r FROM RegC591 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC591.findByIdPai", query = "SELECT r FROM RegC591 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC591.findByLinha", query = "SELECT r FROM RegC591 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC591.findByHash", query = "SELECT r FROM RegC591 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC591.findByReg", query = "SELECT r FROM RegC591 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC591.findByVlFcpOp", query = "SELECT r FROM RegC591 r WHERE r.vlFcpOp = :vlFcpOp"),
    @NamedQuery(name = "RegC591.findByVlFcpSt", query = "SELECT r FROM RegC591 r WHERE r.vlFcpSt = :vlFcpSt")})
public class RegC591 implements Serializable {

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
    @Column(name = "VL_FCP_OP")
    private BigDecimal vlFcpOp;
    @Column(name = "VL_FCP_ST")
    private BigDecimal vlFcpSt;

    public RegC591() {
    }

    public RegC591(Long id) {
        this.id = id;
    }

    public RegC591(Long id, long idPai, long linha, String hash) {
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

    public BigDecimal getVlFcpOp() {
        return vlFcpOp;
    }

    public void setVlFcpOp(BigDecimal vlFcpOp) {
        this.vlFcpOp = vlFcpOp;
    }

    public BigDecimal getVlFcpSt() {
        return vlFcpSt;
    }

    public void setVlFcpSt(BigDecimal vlFcpSt) {
        this.vlFcpSt = vlFcpSt;
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
        if (!(object instanceof RegC591)) {
            return false;
        }
        RegC591 other = (RegC591) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC591[ id=" + id + " ]";
    }

}
