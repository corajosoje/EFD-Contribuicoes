
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
@Table(name = "reg_d170")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD170.findAll", query = "SELECT r FROM RegD170 r"),
    @NamedQuery(name = "RegD170.findById", query = "SELECT r FROM RegD170 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD170.findByIdPai", query = "SELECT r FROM RegD170 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD170.findByLinha", query = "SELECT r FROM RegD170 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD170.findByHash", query = "SELECT r FROM RegD170 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD170.findByReg", query = "SELECT r FROM RegD170 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD170.findByCodPartConsg", query = "SELECT r FROM RegD170 r WHERE r.codPartConsg = :codPartConsg"),
    @NamedQuery(name = "RegD170.findByCodPartRed", query = "SELECT r FROM RegD170 r WHERE r.codPartRed = :codPartRed"),
    @NamedQuery(name = "RegD170.findByCodMunOrig", query = "SELECT r FROM RegD170 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD170.findByCodMunDest", query = "SELECT r FROM RegD170 r WHERE r.codMunDest = :codMunDest"),
    @NamedQuery(name = "RegD170.findByOtm", query = "SELECT r FROM RegD170 r WHERE r.otm = :otm"),
    @NamedQuery(name = "RegD170.findByIndNatFrt", query = "SELECT r FROM RegD170 r WHERE r.indNatFrt = :indNatFrt"),
    @NamedQuery(name = "RegD170.findByVlLiqFrt", query = "SELECT r FROM RegD170 r WHERE r.vlLiqFrt = :vlLiqFrt"),
    @NamedQuery(name = "RegD170.findByVlGris", query = "SELECT r FROM RegD170 r WHERE r.vlGris = :vlGris"),
    @NamedQuery(name = "RegD170.findByVlPdg", query = "SELECT r FROM RegD170 r WHERE r.vlPdg = :vlPdg"),
    @NamedQuery(name = "RegD170.findByVlOut", query = "SELECT r FROM RegD170 r WHERE r.vlOut = :vlOut"),
    @NamedQuery(name = "RegD170.findByVlFrt", query = "SELECT r FROM RegD170 r WHERE r.vlFrt = :vlFrt"),
    @NamedQuery(name = "RegD170.findByVeicId", query = "SELECT r FROM RegD170 r WHERE r.veicId = :veicId"),
    @NamedQuery(name = "RegD170.findByUfId", query = "SELECT r FROM RegD170 r WHERE r.ufId = :ufId")})
public class RegD170 implements Serializable {

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
    @Column(name = "COD_PART_CONSG")
    private String codPartConsg;
    @Column(name = "COD_PART_RED")
    private String codPartRed;
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Column(name = "OTM")
    private String otm;
    @Column(name = "IND_NAT_FRT")
    private String indNatFrt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_LIQ_FRT")
    private BigDecimal vlLiqFrt;
    @Column(name = "VL_GRIS")
    private BigDecimal vlGris;
    @Column(name = "VL_PDG")
    private BigDecimal vlPdg;
    @Column(name = "VL_OUT")
    private BigDecimal vlOut;
    @Column(name = "VL_FRT")
    private BigDecimal vlFrt;
    @Column(name = "VEIC_ID")
    private String veicId;
    @Column(name = "UF_ID")
    private String ufId;

    public RegD170() {
    }

    public RegD170(Long id) {
        this.id = id;
    }

    public RegD170(Long id, long idPai, long linha, long hash) {
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

    public String getCodPartConsg() {
        return codPartConsg;
    }

    public void setCodPartConsg(String codPartConsg) {
        this.codPartConsg = codPartConsg;
    }

    public String getCodPartRed() {
        return codPartRed;
    }

    public void setCodPartRed(String codPartRed) {
        this.codPartRed = codPartRed;
    }

    public String getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public String getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }

    public String getOtm() {
        return otm;
    }

    public void setOtm(String otm) {
        this.otm = otm;
    }

    public String getIndNatFrt() {
        return indNatFrt;
    }

    public void setIndNatFrt(String indNatFrt) {
        this.indNatFrt = indNatFrt;
    }

    public BigDecimal getVlLiqFrt() {
        return vlLiqFrt;
    }

    public void setVlLiqFrt(BigDecimal vlLiqFrt) {
        this.vlLiqFrt = vlLiqFrt;
    }

    public BigDecimal getVlGris() {
        return vlGris;
    }

    public void setVlGris(BigDecimal vlGris) {
        this.vlGris = vlGris;
    }

    public BigDecimal getVlPdg() {
        return vlPdg;
    }

    public void setVlPdg(BigDecimal vlPdg) {
        this.vlPdg = vlPdg;
    }

    public BigDecimal getVlOut() {
        return vlOut;
    }

    public void setVlOut(BigDecimal vlOut) {
        this.vlOut = vlOut;
    }

    public BigDecimal getVlFrt() {
        return vlFrt;
    }

    public void setVlFrt(BigDecimal vlFrt) {
        this.vlFrt = vlFrt;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
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
        if (!(object instanceof RegD170)) {
            return false;
        }
        RegD170 other = (RegD170) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD170[ id=" + id + " ]";
    }

}
