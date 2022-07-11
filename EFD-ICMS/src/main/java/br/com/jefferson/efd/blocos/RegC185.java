
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
@Table(name = "reg_c185")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC185.findAll", query = "SELECT r FROM RegC185 r"),
    @NamedQuery(name = "RegC185.findById", query = "SELECT r FROM RegC185 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC185.findByIdPai", query = "SELECT r FROM RegC185 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC185.findByLinha", query = "SELECT r FROM RegC185 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC185.findByHash", query = "SELECT r FROM RegC185 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC185.findByReg", query = "SELECT r FROM RegC185 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC185.findByNumItem", query = "SELECT r FROM RegC185 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegC185.findByCodItem", query = "SELECT r FROM RegC185 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC185.findByCstIcms", query = "SELECT r FROM RegC185 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC185.findByCfop", query = "SELECT r FROM RegC185 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC185.findByCodMotRestCompl", query = "SELECT r FROM RegC185 r WHERE r.codMotRestCompl = :codMotRestCompl"),
    @NamedQuery(name = "RegC185.findByQuantConv", query = "SELECT r FROM RegC185 r WHERE r.quantConv = :quantConv"),
    @NamedQuery(name = "RegC185.findByUnid", query = "SELECT r FROM RegC185 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC185.findByVlUnitConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitConv = :vlUnitConv"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsNaOperacaoConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsNaOperacaoConv = :vlUnitIcmsNaOperacaoConv"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsOpConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsOpConv = :vlUnitIcmsOpConv"),
    @NamedQuery(name = "RegC185.findByVlUnitBcIcmsStEstoqueConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitBcIcmsStEstoqueConv = :vlUnitBcIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsStEstoqueConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsStEstoqueConv = :vlUnitIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC185.findByVlUnitFcpIcmsStEstoqueConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitFcpIcmsStEstoqueConv = :vlUnitFcpIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsStConvRest", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsStConvRest = :vlUnitIcmsStConvRest"),
    @NamedQuery(name = "RegC185.findByVlUnitFcpStConvRest", query = "SELECT r FROM RegC185 r WHERE r.vlUnitFcpStConvRest = :vlUnitFcpStConvRest"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsStConvCompl", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsStConvCompl = :vlUnitIcmsStConvCompl"),
    @NamedQuery(name = "RegC185.findByVlUnitFcpStConvCompl", query = "SELECT r FROM RegC185 r WHERE r.vlUnitFcpStConvCompl = :vlUnitFcpStConvCompl")})
public class RegC185 implements Serializable {

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
    @Column(name = "NUM_ITEM")
    private String numItem;
    @Column(name = "COD_ITEM")
    private String codItem;
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Column(name = "CFOP")
    private String cfop;
    @Column(name = "COD_MOT_REST_COMPL")
    private String codMotRestCompl;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANT_CONV")
    private BigDecimal quantConv;
    @Column(name = "UNID")
    private String unid;
    @Column(name = "VL_UNIT_CONV")
    private BigDecimal vlUnitConv;
    @Column(name = "VL_UNIT_ICMS_NA_OPERACAO_CONV")
    private BigDecimal vlUnitIcmsNaOperacaoConv;
    @Column(name = "VL_UNIT_ICMS_OP_CONV")
    private BigDecimal vlUnitIcmsOpConv;
    @Column(name = "VL_UNIT_BC_ICMS_ST_ESTOQUE_CONV")
    private BigDecimal vlUnitBcIcmsStEstoqueConv;
    @Column(name = "VL_UNIT_ICMS_ST_ESTOQUE_CONV")
    private BigDecimal vlUnitIcmsStEstoqueConv;
    @Column(name = "VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV")
    private BigDecimal vlUnitFcpIcmsStEstoqueConv;
    @Column(name = "VL_UNIT_ICMS_ST_CONV_REST")
    private BigDecimal vlUnitIcmsStConvRest;
    @Column(name = "VL_UNIT_FCP_ST_CONV_REST")
    private BigDecimal vlUnitFcpStConvRest;
    @Column(name = "VL_UNIT_ICMS_ST_CONV_COMPL")
    private BigDecimal vlUnitIcmsStConvCompl;
    @Column(name = "VL_UNIT_FCP_ST_CONV_COMPL")
    private BigDecimal vlUnitFcpStConvCompl;

    public RegC185() {
    }

    public RegC185(Long id) {
        this.id = id;
    }

    public RegC185(Long id, long idPai, long linha, long hash) {
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

    public String getNumItem() {
        return numItem;
    }

    public void setNumItem(String numItem) {
        this.numItem = numItem;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
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

    public String getCodMotRestCompl() {
        return codMotRestCompl;
    }

    public void setCodMotRestCompl(String codMotRestCompl) {
        this.codMotRestCompl = codMotRestCompl;
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

    public BigDecimal getVlUnitIcmsNaOperacaoConv() {
        return vlUnitIcmsNaOperacaoConv;
    }

    public void setVlUnitIcmsNaOperacaoConv(BigDecimal vlUnitIcmsNaOperacaoConv) {
        this.vlUnitIcmsNaOperacaoConv = vlUnitIcmsNaOperacaoConv;
    }

    public BigDecimal getVlUnitIcmsOpConv() {
        return vlUnitIcmsOpConv;
    }

    public void setVlUnitIcmsOpConv(BigDecimal vlUnitIcmsOpConv) {
        this.vlUnitIcmsOpConv = vlUnitIcmsOpConv;
    }

    public BigDecimal getVlUnitBcIcmsStEstoqueConv() {
        return vlUnitBcIcmsStEstoqueConv;
    }

    public void setVlUnitBcIcmsStEstoqueConv(BigDecimal vlUnitBcIcmsStEstoqueConv) {
        this.vlUnitBcIcmsStEstoqueConv = vlUnitBcIcmsStEstoqueConv;
    }

    public BigDecimal getVlUnitIcmsStEstoqueConv() {
        return vlUnitIcmsStEstoqueConv;
    }

    public void setVlUnitIcmsStEstoqueConv(BigDecimal vlUnitIcmsStEstoqueConv) {
        this.vlUnitIcmsStEstoqueConv = vlUnitIcmsStEstoqueConv;
    }

    public BigDecimal getVlUnitFcpIcmsStEstoqueConv() {
        return vlUnitFcpIcmsStEstoqueConv;
    }

    public void setVlUnitFcpIcmsStEstoqueConv(BigDecimal vlUnitFcpIcmsStEstoqueConv) {
        this.vlUnitFcpIcmsStEstoqueConv = vlUnitFcpIcmsStEstoqueConv;
    }

    public BigDecimal getVlUnitIcmsStConvRest() {
        return vlUnitIcmsStConvRest;
    }

    public void setVlUnitIcmsStConvRest(BigDecimal vlUnitIcmsStConvRest) {
        this.vlUnitIcmsStConvRest = vlUnitIcmsStConvRest;
    }

    public BigDecimal getVlUnitFcpStConvRest() {
        return vlUnitFcpStConvRest;
    }

    public void setVlUnitFcpStConvRest(BigDecimal vlUnitFcpStConvRest) {
        this.vlUnitFcpStConvRest = vlUnitFcpStConvRest;
    }

    public BigDecimal getVlUnitIcmsStConvCompl() {
        return vlUnitIcmsStConvCompl;
    }

    public void setVlUnitIcmsStConvCompl(BigDecimal vlUnitIcmsStConvCompl) {
        this.vlUnitIcmsStConvCompl = vlUnitIcmsStConvCompl;
    }

    public BigDecimal getVlUnitFcpStConvCompl() {
        return vlUnitFcpStConvCompl;
    }

    public void setVlUnitFcpStConvCompl(BigDecimal vlUnitFcpStConvCompl) {
        this.vlUnitFcpStConvCompl = vlUnitFcpStConvCompl;
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
        if (!(object instanceof RegC185)) {
            return false;
        }
        RegC185 other = (RegC185) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC185[ id=" + id + " ]";
    }

}
