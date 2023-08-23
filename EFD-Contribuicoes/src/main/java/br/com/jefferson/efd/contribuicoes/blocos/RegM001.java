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
@Table(name = "reg_m001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM001.findAll", query = "SELECT r FROM RegM001 r"),
    @NamedQuery(name = "RegM001.findById", query = "SELECT r FROM RegM001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM001.findByIdPai", query = "SELECT r FROM RegM001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM001.findByLinha", query = "SELECT r FROM RegM001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM001.findByHashfile", query = "SELECT r FROM RegM001 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM001.findByReg", query = "SELECT r FROM RegM001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM001.findByIndMov", query = "SELECT r FROM RegM001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class RegM001 implements Serializable, BlocoSped {

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
    private List<RegM100> regM100;

    public List<RegM100> getRegM100() {
        return regM100;
    }

    public void setRegM100(List<RegM100> regM100) {
        this.regM100 = regM100;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegM200 regM200;

    public RegM200 getRegM200() {
        return regM200;
    }

    public void setRegM200(RegM200 regM200) {
        this.regM200 = regM200;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM300> regM300;

    public List<RegM300> getRegM300() {
        return regM300;
    }

    public void setRegM300(List<RegM300> regM300) {
        this.regM300 = regM300;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegM350 regM350;

    public RegM350 getRegM350() {
        return regM350;
    }

    public void setRegM350(RegM350 regM350) {
        this.regM350 = regM350;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM400> regM400;

    public List<RegM400> getRegM400() {
        return regM400;
    }

    public void setRegM400(List<RegM400> regM400) {
        this.regM400 = regM400;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM500> regM500;

    public List<RegM500> getRegM500() {
        return regM500;
    }

    public void setRegM500(List<RegM500> regM500) {
        this.regM500 = regM500;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegM600 regM600;

    public RegM600 getRegM600() {
        return regM600;
    }

    public void setRegM600(RegM600 regM600) {
        this.regM600 = regM600;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM700> regM700;

    public List<RegM700> getRegM700() {
        return regM700;
    }

    public void setRegM700(List<RegM700> regM700) {
        this.regM700 = regM700;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM800> regM800;

    public List<RegM800> getRegM800() {
        return regM800;
    }

    public void setRegM800(List<RegM800> regM800) {
        this.regM800 = regM800;
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_MOV")
    private String indMov;

    public String getIndMov() {
        return this.indMov;
    }

    public void setIndMov(String indMov) {
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
        final RegM001 other = (RegM001) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM001{" + "id=" + id + '}';
    }
}
