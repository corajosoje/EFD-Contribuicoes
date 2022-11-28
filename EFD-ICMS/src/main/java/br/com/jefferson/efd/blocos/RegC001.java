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
@Table(name = "reg_c001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC001.findAll", query = "SELECT r FROM RegC001 r"),
    @NamedQuery(name = "RegC001.findById", query = "SELECT r FROM RegC001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC001.findByIdPai", query = "SELECT r FROM RegC001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC001.findByLinha", query = "SELECT r FROM RegC001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC001.findByHash", query = "SELECT r FROM RegC001 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC001.findByReg", query = "SELECT r FROM RegC001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC001.findByIndMov", query = "SELECT r FROM RegC001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class RegC001 implements Serializable {

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

    public RegC001() {
    }

    public RegC001(Long id) {
        this.id = id;
    }

    public RegC001(Long id, Reg0000 idPai, long linha, String hash) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC100> regC100;

    public List<RegC100> getRegC100() {
        return regC100;
    }

    public void setRegC100(List<RegC100> regC100) {
        this.regC100 = regC100;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC300> regC300;

    public List<RegC300> getRegC300() {
        return regC300;
    }

    public void setRegC300(List<RegC300> regC300) {
        this.regC300 = regC300;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC350> regC350;

    public List<RegC350> getRegC350() {
        return regC350;
    }

    public void setRegC350(List<RegC350> regC350) {
        this.regC350 = regC350;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC400> regC400;

    public List<RegC400> getRegC400() {
        return regC400;
    }

    public void setRegC400(List<RegC400> regC400) {
        this.regC400 = regC400;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC495> regC495;

    public List<RegC495> getRegC495() {
        return regC495;
    }

    public void setRegC495(List<RegC495> regC495) {
        this.regC495 = regC495;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC500> regC500;

    public List<RegC500> getRegC500() {
        return regC500;
    }

    public void setRegC500(List<RegC500> regC500) {
        this.regC500 = regC500;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC600> regC600;

    public List<RegC600> getRegC600() {
        return regC600;
    }

    public void setRegC600(List<RegC600> regC600) {
        this.regC600 = regC600;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC700> regC700;

    public List<RegC700> getRegC700() {
        return regC700;
    }

    public void setRegC700(List<RegC700> regC700) {
        this.regC700 = regC700;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC800> regC800;

    public List<RegC800> getRegC800() {
        return regC800;
    }

    public void setRegC800(List<RegC800> regC800) {
        this.regC800 = regC800;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC860> regC860;

    public List<RegC860> getRegC860() {
        return regC860;
    }

    public void setRegC860(List<RegC860> regC860) {
        this.regC860 = regC860;
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
        if (!(object instanceof RegC001)) {
            return false;
        }
        RegC001 other = (RegC001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC001[ id=" + id + " ]";
    }

}
