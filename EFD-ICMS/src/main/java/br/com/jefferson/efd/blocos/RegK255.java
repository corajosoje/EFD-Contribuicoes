
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
@Table(name = "reg_k255")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK255.findAll", query = "SELECT r FROM RegK255 r"),
    @NamedQuery(name = "RegK255.findById", query = "SELECT r FROM RegK255 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK255.findByIdPai", query = "SELECT r FROM RegK255 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK255.findByLinha", query = "SELECT r FROM RegK255 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK255.findByHash", query = "SELECT r FROM RegK255 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK255.findByReg", query = "SELECT r FROM RegK255 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK255.findByDtCons", query = "SELECT r FROM RegK255 r WHERE r.dtCons = :dtCons"),
    @NamedQuery(name = "RegK255.findByCodItem", query = "SELECT r FROM RegK255 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK255.findByQtd", query = "SELECT r FROM RegK255 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegK255.findByCodInsSubst", query = "SELECT r FROM RegK255 r WHERE r.codInsSubst = :codInsSubst")})
public class RegK255 implements Serializable {

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
    @Column(name = "DT_CONS")
    @Temporal(TemporalType.DATE)
    private Date dtCons;
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Column(name = "COD_INS_SUBST")
    private String codInsSubst;

    public RegK255() {
    }

    public RegK255(Long id) {
        this.id = id;
    }

    public RegK255(Long id, long idPai, long linha, long hash) {
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

    public Date getDtCons() {
        return dtCons;
    }

    public void setDtCons(Date dtCons) {
        this.dtCons = dtCons;
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

    public String getCodInsSubst() {
        return codInsSubst;
    }

    public void setCodInsSubst(String codInsSubst) {
        this.codInsSubst = codInsSubst;
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
        if (!(object instanceof RegK255)) {
            return false;
        }
        RegK255 other = (RegK255) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK255[ id=" + id + " ]";
    }

}
