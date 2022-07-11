
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
@Table(name = "reg_c420")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC420.findAll", query = "SELECT r FROM RegC420 r"),
    @NamedQuery(name = "RegC420.findById", query = "SELECT r FROM RegC420 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC420.findByIdPai", query = "SELECT r FROM RegC420 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC420.findByLinha", query = "SELECT r FROM RegC420 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC420.findByHash", query = "SELECT r FROM RegC420 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC420.findByReg", query = "SELECT r FROM RegC420 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC420.findByCodTotPar", query = "SELECT r FROM RegC420 r WHERE r.codTotPar = :codTotPar"),
    @NamedQuery(name = "RegC420.findByVlrAcumTot", query = "SELECT r FROM RegC420 r WHERE r.vlrAcumTot = :vlrAcumTot"),
    @NamedQuery(name = "RegC420.findByNrTot", query = "SELECT r FROM RegC420 r WHERE r.nrTot = :nrTot"),
    @NamedQuery(name = "RegC420.findByDescrNrTot", query = "SELECT r FROM RegC420 r WHERE r.descrNrTot = :descrNrTot")})
public class RegC420 implements Serializable {

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
    @Column(name = "COD_TOT_PAR")
    private String codTotPar;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLR_ACUM_TOT")
    private BigDecimal vlrAcumTot;
    @Column(name = "NR_TOT")
    private String nrTot;
    @Column(name = "DESCR_NR_TOT")
    private String descrNrTot;

    public RegC420() {
    }

    public RegC420(Long id) {
        this.id = id;
    }

    public RegC420(Long id, long idPai, long linha, long hash) {
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

    public String getNrTot() {
        return nrTot;
    }

    public void setNrTot(String nrTot) {
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
        if (!(object instanceof RegC420)) {
            return false;
        }
        RegC420 other = (RegC420) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC420[ id=" + id + " ]";
    }

}
