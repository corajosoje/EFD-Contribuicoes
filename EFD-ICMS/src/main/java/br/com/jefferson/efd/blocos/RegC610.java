
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
@Table(name = "reg_c610")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC610.findAll", query = "SELECT r FROM RegC610 r"),
    @NamedQuery(name = "RegC610.findById", query = "SELECT r FROM RegC610 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC610.findByIdPai", query = "SELECT r FROM RegC610 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC610.findByLinha", query = "SELECT r FROM RegC610 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC610.findByHash", query = "SELECT r FROM RegC610 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC610.findByReg", query = "SELECT r FROM RegC610 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC610.findByCodClass", query = "SELECT r FROM RegC610 r WHERE r.codClass = :codClass"),
    @NamedQuery(name = "RegC610.findByCodItem", query = "SELECT r FROM RegC610 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC610.findByQtd", query = "SELECT r FROM RegC610 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC610.findByUnid", query = "SELECT r FROM RegC610 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC610.findByVlItem", query = "SELECT r FROM RegC610 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC610.findByVlDesc", query = "SELECT r FROM RegC610 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC610.findByCstIcms", query = "SELECT r FROM RegC610 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC610.findByCfop", query = "SELECT r FROM RegC610 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC610.findByAliqIcms", query = "SELECT r FROM RegC610 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC610.findByVlBcIcms", query = "SELECT r FROM RegC610 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC610.findByVlIcms", query = "SELECT r FROM RegC610 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC610.findByVlBcIcmsSt", query = "SELECT r FROM RegC610 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC610.findByVlIcmsSt", query = "SELECT r FROM RegC610 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC610.findByVlPis", query = "SELECT r FROM RegC610 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC610.findByVlCofins", query = "SELECT r FROM RegC610 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC610.findByCodCta", query = "SELECT r FROM RegC610 r WHERE r.codCta = :codCta")})
public class RegC610 implements Serializable {

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
    @Column(name = "COD_CLASS")
    private String codClass;
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
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Column(name = "CFOP")
    private String cfop;
    @Column(name = "ALIQ_ICMS")
    private BigDecimal aliqIcms;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_BC_ICMS_ST")
    private BigDecimal vlBcIcmsSt;
    @Column(name = "VL_ICMS_ST")
    private BigDecimal vlIcmsSt;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "COD_CTA")
    private String codCta;

    public RegC610() {
    }

    public RegC610(Long id) {
        this.id = id;
    }

    public RegC610(Long id, long idPai, long linha, String hash) {
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

    public String getCodClass() {
        return codClass;
    }

    public void setCodClass(String codClass) {
        this.codClass = codClass;
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

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
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

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
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
        if (!(object instanceof RegC610)) {
            return false;
        }
        RegC610 other = (RegC610) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC610[ id=" + id + " ]";
    }

}
