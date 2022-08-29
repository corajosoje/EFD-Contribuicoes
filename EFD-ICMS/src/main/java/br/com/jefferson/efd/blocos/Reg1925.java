
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
@Table(name = "reg_1925")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1925.findAll", query = "SELECT r FROM Reg1925 r"),
    @NamedQuery(name = "Reg1925.findById", query = "SELECT r FROM Reg1925 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1925.findByIdPai", query = "SELECT r FROM Reg1925 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1925.findByLinha", query = "SELECT r FROM Reg1925 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1925.findByHash", query = "SELECT r FROM Reg1925 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1925.findByReg", query = "SELECT r FROM Reg1925 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1925.findByCodInfAdic", query = "SELECT r FROM Reg1925 r WHERE r.codInfAdic = :codInfAdic"),
    @NamedQuery(name = "Reg1925.findByVlInfAdic", query = "SELECT r FROM Reg1925 r WHERE r.vlInfAdic = :vlInfAdic"),
    @NamedQuery(name = "Reg1925.findByDescComplAj", query = "SELECT r FROM Reg1925 r WHERE r.descComplAj = :descComplAj")})
public class Reg1925 implements Serializable {

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
    @Column(name = "COD_INF_ADIC")
    private String codInfAdic;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_INF_ADIC")
    private BigDecimal vlInfAdic;
    @Column(name = "DESC_COMPL_AJ")
    private String descComplAj;

    public Reg1925() {
    }

    public Reg1925(Long id) {
        this.id = id;
    }

    public Reg1925(Long id, long idPai, long linha, String hash) {
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

    public String getCodInfAdic() {
        return codInfAdic;
    }

    public void setCodInfAdic(String codInfAdic) {
        this.codInfAdic = codInfAdic;
    }

    public BigDecimal getVlInfAdic() {
        return vlInfAdic;
    }

    public void setVlInfAdic(BigDecimal vlInfAdic) {
        this.vlInfAdic = vlInfAdic;
    }

    public String getDescComplAj() {
        return descComplAj;
    }

    public void setDescComplAj(String descComplAj) {
        this.descComplAj = descComplAj;
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
        if (!(object instanceof Reg1925)) {
            return false;
        }
        Reg1925 other = (Reg1925) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1925[ id=" + id + " ]";
    }

}
