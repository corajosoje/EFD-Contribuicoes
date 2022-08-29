
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
@Table(name = "reg_k235")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK235.findAll", query = "SELECT r FROM RegK235 r"),
    @NamedQuery(name = "RegK235.findById", query = "SELECT r FROM RegK235 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK235.findByIdPai", query = "SELECT r FROM RegK235 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK235.findByLinha", query = "SELECT r FROM RegK235 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK235.findByHash", query = "SELECT r FROM RegK235 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK235.findByReg", query = "SELECT r FROM RegK235 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK235.findByDtSaida", query = "SELECT r FROM RegK235 r WHERE r.dtSaida = :dtSaida"),
    @NamedQuery(name = "RegK235.findByCodItem", query = "SELECT r FROM RegK235 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK235.findByQtd", query = "SELECT r FROM RegK235 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegK235.findByCodInsSubst", query = "SELECT r FROM RegK235 r WHERE r.codInsSubst = :codInsSubst")})
public class RegK235 implements Serializable {

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
    @Column(name = "DT_SAIDA")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Column(name = "COD_INS_SUBST")
    private String codInsSubst;

    public RegK235() {
    }

    public RegK235(Long id) {
        this.id = id;
    }

    public RegK235(Long id, long idPai, long linha, String hash) {
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

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
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
        if (!(object instanceof RegK235)) {
            return false;
        }
        RegK235 other = (RegK235) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK235[ id=" + id + " ]";
    }

}
