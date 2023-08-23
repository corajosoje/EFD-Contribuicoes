package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_m610")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM610.findAll", query = "SELECT r FROM RegM610 r"),
    @NamedQuery(name = "RegM610.findById", query = "SELECT r FROM RegM610 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM610.findByIdPai", query = "SELECT r FROM RegM610 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM610.findByLinha", query = "SELECT r FROM RegM610 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM610.findByHashfile", query = "SELECT r FROM RegM610 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM610.findByReg", query = "SELECT r FROM RegM610 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM610.findByCodCont", query = "SELECT r FROM RegM610 r WHERE r.codCont = :codCont"),
    @NamedQuery(name = "RegM610.findByVlRecBrt", query = "SELECT r FROM RegM610 r WHERE r.vlRecBrt = :vlRecBrt"),
    @NamedQuery(name = "RegM610.findByVlBcCont", query = "SELECT r FROM RegM610 r WHERE r.vlBcCont = :vlBcCont"),
    @NamedQuery(name = "RegM610.findByVlBcContAjus", query = "SELECT r FROM RegM610 r WHERE r.vlBcContAjus = :vlBcContAjus"),
    @NamedQuery(name = "RegM610.findByAliqCofins", query = "SELECT r FROM RegM610 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegM610.findByQuantBcCofins", query = "SELECT r FROM RegM610 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegM610.findByAliqCofinsQuant", query = "SELECT r FROM RegM610 r WHERE r.aliqCofinsQuant = :aliqCofinsQuant"),
    @NamedQuery(name = "RegM610.findByVlContApur", query = "SELECT r FROM RegM610 r WHERE r.vlContApur = :vlContApur"),
    @NamedQuery(name = "RegM610.findByVlAjusAcres", query = "SELECT r FROM RegM610 r WHERE r.vlAjusAcres = :vlAjusAcres"),
    @NamedQuery(name = "RegM610.findByVlAjusReduc", query = "SELECT r FROM RegM610 r WHERE r.vlAjusReduc = :vlAjusReduc"),
    @NamedQuery(name = "RegM610.findByVlContDifer", query = "SELECT r FROM RegM610 r WHERE r.vlContDifer = :vlContDifer"),
    @NamedQuery(name = "RegM610.findByVlContDiferAnt", query = "SELECT r FROM RegM610 r WHERE r.vlContDiferAnt = :vlContDiferAnt"),
    @NamedQuery(name = "RegM610.findByVlContPer", query = "SELECT r FROM RegM610 r WHERE r.vlContPer = :vlContPer")})
@Registros(nivel = 3)
public class RegM610 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM600 idPai;

    @Override
    public RegM600 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM600) idPai;
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegM611 regM611;

    public RegM611 getRegM611() {
        return regM611;
    }

    public void setRegM611(RegM611 regM611) {
        this.regM611 = regM611;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM615> regM615;

    public List<RegM615> getRegM615() {
        return regM615;
    }

    public void setRegM615(List<RegM615> regM615) {
        this.regM615 = regM615;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM620> regM620;

    public List<RegM620> getRegM620() {
        return regM620;
    }

    public void setRegM620(List<RegM620> regM620) {
        this.regM620 = regM620;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM630> regM630;

    public List<RegM630> getRegM630() {
        return regM630;
    }

    public void setRegM630(List<RegM630> regM630) {
        this.regM630 = regM630;
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
    @Column(name = "COD_CONT")
    private String codCont;

    public String getCodCont() {
        return this.codCont;
    }

    public void setCodCont(String codCont) {
        this.codCont = codCont;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_REC_BRT", precision = 15, scale = 6)
    private BigDecimal vlRecBrt;

    public BigDecimal getVlRecBrt() {
        return this.vlRecBrt;
    }

    public void setVlRecBrt(BigDecimal vlRecBrt) {
        this.vlRecBrt = vlRecBrt;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_BC_CONT", precision = 15, scale = 6)
    private BigDecimal vlBcCont;

    public BigDecimal getVlBcCont() {
        return this.vlBcCont;
    }

    public void setVlBcCont(BigDecimal vlBcCont) {
        this.vlBcCont = vlBcCont;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_AJUS_ACRES_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlAjusAcresBcCofins;

    public BigDecimal getVlAjusAcresBcCofins() {
        return this.vlAjusAcresBcCofins;
    }

    public void setVlAjusAcresBcCofins(BigDecimal vlAjusAcresBcCofins) {
        this.vlAjusAcresBcCofins = vlAjusAcresBcCofins;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_AJUS_REDUC_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlAjusReducBcCofins;

    public BigDecimal getVlAjusReducBcCofins() {
        return this.vlAjusReducBcCofins;
    }

    public void setVlAjusReducBcCofins(BigDecimal vlAjusReducBcCofins) {
        this.vlAjusReducBcCofins = vlAjusReducBcCofins;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_BC_CONT_AJUS", precision = 15, scale = 6)
    private BigDecimal vlBcContAjus;

    public BigDecimal getVlBcContAjus() {
        return this.vlBcContAjus;
    }

    public void setVlBcContAjus(BigDecimal vlBcContAjus) {
        this.vlBcContAjus = vlBcContAjus;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "QUANT_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal quantBcCofins;

    public BigDecimal getQuantBcCofins() {
        return this.quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "ALIQ_COFINS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqCofinsQuant;

    public BigDecimal getAliqCofinsQuant() {
        return this.aliqCofinsQuant;
    }

    public void setAliqCofinsQuant(BigDecimal aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_CONT_APUR", precision = 15, scale = 6)
    private BigDecimal vlContApur;

    public BigDecimal getVlContApur() {
        return this.vlContApur;
    }

    public void setVlContApur(BigDecimal vlContApur) {
        this.vlContApur = vlContApur;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_AJUS_ACRES", precision = 15, scale = 6)
    private BigDecimal vlAjusAcres;

    public BigDecimal getVlAjusAcres() {
        return this.vlAjusAcres;
    }

    public void setVlAjusAcres(BigDecimal vlAjusAcres) {
        this.vlAjusAcres = vlAjusAcres;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_AJUS_REDUC", precision = 15, scale = 6)
    private BigDecimal vlAjusReduc;

    public BigDecimal getVlAjusReduc() {
        return this.vlAjusReduc;
    }

    public void setVlAjusReduc(BigDecimal vlAjusReduc) {
        this.vlAjusReduc = vlAjusReduc;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_CONT_DIFER", precision = 15, scale = 6)
    private BigDecimal vlContDifer;

    public BigDecimal getVlContDifer() {
        return this.vlContDifer;
    }

    public void setVlContDifer(BigDecimal vlContDifer) {
        this.vlContDifer = vlContDifer;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_CONT_DIFER_ANT", precision = 15, scale = 6)
    private BigDecimal vlContDiferAnt;

    public BigDecimal getVlContDiferAnt() {
        return this.vlContDiferAnt;
    }

    public void setVlContDiferAnt(BigDecimal vlContDiferAnt) {
        this.vlContDiferAnt = vlContDiferAnt;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_CONT_PER", precision = 15, scale = 6)
    private BigDecimal vlContPer;

    public BigDecimal getVlContPer() {
        return this.vlContPer;
    }

    public void setVlContPer(BigDecimal vlContPer) {
        this.vlContPer = vlContPer;
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
        final RegM610 other = (RegM610) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM610{" + "id=" + id + '}';
    }
}
