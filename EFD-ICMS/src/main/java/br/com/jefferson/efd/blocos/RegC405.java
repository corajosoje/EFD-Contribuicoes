
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
@Table(name = "reg_c405")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC405.findAll", query = "SELECT r FROM RegC405 r"),
    @NamedQuery(name = "RegC405.findById", query = "SELECT r FROM RegC405 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC405.findByIdPai", query = "SELECT r FROM RegC405 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC405.findByLinha", query = "SELECT r FROM RegC405 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC405.findByHash", query = "SELECT r FROM RegC405 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC405.findByReg", query = "SELECT r FROM RegC405 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC405.findByDtDoc", query = "SELECT r FROM RegC405 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC405.findByCro", query = "SELECT r FROM RegC405 r WHERE r.cro = :cro"),
    @NamedQuery(name = "RegC405.findByCrz", query = "SELECT r FROM RegC405 r WHERE r.crz = :crz"),
    @NamedQuery(name = "RegC405.findByNumCooFin", query = "SELECT r FROM RegC405 r WHERE r.numCooFin = :numCooFin"),
    @NamedQuery(name = "RegC405.findByGtFin", query = "SELECT r FROM RegC405 r WHERE r.gtFin = :gtFin"),
    @NamedQuery(name = "RegC405.findByVlBrt", query = "SELECT r FROM RegC405 r WHERE r.vlBrt = :vlBrt")})
public class RegC405 implements Serializable {

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
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "CRO")
    private String cro;
    @Column(name = "CRZ")
    private String crz;
    @Column(name = "NUM_COO_FIN")
    private String numCooFin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GT_FIN")
    private BigDecimal gtFin;
    @Column(name = "VL_BRT")
    private BigDecimal vlBrt;

    public RegC405() {
    }

    public RegC405(Long id) {
        this.id = id;
    }

    public RegC405(Long id, long idPai, long linha, long hash) {
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

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getCrz() {
        return crz;
    }

    public void setCrz(String crz) {
        this.crz = crz;
    }

    public String getNumCooFin() {
        return numCooFin;
    }

    public void setNumCooFin(String numCooFin) {
        this.numCooFin = numCooFin;
    }

    public BigDecimal getGtFin() {
        return gtFin;
    }

    public void setGtFin(BigDecimal gtFin) {
        this.gtFin = gtFin;
    }

    public BigDecimal getVlBrt() {
        return vlBrt;
    }

    public void setVlBrt(BigDecimal vlBrt) {
        this.vlBrt = vlBrt;
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
        if (!(object instanceof RegC405)) {
            return false;
        }
        RegC405 other = (RegC405) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC405[ id=" + id + " ]";
    }

}
