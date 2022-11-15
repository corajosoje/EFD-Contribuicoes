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
@Table(name = "reg_b001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB001.findAll", query = "SELECT r FROM RegB001 r"),
    @NamedQuery(name = "RegB001.findById", query = "SELECT r FROM RegB001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB001.findByIdPai", query = "SELECT r FROM RegB001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB001.findByLinha", query = "SELECT r FROM RegB001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB001.findByHash", query = "SELECT r FROM RegB001 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB001.findByReg", query = "SELECT r FROM RegB001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB001.findByIndMov", query = "SELECT r FROM RegB001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class RegB001 implements Serializable {

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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegB020> regB020;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegB030> regB030;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegB350> regB350;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegB420> regB420;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegB440> regB440;

    @OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegB470 regB470;

    @OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegB500 regB500;

    @OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegB990 regB990;

    public RegB001() {
    }

    public RegB001(Long id) {
        this.id = id;
    }

    public RegB001(Long id, Reg0000 idPai, long linha, String hash) {
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

    public List<RegB020> getRegB020() {
        return regB020;
    }

    public void setRegB020(List<RegB020> regB020) {
        this.regB020 = regB020;
    }

    public List<RegB030> getRegB030() {
        return regB030;
    }

    public void setRegB030(List<RegB030> regB030) {
        this.regB030 = regB030;
    }

    public List<RegB350> getRegB350() {
        return regB350;
    }

    public void setRegB350(List<RegB350> regB350) {
        this.regB350 = regB350;
    }

    public List<RegB420> getRegB420() {
        return regB420;
    }

    public void setRegB420(List<RegB420> regB420) {
        this.regB420 = regB420;
    }

    public List<RegB440> getRegB440() {
        return regB440;
    }

    public void setRegB440(List<RegB440> regB440) {
        this.regB440 = regB440;
    }

    public RegB470 getRegB470() {
        return regB470;
    }

    public void setRegB470(RegB470 regB470) {
        this.regB470 = regB470;
    }

    public RegB500 getRegB500() {
        return regB500;
    }

    public void setRegB500(RegB500 regB500) {
        this.regB500 = regB500;
    }

    public RegB990 getRegB990() {
        return regB990;
    }

    public void setRegB990(RegB990 regB990) {
        this.regB990 = regB990;
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
        if (!(object instanceof RegB001)) {
            return false;
        }
        RegB001 other = (RegB001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB001[ id=" + id + " ]";
    }

}
