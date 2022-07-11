
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
@Table(name = "reg_c174")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC174.findAll", query = "SELECT r FROM RegC174 r"),
    @NamedQuery(name = "RegC174.findById", query = "SELECT r FROM RegC174 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC174.findByIdPai", query = "SELECT r FROM RegC174 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC174.findByLinha", query = "SELECT r FROM RegC174 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC174.findByHash", query = "SELECT r FROM RegC174 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC174.findByReg", query = "SELECT r FROM RegC174 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC174.findByIndArm", query = "SELECT r FROM RegC174 r WHERE r.indArm = :indArm"),
    @NamedQuery(name = "RegC174.findByNumArm", query = "SELECT r FROM RegC174 r WHERE r.numArm = :numArm"),
    @NamedQuery(name = "RegC174.findByDescrCompl", query = "SELECT r FROM RegC174 r WHERE r.descrCompl = :descrCompl")})
public class RegC174 implements Serializable {

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
    @Column(name = "IND_ARM")
    private String indArm;
    @Column(name = "NUM_ARM")
    private String numArm;
    @Column(name = "DESCR_COMPL")
    private String descrCompl;

    public RegC174() {
    }

    public RegC174(Long id) {
        this.id = id;
    }

    public RegC174(Long id, long idPai, long linha, long hash) {
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

    public String getIndArm() {
        return indArm;
    }

    public void setIndArm(String indArm) {
        this.indArm = indArm;
    }

    public String getNumArm() {
        return numArm;
    }

    public void setNumArm(String numArm) {
        this.numArm = numArm;
    }

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
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
        if (!(object instanceof RegC174)) {
            return false;
        }
        RegC174 other = (RegC174) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC174[ id=" + id + " ]";
    }

}
