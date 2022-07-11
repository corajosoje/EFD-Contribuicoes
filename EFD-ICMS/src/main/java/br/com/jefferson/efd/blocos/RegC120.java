
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
@Table(name = "reg_c120")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC120.findAll", query = "SELECT r FROM RegC120 r"),
    @NamedQuery(name = "RegC120.findById", query = "SELECT r FROM RegC120 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC120.findByIdPai", query = "SELECT r FROM RegC120 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC120.findByLinha", query = "SELECT r FROM RegC120 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC120.findByHash", query = "SELECT r FROM RegC120 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC120.findByReg", query = "SELECT r FROM RegC120 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC120.findByCodDocImp", query = "SELECT r FROM RegC120 r WHERE r.codDocImp = :codDocImp"),
    @NamedQuery(name = "RegC120.findByNumDocImp", query = "SELECT r FROM RegC120 r WHERE r.numDocImp = :numDocImp"),
    @NamedQuery(name = "RegC120.findByPisImp", query = "SELECT r FROM RegC120 r WHERE r.pisImp = :pisImp"),
    @NamedQuery(name = "RegC120.findByCofinsImp", query = "SELECT r FROM RegC120 r WHERE r.cofinsImp = :cofinsImp"),
    @NamedQuery(name = "RegC120.findByNumAcdraw", query = "SELECT r FROM RegC120 r WHERE r.numAcdraw = :numAcdraw")})
public class RegC120 implements Serializable {

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
    @Column(name = "COD_DOC_IMP")
    private String codDocImp;
    @Column(name = "NUM_DOC_IMP")
    private String numDocImp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PIS_IMP")
    private BigDecimal pisImp;
    @Column(name = "COFINS_IMP")
    private BigDecimal cofinsImp;
    @Column(name = "NUM_ACDRAW")
    private String numAcdraw;

    public RegC120() {
    }

    public RegC120(Long id) {
        this.id = id;
    }

    public RegC120(Long id, long idPai, long linha, long hash) {
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

    public String getCodDocImp() {
        return codDocImp;
    }

    public void setCodDocImp(String codDocImp) {
        this.codDocImp = codDocImp;
    }

    public String getNumDocImp() {
        return numDocImp;
    }

    public void setNumDocImp(String numDocImp) {
        this.numDocImp = numDocImp;
    }

    public BigDecimal getPisImp() {
        return pisImp;
    }

    public void setPisImp(BigDecimal pisImp) {
        this.pisImp = pisImp;
    }

    public BigDecimal getCofinsImp() {
        return cofinsImp;
    }

    public void setCofinsImp(BigDecimal cofinsImp) {
        this.cofinsImp = cofinsImp;
    }

    public String getNumAcdraw() {
        return numAcdraw;
    }

    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
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
        if (!(object instanceof RegC120)) {
            return false;
        }
        RegC120 other = (RegC120) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC120[ id=" + id + " ]";
    }

}
