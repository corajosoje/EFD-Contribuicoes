package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d610")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD610.findAll", query = "SELECT r FROM RegD610 r"),
    @NamedQuery(name = "RegD610.findById", query = "SELECT r FROM RegD610 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD610.findByIdPai", query = "SELECT r FROM RegD610 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD610.findByLinha", query = "SELECT r FROM RegD610 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD610.findByHashfile", query = "SELECT r FROM RegD610 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD610.findByReg", query = "SELECT r FROM RegD610 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD610.findByCodClass", query = "SELECT r FROM RegD610 r WHERE r.codClass = :codClass"),
    @NamedQuery(name = "RegD610.findByCodItem", query = "SELECT r FROM RegD610 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegD610.findByQtd", query = "SELECT r FROM RegD610 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegD610.findByUnid", query = "SELECT r FROM RegD610 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegD610.findByVlItem", query = "SELECT r FROM RegD610 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegD610.findByVlDesc", query = "SELECT r FROM RegD610 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD610.findByCstIcms", query = "SELECT r FROM RegD610 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegD610.findByCfop", query = "SELECT r FROM RegD610 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegD610.findByAliqIcms", query = "SELECT r FROM RegD610 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegD610.findByVlBcIcms", query = "SELECT r FROM RegD610 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD610.findByVlIcms", query = "SELECT r FROM RegD610 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD610.findByVlBcIcmsUf", query = "SELECT r FROM RegD610 r WHERE r.vlBcIcmsUf = :vlBcIcmsUf"),
    @NamedQuery(name = "RegD610.findByVlIcmsUf", query = "SELECT r FROM RegD610 r WHERE r.vlIcmsUf = :vlIcmsUf"),
    @NamedQuery(name = "RegD610.findByVlRedBc", query = "SELECT r FROM RegD610 r WHERE r.vlRedBc = :vlRedBc"),
    @NamedQuery(name = "RegD610.findByVlPis", query = "SELECT r FROM RegD610 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegD610.findByVlCofins", query = "SELECT r FROM RegD610 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegD610.findByCodCta", query = "SELECT r FROM RegD610 r WHERE r.codCta = :codCta")})
@Registros(nivel = 3)
public class RegD610 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD600 idPai;

    public RegD600 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD600) idPai;
    }

    public RegD610() {
    }

    public RegD610(String id) {
        this.id = id;
    }

    public RegD610(String id, RegD600 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_CLASS")
    private String codClass;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD", precision = 15, scale = 6)
    private BigDecimal qtd;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_BC_ICMS_UF", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsUf;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_ICMS_UF", precision = 15, scale = 6)
    private BigDecimal vlIcmsUf;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_RED_BC", precision = 15, scale = 6)
    private BigDecimal vlRedBc;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 18, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

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

    public String getCodClass() {
        return codClass;
    }

    public void setCodClass(String codClass) {
        this.codClass = codClass;
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

    public BigDecimal getVlBcIcmsUf() {
        return vlBcIcmsUf;
    }

    public void setVlBcIcmsUf(BigDecimal vlBcIcmsUf) {
        this.vlBcIcmsUf = vlBcIcmsUf;
    }

    public BigDecimal getVlIcmsUf() {
        return vlIcmsUf;
    }

    public void setVlIcmsUf(BigDecimal vlIcmsUf) {
        this.vlIcmsUf = vlIcmsUf;
    }

    public BigDecimal getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(BigDecimal vlRedBc) {
        this.vlRedBc = vlRedBc;
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

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
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
        if (!(object instanceof RegD610)) {
            return false;
        }
        RegD610 other = (RegD610) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD610[ id=" + id + " ]";
    }

}
