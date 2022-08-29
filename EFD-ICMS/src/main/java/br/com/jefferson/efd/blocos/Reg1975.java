
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
@Table(name = "reg_1975")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1975.findAll", query = "SELECT r FROM Reg1975 r"),
    @NamedQuery(name = "Reg1975.findById", query = "SELECT r FROM Reg1975 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1975.findByIdPai", query = "SELECT r FROM Reg1975 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1975.findByLinha", query = "SELECT r FROM Reg1975 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1975.findByHash", query = "SELECT r FROM Reg1975 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1975.findByReg", query = "SELECT r FROM Reg1975 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1975.findByAliqImpBase", query = "SELECT r FROM Reg1975 r WHERE r.aliqImpBase = :aliqImpBase"),
    @NamedQuery(name = "Reg1975.findByG310", query = "SELECT r FROM Reg1975 r WHERE r.g310 = :g310"),
    @NamedQuery(name = "Reg1975.findByG311", query = "SELECT r FROM Reg1975 r WHERE r.g311 = :g311"),
    @NamedQuery(name = "Reg1975.findByG312", query = "SELECT r FROM Reg1975 r WHERE r.g312 = :g312")})
public class Reg1975 implements Serializable {

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
    @Column(name = "ALIQ_IMP_BASE")
    private BigDecimal aliqImpBase;
    @Column(name = "G3_10")
    private BigDecimal g310;
    @Column(name = "G3_11")
    private BigDecimal g311;
    @Column(name = "G3_12")
    private BigDecimal g312;

    public Reg1975() {
    }

    public Reg1975(Long id) {
        this.id = id;
    }

    public Reg1975(Long id, long idPai, long linha, String hash) {
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

    public BigDecimal getAliqImpBase() {
        return aliqImpBase;
    }

    public void setAliqImpBase(BigDecimal aliqImpBase) {
        this.aliqImpBase = aliqImpBase;
    }

    public BigDecimal getG310() {
        return g310;
    }

    public void setG310(BigDecimal g310) {
        this.g310 = g310;
    }

    public BigDecimal getG311() {
        return g311;
    }

    public void setG311(BigDecimal g311) {
        this.g311 = g311;
    }

    public BigDecimal getG312() {
        return g312;
    }

    public void setG312(BigDecimal g312) {
        this.g312 = g312;
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
        if (!(object instanceof Reg1975)) {
            return false;
        }
        Reg1975 other = (Reg1975) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1975[ id=" + id + " ]";
    }

}
