
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
@Table(name = "reg_d370")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD370.findAll", query = "SELECT r FROM RegD370 r"),
    @NamedQuery(name = "RegD370.findById", query = "SELECT r FROM RegD370 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD370.findByIdPai", query = "SELECT r FROM RegD370 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD370.findByLinha", query = "SELECT r FROM RegD370 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD370.findByHash", query = "SELECT r FROM RegD370 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD370.findByReg", query = "SELECT r FROM RegD370 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD370.findByCodMunOrig", query = "SELECT r FROM RegD370 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD370.findByVlServ", query = "SELECT r FROM RegD370 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD370.findByQtdBilh", query = "SELECT r FROM RegD370 r WHERE r.qtdBilh = :qtdBilh"),
    @NamedQuery(name = "RegD370.findByVlBcIcms", query = "SELECT r FROM RegD370 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD370.findByVlIcms", query = "SELECT r FROM RegD370 r WHERE r.vlIcms = :vlIcms")})
public class RegD370 implements Serializable {

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
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_SERV")
    private BigDecimal vlServ;
    @Column(name = "QTD_BILH")
    private String qtdBilh;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;

    public RegD370() {
    }

    public RegD370(Long id) {
        this.id = id;
    }

    public RegD370(Long id, long idPai, long linha, long hash) {
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

    public String getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }

    public String getQtdBilh() {
        return qtdBilh;
    }

    public void setQtdBilh(String qtdBilh) {
        this.qtdBilh = qtdBilh;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegD370)) {
            return false;
        }
        RegD370 other = (RegD370) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD370[ id=" + id + " ]";
    }

}
