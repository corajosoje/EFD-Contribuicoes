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
@Table(name = "reg_c197")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC197.findAll", query = "SELECT r FROM RegC197 r"),
    @NamedQuery(name = "RegC197.findById", query = "SELECT r FROM RegC197 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC197.findByIdPai", query = "SELECT r FROM RegC197 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC197.findByLinha", query = "SELECT r FROM RegC197 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC197.findByHashfile", query = "SELECT r FROM RegC197 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC197.findByReg", query = "SELECT r FROM RegC197 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC197.findByCodAj", query = "SELECT r FROM RegC197 r WHERE r.codAj = :codAj"),
    @NamedQuery(name = "RegC197.findByDescrComplAj", query = "SELECT r FROM RegC197 r WHERE r.descrComplAj = :descrComplAj"),
    @NamedQuery(name = "RegC197.findByCodItem", query = "SELECT r FROM RegC197 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC197.findByVlBcIcms", query = "SELECT r FROM RegC197 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC197.findByAliqIcms", query = "SELECT r FROM RegC197 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC197.findByVlIcms", query = "SELECT r FROM RegC197 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC197.findByVlOutros", query = "SELECT r FROM RegC197 r WHERE r.vlOutros = :vlOutros")})
@Registros(nivel = 4)
public class RegC197 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC195 idPai;

    public RegC195 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC195) idPai;
    }

    public RegC197() {
    }

    public RegC197(String id) {
        this.id = id;
    }

    public RegC197(String id, RegC195 idPai, long linha, String hashfile) {
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
    @Column(name = "COD_AJ")
    private String codAj;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "DESCR_COMPL_AJ")
    private String descrComplAj;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_OUTROS", precision = 15, scale = 6)
    private BigDecimal vlOutros;

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

    public String getCodAj() {
        return codAj;
    }

    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }

    public String getDescrComplAj() {
        return descrComplAj;
    }

    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlOutros() {
        return vlOutros;
    }

    public void setVlOutros(BigDecimal vlOutros) {
        this.vlOutros = vlOutros;
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
        if (!(object instanceof RegC197)) {
            return false;
        }
        RegC197 other = (RegC197) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC197[ id=" + id + " ]";
    }

}
