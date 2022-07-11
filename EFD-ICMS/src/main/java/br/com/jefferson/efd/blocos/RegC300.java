
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
@Table(name = "reg_c300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC300.findAll", query = "SELECT r FROM RegC300 r"),
    @NamedQuery(name = "RegC300.findById", query = "SELECT r FROM RegC300 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC300.findByIdPai", query = "SELECT r FROM RegC300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC300.findByLinha", query = "SELECT r FROM RegC300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC300.findByHash", query = "SELECT r FROM RegC300 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC300.findByReg", query = "SELECT r FROM RegC300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC300.findByCodMod", query = "SELECT r FROM RegC300 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC300.findBySer", query = "SELECT r FROM RegC300 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC300.findBySub", query = "SELECT r FROM RegC300 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegC300.findByNumDocIni", query = "SELECT r FROM RegC300 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "RegC300.findByNumDocFin", query = "SELECT r FROM RegC300 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "RegC300.findByDtDoc", query = "SELECT r FROM RegC300 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC300.findByVlDoc", query = "SELECT r FROM RegC300 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC300.findByVlPis", query = "SELECT r FROM RegC300 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC300.findByVlCofins", query = "SELECT r FROM RegC300 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC300.findByCodCta", query = "SELECT r FROM RegC300 r WHERE r.codCta = :codCta")})
public class RegC300 implements Serializable {

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
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "SER")
    private String ser;
    @Column(name = "SUB")
    private String sub;
    @Column(name = "NUM_DOC_INI")
    private String numDocIni;
    @Column(name = "NUM_DOC_FIN")
    private String numDocFin;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "COD_CTA")
    private String codCta;

    public RegC300() {
    }

    public RegC300(Long id) {
        this.id = id;
    }

    public RegC300(Long id, long idPai, long linha, long hash) {
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

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(String numDocIni) {
        this.numDocIni = numDocIni;
    }

    public String getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(String numDocFin) {
        this.numDocFin = numDocFin;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
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
        if (!(object instanceof RegC300)) {
            return false;
        }
        RegC300 other = (RegC300) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC300[ id=" + id + " ]";
    }

}
