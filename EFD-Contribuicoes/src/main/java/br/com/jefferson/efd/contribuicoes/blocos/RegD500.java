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
@Table(name = "reg_d500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD500.findAll", query = "SELECT r FROM RegD500 r"),
    @NamedQuery(name = "RegD500.findById", query = "SELECT r FROM RegD500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD500.findByIdPai", query = "SELECT r FROM RegD500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD500.findByLinha", query = "SELECT r FROM RegD500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD500.findByHashfile", query = "SELECT r FROM RegD500 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD500.findByReg", query = "SELECT r FROM RegD500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD500.findByIndOper", query = "SELECT r FROM RegD500 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegD500.findByIndEmit", query = "SELECT r FROM RegD500 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegD500.findByCodPart", query = "SELECT r FROM RegD500 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegD500.findByCodMod", query = "SELECT r FROM RegD500 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD500.findByCodSit", query = "SELECT r FROM RegD500 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegD500.findBySer", query = "SELECT r FROM RegD500 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD500.findBySub", query = "SELECT r FROM RegD500 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD500.findByNumDoc", query = "SELECT r FROM RegD500 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegD500.findByDtDoc", query = "SELECT r FROM RegD500 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD500.findByDtAP", query = "SELECT r FROM RegD500 r WHERE r.dtAP = :dtAP"),
    @NamedQuery(name = "RegD500.findByVlDoc", query = "SELECT r FROM RegD500 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD500.findByVlDesc", query = "SELECT r FROM RegD500 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD500.findByVlServ", query = "SELECT r FROM RegD500 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD500.findByVlServNt", query = "SELECT r FROM RegD500 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "RegD500.findByVlTerc", query = "SELECT r FROM RegD500 r WHERE r.vlTerc = :vlTerc"),
    @NamedQuery(name = "RegD500.findByVlDa", query = "SELECT r FROM RegD500 r WHERE r.vlDa = :vlDa"),
    @NamedQuery(name = "RegD500.findByVlBcIcms", query = "SELECT r FROM RegD500 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD500.findByVlIcms", query = "SELECT r FROM RegD500 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD500.findByCodInf", query = "SELECT r FROM RegD500 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "RegD500.findByVlPis", query = "SELECT r FROM RegD500 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegD500.findByVlCofins", query = "SELECT r FROM RegD500 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 3)
public class RegD500 implements Serializable, BlocoSped {

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
    private List<RegD501> regD501;

    public List<RegD501> getRegD501() {
        return regD501;
    }

    public void setRegD501(List<RegD501> regD501) {
        this.regD501 = regD501;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD505> regD505;

    public List<RegD505> getRegD505() {
        return regD505;
    }

    public void setRegD505(List<RegD505> regD505) {
        this.regD505 = regD505;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD509> regD509;

    public List<RegD509> getRegD509() {
        return regD509;
    }

    public void setRegD509(List<RegD509> regD509) {
        this.regD509 = regD509;
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
    @Column(name = "IND_OPER")
    private String indOper;

    public String getIndOper() {
        return this.indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_EMIT")
    private String indEmit;

    public String getIndEmit() {
        return this.indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;

    public String getCodPart() {
        return this.codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_SIT")
    private String codSit;

    public String getCodSit() {
        return this.codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    public String getSer() {
        return this.ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "SUB")
    private int sub;

    public int getSub() {
        return this.sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }
    @Campos(posicao = 9, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;

    public int getNumDoc() {
        return this.numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }
    @Campos(posicao = 10, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDoc;

    public Date getDtDoc() {
        return this.dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    @Campos(posicao = 11, tipo = 'D')
    @Column(name = "DT_A_P")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAP;

    public Date getDtAP() {
        return this.dtAP;
    }

    public void setDtAP(Date dtAP) {
        this.dtAP = dtAP;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;

    public BigDecimal getVlDoc() {
        return this.vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_SERV", precision = 15, scale = 6)
    private BigDecimal vlServ;

    public BigDecimal getVlServ() {
        return this.vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_SERV_NT", precision = 15, scale = 6)
    private BigDecimal vlServNt;

    public BigDecimal getVlServNt() {
        return this.vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_TERC", precision = 15, scale = 6)
    private BigDecimal vlTerc;

    public BigDecimal getVlTerc() {
        return this.vlTerc;
    }

    public void setVlTerc(BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_DA", precision = 15, scale = 6)
    private BigDecimal vlDa;

    public BigDecimal getVlDa() {
        return this.vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;

    public BigDecimal getVlBcIcms() {
        return this.vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;

    public BigDecimal getVlIcms() {
        return this.vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }
    @Campos(posicao = 20, tipo = 'C')
    @Column(name = "COD_INF")
    private String codInf;

    public String getCodInf() {
        return this.codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 22, tipo = 'R')
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
        final RegD500 other = (RegD500) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegD500{" + "id=" + id + '}';
    }
}
