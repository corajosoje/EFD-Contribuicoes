package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
    @NamedQuery(name = "RegD150.findByHashfile", query = "SELECT r FROM RegD150 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 3)
public class RegD150 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD100 idPai;

    public RegD100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD100) idPai;
    }

    public RegD150() {
    }

    public RegD150(Long id) {
        this.id = id;
    }

    public RegD150(Long id, RegD100 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "VEIC_ID")
    private String veicId;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "VIAGEM")
    private int viagem;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "IND_TFA")
    private String indTfa;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_PESO_TX", precision = 15, scale = 6)
    private BigDecimal vlPesoTx;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_TX_TERR", precision = 15, scale = 6)
    private BigDecimal vlTxTerr;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_TX_RED", precision = 15, scale = 6)
    private BigDecimal vlTxRed;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_OUT", precision = 15, scale = 6)
    private BigDecimal vlOut;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_TX_ADV", precision = 15, scale = 6)
    private BigDecimal vlTxAdv;

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

    public int getViagem() {
        return viagem;
    }

    public void setViagem(int viagem) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
