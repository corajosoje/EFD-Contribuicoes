
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
@Table(name = "reg_1360")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1360.findAll", query = "SELECT r FROM Reg1360 r"),
    @NamedQuery(name = "Reg1360.findById", query = "SELECT r FROM Reg1360 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1360.findByIdPai", query = "SELECT r FROM Reg1360 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1360.findByLinha", query = "SELECT r FROM Reg1360 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1360.findByHash", query = "SELECT r FROM Reg1360 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1360.findByReg", query = "SELECT r FROM Reg1360 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1360.findByNumLacre", query = "SELECT r FROM Reg1360 r WHERE r.numLacre = :numLacre"),
    @NamedQuery(name = "Reg1360.findByDatAplicacao", query = "SELECT r FROM Reg1360 r WHERE r.datAplicacao = :datAplicacao")})
public class Reg1360 implements Serializable {

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
    @Column(name = "NUM_LACRE")
    private String numLacre;
    @Column(name = "DAT_APLICACAO")
    @Temporal(TemporalType.DATE)
    private Date datAplicacao;

    public Reg1360() {
    }

    public Reg1360(Long id) {
        this.id = id;
    }

    public Reg1360(Long id, long idPai, long linha, long hash) {
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

    public String getNumLacre() {
        return numLacre;
    }

    public void setNumLacre(String numLacre) {
        this.numLacre = numLacre;
    }

    public Date getDatAplicacao() {
        return datAplicacao;
    }

    public void setDatAplicacao(Date datAplicacao) {
        this.datAplicacao = datAplicacao;
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
        if (!(object instanceof Reg1360)) {
            return false;
        }
        Reg1360 other = (Reg1360) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1360[ id=" + id + " ]";
    }

}
