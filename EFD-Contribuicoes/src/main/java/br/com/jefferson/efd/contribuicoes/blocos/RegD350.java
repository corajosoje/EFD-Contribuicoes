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
@Table(name = "reg_d350")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD350.findAll", query = "SELECT r FROM RegD350 r"),
    @NamedQuery(name = "RegD350.findById", query = "SELECT r FROM RegD350 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD350.findByIdPai", query = "SELECT r FROM RegD350 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD350.findByLinha", query = "SELECT r FROM RegD350 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD350.findByHashfile", query = "SELECT r FROM RegD350 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD350.findByReg", query = "SELECT r FROM RegD350 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD350.findByCodMod", query = "SELECT r FROM RegD350 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD350.findByEcfMod", query = "SELECT r FROM RegD350 r WHERE r.ecfMod = :ecfMod"),
    @NamedQuery(name = "RegD350.findByEcfFab", query = "SELECT r FROM RegD350 r WHERE r.ecfFab = :ecfFab"),
    @NamedQuery(name = "RegD350.findByDtDoc", query = "SELECT r FROM RegD350 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD350.findByCro", query = "SELECT r FROM RegD350 r WHERE r.cro = :cro"),
    @NamedQuery(name = "RegD350.findByCrz", query = "SELECT r FROM RegD350 r WHERE r.crz = :crz"),
    @NamedQuery(name = "RegD350.findByNumCooFin", query = "SELECT r FROM RegD350 r WHERE r.numCooFin = :numCooFin"),
    @NamedQuery(name = "RegD350.findByGtFin", query = "SELECT r FROM RegD350 r WHERE r.gtFin = :gtFin"),
    @NamedQuery(name = "RegD350.findByVlBrt", query = "SELECT r FROM RegD350 r WHERE r.vlBrt = :vlBrt"),
    @NamedQuery(name = "RegD350.findByCstPis", query = "SELECT r FROM RegD350 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegD350.findByVlBcPis", query = "SELECT r FROM RegD350 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegD350.findByAliqPis", query = "SELECT r FROM RegD350 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegD350.findByQuantBcPis", query = "SELECT r FROM RegD350 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegD350.findByAliqPisQuant", query = "SELECT r FROM RegD350 r WHERE r.aliqPisQuant = :aliqPisQuant"),
    @NamedQuery(name = "RegD350.findByVlPis", query = "SELECT r FROM RegD350 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegD350.findByCstCofins", query = "SELECT r FROM RegD350 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegD350.findByVlBcCofins", query = "SELECT r FROM RegD350 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegD350.findByAliqCofins", query = "SELECT r FROM RegD350 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegD350.findByQuantBcCofins", query = "SELECT r FROM RegD350 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegD350.findByAliqCofinsQuant", query = "SELECT r FROM RegD350 r WHERE r.aliqCofinsQuant = :aliqCofinsQuant"),
    @NamedQuery(name = "RegD350.findByVlCofins", query = "SELECT r FROM RegD350 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegD350.findByCodCta", query = "SELECT r FROM RegD350 r WHERE r.codCta = :codCta")})
@Registros(nivel = 3)
public class RegD350 implements Serializable, BlocoSped {

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
    private List<RegD359> regD359;

    public List<RegD359> getRegD359() {
        return regD359;
    }

    public void setRegD359(List<RegD359> regD359) {
        this.regD359 = regD359;
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
    @Column(name = "ECF_MOD")
    private String ecfMod;

    public String getEcfMod() {
        return this.ecfMod;
    }

    public void setEcfMod(String ecfMod) {
        this.ecfMod = ecfMod;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "ECF_FAB")
    private String ecfFab;

    public String getEcfFab() {
        return this.ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDoc;

    public Date getDtDoc() {
        return this.dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CRO")
    private String cro;

    public String getCro() {
        return this.cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CRZ")
    private String crz;

    public String getCrz() {
        return this.crz;
    }

    public void setCrz(String crz) {
        this.crz = crz;
    }

    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "NUM_COO_FIN")
    private int numCooFin;

    public int getNumCooFin() {
        return this.numCooFin;
    }

    public void setNumCooFin(int numCooFin) {
        this.numCooFin = numCooFin;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "GT_FIN", precision = 15, scale = 6)
    private BigDecimal gtFin;

    public BigDecimal getGtFin() {
        return this.gtFin;
    }

    public void setGtFin(BigDecimal gtFin) {
        this.gtFin = gtFin;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_BRT", precision = 15, scale = 6)
    private BigDecimal vlBrt;

    public BigDecimal getVlBrt() {
        return this.vlBrt;
    }

    public void setVlBrt(BigDecimal vlBrt) {
        this.vlBrt = vlBrt;
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
    @Column(name = "QUANT_BC_PIS", precision = 15, scale = 6)
    private BigDecimal quantBcPis;

    public BigDecimal getQuantBcPis() {
        return this.quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "ALIQ_PIS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqPisQuant;

    public BigDecimal getAliqPisQuant() {
        return this.aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
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
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "QUANT_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal quantBcCofins;

    public BigDecimal getQuantBcCofins() {
        return this.quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "ALIQ_COFINS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqCofinsQuant;

    public BigDecimal getAliqCofinsQuant() {
        return this.aliqCofinsQuant;
    }

    public void setAliqCofinsQuant(BigDecimal aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
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
        final RegD350 other = (RegD350) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegD350{" + "id=" + id + '}';
    }
}
