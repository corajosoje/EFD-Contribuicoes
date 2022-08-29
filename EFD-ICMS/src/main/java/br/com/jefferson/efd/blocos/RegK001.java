
package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_k001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK001.findAll", query = "SELECT r FROM RegK001 r"),
    @NamedQuery(name = "RegK001.findById", query = "SELECT r FROM RegK001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK001.findByIdPai", query = "SELECT r FROM RegK001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK001.findByLinha", query = "SELECT r FROM RegK001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK001.findByHash", query = "SELECT r FROM RegK001 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK001.findByReg", query = "SELECT r FROM RegK001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK001.findByIndMov", query = "SELECT r FROM RegK001 r WHERE r.indMov = :indMov")})
public class RegK001 implements Serializable {

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
    @Column(name = "IND_MOV")
    private String indMov;

    public RegK001() {
    }

    public RegK001(Long id) {
        this.id = id;
    }

    public RegK001(Long id, long idPai, long linha, String hash) {
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
        if (!(object instanceof RegK001)) {
            return false;
        }
        RegK001 other = (RegK001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK001[ id=" + id + " ]";
    }

}
