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
@Table(name = "reg_c381")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC381.findAll", query = "SELECT r FROM RegC381 r"),
    @NamedQuery(name = "RegC381.findById", query = "SELECT r FROM RegC381 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC381.findByIdPai", query = "SELECT r FROM RegC381 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC381.findByLinha", query = "SELECT r FROM RegC381 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC381.findByHashfile", query = "SELECT r FROM RegC381 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC381.findByReg", query = "SELECT r FROM RegC381 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC381.findByCstPis", query = "SELECT r FROM RegC381 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegC381.findByCodItem", query = "SELECT r FROM RegC381 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC381.findByVlItem", query = "SELECT r FROM RegC381 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC381.findByVlBcPis", query = "SELECT r FROM RegC381 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegC381.findByAliqPis", query = "SELECT r FROM RegC381 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegC381.findByQuantBcPis", query = "SELECT r FROM RegC381 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegC381.findByAliqPisQuant", query = "SELECT r FROM RegC381 r WHERE r.aliqPisQuant = :aliqPisQuant"),
    @NamedQuery(name = "RegC381.findByVlPis", query = "SELECT r FROM RegC381 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC381.findByCodCta", query = "SELECT r FROM RegC381 r WHERE r.codCta = :codCta")})
@Registros(nivel = 4)
public class RegC381 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC380 idPai;

    @Override
    public RegC380 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC380) idPai;
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;

    public String getCodItem() {
        return this.codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;

    public BigDecimal getVlItem() {
        return this.vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "QUANT_BC_PIS", precision = 15, scale = 6)
    private BigDecimal quantBcPis;

    public BigDecimal getQuantBcPis() {
        return this.quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "ALIQ_PIS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqPisQuant;

    public BigDecimal getAliqPisQuant() {
        return this.aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 10, tipo = 'C')
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
        final RegC381 other = (RegC381) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC381{" + "id=" + id + '}';
    }
}
