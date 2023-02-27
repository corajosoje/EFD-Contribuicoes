package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_e312")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE312.findAll", query = "SELECT r FROM RegE312 r"),
    @NamedQuery(name = "RegE312.findById", query = "SELECT r FROM RegE312 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE312.findByIdPai", query = "SELECT r FROM RegE312 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE312.findByLinha", query = "SELECT r FROM RegE312 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE312.findByHashfile", query = "SELECT r FROM RegE312 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE312.findByReg", query = "SELECT r FROM RegE312 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE312.findByNumDa", query = "SELECT r FROM RegE312 r WHERE r.numDa = :numDa"),
    @NamedQuery(name = "RegE312.findByNumProc", query = "SELECT r FROM RegE312 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "RegE312.findByIndProc", query = "SELECT r FROM RegE312 r WHERE r.indProc = :indProc"),
    @NamedQuery(name = "RegE312.findByProc", query = "SELECT r FROM RegE312 r WHERE r.proc = :proc"),
    @NamedQuery(name = "RegE312.findByTxtCompl", query = "SELECT r FROM RegE312 r WHERE r.txtCompl = :txtCompl")})
@Registros(nivel = 5)
public class RegE312 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE311 idPai;

    public RegE311 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE311) idPai;
    }

    public RegE312() {
    }

    public RegE312(String id) {
        this.id = id;
    }

    public RegE312(String id, RegE311 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "NUM_DA")
    private String numDa;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NUM_PROC")
    private String numProc;
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "IND_PROC")
    private int indProc;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "\"PROC\"")
    private String proc;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "TXT_COMPL")
    private String txtCompl;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHashfile() {
        return hashfile;
    }

    public void setHash(String hashfile) {
        this.hashfile = hashfile;
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

    public int getIndProc() {
        return indProc;
    }

    public void setIndProc(int indProc) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
