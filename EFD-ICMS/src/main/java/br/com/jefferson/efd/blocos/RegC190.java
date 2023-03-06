package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c190")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC190.findAll", query = "SELECT r FROM RegC190 r"),
    @NamedQuery(name = "RegC190.findById", query = "SELECT r FROM RegC190 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC190.findByIdPai", query = "SELECT r FROM RegC190 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC190.findByLinha", query = "SELECT r FROM RegC190 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC190.findByHashfile", query = "SELECT r FROM RegC190 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC190.findByReg", query = "SELECT r FROM RegC190 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC190.findByCstIcms", query = "SELECT r FROM RegC190 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC190.findByCfop", query = "SELECT r FROM RegC190 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC190.findByAliqIcms", query = "SELECT r FROM RegC190 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC190.findByVlOpr", query = "SELECT r FROM RegC190 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegC190.findByVlBcIcms", query = "SELECT r FROM RegC190 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC190.findByVlIcms", query = "SELECT r FROM RegC190 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC190.findByVlBcIcmsSt", query = "SELECT r FROM RegC190 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC190.findByVlIcmsSt", query = "SELECT r FROM RegC190 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC190.findByVlRedBc", query = "SELECT r FROM RegC190 r WHERE r.vlRedBc = :vlRedBc"),
    @NamedQuery(name = "RegC190.findByVlIpi", query = "SELECT r FROM RegC190 r WHERE r.vlIpi = :vlIpi"),
    @NamedQuery(name = "RegC190.findByCodObs", query = "SELECT r FROM RegC190 r WHERE r.codObs = :codObs")})
@Registros(nivel = 3)
public class RegC190 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC100) idPai;
    }

    public RegC190() {
    }

    public RegC190(String id) {
        this.id = id;
    }

    public RegC190(String id, RegC100 idPai, long linha, String hashfile) {
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC191 regC191;

    public RegC191 getRegC191() {
        return regC191;
    }

    public void setRegC191(RegC191 regC191) {
        this.regC191 = regC191;
    }
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
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_IPI", precision = 15, scale = 6)
    private BigDecimal vlIpi;
    @Campos(posicao = 12, tipo = 'C')
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

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
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
        if (!(object instanceof RegC190)) {
            return false;
        }
        RegC190 other = (RegC190) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC190[ id=" + id + " ]";
    }

}
