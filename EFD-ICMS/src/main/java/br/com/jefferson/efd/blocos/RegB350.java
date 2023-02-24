package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
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
@Table(name = "reg_b350")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB350.findAll", query = "SELECT r FROM RegB350 r"),
    @NamedQuery(name = "RegB350.findById", query = "SELECT r FROM RegB350 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB350.findByIdPai", query = "SELECT r FROM RegB350 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB350.findByLinha", query = "SELECT r FROM RegB350 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB350.findByHashfile", query = "SELECT r FROM RegB350 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 2)
public class RegB350 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegB001 idPai;

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
    @Column(name = "COD_CTD")
    private String codCtd;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CTA_ISS")
    private String ctaIss;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CTA_COSIF")
    private String ctaCosif;

    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "QTD_OCOR")
    private int qtdOcor;

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_SERV")
    private String codServ;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_CONT", precision = 15, scale = 6)
    private BigDecimal vlCont;

    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_BC_ISS", precision = 15, scale = 6)
    private BigDecimal vlBcIss;

    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "ALIQ_ISS", precision = 15, scale = 6)
    private BigDecimal aliqIss;

    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_ISS", precision = 15, scale = 6)
    private BigDecimal vlIss;

    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_INF_OBS")
    private String codInfObs;

    public RegB350() {
    }

    public RegB350(Long id) {
        this.id = id;
    }

    public RegB350(Long id, RegB001 idPai, long linha, String hashfile) {
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

    public RegB001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegB001) idPai;
    }

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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
