
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
@Table(name = "reg_c465")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC465.findAll", query = "SELECT r FROM RegC465 r"),
    @NamedQuery(name = "RegC465.findById", query = "SELECT r FROM RegC465 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC465.findByIdPai", query = "SELECT r FROM RegC465 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC465.findByLinha", query = "SELECT r FROM RegC465 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC465.findByHash", query = "SELECT r FROM RegC465 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC465.findByReg", query = "SELECT r FROM RegC465 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC465.findByChvCfe", query = "SELECT r FROM RegC465 r WHERE r.chvCfe = :chvCfe"),
    @NamedQuery(name = "RegC465.findByNumCcf", query = "SELECT r FROM RegC465 r WHERE r.numCcf = :numCcf")})
public class RegC465 implements Serializable {

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
    @Column(name = "CHV_CFE")
    private String chvCfe;
    @Column(name = "NUM_CCF")
    private String numCcf;

    public RegC465() {
    }

    public RegC465(Long id) {
        this.id = id;
    }

    public RegC465(Long id, long idPai, long linha, long hash) {
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

    public String getChvCfe() {
        return chvCfe;
    }

    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }

    public String getNumCcf() {
        return numCcf;
    }

    public void setNumCcf(String numCcf) {
        this.numCcf = numCcf;
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
        if (!(object instanceof RegC465)) {
            return false;
        }
        RegC465 other = (RegC465) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC465[ id=" + id + " ]";
    }

}
