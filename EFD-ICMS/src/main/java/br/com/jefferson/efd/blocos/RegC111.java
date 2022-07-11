
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
@Table(name = "reg_c111")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC111.findAll", query = "SELECT r FROM RegC111 r"),
    @NamedQuery(name = "RegC111.findById", query = "SELECT r FROM RegC111 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC111.findByIdPai", query = "SELECT r FROM RegC111 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC111.findByLinha", query = "SELECT r FROM RegC111 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC111.findByHash", query = "SELECT r FROM RegC111 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC111.findByReg", query = "SELECT r FROM RegC111 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC111.findByNumProc", query = "SELECT r FROM RegC111 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "RegC111.findByIndProc", query = "SELECT r FROM RegC111 r WHERE r.indProc = :indProc")})
public class RegC111 implements Serializable {

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
    @Column(name = "NUM_PROC")
    private String numProc;
    @Column(name = "IND_PROC")
    private String indProc;

    public RegC111() {
    }

    public RegC111(Long id) {
        this.id = id;
    }

    public RegC111(Long id, long idPai, long linha, long hash) {
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

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIndProc() {
        return indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
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
        if (!(object instanceof RegC111)) {
            return false;
        }
        RegC111 other = (RegC111) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC111[ id=" + id + " ]";
    }

}
