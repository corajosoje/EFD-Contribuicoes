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
@Table(name = "reg_d365")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD365.findAll", query = "SELECT r FROM RegD365 r"),
    @NamedQuery(name = "RegD365.findById", query = "SELECT r FROM RegD365 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD365.findByIdPai", query = "SELECT r FROM RegD365 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD365.findByLinha", query = "SELECT r FROM RegD365 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD365.findByHash", query = "SELECT r FROM RegD365 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD365.findByReg", query = "SELECT r FROM RegD365 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD365.findByCodTotPar", query = "SELECT r FROM RegD365 r WHERE r.codTotPar = :codTotPar"),
    @NamedQuery(name = "RegD365.findByVlrAcumTot", query = "SELECT r FROM RegD365 r WHERE r.vlrAcumTot = :vlrAcumTot"),
    @NamedQuery(name = "RegD365.findByNrTot", query = "SELECT r FROM RegD365 r WHERE r.nrTot = :nrTot"),
    @NamedQuery(name = "RegD365.findByDescrNrTot", query = "SELECT r FROM RegD365 r WHERE r.descrNrTot = :descrNrTot")})
public class RegD365 implements Serializable {

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
    @Column(name = "COD_TOT_PAR")
    private String codTotPar;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLR_ACUM_TOT")
    private BigDecimal vlrAcumTot;
    @Column(name = "NR_TOT")
    private int nrTot;
    @Column(name = "DESCR_NR_TOT")
    private String descrNrTot;

    public RegD365() {
    }

    public RegD365(Long id) {
        this.id = id;
    }

    public RegD365(Long id, long idPai, long linha, String hash) {
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

    public String getCodTotPar() {
        return codTotPar;
    }

    public void setCodTotPar(String codTotPar) {
        this.codTotPar = codTotPar;
    }

    public BigDecimal getVlrAcumTot() {
        return vlrAcumTot;
    }

    public void setVlrAcumTot(BigDecimal vlrAcumTot) {
        this.vlrAcumTot = vlrAcumTot;
    }

    public int getNrTot() {
        return nrTot;
    }

    public void setNrTot(int nrTot) {
        this.nrTot = nrTot;
    }

    public String getDescrNrTot() {
        return descrNrTot;
    }

    public void setDescrNrTot(String descrNrTot) {
        this.descrNrTot = descrNrTot;
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
        if (!(object instanceof RegD365)) {
            return false;
        }
        RegD365 other = (RegD365) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD365[ id=" + id + " ]";
    }

}
