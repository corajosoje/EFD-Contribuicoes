
package br.com.jefferson.efd.blocos;

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
@Table(name = "reg_c700")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC700.findAll", query = "SELECT r FROM RegC700 r"),
    @NamedQuery(name = "RegC700.findById", query = "SELECT r FROM RegC700 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC700.findByIdPai", query = "SELECT r FROM RegC700 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC700.findByLinha", query = "SELECT r FROM RegC700 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC700.findByHash", query = "SELECT r FROM RegC700 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC700.findByReg", query = "SELECT r FROM RegC700 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC700.findByCodMod", query = "SELECT r FROM RegC700 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC700.findBySer", query = "SELECT r FROM RegC700 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC700.findByNroOrdIni", query = "SELECT r FROM RegC700 r WHERE r.nroOrdIni = :nroOrdIni"),
    @NamedQuery(name = "RegC700.findByNroOrdFin", query = "SELECT r FROM RegC700 r WHERE r.nroOrdFin = :nroOrdFin"),
    @NamedQuery(name = "RegC700.findByDtDocIni", query = "SELECT r FROM RegC700 r WHERE r.dtDocIni = :dtDocIni"),
    @NamedQuery(name = "RegC700.findByDtDocFin", query = "SELECT r FROM RegC700 r WHERE r.dtDocFin = :dtDocFin"),
    @NamedQuery(name = "RegC700.findByNomMest", query = "SELECT r FROM RegC700 r WHERE r.nomMest = :nomMest"),
    @NamedQuery(name = "RegC700.findByChvCodDig", query = "SELECT r FROM RegC700 r WHERE r.chvCodDig = :chvCodDig")})
public class RegC700 implements Serializable {

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
    @Column(name = "NRO_ORD_INI")
    private String nroOrdIni;
    @Column(name = "NRO_ORD_FIN")
    private String nroOrdFin;
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

    public RegC700() {
    }

    public RegC700(Long id) {
        this.id = id;
    }

    public RegC700(Long id, long idPai, long linha, long hash) {
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

    public String getNroOrdIni() {
        return nroOrdIni;
    }

    public void setNroOrdIni(String nroOrdIni) {
        this.nroOrdIni = nroOrdIni;
    }

    public String getNroOrdFin() {
        return nroOrdFin;
    }

    public void setNroOrdFin(String nroOrdFin) {
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
        if (!(object instanceof RegC700)) {
            return false;
        }
        RegC700 other = (RegC700) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC700[ id=" + id + " ]";
    }

}
