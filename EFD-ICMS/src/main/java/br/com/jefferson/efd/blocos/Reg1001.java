package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1001.findAll", query = "SELECT r FROM Reg1001 r"),
    @NamedQuery(name = "Reg1001.findById", query = "SELECT r FROM Reg1001 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1001.findByIdPai", query = "SELECT r FROM Reg1001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1001.findByLinha", query = "SELECT r FROM Reg1001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1001.findByHash", query = "SELECT r FROM Reg1001 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1001.findByReg", query = "SELECT r FROM Reg1001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1001.findByIndMov", query = "SELECT r FROM Reg1001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class Reg1001 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0000 idPai;

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
    @Column(name = "IND_MOV")
    private String indMov;

    @OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1010 reg1010;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1100> reg1100;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1200> reg1200;
    @OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1250 reg1250;

    public Reg1001() {
    }

    public Reg1001(Long id) {
        this.id = id;
    }

    public Reg1001(Long id, Reg0000 idPai, long linha, String hash) {
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

    public Reg0000 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0000) idPai;
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

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
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
        if (!(object instanceof Reg1001)) {
            return false;
        }
        Reg1001 other = (Reg1001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1001[ id=" + id + " ]";
    }

}
