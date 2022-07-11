
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
@Table(name = "reg_d390")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD390.findAll", query = "SELECT r FROM RegD390 r"),
    @NamedQuery(name = "RegD390.findById", query = "SELECT r FROM RegD390 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD390.findByIdPai", query = "SELECT r FROM RegD390 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD390.findByLinha", query = "SELECT r FROM RegD390 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD390.findByHash", query = "SELECT r FROM RegD390 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD390.findByReg", query = "SELECT r FROM RegD390 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD390.findByCstIcms", query = "SELECT r FROM RegD390 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegD390.findByCfop", query = "SELECT r FROM RegD390 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegD390.findByAliqIcms", query = "SELECT r FROM RegD390 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegD390.findByVlOpr", query = "SELECT r FROM RegD390 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegD390.findByVlBcIssqn", query = "SELECT r FROM RegD390 r WHERE r.vlBcIssqn = :vlBcIssqn"),
    @NamedQuery(name = "RegD390.findByAliqIssqn", query = "SELECT r FROM RegD390 r WHERE r.aliqIssqn = :aliqIssqn"),
    @NamedQuery(name = "RegD390.findByVlIssqn", query = "SELECT r FROM RegD390 r WHERE r.vlIssqn = :vlIssqn"),
    @NamedQuery(name = "RegD390.findByVlBcIcms", query = "SELECT r FROM RegD390 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD390.findByVlIcms", query = "SELECT r FROM RegD390 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD390.findByCodObs", query = "SELECT r FROM RegD390 r WHERE r.codObs = :codObs")})
public class RegD390 implements Serializable {

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
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Column(name = "CFOP")
    private String cfop;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALIQ_ICMS")
    private BigDecimal aliqIcms;
    @Column(name = "VL_OPR")
    private BigDecimal vlOpr;
    @Column(name = "VL_BC_ISSQN")
    private BigDecimal vlBcIssqn;
    @Column(name = "ALIQ_ISSQN")
    private BigDecimal aliqIssqn;
    @Column(name = "VL_ISSQN")
    private BigDecimal vlIssqn;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "COD_OBS")
    private String codObs;

    public RegD390() {
    }

    public RegD390(Long id) {
        this.id = id;
    }

    public RegD390(Long id, long idPai, long linha, long hash) {
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

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
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

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
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
        if (!(object instanceof RegD390)) {
            return false;
        }
        RegD390 other = (RegD390) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD390[ id=" + id + " ]";
    }

}
