package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
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
public class Reg1001 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0000 idPai;

    @Override
    public Reg0000 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0000) idPai;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @PrePersist
    @Override
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Override
    public long getLinha() {
        return this.linha;
    }

    @Override
    public void setLinha(long linha) {
        this.linha = linha;
    }
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Override
    public String getHashfile() {
        return this.hashfile;
    }

    @Override
    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1010> reg1010;

    public List<Reg1010> getReg1010() {
        return reg1010;
    }

    public void setReg1010(List<Reg1010> reg1010) {
        this.reg1010 = reg1010;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1020> reg1020;

    public List<Reg1020> getReg1020() {
        return reg1020;
    }

    public void setReg1020(List<Reg1020> reg1020) {
        this.reg1020 = reg1020;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1050> reg1050;

    public List<Reg1050> getReg1050() {
        return reg1050;
    }

    public void setReg1050(List<Reg1050> reg1050) {
        this.reg1050 = reg1050;
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1300> reg1300;

    public List<Reg1300> getReg1300() {
        return reg1300;
    }

    public void setReg1300(List<Reg1300> reg1300) {
        this.reg1300 = reg1300;
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
    private List<Reg1700> reg1700;

    public List<Reg1700> getReg1700() {
        return reg1700;
    }

    public void setReg1700(List<Reg1700> reg1700) {
        this.reg1700 = reg1700;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1800> reg1800;

    public List<Reg1800> getReg1800() {
        return reg1800;
    }

    public void setReg1800(List<Reg1800> reg1800) {
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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Override
    public String getReg() {
        return this.reg;
    }

    @Override
    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "IND_MOV")
    private int indMov;

    public int getIndMov() {
        return this.indMov;
    }

    public void setIndMov(int indMov) {
        this.indMov = indMov;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reg1001 other = (Reg1001) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1001{" + "id=" + id + '}';
    }
}
