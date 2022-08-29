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
@Table(name = "reg_c170")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC170.findAll", query = "SELECT r FROM RegC170 r"),
    @NamedQuery(name = "RegC170.findById", query = "SELECT r FROM RegC170 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC170.findByIdPai", query = "SELECT r FROM RegC170 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC170.findByLinha", query = "SELECT r FROM RegC170 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC170.findByHash", query = "SELECT r FROM RegC170 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC170.findByReg", query = "SELECT r FROM RegC170 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC170.findByNumItem", query = "SELECT r FROM RegC170 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegC170.findByCodItem", query = "SELECT r FROM RegC170 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC170.findByDescrCompl", query = "SELECT r FROM RegC170 r WHERE r.descrCompl = :descrCompl"),
    @NamedQuery(name = "RegC170.findByQtd", query = "SELECT r FROM RegC170 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC170.findByUnid", query = "SELECT r FROM RegC170 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC170.findByVlItem", query = "SELECT r FROM RegC170 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC170.findByVlDesc", query = "SELECT r FROM RegC170 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC170.findByIndMov", query = "SELECT r FROM RegC170 r WHERE r.indMov = :indMov"),
    @NamedQuery(name = "RegC170.findByCstIcms", query = "SELECT r FROM RegC170 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC170.findByCfop", query = "SELECT r FROM RegC170 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC170.findByCodNat", query = "SELECT r FROM RegC170 r WHERE r.codNat = :codNat"),
    @NamedQuery(name = "RegC170.findByVlBcIcms", query = "SELECT r FROM RegC170 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC170.findByAliqIcms", query = "SELECT r FROM RegC170 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC170.findByVlIcms", query = "SELECT r FROM RegC170 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC170.findByVlBcIcmsSt", query = "SELECT r FROM RegC170 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC170.findByAliqSt", query = "SELECT r FROM RegC170 r WHERE r.aliqSt = :aliqSt"),
    @NamedQuery(name = "RegC170.findByVlIcmsSt", query = "SELECT r FROM RegC170 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC170.findByIndApur", query = "SELECT r FROM RegC170 r WHERE r.indApur = :indApur"),
    @NamedQuery(name = "RegC170.findByCstIpi", query = "SELECT r FROM RegC170 r WHERE r.cstIpi = :cstIpi"),
    @NamedQuery(name = "RegC170.findByCodEnq", query = "SELECT r FROM RegC170 r WHERE r.codEnq = :codEnq"),
    @NamedQuery(name = "RegC170.findByVlBcIpi", query = "SELECT r FROM RegC170 r WHERE r.vlBcIpi = :vlBcIpi"),
    @NamedQuery(name = "RegC170.findByAliqIpi", query = "SELECT r FROM RegC170 r WHERE r.aliqIpi = :aliqIpi"),
    @NamedQuery(name = "RegC170.findByVlIpi", query = "SELECT r FROM RegC170 r WHERE r.vlIpi = :vlIpi"),
    @NamedQuery(name = "RegC170.findByCstPis", query = "SELECT r FROM RegC170 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegC170.findByVlBcPis", query = "SELECT r FROM RegC170 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegC170.findByAliqPisPerc", query = "SELECT r FROM RegC170 r WHERE r.aliqPisPerc = :aliqPisPerc"),
    @NamedQuery(name = "RegC170.findByQuantBcPis", query = "SELECT r FROM RegC170 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegC170.findByAliqPisReais", query = "SELECT r FROM RegC170 r WHERE r.aliqPisReais = :aliqPisReais"),
    @NamedQuery(name = "RegC170.findByVlPis", query = "SELECT r FROM RegC170 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC170.findByCstCofins", query = "SELECT r FROM RegC170 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegC170.findByVlBcCofins", query = "SELECT r FROM RegC170 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegC170.findByAliqCofinsPerc", query = "SELECT r FROM RegC170 r WHERE r.aliqCofinsPerc = :aliqCofinsPerc"),
    @NamedQuery(name = "RegC170.findByQuantBcCofins", query = "SELECT r FROM RegC170 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegC170.findByAliqCofinsReais", query = "SELECT r FROM RegC170 r WHERE r.aliqCofinsReais = :aliqCofinsReais"),
    @NamedQuery(name = "RegC170.findByVlCofins", query = "SELECT r FROM RegC170 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC170.findByCodCta", query = "SELECT r FROM RegC170 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegC170.findByVlAbatNt", query = "SELECT r FROM RegC170 r WHERE r.vlAbatNt = :vlAbatNt")})
public class RegC170 implements Serializable {

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
    @Column(name = "DESCR_COMPL")
    private String descrCompl;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Column(name = "UNID")
    private String unid;
    @Column(name = "VL_ITEM")
    private BigDecimal vlItem;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "IND_MOV")
    private String indMov;
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Column(name = "CFOP")
    private String cfop;
    @Column(name = "COD_NAT")
    private String codNat;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "ALIQ_ICMS")
    private BigDecimal aliqIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_BC_ICMS_ST")
    private BigDecimal vlBcIcmsSt;
    @Column(name = "ALIQ_ST")
    private BigDecimal aliqSt;
    @Column(name = "VL_ICMS_ST")
    private BigDecimal vlIcmsSt;
    @Column(name = "IND_APUR")
    private String indApur;
    @Column(name = "CST_IPI")
    private String cstIpi;
    @Column(name = "COD_ENQ")
    private String codEnq;
    @Column(name = "VL_BC_IPI")
    private BigDecimal vlBcIpi;
    @Column(name = "ALIQ_IPI")
    private BigDecimal aliqIpi;
    @Column(name = "VL_IPI")
    private BigDecimal vlIpi;
    @Column(name = "CST_PIS")
    private String cstPis;
    @Column(name = "VL_BC_PIS")
    private BigDecimal vlBcPis;
    @Column(name = "ALIQ_PIS_PERC")
    private BigDecimal aliqPisPerc;
    @Column(name = "QUANT_BC_PIS")
    private BigDecimal quantBcPis;
    @Column(name = "ALIQ_PIS_REAIS")
    private BigDecimal aliqPisReais;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "CST_COFINS")
    private String cstCofins;
    @Column(name = "VL_BC_COFINS")
    private BigDecimal vlBcCofins;
    @Column(name = "ALIQ_COFINS_PERC")
    private BigDecimal aliqCofinsPerc;
    @Column(name = "QUANT_BC_COFINS")
    private BigDecimal quantBcCofins;
    @Column(name = "ALIQ_COFINS_REAIS")
    private BigDecimal aliqCofinsReais;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "COD_CTA")
    private String codCta;
    @Column(name = "VL_ABAT_NT")
    private BigDecimal vlAbatNt;

    public RegC170() {
    }

    public RegC170(Long id) {
        this.id = id;
    }

    public RegC170(Long id, long idPai, long linha, String hash) {
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

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
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

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
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

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
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

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getAliqSt() {
        return aliqSt;
    }

    public void setAliqSt(BigDecimal aliqSt) {
        this.aliqSt = aliqSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public String getIndApur() {
        return indApur;
    }

    public void setIndApur(String indApur) {
        this.indApur = indApur;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }

    public String getCodEnq() {
        return codEnq;
    }

    public void setCodEnq(String codEnq) {
        this.codEnq = codEnq;
    }

    public BigDecimal getVlBcIpi() {
        return vlBcIpi;
    }

    public void setVlBcIpi(BigDecimal vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }

    public BigDecimal getAliqIpi() {
        return aliqIpi;
    }

    public void setAliqIpi(BigDecimal aliqIpi) {
        this.aliqIpi = aliqIpi;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }

    public String getCstPis() {
        return cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getAliqPisPerc() {
        return aliqPisPerc;
    }

    public void setAliqPisPerc(BigDecimal aliqPisPerc) {
        this.aliqPisPerc = aliqPisPerc;
    }

    public BigDecimal getQuantBcPis() {
        return quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }

    public BigDecimal getAliqPisReais() {
        return aliqPisReais;
    }

    public void setAliqPisReais(BigDecimal aliqPisReais) {
        this.aliqPisReais = aliqPisReais;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public String getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getAliqCofinsPerc() {
        return aliqCofinsPerc;
    }

    public void setAliqCofinsPerc(BigDecimal aliqCofinsPerc) {
        this.aliqCofinsPerc = aliqCofinsPerc;
    }

    public BigDecimal getQuantBcCofins() {
        return quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }

    public BigDecimal getAliqCofinsReais() {
        return aliqCofinsReais;
    }

    public void setAliqCofinsReais(BigDecimal aliqCofinsReais) {
        this.aliqCofinsReais = aliqCofinsReais;
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

    public BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
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
        if (!(object instanceof RegC170)) {
            return false;
        }
        RegC170 other = (RegC170) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC170[ id=" + id + " ]";
    }

}
