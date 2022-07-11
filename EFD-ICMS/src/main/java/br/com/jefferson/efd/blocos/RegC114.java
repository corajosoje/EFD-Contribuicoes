
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
@Table(name = "reg_c114")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC114.findAll", query = "SELECT r FROM RegC114 r"),
    @NamedQuery(name = "RegC114.findById", query = "SELECT r FROM RegC114 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC114.findByIdPai", query = "SELECT r FROM RegC114 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC114.findByLinha", query = "SELECT r FROM RegC114 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC114.findByHash", query = "SELECT r FROM RegC114 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC114.findByReg", query = "SELECT r FROM RegC114 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC114.findByCodMod", query = "SELECT r FROM RegC114 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC114.findByEcfFab", query = "SELECT r FROM RegC114 r WHERE r.ecfFab = :ecfFab"),
    @NamedQuery(name = "RegC114.findByEcfCx", query = "SELECT r FROM RegC114 r WHERE r.ecfCx = :ecfCx"),
    @NamedQuery(name = "RegC114.findByNumDoc", query = "SELECT r FROM RegC114 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC114.findByDtDoc", query = "SELECT r FROM RegC114 r WHERE r.dtDoc = :dtDoc")})
public class RegC114 implements Serializable {

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
    @Column(name = "ECF_FAB")
    private String ecfFab;
    @Column(name = "ECF_CX")
    private String ecfCx;
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;

    public RegC114() {
    }

    public RegC114(Long id) {
        this.id = id;
    }

    public RegC114(Long id, long idPai, long linha, long hash) {
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

    public String getEcfFab() {
        return ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }

    public String getEcfCx() {
        return ecfCx;
    }

    public void setEcfCx(String ecfCx) {
        this.ecfCx = ecfCx;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
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
        if (!(object instanceof RegC114)) {
            return false;
        }
        RegC114 other = (RegC114) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC114[ id=" + id + " ]";
    }

}
