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
@Table(name = "reg_m505")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM505.findAll", query = "SELECT r FROM RegM505 r"),
    @NamedQuery(name = "RegM505.findById", query = "SELECT r FROM RegM505 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM505.findByIdPai", query = "SELECT r FROM RegM505 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM505.findByLinha", query = "SELECT r FROM RegM505 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM505.findByHashfile", query = "SELECT r FROM RegM505 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM505.findByReg", query = "SELECT r FROM RegM505 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM505.findByNatBcCred", query = "SELECT r FROM RegM505 r WHERE r.natBcCred = :natBcCred"),
    @NamedQuery(name = "RegM505.findByCstCofins", query = "SELECT r FROM RegM505 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegM505.findByVlBcCofinsTot", query = "SELECT r FROM RegM505 r WHERE r.vlBcCofinsTot = :vlBcCofinsTot"),
    @NamedQuery(name = "RegM505.findByVlBcCofinsCum", query = "SELECT r FROM RegM505 r WHERE r.vlBcCofinsCum = :vlBcCofinsCum"),
    @NamedQuery(name = "RegM505.findByVlBcCofinsNc", query = "SELECT r FROM RegM505 r WHERE r.vlBcCofinsNc = :vlBcCofinsNc"),
    @NamedQuery(name = "RegM505.findByVlBcCofins", query = "SELECT r FROM RegM505 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegM505.findByQuantBcCofinsTot", query = "SELECT r FROM RegM505 r WHERE r.quantBcCofinsTot = :quantBcCofinsTot"),
    @NamedQuery(name = "RegM505.findByQuantBcCofins", query = "SELECT r FROM RegM505 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegM505.findByDescCred", query = "SELECT r FROM RegM505 r WHERE r.descCred = :descCred")})
@Registros(nivel = 3)
public class RegM505 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM500 idPai;

    @Override
    public RegM500 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM500) idPai;
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
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_BC_COFINS_TOT", precision = 15, scale = 6)
    private BigDecimal vlBcCofinsTot;

    public BigDecimal getVlBcCofinsTot() {
        return this.vlBcCofinsTot;
    }

    public void setVlBcCofinsTot(BigDecimal vlBcCofinsTot) {
        this.vlBcCofinsTot = vlBcCofinsTot;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_BC_COFINS_CUM", precision = 15, scale = 6)
    private BigDecimal vlBcCofinsCum;

    public BigDecimal getVlBcCofinsCum() {
        return this.vlBcCofinsCum;
    }

    public void setVlBcCofinsCum(BigDecimal vlBcCofinsCum) {
        this.vlBcCofinsCum = vlBcCofinsCum;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_COFINS_NC", precision = 15, scale = 6)
    private BigDecimal vlBcCofinsNc;

    public BigDecimal getVlBcCofinsNc() {
        return this.vlBcCofinsNc;
    }

    public void setVlBcCofinsNc(BigDecimal vlBcCofinsNc) {
        this.vlBcCofinsNc = vlBcCofinsNc;
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
    @Column(name = "QUANT_BC_COFINS_TOT", precision = 15, scale = 6)
    private BigDecimal quantBcCofinsTot;

    public BigDecimal getQuantBcCofinsTot() {
        return this.quantBcCofinsTot;
    }

    public void setQuantBcCofinsTot(BigDecimal quantBcCofinsTot) {
        this.quantBcCofinsTot = quantBcCofinsTot;
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
        final RegM505 other = (RegM505) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM505{" + "id=" + id + '}';
    }
}
