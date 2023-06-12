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
@Table(name = "reg_f500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF500.findAll", query = "SELECT r FROM RegF500 r"),
    @NamedQuery(name = "RegF500.findById", query = "SELECT r FROM RegF500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF500.findByIdPai", query = "SELECT r FROM RegF500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF500.findByLinha", query = "SELECT r FROM RegF500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF500.findByHashfile", query = "SELECT r FROM RegF500 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF500.findByReg", query = "SELECT r FROM RegF500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF500.findByVlRecCaixa", query = "SELECT r FROM RegF500 r WHERE r.vlRecCaixa = :vlRecCaixa"),
    @NamedQuery(name = "RegF500.findByCstPis", query = "SELECT r FROM RegF500 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF500.findByVlDescPis", query = "SELECT r FROM RegF500 r WHERE r.vlDescPis = :vlDescPis"),
    @NamedQuery(name = "RegF500.findByVlBcPis", query = "SELECT r FROM RegF500 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegF500.findByAliqPis", query = "SELECT r FROM RegF500 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegF500.findByVlPis", query = "SELECT r FROM RegF500 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegF500.findByCstCofins", query = "SELECT r FROM RegF500 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF500.findByVlDescCofins", query = "SELECT r FROM RegF500 r WHERE r.vlDescCofins = :vlDescCofins"),
    @NamedQuery(name = "RegF500.findByVlBcCofins", query = "SELECT r FROM RegF500 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegF500.findByAliqCofins", query = "SELECT r FROM RegF500 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegF500.findByVlCofins", query = "SELECT r FROM RegF500 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegF500.findByCodMod", query = "SELECT r FROM RegF500 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegF500.findByCfop", query = "SELECT r FROM RegF500 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegF500.findByCodCta", query = "SELECT r FROM RegF500 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegF500.findByInfoCompl", query = "SELECT r FROM RegF500 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 3)
public class RegF500 implements Serializable, BlocoSped {

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
    private List<RegF509> regF509;

    public List<RegF509> getRegF509() {
        return regF509;
    }

    public void setRegF509(List<RegF509> regF509) {
        this.regF509 = regF509;
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
    @Column(name = "VL_REC_CAIXA", precision = 15, scale = 6)
    private BigDecimal vlRecCaixa;

    public BigDecimal getVlRecCaixa() {
        return this.vlRecCaixa;
    }

    public void setVlRecCaixa(BigDecimal vlRecCaixa) {
        this.vlRecCaixa = vlRecCaixa;
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
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
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
        final RegF500 other = (RegF500) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF500{" + "id=" + id + '}';
    }
}
