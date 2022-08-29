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
@Table(name = "reg_g130")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegG130.findAll", query = "SELECT r FROM RegG130 r"),
    @NamedQuery(name = "RegG130.findById", query = "SELECT r FROM RegG130 r WHERE r.id = :id"),
    @NamedQuery(name = "RegG130.findByIdPai", query = "SELECT r FROM RegG130 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegG130.findByLinha", query = "SELECT r FROM RegG130 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegG130.findByHash", query = "SELECT r FROM RegG130 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegG130.findByReg", query = "SELECT r FROM RegG130 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegG130.findByIndEmit", query = "SELECT r FROM RegG130 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegG130.findByCodPart", query = "SELECT r FROM RegG130 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegG130.findByCodMod", query = "SELECT r FROM RegG130 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegG130.findBySerie", query = "SELECT r FROM RegG130 r WHERE r.serie = :serie"),
    @NamedQuery(name = "RegG130.findByNumDoc", query = "SELECT r FROM RegG130 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegG130.findByChvNfeCte", query = "SELECT r FROM RegG130 r WHERE r.chvNfeCte = :chvNfeCte"),
    @NamedQuery(name = "RegG130.findByDtDoc", query = "SELECT r FROM RegG130 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegG130.findByNumDa", query = "SELECT r FROM RegG130 r WHERE r.numDa = :numDa")})
public class RegG130 implements Serializable {

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
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Column(name = "CHV_NFE_CTE")
    private String chvNfeCte;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "NUM_DA")
    private String numDa;

    public RegG130() {
    }

    public RegG130(Long id) {
        this.id = id;
    }

    public RegG130(Long id, long idPai, long linha, String hash) {
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

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfeCte() {
        return chvNfeCte;
    }

    public void setChvNfeCte(String chvNfeCte) {
        this.chvNfeCte = chvNfeCte;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
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
        if (!(object instanceof RegG130)) {
            return false;
        }
        RegG130 other = (RegG130) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegG130[ id=" + id + " ]";
    }

}
