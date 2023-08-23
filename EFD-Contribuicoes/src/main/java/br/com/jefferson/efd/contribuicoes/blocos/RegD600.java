package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
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
    @NamedQuery(name = "RegD600.findByIndRec", query = "SELECT r FROM RegD600 r WHERE r.indRec = :indRec"),
    @NamedQuery(name = "RegD600.findByQtdCons", query = "SELECT r FROM RegD600 r WHERE r.qtdCons = :qtdCons"),
    @NamedQuery(name = "RegD600.findByDtDocIni", query = "SELECT r FROM RegD600 r WHERE r.dtDocIni = :dtDocIni"),
    @NamedQuery(name = "RegD600.findByDtDocFin", query = "SELECT r FROM RegD600 r WHERE r.dtDocFin = :dtDocFin"),
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
@Registros(nivel = 3)
public class RegD600 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD010 idPai;

    @Override
    public RegD010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegD010) idPai;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @PrePersist
    @Override
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Override
    public long getLinha() {
        return this.linha;
    }

    @Override
    public void setLinha(long linha) {
        this.linha = linha;
    }
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Override
    public String getHashfile() {
        return this.hashfile;
    }

    @Override
    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD601> regD601;

    public List<RegD601> getRegD601() {
        return regD601;
    }

    public void setRegD601(List<RegD601> regD601) {
        this.regD601 = regD601;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD605> regD605;

    public List<RegD605> getRegD605() {
        return regD605;
    }

    public void setRegD605(List<RegD605> regD605) {
        this.regD605 = regD605;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD609> regD609;

    public List<RegD609> getRegD609() {
        return regD609;
    }

    public void setRegD609(List<RegD609> regD609) {
        this.regD609 = regD609;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Override
    public String getReg() {
        return this.reg;
    }

    @Override
    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;

    public String getCodMun() {
        return this.codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    public String getSer() {
        return this.ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "SUB")
    private int sub;

    public int getSub() {
        return this.sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "IND_REC")
    private int indRec;

    public int getIndRec() {
        return this.indRec;
    }

    public void setIndRec(int indRec) {
        this.indRec = indRec;
    }
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "QTD_CONS")
    private int qtdCons;

    public int getQtdCons() {
        return this.qtdCons;
    }

    public void setQtdCons(int qtdCons) {
        this.qtdCons = qtdCons;
    }
    @Campos(posicao = 8, tipo = 'D')
    @Column(name = "DT_DOC_INI")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDocIni;

    public Date getDtDocIni() {
        return this.dtDocIni;
    }

    public void setDtDocIni(Date dtDocIni) {
        this.dtDocIni = dtDocIni;
    }
    @Campos(posicao = 9, tipo = 'D')
    @Column(name = "DT_DOC_FIN")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDocFin;

    public Date getDtDocFin() {
        return this.dtDocFin;
    }

    public void setDtDocFin(Date dtDocFin) {
        this.dtDocFin = dtDocFin;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;

    public BigDecimal getVlDoc() {
        return this.vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_SERV", precision = 15, scale = 6)
    private BigDecimal vlServ;

    public BigDecimal getVlServ() {
        return this.vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_SERV_NT", precision = 15, scale = 6)
    private BigDecimal vlServNt;

    public BigDecimal getVlServNt() {
        return this.vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_TERC", precision = 15, scale = 6)
    private BigDecimal vlTerc;

    public BigDecimal getVlTerc() {
        return this.vlTerc;
    }

    public void setVlTerc(BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_DA", precision = 15, scale = 6)
    private BigDecimal vlDa;

    public BigDecimal getVlDa() {
        return this.vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;

    public BigDecimal getVlBcIcms() {
        return this.vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;

    public BigDecimal getVlIcms() {
        return this.vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegD600 other = (RegD600) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegD600{" + "id=" + id + '}';
    }
}
