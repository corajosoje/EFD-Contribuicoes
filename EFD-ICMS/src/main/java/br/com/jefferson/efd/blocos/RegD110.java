package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "reg_d110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD110.findAll", query = "SELECT r FROM RegD110 r"),
    @NamedQuery(name = "RegD110.findById", query = "SELECT r FROM RegD110 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD110.findByIdPai", query = "SELECT r FROM RegD110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD110.findByLinha", query = "SELECT r FROM RegD110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD110.findByHash", query = "SELECT r FROM RegD110 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD110.findByReg", query = "SELECT r FROM RegD110 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD110.findByNumItem", query = "SELECT r FROM RegD110 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegD110.findByCodItem", query = "SELECT r FROM RegD110 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegD110.findByVlServ", query = "SELECT r FROM RegD110 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD110.findByVlOut", query = "SELECT r FROM RegD110 r WHERE r.vlOut = :vlOut")})
@Registros(nivel = 3)
public class RegD110 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD100 idPai;

    public RegD100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD100) idPai;
    }

    public RegD110() {
    }

    public RegD110(Long id) {
        this.id = id;
    }

    public RegD110(Long id, RegD100 idPai, long linha, String hash) {
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
    private List<RegD120> regD120;

    public List<RegD120> getRegD120() {
        return regD120;
    }

    public void setRegD120(List<RegD120> regD120) {
        this.regD120 = regD120;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "NUM_ITEM")
    private int numItem;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_SERV")
    private BigDecimal vlServ;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_OUT")
    private BigDecimal vlOut;

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

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }

    public BigDecimal getVlOut() {
        return vlOut;
    }

    public void setVlOut(BigDecimal vlOut) {
        this.vlOut = vlOut;
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
        if (!(object instanceof RegD110)) {
            return false;
        }
        RegD110 other = (RegD110) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD110[ id=" + id + " ]";
    }

}
