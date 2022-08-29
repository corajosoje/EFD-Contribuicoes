
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
@Table(name = "reg_k275")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK275.findAll", query = "SELECT r FROM RegK275 r"),
    @NamedQuery(name = "RegK275.findById", query = "SELECT r FROM RegK275 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK275.findByIdPai", query = "SELECT r FROM RegK275 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK275.findByLinha", query = "SELECT r FROM RegK275 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK275.findByHash", query = "SELECT r FROM RegK275 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK275.findByReg", query = "SELECT r FROM RegK275 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK275.findByCodItem", query = "SELECT r FROM RegK275 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK275.findByQtdCorPos", query = "SELECT r FROM RegK275 r WHERE r.qtdCorPos = :qtdCorPos"),
    @NamedQuery(name = "RegK275.findByQtdCorNeg", query = "SELECT r FROM RegK275 r WHERE r.qtdCorNeg = :qtdCorNeg"),
    @NamedQuery(name = "RegK275.findByCodInsSubst", query = "SELECT r FROM RegK275 r WHERE r.codInsSubst = :codInsSubst")})
public class RegK275 implements Serializable {

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
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_COR_POS")
    private BigDecimal qtdCorPos;
    @Column(name = "QTD_COR_NEG")
    private BigDecimal qtdCorNeg;
    @Column(name = "COD_INS_SUBST")
    private String codInsSubst;

    public RegK275() {
    }

    public RegK275(Long id) {
        this.id = id;
    }

    public RegK275(Long id, long idPai, long linha, String hash) {
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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtdCorPos() {
        return qtdCorPos;
    }

    public void setQtdCorPos(BigDecimal qtdCorPos) {
        this.qtdCorPos = qtdCorPos;
    }

    public BigDecimal getQtdCorNeg() {
        return qtdCorNeg;
    }

    public void setQtdCorNeg(BigDecimal qtdCorNeg) {
        this.qtdCorNeg = qtdCorNeg;
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
        if (!(object instanceof RegK275)) {
            return false;
        }
        RegK275 other = (RegK275) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK275[ id=" + id + " ]";
    }

}
