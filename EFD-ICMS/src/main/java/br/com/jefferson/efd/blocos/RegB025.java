
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
@Table(name = "reg_b025")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB025.findAll", query = "SELECT r FROM RegB025 r"),
    @NamedQuery(name = "RegB025.findById", query = "SELECT r FROM RegB025 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB025.findByIdPai", query = "SELECT r FROM RegB025 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB025.findByLinha", query = "SELECT r FROM RegB025 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB025.findByHash", query = "SELECT r FROM RegB025 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB025.findByReg", query = "SELECT r FROM RegB025 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB025.findByVlContP", query = "SELECT r FROM RegB025 r WHERE r.vlContP = :vlContP"),
    @NamedQuery(name = "RegB025.findByVlBcIssP", query = "SELECT r FROM RegB025 r WHERE r.vlBcIssP = :vlBcIssP"),
    @NamedQuery(name = "RegB025.findByAliqIss", query = "SELECT r FROM RegB025 r WHERE r.aliqIss = :aliqIss"),
    @NamedQuery(name = "RegB025.findByVlIssP", query = "SELECT r FROM RegB025 r WHERE r.vlIssP = :vlIssP"),
    @NamedQuery(name = "RegB025.findByVlIsntIssP", query = "SELECT r FROM RegB025 r WHERE r.vlIsntIssP = :vlIsntIssP"),
    @NamedQuery(name = "RegB025.findByCodServ", query = "SELECT r FROM RegB025 r WHERE r.codServ = :codServ")})
public class RegB025 implements Serializable {

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
    @Column(name = "VL_CONT_P")
    private BigDecimal vlContP;
    @Column(name = "VL_BC_ISS_P")
    private BigDecimal vlBcIssP;
    @Column(name = "ALIQ_ISS")
    private BigDecimal aliqIss;
    @Column(name = "VL_ISS_P")
    private BigDecimal vlIssP;
    @Column(name = "VL_ISNT_ISS_P")
    private BigDecimal vlIsntIssP;
    @Column(name = "COD_SERV")
    private String codServ;

    public RegB025() {
    }

    public RegB025(Long id) {
        this.id = id;
    }

    public RegB025(Long id, long idPai, long linha, String hash) {
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

    public BigDecimal getVlContP() {
        return vlContP;
    }

    public void setVlContP(BigDecimal vlContP) {
        this.vlContP = vlContP;
    }

    public BigDecimal getVlBcIssP() {
        return vlBcIssP;
    }

    public void setVlBcIssP(BigDecimal vlBcIssP) {
        this.vlBcIssP = vlBcIssP;
    }

    public BigDecimal getAliqIss() {
        return aliqIss;
    }

    public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
    }

    public BigDecimal getVlIssP() {
        return vlIssP;
    }

    public void setVlIssP(BigDecimal vlIssP) {
        this.vlIssP = vlIssP;
    }

    public BigDecimal getVlIsntIssP() {
        return vlIsntIssP;
    }

    public void setVlIsntIssP(BigDecimal vlIsntIssP) {
        this.vlIsntIssP = vlIsntIssP;
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
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
        if (!(object instanceof RegB025)) {
            return false;
        }
        RegB025 other = (RegB025) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB025[ id=" + id + " ]";
    }

}
