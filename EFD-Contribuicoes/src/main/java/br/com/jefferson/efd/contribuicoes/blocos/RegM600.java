package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_m600")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM600.findAll", query = "SELECT r FROM RegM600 r"),
    @NamedQuery(name = "RegM600.findById", query = "SELECT r FROM RegM600 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM600.findByIdPai", query = "SELECT r FROM RegM600 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM600.findByLinha", query = "SELECT r FROM RegM600 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM600.findByHashfile", query = "SELECT r FROM RegM600 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM600.findByReg", query = "SELECT r FROM RegM600 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM600.findByVlTotContNcPer", query = "SELECT r FROM RegM600 r WHERE r.vlTotContNcPer = :vlTotContNcPer"),
    @NamedQuery(name = "RegM600.findByVlTotCredDesc", query = "SELECT r FROM RegM600 r WHERE r.vlTotCredDesc = :vlTotCredDesc"),
    @NamedQuery(name = "RegM600.findByVlTotCredDescAnt", query = "SELECT r FROM RegM600 r WHERE r.vlTotCredDescAnt = :vlTotCredDescAnt"),
    @NamedQuery(name = "RegM600.findByVlTotContNcDev", query = "SELECT r FROM RegM600 r WHERE r.vlTotContNcDev = :vlTotContNcDev"),
    @NamedQuery(name = "RegM600.findByVlRetNc", query = "SELECT r FROM RegM600 r WHERE r.vlRetNc = :vlRetNc"),
    @NamedQuery(name = "RegM600.findByVlOutDedNc", query = "SELECT r FROM RegM600 r WHERE r.vlOutDedNc = :vlOutDedNc"),
    @NamedQuery(name = "RegM600.findByVlContNcRec", query = "SELECT r FROM RegM600 r WHERE r.vlContNcRec = :vlContNcRec"),
    @NamedQuery(name = "RegM600.findByVlTotContCumPer", query = "SELECT r FROM RegM600 r WHERE r.vlTotContCumPer = :vlTotContCumPer"),
    @NamedQuery(name = "RegM600.findByVlRetCum", query = "SELECT r FROM RegM600 r WHERE r.vlRetCum = :vlRetCum"),
    @NamedQuery(name = "RegM600.findByVlOutDedCum", query = "SELECT r FROM RegM600 r WHERE r.vlOutDedCum = :vlOutDedCum"),
    @NamedQuery(name = "RegM600.findByVlContCumRec", query = "SELECT r FROM RegM600 r WHERE r.vlContCumRec = :vlContCumRec"),
    @NamedQuery(name = "RegM600.findByVlTotContRec", query = "SELECT r FROM RegM600 r WHERE r.vlTotContRec = :vlTotContRec")})
@Registros(nivel = 2)
public class RegM600 implements Serializable, BlocoSped {

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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM605> regM605;

    public List<RegM605> getRegM605() {
        return regM605;
    }

    public void setRegM605(List<RegM605> regM605) {
        this.regM605 = regM605;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM610> regM610;

    public List<RegM610> getRegM610() {
        return regM610;
    }

    public void setRegM610(List<RegM610> regM610) {
        this.regM610 = regM610;
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
    @Column(name = "VL_TOT_CONT_NC_PER", precision = 15, scale = 6)
    private BigDecimal vlTotContNcPer;

    public BigDecimal getVlTotContNcPer() {
        return this.vlTotContNcPer;
    }

    public void setVlTotContNcPer(BigDecimal vlTotContNcPer) {
        this.vlTotContNcPer = vlTotContNcPer;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_TOT_CRED_DESC", precision = 15, scale = 6)
    private BigDecimal vlTotCredDesc;

    public BigDecimal getVlTotCredDesc() {
        return this.vlTotCredDesc;
    }

    public void setVlTotCredDesc(BigDecimal vlTotCredDesc) {
        this.vlTotCredDesc = vlTotCredDesc;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_TOT_CRED_DESC_ANT", precision = 15, scale = 6)
    private BigDecimal vlTotCredDescAnt;

    public BigDecimal getVlTotCredDescAnt() {
        return this.vlTotCredDescAnt;
    }

    public void setVlTotCredDescAnt(BigDecimal vlTotCredDescAnt) {
        this.vlTotCredDescAnt = vlTotCredDescAnt;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_TOT_CONT_NC_DEV", precision = 15, scale = 6)
    private BigDecimal vlTotContNcDev;

    public BigDecimal getVlTotContNcDev() {
        return this.vlTotContNcDev;
    }

    public void setVlTotContNcDev(BigDecimal vlTotContNcDev) {
        this.vlTotContNcDev = vlTotContNcDev;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_RET_NC", precision = 15, scale = 6)
    private BigDecimal vlRetNc;

    public BigDecimal getVlRetNc() {
        return this.vlRetNc;
    }

    public void setVlRetNc(BigDecimal vlRetNc) {
        this.vlRetNc = vlRetNc;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_OUT_DED_NC", precision = 15, scale = 6)
    private BigDecimal vlOutDedNc;

    public BigDecimal getVlOutDedNc() {
        return this.vlOutDedNc;
    }

    public void setVlOutDedNc(BigDecimal vlOutDedNc) {
        this.vlOutDedNc = vlOutDedNc;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_CONT_NC_REC", precision = 15, scale = 6)
    private BigDecimal vlContNcRec;

    public BigDecimal getVlContNcRec() {
        return this.vlContNcRec;
    }

    public void setVlContNcRec(BigDecimal vlContNcRec) {
        this.vlContNcRec = vlContNcRec;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_TOT_CONT_CUM_PER", precision = 15, scale = 6)
    private BigDecimal vlTotContCumPer;

    public BigDecimal getVlTotContCumPer() {
        return this.vlTotContCumPer;
    }

    public void setVlTotContCumPer(BigDecimal vlTotContCumPer) {
        this.vlTotContCumPer = vlTotContCumPer;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_RET_CUM", precision = 15, scale = 6)
    private BigDecimal vlRetCum;

    public BigDecimal getVlRetCum() {
        return this.vlRetCum;
    }

    public void setVlRetCum(BigDecimal vlRetCum) {
        this.vlRetCum = vlRetCum;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_OUT_DED_CUM", precision = 15, scale = 6)
    private BigDecimal vlOutDedCum;

    public BigDecimal getVlOutDedCum() {
        return this.vlOutDedCum;
    }

    public void setVlOutDedCum(BigDecimal vlOutDedCum) {
        this.vlOutDedCum = vlOutDedCum;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_CONT_CUM_REC", precision = 15, scale = 6)
    private BigDecimal vlContCumRec;

    public BigDecimal getVlContCumRec() {
        return this.vlContCumRec;
    }

    public void setVlContCumRec(BigDecimal vlContCumRec) {
        this.vlContCumRec = vlContCumRec;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_TOT_CONT_REC", precision = 15, scale = 6)
    private BigDecimal vlTotContRec;

    public BigDecimal getVlTotContRec() {
        return this.vlTotContRec;
    }

    public void setVlTotContRec(BigDecimal vlTotContRec) {
        this.vlTotContRec = vlTotContRec;
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
        final RegM600 other = (RegM600) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM600{" + "id=" + id + '}';
    }
}
