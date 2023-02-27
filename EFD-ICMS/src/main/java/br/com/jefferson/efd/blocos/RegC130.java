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
@Table(name = "reg_c130")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC130.findAll", query = "SELECT r FROM RegC130 r"),
    @NamedQuery(name = "RegC130.findById", query = "SELECT r FROM RegC130 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC130.findByIdPai", query = "SELECT r FROM RegC130 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC130.findByLinha", query = "SELECT r FROM RegC130 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC130.findByHashfile", query = "SELECT r FROM RegC130 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC130.findByReg", query = "SELECT r FROM RegC130 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC130.findByVlServNt", query = "SELECT r FROM RegC130 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "RegC130.findByVlBcIssqn", query = "SELECT r FROM RegC130 r WHERE r.vlBcIssqn = :vlBcIssqn"),
    @NamedQuery(name = "RegC130.findByVlIssqn", query = "SELECT r FROM RegC130 r WHERE r.vlIssqn = :vlIssqn"),
    @NamedQuery(name = "RegC130.findByVlBcIrrf", query = "SELECT r FROM RegC130 r WHERE r.vlBcIrrf = :vlBcIrrf"),
    @NamedQuery(name = "RegC130.findByVlIrrf", query = "SELECT r FROM RegC130 r WHERE r.vlIrrf = :vlIrrf"),
    @NamedQuery(name = "RegC130.findByVlBcPrev", query = "SELECT r FROM RegC130 r WHERE r.vlBcPrev = :vlBcPrev"),
    @NamedQuery(name = "RegC130.findByVlPrev", query = "SELECT r FROM RegC130 r WHERE r.vlPrev = :vlPrev")})
@Registros(nivel = 3)
public class RegC130 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC100) idPai;
    }

    public RegC130() {
    }

    public RegC130(String id) {
        this.id = id;
    }

    public RegC130(String id, RegC100 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_SERV_NT", precision = 15, scale = 6)
    private BigDecimal vlServNt;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_BC_ISSQN", precision = 15, scale = 6)
    private BigDecimal vlBcIssqn;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ISSQN", precision = 15, scale = 6)
    private BigDecimal vlIssqn;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_BC_IRRF", precision = 15, scale = 6)
    private BigDecimal vlBcIrrf;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_IRRF", precision = 15, scale = 6)
    private BigDecimal vlIrrf;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_BC_PREV", precision = 15, scale = 6)
    private BigDecimal vlBcPrev;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_PREV", precision = 15, scale = 6)
    private BigDecimal vlPrev;

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

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(BigDecimal vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public BigDecimal getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(BigDecimal vlIssqn) {
        this.vlIssqn = vlIssqn;
    }

    public BigDecimal getVlBcIrrf() {
        return vlBcIrrf;
    }

    public void setVlBcIrrf(BigDecimal vlBcIrrf) {
        this.vlBcIrrf = vlBcIrrf;
    }

    public BigDecimal getVlIrrf() {
        return vlIrrf;
    }

    public void setVlIrrf(BigDecimal vlIrrf) {
        this.vlIrrf = vlIrrf;
    }

    public BigDecimal getVlBcPrev() {
        return vlBcPrev;
    }

    public void setVlBcPrev(BigDecimal vlBcPrev) {
        this.vlBcPrev = vlBcPrev;
    }

    public BigDecimal getVlPrev() {
        return vlPrev;
    }

    public void setVlPrev(BigDecimal vlPrev) {
        this.vlPrev = vlPrev;
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
        if (!(object instanceof RegC130)) {
            return false;
        }
        RegC130 other = (RegC130) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC130[ id=" + id + " ]";
    }

}
