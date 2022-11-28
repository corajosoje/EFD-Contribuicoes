package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c370")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC370.findAll", query = "SELECT r FROM RegC370 r"),
    @NamedQuery(name = "RegC370.findById", query = "SELECT r FROM RegC370 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC370.findByIdPai", query = "SELECT r FROM RegC370 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC370.findByLinha", query = "SELECT r FROM RegC370 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC370.findByHash", query = "SELECT r FROM RegC370 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC370.findByReg", query = "SELECT r FROM RegC370 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC370.findByNumItem", query = "SELECT r FROM RegC370 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegC370.findByCodItem", query = "SELECT r FROM RegC370 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC370.findByQtd", query = "SELECT r FROM RegC370 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC370.findByUnid", query = "SELECT r FROM RegC370 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC370.findByVlItem", query = "SELECT r FROM RegC370 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC370.findByVlDesc", query = "SELECT r FROM RegC370 r WHERE r.vlDesc = :vlDesc")})
@Registros(nivel = 3)
public class RegC370 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC350 idPai;

    public RegC350 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC350) idPai;
    }

    public RegC370() {
    }

    public RegC370(Long id) {
        this.id = id;
    }

    public RegC370(Long id, RegC350 idPai, long linha, String hash) {
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC380 regC380;

    public RegC380 getRegC380() {
        return regC380;
    }

    public void setRegC380(RegC380 regC380) {
        this.regC380 = regC380;
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
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ITEM")
    private BigDecimal vlItem;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;

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

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
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
        if (!(object instanceof RegC370)) {
            return false;
        }
        RegC370 other = (RegC370) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC370[ id=" + id + " ]";
    }

}
