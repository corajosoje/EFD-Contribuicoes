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
@Table(name = "reg_1700")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1700.findAll", query = "SELECT r FROM Reg1700 r"),
    @NamedQuery(name = "Reg1700.findById", query = "SELECT r FROM Reg1700 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1700.findByIdPai", query = "SELECT r FROM Reg1700 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1700.findByLinha", query = "SELECT r FROM Reg1700 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1700.findByHashfile", query = "SELECT r FROM Reg1700 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1700.findByReg", query = "SELECT r FROM Reg1700 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1700.findByIndNatRet", query = "SELECT r FROM Reg1700 r WHERE r.indNatRet = :indNatRet"),
    @NamedQuery(name = "Reg1700.findByPrRecRet", query = "SELECT r FROM Reg1700 r WHERE r.prRecRet = :prRecRet"),
    @NamedQuery(name = "Reg1700.findByVlRetApu", query = "SELECT r FROM Reg1700 r WHERE r.vlRetApu = :vlRetApu"),
    @NamedQuery(name = "Reg1700.findByVlRetDed", query = "SELECT r FROM Reg1700 r WHERE r.vlRetDed = :vlRetDed"),
    @NamedQuery(name = "Reg1700.findByVlRetPer", query = "SELECT r FROM Reg1700 r WHERE r.vlRetPer = :vlRetPer"),
    @NamedQuery(name = "Reg1700.findByVlRetDcomp", query = "SELECT r FROM Reg1700 r WHERE r.vlRetDcomp = :vlRetDcomp"),
    @NamedQuery(name = "Reg1700.findBySldRet", query = "SELECT r FROM Reg1700 r WHERE r.sldRet = :sldRet")})
@Registros(nivel = 2)
public class Reg1700 implements Serializable, BlocoSped {

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
    @Column(name = "IND_NAT_RET")
    private String indNatRet;

    public String getIndNatRet() {
        return this.indNatRet;
    }

    public void setIndNatRet(String indNatRet) {
        this.indNatRet = indNatRet;
    }

    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "PR_REC_RET")
    private int prRecRet;

    public int getPrRecRet() {
        return this.prRecRet;
    }

    public void setPrRecRet(int prRecRet) {
        this.prRecRet = prRecRet;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_RET_APU", precision = 15, scale = 6)
    private BigDecimal vlRetApu;

    public BigDecimal getVlRetApu() {
        return this.vlRetApu;
    }

    public void setVlRetApu(BigDecimal vlRetApu) {
        this.vlRetApu = vlRetApu;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_RET_DED", precision = 15, scale = 6)
    private BigDecimal vlRetDed;

    public BigDecimal getVlRetDed() {
        return this.vlRetDed;
    }

    public void setVlRetDed(BigDecimal vlRetDed) {
        this.vlRetDed = vlRetDed;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_RET_PER", precision = 15, scale = 6)
    private BigDecimal vlRetPer;

    public BigDecimal getVlRetPer() {
        return this.vlRetPer;
    }

    public void setVlRetPer(BigDecimal vlRetPer) {
        this.vlRetPer = vlRetPer;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_RET_DCOMP", precision = 15, scale = 6)
    private BigDecimal vlRetDcomp;

    public BigDecimal getVlRetDcomp() {
        return this.vlRetDcomp;
    }

    public void setVlRetDcomp(BigDecimal vlRetDcomp) {
        this.vlRetDcomp = vlRetDcomp;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "SLD_RET", precision = 15, scale = 6)
    private BigDecimal sldRet;

    public BigDecimal getSldRet() {
        return this.sldRet;
    }

    public void setSldRet(BigDecimal sldRet) {
        this.sldRet = sldRet;
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
        final Reg1700 other = (Reg1700) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1700{" + "id=" + id + '}';
    }
}
