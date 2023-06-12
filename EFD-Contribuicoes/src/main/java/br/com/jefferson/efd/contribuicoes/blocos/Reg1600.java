package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1600")
@Registros(nivel = 2)
public class Reg1600 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    @Override
    public Reg1001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg1001) idPai;
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
    private List<Reg1610> reg1610;

    public List<Reg1610> getReg1610() {
        return reg1610;
    }

    public void setReg1610(List<Reg1610> reg1610) {
        this.reg1610 = reg1610;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1620> reg1620;

    public List<Reg1620> getReg1620() {
        return reg1620;
    }

    public void setReg1620(List<Reg1620> reg1620) {
        this.reg1620 = reg1620;
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "PER_APUR_ANT")
    private int perApurAnt;

    public int getPerApurAnt() {
        return this.perApurAnt;
    }

    public void setPerApurAnt(int perApurAnt) {
        this.perApurAnt = perApurAnt;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NAT_CONT_REC")
    private String natContRec;

    public String getNatContRec() {
        return this.natContRec;
    }

    public void setNatContRec(String natContRec) {
        this.natContRec = natContRec;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_CONT_APUR", precision = 15, scale = 6)
    private BigDecimal vlContApur;

    public BigDecimal getVlContApur() {
        return this.vlContApur;
    }

    public void setVlContApur(BigDecimal vlContApur) {
        this.vlContApur = vlContApur;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_CRED_COFINS_DESC", precision = 15, scale = 6)
    private BigDecimal vlCredCofinsDesc;

    public BigDecimal getVlCredCofinsDesc() {
        return this.vlCredCofinsDesc;
    }

    public void setVlCredCofinsDesc(BigDecimal vlCredCofinsDesc) {
        this.vlCredCofinsDesc = vlCredCofinsDesc;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_CONT_DEV", precision = 15, scale = 6)
    private BigDecimal vlContDev;

    public BigDecimal getVlContDev() {
        return this.vlContDev;
    }

    public void setVlContDev(BigDecimal vlContDev) {
        this.vlContDev = vlContDev;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_OUT_DED", precision = 15, scale = 6)
    private BigDecimal vlOutDed;

    public BigDecimal getVlOutDed() {
        return this.vlOutDed;
    }

    public void setVlOutDed(BigDecimal vlOutDed) {
        this.vlOutDed = vlOutDed;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_CONT_EXT", precision = 15, scale = 6)
    private BigDecimal vlContExt;

    public BigDecimal getVlContExt() {
        return this.vlContExt;
    }

    public void setVlContExt(BigDecimal vlContExt) {
        this.vlContExt = vlContExt;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_MUL", precision = 15, scale = 6)
    private BigDecimal vlMul;

    public BigDecimal getVlMul() {
        return this.vlMul;
    }

    public void setVlMul(BigDecimal vlMul) {
        this.vlMul = vlMul;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_JUR", precision = 15, scale = 6)
    private BigDecimal vlJur;

    public BigDecimal getVlJur() {
        return this.vlJur;
    }

    public void setVlJur(BigDecimal vlJur) {
        this.vlJur = vlJur;
    }
    @Campos(posicao = 11, tipo = 'D')
    @Column(name = "DT_RECOL")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRecol;

    public Date getDtRecol() {
        return this.dtRecol;
    }

    public void setDtRecol(Date dtRecol) {
        this.dtRecol = dtRecol;
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
        final Reg1600 other = (Reg1600) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1600{" + "id=" + id + '}';
    }
}
