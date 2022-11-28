package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Registros(nivel = 4)
public class RegC176 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC170 idPai;

    public RegC170 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC170) idPai;
    }

    public RegC176() {
    }

    public RegC176(Long id) {
        this.id = id;
    }

    public RegC176(Long id, RegC170 idPai, long linha, String hash) {
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
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD_ULT_E")
    private String codModUltE;
    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "NUM_DOC_ULT_E")
    private int numDocUltE;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SER_ULT_E")
    private String serUltE;
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_ULT_E")
    @Temporal(TemporalType.DATE)
    private Date dtUltE;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_PART_ULT_E")
    private String codPartUltE;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "QUANT_ULT_E")
    private BigDecimal quantUltE;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_UNIT_ULT_E")
    private BigDecimal vlUnitUltE;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_UNIT_BC_ST")
    private BigDecimal vlUnitBcSt;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CHAVE_NFE_ULT_E")
    private String chaveNfeUltE;
    @Campos(posicao = 11, tipo = 'I')
    @Column(name = "NUM_ITEM_ULT_E")
    private int numItemUltE;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_UNIT_BC_ICMS_ULT_E")
    private BigDecimal vlUnitBcIcmsUltE;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "ALIQ_ICMS_ULT_E")
    private BigDecimal aliqIcmsUltE;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_UNIT_LIMITE_BC_ICMS_ULT_E ")
    private BigDecimal vlUnitLimiteBcIcmsUltE;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_ULT_E")
    private BigDecimal vlUnitIcmsUltE;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "ALIQ_ST_ULT_E")
    private BigDecimal aliqStUltE;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_UNIT_RES")
    private BigDecimal vlUnitRes;
    @Campos(posicao = 18, tipo = 'C')
    @Column(name = "COD_RESP_RET")
    private String codRespRet;
    @Campos(posicao = 19, tipo = 'C')
    @Column(name = "COD_MOT_RES")
    private String codMotRes;
    @Campos(posicao = 20, tipo = 'C')
    @Column(name = "CHAVE_NFE_RET")
    private String chaveNfeRet;
    @Campos(posicao = 21, tipo = 'C')
    @Column(name = "COD_PART_NFE_RET")
    private String codPartNfeRet;
    @Campos(posicao = 22, tipo = 'C')
    @Column(name = "SER_NFE_RET")
    private String serNfeRet;
    @Campos(posicao = 23, tipo = 'I')
    @Column(name = "NUM_NFE_RET")
    private int numNfeRet;
    @Campos(posicao = 24, tipo = 'I')
    @Column(name = "ITEM_NFE_RET")
    private int itemNfeRet;
    @Campos(posicao = 25, tipo = 'C')
    @Column(name = "COD_DA")
    private String codDa;
    @Campos(posicao = 26, tipo = 'C')
    @Column(name = "NUM_DA")
    private String numDa;
    @Campos(posicao = 27, tipo = 'R')
    @Column(name = "VL_UNIT_RES_FCP_ST")
    private BigDecimal vlUnitResFcpSt;

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

    public String getCodModUltE() {
        return codModUltE;
    }

    public void setCodModUltE(String codModUltE) {
        this.codModUltE = codModUltE;
    }

    public int getNumDocUltE() {
        return numDocUltE;
    }

    public void setNumDocUltE(int numDocUltE) {
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

    public int getNumItemUltE() {
        return numItemUltE;
    }

    public void setNumItemUltE(int numItemUltE) {
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

    public int getNumNfeRet() {
        return numNfeRet;
    }

    public void setNumNfeRet(int numNfeRet) {
        this.numNfeRet = numNfeRet;
    }

    public int getItemNfeRet() {
        return itemNfeRet;
    }

    public void setItemNfeRet(int itemNfeRet) {
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
