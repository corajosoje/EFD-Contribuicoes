package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_d410")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD410.findAll", query = "SELECT r FROM RegD410 r"),
    @NamedQuery(name = "RegD410.findById", query = "SELECT r FROM RegD410 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD410.findByIdPai", query = "SELECT r FROM RegD410 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD410.findByLinha", query = "SELECT r FROM RegD410 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD410.findByHash", query = "SELECT r FROM RegD410 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD410.findByReg", query = "SELECT r FROM RegD410 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD410.findByCodMod", query = "SELECT r FROM RegD410 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD410.findBySer", query = "SELECT r FROM RegD410 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD410.findBySub", query = "SELECT r FROM RegD410 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD410.findByNumDocIni", query = "SELECT r FROM RegD410 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "RegD410.findByNumDocFin", query = "SELECT r FROM RegD410 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "RegD410.findByDtDoc", query = "SELECT r FROM RegD410 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD410.findByCstIcms", query = "SELECT r FROM RegD410 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegD410.findByCfop", query = "SELECT r FROM RegD410 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegD410.findByAliqIcms", query = "SELECT r FROM RegD410 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegD410.findByVlOpr", query = "SELECT r FROM RegD410 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegD410.findByVlDesc", query = "SELECT r FROM RegD410 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD410.findByVlServ", query = "SELECT r FROM RegD410 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD410.findByVlBcIcms", query = "SELECT r FROM RegD410 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD410.findByVlIcms", query = "SELECT r FROM RegD410 r WHERE r.vlIcms = :vlIcms")})
@Registros(nivel = 3)
public class RegD410 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD400 idPai;

    public RegD400 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD400) idPai;
    }

    public RegD410() {
    }

    public RegD410(Long id) {
        this.id = id;
    }

    public RegD410(Long id, RegD400 idPai, long linha, String hash) {
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
    private List<RegD411> regD411;

    public List<RegD411> getRegD411() {
        return regD411;
    }

    public void setRegD411(List<RegD411> regD411) {
        this.regD411 = regD411;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "SUB")
    private int sub;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;
    @Campos(posicao = 7, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "ALIQ_ICMS")
    private BigDecimal aliqIcms;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_OPR")
    private BigDecimal vlOpr;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_SERV")
    private BigDecimal vlServ;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;

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

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(int numDocIni) {
        this.numDocIni = numDocIni;
    }

    public int getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(int numDocFin) {
        this.numDocFin = numDocFin;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
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

    public BigDecimal getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegD410)) {
            return false;
        }
        RegD410 other = (RegD410) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD410[ id=" + id + " ]";
    }

}
