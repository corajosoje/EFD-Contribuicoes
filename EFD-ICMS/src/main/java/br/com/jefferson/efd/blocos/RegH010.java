
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
@Table(name = "reg_h010")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegH010.findAll", query = "SELECT r FROM RegH010 r"),
    @NamedQuery(name = "RegH010.findById", query = "SELECT r FROM RegH010 r WHERE r.id = :id"),
    @NamedQuery(name = "RegH010.findByIdPai", query = "SELECT r FROM RegH010 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegH010.findByLinha", query = "SELECT r FROM RegH010 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegH010.findByHash", query = "SELECT r FROM RegH010 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegH010.findByReg", query = "SELECT r FROM RegH010 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegH010.findByCodItem", query = "SELECT r FROM RegH010 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegH010.findByUnid", query = "SELECT r FROM RegH010 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegH010.findByQtd", query = "SELECT r FROM RegH010 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegH010.findByVlUnit", query = "SELECT r FROM RegH010 r WHERE r.vlUnit = :vlUnit"),
    @NamedQuery(name = "RegH010.findByVlItem", query = "SELECT r FROM RegH010 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegH010.findByIndProp", query = "SELECT r FROM RegH010 r WHERE r.indProp = :indProp"),
    @NamedQuery(name = "RegH010.findByCodPart", query = "SELECT r FROM RegH010 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegH010.findByTxtCompl", query = "SELECT r FROM RegH010 r WHERE r.txtCompl = :txtCompl"),
    @NamedQuery(name = "RegH010.findByCodCta", query = "SELECT r FROM RegH010 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegH010.findByVlItemIr", query = "SELECT r FROM RegH010 r WHERE r.vlItemIr = :vlItemIr")})
public class RegH010 implements Serializable {

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
    @Column(name = "COD_ITEM")
    private String codItem;
    @Column(name = "UNID")
    private String unid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Column(name = "VL_UNIT")
    private BigDecimal vlUnit;
    @Column(name = "VL_ITEM")
    private BigDecimal vlItem;
    @Column(name = "IND_PROP")
    private String indProp;
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "TXT_COMPL")
    private String txtCompl;
    @Column(name = "COD_CTA")
    private String codCta;
    @Column(name = "VL_ITEM_IR")
    private BigDecimal vlItemIr;

    public RegH010() {
    }

    public RegH010(Long id) {
        this.id = id;
    }

    public RegH010(Long id, long idPai, long linha, long hash) {
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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getVlUnit() {
        return vlUnit;
    }

    public void setVlUnit(BigDecimal vlUnit) {
        this.vlUnit = vlUnit;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public String getIndProp() {
        return indProp;
    }

    public void setIndProp(String indProp) {
        this.indProp = indProp;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public BigDecimal getVlItemIr() {
        return vlItemIr;
    }

    public void setVlItemIr(BigDecimal vlItemIr) {
        this.vlItemIr = vlItemIr;
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
        if (!(object instanceof RegH010)) {
            return false;
        }
        RegH010 other = (RegH010) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegH010[ id=" + id + " ]";
    }

}
