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
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD001.findAll", query = "SELECT r FROM RegD001 r"),
    @NamedQuery(name = "RegD001.findById", query = "SELECT r FROM RegD001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD001.findByIdPai", query = "SELECT r FROM RegD001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD001.findByLinha", query = "SELECT r FROM RegD001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD001.findByHashfile", query = "SELECT r FROM RegD001 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD001.findByReg", query = "SELECT r FROM RegD001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD001.findByIndMov", query = "SELECT r FROM RegD001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class RegD001 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0000 idPai;

    public Reg0000 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0000) idPai;
    }

    public RegD001() {
    }

    public RegD001(String id) {
        this.id = id;
    }

    public RegD001(String id, Reg0000 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD100> regD100;

    public List<RegD100> getRegD100() {
        return regD100;
    }

    public void setRegD100(List<RegD100> regD100) {
        this.regD100 = regD100;
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
    private List<RegD400> regD400;

    public List<RegD400> getRegD400() {
        return regD400;
    }

    public void setRegD400(List<RegD400> regD400) {
        this.regD400 = regD400;
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD695> regD695;

    public List<RegD695> getRegD695() {
        return regD695;
    }

    public void setRegD695(List<RegD695> regD695) {
        this.regD695 = regD695;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD700> regD700;

    public List<RegD700> getRegD700() {
        return regD700;
    }

    public void setRegD700(List<RegD700> regD700) {
        this.regD700 = regD700;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD750> regD750;

    public List<RegD750> getRegD750() {
        return regD750;
    }

    public void setRegD750(List<RegD750> regD750) {
        this.regD750 = regD750;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_MOV")
    private String indMov;

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

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
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
        if (!(object instanceof RegD001)) {
            return false;
        }
        RegD001 other = (RegD001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD001[ id=" + id + " ]";
    }

}
