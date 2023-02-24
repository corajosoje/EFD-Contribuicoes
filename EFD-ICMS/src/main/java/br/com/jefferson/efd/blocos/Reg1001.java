package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
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
    @NamedQuery(name = "Reg1001.findByHashfile", query = "SELECT r FROM Reg1001 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1001.findByReg", query = "SELECT r FROM Reg1001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1001.findByIndMov", query = "SELECT r FROM Reg1001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class Reg1001 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
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

    public Reg1001() {
    }

    public Reg1001(Long id) {
        this.id = id;
    }

    public Reg1001(Long id, Reg0000 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
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
    @Column(name = "HASHFILE")
    private String hashfile;
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1010 reg1010;

    public Reg1010 getReg1010() {
        return reg1010;
    }

    public void setReg1010(Reg1010 reg1010) {
        this.reg1010 = reg1010;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1100> reg1100;

    public List<Reg1100> getReg1100() {
        return reg1100;
    }

    public void setReg1100(List<Reg1100> reg1100) {
        this.reg1100 = reg1100;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1200> reg1200;

    public List<Reg1200> getReg1200() {
        return reg1200;
    }

    public void setReg1200(List<Reg1200> reg1200) {
        this.reg1200 = reg1200;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1250 reg1250;

    public Reg1250 getReg1250() {
        return reg1250;
    }

    public void setReg1250(Reg1250 reg1250) {
        this.reg1250 = reg1250;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1300> reg1300;

    public List<Reg1300> getReg1300() {
        return reg1300;
    }

    public void setReg1300(List<Reg1300> reg1300) {
        this.reg1300 = reg1300;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1350> reg1350;

    public List<Reg1350> getReg1350() {
        return reg1350;
    }

    public void setReg1350(List<Reg1350> reg1350) {
        this.reg1350 = reg1350;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1390> reg1390;

    public List<Reg1390> getReg1390() {
        return reg1390;
    }

    public void setReg1390(List<Reg1390> reg1390) {
        this.reg1390 = reg1390;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1400> reg1400;

    public List<Reg1400> getReg1400() {
        return reg1400;
    }

    public void setReg1400(List<Reg1400> reg1400) {
        this.reg1400 = reg1400;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1500> reg1500;

    public List<Reg1500> getReg1500() {
        return reg1500;
    }

    public void setReg1500(List<Reg1500> reg1500) {
        this.reg1500 = reg1500;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1600> reg1600;

    public List<Reg1600> getReg1600() {
        return reg1600;
    }

    public void setReg1600(List<Reg1600> reg1600) {
        this.reg1600 = reg1600;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1601> reg1601;

    public List<Reg1601> getReg1601() {
        return reg1601;
    }

    public void setReg1601(List<Reg1601> reg1601) {
        this.reg1601 = reg1601;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1700> reg1700;

    public List<Reg1700> getReg1700() {
        return reg1700;
    }

    public void setReg1700(List<Reg1700> reg1700) {
        this.reg1700 = reg1700;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1800 reg1800;

    public Reg1800 getReg1800() {
        return reg1800;
    }

    public void setReg1800(Reg1800 reg1800) {
        this.reg1800 = reg1800;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1900> reg1900;

    public List<Reg1900> getReg1900() {
        return reg1900;
    }

    public void setReg1900(List<Reg1900> reg1900) {
        this.reg1900 = reg1900;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1960> reg1960;

    public List<Reg1960> getReg1960() {
        return reg1960;
    }

    public void setReg1960(List<Reg1960> reg1960) {
        this.reg1960 = reg1960;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1970> reg1970;

    public List<Reg1970> getReg1970() {
        return reg1970;
    }

    public void setReg1970(List<Reg1970> reg1970) {
        this.reg1970 = reg1970;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1980 reg1980;

    public Reg1980 getReg1980() {
        return reg1980;
    }

    public void setReg1980(Reg1980 reg1980) {
        this.reg1980 = reg1980;
    }
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

    public int getIndMov() {
        return indMov;
    }

    public void setIndMov(int indMov) {
        this.indMov = indMov;
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
