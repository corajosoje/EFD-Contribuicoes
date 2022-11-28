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
@Table(name = "reg_c425")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC425.findAll", query = "SELECT r FROM RegC425 r"),
    @NamedQuery(name = "RegC425.findById", query = "SELECT r FROM RegC425 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC425.findByIdPai", query = "SELECT r FROM RegC425 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC425.findByLinha", query = "SELECT r FROM RegC425 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC425.findByHash", query = "SELECT r FROM RegC425 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC425.findByReg", query = "SELECT r FROM RegC425 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC425.findByCodItem", query = "SELECT r FROM RegC425 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC425.findByQtd", query = "SELECT r FROM RegC425 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC425.findByUnid", query = "SELECT r FROM RegC425 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC425.findByVlItem", query = "SELECT r FROM RegC425 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC425.findByVlPis", query = "SELECT r FROM RegC425 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC425.findByVlCofins", query = "SELECT r FROM RegC425 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 5)
public class RegC425 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC420 idPai;

    public RegC420 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC420) idPai;
    }

    public RegC425() {
    }

    public RegC425(Long id) {
        this.id = id;
    }

    public RegC425(Long id, RegC420 idPai, long linha, String hash) {
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
    private List<RegC430> regC430;

    public List<RegC430> getRegC430() {
        return regC430;
    }

    public void setRegC430(List<RegC430> regC430) {
        this.regC430 = regC430;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ITEM")
    private BigDecimal vlItem;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;

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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
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
        if (!(object instanceof RegC425)) {
            return false;
        }
        RegC425 other = (RegC425) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC425[ id=" + id + " ]";
    }

}
