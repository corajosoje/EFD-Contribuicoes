
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
@Table(name = "reg_c141")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC141.findAll", query = "SELECT r FROM RegC141 r"),
    @NamedQuery(name = "RegC141.findById", query = "SELECT r FROM RegC141 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC141.findByIdPai", query = "SELECT r FROM RegC141 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC141.findByLinha", query = "SELECT r FROM RegC141 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC141.findByHash", query = "SELECT r FROM RegC141 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC141.findByReg", query = "SELECT r FROM RegC141 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC141.findByNumParc", query = "SELECT r FROM RegC141 r WHERE r.numParc = :numParc"),
    @NamedQuery(name = "RegC141.findByDtVcto", query = "SELECT r FROM RegC141 r WHERE r.dtVcto = :dtVcto"),
    @NamedQuery(name = "RegC141.findByVlParc", query = "SELECT r FROM RegC141 r WHERE r.vlParc = :vlParc")})
public class RegC141 implements Serializable {

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
    @Column(name = "NUM_PARC")
    private String numParc;
    @Column(name = "DT_VCTO")
    @Temporal(TemporalType.DATE)
    private Date dtVcto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_PARC")
    private BigDecimal vlParc;

    public RegC141() {
    }

    public RegC141(Long id) {
        this.id = id;
    }

    public RegC141(Long id, long idPai, long linha, long hash) {
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

    public String getNumParc() {
        return numParc;
    }

    public void setNumParc(String numParc) {
        this.numParc = numParc;
    }

    public Date getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }

    public BigDecimal getVlParc() {
        return vlParc;
    }

    public void setVlParc(BigDecimal vlParc) {
        this.vlParc = vlParc;
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
        if (!(object instanceof RegC141)) {
            return false;
        }
        RegC141 other = (RegC141) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC141[ id=" + id + " ]";
    }

}
