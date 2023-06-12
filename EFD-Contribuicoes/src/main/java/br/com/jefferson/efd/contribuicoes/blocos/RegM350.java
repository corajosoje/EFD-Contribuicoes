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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_m350")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM350.findAll", query = "SELECT r FROM RegM350 r"),
    @NamedQuery(name = "RegM350.findById", query = "SELECT r FROM RegM350 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM350.findByIdPai", query = "SELECT r FROM RegM350 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM350.findByLinha", query = "SELECT r FROM RegM350 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM350.findByHashfile", query = "SELECT r FROM RegM350 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM350.findByReg", query = "SELECT r FROM RegM350 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM350.findByVlTotFol", query = "SELECT r FROM RegM350 r WHERE r.vlTotFol = :vlTotFol"),
    @NamedQuery(name = "RegM350.findByVlExcBc", query = "SELECT r FROM RegM350 r WHERE r.vlExcBc = :vlExcBc"),
    @NamedQuery(name = "RegM350.findByVlTotBc", query = "SELECT r FROM RegM350 r WHERE r.vlTotBc = :vlTotBc"),
    @NamedQuery(name = "RegM350.findByAliqPisFol", query = "SELECT r FROM RegM350 r WHERE r.aliqPisFol = :aliqPisFol"),
    @NamedQuery(name = "RegM350.findByVlTotContFol", query = "SELECT r FROM RegM350 r WHERE r.vlTotContFol = :vlTotContFol")})
@Registros(nivel = 2)
public class RegM350 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM001 idPai;

    @Override
    public RegM001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM001) idPai;
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_TOT_FOL", precision = 15, scale = 6)
    private BigDecimal vlTotFol;

    public BigDecimal getVlTotFol() {
        return this.vlTotFol;
    }

    public void setVlTotFol(BigDecimal vlTotFol) {
        this.vlTotFol = vlTotFol;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_EXC_BC", precision = 15, scale = 6)
    private BigDecimal vlExcBc;

    public BigDecimal getVlExcBc() {
        return this.vlExcBc;
    }

    public void setVlExcBc(BigDecimal vlExcBc) {
        this.vlExcBc = vlExcBc;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_TOT_BC", precision = 15, scale = 6)
    private BigDecimal vlTotBc;

    public BigDecimal getVlTotBc() {
        return this.vlTotBc;
    }

    public void setVlTotBc(BigDecimal vlTotBc) {
        this.vlTotBc = vlTotBc;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "ALIQ_PIS_FOL", precision = 15, scale = 6)
    private BigDecimal aliqPisFol;

    public BigDecimal getAliqPisFol() {
        return this.aliqPisFol;
    }

    public void setAliqPisFol(BigDecimal aliqPisFol) {
        this.aliqPisFol = aliqPisFol;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_TOT_CONT_FOL", precision = 15, scale = 6)
    private BigDecimal vlTotContFol;

    public BigDecimal getVlTotContFol() {
        return this.vlTotContFol;
    }

    public void setVlTotContFol(BigDecimal vlTotContFol) {
        this.vlTotContFol = vlTotContFol;
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
        final RegM350 other = (RegM350) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM350{" + "id=" + id + '}';
    }
}
