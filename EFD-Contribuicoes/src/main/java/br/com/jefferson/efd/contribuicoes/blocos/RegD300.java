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
@Table(name = "reg_d300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD300.findAll", query = "SELECT r FROM RegD300 r"),
    @NamedQuery(name = "RegD300.findById", query = "SELECT r FROM RegD300 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD300.findByIdPai", query = "SELECT r FROM RegD300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD300.findByLinha", query = "SELECT r FROM RegD300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD300.findByHashfile", query = "SELECT r FROM RegD300 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD300.findByReg", query = "SELECT r FROM RegD300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD300.findByCodMod", query = "SELECT r FROM RegD300 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD300.findBySer", query = "SELECT r FROM RegD300 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD300.findBySub", query = "SELECT r FROM RegD300 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD300.findByNumDocIni", query = "SELECT r FROM RegD300 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "RegD300.findByNumDocFin", query = "SELECT r FROM RegD300 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "RegD300.findByCfop", query = "SELECT r FROM RegD300 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegD300.findByDtRef", query = "SELECT r FROM RegD300 r WHERE r.dtRef = :dtRef"),
    @NamedQuery(name = "RegD300.findByVlDoc", query = "SELECT r FROM RegD300 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD300.findByVlDesc", query = "SELECT r FROM RegD300 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegD300.findByCstPis", query = "SELECT r FROM RegD300 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegD300.findByVlBcPis", query = "SELECT r FROM RegD300 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegD300.findByAliqPis", query = "SELECT r FROM RegD300 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegD300.findByVlPis", query = "SELECT r FROM RegD300 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegD300.findByCstCofins", query = "SELECT r FROM RegD300 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegD300.findByVlBcCofins", query = "SELECT r FROM RegD300 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegD300.findByAliqCofins", query = "SELECT r FROM RegD300 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegD300.findByVlCofins", query = "SELECT r FROM RegD300 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegD300.findByCodCta", query = "SELECT r FROM RegD300 r WHERE r.codCta = :codCta")})
@Registros(nivel = 3)
public class RegD300 implements Serializable, BlocoSped {

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
    private List<RegD309> regD309;

    public List<RegD309> getRegD309() {
        return regD309;
    }

    public void setRegD309(List<RegD309> regD309) {
        this.regD309 = regD309;
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
    @Column(name = "SER")
    private String ser;

    public String getSer() {
        return this.ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "SUB")
    private int sub;

    public int getSub() {
        return this.sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;

    public int getNumDocIni() {
        return this.numDocIni;
    }

    public void setNumDocIni(int numDocIni) {
        this.numDocIni = numDocIni;
    }
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;

    public int getNumDocFin() {
        return this.numDocFin;
    }

    public void setNumDocFin(int numDocFin) {
        this.numDocFin = numDocFin;
    }
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "CFOP")
    private int cfop;

    public int getCfop() {
        return this.cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }
    @Campos(posicao = 8, tipo = 'D')
    @Column(name = "DT_REF")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRef;

    public Date getDtRef() {
        return this.dtRef;
    }

    public void setDtRef(Date dtRef) {
        this.dtRef = dtRef;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;

    public BigDecimal getVlDoc() {
        return this.vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 15, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
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
    @Campos(posicao = 19, tipo = 'C')
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
        final RegD300 other = (RegD300) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegD300{" + "id=" + id + '}';
    }
}
