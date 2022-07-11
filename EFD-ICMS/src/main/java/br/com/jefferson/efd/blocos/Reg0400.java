
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_0400")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0400.findAll", query = "SELECT r FROM Reg0400 r"),
    @NamedQuery(name = "Reg0400.findById", query = "SELECT r FROM Reg0400 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0400.findByIdPai", query = "SELECT r FROM Reg0400 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0400.findByLinha", query = "SELECT r FROM Reg0400 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0400.findByHash", query = "SELECT r FROM Reg0400 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0400.findByReg", query = "SELECT r FROM Reg0400 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0400.findByCodNat", query = "SELECT r FROM Reg0400 r WHERE r.codNat = :codNat"),
    @NamedQuery(name = "Reg0400.findByDescrNat", query = "SELECT r FROM Reg0400 r WHERE r.descrNat = :descrNat")})
public class Reg0400 implements Serializable {

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
    @Column(name = "COD_NAT")
    private String codNat;
    @Column(name = "DESCR_NAT")
    private String descrNat;

    public Reg0400() {
    }

    public Reg0400(Long id) {
        this.id = id;
    }

    public Reg0400(Long id, long idPai, long linha, long hash) {
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

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public String getDescrNat() {
        return descrNat;
    }

    public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
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
        if (!(object instanceof Reg0400)) {
            return false;
        }
        Reg0400 other = (Reg0400) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0400[ id=" + id + " ]";
    }

}
