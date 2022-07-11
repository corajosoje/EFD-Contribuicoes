
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
@Table(name = "reg_k290")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK290.findAll", query = "SELECT r FROM RegK290 r"),
    @NamedQuery(name = "RegK290.findById", query = "SELECT r FROM RegK290 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK290.findByIdPai", query = "SELECT r FROM RegK290 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK290.findByLinha", query = "SELECT r FROM RegK290 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK290.findByHash", query = "SELECT r FROM RegK290 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK290.findByReg", query = "SELECT r FROM RegK290 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK290.findByDtIniOp", query = "SELECT r FROM RegK290 r WHERE r.dtIniOp = :dtIniOp"),
    @NamedQuery(name = "RegK290.findByDtFinOp", query = "SELECT r FROM RegK290 r WHERE r.dtFinOp = :dtFinOp"),
    @NamedQuery(name = "RegK290.findByCodDocOp", query = "SELECT r FROM RegK290 r WHERE r.codDocOp = :codDocOp")})
public class RegK290 implements Serializable {

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
    @Column(name = "DT_INI_OP")
    @Temporal(TemporalType.DATE)
    private Date dtIniOp;
    @Column(name = "DT_FIN_OP")
    @Temporal(TemporalType.DATE)
    private Date dtFinOp;
    @Column(name = "COD_DOC_OP")
    private String codDocOp;

    public RegK290() {
    }

    public RegK290(Long id) {
        this.id = id;
    }

    public RegK290(Long id, long idPai, long linha, long hash) {
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

    public Date getDtIniOp() {
        return dtIniOp;
    }

    public void setDtIniOp(Date dtIniOp) {
        this.dtIniOp = dtIniOp;
    }

    public Date getDtFinOp() {
        return dtFinOp;
    }

    public void setDtFinOp(Date dtFinOp) {
        this.dtFinOp = dtFinOp;
    }

    public String getCodDocOp() {
        return codDocOp;
    }

    public void setCodDocOp(String codDocOp) {
        this.codDocOp = codDocOp;
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
        if (!(object instanceof RegK290)) {
            return false;
        }
        RegK290 other = (RegK290) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK290[ id=" + id + " ]";
    }

}
