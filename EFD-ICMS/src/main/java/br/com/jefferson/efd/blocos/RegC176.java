
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
@Table(name = "reg_c176")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC176.findAll", query = "SELECT r FROM RegC176 r"),
    @NamedQuery(name = "RegC176.findById", query = "SELECT r FROM RegC176 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC176.findByIdPai", query = "SELECT r FROM RegC176 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC176.findByLinha", query = "SELECT r FROM RegC176 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC176.findByHash", query = "SELECT r FROM RegC176 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC176.findByReg", query = "SELECT r FROM RegC176 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC176.findByCodModUltE", query = "SELECT r FROM RegC176 r WHERE r.codModUltE = :codModUltE"),
    @NamedQuery(name = "RegC176.findByNumDocUltE", query = "SELECT r FROM RegC176 r WHERE r.numDocUltE = :numDocUltE"),
    @NamedQuery(name = "RegC176.findBySerUltE", query = "SELECT r FROM RegC176 r WHERE r.serUltE = :serUltE"),
    @NamedQuery(name = "RegC176.findByDtUltE", query = "SELECT r FROM RegC176 r WHERE r.dtUltE = :dtUltE"),
    @NamedQuery(name = "RegC176.findByCodPartUltE", query = "SELECT r FROM RegC176 r WHERE r.codPartUltE = :codPartUltE"),
    @NamedQuery(name = "RegC176.findByQuantUltE", query = "SELECT r FROM RegC176 r WHERE r.quantUltE = :quantUltE"),
    @NamedQuery(name = "RegC176.findByVlUnitUltE", query = "SELECT r FROM RegC176 r WHERE r.vlUnitUltE = :vlUnitUltE"),
    @NamedQuery(name = "RegC176.findByVlUnitBcSt", query = "SELECT r FROM RegC176 r WHERE r.vlUnitBcSt = :vlUnitBcSt"),
    @NamedQuery(name = "RegC176.findByChaveNfeUltE", query = "SELECT r FROM RegC176 r WHERE r.chaveNfeUltE = :chaveNfeUltE"),
    @NamedQuery(name = "RegC176.findByNumItemUltE", query = "SELECT r FROM RegC176 r WHERE r.numItemUltE = :numItemUltE"),
    @NamedQuery(name = "RegC176.findByVlUnitBcIcmsUltE", query = "SELECT r FROM RegC176 r WHERE r.vlUnitBcIcmsUltE = :vlUnitBcIcmsUltE"),
    @NamedQuery(name = "RegC176.findByAliqIcmsUltE", query = "SELECT r FROM RegC176 r WHERE r.aliqIcmsUltE = :aliqIcmsUltE"),
    @NamedQuery(name = "RegC176.findByVlUnitLimiteBcIcmsUltE", query = "SELECT r FROM RegC176 r WHERE r.vlUnitLimiteBcIcmsUltE = :vlUnitLimiteBcIcmsUltE"),
    @NamedQuery(name = "RegC176.findByVlUnitIcmsUltE", query = "SELECT r FROM RegC176 r WHERE r.vlUnitIcmsUltE = :vlUnitIcmsUltE"),
    @NamedQuery(name = "RegC176.findByAliqStUltE", query = "SELECT r FROM RegC176 r WHERE r.aliqStUltE = :aliqStUltE"),
    @NamedQuery(name = "RegC176.findByVlUnitRes", query = "SELECT r FROM RegC176 r WHERE r.vlUnitRes = :vlUnitRes"),
    @NamedQuery(name = "RegC176.findByCodRespRet", query = "SELECT r FROM RegC176 r WHERE r.codRespRet = :codRespRet"),
    @NamedQuery(name = "RegC176.findByCodMotRes", query = "SELECT r FROM RegC176 r WHERE r.codMotRes = :codMotRes"),
    @NamedQuery(name = "RegC176.findByChaveNfeRet", query = "SELECT r FROM RegC176 r WHERE r.chaveNfeRet = :chaveNfeRet"),
    @NamedQuery(name = "RegC176.findByCodPartNfeRet", query = "SELECT r FROM RegC176 r WHERE r.codPartNfeRet = :codPartNfeRet"),
    @NamedQuery(name = "RegC176.findBySerNfeRet", query = "SELECT r FROM RegC176 r WHERE r.serNfeRet = :serNfeRet"),
    @NamedQuery(name = "RegC176.findByNumNfeRet", query = "SELECT r FROM RegC176 r WHERE r.numNfeRet = :numNfeRet"),
    @NamedQuery(name = "RegC176.findByItemNfeRet", query = "SELECT r FROM RegC176 r WHERE r.itemNfeRet = :itemNfeRet"),
    @NamedQuery(name = "RegC176.findByCodDa", query = "SELECT r FROM RegC176 r WHERE r.codDa = :codDa"),
    @NamedQuery(name = "RegC176.findByNumDa", query = "SELECT r FROM RegC176 r WHERE r.numDa = :numDa"),
    @NamedQuery(name = "RegC176.findByVlUnitResFcpSt", query = "SELECT r FROM RegC176 r WHERE r.vlUnitResFcpSt = :vlUnitResFcpSt")})
public class RegC176 implements Serializable {

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
    @Column(name = "COD_MOD_ULT_E")
    private String codModUltE;
    @Column(name = "NUM_DOC_ULT_E")
    private String numDocUltE;
    @Column(name = "SER_ULT_E")
    private String serUltE;
    @Column(name = "DT_ULT_E")
    @Temporal(TemporalType.DATE)
    private Date dtUltE;
    @Column(name = "COD_PART_ULT_E")
    private String codPartUltE;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANT_ULT_E")
    private BigDecimal quantUltE;
    @Column(name = "VL_UNIT_ULT_E")
    private BigDecimal vlUnitUltE;
    @Column(name = "VL_UNIT_BC_ST")
    private BigDecimal vlUnitBcSt;
    @Column(name = "CHAVE_NFE_ULT_E")
    private String chaveNfeUltE;
    @Column(name = "NUM_ITEM_ULT_E")
    private String numItemUltE;
    @Column(name = "VL_UNIT_BC_ICMS_ULT_E")
    private BigDecimal vlUnitBcIcmsUltE;
    @Column(name = "ALIQ_ICMS_ULT_E")
    private BigDecimal aliqIcmsUltE;
    @Column(name = "VL_UNIT_LIMITE_BC_ICMS_ULT_E")
    private BigDecimal vlUnitLimiteBcIcmsUltE;
    @Column(name = "VL_UNIT_ICMS_ULT_E")
    private BigDecimal vlUnitIcmsUltE;
    @Column(name = "ALIQ_ST_ULT_E")
    private BigDecimal aliqStUltE;
    @Column(name = "VL_UNIT_RES")
    private BigDecimal vlUnitRes;
    @Column(name = "COD_RESP_RET")
    private String codRespRet;
    @Column(name = "COD_MOT_RES")
    private String codMotRes;
    @Column(name = "CHAVE_NFE_RET")
    private String chaveNfeRet;
    @Column(name = "COD_PART_NFE_RET")
    private String codPartNfeRet;
    @Column(name = "SER_NFE_RET")
    private String serNfeRet;
    @Column(name = "NUM_NFE_RET")
    private String numNfeRet;
    @Column(name = "ITEM_NFE_RET")
    private String itemNfeRet;
    @Column(name = "COD_DA")
    private String codDa;
    @Column(name = "NUM_DA")
    private String numDa;
    @Column(name = "VL_UNIT_RES_FCP_ST")
    private BigDecimal vlUnitResFcpSt;

    public RegC176() {
    }

    public RegC176(Long id) {
        this.id = id;
    }

    public RegC176(Long id, long idPai, long linha, long hash) {
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

    public String getCodModUltE() {
        return codModUltE;
    }

    public void setCodModUltE(String codModUltE) {
        this.codModUltE = codModUltE;
    }

    public String getNumDocUltE() {
        return numDocUltE;
    }

    public void setNumDocUltE(String numDocUltE) {
        this.numDocUltE = numDocUltE;
    }

    public String getSerUltE() {
        return serUltE;
    }

    public void setSerUltE(String serUltE) {
        this.serUltE = serUltE;
    }

    public Date getDtUltE() {
        return dtUltE;
    }

    public void setDtUltE(Date dtUltE) {
        this.dtUltE = dtUltE;
    }

    public String getCodPartUltE() {
        return codPartUltE;
    }

    public void setCodPartUltE(String codPartUltE) {
        this.codPartUltE = codPartUltE;
    }

    public BigDecimal getQuantUltE() {
        return quantUltE;
    }

    public void setQuantUltE(BigDecimal quantUltE) {
        this.quantUltE = quantUltE;
    }

    public BigDecimal getVlUnitUltE() {
        return vlUnitUltE;
    }

    public void setVlUnitUltE(BigDecimal vlUnitUltE) {
        this.vlUnitUltE = vlUnitUltE;
    }

    public BigDecimal getVlUnitBcSt() {
        return vlUnitBcSt;
    }

    public void setVlUnitBcSt(BigDecimal vlUnitBcSt) {
        this.vlUnitBcSt = vlUnitBcSt;
    }

    public String getChaveNfeUltE() {
        return chaveNfeUltE;
    }

    public void setChaveNfeUltE(String chaveNfeUltE) {
        this.chaveNfeUltE = chaveNfeUltE;
    }

    public String getNumItemUltE() {
        return numItemUltE;
    }

    public void setNumItemUltE(String numItemUltE) {
        this.numItemUltE = numItemUltE;
    }

    public BigDecimal getVlUnitBcIcmsUltE() {
        return vlUnitBcIcmsUltE;
    }

    public void setVlUnitBcIcmsUltE(BigDecimal vlUnitBcIcmsUltE) {
        this.vlUnitBcIcmsUltE = vlUnitBcIcmsUltE;
    }

    public BigDecimal getAliqIcmsUltE() {
        return aliqIcmsUltE;
    }

    public void setAliqIcmsUltE(BigDecimal aliqIcmsUltE) {
        this.aliqIcmsUltE = aliqIcmsUltE;
    }

    public BigDecimal getVlUnitLimiteBcIcmsUltE() {
        return vlUnitLimiteBcIcmsUltE;
    }

    public void setVlUnitLimiteBcIcmsUltE(BigDecimal vlUnitLimiteBcIcmsUltE) {
        this.vlUnitLimiteBcIcmsUltE = vlUnitLimiteBcIcmsUltE;
    }

    public BigDecimal getVlUnitIcmsUltE() {
        return vlUnitIcmsUltE;
    }

    public void setVlUnitIcmsUltE(BigDecimal vlUnitIcmsUltE) {
        this.vlUnitIcmsUltE = vlUnitIcmsUltE;
    }

    public BigDecimal getAliqStUltE() {
        return aliqStUltE;
    }

    public void setAliqStUltE(BigDecimal aliqStUltE) {
        this.aliqStUltE = aliqStUltE;
    }

    public BigDecimal getVlUnitRes() {
        return vlUnitRes;
    }

    public void setVlUnitRes(BigDecimal vlUnitRes) {
        this.vlUnitRes = vlUnitRes;
    }

    public String getCodRespRet() {
        return codRespRet;
    }

    public void setCodRespRet(String codRespRet) {
        this.codRespRet = codRespRet;
    }

    public String getCodMotRes() {
        return codMotRes;
    }

    public void setCodMotRes(String codMotRes) {
        this.codMotRes = codMotRes;
    }

    public String getChaveNfeRet() {
        return chaveNfeRet;
    }

    public void setChaveNfeRet(String chaveNfeRet) {
        this.chaveNfeRet = chaveNfeRet;
    }

    public String getCodPartNfeRet() {
        return codPartNfeRet;
    }

    public void setCodPartNfeRet(String codPartNfeRet) {
        this.codPartNfeRet = codPartNfeRet;
    }

    public String getSerNfeRet() {
        return serNfeRet;
    }

    public void setSerNfeRet(String serNfeRet) {
        this.serNfeRet = serNfeRet;
    }

    public String getNumNfeRet() {
        return numNfeRet;
    }

    public void setNumNfeRet(String numNfeRet) {
        this.numNfeRet = numNfeRet;
    }

    public String getItemNfeRet() {
        return itemNfeRet;
    }

    public void setItemNfeRet(String itemNfeRet) {
        this.itemNfeRet = itemNfeRet;
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

    public BigDecimal getVlUnitResFcpSt() {
        return vlUnitResFcpSt;
    }

    public void setVlUnitResFcpSt(BigDecimal vlUnitResFcpSt) {
        this.vlUnitResFcpSt = vlUnitResFcpSt;
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
        if (!(object instanceof RegC176)) {
            return false;
        }
        RegC176 other = (RegC176) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC176[ id=" + id + " ]";
    }

}
