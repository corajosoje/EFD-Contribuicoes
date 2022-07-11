
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
@Table(name = "reg_e530")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE530.findAll", query = "SELECT r FROM RegE530 r"),
    @NamedQuery(name = "RegE530.findById", query = "SELECT r FROM RegE530 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE530.findByIdPai", query = "SELECT r FROM RegE530 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE530.findByLinha", query = "SELECT r FROM RegE530 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE530.findByHash", query = "SELECT r FROM RegE530 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE530.findByReg", query = "SELECT r FROM RegE530 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE530.findByIndAj", query = "SELECT r FROM RegE530 r WHERE r.indAj = :indAj"),
    @NamedQuery(name = "RegE530.findByVlAj", query = "SELECT r FROM RegE530 r WHERE r.vlAj = :vlAj"),
    @NamedQuery(name = "RegE530.findByCodAj", query = "SELECT r FROM RegE530 r WHERE r.codAj = :codAj"),
    @NamedQuery(name = "RegE530.findByIndDoc", query = "SELECT r FROM RegE530 r WHERE r.indDoc = :indDoc"),
    @NamedQuery(name = "RegE530.findByNumDoc", query = "SELECT r FROM RegE530 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegE530.findByDescrAj", query = "SELECT r FROM RegE530 r WHERE r.descrAj = :descrAj")})
public class RegE530 implements Serializable {

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
    @Column(name = "IND_AJ")
    private String indAj;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_AJ")
    private BigDecimal vlAj;
    @Column(name = "COD_AJ")
    private String codAj;
    @Column(name = "IND_DOC")
    private String indDoc;
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "DESCR_AJ")
    private String descrAj;

    public RegE530() {
    }

    public RegE530(Long id) {
        this.id = id;
    }

    public RegE530(Long id, long idPai, long linha, long hash) {
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

    public String getIndAj() {
        return indAj;
    }

    public void setIndAj(String indAj) {
        this.indAj = indAj;
    }

    public BigDecimal getVlAj() {
        return vlAj;
    }

    public void setVlAj(BigDecimal vlAj) {
        this.vlAj = vlAj;
    }

    public String getCodAj() {
        return codAj;
    }

    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }

    public String getIndDoc() {
        return indDoc;
    }

    public void setIndDoc(String indDoc) {
        this.indDoc = indDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getDescrAj() {
        return descrAj;
    }

    public void setDescrAj(String descrAj) {
        this.descrAj = descrAj;
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
        if (!(object instanceof RegE530)) {
            return false;
        }
        RegE530 other = (RegE530) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE530[ id=" + id + " ]";
    }

}
