package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d170")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD170.findAll", query = "SELECT r FROM RegD170 r"),
    @NamedQuery(name = "RegD170.findById", query = "SELECT r FROM RegD170 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD170.findByIdPai", query = "SELECT r FROM RegD170 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD170.findByLinha", query = "SELECT r FROM RegD170 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD170.findByHashfile", query = "SELECT r FROM RegD170 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 3)
public class RegD170 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD100 idPai;

    public RegD100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD100) idPai;
    }

    public RegD170() {
    }

    public RegD170(String id) {
        this.id = id;
    }

    public RegD170(String id, RegD100 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_PART_CONSG")
    private String codPartConsg;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_PART_RED")
    private String codPartRed;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "OTM")
    private String otm;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "IND_NAT_FRT")
    private String indNatFrt;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_LIQ_FRT", precision = 15, scale = 6)
    private BigDecimal vlLiqFrt;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_GRIS", precision = 15, scale = 6)
    private BigDecimal vlGris;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_PDG", precision = 15, scale = 6)
    private BigDecimal vlPdg;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_OUT", precision = 15, scale = 6)
    private BigDecimal vlOut;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_FRT", precision = 15, scale = 6)
    private BigDecimal vlFrt;
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "VEIC_ID")
    private String veicId;
    @Campos(posicao = 14, tipo = 'C')
    @Column(name = "UF_ID")
    private String ufId;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHashfile() {
        return hashfile;
    }

    public void setHash(String hashfile) {
        this.hashfile = hashfile;
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
