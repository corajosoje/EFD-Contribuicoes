package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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
@Table(name = "reg_c195")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC195.findAll", query = "SELECT r FROM RegC195 r"),
    @NamedQuery(name = "RegC195.findById", query = "SELECT r FROM RegC195 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC195.findByIdPai", query = "SELECT r FROM RegC195 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC195.findByLinha", query = "SELECT r FROM RegC195 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC195.findByHashfile", query = "SELECT r FROM RegC195 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC195.findByReg", query = "SELECT r FROM RegC195 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC195.findByCnpjCpfPart", query = "SELECT r FROM RegC195 r WHERE r.cnpjCpfPart = :cnpjCpfPart"),
    @NamedQuery(name = "RegC195.findByCstCofins", query = "SELECT r FROM RegC195 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegC195.findByCfop", query = "SELECT r FROM RegC195 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC195.findByVlItem", query = "SELECT r FROM RegC195 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC195.findByVlDesc", query = "SELECT r FROM RegC195 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC195.findByVlBcCofins", query = "SELECT r FROM RegC195 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegC195.findByAliqCofins", query = "SELECT r FROM RegC195 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegC195.findByQuantBcCofins", query = "SELECT r FROM RegC195 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegC195.findByAliqCofinsQuant", query = "SELECT r FROM RegC195 r WHERE r.aliqCofinsQuant = :aliqCofinsQuant"),
    @NamedQuery(name = "RegC195.findByVlCofins", query = "SELECT r FROM RegC195 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC195.findByCodCta", query = "SELECT r FROM RegC195 r WHERE r.codCta = :codCta")})
@Registros(nivel = 4)
public class RegC195 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC190 idPai;

    @Override
    public RegC190 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC190) idPai;
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
    @Column(name = "CNPJ_CPF_PART")
    private String cnpjCpfPart;

    public String getCnpjCpfPart() {
        return this.cnpjCpfPart;
    }

    public void setCnpjCpfPart(String cnpjCpfPart) {
        this.cnpjCpfPart = cnpjCpfPart;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "CFOP")
    private int cfop;

    public int getCfop() {
        return this.cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;

    public BigDecimal getVlItem() {
        return this.vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
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
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 12, tipo = 'C')
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
        final RegC195 other = (RegC195) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC195{" + "id=" + id + '}';
    }
}
