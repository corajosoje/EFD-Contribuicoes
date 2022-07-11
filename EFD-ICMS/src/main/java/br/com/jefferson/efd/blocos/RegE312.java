
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
@Table(name = "reg_e312")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE312.findAll", query = "SELECT r FROM RegE312 r"),
    @NamedQuery(name = "RegE312.findById", query = "SELECT r FROM RegE312 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE312.findByIdPai", query = "SELECT r FROM RegE312 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE312.findByLinha", query = "SELECT r FROM RegE312 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE312.findByHash", query = "SELECT r FROM RegE312 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE312.findByReg", query = "SELECT r FROM RegE312 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE312.findByNumDa", query = "SELECT r FROM RegE312 r WHERE r.numDa = :numDa"),
    @NamedQuery(name = "RegE312.findByNumProc", query = "SELECT r FROM RegE312 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "RegE312.findByIndProc", query = "SELECT r FROM RegE312 r WHERE r.indProc = :indProc"),
    @NamedQuery(name = "RegE312.findByProc", query = "SELECT r FROM RegE312 r WHERE r.proc = :proc"),
    @NamedQuery(name = "RegE312.findByTxtCompl", query = "SELECT r FROM RegE312 r WHERE r.txtCompl = :txtCompl")})
public class RegE312 implements Serializable {

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
    @Column(name = "NUM_DA")
    private String numDa;
    @Column(name = "NUM_PROC")
    private String numProc;
    @Column(name = "IND_PROC")
    private String indProc;
    @Column(name = "PROC")
    private String proc;
    @Column(name = "TXT_COMPL")
    private String txtCompl;

    public RegE312() {
    }

    public RegE312(Long id) {
        this.id = id;
    }

    public RegE312(Long id, long idPai, long linha, long hash) {
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

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
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

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
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
        if (!(object instanceof RegE312)) {
            return false;
        }
        RegE312 other = (RegE312) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE312[ id=" + id + " ]";
    }

}
