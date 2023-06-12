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
@Table(name = "reg_f700")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF700.findAll", query = "SELECT r FROM RegF700 r"),
    @NamedQuery(name = "RegF700.findById", query = "SELECT r FROM RegF700 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF700.findByIdPai", query = "SELECT r FROM RegF700 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF700.findByLinha", query = "SELECT r FROM RegF700 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF700.findByHashfile", query = "SELECT r FROM RegF700 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF700.findByReg", query = "SELECT r FROM RegF700 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF700.findByIndOriDed", query = "SELECT r FROM RegF700 r WHERE r.indOriDed = :indOriDed"),
    @NamedQuery(name = "RegF700.findByIndNatDed", query = "SELECT r FROM RegF700 r WHERE r.indNatDed = :indNatDed"),
    @NamedQuery(name = "RegF700.findByVlDedPis", query = "SELECT r FROM RegF700 r WHERE r.vlDedPis = :vlDedPis"),
    @NamedQuery(name = "RegF700.findByVlDedCofins", query = "SELECT r FROM RegF700 r WHERE r.vlDedCofins = :vlDedCofins"),
    @NamedQuery(name = "RegF700.findByVlBcOper", query = "SELECT r FROM RegF700 r WHERE r.vlBcOper = :vlBcOper"),
    @NamedQuery(name = "RegF700.findByCnpj", query = "SELECT r FROM RegF700 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "RegF700.findByInfComp", query = "SELECT r FROM RegF700 r WHERE r.infComp = :infComp")})
@Registros(nivel = 3)
public class RegF700 implements Serializable, BlocoSped {

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
    @Column(name = "IND_ORI_DED")
    private String indOriDed;

    public String getIndOriDed() {
        return this.indOriDed;
    }

    public void setIndOriDed(String indOriDed) {
        this.indOriDed = indOriDed;
    }

    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "IND_NAT_DED")
    private int indNatDed;

    public int getIndNatDed() {
        return this.indNatDed;
    }

    public void setIndNatDed(int indNatDed) {
        this.indNatDed = indNatDed;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_DED_PIS", precision = 15, scale = 6)
    private BigDecimal vlDedPis;

    public BigDecimal getVlDedPis() {
        return this.vlDedPis;
    }

    public void setVlDedPis(BigDecimal vlDedPis) {
        this.vlDedPis = vlDedPis;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_DED_COFINS", precision = 15, scale = 6)
    private BigDecimal vlDedCofins;

    public BigDecimal getVlDedCofins() {
        return this.vlDedCofins;
    }

    public void setVlDedCofins(BigDecimal vlDedCofins) {
        this.vlDedCofins = vlDedCofins;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_OPER", precision = 15, scale = 6)
    private BigDecimal vlBcOper;

    public BigDecimal getVlBcOper() {
        return this.vlBcOper;
    }

    public void setVlBcOper(BigDecimal vlBcOper) {
        this.vlBcOper = vlBcOper;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "INF_COMP")
    private String infComp;

    public String getInfComp() {
        return this.infComp;
    }

    public void setInfComp(String infComp) {
        this.infComp = infComp;
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
        final RegF700 other = (RegF700) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF700{" + "id=" + id + '}';
    }
}
