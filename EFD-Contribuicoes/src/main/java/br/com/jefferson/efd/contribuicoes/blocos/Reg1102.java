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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1102")
@Registros(nivel = 4)
public class Reg1102 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1101 idPai;

    @Override
    public Reg1101 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg1101) idPai;
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
    @Column(name = "VL_CRED_PIS_TRIB_MI", precision = 15, scale = 6)
    private BigDecimal vlCredPisTribMi;

    public BigDecimal getVlCredPisTribMi() {
        return this.vlCredPisTribMi;
    }

    public void setVlCredPisTribMi(BigDecimal vlCredPisTribMi) {
        this.vlCredPisTribMi = vlCredPisTribMi;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_CRED_PIS_NT_MI", precision = 15, scale = 6)
    private BigDecimal vlCredPisNtMi;

    public BigDecimal getVlCredPisNtMi() {
        return this.vlCredPisNtMi;
    }

    public void setVlCredPisNtMi(BigDecimal vlCredPisNtMi) {
        this.vlCredPisNtMi = vlCredPisNtMi;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_CRED_PIS_EXP", precision = 15, scale = 6)
    private BigDecimal vlCredPisExp;

    public BigDecimal getVlCredPisExp() {
        return this.vlCredPisExp;
    }

    public void setVlCredPisExp(BigDecimal vlCredPisExp) {
        this.vlCredPisExp = vlCredPisExp;
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
        final Reg1102 other = (Reg1102) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1102{" + "id=" + id + '}';
    }
}
