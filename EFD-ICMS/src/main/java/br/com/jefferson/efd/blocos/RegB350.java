package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_b350")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB350.findAll", query = "SELECT r FROM RegB350 r"),
    @NamedQuery(name = "RegB350.findById", query = "SELECT r FROM RegB350 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB350.findByIdPai", query = "SELECT r FROM RegB350 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB350.findByLinha", query = "SELECT r FROM RegB350 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB350.findByHash", query = "SELECT r FROM RegB350 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB350.findByReg", query = "SELECT r FROM RegB350 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB350.findByCodCtd", query = "SELECT r FROM RegB350 r WHERE r.codCtd = :codCtd"),
    @NamedQuery(name = "RegB350.findByCtaIss", query = "SELECT r FROM RegB350 r WHERE r.ctaIss = :ctaIss"),
    @NamedQuery(name = "RegB350.findByCtaCosif", query = "SELECT r FROM RegB350 r WHERE r.ctaCosif = :ctaCosif"),
    @NamedQuery(name = "RegB350.findByQtdOcor", query = "SELECT r FROM RegB350 r WHERE r.qtdOcor = :qtdOcor"),
    @NamedQuery(name = "RegB350.findByCodServ", query = "SELECT r FROM RegB350 r WHERE r.codServ = :codServ"),
    @NamedQuery(name = "RegB350.findByVlCont", query = "SELECT r FROM RegB350 r WHERE r.vlCont = :vlCont"),
    @NamedQuery(name = "RegB350.findByVlBcIss", query = "SELECT r FROM RegB350 r WHERE r.vlBcIss = :vlBcIss"),
    @NamedQuery(name = "RegB350.findByAliqIss", query = "SELECT r FROM RegB350 r WHERE r.aliqIss = :aliqIss"),
    @NamedQuery(name = "RegB350.findByVlIss", query = "SELECT r FROM RegB350 r WHERE r.vlIss = :vlIss"),
    @NamedQuery(name = "RegB350.findByCodInfObs", query = "SELECT r FROM RegB350 r WHERE r.codInfObs = :codInfObs")})
public class RegB350 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_PAI")
    private long idPai;
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "COD_CTD")
    private String codCtd;
    @Column(name = "CTA_ISS")
    private String ctaIss;
    @Column(name = "CTA_COSIF")
    private String ctaCosif;
    @Column(name = "QTD_OCOR")
    private int qtdOcor;
    @Column(name = "COD_SERV")
    private String codServ;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_CONT")
    private BigDecimal vlCont;
    @Column(name = "VL_BC_ISS")
    private BigDecimal vlBcIss;
    @Column(name = "ALIQ_ISS")
    private BigDecimal aliqIss;
    @Column(name = "VL_ISS")
    private BigDecimal vlIss;
    @Column(name = "COD_INF_OBS")
    private String codInfObs;

    public RegB350() {
    }

    public RegB350(Long id) {
        this.id = id;
    }

    public RegB350(Long id, long idPai, long linha, String hash) {
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

    public long getIdPai() {
        return idPai;
    }

    public void setIdPai(long idPai) {
        this.idPai = idPai;
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

    public String getCodCtd() {
        return codCtd;
    }

    public void setCodCtd(String codCtd) {
        this.codCtd = codCtd;
    }

    public String getCtaIss() {
        return ctaIss;
    }

    public void setCtaIss(String ctaIss) {
        this.ctaIss = ctaIss;
    }

    public String getCtaCosif() {
        return ctaCosif;
    }

    public void setCtaCosif(String ctaCosif) {
        this.ctaCosif = ctaCosif;
    }

    public int getQtdOcor() {
        return qtdOcor;
    }

    public void setQtdOcor(int qtdOcor) {
        this.qtdOcor = qtdOcor;
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getAliqIss() {
        return aliqIss;
    }

    public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public String getCodInfObs() {
        return codInfObs;
    }

    public void setCodInfObs(String codInfObs) {
        this.codInfObs = codInfObs;
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
        if (!(object instanceof RegB350)) {
            return false;
        }
        RegB350 other = (RegB350) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB350[ id=" + id + " ]";
    }

}
