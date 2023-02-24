package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
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
@Table(name = "reg_c321")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC321.findAll", query = "SELECT r FROM RegC321 r"),
    @NamedQuery(name = "RegC321.findById", query = "SELECT r FROM RegC321 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC321.findByIdPai", query = "SELECT r FROM RegC321 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC321.findByLinha", query = "SELECT r FROM RegC321 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC321.findByHashfile", query = "SELECT r FROM RegC321 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC321.findByReg", query = "SELECT r FROM RegC321 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC321.findByCodItem", query = "SELECT r FROM RegC321 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC321.findByQtd", query = "SELECT r FROM RegC321 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC321.findByUnid", query = "SELECT r FROM RegC321 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC321.findByVlItem", query = "SELECT r FROM RegC321 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC321.findByVlDesc", query = "SELECT r FROM RegC321 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC321.findByVlBcIcms", query = "SELECT r FROM RegC321 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC321.findByVlIcms", query = "SELECT r FROM RegC321 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC321.findByVlPis", query = "SELECT r FROM RegC321 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC321.findByVlCofins", query = "SELECT r FROM RegC321 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 4)
public class RegC321 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC320 idPai;

    public RegC320 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC320) idPai;
    }

    public RegC321() {
    }

    public RegC321(Long id) {
        this.id = id;
    }

    public RegC321(Long id, RegC320 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
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
    @Column(name = "HASHFILE")
    private String hashfile;
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC330 regC330;

    public RegC330 getRegC330() {
        return regC330;
    }

    public void setRegC330(RegC330 regC330) {
        this.regC330 = regC330;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD", precision = 15, scale = 6)
    private BigDecimal qtd;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_PIS ", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

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

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegC321)) {
            return false;
        }
        RegC321 other = (RegC321) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC321[ id=" + id + " ]";
    }

}
