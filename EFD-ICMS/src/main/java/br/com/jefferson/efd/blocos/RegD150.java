
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
@Table(name = "reg_d150")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD150.findAll", query = "SELECT r FROM RegD150 r"),
    @NamedQuery(name = "RegD150.findById", query = "SELECT r FROM RegD150 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD150.findByIdPai", query = "SELECT r FROM RegD150 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD150.findByLinha", query = "SELECT r FROM RegD150 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD150.findByHash", query = "SELECT r FROM RegD150 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD150.findByReg", query = "SELECT r FROM RegD150 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD150.findByCodMunOrig", query = "SELECT r FROM RegD150 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD150.findByCodMunDest", query = "SELECT r FROM RegD150 r WHERE r.codMunDest = :codMunDest"),
    @NamedQuery(name = "RegD150.findByVeicId", query = "SELECT r FROM RegD150 r WHERE r.veicId = :veicId"),
    @NamedQuery(name = "RegD150.findByViagem", query = "SELECT r FROM RegD150 r WHERE r.viagem = :viagem"),
    @NamedQuery(name = "RegD150.findByIndTfa", query = "SELECT r FROM RegD150 r WHERE r.indTfa = :indTfa"),
    @NamedQuery(name = "RegD150.findByVlPesoTx", query = "SELECT r FROM RegD150 r WHERE r.vlPesoTx = :vlPesoTx"),
    @NamedQuery(name = "RegD150.findByVlTxTerr", query = "SELECT r FROM RegD150 r WHERE r.vlTxTerr = :vlTxTerr"),
    @NamedQuery(name = "RegD150.findByVlTxRed", query = "SELECT r FROM RegD150 r WHERE r.vlTxRed = :vlTxRed"),
    @NamedQuery(name = "RegD150.findByVlOut", query = "SELECT r FROM RegD150 r WHERE r.vlOut = :vlOut"),
    @NamedQuery(name = "RegD150.findByVlTxAdv", query = "SELECT r FROM RegD150 r WHERE r.vlTxAdv = :vlTxAdv")})
public class RegD150 implements Serializable {

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
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Column(name = "VEIC_ID")
    private String veicId;
    @Column(name = "VIAGEM")
    private String viagem;
    @Column(name = "IND_TFA")
    private String indTfa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_PESO_TX")
    private BigDecimal vlPesoTx;
    @Column(name = "VL_TX_TERR")
    private BigDecimal vlTxTerr;
    @Column(name = "VL_TX_RED")
    private BigDecimal vlTxRed;
    @Column(name = "VL_OUT")
    private BigDecimal vlOut;
    @Column(name = "VL_TX_ADV")
    private BigDecimal vlTxAdv;

    public RegD150() {
    }

    public RegD150(Long id) {
        this.id = id;
    }

    public RegD150(Long id, long idPai, long linha, long hash) {
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

    public String getViagem() {
        return viagem;
    }

    public void setViagem(String viagem) {
        this.viagem = viagem;
    }

    public String getIndTfa() {
        return indTfa;
    }

    public void setIndTfa(String indTfa) {
        this.indTfa = indTfa;
    }

    public BigDecimal getVlPesoTx() {
        return vlPesoTx;
    }

    public void setVlPesoTx(BigDecimal vlPesoTx) {
        this.vlPesoTx = vlPesoTx;
    }

    public BigDecimal getVlTxTerr() {
        return vlTxTerr;
    }

    public void setVlTxTerr(BigDecimal vlTxTerr) {
        this.vlTxTerr = vlTxTerr;
    }

    public BigDecimal getVlTxRed() {
        return vlTxRed;
    }

    public void setVlTxRed(BigDecimal vlTxRed) {
        this.vlTxRed = vlTxRed;
    }

    public BigDecimal getVlOut() {
        return vlOut;
    }

    public void setVlOut(BigDecimal vlOut) {
        this.vlOut = vlOut;
    }

    public BigDecimal getVlTxAdv() {
        return vlTxAdv;
    }

    public void setVlTxAdv(BigDecimal vlTxAdv) {
        this.vlTxAdv = vlTxAdv;
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
        if (!(object instanceof RegD150)) {
            return false;
        }
        RegD150 other = (RegD150) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD150[ id=" + id + " ]";
    }

}
