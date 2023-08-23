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
@Table(name = "reg_m105")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM105.findAll", query = "SELECT r FROM RegM105 r"),
    @NamedQuery(name = "RegM105.findById", query = "SELECT r FROM RegM105 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM105.findByIdPai", query = "SELECT r FROM RegM105 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM105.findByLinha", query = "SELECT r FROM RegM105 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM105.findByHashfile", query = "SELECT r FROM RegM105 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM105.findByReg", query = "SELECT r FROM RegM105 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM105.findByNatBcCred", query = "SELECT r FROM RegM105 r WHERE r.natBcCred = :natBcCred"),
    @NamedQuery(name = "RegM105.findByCstPis", query = "SELECT r FROM RegM105 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegM105.findByVlBcPisTot", query = "SELECT r FROM RegM105 r WHERE r.vlBcPisTot = :vlBcPisTot"),
    @NamedQuery(name = "RegM105.findByVlBcPisCum", query = "SELECT r FROM RegM105 r WHERE r.vlBcPisCum = :vlBcPisCum"),
    @NamedQuery(name = "RegM105.findByVlBcPisNc", query = "SELECT r FROM RegM105 r WHERE r.vlBcPisNc = :vlBcPisNc"),
    @NamedQuery(name = "RegM105.findByVlBcPis", query = "SELECT r FROM RegM105 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegM105.findByQuantBcPisTot", query = "SELECT r FROM RegM105 r WHERE r.quantBcPisTot = :quantBcPisTot"),
    @NamedQuery(name = "RegM105.findByQuantBcPis", query = "SELECT r FROM RegM105 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegM105.findByDescCred", query = "SELECT r FROM RegM105 r WHERE r.descCred = :descCred")})
@Registros(nivel = 3)
public class RegM105 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM100 idPai;

    @Override
    public RegM100 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM100) idPai;
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
    @Column(name = "VL_BC_PIS_TOT", precision = 15, scale = 6)
    private BigDecimal vlBcPisTot;

    public BigDecimal getVlBcPisTot() {
        return this.vlBcPisTot;
    }

    public void setVlBcPisTot(BigDecimal vlBcPisTot) {
        this.vlBcPisTot = vlBcPisTot;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_BC_PIS_CUM", precision = 15, scale = 6)
    private BigDecimal vlBcPisCum;

    public BigDecimal getVlBcPisCum() {
        return this.vlBcPisCum;
    }

    public void setVlBcPisCum(BigDecimal vlBcPisCum) {
        this.vlBcPisCum = vlBcPisCum;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_PIS_NC", precision = 15, scale = 6)
    private BigDecimal vlBcPisNc;

    public BigDecimal getVlBcPisNc() {
        return this.vlBcPisNc;
    }

    public void setVlBcPisNc(BigDecimal vlBcPisNc) {
        this.vlBcPisNc = vlBcPisNc;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "QUANT_BC_PIS_TOT", precision = 15, scale = 6)
    private BigDecimal quantBcPisTot;

    public BigDecimal getQuantBcPisTot() {
        return this.quantBcPisTot;
    }

    public void setQuantBcPisTot(BigDecimal quantBcPisTot) {
        this.quantBcPisTot = quantBcPisTot;
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
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "DESC_CRED")
    private String descCred;

    public String getDescCred() {
        return this.descCred;
    }

    public void setDescCred(String descCred) {
        this.descCred = descCred;
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
        final RegM105 other = (RegM105) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM105{" + "id=" + id + '}';
    }
}
