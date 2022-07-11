
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
@Table(name = "reg_c321")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC321.findAll", query = "SELECT r FROM RegC321 r"),
    @NamedQuery(name = "RegC321.findById", query = "SELECT r FROM RegC321 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC321.findByIdPai", query = "SELECT r FROM RegC321 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC321.findByLinha", query = "SELECT r FROM RegC321 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC321.findByHash", query = "SELECT r FROM RegC321 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC321.findByReg", query = "SELECT r FROM RegC321 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC321.findByCodItem", query = "SELECT r FROM RegC321 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC321.findByQtd", query = "SELECT r FROM RegC321 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC321.findByUnid", query = "SELECT r FROM RegC321 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC321.findByVlItem", query = "SELECT r FROM RegC321 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC321.findByVlDesc", query = "SELECT r FROM RegC321 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC321.findByVlBcIcms", query = "SELECT r FROM RegC321 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC321.findByVlIcms", query = "SELECT r FROM RegC321 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC321.findByVlPis", query = "SELECT r FROM RegC321 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC321.findByVlCofins", query = "SELECT r FROM RegC321 r WHERE r.vlCofins = :vlCofins")})
public class RegC321 implements Serializable {

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
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Column(name = "UNID")
    private String unid;
    @Column(name = "VL_ITEM")
    private BigDecimal vlItem;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;

    public RegC321() {
    }

    public RegC321(Long id) {
        this.id = id;
    }

    public RegC321(Long id, long idPai, long linha, long hash) {
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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
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

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
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
        if (!(object instanceof RegC321)) {
            return false;
        }
        RegC321 other = (RegC321) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC321[ id=" + id + " ]";
    }

}
