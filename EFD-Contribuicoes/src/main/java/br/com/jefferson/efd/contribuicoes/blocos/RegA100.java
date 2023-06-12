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
@Table(name = "reg_a100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegA100.findAll", query = "SELECT r FROM RegA100 r"),
    @NamedQuery(name = "RegA100.findById", query = "SELECT r FROM RegA100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegA100.findByIdPai", query = "SELECT r FROM RegA100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegA100.findByLinha", query = "SELECT r FROM RegA100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegA100.findByHashfile", query = "SELECT r FROM RegA100 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegA100.findByReg", query = "SELECT r FROM RegA100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegA100.findByIndOper", query = "SELECT r FROM RegA100 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegA100.findByIndEmit", query = "SELECT r FROM RegA100 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegA100.findByCodPart", query = "SELECT r FROM RegA100 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegA100.findByCodSit", query = "SELECT r FROM RegA100 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegA100.findBySer", query = "SELECT r FROM RegA100 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegA100.findBySub", query = "SELECT r FROM RegA100 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegA100.findByNumDoc", query = "SELECT r FROM RegA100 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegA100.findByChvNfse", query = "SELECT r FROM RegA100 r WHERE r.chvNfse = :chvNfse"),
    @NamedQuery(name = "RegA100.findByDtDoc", query = "SELECT r FROM RegA100 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegA100.findByDtExeServ", query = "SELECT r FROM RegA100 r WHERE r.dtExeServ = :dtExeServ"),
    @NamedQuery(name = "RegA100.findByVlDoc", query = "SELECT r FROM RegA100 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegA100.findByIndPgto", query = "SELECT r FROM RegA100 r WHERE r.indPgto = :indPgto"),
    @NamedQuery(name = "RegA100.findByVlDesc", query = "SELECT r FROM RegA100 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegA100.findByVlBcPis", query = "SELECT r FROM RegA100 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegA100.findByVlPis", query = "SELECT r FROM RegA100 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegA100.findByVlBcCofins", query = "SELECT r FROM RegA100 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegA100.findByVlCofins", query = "SELECT r FROM RegA100 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegA100.findByVlPisRet", query = "SELECT r FROM RegA100 r WHERE r.vlPisRet = :vlPisRet"),
    @NamedQuery(name = "RegA100.findByVlCofinsRet", query = "SELECT r FROM RegA100 r WHERE r.vlCofinsRet = :vlCofinsRet"),
    @NamedQuery(name = "RegA100.findByVlIss", query = "SELECT r FROM RegA100 r WHERE r.vlIss = :vlIss")})
@Registros(nivel = 3)
public class RegA100 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegA010 idPai;

    @Override
    public RegA010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegA010) idPai;
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
    private List<RegA110> regA110;

    public List<RegA110> getRegA110() {
        return regA110;
    }

    public void setRegA110(List<RegA110> regA110) {
        this.regA110 = regA110;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegA111> regA111;

    public List<RegA111> getRegA111() {
        return regA111;
    }

    public void setRegA111(List<RegA111> regA111) {
        this.regA111 = regA111;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegA120> regA120;

    public List<RegA120> getRegA120() {
        return regA120;
    }

    public void setRegA120(List<RegA120> regA120) {
        this.regA120 = regA120;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegA170> regA170;

    public List<RegA170> getRegA170() {
        return regA170;
    }

    public void setRegA170(List<RegA170> regA170) {
        this.regA170 = regA170;
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
    @Column(name = "COD_SIT")
    private String codSit;

    public String getCodSit() {
        return this.codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    public String getSer() {
        return this.ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "SUB")
    private String sub;

    public String getSub() {
        return this.sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "NUM_DOC")
    private String numDoc;

    public String getNumDoc() {
        return this.numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CHV_NFSE")
    private String chvNfse;

    public String getChvNfse() {
        return this.chvNfse;
    }

    public void setChvNfse(String chvNfse) {
        this.chvNfse = chvNfse;
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
    @Column(name = "DT_EXE_SERV")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtExeServ;

    public Date getDtExeServ() {
        return this.dtExeServ;
    }

    public void setDtExeServ(Date dtExeServ) {
        this.dtExeServ = dtExeServ;
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
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "IND_PGTO")
    private String indPgto;

    public String getIndPgto() {
        return this.indPgto;
    }

    public void setIndPgto(String indPgto) {
        this.indPgto = indPgto;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_PIS_RET", precision = 15, scale = 6)
    private BigDecimal vlPisRet;

    public BigDecimal getVlPisRet() {
        return this.vlPisRet;
    }

    public void setVlPisRet(BigDecimal vlPisRet) {
        this.vlPisRet = vlPisRet;
    }
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_COFINS_RET", precision = 15, scale = 6)
    private BigDecimal vlCofinsRet;

    public BigDecimal getVlCofinsRet() {
        return this.vlCofinsRet;
    }

    public void setVlCofinsRet(BigDecimal vlCofinsRet) {
        this.vlCofinsRet = vlCofinsRet;
    }
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_ISS", precision = 15, scale = 6)
    private BigDecimal vlIss;

    public BigDecimal getVlIss() {
        return this.vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
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
        final RegA100 other = (RegA100) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegA100{" + "id=" + id + '}';
    }
}
