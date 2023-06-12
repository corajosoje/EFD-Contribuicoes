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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d010")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD010.findAll", query = "SELECT r FROM RegD010 r"),
    @NamedQuery(name = "RegD010.findById", query = "SELECT r FROM RegD010 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD010.findByIdPai", query = "SELECT r FROM RegD010 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD010.findByLinha", query = "SELECT r FROM RegD010 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD010.findByHashfile", query = "SELECT r FROM RegD010 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD010.findByReg", query = "SELECT r FROM RegD010 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD010.findByCnpj", query = "SELECT r FROM RegD010 r WHERE r.cnpj = :cnpj")})
@Registros(nivel = 2)
public class RegD010 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD001 idPai;

    @Override
    public RegD001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegD001) idPai;
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
    private List<RegD100> regD100;

    public List<RegD100> getRegD100() {
        return regD100;
    }

    public void setRegD100(List<RegD100> regD100) {
        this.regD100 = regD100;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD200> regD200;

    public List<RegD200> getRegD200() {
        return regD200;
    }

    public void setRegD200(List<RegD200> regD200) {
        this.regD200 = regD200;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD300> regD300;

    public List<RegD300> getRegD300() {
        return regD300;
    }

    public void setRegD300(List<RegD300> regD300) {
        this.regD300 = regD300;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD350> regD350;

    public List<RegD350> getRegD350() {
        return regD350;
    }

    public void setRegD350(List<RegD350> regD350) {
        this.regD350 = regD350;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD500> regD500;

    public List<RegD500> getRegD500() {
        return regD500;
    }

    public void setRegD500(List<RegD500> regD500) {
        this.regD500 = regD500;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD600> regD600;

    public List<RegD600> getRegD600() {
        return regD600;
    }

    public void setRegD600(List<RegD600> regD600) {
        this.regD600 = regD600;
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
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        final RegD010 other = (RegD010) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegD010{" + "id=" + id + '}';
    }
}
