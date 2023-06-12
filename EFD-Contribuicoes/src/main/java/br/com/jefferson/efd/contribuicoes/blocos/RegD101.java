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
@Table(name = "reg_d101")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD101.findAll", query = "SELECT r FROM RegD101 r"),
    @NamedQuery(name = "RegD101.findById", query = "SELECT r FROM RegD101 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD101.findByIdPai", query = "SELECT r FROM RegD101 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD101.findByLinha", query = "SELECT r FROM RegD101 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD101.findByHashfile", query = "SELECT r FROM RegD101 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD101.findByReg", query = "SELECT r FROM RegD101 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD101.findByIndNatFrt", query = "SELECT r FROM RegD101 r WHERE r.indNatFrt = :indNatFrt"),
    @NamedQuery(name = "RegD101.findByVlItem", query = "SELECT r FROM RegD101 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegD101.findByCstPis", query = "SELECT r FROM RegD101 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegD101.findByNatBcCred", query = "SELECT r FROM RegD101 r WHERE r.natBcCred = :natBcCred"),
    @NamedQuery(name = "RegD101.findByVlBcPis", query = "SELECT r FROM RegD101 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegD101.findByAliqPis", query = "SELECT r FROM RegD101 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegD101.findByVlPis", query = "SELECT r FROM RegD101 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegD101.findByCodCta", query = "SELECT r FROM RegD101 r WHERE r.codCta = :codCta")})
@Registros(nivel = 4)
public class RegD101 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD100 idPai;

    @Override
    public RegD100 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegD100) idPai;
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
    @Column(name = "IND_NAT_FRT")
    private String indNatFrt;

    public String getIndNatFrt() {
        return this.indNatFrt;
    }

    public void setIndNatFrt(String indNatFrt) {
        this.indNatFrt = indNatFrt;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;

    public BigDecimal getVlItem() {
        return this.vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "NAT_BC_CRED")
    private String natBcCred;

    public String getNatBcCred() {
        return this.natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
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
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 9, tipo = 'C')
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
        final RegD101 other = (RegD101) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegD101{" + "id=" + id + '}';
    }
}
