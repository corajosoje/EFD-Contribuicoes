
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
@Table(name = "reg_0600")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0600.findAll", query = "SELECT r FROM Reg0600 r"),
    @NamedQuery(name = "Reg0600.findById", query = "SELECT r FROM Reg0600 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0600.findByIdPai", query = "SELECT r FROM Reg0600 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0600.findByLinha", query = "SELECT r FROM Reg0600 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0600.findByHash", query = "SELECT r FROM Reg0600 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0600.findByReg", query = "SELECT r FROM Reg0600 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0600.findByDtAlt", query = "SELECT r FROM Reg0600 r WHERE r.dtAlt = :dtAlt"),
    @NamedQuery(name = "Reg0600.findByCodCcus", query = "SELECT r FROM Reg0600 r WHERE r.codCcus = :codCcus"),
    @NamedQuery(name = "Reg0600.findByCcus", query = "SELECT r FROM Reg0600 r WHERE r.ccus = :ccus")})
public class Reg0600 implements Serializable {

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
    @Column(name = "DT_ALT")
    @Temporal(TemporalType.DATE)
    private Date dtAlt;
    @Column(name = "COD_CCUS")
    private String codCcus;
    @Column(name = "CCUS")
    private String ccus;

    public Reg0600() {
    }

    public Reg0600(Long id) {
        this.id = id;
    }

    public Reg0600(Long id, long idPai, long linha, String hash) {
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

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getCcus() {
        return ccus;
    }

    public void setCcus(String ccus) {
        this.ccus = ccus;
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
        if (!(object instanceof Reg0600)) {
            return false;
        }
        Reg0600 other = (Reg0600) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0600[ id=" + id + " ]";
    }

}
