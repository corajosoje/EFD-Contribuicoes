package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
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
@Table(name = "reg_0111")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0111.findAll", query = "SELECT r FROM Reg0111 r"),
    @NamedQuery(name = "Reg0111.findById", query = "SELECT r FROM Reg0111 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0111.findByIdPai", query = "SELECT r FROM Reg0111 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0111.findByLinha", query = "SELECT r FROM Reg0111 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0111.findByHashfile", query = "SELECT r FROM Reg0111 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0111.findByReg", query = "SELECT r FROM Reg0111 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0111.findByRecBruNcumTribMi", query = "SELECT r FROM Reg0111 r WHERE r.recBruNcumTribMi = :recBruNcumTribMi"),
    @NamedQuery(name = "Reg0111.findByRecBruNcumNtMi", query = "SELECT r FROM Reg0111 r WHERE r.recBruNcumNtMi = :recBruNcumNtMi"),
    @NamedQuery(name = "Reg0111.findByRecBruNcumExp", query = "SELECT r FROM Reg0111 r WHERE r.recBruNcumExp = :recBruNcumExp"),
    @NamedQuery(name = "Reg0111.findByRecBruCum", query = "SELECT r FROM Reg0111 r WHERE r.recBruCum = :recBruCum"),
    @NamedQuery(name = "Reg0111.findByRecBruTotal", query = "SELECT r FROM Reg0111 r WHERE r.recBruTotal = :recBruTotal")})
@Registros(nivel = 3)
public class Reg0111 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0110 idPai;

    @Override
    public Reg0110 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0110) idPai;
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

    public String getReg() {
        return this.reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "REC_BRU_NCUM_TRIB_MI", precision = 15, scale = 6)
    private BigDecimal recBruNcumTribMi;

    public BigDecimal getRecBruNcumTribMi() {
        return this.recBruNcumTribMi;
    }

    public void setRecBruNcumTribMi(BigDecimal recBruNcumTribMi) {
        this.recBruNcumTribMi = recBruNcumTribMi;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "REC_BRU_NCUM_NT_MI", precision = 15, scale = 6)
    private BigDecimal recBruNcumNtMi;

    public BigDecimal getRecBruNcumNtMi() {
        return this.recBruNcumNtMi;
    }

    public void setRecBruNcumNtMi(BigDecimal recBruNcumNtMi) {
        this.recBruNcumNtMi = recBruNcumNtMi;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "REC_BRU_NCUM_EXP", precision = 15, scale = 6)
    private BigDecimal recBruNcumExp;

    public BigDecimal getRecBruNcumExp() {
        return this.recBruNcumExp;
    }

    public void setRecBruNcumExp(BigDecimal recBruNcumExp) {
        this.recBruNcumExp = recBruNcumExp;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "REC_BRU_CUM", precision = 15, scale = 6)
    private BigDecimal recBruCum;

    public BigDecimal getRecBruCum() {
        return this.recBruCum;
    }

    public void setRecBruCum(BigDecimal recBruCum) {
        this.recBruCum = recBruCum;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "REC_BRU_TOTAL", precision = 15, scale = 6)
    private BigDecimal recBruTotal;

    public BigDecimal getRecBruTotal() {
        return this.recBruTotal;
    }

    public void setRecBruTotal(BigDecimal recBruTotal) {
        this.recBruTotal = recBruTotal;
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
        final Reg0111 other = (Reg0111) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0111{" + "id=" + id + '}';
    }
}
