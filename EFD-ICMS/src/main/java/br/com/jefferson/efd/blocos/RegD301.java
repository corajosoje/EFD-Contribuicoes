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
@Table(name = "reg_d301")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD301.findAll", query = "SELECT r FROM RegD301 r"),
    @NamedQuery(name = "RegD301.findById", query = "SELECT r FROM RegD301 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD301.findByIdPai", query = "SELECT r FROM RegD301 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD301.findByLinha", query = "SELECT r FROM RegD301 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD301.findByHash", query = "SELECT r FROM RegD301 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD301.findByReg", query = "SELECT r FROM RegD301 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD301.findByNumDocCanc", query = "SELECT r FROM RegD301 r WHERE r.numDocCanc = :numDocCanc")})
public class RegD301 implements Serializable {

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
    @Column(name = "NUM_DOC_CANC")
    private int numDocCanc;

    public RegD301() {
    }

    public RegD301(Long id) {
        this.id = id;
    }

    public RegD301(Long id, long idPai, long linha, String hash) {
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

    public int getNumDocCanc() {
        return numDocCanc;
    }

    public void setNumDocCanc(int numDocCanc) {
        this.numDocCanc = numDocCanc;
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
        if (!(object instanceof RegD301)) {
            return false;
        }
        RegD301 other = (RegD301) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD301[ id=" + id + " ]";
    }

}
