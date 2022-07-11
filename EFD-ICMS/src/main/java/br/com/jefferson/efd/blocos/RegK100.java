
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
@Table(name = "reg_k100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK100.findAll", query = "SELECT r FROM RegK100 r"),
    @NamedQuery(name = "RegK100.findById", query = "SELECT r FROM RegK100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK100.findByIdPai", query = "SELECT r FROM RegK100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK100.findByLinha", query = "SELECT r FROM RegK100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK100.findByHash", query = "SELECT r FROM RegK100 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK100.findByReg", query = "SELECT r FROM RegK100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK100.findByDtIni", query = "SELECT r FROM RegK100 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "RegK100.findByDtFin", query = "SELECT r FROM RegK100 r WHERE r.dtFin = :dtFin")})
public class RegK100 implements Serializable {

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
    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    private Date dtIni;
    @Column(name = "DT_FIN")
    @Temporal(TemporalType.DATE)
    private Date dtFin;

    public RegK100() {
    }

    public RegK100(Long id) {
        this.id = id;
    }

    public RegK100(Long id, long idPai, long linha, long hash) {
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

    public Date getDtIni() {
        return dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    public Date getDtFin() {
        return dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
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
        if (!(object instanceof RegK100)) {
            return false;
        }
        RegK100 other = (RegK100) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK100[ id=" + id + " ]";
    }

}
