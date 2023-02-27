package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d400")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD400.findAll", query = "SELECT r FROM RegD400 r"),
    @NamedQuery(name = "RegD400.findById", query = "SELECT r FROM RegD400 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD400.findByIdPai", query = "SELECT r FROM RegD400 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD400.findByLinha", query = "SELECT r FROM RegD400 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD400.findByHashfile", query = "SELECT r FROM RegD400 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD400.findByReg", query = "SELECT r FROM RegD400 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD400.findByCodPart", query = "SELECT r FROM RegD400 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegD400.findByCodMod", query = "SELECT r FROM RegD400 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD400.findByCodSit", query = "SELECT r FROM RegD400 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegD400.findBySer", query = "SELECT r FROM RegD400 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD400.findBySub", query = "SELECT r FROM RegD400 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD400.findByNumDoc", query = "SELECT r FROM RegD400 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegD400.findByDtDoc", query = "SELECT r FROM RegD400 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD400.findByVlDoc", query = "SELECT r FROM RegD400 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD400.findByVlDesc", query = "SELECT r FROM RegD400 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD400.findByVlServ", query = "SELECT r FROM RegD400 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD400.findByVlBcIcms", query = "SELECT r FROM RegD400 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD400.findByVlIcms", query = "SELECT r FROM RegD400 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD400.findByVlPis", query = "SELECT r FROM RegD400 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegD400.findByVlCofins", query = "SELECT r FROM RegD400 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegD400.findByCodCta", query = "SELECT r FROM RegD400 r WHERE r.codCta = :codCta")})
@Registros(nivel = 2)
public class RegD400 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD001 idPai;

    public RegD001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD001) idPai;
    }

    public RegD400() {
    }

    public RegD400(String id) {
        this.id = id;
    }

    public RegD400(String id, RegD001 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD410> regD410;

    public List<RegD410> getRegD410() {
        return regD410;
    }

    public void setRegD410(List<RegD410> regD410) {
        this.regD410 = regD410;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD420> regD420;

    public List<RegD420> getRegD420() {
        return regD420;
    }

    public void setRegD420(List<RegD420> regD420) {
        this.regD420 = regD420;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_SIT")
    private String codSit;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "SUB")
    private int sub;
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 8, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_SERV", precision = 15, scale = 6)
    private BigDecimal vlServ;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 16, tipo = 'C')
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

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
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

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
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
        if (!(object instanceof RegD400)) {
            return false;
        }
        RegD400 other = (RegD400) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD400[ id=" + id + " ]";
    }

}
