
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
@Table(name = "reg_c140")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC140.findAll", query = "SELECT r FROM RegC140 r"),
    @NamedQuery(name = "RegC140.findById", query = "SELECT r FROM RegC140 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC140.findByIdPai", query = "SELECT r FROM RegC140 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC140.findByLinha", query = "SELECT r FROM RegC140 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC140.findByHash", query = "SELECT r FROM RegC140 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC140.findByReg", query = "SELECT r FROM RegC140 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC140.findByIndEmit", query = "SELECT r FROM RegC140 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegC140.findByIndTit", query = "SELECT r FROM RegC140 r WHERE r.indTit = :indTit"),
    @NamedQuery(name = "RegC140.findByDescTit", query = "SELECT r FROM RegC140 r WHERE r.descTit = :descTit"),
    @NamedQuery(name = "RegC140.findByNumTit", query = "SELECT r FROM RegC140 r WHERE r.numTit = :numTit"),
    @NamedQuery(name = "RegC140.findByQtdParc", query = "SELECT r FROM RegC140 r WHERE r.qtdParc = :qtdParc"),
    @NamedQuery(name = "RegC140.findByVlTit", query = "SELECT r FROM RegC140 r WHERE r.vlTit = :vlTit")})
public class RegC140 implements Serializable {

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
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Column(name = "IND_TIT")
    private String indTit;
    @Column(name = "DESC_TIT")
    private String descTit;
    @Column(name = "NUM_TIT")
    private String numTit;
    @Column(name = "QTD_PARC")
    private String qtdParc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_TIT")
    private BigDecimal vlTit;

    public RegC140() {
    }

    public RegC140(Long id) {
        this.id = id;
    }

    public RegC140(Long id, long idPai, long linha, long hash) {
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

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getIndTit() {
        return indTit;
    }

    public void setIndTit(String indTit) {
        this.indTit = indTit;
    }

    public String getDescTit() {
        return descTit;
    }

    public void setDescTit(String descTit) {
        this.descTit = descTit;
    }

    public String getNumTit() {
        return numTit;
    }

    public void setNumTit(String numTit) {
        this.numTit = numTit;
    }

    public String getQtdParc() {
        return qtdParc;
    }

    public void setQtdParc(String qtdParc) {
        this.qtdParc = qtdParc;
    }

    public BigDecimal getVlTit() {
        return vlTit;
    }

    public void setVlTit(BigDecimal vlTit) {
        this.vlTit = vlTit;
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
        if (!(object instanceof RegC140)) {
            return false;
        }
        RegC140 other = (RegC140) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC140[ id=" + id + " ]";
    }

}
