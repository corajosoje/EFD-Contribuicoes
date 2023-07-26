package br.com.jefferson.efd.contribuicoes.blocos;

import java.io.Serializable;
import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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
@Table(name = "reg_0900")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0900.findAll", query = "SELECT r FROM Reg0900 r"),
    @NamedQuery(name = "Reg0900.findById", query = "SELECT r FROM Reg0900 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0900.findByIdPai", query = "SELECT r FROM Reg0900 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0900.findByLinha", query = "SELECT r FROM Reg0900 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0900.findByHashfile", query = "SELECT r FROM Reg0900 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0900.findByReg", query = "SELECT r FROM Reg0900 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0900.findByRecTotalBlocoA", query = "SELECT r FROM Reg0900 r WHERE r.recTotalBlocoA = :recTotalBlocoA"),
    @NamedQuery(name = "Reg0900.findByRecNrbBlocoA", query = "SELECT r FROM Reg0900 r WHERE r.recNrbBlocoA = :recNrbBlocoA"),
    @NamedQuery(name = "Reg0900.findByRecTotalBlocoC", query = "SELECT r FROM Reg0900 r WHERE r.recTotalBlocoC = :recTotalBlocoC"),
    @NamedQuery(name = "Reg0900.findByRecNrbBlocoC", query = "SELECT r FROM Reg0900 r WHERE r.recNrbBlocoC = :recNrbBlocoC"),
    @NamedQuery(name = "Reg0900.findByRecTotalBlocoD", query = "SELECT r FROM Reg0900 r WHERE r.recTotalBlocoD = :recTotalBlocoD"),
    @NamedQuery(name = "Reg0900.findByRecNrbBlocoD", query = "SELECT r FROM Reg0900 r WHERE r.recNrbBlocoD = :recNrbBlocoD"),
    @NamedQuery(name = "Reg0900.findByRecTotalBlocoF", query = "SELECT r FROM Reg0900 r WHERE r.recTotalBlocoF = :recTotalBlocoF"),
    @NamedQuery(name = "Reg0900.findByRecNrbBlocoF", query = "SELECT r FROM Reg0900 r WHERE r.recNrbBlocoF = :recNrbBlocoF"),
    @NamedQuery(name = "Reg0900.findByRecTotalBlocoI", query = "SELECT r FROM Reg0900 r WHERE r.recTotalBlocoI = :recTotalBlocoI"),
    @NamedQuery(name = "Reg0900.findByRecNrbBlocoI", query = "SELECT r FROM Reg0900 r WHERE r.recNrbBlocoI = :recNrbBlocoI"),
    @NamedQuery(name = "Reg0900.findByRecTotalBloco1", query = "SELECT r FROM Reg0900 r WHERE r.recTotalBloco1 = :recTotalBloco1"),
    @NamedQuery(name = "Reg0900.findByRecNrbBloco1", query = "SELECT r FROM Reg0900 r WHERE r.recNrbBloco1 = :recNrbBloco1"),
    @NamedQuery(name = "Reg0900.findByRecTotalPeriodo", query = "SELECT r FROM Reg0900 r WHERE r.recTotalPeriodo = :recTotalPeriodo"),
    @NamedQuery(name = "Reg0900.findByRecTotalNrbPeriodo", query = "SELECT r FROM Reg0900 r WHERE r.recTotalNrbPeriodo = :recTotalNrbPeriodo")})
@Registros(nivel = 2)
public class Reg0900 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    @Override
    public Reg0001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
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
    @Column(name = "REC_TOTAL_BLOCO_A", precision = 15, scale = 6)
    private BigDecimal recTotalBlocoA;

    public BigDecimal getRecTotalBlocoA() {
        return this.recTotalBlocoA;
    }

    public void setRecTotalBlocoA(BigDecimal recTotalBlocoA) {
        this.recTotalBlocoA = recTotalBlocoA;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "REC_NRB_BLOCO_A", precision = 15, scale = 6)
    private BigDecimal recNrbBlocoA;

    public BigDecimal getRecNrbBlocoA() {
        return this.recNrbBlocoA;
    }

    public void setRecNrbBlocoA(BigDecimal recNrbBlocoA) {
        this.recNrbBlocoA = recNrbBlocoA;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "REC_TOTAL_BLOCO_C", precision = 15, scale = 6)
    private BigDecimal recTotalBlocoC;

    public BigDecimal getRecTotalBlocoC() {
        return this.recTotalBlocoC;
    }

    public void setRecTotalBlocoC(BigDecimal recTotalBlocoC) {
        this.recTotalBlocoC = recTotalBlocoC;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "REC_NRB_BLOCO_C", precision = 15, scale = 6)
    private BigDecimal recNrbBlocoC;

    public BigDecimal getRecNrbBlocoC() {
        return this.recNrbBlocoC;
    }

    public void setRecNrbBlocoC(BigDecimal recNrbBlocoC) {
        this.recNrbBlocoC = recNrbBlocoC;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "REC_TOTAL_BLOCO_D", precision = 15, scale = 6)
    private BigDecimal recTotalBlocoD;

    public BigDecimal getRecTotalBlocoD() {
        return this.recTotalBlocoD;
    }

    public void setRecTotalBlocoD(BigDecimal recTotalBlocoD) {
        this.recTotalBlocoD = recTotalBlocoD;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "REC_NRB_BLOCO_D", precision = 15, scale = 6)
    private BigDecimal recNrbBlocoD;

    public BigDecimal getRecNrbBlocoD() {
        return this.recNrbBlocoD;
    }

    public void setRecNrbBlocoD(BigDecimal recNrbBlocoD) {
        this.recNrbBlocoD = recNrbBlocoD;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "REC_TOTAL_BLOCO_F", precision = 15, scale = 6)
    private BigDecimal recTotalBlocoF;

    public BigDecimal getRecTotalBlocoF() {
        return this.recTotalBlocoF;
    }

    public void setRecTotalBlocoF(BigDecimal recTotalBlocoF) {
        this.recTotalBlocoF = recTotalBlocoF;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "REC_NRB_BLOCO_F", precision = 15, scale = 6)
    private BigDecimal recNrbBlocoF;

    public BigDecimal getRecNrbBlocoF() {
        return this.recNrbBlocoF;
    }

    public void setRecNrbBlocoF(BigDecimal recNrbBlocoF) {
        this.recNrbBlocoF = recNrbBlocoF;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "REC_TOTAL_BLOCO_I", precision = 15, scale = 6)
    private BigDecimal recTotalBlocoI;

    public BigDecimal getRecTotalBlocoI() {
        return this.recTotalBlocoI;
    }

    public void setRecTotalBlocoI(BigDecimal recTotalBlocoI) {
        this.recTotalBlocoI = recTotalBlocoI;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "REC_NRB_BLOCO_I", precision = 15, scale = 6)
    private BigDecimal recNrbBlocoI;

    public BigDecimal getRecNrbBlocoI() {
        return this.recNrbBlocoI;
    }

    public void setRecNrbBlocoI(BigDecimal recNrbBlocoI) {
        this.recNrbBlocoI = recNrbBlocoI;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "REC_TOTAL_BLOCO_1", precision = 15, scale = 6)
    private BigDecimal recTotalBloco1;

    public BigDecimal getRecTotalBloco1() {
        return this.recTotalBloco1;
    }

    public void setRecTotalBloco1(BigDecimal recTotalBloco1) {
        this.recTotalBloco1 = recTotalBloco1;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "REC_NRB_BLOCO_1", precision = 15, scale = 6)
    private BigDecimal recNrbBloco1;

    public BigDecimal getRecNrbBloco1() {
        return this.recNrbBloco1;
    }

    public void setRecNrbBloco1(BigDecimal recNrbBloco1) {
        this.recNrbBloco1 = recNrbBloco1;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "REC_TOTAL_PERIODO", precision = 15, scale = 6)
    private BigDecimal recTotalPeriodo;

    public BigDecimal getRecTotalPeriodo() {
        return this.recTotalPeriodo;
    }

    public void setRecTotalPeriodo(BigDecimal recTotalPeriodo) {
        this.recTotalPeriodo = recTotalPeriodo;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "REC_TOTAL_NRB_PERIODO", precision = 15, scale = 6)
    private BigDecimal recTotalNrbPeriodo;

    public BigDecimal getRecTotalNrbPeriodo() {
        return this.recTotalNrbPeriodo;
    }

    public void setRecTotalNrbPeriodo(BigDecimal recTotalNrbPeriodo) {
        this.recTotalNrbPeriodo = recTotalNrbPeriodo;
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
        final Reg0900 other = (Reg0900) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0900{" + "id=" + id + '}';
    }
}
