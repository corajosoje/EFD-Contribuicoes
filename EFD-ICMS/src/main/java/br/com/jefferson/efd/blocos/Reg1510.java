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
@Table(name = "reg_1510")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1510.findAll", query = "SELECT r FROM Reg1510 r"),
    @NamedQuery(name = "Reg1510.findById", query = "SELECT r FROM Reg1510 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1510.findByIdPai", query = "SELECT r FROM Reg1510 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1510.findByLinha", query = "SELECT r FROM Reg1510 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1510.findByHash", query = "SELECT r FROM Reg1510 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1510.findByReg", query = "SELECT r FROM Reg1510 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1510.findByNumItem", query = "SELECT r FROM Reg1510 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "Reg1510.findByCodItem", query = "SELECT r FROM Reg1510 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "Reg1510.findByCodClass", query = "SELECT r FROM Reg1510 r WHERE r.codClass = :codClass"),
    @NamedQuery(name = "Reg1510.findByQtd", query = "SELECT r FROM Reg1510 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "Reg1510.findByUnid", query = "SELECT r FROM Reg1510 r WHERE r.unid = :unid"),
    @NamedQuery(name = "Reg1510.findByVlItem", query = "SELECT r FROM Reg1510 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "Reg1510.findByVlDesc", query = "SELECT r FROM Reg1510 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "Reg1510.findByCstIcms", query = "SELECT r FROM Reg1510 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "Reg1510.findByCfop", query = "SELECT r FROM Reg1510 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "Reg1510.findByVlBcIcms", query = "SELECT r FROM Reg1510 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "Reg1510.findByAliqIcms", query = "SELECT r FROM Reg1510 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "Reg1510.findByVlIcms", query = "SELECT r FROM Reg1510 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "Reg1510.findByVlBcIcmsSt", query = "SELECT r FROM Reg1510 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "Reg1510.findByAliqSt", query = "SELECT r FROM Reg1510 r WHERE r.aliqSt = :aliqSt"),
    @NamedQuery(name = "Reg1510.findByVlIcmsSt", query = "SELECT r FROM Reg1510 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "Reg1510.findByIndRec", query = "SELECT r FROM Reg1510 r WHERE r.indRec = :indRec"),
    @NamedQuery(name = "Reg1510.findByCodPart", query = "SELECT r FROM Reg1510 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "Reg1510.findByVlPis", query = "SELECT r FROM Reg1510 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "Reg1510.findByVlCofis", query = "SELECT r FROM Reg1510 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "Reg1510.findByCodCta", query = "SELECT r FROM Reg1510 r WHERE r.codCta = :codCta")})
public class Reg1510 implements Serializable {

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
    @Column(name = "COD_CLASS")
    private String codClass;
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
    @Column(name = "IND_REC")
    private String indRec;
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "COD_CTA")
    private String codCta;

    public Reg1510() {
    }

    public Reg1510(Long id) {
        this.id = id;
    }

    public Reg1510(Long id, long idPai, long linha, String hash) {
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

    public String getCodClass() {
        return codClass;
    }

    public void setCodClass(String codClass) {
        this.codClass = codClass;
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

    public String getIndRec() {
        return indRec;
    }

    public void setIndRec(String indRec) {
        this.indRec = indRec;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
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
        if (!(object instanceof Reg1510)) {
            return false;
        }
        Reg1510 other = (Reg1510) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1510[ id=" + id + " ]";
    }

}
