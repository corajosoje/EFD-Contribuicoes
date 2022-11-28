package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_k265")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK265.findAll", query = "SELECT r FROM RegK265 r"),
    @NamedQuery(name = "RegK265.findById", query = "SELECT r FROM RegK265 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK265.findByIdPai", query = "SELECT r FROM RegK265 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK265.findByLinha", query = "SELECT r FROM RegK265 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK265.findByHash", query = "SELECT r FROM RegK265 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK265.findByReg", query = "SELECT r FROM RegK265 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK265.findByCodItem", query = "SELECT r FROM RegK265 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK265.findByQtdCons", query = "SELECT r FROM RegK265 r WHERE r.qtdCons = :qtdCons"),
    @NamedQuery(name = "RegK265.findByQtdRet", query = "SELECT r FROM RegK265 r WHERE r.qtdRet = :qtdRet")})
@Registros(nivel = 4)
public class RegK265 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK260 idPai;

    public RegK260 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK260) idPai;
    }

    public RegK265() {
    }

    public RegK265(Long id) {
        this.id = id;
    }

    public RegK265(Long id, RegK260 idPai, long linha, String hash) {
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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD_CONS")
    private BigDecimal qtdCons;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD_RET")
    private BigDecimal qtdRet;

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

    public BigDecimal getQtdCons() {
        return qtdCons;
    }

    public void setQtdCons(BigDecimal qtdCons) {
        this.qtdCons = qtdCons;
    }

    public BigDecimal getQtdRet() {
        return qtdRet;
    }

    public void setQtdRet(BigDecimal qtdRet) {
        this.qtdRet = qtdRet;
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
        if (!(object instanceof RegK265)) {
            return false;
        }
        RegK265 other = (RegK265) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK265[ id=" + id + " ]";
    }

}
