package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
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
@Table(name = "reg_d695")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD695.findAll", query = "SELECT r FROM RegD695 r"),
    @NamedQuery(name = "RegD695.findById", query = "SELECT r FROM RegD695 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD695.findByIdPai", query = "SELECT r FROM RegD695 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD695.findByLinha", query = "SELECT r FROM RegD695 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD695.findByHash", query = "SELECT r FROM RegD695 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD695.findByReg", query = "SELECT r FROM RegD695 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD695.findByCodMod", query = "SELECT r FROM RegD695 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD695.findBySer", query = "SELECT r FROM RegD695 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD695.findByNroOrdIni", query = "SELECT r FROM RegD695 r WHERE r.nroOrdIni = :nroOrdIni"),
    @NamedQuery(name = "RegD695.findByNroOrdFin", query = "SELECT r FROM RegD695 r WHERE r.nroOrdFin = :nroOrdFin"),
    @NamedQuery(name = "RegD695.findByDtDocIni", query = "SELECT r FROM RegD695 r WHERE r.dtDocIni = :dtDocIni"),
    @NamedQuery(name = "RegD695.findByDtDocFin", query = "SELECT r FROM RegD695 r WHERE r.dtDocFin = :dtDocFin"),
    @NamedQuery(name = "RegD695.findByNomMest", query = "SELECT r FROM RegD695 r WHERE r.nomMest = :nomMest"),
    @NamedQuery(name = "RegD695.findByChvCodDig", query = "SELECT r FROM RegD695 r WHERE r.chvCodDig = :chvCodDig")})
public class RegD695 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "SER")
    private String ser;
    @Column(name = "NRO_ORD_INI")
    private int nroOrdIni;
    @Column(name = "NRO_ORD_FIN")
    private int nroOrdFin;
    @Column(name = "DT_DOC_INI")
    @Temporal(TemporalType.DATE)
    private Date dtDocIni;
    @Column(name = "DT_DOC_FIN")
    @Temporal(TemporalType.DATE)
    private Date dtDocFin;
    @Column(name = "NOM_MEST")
    private String nomMest;
    @Column(name = "CHV_COD_DIG")
    private String chvCodDig;

    public RegD695() {
    }

    public RegD695(Long id) {
        this.id = id;
    }

    public RegD695(Long id, long idPai, long linha, String hash) {
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

    public int getNroOrdIni() {
        return nroOrdIni;
    }

    public void setNroOrdIni(int nroOrdIni) {
        this.nroOrdIni = nroOrdIni;
    }

    public int getNroOrdFin() {
        return nroOrdFin;
    }

    public void setNroOrdFin(int nroOrdFin) {
        this.nroOrdFin = nroOrdFin;
    }

    public Date getDtDocIni() {
        return dtDocIni;
    }

    public void setDtDocIni(Date dtDocIni) {
        this.dtDocIni = dtDocIni;
    }

    public Date getDtDocFin() {
        return dtDocFin;
    }

    public void setDtDocFin(Date dtDocFin) {
        this.dtDocFin = dtDocFin;
    }

    public String getNomMest() {
        return nomMest;
    }

    public void setNomMest(String nomMest) {
        this.nomMest = nomMest;
    }

    public String getChvCodDig() {
        return chvCodDig;
    }

    public void setChvCodDig(String chvCodDig) {
        this.chvCodDig = chvCodDig;
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
        if (!(object instanceof RegD695)) {
            return false;
        }
        RegD695 other = (RegD695) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD695[ id=" + id + " ]";
    }

}
