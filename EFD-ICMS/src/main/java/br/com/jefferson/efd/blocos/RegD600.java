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
@Table(name = "reg_d600")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD600.findAll", query = "SELECT r FROM RegD600 r"),
    @NamedQuery(name = "RegD600.findById", query = "SELECT r FROM RegD600 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD600.findByIdPai", query = "SELECT r FROM RegD600 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD600.findByLinha", query = "SELECT r FROM RegD600 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD600.findByHashfile", query = "SELECT r FROM RegD600 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD600.findByReg", query = "SELECT r FROM RegD600 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD600.findByCodMod", query = "SELECT r FROM RegD600 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD600.findByCodMun", query = "SELECT r FROM RegD600 r WHERE r.codMun = :codMun"),
    @NamedQuery(name = "RegD600.findBySer", query = "SELECT r FROM RegD600 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD600.findBySub", query = "SELECT r FROM RegD600 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD600.findByCodCons", query = "SELECT r FROM RegD600 r WHERE r.codCons = :codCons"),
    @NamedQuery(name = "RegD600.findByQtdCons", query = "SELECT r FROM RegD600 r WHERE r.qtdCons = :qtdCons"),
    @NamedQuery(name = "RegD600.findByDtDoc", query = "SELECT r FROM RegD600 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD600.findByVlDoc", query = "SELECT r FROM RegD600 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD600.findByVlDesc", query = "SELECT r FROM RegD600 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD600.findByVlServ", query = "SELECT r FROM RegD600 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD600.findByVlServNt", query = "SELECT r FROM RegD600 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "RegD600.findByVlTerc", query = "SELECT r FROM RegD600 r WHERE r.vlTerc = :vlTerc"),
    @NamedQuery(name = "RegD600.findByVlDa", query = "SELECT r FROM RegD600 r WHERE r.vlDa = :vlDa"),
    @NamedQuery(name = "RegD600.findByVlBcIcms", query = "SELECT r FROM RegD600 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD600.findByVlIcms", query = "SELECT r FROM RegD600 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD600.findByVlPis", query = "SELECT r FROM RegD600 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegD600.findByVlCofins", query = "SELECT r FROM RegD600 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 2)
public class RegD600 implements Serializable {

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

    public RegD600() {
    }

    public RegD600(String id) {
        this.id = id;
    }

    public RegD600(String id, RegD001 idPai, long linha, String hashfile) {
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
    private List<RegD610> regD610;

    public List<RegD610> getRegD610() {
        return regD610;
    }

    public void setRegD610(List<RegD610> regD610) {
        this.regD610 = regD610;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD690> regD690;

    public List<RegD690> getRegD690() {
        return regD690;
    }

    public void setRegD690(List<RegD690> regD690) {
        this.regD690 = regD690;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "SUB")
    private int sub;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_CONS")
    private String codCons;
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "QTD_CONS")
    private int qtdCons;
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
    @Column(name = "VL_SERV_NT", precision = 15, scale = 6)
    private BigDecimal vlServNt;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_TERC", precision = 15, scale = 6)
    private BigDecimal vlTerc;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_DA", precision = 15, scale = 6)
    private BigDecimal vlDa;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 18, tipo = 'R')
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

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
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

    public String getCodCons() {
        return codCons;
    }

    public void setCodCons(String codCons) {
        this.codCons = codCons;
    }

    public int getQtdCons() {
        return qtdCons;
    }

    public void setQtdCons(int qtdCons) {
        this.qtdCons = qtdCons;
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

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlTerc() {
        return vlTerc;
    }

    public void setVlTerc(BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
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
        if (!(object instanceof RegD600)) {
            return false;
        }
        RegD600 other = (RegD600) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD600[ id=" + id + " ]";
    }

}
