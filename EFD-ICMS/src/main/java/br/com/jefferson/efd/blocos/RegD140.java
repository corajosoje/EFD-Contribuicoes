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
@Table(name = "reg_d140")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD140.findAll", query = "SELECT r FROM RegD140 r"),
    @NamedQuery(name = "RegD140.findById", query = "SELECT r FROM RegD140 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD140.findByIdPai", query = "SELECT r FROM RegD140 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD140.findByLinha", query = "SELECT r FROM RegD140 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD140.findByHashfile", query = "SELECT r FROM RegD140 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD140.findByReg", query = "SELECT r FROM RegD140 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD140.findByCodPartConsg", query = "SELECT r FROM RegD140 r WHERE r.codPartConsg = :codPartConsg"),
    @NamedQuery(name = "RegD140.findByCodMunOrig", query = "SELECT r FROM RegD140 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD140.findByCodMunDest", query = "SELECT r FROM RegD140 r WHERE r.codMunDest = :codMunDest"),
    @NamedQuery(name = "RegD140.findByIndVeic", query = "SELECT r FROM RegD140 r WHERE r.indVeic = :indVeic"),
    @NamedQuery(name = "RegD140.findByVeicId", query = "SELECT r FROM RegD140 r WHERE r.veicId = :veicId"),
    @NamedQuery(name = "RegD140.findByIndNav", query = "SELECT r FROM RegD140 r WHERE r.indNav = :indNav"),
    @NamedQuery(name = "RegD140.findByViagem", query = "SELECT r FROM RegD140 r WHERE r.viagem = :viagem"),
    @NamedQuery(name = "RegD140.findByVlFrtLiq", query = "SELECT r FROM RegD140 r WHERE r.vlFrtLiq = :vlFrtLiq"),
    @NamedQuery(name = "RegD140.findByVlDespPort", query = "SELECT r FROM RegD140 r WHERE r.vlDespPort = :vlDespPort"),
    @NamedQuery(name = "RegD140.findByVlDespCarDesc", query = "SELECT r FROM RegD140 r WHERE r.vlDespCarDesc = :vlDespCarDesc"),
    @NamedQuery(name = "RegD140.findByVlOut", query = "SELECT r FROM RegD140 r WHERE r.vlOut = :vlOut"),
    @NamedQuery(name = "RegD140.findByVlFrtBrt", query = "SELECT r FROM RegD140 r WHERE r.vlFrtBrt = :vlFrtBrt"),
    @NamedQuery(name = "RegD140.findByVlFrtMm", query = "SELECT r FROM RegD140 r WHERE r.vlFrtMm = :vlFrtMm")})
@Registros(nivel = 3)
public class RegD140 implements Serializable {

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

    public RegD140() {
    }

    public RegD140(String id) {
        this.id = id;
    }

    public RegD140(String id, RegD100 idPai, long linha, String hashfile) {
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
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "IND_VEIC")
    private String indVeic;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "VEIC_ID")
    private String veicId;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "IND_NAV")
    private String indNav;
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "VIAGEM")
    private int viagem;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_FRT_LIQ", precision = 15, scale = 6)
    private BigDecimal vlFrtLiq;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_DESP_PORT", precision = 15, scale = 6)
    private BigDecimal vlDespPort;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_DESP_CAR_DESC", precision = 15, scale = 6)
    private BigDecimal vlDespCarDesc;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_OUT", precision = 15, scale = 6)
    private BigDecimal vlOut;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_FRT_BRT", precision = 15, scale = 6)
    private BigDecimal vlFrtBrt;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_FRT_MM", precision = 15, scale = 6)
    private BigDecimal vlFrtMm;

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

    public String getIndVeic() {
        return indVeic;
    }

    public void setIndVeic(String indVeic) {
        this.indVeic = indVeic;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public String getIndNav() {
        return indNav;
    }

    public void setIndNav(String indNav) {
        this.indNav = indNav;
    }

    public int getViagem() {
        return viagem;
    }

    public void setViagem(int viagem) {
        this.viagem = viagem;
    }

    public BigDecimal getVlFrtLiq() {
        return vlFrtLiq;
    }

    public void setVlFrtLiq(BigDecimal vlFrtLiq) {
        this.vlFrtLiq = vlFrtLiq;
    }

    public BigDecimal getVlDespPort() {
        return vlDespPort;
    }

    public void setVlDespPort(BigDecimal vlDespPort) {
        this.vlDespPort = vlDespPort;
    }

    public BigDecimal getVlDespCarDesc() {
        return vlDespCarDesc;
    }

    public void setVlDespCarDesc(BigDecimal vlDespCarDesc) {
        this.vlDespCarDesc = vlDespCarDesc;
    }

    public BigDecimal getVlOut() {
        return vlOut;
    }

    public void setVlOut(BigDecimal vlOut) {
        this.vlOut = vlOut;
    }

    public BigDecimal getVlFrtBrt() {
        return vlFrtBrt;
    }

    public void setVlFrtBrt(BigDecimal vlFrtBrt) {
        this.vlFrtBrt = vlFrtBrt;
    }

    public BigDecimal getVlFrtMm() {
        return vlFrtMm;
    }

    public void setVlFrtMm(BigDecimal vlFrtMm) {
        this.vlFrtMm = vlFrtMm;
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
        if (!(object instanceof RegD140)) {
            return false;
        }
        RegD140 other = (RegD140) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD140[ id=" + id + " ]";
    }

}
