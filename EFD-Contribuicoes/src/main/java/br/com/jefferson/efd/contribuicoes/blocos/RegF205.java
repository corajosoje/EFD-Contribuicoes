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
@Table(name = "reg_f205")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF205.findAll", query = "SELECT r FROM RegF205 r"),
    @NamedQuery(name = "RegF205.findById", query = "SELECT r FROM RegF205 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF205.findByIdPai", query = "SELECT r FROM RegF205 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF205.findByLinha", query = "SELECT r FROM RegF205 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF205.findByHashfile", query = "SELECT r FROM RegF205 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF205.findByReg", query = "SELECT r FROM RegF205 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF205.findByVlCusIncAcumAnt", query = "SELECT r FROM RegF205 r WHERE r.vlCusIncAcumAnt = :vlCusIncAcumAnt"),
    @NamedQuery(name = "RegF205.findByVlCusIncPerEsc", query = "SELECT r FROM RegF205 r WHERE r.vlCusIncPerEsc = :vlCusIncPerEsc"),
    @NamedQuery(name = "RegF205.findByVlCusIncAcum", query = "SELECT r FROM RegF205 r WHERE r.vlCusIncAcum = :vlCusIncAcum"),
    @NamedQuery(name = "RegF205.findByVlExcBcCusIncAcum", query = "SELECT r FROM RegF205 r WHERE r.vlExcBcCusIncAcum = :vlExcBcCusIncAcum"),
    @NamedQuery(name = "RegF205.findByVlBcCusInc", query = "SELECT r FROM RegF205 r WHERE r.vlBcCusInc = :vlBcCusInc"),
    @NamedQuery(name = "RegF205.findByCstPis", query = "SELECT r FROM RegF205 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF205.findByAliqPis", query = "SELECT r FROM RegF205 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegF205.findByVlCredPisAcum", query = "SELECT r FROM RegF205 r WHERE r.vlCredPisAcum = :vlCredPisAcum"),
    @NamedQuery(name = "RegF205.findByVlCredPisDescAnt", query = "SELECT r FROM RegF205 r WHERE r.vlCredPisDescAnt = :vlCredPisDescAnt"),
    @NamedQuery(name = "RegF205.findByVlCredPisDesc", query = "SELECT r FROM RegF205 r WHERE r.vlCredPisDesc = :vlCredPisDesc"),
    @NamedQuery(name = "RegF205.findByVlCredPisDescFut", query = "SELECT r FROM RegF205 r WHERE r.vlCredPisDescFut = :vlCredPisDescFut"),
    @NamedQuery(name = "RegF205.findByCstCofins", query = "SELECT r FROM RegF205 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF205.findByAliqCofins", query = "SELECT r FROM RegF205 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegF205.findByVlCredCofinsAcum", query = "SELECT r FROM RegF205 r WHERE r.vlCredCofinsAcum = :vlCredCofinsAcum"),
    @NamedQuery(name = "RegF205.findByVlCredCofinsDescAnt", query = "SELECT r FROM RegF205 r WHERE r.vlCredCofinsDescAnt = :vlCredCofinsDescAnt"),
    @NamedQuery(name = "RegF205.findByVlCredCofinsDesc", query = "SELECT r FROM RegF205 r WHERE r.vlCredCofinsDesc = :vlCredCofinsDesc"),
    @NamedQuery(name = "RegF205.findByVlCredCofinsDescFut", query = "SELECT r FROM RegF205 r WHERE r.vlCredCofinsDescFut = :vlCredCofinsDescFut")})
@Registros(nivel = 4)
public class RegF205 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegF200 idPai;

    @Override
    public RegF200 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegF200) idPai;
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
    @Column(name = "VL_CUS_INC_ACUM_ANT", precision = 15, scale = 6)
    private BigDecimal vlCusIncAcumAnt;

    public BigDecimal getVlCusIncAcumAnt() {
        return this.vlCusIncAcumAnt;
    }

    public void setVlCusIncAcumAnt(BigDecimal vlCusIncAcumAnt) {
        this.vlCusIncAcumAnt = vlCusIncAcumAnt;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_CUS_INC_PER_ESC", precision = 15, scale = 6)
    private BigDecimal vlCusIncPerEsc;

    public BigDecimal getVlCusIncPerEsc() {
        return this.vlCusIncPerEsc;
    }

    public void setVlCusIncPerEsc(BigDecimal vlCusIncPerEsc) {
        this.vlCusIncPerEsc = vlCusIncPerEsc;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_CUS_INC_ACUM", precision = 15, scale = 6)
    private BigDecimal vlCusIncAcum;

    public BigDecimal getVlCusIncAcum() {
        return this.vlCusIncAcum;
    }

    public void setVlCusIncAcum(BigDecimal vlCusIncAcum) {
        this.vlCusIncAcum = vlCusIncAcum;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_EXC_BC_CUS_INC_ACUM", precision = 15, scale = 6)
    private BigDecimal vlExcBcCusIncAcum;

    public BigDecimal getVlExcBcCusIncAcum() {
        return this.vlExcBcCusIncAcum;
    }

    public void setVlExcBcCusIncAcum(BigDecimal vlExcBcCusIncAcum) {
        this.vlExcBcCusIncAcum = vlExcBcCusIncAcum;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_CUS_INC", precision = 15, scale = 6)
    private BigDecimal vlBcCusInc;

    public BigDecimal getVlBcCusInc() {
        return this.vlBcCusInc;
    }

    public void setVlBcCusInc(BigDecimal vlBcCusInc) {
        this.vlBcCusInc = vlBcCusInc;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_CRED_PIS_ACUM", precision = 15, scale = 6)
    private BigDecimal vlCredPisAcum;

    public BigDecimal getVlCredPisAcum() {
        return this.vlCredPisAcum;
    }

    public void setVlCredPisAcum(BigDecimal vlCredPisAcum) {
        this.vlCredPisAcum = vlCredPisAcum;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_CRED_PIS_DESC_ANT", precision = 15, scale = 6)
    private BigDecimal vlCredPisDescAnt;

    public BigDecimal getVlCredPisDescAnt() {
        return this.vlCredPisDescAnt;
    }

    public void setVlCredPisDescAnt(BigDecimal vlCredPisDescAnt) {
        this.vlCredPisDescAnt = vlCredPisDescAnt;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_CRED_PIS_DESC", precision = 15, scale = 6)
    private BigDecimal vlCredPisDesc;

    public BigDecimal getVlCredPisDesc() {
        return this.vlCredPisDesc;
    }

    public void setVlCredPisDesc(BigDecimal vlCredPisDesc) {
        this.vlCredPisDesc = vlCredPisDesc;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_CRED_PIS_DESC_FUT", precision = 15, scale = 6)
    private BigDecimal vlCredPisDescFut;

    public BigDecimal getVlCredPisDescFut() {
        return this.vlCredPisDescFut;
    }

    public void setVlCredPisDescFut(BigDecimal vlCredPisDescFut) {
        this.vlCredPisDescFut = vlCredPisDescFut;
    }
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_CRED_COFINS_ACUM", precision = 15, scale = 6)
    private BigDecimal vlCredCofinsAcum;

    public BigDecimal getVlCredCofinsAcum() {
        return this.vlCredCofinsAcum;
    }

    public void setVlCredCofinsAcum(BigDecimal vlCredCofinsAcum) {
        this.vlCredCofinsAcum = vlCredCofinsAcum;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_CRED_COFINS_DESC_ANT", precision = 15, scale = 6)
    private BigDecimal vlCredCofinsDescAnt;

    public BigDecimal getVlCredCofinsDescAnt() {
        return this.vlCredCofinsDescAnt;
    }

    public void setVlCredCofinsDescAnt(BigDecimal vlCredCofinsDescAnt) {
        this.vlCredCofinsDescAnt = vlCredCofinsDescAnt;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_CRED_COFINS_DESC", precision = 15, scale = 6)
    private BigDecimal vlCredCofinsDesc;

    public BigDecimal getVlCredCofinsDesc() {
        return this.vlCredCofinsDesc;
    }

    public void setVlCredCofinsDesc(BigDecimal vlCredCofinsDesc) {
        this.vlCredCofinsDesc = vlCredCofinsDesc;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_CRED_COFINS_DESC_FUT", precision = 15, scale = 6)
    private BigDecimal vlCredCofinsDescFut;

    public BigDecimal getVlCredCofinsDescFut() {
        return this.vlCredCofinsDescFut;
    }

    public void setVlCredCofinsDescFut(BigDecimal vlCredCofinsDescFut) {
        this.vlCredCofinsDescFut = vlCredCofinsDescFut;
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
        final RegF205 other = (RegF205) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF205{" + "id=" + id + '}';
    }
}
