package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c175")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC175.findAll", query = "SELECT r FROM RegC175 r"),
    @NamedQuery(name = "RegC175.findById", query = "SELECT r FROM RegC175 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC175.findByIdPai", query = "SELECT r FROM RegC175 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC175.findByLinha", query = "SELECT r FROM RegC175 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC175.findByHashfile", query = "SELECT r FROM RegC175 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC175.findByReg", query = "SELECT r FROM RegC175 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC175.findByCfop", query = "SELECT r FROM RegC175 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC175.findByVlOpr", query = "SELECT r FROM RegC175 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegC175.findByVlDesc", query = "SELECT r FROM RegC175 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC175.findByCstPis", query = "SELECT r FROM RegC175 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegC175.findByVlBcPis", query = "SELECT r FROM RegC175 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegC175.findByAliqPis", query = "SELECT r FROM RegC175 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegC175.findByQuantBcPis", query = "SELECT r FROM RegC175 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegC175.findByAliqPisQuant", query = "SELECT r FROM RegC175 r WHERE r.aliqPisQuant = :aliqPisQuant"),
    @NamedQuery(name = "RegC175.findByVlPis", query = "SELECT r FROM RegC175 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC175.findByCstCofins", query = "SELECT r FROM RegC175 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegC175.findByVlBcCofins", query = "SELECT r FROM RegC175 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegC175.findByAliqCofins", query = "SELECT r FROM RegC175 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegC175.findByQuantBcCofins", query = "SELECT r FROM RegC175 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegC175.findByAliqCofinsQuant", query = "SELECT r FROM RegC175 r WHERE r.aliqCofinsQuant = :aliqCofinsQuant"),
    @NamedQuery(name = "RegC175.findByVlCofins", query = "SELECT r FROM RegC175 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC175.findByCodCta", query = "SELECT r FROM RegC175 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegC175.findByInfoCompl", query = "SELECT r FROM RegC175 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 4)
public class RegC175 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    @Override
    public RegC100 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC100) idPai;
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "CFOP")
    private int cfop;

    public int getCfop() {
        return this.cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_OPR", precision = 15, scale = 6)
    private BigDecimal vlOpr;

    public BigDecimal getVlOpr() {
        return this.vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "QUANT_BC_PIS", precision = 15, scale = 6)
    private BigDecimal quantBcPis;

    public BigDecimal getQuantBcPis() {
        return this.quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "ALIQ_PIS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqPisQuant;

    public BigDecimal getAliqPisQuant() {
        return this.aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "QUANT_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal quantBcCofins;

    public BigDecimal getQuantBcCofins() {
        return this.quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "ALIQ_COFINS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqCofinsQuant;

    public BigDecimal getAliqCofinsQuant() {
        return this.aliqCofinsQuant;
    }

    public void setAliqCofinsQuant(BigDecimal aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 18, tipo = 'C')
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
        final RegC175 other = (RegC175) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC175{" + "id=" + id + '}';
    }
}
