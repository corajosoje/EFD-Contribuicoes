package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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
@Table(name = "reg_m210")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM210.findAll", query = "SELECT r FROM RegM210 r"),
    @NamedQuery(name = "RegM210.findById", query = "SELECT r FROM RegM210 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM210.findByIdPai", query = "SELECT r FROM RegM210 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM210.findByLinha", query = "SELECT r FROM RegM210 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM210.findByHashfile", query = "SELECT r FROM RegM210 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM210.findByReg", query = "SELECT r FROM RegM210 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM210.findByCodCont", query = "SELECT r FROM RegM210 r WHERE r.codCont = :codCont"),
    @NamedQuery(name = "RegM210.findByVlRecBrt", query = "SELECT r FROM RegM210 r WHERE r.vlRecBrt = :vlRecBrt"),
    @NamedQuery(name = "RegM210.findByVlBcCont", query = "SELECT r FROM RegM210 r WHERE r.vlBcCont = :vlBcCont"),
    @NamedQuery(name = "RegM210.findByVlBcContAjus", query = "SELECT r FROM RegM210 r WHERE r.vlBcContAjus = :vlBcContAjus"),
    @NamedQuery(name = "RegM210.findByAliqPis", query = "SELECT r FROM RegM210 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegM210.findByQuantBcPis", query = "SELECT r FROM RegM210 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegM210.findByAliqPisQuant", query = "SELECT r FROM RegM210 r WHERE r.aliqPisQuant = :aliqPisQuant"),
    @NamedQuery(name = "RegM210.findByVlContApur", query = "SELECT r FROM RegM210 r WHERE r.vlContApur = :vlContApur"),
    @NamedQuery(name = "RegM210.findByVlAjusAcres", query = "SELECT r FROM RegM210 r WHERE r.vlAjusAcres = :vlAjusAcres"),
    @NamedQuery(name = "RegM210.findByVlAjusReduc", query = "SELECT r FROM RegM210 r WHERE r.vlAjusReduc = :vlAjusReduc"),
    @NamedQuery(name = "RegM210.findByVlContDifer", query = "SELECT r FROM RegM210 r WHERE r.vlContDifer = :vlContDifer"),
    @NamedQuery(name = "RegM210.findByVlContDiferAnt", query = "SELECT r FROM RegM210 r WHERE r.vlContDiferAnt = :vlContDiferAnt"),
    @NamedQuery(name = "RegM210.findByVlContPer", query = "SELECT r FROM RegM210 r WHERE r.vlContPer = :vlContPer")})
@Registros(nivel = 3)
public class RegM210 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM200 idPai;

    @Override
    public RegM200 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM200) idPai;
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
    private RegM211 regM211;

    public RegM211 getRegM211() {
        return regM211;
    }

    public void setRegM211(RegM211 regM211) {
        this.regM211 = regM211;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM215> regM215;

    public List<RegM215> getRegM215() {
        return regM215;
    }

    public void setRegM215(List<RegM215> regM215) {
        this.regM215 = regM215;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM220> regM220;

    public List<RegM220> getRegM220() {
        return regM220;
    }

    public void setRegM220(List<RegM220> regM220) {
        this.regM220 = regM220;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM230> regM230;

    public List<RegM230> getRegM230() {
        return regM230;
    }

    public void setRegM230(List<RegM230> regM230) {
        this.regM230 = regM230;
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
    @Column(name = "VL_AJUS_ACRES_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlAjusAcresBcPis;

    public BigDecimal getVlAjusAcresBcPis() {
        return this.vlAjusAcresBcPis;
    }

    public void setVlAjusAcresBcPis(BigDecimal vlAjusAcresBcPis) {
        this.vlAjusAcresBcPis = vlAjusAcresBcPis;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_AJUS_REDUC_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlAjusReducBcPis;

    public BigDecimal getVlAjusReducBcPis() {
        return this.vlAjusReducBcPis;
    }

    public void setVlAjusReducBcPis(BigDecimal vlAjusReducBcPis) {
        this.vlAjusReducBcPis = vlAjusReducBcPis;
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
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "QUANT_BC_PIS", precision = 15, scale = 6)
    private BigDecimal quantBcPis;

    public BigDecimal getQuantBcPis() {
        return this.quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "ALIQ_PIS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqPisQuant;

    public BigDecimal getAliqPisQuant() {
        return this.aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
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
        final RegM210 other = (RegM210) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM210{" + "id=" + id + '}';
    }
}
