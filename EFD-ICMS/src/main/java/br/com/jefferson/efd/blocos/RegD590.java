package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
@Table(name = "reg_d590")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD590.findAll", query = "SELECT r FROM RegD590 r"),
    @NamedQuery(name = "RegD590.findById", query = "SELECT r FROM RegD590 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD590.findByIdPai", query = "SELECT r FROM RegD590 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD590.findByLinha", query = "SELECT r FROM RegD590 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD590.findByHashfile", query = "SELECT r FROM RegD590 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD590.findByReg", query = "SELECT r FROM RegD590 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD590.findByCstIcms", query = "SELECT r FROM RegD590 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegD590.findByCfop", query = "SELECT r FROM RegD590 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegD590.findByAliqIcms", query = "SELECT r FROM RegD590 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegD590.findByVlOpr", query = "SELECT r FROM RegD590 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegD590.findByVlBcIcms", query = "SELECT r FROM RegD590 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD590.findByVlIcms", query = "SELECT r FROM RegD590 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegD590.findByVlBcIcmsSt", query = "SELECT r FROM RegD590 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegD590.findByVlIcmsSt", query = "SELECT r FROM RegD590 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegD590.findByVlRedBc", query = "SELECT r FROM RegD590 r WHERE r.vlRedBc = :vlRedBc"),
    @NamedQuery(name = "RegD590.findByCodObs", query = "SELECT r FROM RegD590 r WHERE r.codObs = :codObs")})
@Registros(nivel = 3)
public class RegD590 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD500 idPai;

    public RegD500 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegD500) idPai;
    }

    public RegD590() {
    }

    public RegD590(String id) {
        this.id = id;
    }

    public RegD590(String id, RegD500 idPai, long linha, String hashfile) {
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
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_RED_BC", precision = 15, scale = 6)
    private BigDecimal vlRedBc;
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

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public BigDecimal getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(BigDecimal vlRedBc) {
        this.vlRedBc = vlRedBc;
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
        if (!(object instanceof RegD590)) {
            return false;
        }
        RegD590 other = (RegD590) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD590[ id=" + id + " ]";
    }

}
