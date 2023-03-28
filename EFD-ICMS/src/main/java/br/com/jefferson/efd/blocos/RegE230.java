package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
@Table(name = "reg_e230")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE230.findAll", query = "SELECT r FROM RegE230 r"),
    @NamedQuery(name = "RegE230.findById", query = "SELECT r FROM RegE230 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE230.findByIdPai", query = "SELECT r FROM RegE230 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE230.findByLinha", query = "SELECT r FROM RegE230 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE230.findByHashfile", query = "SELECT r FROM RegE230 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE230.findByReg", query = "SELECT r FROM RegE230 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE230.findByNumDa", query = "SELECT r FROM RegE230 r WHERE r.numDa = :numDa"),
    @NamedQuery(name = "RegE230.findByNumProc", query = "SELECT r FROM RegE230 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "RegE230.findByIndProc", query = "SELECT r FROM RegE230 r WHERE r.indProc = :indProc"),
    @NamedQuery(name = "RegE230.findByProc", query = "SELECT r FROM RegE230 r WHERE r.proc = :proc"),
    @NamedQuery(name = "RegE230.findByTxtCompl", query = "SELECT r FROM RegE230 r WHERE r.txtCompl = :txtCompl")})
@Registros(nivel = 5)
public class RegE230 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE220 idPai;

    public RegE220 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegE220) idPai;
    }

    public RegE230() {
    }

    public RegE230(String id) {
        this.id = id;
    }

    public RegE230(String id, RegE220 idPai, long linha, String hashfile) {
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
    @Column(name = "PROCE")
    private String proce;
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

    public String getProce() {
        return proce;
    }

    public void setProce(String proce) {
        this.proce = proce;
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
        if (!(object instanceof RegE230)) {
            return false;
        }
        RegE230 other = (RegE230) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE230[ id=" + id + " ]";
    }

}
