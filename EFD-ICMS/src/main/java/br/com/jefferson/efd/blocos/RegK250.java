
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
@Table(name = "reg_k250")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK250.findAll", query = "SELECT r FROM RegK250 r"),
    @NamedQuery(name = "RegK250.findById", query = "SELECT r FROM RegK250 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK250.findByIdPai", query = "SELECT r FROM RegK250 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK250.findByLinha", query = "SELECT r FROM RegK250 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK250.findByHash", query = "SELECT r FROM RegK250 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK250.findByReg", query = "SELECT r FROM RegK250 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK250.findByDtProd", query = "SELECT r FROM RegK250 r WHERE r.dtProd = :dtProd"),
    @NamedQuery(name = "RegK250.findByCodItem", query = "SELECT r FROM RegK250 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK250.findByQtd", query = "SELECT r FROM RegK250 r WHERE r.qtd = :qtd")})
public class RegK250 implements Serializable {

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
    @Column(name = "DT_PROD")
    @Temporal(TemporalType.DATE)
    private Date dtProd;
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD")
    private BigDecimal qtd;

    public RegK250() {
    }

    public RegK250(Long id) {
        this.id = id;
    }

    public RegK250(Long id, long idPai, long linha, long hash) {
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

    public Date getDtProd() {
        return dtProd;
    }

    public void setDtProd(Date dtProd) {
        this.dtProd = dtProd;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
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
        if (!(object instanceof RegK250)) {
            return false;
        }
        RegK250 other = (RegK250) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK250[ id=" + id + " ]";
    }

}
