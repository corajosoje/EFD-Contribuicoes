
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c181")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC181.findAll", query = "SELECT r FROM RegC181 r"),
    @NamedQuery(name = "RegC181.findById", query = "SELECT r FROM RegC181 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC181.findByIdPai", query = "SELECT r FROM RegC181 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC181.findByLinha", query = "SELECT r FROM RegC181 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC181.findByHash", query = "SELECT r FROM RegC181 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC181.findByReg", query = "SELECT r FROM RegC181 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC181.findByCodMotRestCompl", query = "SELECT r FROM RegC181 r WHERE r.codMotRestCompl = :codMotRestCompl"),
    @NamedQuery(name = "RegC181.findByQuantConv", query = "SELECT r FROM RegC181 r WHERE r.quantConv = :quantConv"),
    @NamedQuery(name = "RegC181.findByUnid", query = "SELECT r FROM RegC181 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC181.findByCodModSaida", query = "SELECT r FROM RegC181 r WHERE r.codModSaida = :codModSaida"),
    @NamedQuery(name = "RegC181.findBySerieSaida", query = "SELECT r FROM RegC181 r WHERE r.serieSaida = :serieSaida"),
    @NamedQuery(name = "RegC181.findByEcfFabSaida", query = "SELECT r FROM RegC181 r WHERE r.ecfFabSaida = :ecfFabSaida"),
    @NamedQuery(name = "RegC181.findByNumDocSaida", query = "SELECT r FROM RegC181 r WHERE r.numDocSaida = :numDocSaida"),
    @NamedQuery(name = "RegC181.findByChvDfeSaida", query = "SELECT r FROM RegC181 r WHERE r.chvDfeSaida = :chvDfeSaida"),
    @NamedQuery(name = "RegC181.findByDtDocSaida", query = "SELECT r FROM RegC181 r WHERE r.dtDocSaida = :dtDocSaida"),
    @NamedQuery(name = "RegC181.findByNumItemSaida", query = "SELECT r FROM RegC181 r WHERE r.numItemSaida = :numItemSaida"),
    @NamedQuery(name = "RegC181.findByVlUnitConvSaida", query = "SELECT r FROM RegC181 r WHERE r.vlUnitConvSaida = :vlUnitConvSaida"),
    @NamedQuery(name = "RegC181.findByVlUnitIcmsOpEstoqueConvSaida", query = "SELECT r FROM RegC181 r WHERE r.vlUnitIcmsOpEstoqueConvSaida = :vlUnitIcmsOpEstoqueConvSaida"),
    @NamedQuery(name = "RegC181.findByVlUnitIcmsStEstoqueConvSaida", query = "SELECT r FROM RegC181 r WHERE r.vlUnitIcmsStEstoqueConvSaida = :vlUnitIcmsStEstoqueConvSaida"),
    @NamedQuery(name = "RegC181.findByVlUnitFcpIcmsStEstoqueConvSaida", query = "SELECT r FROM RegC181 r WHERE r.vlUnitFcpIcmsStEstoqueConvSaida = :vlUnitFcpIcmsStEstoqueConvSaida"),
    @NamedQuery(name = "RegC181.findByVlUnitIcmsNaOperacaoConvSaida", query = "SELECT r FROM RegC181 r WHERE r.vlUnitIcmsNaOperacaoConvSaida = :vlUnitIcmsNaOperacaoConvSaida"),
    @NamedQuery(name = "RegC181.findByVlUnitIcmsOpConvSaida", query = "SELECT r FROM RegC181 r WHERE r.vlUnitIcmsOpConvSaida = :vlUnitIcmsOpConvSaida"),
    @NamedQuery(name = "RegC181.findByVlUnitIcmsStConvRest", query = "SELECT r FROM RegC181 r WHERE r.vlUnitIcmsStConvRest = :vlUnitIcmsStConvRest"),
    @NamedQuery(name = "RegC181.findByVlUnitFcpStConvRest", query = "SELECT r FROM RegC181 r WHERE r.vlUnitFcpStConvRest = :vlUnitFcpStConvRest"),
    @NamedQuery(name = "RegC181.findByVlUnitIcmsStConvCompl", query = "SELECT r FROM RegC181 r WHERE r.vlUnitIcmsStConvCompl = :vlUnitIcmsStConvCompl"),
    @NamedQuery(name = "RegC181.findByVlUnitFcpStConvCompl", query = "SELECT r FROM RegC181 r WHERE r.vlUnitFcpStConvCompl = :vlUnitFcpStConvCompl")})
public class RegC181 implements Serializable {

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
    @Column(name = "COD_MOT_REST_COMPL")
    private String codMotRestCompl;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANT_CONV")
    private BigDecimal quantConv;
    @Column(name = "UNID")
    private String unid;
    @Column(name = "COD_MOD_SAIDA")
    private String codModSaida;
    @Column(name = "SERIE_SAIDA")
    private String serieSaida;
    @Column(name = "ECF_FAB_SAIDA")
    private String ecfFabSaida;
    @Column(name = "NUM_DOC_SAIDA")
    private String numDocSaida;
    @Column(name = "CHV_DFE_SAIDA")
    private String chvDfeSaida;
    @Column(name = "DT_DOC_SAIDA")
    @Temporal(TemporalType.DATE)
    private Date dtDocSaida;
    @Column(name = "NUM_ITEM_SAIDA")
    private String numItemSaida;
    @Column(name = "VL_UNIT_CONV_SAIDA")
    private BigDecimal vlUnitConvSaida;
    @Column(name = "VL_UNIT_ICMS_OP_ESTOQUE_CONV_SAIDA")
    private BigDecimal vlUnitIcmsOpEstoqueConvSaida;
    @Column(name = "VL_UNIT_ICMS_ST_ESTOQUE_CONV_SAIDA")
    private BigDecimal vlUnitIcmsStEstoqueConvSaida;
    @Column(name = "VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV_SAIDA")
    private BigDecimal vlUnitFcpIcmsStEstoqueConvSaida;
    @Column(name = "VL_UNIT_ICMS_NA_OPERACAO_CONV_SAIDA")
    private BigDecimal vlUnitIcmsNaOperacaoConvSaida;
    @Column(name = "VL_UNIT_ICMS_OP_CONV_SAIDA")
    private BigDecimal vlUnitIcmsOpConvSaida;
    @Column(name = "VL_UNIT_ICMS_ST_CONV_REST")
    private BigDecimal vlUnitIcmsStConvRest;
    @Column(name = "VL_UNIT_FCP_ST_CONV_REST")
    private BigDecimal vlUnitFcpStConvRest;
    @Column(name = "VL_UNIT_ICMS_ST_CONV_COMPL")
    private BigDecimal vlUnitIcmsStConvCompl;
    @Column(name = "VL_UNIT_FCP_ST_CONV_COMPL")
    private BigDecimal vlUnitFcpStConvCompl;

    public RegC181() {
    }

    public RegC181(Long id) {
        this.id = id;
    }

    public RegC181(Long id, long idPai, long linha, long hash) {
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

    public String getCodModSaida() {
        return codModSaida;
    }

    public void setCodModSaida(String codModSaida) {
        this.codModSaida = codModSaida;
    }

    public String getSerieSaida() {
        return serieSaida;
    }

    public void setSerieSaida(String serieSaida) {
        this.serieSaida = serieSaida;
    }

    public String getEcfFabSaida() {
        return ecfFabSaida;
    }

    public void setEcfFabSaida(String ecfFabSaida) {
        this.ecfFabSaida = ecfFabSaida;
    }

    public String getNumDocSaida() {
        return numDocSaida;
    }

    public void setNumDocSaida(String numDocSaida) {
        this.numDocSaida = numDocSaida;
    }

    public String getChvDfeSaida() {
        return chvDfeSaida;
    }

    public void setChvDfeSaida(String chvDfeSaida) {
        this.chvDfeSaida = chvDfeSaida;
    }

    public Date getDtDocSaida() {
        return dtDocSaida;
    }

    public void setDtDocSaida(Date dtDocSaida) {
        this.dtDocSaida = dtDocSaida;
    }

    public String getNumItemSaida() {
        return numItemSaida;
    }

    public void setNumItemSaida(String numItemSaida) {
        this.numItemSaida = numItemSaida;
    }

    public BigDecimal getVlUnitConvSaida() {
        return vlUnitConvSaida;
    }

    public void setVlUnitConvSaida(BigDecimal vlUnitConvSaida) {
        this.vlUnitConvSaida = vlUnitConvSaida;
    }

    public BigDecimal getVlUnitIcmsOpEstoqueConvSaida() {
        return vlUnitIcmsOpEstoqueConvSaida;
    }

    public void setVlUnitIcmsOpEstoqueConvSaida(BigDecimal vlUnitIcmsOpEstoqueConvSaida) {
        this.vlUnitIcmsOpEstoqueConvSaida = vlUnitIcmsOpEstoqueConvSaida;
    }

    public BigDecimal getVlUnitIcmsStEstoqueConvSaida() {
        return vlUnitIcmsStEstoqueConvSaida;
    }

    public void setVlUnitIcmsStEstoqueConvSaida(BigDecimal vlUnitIcmsStEstoqueConvSaida) {
        this.vlUnitIcmsStEstoqueConvSaida = vlUnitIcmsStEstoqueConvSaida;
    }

    public BigDecimal getVlUnitFcpIcmsStEstoqueConvSaida() {
        return vlUnitFcpIcmsStEstoqueConvSaida;
    }

    public void setVlUnitFcpIcmsStEstoqueConvSaida(BigDecimal vlUnitFcpIcmsStEstoqueConvSaida) {
        this.vlUnitFcpIcmsStEstoqueConvSaida = vlUnitFcpIcmsStEstoqueConvSaida;
    }

    public BigDecimal getVlUnitIcmsNaOperacaoConvSaida() {
        return vlUnitIcmsNaOperacaoConvSaida;
    }

    public void setVlUnitIcmsNaOperacaoConvSaida(BigDecimal vlUnitIcmsNaOperacaoConvSaida) {
        this.vlUnitIcmsNaOperacaoConvSaida = vlUnitIcmsNaOperacaoConvSaida;
    }

    public BigDecimal getVlUnitIcmsOpConvSaida() {
        return vlUnitIcmsOpConvSaida;
    }

    public void setVlUnitIcmsOpConvSaida(BigDecimal vlUnitIcmsOpConvSaida) {
        this.vlUnitIcmsOpConvSaida = vlUnitIcmsOpConvSaida;
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
        if (!(object instanceof RegC181)) {
            return false;
        }
        RegC181 other = (RegC181) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC181[ id=" + id + " ]";
    }

}
