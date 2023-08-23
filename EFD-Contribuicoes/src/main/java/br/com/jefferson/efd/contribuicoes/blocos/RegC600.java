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
@Table(name = "reg_c600")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC600.findAll", query = "SELECT r FROM RegC600 r"),
    @NamedQuery(name = "RegC600.findById", query = "SELECT r FROM RegC600 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC600.findByIdPai", query = "SELECT r FROM RegC600 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC600.findByLinha", query = "SELECT r FROM RegC600 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC600.findByHashfile", query = "SELECT r FROM RegC600 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC600.findByReg", query = "SELECT r FROM RegC600 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC600.findByCodMod", query = "SELECT r FROM RegC600 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC600.findByCodMun", query = "SELECT r FROM RegC600 r WHERE r.codMun = :codMun"),
    @NamedQuery(name = "RegC600.findBySer", query = "SELECT r FROM RegC600 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC600.findBySub", query = "SELECT r FROM RegC600 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegC600.findByCodCons", query = "SELECT r FROM RegC600 r WHERE r.codCons = :codCons"),
    @NamedQuery(name = "RegC600.findByQtdCons", query = "SELECT r FROM RegC600 r WHERE r.qtdCons = :qtdCons"),
    @NamedQuery(name = "RegC600.findByQtdCanc", query = "SELECT r FROM RegC600 r WHERE r.qtdCanc = :qtdCanc"),
    @NamedQuery(name = "RegC600.findByDtDoc", query = "SELECT r FROM RegC600 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC600.findByVlDoc", query = "SELECT r FROM RegC600 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC600.findByVlDesc", query = "SELECT r FROM RegC600 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC600.findByCons", query = "SELECT r FROM RegC600 r WHERE r.cons = :cons"),
    @NamedQuery(name = "RegC600.findByVlForn", query = "SELECT r FROM RegC600 r WHERE r.vlForn = :vlForn"),
    @NamedQuery(name = "RegC600.findByVlServNt", query = "SELECT r FROM RegC600 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "RegC600.findByVlTerc", query = "SELECT r FROM RegC600 r WHERE r.vlTerc = :vlTerc"),
    @NamedQuery(name = "RegC600.findByVlDa", query = "SELECT r FROM RegC600 r WHERE r.vlDa = :vlDa"),
    @NamedQuery(name = "RegC600.findByVlBcIcms", query = "SELECT r FROM RegC600 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC600.findByVlIcms", query = "SELECT r FROM RegC600 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC600.findByVlBcIcmsSt", query = "SELECT r FROM RegC600 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC600.findByVlIcmsSt", query = "SELECT r FROM RegC600 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC600.findByVlPis", query = "SELECT r FROM RegC600 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC600.findByVlCofins", query = "SELECT r FROM RegC600 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 3)
public class RegC600 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC010 idPai;

    @Override
    public RegC010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC010) idPai;
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
    private List<RegC601> regC601;

    public List<RegC601> getRegC601() {
        return regC601;
    }

    public void setRegC601(List<RegC601> regC601) {
        this.regC601 = regC601;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC605> regC605;

    public List<RegC605> getRegC605() {
        return regC605;
    }

    public void setRegC605(List<RegC605> regC605) {
        this.regC605 = regC605;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC609> regC609;

    public List<RegC609> getRegC609() {
        return regC609;
    }

    public void setRegC609(List<RegC609> regC609) {
        this.regC609 = regC609;
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
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_CONS")
    private String codCons;

    public String getCodCons() {
        return this.codCons;
    }

    public void setCodCons(String codCons) {
        this.codCons = codCons;
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
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "QTD_CANC")
    private int qtdCanc;

    public int getQtdCanc() {
        return this.qtdCanc;
    }

    public void setQtdCanc(int qtdCanc) {
        this.qtdCanc = qtdCanc;
    }
    @Campos(posicao = 9, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDoc;

    public Date getDtDoc() {
        return this.dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
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
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "CONS")
    private String cons;

    public String getCons() {
        return this.cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_FORN", precision = 15, scale = 6)
    private BigDecimal vlForn;

    public BigDecimal getVlForn() {
        return this.vlForn;
    }

    public void setVlForn(BigDecimal vlForn) {
        this.vlForn = vlForn;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_SERV_NT", precision = 15, scale = 6)
    private BigDecimal vlServNt;

    public BigDecimal getVlServNt() {
        return this.vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_TERC", precision = 15, scale = 6)
    private BigDecimal vlTerc;

    public BigDecimal getVlTerc() {
        return this.vlTerc;
    }

    public void setVlTerc(BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_DA", precision = 15, scale = 6)
    private BigDecimal vlDa;

    public BigDecimal getVlDa() {
        return this.vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;

    public BigDecimal getVlBcIcms() {
        return this.vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;

    public BigDecimal getVlIcms() {
        return this.vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;

    public BigDecimal getVlBcIcmsSt() {
        return this.vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;

    public BigDecimal getVlIcmsSt() {
        return this.vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
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
        final RegC600 other = (RegC600) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC600{" + "id=" + id + '}';
    }
}
