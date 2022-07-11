
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
@Table(name = "reg_e001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE001.findAll", query = "SELECT r FROM RegE001 r"),
    @NamedQuery(name = "RegE001.findById", query = "SELECT r FROM RegE001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE001.findByIdPai", query = "SELECT r FROM RegE001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE001.findByLinha", query = "SELECT r FROM RegE001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE001.findByHash", query = "SELECT r FROM RegE001 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE001.findByReg", query = "SELECT r FROM RegE001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE001.findByIndMov", query = "SELECT r FROM RegE001 r WHERE r.indMov = :indMov")})
public class RegE001 implements Serializable {

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
    @Column(name = "IND_MOV")
    private String indMov;

    public RegE001() {
    }

    public RegE001(Long id) {
        this.id = id;
    }

    public RegE001(Long id, long idPai, long linha, long hash) {
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

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
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
        if (!(object instanceof RegE001)) {
            return false;
        }
        RegE001 other = (RegE001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE001[ id=" + id + " ]";
    }

}
