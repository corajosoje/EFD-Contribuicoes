package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "reg_c173")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC173.findAll", query = "SELECT r FROM RegC173 r"),
    @NamedQuery(name = "RegC173.findById", query = "SELECT r FROM RegC173 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC173.findByIdPai", query = "SELECT r FROM RegC173 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC173.findByLinha", query = "SELECT r FROM RegC173 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC173.findByHash", query = "SELECT r FROM RegC173 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC173.findByReg", query = "SELECT r FROM RegC173 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC173.findByLoteMed", query = "SELECT r FROM RegC173 r WHERE r.loteMed = :loteMed"),
    @NamedQuery(name = "RegC173.findByQtdItem", query = "SELECT r FROM RegC173 r WHERE r.qtdItem = :qtdItem"),
    @NamedQuery(name = "RegC173.findByDtFab", query = "SELECT r FROM RegC173 r WHERE r.dtFab = :dtFab"),
    @NamedQuery(name = "RegC173.findByDtVal", query = "SELECT r FROM RegC173 r WHERE r.dtVal = :dtVal"),
    @NamedQuery(name = "RegC173.findByIndMed", query = "SELECT r FROM RegC173 r WHERE r.indMed = :indMed"),
    @NamedQuery(name = "RegC173.findByTpProd", query = "SELECT r FROM RegC173 r WHERE r.tpProd = :tpProd"),
    @NamedQuery(name = "RegC173.findByVlTabMax", query = "SELECT r FROM RegC173 r WHERE r.vlTabMax = :vlTabMax")})
@Registros(nivel = 4)
public class RegC173 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC170 idPai;

    public RegC170 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC170) idPai;
    }

    public RegC173() {
    }

    public RegC173(Long id) {
        this.id = id;
    }

    public RegC173(Long id, RegC170 idPai, long linha, String hash) {
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
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "LOTE_MED")
    private String loteMed;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD_ITEM")
    private BigDecimal qtdItem;
    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_FAB")
    @Temporal(TemporalType.DATE)
    private Date dtFab;
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_VAL")
    @Temporal(TemporalType.DATE)
    private Date dtVal;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "IND_MED")
    private String indMed;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "TP_PROD")
    private String tpProd;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_TAB_MAX")
    private BigDecimal vlTabMax;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getLoteMed() {
        return loteMed;
    }

    public void setLoteMed(String loteMed) {
        this.loteMed = loteMed;
    }

    public BigDecimal getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(BigDecimal qtdItem) {
        this.qtdItem = qtdItem;
    }

    public Date getDtFab() {
        return dtFab;
    }

    public void setDtFab(Date dtFab) {
        this.dtFab = dtFab;
    }

    public Date getDtVal() {
        return dtVal;
    }

    public void setDtVal(Date dtVal) {
        this.dtVal = dtVal;
    }

    public String getIndMed() {
        return indMed;
    }

    public void setIndMed(String indMed) {
        this.indMed = indMed;
    }

    public String getTpProd() {
        return tpProd;
    }

    public void setTpProd(String tpProd) {
        this.tpProd = tpProd;
    }

    public BigDecimal getVlTabMax() {
        return vlTabMax;
    }

    public void setVlTabMax(BigDecimal vlTabMax) {
        this.vlTabMax = vlTabMax;
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
        if (!(object instanceof RegC173)) {
            return false;
        }
        RegC173 other = (RegC173) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC173[ id=" + id + " ]";
    }

}
