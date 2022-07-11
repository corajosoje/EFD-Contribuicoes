
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
@Table(name = "reg_g001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegG001.findAll", query = "SELECT r FROM RegG001 r"),
    @NamedQuery(name = "RegG001.findById", query = "SELECT r FROM RegG001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegG001.findByIdPai", query = "SELECT r FROM RegG001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegG001.findByLinha", query = "SELECT r FROM RegG001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegG001.findByHash", query = "SELECT r FROM RegG001 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegG001.findByReg", query = "SELECT r FROM RegG001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegG001.findByIndMov", query = "SELECT r FROM RegG001 r WHERE r.indMov = :indMov")})
public class RegG001 implements Serializable {

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

    public RegG001() {
    }

    public RegG001(Long id) {
        this.id = id;
    }

    public RegG001(Long id, long idPai, long linha, long hash) {
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
        if (!(object instanceof RegG001)) {
            return false;
        }
        RegG001 other = (RegG001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegG001[ id=" + id + " ]";
    }

}
