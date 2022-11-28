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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_d350")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD350.findAll", query = "SELECT r FROM RegD350 r"),
    @NamedQuery(name = "RegD350.findById", query = "SELECT r FROM RegD350 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD350.findByIdPai", query = "SELECT r FROM RegD350 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD350.findByLinha", query = "SELECT r FROM RegD350 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD350.findByHash", query = "SELECT r FROM RegD350 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD350.findByReg", query = "SELECT r FROM RegD350 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD350.findByCodMod", query = "SELECT r FROM RegD350 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD350.findByEcfMod", query = "SELECT r FROM RegD350 r WHERE r.ecfMod = :ecfMod"),
    @NamedQuery(name = "RegD350.findByEcfFab", query = "SELECT r FROM RegD350 r WHERE r.ecfFab = :ecfFab"),
    @NamedQuery(name = "RegD350.findByEcfCx", query = "SELECT r FROM RegD350 r WHERE r.ecfCx = :ecfCx")})
@Registros(nivel = 2)
public class RegD350 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD001 idPai;

    public RegD001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD001) idPai;
    }

    public RegD350() {
    }

    public RegD350(Long id) {
        this.id = id;
    }

    public RegD350(Long id, RegD001 idPai, long linha, String hash) {
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
    private List<RegD355> regD355;

    public List<RegD355> getRegD355() {
        return regD355;
    }

    public void setRegD355(List<RegD355> regD355) {
        this.regD355 = regD355;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "ECF_MOD")
    private String ecfMod;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "ECF_FAB")
    private String ecfFab;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "ECF_CX")
    private int ecfCx;

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

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getEcfMod() {
        return ecfMod;
    }

    public void setEcfMod(String ecfMod) {
        this.ecfMod = ecfMod;
    }

    public String getEcfFab() {
        return ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }

    public int getEcfCx() {
        return ecfCx;
    }

    public void setEcfCx(int ecfCx) {
        this.ecfCx = ecfCx;
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
        if (!(object instanceof RegD350)) {
            return false;
        }
        RegD350 other = (RegD350) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD350[ id=" + id + " ]";
    }

}
