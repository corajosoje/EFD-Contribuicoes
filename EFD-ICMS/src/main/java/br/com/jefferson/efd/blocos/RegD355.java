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
@Table(name = "reg_d355")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD355.findAll", query = "SELECT r FROM RegD355 r"),
    @NamedQuery(name = "RegD355.findById", query = "SELECT r FROM RegD355 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD355.findByIdPai", query = "SELECT r FROM RegD355 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD355.findByLinha", query = "SELECT r FROM RegD355 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD355.findByHash", query = "SELECT r FROM RegD355 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD355.findByReg", query = "SELECT r FROM RegD355 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD355.findByDtDoc", query = "SELECT r FROM RegD355 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD355.findByCro", query = "SELECT r FROM RegD355 r WHERE r.cro = :cro"),
    @NamedQuery(name = "RegD355.findByCrz", query = "SELECT r FROM RegD355 r WHERE r.crz = :crz"),
    @NamedQuery(name = "RegD355.findByNumCooFin", query = "SELECT r FROM RegD355 r WHERE r.numCooFin = :numCooFin"),
    @NamedQuery(name = "RegD355.findByGtFin", query = "SELECT r FROM RegD355 r WHERE r.gtFin = :gtFin"),
    @NamedQuery(name = "RegD355.findByVlBrt", query = "SELECT r FROM RegD355 r WHERE r.vlBrt = :vlBrt")})
public class RegD355 implements Serializable {

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
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "CRO")
    private int cro;
    @Column(name = "CRZ")
    private int crz;
    @Column(name = "NUM_COO_FIN")
    private int numCooFin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GT_FIN")
    private BigDecimal gtFin;
    @Column(name = "VL_BRT")
    private BigDecimal vlBrt;

    public RegD355() {
    }

    public RegD355(Long id) {
        this.id = id;
    }

    public RegD355(Long id, long idPai, long linha, String hash) {
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

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }

    public int getCrz() {
        return crz;
    }

    public void setCrz(int crz) {
        this.crz = crz;
    }

    public int getNumCooFin() {
        return numCooFin;
    }

    public void setNumCooFin(int numCooFin) {
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
        if (!(object instanceof RegD355)) {
            return false;
        }
        RegD355 other = (RegD355) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD355[ id=" + id + " ]";
    }

}
