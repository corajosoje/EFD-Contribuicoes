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
@Table(name = "reg_1710")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1710.findAll", query = "SELECT r FROM Reg1710 r"),
    @NamedQuery(name = "Reg1710.findById", query = "SELECT r FROM Reg1710 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1710.findByIdPai", query = "SELECT r FROM Reg1710 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1710.findByLinha", query = "SELECT r FROM Reg1710 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1710.findByHash", query = "SELECT r FROM Reg1710 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1710.findByReg", query = "SELECT r FROM Reg1710 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1710.findByNumDocIni", query = "SELECT r FROM Reg1710 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "Reg1710.findByNumDocFin", query = "SELECT r FROM Reg1710 r WHERE r.numDocFin = :numDocFin")})
@Registros(nivel = 3)
public class Reg1710 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1700 idPai;

    public Reg1700 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1700) idPai;
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

    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;

    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;

    public Reg1710() {
    }

    public Reg1710(Long id) {
        this.id = id;
    }

    public Reg1710(Long id, Reg1700 idPai, long linha, String hash) {
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

    public int getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(int numDocIni) {
        this.numDocIni = numDocIni;
    }

    public int getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(int numDocFin) {
        this.numDocFin = numDocFin;
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
        if (!(object instanceof Reg1710)) {
            return false;
        }
        Reg1710 other = (Reg1710) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1710[ id=" + id + " ]";
    }

}
