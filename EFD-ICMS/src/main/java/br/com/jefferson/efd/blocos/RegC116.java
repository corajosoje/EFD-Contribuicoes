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
@Table(name = "reg_c116")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC116.findAll", query = "SELECT r FROM RegC116 r"),
    @NamedQuery(name = "RegC116.findById", query = "SELECT r FROM RegC116 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC116.findByIdPai", query = "SELECT r FROM RegC116 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC116.findByLinha", query = "SELECT r FROM RegC116 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC116.findByHash", query = "SELECT r FROM RegC116 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC116.findByReg", query = "SELECT r FROM RegC116 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC116.findByCodMod", query = "SELECT r FROM RegC116 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC116.findByNrSat", query = "SELECT r FROM RegC116 r WHERE r.nrSat = :nrSat"),
    @NamedQuery(name = "RegC116.findByChvCfe", query = "SELECT r FROM RegC116 r WHERE r.chvCfe = :chvCfe"),
    @NamedQuery(name = "RegC116.findByNumCfe", query = "SELECT r FROM RegC116 r WHERE r.numCfe = :numCfe"),
    @NamedQuery(name = "RegC116.findByDtDoc", query = "SELECT r FROM RegC116 r WHERE r.dtDoc = :dtDoc")})
public class RegC116 implements Serializable {

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
    @Column(name = "NR_SAT")
    private String nrSat;
    @Column(name = "CHV_CFE")
    private String chvCfe;
    @Column(name = "NUM_CFE")
    private int numCfe;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;

    public RegC116() {
    }

    public RegC116(Long id) {
        this.id = id;
    }

    public RegC116(Long id, long idPai, long linha, String hash) {
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

    public String getNrSat() {
        return nrSat;
    }

    public void setNrSat(String nrSat) {
        this.nrSat = nrSat;
    }

    public String getChvCfe() {
        return chvCfe;
    }

    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }

    public int getNumCfe() {
        return numCfe;
    }

    public void setNumCfe(int numCfe) {
        this.numCfe = numCfe;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
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
        if (!(object instanceof RegC116)) {
            return false;
        }
        RegC116 other = (RegC116) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC116[ id=" + id + " ]";
    }

}
