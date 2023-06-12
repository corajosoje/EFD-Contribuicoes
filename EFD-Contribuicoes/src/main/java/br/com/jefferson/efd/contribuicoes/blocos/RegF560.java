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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_f560")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF560.findAll", query = "SELECT r FROM RegF560 r"),
    @NamedQuery(name = "RegF560.findById", query = "SELECT r FROM RegF560 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF560.findByIdPai", query = "SELECT r FROM RegF560 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF560.findByLinha", query = "SELECT r FROM RegF560 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF560.findByHashfile", query = "SELECT r FROM RegF560 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF560.findByReg", query = "SELECT r FROM RegF560 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF560.findByVlRecComp", query = "SELECT r FROM RegF560 r WHERE r.vlRecComp = :vlRecComp"),
    @NamedQuery(name = "RegF560.findByCstPis", query = "SELECT r FROM RegF560 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF560.findByVlDescPis", query = "SELECT r FROM RegF560 r WHERE r.vlDescPis = :vlDescPis"),
    @NamedQuery(name = "RegF560.findByQuantBcPis", query = "SELECT r FROM RegF560 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegF560.findByAliqPisQuant", query = "SELECT r FROM RegF560 r WHERE r.aliqPisQuant = :aliqPisQuant"),
    @NamedQuery(name = "RegF560.findByVlPis", query = "SELECT r FROM RegF560 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegF560.findByCstCofins", query = "SELECT r FROM RegF560 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF560.findByVlDescCofins", query = "SELECT r FROM RegF560 r WHERE r.vlDescCofins = :vlDescCofins"),
    @NamedQuery(name = "RegF560.findByQuantBcCofins", query = "SELECT r FROM RegF560 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegF560.findByAliqCofinsQuant", query = "SELECT r FROM RegF560 r WHERE r.aliqCofinsQuant = :aliqCofinsQuant"),
    @NamedQuery(name = "RegF560.findByVlCofins", query = "SELECT r FROM RegF560 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegF560.findByCodMod", query = "SELECT r FROM RegF560 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegF560.findByCfop", query = "SELECT r FROM RegF560 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegF560.findByCodCta", query = "SELECT r FROM RegF560 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegF560.findByInfoCompl", query = "SELECT r FROM RegF560 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 3)
public class RegF560 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegF010 idPai;

    @Override
    public RegF010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegF010) idPai;
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
    private List<RegF569> regF569;

    public List<RegF569> getRegF569() {
        return regF569;
    }

    public void setRegF569(List<RegF569> regF569) {
        this.regF569 = regF569;
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_REC_COMP", precision = 15, scale = 6)
    private BigDecimal vlRecComp;

    public BigDecimal getVlRecComp() {
        return this.vlRecComp;
    }

    public void setVlRecComp(BigDecimal vlRecComp) {
        this.vlRecComp = vlRecComp;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_DESC_PIS", precision = 15, scale = 6)
    private BigDecimal vlDescPis;

    public BigDecimal getVlDescPis() {
        return this.vlDescPis;
    }

    public void setVlDescPis(BigDecimal vlDescPis) {
        this.vlDescPis = vlDescPis;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "QUANT_BC_PIS", precision = 15, scale = 6)
    private BigDecimal quantBcPis;

    public BigDecimal getQuantBcPis() {
        return this.quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "ALIQ_PIS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqPisQuant;

    public BigDecimal getAliqPisQuant() {
        return this.aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_DESC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlDescCofins;

    public BigDecimal getVlDescCofins() {
        return this.vlDescCofins;
    }

    public void setVlDescCofins(BigDecimal vlDescCofins) {
        this.vlDescCofins = vlDescCofins;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "QUANT_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal quantBcCofins;

    public BigDecimal getQuantBcCofins() {
        return this.quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "ALIQ_COFINS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqCofinsQuant;

    public BigDecimal getAliqCofinsQuant() {
        return this.aliqCofinsQuant;
    }

    public void setAliqCofinsQuant(BigDecimal aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    @Campos(posicao = 14, tipo = 'I')
    @Column(name = "CFOP")
    private int cfop;

    public int getCfop() {
        return this.cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }
    @Campos(posicao = 15, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 16, tipo = 'C')
    @Column(name = "INFO_COMPL")
    private String infoCompl;

    public String getInfoCompl() {
        return this.infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
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
        final RegF560 other = (RegF560) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF560{" + "id=" + id + '}';
    }
}
