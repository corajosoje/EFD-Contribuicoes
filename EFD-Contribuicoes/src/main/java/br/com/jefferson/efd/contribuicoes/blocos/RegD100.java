package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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
@Table(name = "reg_d100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD100.findAll", query = "SELECT r FROM RegD100 r"),
    @NamedQuery(name = "RegD100.findById", query = "SELECT r FROM RegD100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD100.findByIdPai", query = "SELECT r FROM RegD100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD100.findByLinha", query = "SELECT r FROM RegD100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD100.findByHashfile", query = "SELECT r FROM RegD100 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD100.findByReg", query = "SELECT r FROM RegD100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD100.findByIndOper", query = "SELECT r FROM RegD100 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegD100.findByIndEmit", query = "SELECT r FROM RegD100 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegD100.findByCodPart", query = "SELECT r FROM RegD100 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegD100.findByCodMod", query = "SELECT r FROM RegD100 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD100.findByCodSit", query = "SELECT r FROM RegD100 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegD100.findBySer", query = "SELECT r FROM RegD100 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD100.findBySub", query = "SELECT r FROM RegD100 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD100.findByNumDoc", query = "SELECT r FROM RegD100 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegD100.findByChvCte", query = "SELECT r FROM RegD100 r WHERE r.chvCte = :chvCte"),
    @NamedQuery(name = "RegD100.findByDtDoc", query = "SELECT r FROM RegD100 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD100.findByDtAP", query = "SELECT r FROM RegD100 r WHERE r.dtAP = :dtAP"),
    @NamedQuery(name = "RegD100.findByTpCte", query = "SELECT r FROM RegD100 r WHERE r.tpCte = :tpCte"),
    @NamedQuery(name = "RegD100.findByChvCteRef", query = "SELECT r FROM RegD100 r WHERE r.chvCteRef = :chvCteRef"),
    @NamedQuery(name = "RegD100.findByVlDoc", query = "SELECT r FROM RegD100 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD100.findByVlDesc", query = "SELECT r FROM RegD100 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD100.findByIndFrt", query = "SELECT r FROM RegD100 r WHERE r.indFrt = :indFrt"),
    @NamedQuery(name = "RegD100.findByVlServ", query = "SELECT r FROM RegD100 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD100.findByVlBcIcms", query = "SELECT r FROM RegD100 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD100.findByVlIcms", query = "SELECT r FROM RegD100 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD100.findByVlNt", query = "SELECT r FROM RegD100 r WHERE r.vlNt = :vlNt"),
    @NamedQuery(name = "RegD100.findByCodInf", query = "SELECT r FROM RegD100 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "RegD100.findByCodCta", query = "SELECT r FROM RegD100 r WHERE r.codCta = :codCta")})
@Registros(nivel = 3)
public class RegD100 implements Serializable, BlocoSped {

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
    private List<RegD101> regD101;

    public List<RegD101> getRegD101() {
        return regD101;
    }

    public void setRegD101(List<RegD101> regD101) {
        this.regD101 = regD101;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD105> regD105;

    public List<RegD105> getRegD105() {
        return regD105;
    }

    public void setRegD105(List<RegD105> regD105) {
        this.regD105 = regD105;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD111> regD111;

    public List<RegD111> getRegD111() {
        return regD111;
    }

    public void setRegD111(List<RegD111> regD111) {
        this.regD111 = regD111;
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
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "SUB")
    private String sub;

    public String getSub() {
        return this.sub;
    }

    public void setSub(String sub) {
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
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CHV_CTE")
    private String chvCte;

    public String getChvCte() {
        return this.chvCte;
    }

    public void setChvCte(String chvCte) {
        this.chvCte = chvCte;
    }

    @Campos(posicao = 11, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDoc;

    public Date getDtDoc() {
        return this.dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    @Campos(posicao = 12, tipo = 'D')
    @Column(name = "DT_A_P")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAP;

    public Date getDtAP() {
        return this.dtAP;
    }

    public void setDtAP(Date dtAP) {
        this.dtAP = dtAP;
    }
    @Campos(posicao = 13, tipo = 'I')
    @Column(name = "TP_CTe")
    private int tpCte;

    public int getTpCte() {
        return this.tpCte;
    }

    public void setTpCte(int tpCte) {
        this.tpCte = tpCte;
    }

    @Campos(posicao = 14, tipo = 'C')
    @Column(name = "CHV_CTE_REF")
    private String chvCteRef;

    public String getChvCteRef() {
        return this.chvCteRef;
    }

    public void setChvCteRef(String chvCteRef) {
        this.chvCteRef = chvCteRef;
    }

    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;

    public BigDecimal getVlDoc() {
        return this.vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "IND_FRT")
    private String indFrt;

    public String getIndFrt() {
        return this.indFrt;
    }

    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_SERV", precision = 15, scale = 6)
    private BigDecimal vlServ;

    public BigDecimal getVlServ() {
        return this.vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;

    public BigDecimal getVlBcIcms() {
        return this.vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;

    public BigDecimal getVlIcms() {
        return this.vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_NT", precision = 15, scale = 6)
    private BigDecimal vlNt;

    public BigDecimal getVlNt() {
        return this.vlNt;
    }

    public void setVlNt(BigDecimal vlNt) {
        this.vlNt = vlNt;
    }
    @Campos(posicao = 22, tipo = 'C')
    @Column(name = "COD_INF")
    private String codInf;

    public String getCodInf() {
        return this.codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    @Campos(posicao = 23, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
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
        final RegD100 other = (RegD100) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegD100{" + "id=" + id + '}';
    }
}
