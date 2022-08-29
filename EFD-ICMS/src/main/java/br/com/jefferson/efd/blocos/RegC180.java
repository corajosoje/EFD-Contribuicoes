
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
@Table(name = "reg_c180")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC180.findAll", query = "SELECT r FROM RegC180 r"),
    @NamedQuery(name = "RegC180.findById", query = "SELECT r FROM RegC180 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC180.findByIdPai", query = "SELECT r FROM RegC180 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC180.findByLinha", query = "SELECT r FROM RegC180 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC180.findByHash", query = "SELECT r FROM RegC180 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC180.findByReg", query = "SELECT r FROM RegC180 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC180.findByCodRespRet", query = "SELECT r FROM RegC180 r WHERE r.codRespRet = :codRespRet"),
    @NamedQuery(name = "RegC180.findByQuantConv", query = "SELECT r FROM RegC180 r WHERE r.quantConv = :quantConv"),
    @NamedQuery(name = "RegC180.findByUnid", query = "SELECT r FROM RegC180 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC180.findByVlUnitConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitConv = :vlUnitConv"),
    @NamedQuery(name = "RegC180.findByVlUnitIcmsOpConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitIcmsOpConv = :vlUnitIcmsOpConv"),
    @NamedQuery(name = "RegC180.findByVlUnitBcIcmsStConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitBcIcmsStConv = :vlUnitBcIcmsStConv"),
    @NamedQuery(name = "RegC180.findByVlUnitIcmsStConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitIcmsStConv = :vlUnitIcmsStConv"),
    @NamedQuery(name = "RegC180.findByVlUnitFcpStConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitFcpStConv = :vlUnitFcpStConv"),
    @NamedQuery(name = "RegC180.findByCodDa", query = "SELECT r FROM RegC180 r WHERE r.codDa = :codDa"),
    @NamedQuery(name = "RegC180.findByNumDa", query = "SELECT r FROM RegC180 r WHERE r.numDa = :numDa")})
public class RegC180 implements Serializable {

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
    @Column(name = "COD_RESP_RET")
    private String codRespRet;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANT_CONV")
    private BigDecimal quantConv;
    @Column(name = "UNID")
    private String unid;
    @Column(name = "VL_UNIT_CONV")
    private BigDecimal vlUnitConv;
    @Column(name = "VL_UNIT_ICMS_OP_CONV")
    private BigDecimal vlUnitIcmsOpConv;
    @Column(name = "VL_UNIT_BC_ICMS_ST_CONV")
    private BigDecimal vlUnitBcIcmsStConv;
    @Column(name = "VL_UNIT_ICMS_ST_CONV")
    private BigDecimal vlUnitIcmsStConv;
    @Column(name = "VL_UNIT_FCP_ST_CONV")
    private BigDecimal vlUnitFcpStConv;
    @Column(name = "COD_DA")
    private String codDa;
    @Column(name = "NUM_DA")
    private String numDa;

    public RegC180() {
    }

    public RegC180(Long id) {
        this.id = id;
    }

    public RegC180(Long id, long idPai, long linha, String hash) {
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

    public String getCodRespRet() {
        return codRespRet;
    }

    public void setCodRespRet(String codRespRet) {
        this.codRespRet = codRespRet;
    }

    public BigDecimal getQuantConv() {
        return quantConv;
    }

    public void setQuantConv(BigDecimal quantConv) {
        this.quantConv = quantConv;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlUnitConv() {
        return vlUnitConv;
    }

    public void setVlUnitConv(BigDecimal vlUnitConv) {
        this.vlUnitConv = vlUnitConv;
    }

    public BigDecimal getVlUnitIcmsOpConv() {
        return vlUnitIcmsOpConv;
    }

    public void setVlUnitIcmsOpConv(BigDecimal vlUnitIcmsOpConv) {
        this.vlUnitIcmsOpConv = vlUnitIcmsOpConv;
    }

    public BigDecimal getVlUnitBcIcmsStConv() {
        return vlUnitBcIcmsStConv;
    }

    public void setVlUnitBcIcmsStConv(BigDecimal vlUnitBcIcmsStConv) {
        this.vlUnitBcIcmsStConv = vlUnitBcIcmsStConv;
    }

    public BigDecimal getVlUnitIcmsStConv() {
        return vlUnitIcmsStConv;
    }

    public void setVlUnitIcmsStConv(BigDecimal vlUnitIcmsStConv) {
        this.vlUnitIcmsStConv = vlUnitIcmsStConv;
    }

    public BigDecimal getVlUnitFcpStConv() {
        return vlUnitFcpStConv;
    }

    public void setVlUnitFcpStConv(BigDecimal vlUnitFcpStConv) {
        this.vlUnitFcpStConv = vlUnitFcpStConv;
    }

    public String getCodDa() {
        return codDa;
    }

    public void setCodDa(String codDa) {
        this.codDa = codDa;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
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
        if (!(object instanceof RegC180)) {
            return false;
        }
        RegC180 other = (RegC180) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC180[ id=" + id + " ]";
    }

}
