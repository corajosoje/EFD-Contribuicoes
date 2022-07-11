
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
@Table(name = "reg_c190")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC190.findAll", query = "SELECT r FROM RegC190 r"),
    @NamedQuery(name = "RegC190.findById", query = "SELECT r FROM RegC190 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC190.findByIdPai", query = "SELECT r FROM RegC190 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC190.findByLinha", query = "SELECT r FROM RegC190 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC190.findByHash", query = "SELECT r FROM RegC190 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC190.findByReg", query = "SELECT r FROM RegC190 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC190.findByCstIcms", query = "SELECT r FROM RegC190 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC190.findByCfop", query = "SELECT r FROM RegC190 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC190.findByAliqIcms", query = "SELECT r FROM RegC190 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC190.findByVlOpr", query = "SELECT r FROM RegC190 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegC190.findByVlBcIcms", query = "SELECT r FROM RegC190 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC190.findByVlIcms", query = "SELECT r FROM RegC190 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC190.findByVlBcIcmsSt", query = "SELECT r FROM RegC190 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC190.findByVlIcmsSt", query = "SELECT r FROM RegC190 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC190.findByVlRedBc", query = "SELECT r FROM RegC190 r WHERE r.vlRedBc = :vlRedBc"),
    @NamedQuery(name = "RegC190.findByVlIpi", query = "SELECT r FROM RegC190 r WHERE r.vlIpi = :vlIpi"),
    @NamedQuery(name = "RegC190.findByCodObs", query = "SELECT r FROM RegC190 r WHERE r.codObs = :codObs")})
public class RegC190 implements Serializable {

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
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_BC_ICMS_ST")
    private BigDecimal vlBcIcmsSt;
    @Column(name = "VL_ICMS_ST")
    private BigDecimal vlIcmsSt;
    @Column(name = "VL_RED_BC")
    private BigDecimal vlRedBc;
    @Column(name = "VL_IPI")
    private BigDecimal vlIpi;
    @Column(name = "COD_OBS")
    private String codObs;

    public RegC190() {
    }

    public RegC190(Long id) {
        this.id = id;
    }

    public RegC190(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(BigDecimal vlRedBc) {
        this.vlRedBc = vlRedBc;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
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
        if (!(object instanceof RegC190)) {
            return false;
        }
        RegC190 other = (RegC190) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC190[ id=" + id + " ]";
    }

}
