
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
@Table(name = "reg_e311")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE311.findAll", query = "SELECT r FROM RegE311 r"),
    @NamedQuery(name = "RegE311.findById", query = "SELECT r FROM RegE311 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE311.findByIdPai", query = "SELECT r FROM RegE311 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE311.findByLinha", query = "SELECT r FROM RegE311 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE311.findByHash", query = "SELECT r FROM RegE311 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE311.findByReg", query = "SELECT r FROM RegE311 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE311.findByCodAjApur", query = "SELECT r FROM RegE311 r WHERE r.codAjApur = :codAjApur"),
    @NamedQuery(name = "RegE311.findByDescrComplAj", query = "SELECT r FROM RegE311 r WHERE r.descrComplAj = :descrComplAj"),
    @NamedQuery(name = "RegE311.findByVlAjApur", query = "SELECT r FROM RegE311 r WHERE r.vlAjApur = :vlAjApur")})
public class RegE311 implements Serializable {

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
    @Column(name = "COD_AJ_APUR")
    private String codAjApur;
    @Column(name = "DESCR_COMPL_AJ")
    private String descrComplAj;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_AJ_APUR")
    private BigDecimal vlAjApur;

    public RegE311() {
    }

    public RegE311(Long id) {
        this.id = id;
    }

    public RegE311(Long id, long idPai, long linha, String hash) {
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

    public String getCodAjApur() {
        return codAjApur;
    }

    public void setCodAjApur(String codAjApur) {
        this.codAjApur = codAjApur;
    }

    public String getDescrComplAj() {
        return descrComplAj;
    }

    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }

    public BigDecimal getVlAjApur() {
        return vlAjApur;
    }

    public void setVlAjApur(BigDecimal vlAjApur) {
        this.vlAjApur = vlAjApur;
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
        if (!(object instanceof RegE311)) {
            return false;
        }
        RegE311 other = (RegE311) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE311[ id=" + id + " ]";
    }

}
