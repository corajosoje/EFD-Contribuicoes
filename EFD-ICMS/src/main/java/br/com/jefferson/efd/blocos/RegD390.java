package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d390")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD390.findAll", query = "SELECT r FROM RegD390 r"),
    @NamedQuery(name = "RegD390.findById", query = "SELECT r FROM RegD390 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD390.findByIdPai", query = "SELECT r FROM RegD390 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD390.findByLinha", query = "SELECT r FROM RegD390 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD390.findByHashfile", query = "SELECT r FROM RegD390 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD390.findByReg", query = "SELECT r FROM RegD390 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD390.findByCstIcms", query = "SELECT r FROM RegD390 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegD390.findByCfop", query = "SELECT r FROM RegD390 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegD390.findByAliqIcms", query = "SELECT r FROM RegD390 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegD390.findByVlOpr", query = "SELECT r FROM RegD390 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegD390.findByVlBcIssqn", query = "SELECT r FROM RegD390 r WHERE r.vlBcIssqn = :vlBcIssqn"),
    @NamedQuery(name = "RegD390.findByAliqIssqn", query = "SELECT r FROM RegD390 r WHERE r.aliqIssqn = :aliqIssqn"),
    @NamedQuery(name = "RegD390.findByVlIssqn", query = "SELECT r FROM RegD390 r WHERE r.vlIssqn = :vlIssqn"),
    @NamedQuery(name = "RegD390.findByVlBcIcms", query = "SELECT r FROM RegD390 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD390.findByVlIcms", query = "SELECT r FROM RegD390 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD390.findByCodObs", query = "SELECT r FROM RegD390 r WHERE r.codObs = :codObs")})
@Registros(nivel = 4)
public class RegD390 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD355 idPai;

    public RegD355 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD355) idPai;
    }

    public RegD390() {
    }

    public RegD390(String id) {
        this.id = id;
    }

    public RegD390(String id, RegD355 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_OPR", precision = 15, scale = 6)
    private BigDecimal vlOpr;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_ISSQN", precision = 15, scale = 6)
    private BigDecimal vlBcIssqn;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "ALIQ_ISSQN", precision = 15, scale = 6)
    private BigDecimal aliqIssqn;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_ISSQN", precision = 15, scale = 6)
    private BigDecimal vlIssqn;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_OBS")
    private String codObs;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHashfile() {
        return hashfile;
    }

    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
    }

    public BigDecimal getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(BigDecimal vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public BigDecimal getAliqIssqn() {
        return aliqIssqn;
    }

    public void setAliqIssqn(BigDecimal aliqIssqn) {
        this.aliqIssqn = aliqIssqn;
    }

    public BigDecimal getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(BigDecimal vlIssqn) {
        this.vlIssqn = vlIssqn;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    @Override
    public int hashCode() {
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegD390)) {
            return false;
        }
        RegD390 other = (RegD390) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD390[ id=" + id + " ]";
    }

}
