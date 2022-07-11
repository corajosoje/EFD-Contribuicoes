
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
@Table(name = "reg_g140")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegG140.findAll", query = "SELECT r FROM RegG140 r"),
    @NamedQuery(name = "RegG140.findById", query = "SELECT r FROM RegG140 r WHERE r.id = :id"),
    @NamedQuery(name = "RegG140.findByIdPai", query = "SELECT r FROM RegG140 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegG140.findByLinha", query = "SELECT r FROM RegG140 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegG140.findByHash", query = "SELECT r FROM RegG140 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegG140.findByReg", query = "SELECT r FROM RegG140 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegG140.findByNumItem", query = "SELECT r FROM RegG140 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegG140.findByCodItem", query = "SELECT r FROM RegG140 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegG140.findByQtde", query = "SELECT r FROM RegG140 r WHERE r.qtde = :qtde"),
    @NamedQuery(name = "RegG140.findByUnid", query = "SELECT r FROM RegG140 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegG140.findByVlIcmsOpAplicado", query = "SELECT r FROM RegG140 r WHERE r.vlIcmsOpAplicado = :vlIcmsOpAplicado"),
    @NamedQuery(name = "RegG140.findByVlIcmsStAplicado", query = "SELECT r FROM RegG140 r WHERE r.vlIcmsStAplicado = :vlIcmsStAplicado"),
    @NamedQuery(name = "RegG140.findByVlIcmsFrtAplicado", query = "SELECT r FROM RegG140 r WHERE r.vlIcmsFrtAplicado = :vlIcmsFrtAplicado"),
    @NamedQuery(name = "RegG140.findByVlIcmsDifAplicado", query = "SELECT r FROM RegG140 r WHERE r.vlIcmsDifAplicado = :vlIcmsDifAplicado")})
public class RegG140 implements Serializable {

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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTDE")
    private BigDecimal qtde;
    @Column(name = "UNID")
    private String unid;
    @Column(name = "VL_ICMS_OP_APLICADO")
    private BigDecimal vlIcmsOpAplicado;
    @Column(name = "VL_ICMS_ST_APLICADO")
    private BigDecimal vlIcmsStAplicado;
    @Column(name = "VL_ICMS_FRT_APLICADO")
    private BigDecimal vlIcmsFrtAplicado;
    @Column(name = "VL_ICMS_DIF_APLICADO")
    private BigDecimal vlIcmsDifAplicado;

    public RegG140() {
    }

    public RegG140(Long id) {
        this.id = id;
    }

    public RegG140(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getQtde() {
        return qtde;
    }

    public void setQtde(BigDecimal qtde) {
        this.qtde = qtde;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlIcmsOpAplicado() {
        return vlIcmsOpAplicado;
    }

    public void setVlIcmsOpAplicado(BigDecimal vlIcmsOpAplicado) {
        this.vlIcmsOpAplicado = vlIcmsOpAplicado;
    }

    public BigDecimal getVlIcmsStAplicado() {
        return vlIcmsStAplicado;
    }

    public void setVlIcmsStAplicado(BigDecimal vlIcmsStAplicado) {
        this.vlIcmsStAplicado = vlIcmsStAplicado;
    }

    public BigDecimal getVlIcmsFrtAplicado() {
        return vlIcmsFrtAplicado;
    }

    public void setVlIcmsFrtAplicado(BigDecimal vlIcmsFrtAplicado) {
        this.vlIcmsFrtAplicado = vlIcmsFrtAplicado;
    }

    public BigDecimal getVlIcmsDifAplicado() {
        return vlIcmsDifAplicado;
    }

    public void setVlIcmsDifAplicado(BigDecimal vlIcmsDifAplicado) {
        this.vlIcmsDifAplicado = vlIcmsDifAplicado;
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
        if (!(object instanceof RegG140)) {
            return false;
        }
        RegG140 other = (RegG140) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegG140[ id=" + id + " ]";
    }

}
