package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_0001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0001.findAll", query = "SELECT r FROM Reg0001 r"),
    @NamedQuery(name = "Reg0001.findById", query = "SELECT r FROM Reg0001 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0001.findByLinha", query = "SELECT r FROM Reg0001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0001.findByHash", query = "SELECT r FROM Reg0001 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0001.findByReg", query = "SELECT r FROM Reg0001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0001.findByIndMov", query = "SELECT r FROM Reg0001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class Reg0001 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0000 idPai;

    public Reg0000 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0000) idPai;
    }

    public Reg0001() {
    }

    public Reg0001(Long id) {
        this.id = id;
    }

    public Reg0001(Long id, Reg0000 idPai, long linha, String hash) {
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
    @Column(name = "IND_MOV")
    private int indMov;

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

    public int getIndMov() {
        return indMov;
    }

    public void setIndMov(int indMov) {
        this.indMov = indMov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0002 reg0002;

    public Reg0002 getReg0002() {
        return reg0002;
    }

    public void setReg0002(Reg0002 reg0002) {
        this.reg0002 = reg0002;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0005 reg0005;

    public Reg0005 getReg0005() {
        return reg0005;
    }

    public void setReg0005(Reg0005 reg0005) {
        this.reg0005 = reg0005;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0015> reg0015;

    public List<Reg0015> getReg0015() {
        return reg0015;
    }

    public void setReg0015(List<Reg0015> reg0015) {
        this.reg0015 = reg0015;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0100 reg0100;

    public Reg0100 getReg0100() {
        return reg0100;
    }

    public void setReg0100(Reg0100 reg0100) {
        this.reg0100 = reg0100;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0150> reg0150;

    public List<Reg0150> getReg0150() {
        return reg0150;
    }

    public void setReg0150(List<Reg0150> reg0150) {
        this.reg0150 = reg0150;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0190> reg0190;

    public List<Reg0190> getReg0190() {
        return reg0190;
    }

    public void setReg0190(List<Reg0190> reg0190) {
        this.reg0190 = reg0190;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0200> reg0200;

    public List<Reg0200> getReg0200() {
        return reg0200;
    }

    public void setReg0200(List<Reg0200> reg0200) {
        this.reg0200 = reg0200;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0300> reg0300;

    public List<Reg0300> getReg0300() {
        return reg0300;
    }

    public void setReg0300(List<Reg0300> reg0300) {
        this.reg0300 = reg0300;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0400> reg0400;

    public List<Reg0400> getReg0400() {
        return reg0400;
    }

    public void setReg0400(List<Reg0400> reg0400) {
        this.reg0400 = reg0400;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0450> reg0450;

    public List<Reg0450> getReg0450() {
        return reg0450;
    }

    public void setReg0450(List<Reg0450> reg0450) {
        this.reg0450 = reg0450;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0460> reg0460;

    public List<Reg0460> getReg0460() {
        return reg0460;
    }

    public void setReg0460(List<Reg0460> reg0460) {
        this.reg0460 = reg0460;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0500> reg0500;

    public List<Reg0500> getReg0500() {
        return reg0500;
    }

    public void setReg0500(List<Reg0500> reg0500) {
        this.reg0500 = reg0500;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0600> reg0600;

    public List<Reg0600> getReg0600() {
        return reg0600;
    }

    public void setReg0600(List<Reg0600> reg0600) {
        this.reg0600 = reg0600;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reg0001)) {
            return false;
        }
        Reg0001 other = (Reg0001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0001[ id=" + id + " ]";
    }

}
