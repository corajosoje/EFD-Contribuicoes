package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d130")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD130.findAll", query = "SELECT r FROM RegD130 r"),
    @NamedQuery(name = "RegD130.findById", query = "SELECT r FROM RegD130 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD130.findByIdPai", query = "SELECT r FROM RegD130 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD130.findByLinha", query = "SELECT r FROM RegD130 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD130.findByHashfile", query = "SELECT r FROM RegD130 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD130.findByReg", query = "SELECT r FROM RegD130 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD130.findByCodPartConsg", query = "SELECT r FROM RegD130 r WHERE r.codPartConsg = :codPartConsg"),
    @NamedQuery(name = "RegD130.findByCodPartRed", query = "SELECT r FROM RegD130 r WHERE r.codPartRed = :codPartRed"),
    @NamedQuery(name = "RegD130.findByIndFrtRed", query = "SELECT r FROM RegD130 r WHERE r.indFrtRed = :indFrtRed"),
    @NamedQuery(name = "RegD130.findByCodMunOrig", query = "SELECT r FROM RegD130 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD130.findByCodMunDest", query = "SELECT r FROM RegD130 r WHERE r.codMunDest = :codMunDest"),
    @NamedQuery(name = "RegD130.findByVeicId", query = "SELECT r FROM RegD130 r WHERE r.veicId = :veicId"),
    @NamedQuery(name = "RegD130.findByVlLiqFrt", query = "SELECT r FROM RegD130 r WHERE r.vlLiqFrt = :vlLiqFrt"),
    @NamedQuery(name = "RegD130.findByVlSecCat", query = "SELECT r FROM RegD130 r WHERE r.vlSecCat = :vlSecCat"),
    @NamedQuery(name = "RegD130.findByVlDesp", query = "SELECT r FROM RegD130 r WHERE r.vlDesp = :vlDesp"),
    @NamedQuery(name = "RegD130.findByVlPedg", query = "SELECT r FROM RegD130 r WHERE r.vlPedg = :vlPedg"),
    @NamedQuery(name = "RegD130.findByVlOut", query = "SELECT r FROM RegD130 r WHERE r.vlOut = :vlOut"),
    @NamedQuery(name = "RegD130.findByVlFrt", query = "SELECT r FROM RegD130 r WHERE r.vlFrt = :vlFrt"),
    @NamedQuery(name = "RegD130.findByUfId", query = "SELECT r FROM RegD130 r WHERE r.ufId = :ufId")})
@Registros(nivel = 3)
public class RegD130 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD100 idPai;

    public RegD100 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegD100) idPai;
    }

    public RegD130() {
    }

    public RegD130(String id) {
        this.id = id;
    }

    public RegD130(String id, RegD100 idPai, long linha, String hashfile) {
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
    @Column(name = "IND_FRT_RED")
    private String indFrtRed;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "VEIC_ID")
    private String veicId;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_LIQ_FRT", precision = 15, scale = 6)
    private BigDecimal vlLiqFrt;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_SEC_CAT", precision = 15, scale = 6)
    private BigDecimal vlSecCat;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_DESP", precision = 15, scale = 6)
    private BigDecimal vlDesp;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_PEDG", precision = 15, scale = 6)
    private BigDecimal vlPedg;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_OUT", precision = 15, scale = 6)
    private BigDecimal vlOut;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_FRT", precision = 15, scale = 6)
    private BigDecimal vlFrt;
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

    public String getIndFrtRed() {
        return indFrtRed;
    }

    public void setIndFrtRed(String indFrtRed) {
        this.indFrtRed = indFrtRed;
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

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public BigDecimal getVlLiqFrt() {
        return vlLiqFrt;
    }

    public void setVlLiqFrt(BigDecimal vlLiqFrt) {
        this.vlLiqFrt = vlLiqFrt;
    }

    public BigDecimal getVlSecCat() {
        return vlSecCat;
    }

    public void setVlSecCat(BigDecimal vlSecCat) {
        this.vlSecCat = vlSecCat;
    }

    public BigDecimal getVlDesp() {
        return vlDesp;
    }

    public void setVlDesp(BigDecimal vlDesp) {
        this.vlDesp = vlDesp;
    }

    public BigDecimal getVlPedg() {
        return vlPedg;
    }

    public void setVlPedg(BigDecimal vlPedg) {
        this.vlPedg = vlPedg;
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
        if (!(object instanceof RegD130)) {
            return false;
        }
        RegD130 other = (RegD130) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD130[ id=" + id + " ]";
    }

}
