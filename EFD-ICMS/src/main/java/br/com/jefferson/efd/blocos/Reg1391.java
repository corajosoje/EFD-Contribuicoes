
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
@Table(name = "reg_1391")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1391.findAll", query = "SELECT r FROM Reg1391 r"),
    @NamedQuery(name = "Reg1391.findById", query = "SELECT r FROM Reg1391 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1391.findByIdPai", query = "SELECT r FROM Reg1391 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1391.findByLinha", query = "SELECT r FROM Reg1391 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1391.findByHash", query = "SELECT r FROM Reg1391 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1391.findByReg", query = "SELECT r FROM Reg1391 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1391.findByDtRegistro", query = "SELECT r FROM Reg1391 r WHERE r.dtRegistro = :dtRegistro"),
    @NamedQuery(name = "Reg1391.findByQtd", query = "SELECT r FROM Reg1391 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "Reg1391.findByEstqIni", query = "SELECT r FROM Reg1391 r WHERE r.estqIni = :estqIni"),
    @NamedQuery(name = "Reg1391.findByQtdProduz", query = "SELECT r FROM Reg1391 r WHERE r.qtdProduz = :qtdProduz"),
    @NamedQuery(name = "Reg1391.findByEntAnidHid", query = "SELECT r FROM Reg1391 r WHERE r.entAnidHid = :entAnidHid"),
    @NamedQuery(name = "Reg1391.findByOutrEntr", query = "SELECT r FROM Reg1391 r WHERE r.outrEntr = :outrEntr"),
    @NamedQuery(name = "Reg1391.findByPerda", query = "SELECT r FROM Reg1391 r WHERE r.perda = :perda"),
    @NamedQuery(name = "Reg1391.findByCons", query = "SELECT r FROM Reg1391 r WHERE r.cons = :cons"),
    @NamedQuery(name = "Reg1391.findBySaiAniHid", query = "SELECT r FROM Reg1391 r WHERE r.saiAniHid = :saiAniHid"),
    @NamedQuery(name = "Reg1391.findBySaidas", query = "SELECT r FROM Reg1391 r WHERE r.saidas = :saidas"),
    @NamedQuery(name = "Reg1391.findByEstqFin", query = "SELECT r FROM Reg1391 r WHERE r.estqFin = :estqFin"),
    @NamedQuery(name = "Reg1391.findByEstqIniMel", query = "SELECT r FROM Reg1391 r WHERE r.estqIniMel = :estqIniMel"),
    @NamedQuery(name = "Reg1391.findByProdDiaMel", query = "SELECT r FROM Reg1391 r WHERE r.prodDiaMel = :prodDiaMel"),
    @NamedQuery(name = "Reg1391.findByUtilMel", query = "SELECT r FROM Reg1391 r WHERE r.utilMel = :utilMel"),
    @NamedQuery(name = "Reg1391.findByProdAlcMel", query = "SELECT r FROM Reg1391 r WHERE r.prodAlcMel = :prodAlcMel"),
    @NamedQuery(name = "Reg1391.findByObs", query = "SELECT r FROM Reg1391 r WHERE r.obs = :obs"),
    @NamedQuery(name = "Reg1391.findByCodItem", query = "SELECT r FROM Reg1391 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "Reg1391.findByTpResiduo", query = "SELECT r FROM Reg1391 r WHERE r.tpResiduo = :tpResiduo"),
    @NamedQuery(name = "Reg1391.findByQtdResiduo", query = "SELECT r FROM Reg1391 r WHERE r.qtdResiduo = :qtdResiduo")})
public class Reg1391 implements Serializable {

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
    @Column(name = "DT_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date dtRegistro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Column(name = "ESTQ_INI")
    private BigDecimal estqIni;
    @Column(name = "QTD_PRODUZ")
    private BigDecimal qtdProduz;
    @Column(name = "ENT_ANID_HID")
    private BigDecimal entAnidHid;
    @Column(name = "OUTR_ENTR")
    private BigDecimal outrEntr;
    @Column(name = "PERDA")
    private BigDecimal perda;
    @Column(name = "CONS")
    private BigDecimal cons;
    @Column(name = "SAI_ANI_HID")
    private BigDecimal saiAniHid;
    @Column(name = "SAIDAS")
    private BigDecimal saidas;
    @Column(name = "ESTQ_FIN")
    private BigDecimal estqFin;
    @Column(name = "ESTQ_INI_MEL")
    private BigDecimal estqIniMel;
    @Column(name = "PROD_DIA_MEL")
    private BigDecimal prodDiaMel;
    @Column(name = "UTIL_MEL")
    private BigDecimal utilMel;
    @Column(name = "PROD_ALC_MEL")
    private BigDecimal prodAlcMel;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "COD_ITEM")
    private String codItem;
    @Column(name = "TP_RESIDUO")
    private String tpResiduo;
    @Column(name = "QTD_RESIDUO")
    private BigDecimal qtdResiduo;

    public Reg1391() {
    }

    public Reg1391(Long id) {
        this.id = id;
    }

    public Reg1391(Long id, long idPai, long linha, long hash) {
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

    public Date getDtRegistro() {
        return dtRegistro;
    }

    public void setDtRegistro(Date dtRegistro) {
        this.dtRegistro = dtRegistro;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getEstqIni() {
        return estqIni;
    }

    public void setEstqIni(BigDecimal estqIni) {
        this.estqIni = estqIni;
    }

    public BigDecimal getQtdProduz() {
        return qtdProduz;
    }

    public void setQtdProduz(BigDecimal qtdProduz) {
        this.qtdProduz = qtdProduz;
    }

    public BigDecimal getEntAnidHid() {
        return entAnidHid;
    }

    public void setEntAnidHid(BigDecimal entAnidHid) {
        this.entAnidHid = entAnidHid;
    }

    public BigDecimal getOutrEntr() {
        return outrEntr;
    }

    public void setOutrEntr(BigDecimal outrEntr) {
        this.outrEntr = outrEntr;
    }

    public BigDecimal getPerda() {
        return perda;
    }

    public void setPerda(BigDecimal perda) {
        this.perda = perda;
    }

    public BigDecimal getCons() {
        return cons;
    }

    public void setCons(BigDecimal cons) {
        this.cons = cons;
    }

    public BigDecimal getSaiAniHid() {
        return saiAniHid;
    }

    public void setSaiAniHid(BigDecimal saiAniHid) {
        this.saiAniHid = saiAniHid;
    }

    public BigDecimal getSaidas() {
        return saidas;
    }

    public void setSaidas(BigDecimal saidas) {
        this.saidas = saidas;
    }

    public BigDecimal getEstqFin() {
        return estqFin;
    }

    public void setEstqFin(BigDecimal estqFin) {
        this.estqFin = estqFin;
    }

    public BigDecimal getEstqIniMel() {
        return estqIniMel;
    }

    public void setEstqIniMel(BigDecimal estqIniMel) {
        this.estqIniMel = estqIniMel;
    }

    public BigDecimal getProdDiaMel() {
        return prodDiaMel;
    }

    public void setProdDiaMel(BigDecimal prodDiaMel) {
        this.prodDiaMel = prodDiaMel;
    }

    public BigDecimal getUtilMel() {
        return utilMel;
    }

    public void setUtilMel(BigDecimal utilMel) {
        this.utilMel = utilMel;
    }

    public BigDecimal getProdAlcMel() {
        return prodAlcMel;
    }

    public void setProdAlcMel(BigDecimal prodAlcMel) {
        this.prodAlcMel = prodAlcMel;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getTpResiduo() {
        return tpResiduo;
    }

    public void setTpResiduo(String tpResiduo) {
        this.tpResiduo = tpResiduo;
    }

    public BigDecimal getQtdResiduo() {
        return qtdResiduo;
    }

    public void setQtdResiduo(BigDecimal qtdResiduo) {
        this.qtdResiduo = qtdResiduo;
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
        if (!(object instanceof Reg1391)) {
            return false;
        }
        Reg1391 other = (Reg1391) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1391[ id=" + id + " ]";
    }

}
