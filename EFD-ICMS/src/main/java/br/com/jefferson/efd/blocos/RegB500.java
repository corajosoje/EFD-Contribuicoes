
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
@Table(name = "reg_b500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB500.findAll", query = "SELECT r FROM RegB500 r"),
    @NamedQuery(name = "RegB500.findById", query = "SELECT r FROM RegB500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB500.findByIdPai", query = "SELECT r FROM RegB500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB500.findByLinha", query = "SELECT r FROM RegB500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB500.findByHash", query = "SELECT r FROM RegB500 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB500.findByReg", query = "SELECT r FROM RegB500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB500.findByVlRec", query = "SELECT r FROM RegB500 r WHERE r.vlRec = :vlRec"),
    @NamedQuery(name = "RegB500.findByQtdProf", query = "SELECT r FROM RegB500 r WHERE r.qtdProf = :qtdProf"),
    @NamedQuery(name = "RegB500.findByVlOr", query = "SELECT r FROM RegB500 r WHERE r.vlOr = :vlOr")})
public class RegB500 implements Serializable {

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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_REC")
    private BigDecimal vlRec;
    @Column(name = "QTD_PROF")
    private String qtdProf;
    @Column(name = "VL_OR")
    private BigDecimal vlOr;

    public RegB500() {
    }

    public RegB500(Long id) {
        this.id = id;
    }

    public RegB500(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getVlRec() {
        return vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }

    public String getQtdProf() {
        return qtdProf;
    }

    public void setQtdProf(String qtdProf) {
        this.qtdProf = qtdProf;
    }

    public BigDecimal getVlOr() {
        return vlOr;
    }

    public void setVlOr(BigDecimal vlOr) {
        this.vlOr = vlOr;
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
        if (!(object instanceof RegB500)) {
            return false;
        }
        RegB500 other = (RegB500) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB500[ id=" + id + " ]";
    }

}
