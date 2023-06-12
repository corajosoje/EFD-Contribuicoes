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
@Table(name = "reg_f150")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF150.findAll", query = "SELECT r FROM RegF150 r"),
    @NamedQuery(name = "RegF150.findById", query = "SELECT r FROM RegF150 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF150.findByIdPai", query = "SELECT r FROM RegF150 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF150.findByLinha", query = "SELECT r FROM RegF150 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF150.findByHashfile", query = "SELECT r FROM RegF150 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF150.findByReg", query = "SELECT r FROM RegF150 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF150.findByNatBcCred", query = "SELECT r FROM RegF150 r WHERE r.natBcCred = :natBcCred"),
    @NamedQuery(name = "RegF150.findByVlTotEst", query = "SELECT r FROM RegF150 r WHERE r.vlTotEst = :vlTotEst"),
    @NamedQuery(name = "RegF150.findByEstImp", query = "SELECT r FROM RegF150 r WHERE r.estImp = :estImp"),
    @NamedQuery(name = "RegF150.findByVlBcEst", query = "SELECT r FROM RegF150 r WHERE r.vlBcEst = :vlBcEst"),
    @NamedQuery(name = "RegF150.findByVlBcMenEst", query = "SELECT r FROM RegF150 r WHERE r.vlBcMenEst = :vlBcMenEst"),
    @NamedQuery(name = "RegF150.findByCstPis", query = "SELECT r FROM RegF150 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF150.findByAliqPis", query = "SELECT r FROM RegF150 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegF150.findByVlCredPis", query = "SELECT r FROM RegF150 r WHERE r.vlCredPis = :vlCredPis"),
    @NamedQuery(name = "RegF150.findByCstCofins", query = "SELECT r FROM RegF150 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF150.findByAliqCofins", query = "SELECT r FROM RegF150 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegF150.findByVlCredCofins", query = "SELECT r FROM RegF150 r WHERE r.vlCredCofins = :vlCredCofins"),
    @NamedQuery(name = "RegF150.findByDescEst", query = "SELECT r FROM RegF150 r WHERE r.descEst = :descEst"),
    @NamedQuery(name = "RegF150.findByCodCta", query = "SELECT r FROM RegF150 r WHERE r.codCta = :codCta")})
@Registros(nivel = 3)
public class RegF150 implements Serializable, BlocoSped {

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
    @Column(name = "NAT_BC_CRED")
    private String natBcCred;

    public String getNatBcCred() {
        return this.natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_TOT_EST", precision = 15, scale = 6)
    private BigDecimal vlTotEst;

    public BigDecimal getVlTotEst() {
        return this.vlTotEst;
    }

    public void setVlTotEst(BigDecimal vlTotEst) {
        this.vlTotEst = vlTotEst;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "EST_IMP", precision = 15, scale = 6)
    private BigDecimal estImp;

    public BigDecimal getEstImp() {
        return this.estImp;
    }

    public void setEstImp(BigDecimal estImp) {
        this.estImp = estImp;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_BC_EST", precision = 15, scale = 6)
    private BigDecimal vlBcEst;

    public BigDecimal getVlBcEst() {
        return this.vlBcEst;
    }

    public void setVlBcEst(BigDecimal vlBcEst) {
        this.vlBcEst = vlBcEst;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_MEN_EST", precision = 15, scale = 6)
    private BigDecimal vlBcMenEst;

    public BigDecimal getVlBcMenEst() {
        return this.vlBcMenEst;
    }

    public void setVlBcMenEst(BigDecimal vlBcMenEst) {
        this.vlBcMenEst = vlBcMenEst;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
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
    @Column(name = "VL_CRED_PIS", precision = 15, scale = 6)
    private BigDecimal vlCredPis;

    public BigDecimal getVlCredPis() {
        return this.vlCredPis;
    }

    public void setVlCredPis(BigDecimal vlCredPis) {
        this.vlCredPis = vlCredPis;
    }
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
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
    @Column(name = "VL_CRED_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCredCofins;

    public BigDecimal getVlCredCofins() {
        return this.vlCredCofins;
    }

    public void setVlCredCofins(BigDecimal vlCredCofins) {
        this.vlCredCofins = vlCredCofins;
    }

    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "DESC_EST")
    private String descEst;

    public String getDescEst() {
        return this.descEst;
    }

    public void setDescEst(String descEst) {
        this.descEst = descEst;
    }
    @Campos(posicao = 14, tipo = 'C')
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
        final RegF150 other = (RegF150) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF150{" + "id=" + id + '}';
    }
}
