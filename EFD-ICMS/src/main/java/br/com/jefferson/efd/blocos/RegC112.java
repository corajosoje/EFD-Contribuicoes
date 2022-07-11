
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
@Table(name = "reg_c112")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC112.findAll", query = "SELECT r FROM RegC112 r"),
    @NamedQuery(name = "RegC112.findById", query = "SELECT r FROM RegC112 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC112.findByIdPai", query = "SELECT r FROM RegC112 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC112.findByLinha", query = "SELECT r FROM RegC112 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC112.findByHash", query = "SELECT r FROM RegC112 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC112.findByReg", query = "SELECT r FROM RegC112 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC112.findByCodDa", query = "SELECT r FROM RegC112 r WHERE r.codDa = :codDa"),
    @NamedQuery(name = "RegC112.findByUf", query = "SELECT r FROM RegC112 r WHERE r.uf = :uf"),
    @NamedQuery(name = "RegC112.findByNumDa", query = "SELECT r FROM RegC112 r WHERE r.numDa = :numDa"),
    @NamedQuery(name = "RegC112.findByCodAut", query = "SELECT r FROM RegC112 r WHERE r.codAut = :codAut"),
    @NamedQuery(name = "RegC112.findByVlDa", query = "SELECT r FROM RegC112 r WHERE r.vlDa = :vlDa"),
    @NamedQuery(name = "RegC112.findByDtVcto", query = "SELECT r FROM RegC112 r WHERE r.dtVcto = :dtVcto"),
    @NamedQuery(name = "RegC112.findByDtPgto", query = "SELECT r FROM RegC112 r WHERE r.dtPgto = :dtPgto")})
public class RegC112 implements Serializable {

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
    @Column(name = "COD_DA")
    private String codDa;
    @Column(name = "UF")
    private String uf;
    @Column(name = "NUM_DA")
    private String numDa;
    @Column(name = "COD_AUT")
    private String codAut;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DA")
    private BigDecimal vlDa;
    @Column(name = "DT_VCTO")
    @Temporal(TemporalType.DATE)
    private Date dtVcto;
    @Column(name = "DT_PGTO")
    @Temporal(TemporalType.DATE)
    private Date dtPgto;

    public RegC112() {
    }

    public RegC112(Long id) {
        this.id = id;
    }

    public RegC112(Long id, long idPai, long linha, long hash) {
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

    public String getCodDa() {
        return codDa;
    }

    public void setCodDa(String codDa) {
        this.codDa = codDa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }

    public Date getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }

    public Date getDtPgto() {
        return dtPgto;
    }

    public void setDtPgto(Date dtPgto) {
        this.dtPgto = dtPgto;
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
        if (!(object instanceof RegC112)) {
            return false;
        }
        RegC112 other = (RegC112) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC112[ id=" + id + " ]";
    }

}
