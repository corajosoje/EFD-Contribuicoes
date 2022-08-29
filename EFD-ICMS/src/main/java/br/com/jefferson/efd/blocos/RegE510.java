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
@Table(name = "reg_e510")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE510.findAll", query = "SELECT r FROM RegE510 r"),
    @NamedQuery(name = "RegE510.findById", query = "SELECT r FROM RegE510 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE510.findByIdPai", query = "SELECT r FROM RegE510 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE510.findByLinha", query = "SELECT r FROM RegE510 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE510.findByHash", query = "SELECT r FROM RegE510 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE510.findByReg", query = "SELECT r FROM RegE510 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE510.findByCfop", query = "SELECT r FROM RegE510 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegE510.findByCstIpi", query = "SELECT r FROM RegE510 r WHERE r.cstIpi = :cstIpi"),
    @NamedQuery(name = "RegE510.findByVlContIpi", query = "SELECT r FROM RegE510 r WHERE r.vlContIpi = :vlContIpi"),
    @NamedQuery(name = "RegE510.findByVlBcIpi", query = "SELECT r FROM RegE510 r WHERE r.vlBcIpi = :vlBcIpi"),
    @NamedQuery(name = "RegE510.findByVlIpi", query = "SELECT r FROM RegE510 r WHERE r.vlIpi = :vlIpi")})
public class RegE510 implements Serializable {

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
    @Column(name = "CFOP")
    private String cfop;
    @Column(name = "CST_IPI")
    private String cstIpi;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_CONT_IPI")
    private BigDecimal vlContIpi;
    @Column(name = "VL_BC_IPI")
    private BigDecimal vlBcIpi;
    @Column(name = "VL_IPI")
    private BigDecimal vlIpi;

    public RegE510() {
    }

    public RegE510(Long id) {
        this.id = id;
    }

    public RegE510(Long id, long idPai, long linha, String hash) {
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

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }

    public BigDecimal getVlContIpi() {
        return vlContIpi;
    }

    public void setVlContIpi(BigDecimal vlContIpi) {
        this.vlContIpi = vlContIpi;
    }

    public BigDecimal getVlBcIpi() {
        return vlBcIpi;
    }

    public void setVlBcIpi(BigDecimal vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
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
        if (!(object instanceof RegE510)) {
            return false;
        }
        RegE510 other = (RegE510) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE510[ id=" + id + " ]";
    }

}
