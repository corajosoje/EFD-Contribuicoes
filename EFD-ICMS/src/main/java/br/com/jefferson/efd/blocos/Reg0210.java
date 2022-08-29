
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
@Table(name = "reg_0210")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0210.findAll", query = "SELECT r FROM Reg0210 r"),
    @NamedQuery(name = "Reg0210.findById", query = "SELECT r FROM Reg0210 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0210.findByIdPai", query = "SELECT r FROM Reg0210 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0210.findByLinha", query = "SELECT r FROM Reg0210 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0210.findByHash", query = "SELECT r FROM Reg0210 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0210.findByReg", query = "SELECT r FROM Reg0210 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0210.findByCodItemComp", query = "SELECT r FROM Reg0210 r WHERE r.codItemComp = :codItemComp"),
    @NamedQuery(name = "Reg0210.findByQtdComp", query = "SELECT r FROM Reg0210 r WHERE r.qtdComp = :qtdComp"),
    @NamedQuery(name = "Reg0210.findByPerda", query = "SELECT r FROM Reg0210 r WHERE r.perda = :perda")})
public class Reg0210 implements Serializable {

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
    @Column(name = "COD_ITEM_COMP")
    private String codItemComp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_COMP")
    private BigDecimal qtdComp;
    @Column(name = "PERDA")
    private BigDecimal perda;

    public Reg0210() {
    }

    public Reg0210(Long id) {
        this.id = id;
    }

    public Reg0210(Long id, long idPai, long linha, String hash) {
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

    public String getCodItemComp() {
        return codItemComp;
    }

    public void setCodItemComp(String codItemComp) {
        this.codItemComp = codItemComp;
    }

    public BigDecimal getQtdComp() {
        return qtdComp;
    }

    public void setQtdComp(BigDecimal qtdComp) {
        this.qtdComp = qtdComp;
    }

    public BigDecimal getPerda() {
        return perda;
    }

    public void setPerda(BigDecimal perda) {
        this.perda = perda;
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
        if (!(object instanceof Reg0210)) {
            return false;
        }
        Reg0210 other = (Reg0210) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0210[ id=" + id + " ]";
    }

}
