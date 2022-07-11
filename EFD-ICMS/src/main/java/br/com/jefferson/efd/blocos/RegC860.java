
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
@Table(name = "reg_c860")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC860.findAll", query = "SELECT r FROM RegC860 r"),
    @NamedQuery(name = "RegC860.findById", query = "SELECT r FROM RegC860 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC860.findByIdPai", query = "SELECT r FROM RegC860 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC860.findByLinha", query = "SELECT r FROM RegC860 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC860.findByHash", query = "SELECT r FROM RegC860 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC860.findByReg", query = "SELECT r FROM RegC860 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC860.findByCodMod", query = "SELECT r FROM RegC860 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC860.findByNrSat", query = "SELECT r FROM RegC860 r WHERE r.nrSat = :nrSat"),
    @NamedQuery(name = "RegC860.findByDtDoc", query = "SELECT r FROM RegC860 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC860.findByDocIni", query = "SELECT r FROM RegC860 r WHERE r.docIni = :docIni"),
    @NamedQuery(name = "RegC860.findByDocFim", query = "SELECT r FROM RegC860 r WHERE r.docFim = :docFim")})
public class RegC860 implements Serializable {

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
    @Column(name = "NR_SAT")
    private String nrSat;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "DOC_INI")
    private String docIni;
    @Column(name = "DOC_FIM")
    private String docFim;

    public RegC860() {
    }

    public RegC860(Long id) {
        this.id = id;
    }

    public RegC860(Long id, long idPai, long linha, long hash) {
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

    public String getNrSat() {
        return nrSat;
    }

    public void setNrSat(String nrSat) {
        this.nrSat = nrSat;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getDocIni() {
        return docIni;
    }

    public void setDocIni(String docIni) {
        this.docIni = docIni;
    }

    public String getDocFim() {
        return docFim;
    }

    public void setDocFim(String docFim) {
        this.docFim = docFim;
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
        if (!(object instanceof RegC860)) {
            return false;
        }
        RegC860 other = (RegC860) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC860[ id=" + id + " ]";
    }

}
