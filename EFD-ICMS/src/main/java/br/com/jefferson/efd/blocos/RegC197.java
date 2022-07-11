
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
@Table(name = "reg_c197")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC197.findAll", query = "SELECT r FROM RegC197 r"),
    @NamedQuery(name = "RegC197.findById", query = "SELECT r FROM RegC197 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC197.findByIdPai", query = "SELECT r FROM RegC197 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC197.findByLinha", query = "SELECT r FROM RegC197 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC197.findByHash", query = "SELECT r FROM RegC197 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC197.findByReg", query = "SELECT r FROM RegC197 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC197.findByCodAj", query = "SELECT r FROM RegC197 r WHERE r.codAj = :codAj"),
    @NamedQuery(name = "RegC197.findByDescrComplAj", query = "SELECT r FROM RegC197 r WHERE r.descrComplAj = :descrComplAj"),
    @NamedQuery(name = "RegC197.findByCodItem", query = "SELECT r FROM RegC197 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC197.findByVlBcIcms", query = "SELECT r FROM RegC197 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC197.findByAliqIcms", query = "SELECT r FROM RegC197 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC197.findByVlIcms", query = "SELECT r FROM RegC197 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC197.findByVlOutros", query = "SELECT r FROM RegC197 r WHERE r.vlOutros = :vlOutros")})
public class RegC197 implements Serializable {

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
    @Column(name = "COD_AJ")
    private String codAj;
    @Column(name = "DESCR_COMPL_AJ")
    private String descrComplAj;
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "ALIQ_ICMS")
    private BigDecimal aliqIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_OUTROS")
    private BigDecimal vlOutros;

    public RegC197() {
    }

    public RegC197(Long id) {
        this.id = id;
    }

    public RegC197(Long id, long idPai, long linha, long hash) {
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

    public String getCodAj() {
        return codAj;
    }

    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }

    public String getDescrComplAj() {
        return descrComplAj;
    }

    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlOutros() {
        return vlOutros;
    }

    public void setVlOutros(BigDecimal vlOutros) {
        this.vlOutros = vlOutros;
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
        if (!(object instanceof RegC197)) {
            return false;
        }
        RegC197 other = (RegC197) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC197[ id=" + id + " ]";
    }

}
