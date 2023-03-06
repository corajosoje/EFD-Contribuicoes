package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c790")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC790.findAll", query = "SELECT r FROM RegC790 r"),
    @NamedQuery(name = "RegC790.findById", query = "SELECT r FROM RegC790 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC790.findByIdPai", query = "SELECT r FROM RegC790 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC790.findByLinha", query = "SELECT r FROM RegC790 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC790.findByHashfile", query = "SELECT r FROM RegC790 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC790.findByReg", query = "SELECT r FROM RegC790 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC790.findByCstIcms", query = "SELECT r FROM RegC790 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC790.findByCfop", query = "SELECT r FROM RegC790 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC790.findByAliqIcms", query = "SELECT r FROM RegC790 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC790.findByVlOpr", query = "SELECT r FROM RegC790 r WHERE r.vlOpr = :vlOpr"),
    @NamedQuery(name = "RegC790.findByVlBcIcms", query = "SELECT r FROM RegC790 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC790.findByVlIcms", query = "SELECT r FROM RegC790 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC790.findByVlBcIcmsSt", query = "SELECT r FROM RegC790 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC790.findByVlIcmsSt", query = "SELECT r FROM RegC790 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC790.findByVlRedBc", query = "SELECT r FROM RegC790 r WHERE r.vlRedBc = :vlRedBc"),
    @NamedQuery(name = "RegC790.findByCodObs", query = "SELECT r FROM RegC790 r WHERE r.codObs = :codObs")})
@Registros(nivel = 3)
public class RegC790 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC700 idPai;

    public RegC700 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC700) idPai;
    }

    public RegC790() {
    }

    public RegC790(String id) {
        this.id = id;
    }

    public RegC790(String id, RegC700 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC791> regC791;

    public List<RegC791> getRegC791() {
        return regC791;
    }

    public void setRegC791(List<RegC791> regC791) {
        this.regC791 = regC791;
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
        if (!(object instanceof RegC790)) {
            return false;
        }
        RegC790 other = (RegC790) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC790[ id=" + id + " ]";
    }

}
