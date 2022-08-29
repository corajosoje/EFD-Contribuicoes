package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_c186")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC186.findAll", query = "SELECT r FROM RegC186 r"),
    @NamedQuery(name = "RegC186.findById", query = "SELECT r FROM RegC186 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC186.findByIdPai", query = "SELECT r FROM RegC186 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC186.findByLinha", query = "SELECT r FROM RegC186 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC186.findByHash", query = "SELECT r FROM RegC186 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC186.findByReg", query = "SELECT r FROM RegC186 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC186.findByNumItem", query = "SELECT r FROM RegC186 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegC186.findByCodItem", query = "SELECT r FROM RegC186 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC186.findByCstIcms", query = "SELECT r FROM RegC186 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC186.findByCfop", query = "SELECT r FROM RegC186 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC186.findByCodMotRestCompl", query = "SELECT r FROM RegC186 r WHERE r.codMotRestCompl = :codMotRestCompl"),
    @NamedQuery(name = "RegC186.findByQuantConv", query = "SELECT r FROM RegC186 r WHERE r.quantConv = :quantConv"),
    @NamedQuery(name = "RegC186.findByUnid", query = "SELECT r FROM RegC186 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC186.findByCodModEntrada", query = "SELECT r FROM RegC186 r WHERE r.codModEntrada = :codModEntrada"),
    @NamedQuery(name = "RegC186.findBySerieEntrada", query = "SELECT r FROM RegC186 r WHERE r.serieEntrada = :serieEntrada"),
    @NamedQuery(name = "RegC186.findByNumDocEntrada", query = "SELECT r FROM RegC186 r WHERE r.numDocEntrada = :numDocEntrada"),
    @NamedQuery(name = "RegC186.findByChvDfeEntrada", query = "SELECT r FROM RegC186 r WHERE r.chvDfeEntrada = :chvDfeEntrada"),
    @NamedQuery(name = "RegC186.findByDtDocEntrada", query = "SELECT r FROM RegC186 r WHERE r.dtDocEntrada = :dtDocEntrada"),
    @NamedQuery(name = "RegC186.findByNumItemEntrada", query = "SELECT r FROM RegC186 r WHERE r.numItemEntrada = :numItemEntrada"),
    @NamedQuery(name = "RegC186.findByVlUnitConvEntrada", query = "SELECT r FROM RegC186 r WHERE r.vlUnitConvEntrada = :vlUnitConvEntrada"),
    @NamedQuery(name = "RegC186.findByVlUnitIcmsOpConvEntrada", query = "SELECT r FROM RegC186 r WHERE r.vlUnitIcmsOpConvEntrada = :vlUnitIcmsOpConvEntrada"),
    @NamedQuery(name = "RegC186.findByVlUnitBcIcmsStConvEntrada", query = "SELECT r FROM RegC186 r WHERE r.vlUnitBcIcmsStConvEntrada = :vlUnitBcIcmsStConvEntrada"),
    @NamedQuery(name = "RegC186.findByVlUnitIcmsStConvEntrada", query = "SELECT r FROM RegC186 r WHERE r.vlUnitIcmsStConvEntrada = :vlUnitIcmsStConvEntrada"),
    @NamedQuery(name = "RegC186.findByVlUnitFcpStConvEntrada", query = "SELECT r FROM RegC186 r WHERE r.vlUnitFcpStConvEntrada = :vlUnitFcpStConvEntrada")})
public class RegC186 implements Serializable {

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
    @Column(name = "NUM_ITEM")
    private int numItem;
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
    @Column(name = "COD_MOD_ENTRADA")
    private String codModEntrada;
    @Column(name = "SERIE_ENTRADA")
    private String serieEntrada;
    @Column(name = "NUM_DOC_ENTRADA")
    private int numDocEntrada;
    @Column(name = "CHV_DFE_ENTRADA")
    private String chvDfeEntrada;
    @Column(name = "DT_DOC_ENTRADA")
    @Temporal(TemporalType.DATE)
    private Date dtDocEntrada;
    @Column(name = "NUM_ITEM_ENTRADA")
    private int numItemEntrada;
    @Column(name = "VL_UNIT_CONV_ENTRADA")
    private BigDecimal vlUnitConvEntrada;
    @Column(name = "VL_UNIT_ICMS_OP_CONV_ENTRADA")
    private BigDecimal vlUnitIcmsOpConvEntrada;
    @Column(name = "VL_UNIT_BC_ICMS_ST_CONV_ENTRADA")
    private BigDecimal vlUnitBcIcmsStConvEntrada;
    @Column(name = "VL_UNIT_ICMS_ST_CONV_ENTRADA")
    private BigDecimal vlUnitIcmsStConvEntrada;
    @Column(name = "VL_UNIT_FCP_ST_CONV_ENTRADA")
    private BigDecimal vlUnitFcpStConvEntrada;

    public RegC186() {
    }

    public RegC186(Long id) {
        this.id = id;
    }

    public RegC186(Long id, long idPai, long linha, String hash) {
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

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
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

    public String getCodModEntrada() {
        return codModEntrada;
    }

    public void setCodModEntrada(String codModEntrada) {
        this.codModEntrada = codModEntrada;
    }

    public String getSerieEntrada() {
        return serieEntrada;
    }

    public void setSerieEntrada(String serieEntrada) {
        this.serieEntrada = serieEntrada;
    }

    public int getNumDocEntrada() {
        return numDocEntrada;
    }

    public void setNumDocEntrada(int numDocEntrada) {
        this.numDocEntrada = numDocEntrada;
    }

    public String getChvDfeEntrada() {
        return chvDfeEntrada;
    }

    public void setChvDfeEntrada(String chvDfeEntrada) {
        this.chvDfeEntrada = chvDfeEntrada;
    }

    public Date getDtDocEntrada() {
        return dtDocEntrada;
    }

    public void setDtDocEntrada(Date dtDocEntrada) {
        this.dtDocEntrada = dtDocEntrada;
    }

    public int getNumItemEntrada() {
        return numItemEntrada;
    }

    public void setNumItemEntrada(int numItemEntrada) {
        this.numItemEntrada = numItemEntrada;
    }

    public BigDecimal getVlUnitConvEntrada() {
        return vlUnitConvEntrada;
    }

    public void setVlUnitConvEntrada(BigDecimal vlUnitConvEntrada) {
        this.vlUnitConvEntrada = vlUnitConvEntrada;
    }

    public BigDecimal getVlUnitIcmsOpConvEntrada() {
        return vlUnitIcmsOpConvEntrada;
    }

    public void setVlUnitIcmsOpConvEntrada(BigDecimal vlUnitIcmsOpConvEntrada) {
        this.vlUnitIcmsOpConvEntrada = vlUnitIcmsOpConvEntrada;
    }

    public BigDecimal getVlUnitBcIcmsStConvEntrada() {
        return vlUnitBcIcmsStConvEntrada;
    }

    public void setVlUnitBcIcmsStConvEntrada(BigDecimal vlUnitBcIcmsStConvEntrada) {
        this.vlUnitBcIcmsStConvEntrada = vlUnitBcIcmsStConvEntrada;
    }

    public BigDecimal getVlUnitIcmsStConvEntrada() {
        return vlUnitIcmsStConvEntrada;
    }

    public void setVlUnitIcmsStConvEntrada(BigDecimal vlUnitIcmsStConvEntrada) {
        this.vlUnitIcmsStConvEntrada = vlUnitIcmsStConvEntrada;
    }

    public BigDecimal getVlUnitFcpStConvEntrada() {
        return vlUnitFcpStConvEntrada;
    }

    public void setVlUnitFcpStConvEntrada(BigDecimal vlUnitFcpStConvEntrada) {
        this.vlUnitFcpStConvEntrada = vlUnitFcpStConvEntrada;
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
        if (!(object instanceof RegC186)) {
            return false;
        }
        RegC186 other = (RegC186) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC186[ id=" + id + " ]";
    }

}
