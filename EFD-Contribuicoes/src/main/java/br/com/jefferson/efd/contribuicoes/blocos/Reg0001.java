package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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
@Table(name = "reg_0001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0001.findAll", query = "SELECT r FROM Reg0001 r"),
    @NamedQuery(name = "Reg0001.findById", query = "SELECT r FROM Reg0001 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0001.findByIdPai", query = "SELECT r FROM Reg0001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0001.findByLinha", query = "SELECT r FROM Reg0001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0001.findByHashfile", query = "SELECT r FROM Reg0001 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0001.findByReg", query = "SELECT r FROM Reg0001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0001.findByIndMov", query = "SELECT r FROM Reg0001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class Reg0001 implements Serializable, BlocoSped {

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
    private List<Reg0035> reg0035;

    public List<Reg0035> getReg0035() {
        return reg0035;
    }

    public void setReg0035(List<Reg0035> reg0035) {
        this.reg0035 = reg0035;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0100> reg0100;

    public List<Reg0100> getReg0100() {
        return reg0100;
    }

    public void setReg0100(List<Reg0100> reg0100) {
        this.reg0100 = reg0100;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0110 reg0110;

    public Reg0110 getReg0110() {
        return reg0110;
    }

    public void setReg0110(Reg0110 reg0110) {
        this.reg0110 = reg0110;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0120> reg0120;

    public List<Reg0120> getReg0120() {
        return reg0120;
    }

    public void setReg0120(List<Reg0120> reg0120) {
        this.reg0120 = reg0120;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0140> reg0140;

    public List<Reg0140> getReg0140() {
        return reg0140;
    }

    public void setReg0140(List<Reg0140> reg0140) {
        this.reg0140 = reg0140;
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0900 reg0900;

    public Reg0900 getReg0900() {
        return reg0900;
    }

    public void setReg0900(Reg0900 reg0900) {
        this.reg0900 = reg0900;
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
        final Reg0001 other = (Reg0001) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0001{" + "id=" + id + '}';
    }
}
