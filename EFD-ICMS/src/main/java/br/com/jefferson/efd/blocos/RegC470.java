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
@Table(name = "reg_c470")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC470.findAll", query = "SELECT r FROM RegC470 r"),
    @NamedQuery(name = "RegC470.findById", query = "SELECT r FROM RegC470 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC470.findByIdPai", query = "SELECT r FROM RegC470 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC470.findByLinha", query = "SELECT r FROM RegC470 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC470.findByHashfile", query = "SELECT r FROM RegC470 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC470.findByReg", query = "SELECT r FROM RegC470 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC470.findByCodItem", query = "SELECT r FROM RegC470 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC470.findByQtd", query = "SELECT r FROM RegC470 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC470.findByQtdCanc", query = "SELECT r FROM RegC470 r WHERE r.qtdCanc = :qtdCanc"),
    @NamedQuery(name = "RegC470.findByUnid", query = "SELECT r FROM RegC470 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC470.findByVlItem", query = "SELECT r FROM RegC470 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC470.findByCstIcms", query = "SELECT r FROM RegC470 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC470.findByCfop", query = "SELECT r FROM RegC470 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC470.findByAliqIcms", query = "SELECT r FROM RegC470 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC470.findByVlPis", query = "SELECT r FROM RegC470 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC470.findByVlCofins", query = "SELECT r FROM RegC470 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 5)
public class RegC470 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC460 idPai;

    public RegC460 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC460) idPai;
    }

    public RegC470() {
    }

    public RegC470(Long id) {
        this.id = id;
    }

    public RegC470(Long id, RegC460 idPai, long linha, String hashfile) {
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
    private RegC480 regC480;

    public RegC480 getRegC480() {
        return regC480;
    }

    public void setRegC480(RegC480 regC480) {
        this.regC480 = regC480;
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
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD_CANC", precision = 15, scale = 6)
    private BigDecimal qtdCanc;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 11, tipo = 'R')
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

    public BigDecimal getQtdCanc() {
        return qtdCanc;
    }

    public void setQtdCanc(BigDecimal qtdCanc) {
        this.qtdCanc = qtdCanc;
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

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
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
        if (!(object instanceof RegC470)) {
            return false;
        }
        RegC470 other = (RegC470) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC470[ id=" + id + " ]";
    }

}
