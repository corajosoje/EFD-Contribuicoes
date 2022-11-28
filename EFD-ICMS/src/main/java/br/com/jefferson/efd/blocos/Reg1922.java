package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1922")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1922.findAll", query = "SELECT r FROM Reg1922 r"),
    @NamedQuery(name = "Reg1922.findById", query = "SELECT r FROM Reg1922 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1922.findByIdPai", query = "SELECT r FROM Reg1922 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1922.findByLinha", query = "SELECT r FROM Reg1922 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1922.findByHash", query = "SELECT r FROM Reg1922 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1922.findByReg", query = "SELECT r FROM Reg1922 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1922.findByNumDa", query = "SELECT r FROM Reg1922 r WHERE r.numDa = :numDa"),
    @NamedQuery(name = "Reg1922.findByNumProc", query = "SELECT r FROM Reg1922 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "Reg1922.findByIndProc", query = "SELECT r FROM Reg1922 r WHERE r.indProc = :indProc"),
    @NamedQuery(name = "Reg1922.findByProc", query = "SELECT r FROM Reg1922 r WHERE r.proc = :proc"),
    @NamedQuery(name = "Reg1922.findByTxtCompl", query = "SELECT r FROM Reg1922 r WHERE r.txtCompl = :txtCompl")})
@Registros(nivel = 6)
public class Reg1922 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1921 idPai;

    public Reg1921 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1921) idPai;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "NUM_DA")
    private String numDa;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NUM_PROC")
    private String numProc;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "IND_PROC")
    private String indProc;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "PROC")
    private String proc;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "TXT_COMPL")
    private String txtCompl;

    public Reg1922() {
    }

    public Reg1922(Long id) {
        this.id = id;
    }

    public Reg1922(Long id, Reg1921 idPai, long linha, String hash) {
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
        if (!(object instanceof Reg1922)) {
            return false;
        }
        Reg1922 other = (Reg1922) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1922[ id=" + id + " ]";
    }

}
