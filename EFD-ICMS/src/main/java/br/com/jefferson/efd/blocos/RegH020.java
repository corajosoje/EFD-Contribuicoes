package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_h020")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegH020.findAll", query = "SELECT r FROM RegH020 r"),
    @NamedQuery(name = "RegH020.findById", query = "SELECT r FROM RegH020 r WHERE r.id = :id"),
    @NamedQuery(name = "RegH020.findByIdPai", query = "SELECT r FROM RegH020 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegH020.findByLinha", query = "SELECT r FROM RegH020 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegH020.findByHash", query = "SELECT r FROM RegH020 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegH020.findByReg", query = "SELECT r FROM RegH020 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegH020.findByCstIcms", query = "SELECT r FROM RegH020 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegH020.findByBlIcms", query = "SELECT r FROM RegH020 r WHERE r.bcIcms = :bcIcms"),
    @NamedQuery(name = "RegH020.findByVlIcms", query = "SELECT r FROM RegH020 r WHERE r.vlIcms = :vlIcms")})
@Registros(nivel = 4)
public class RegH020 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegH010 idPai;

    public RegH010 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegH010) idPai;
    }

    public RegH020() {
    }

    public RegH020(Long id) {
        this.id = id;
    }

    public RegH020(Long id, RegH010 idPai, long linha, String hash) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hash = hash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "BC_ICMS")
    private BigDecimal bcIcms;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
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

    public BigDecimal getBcIcms() {
        return bcIcms;
    }

    public void setBcIcms(BigDecimal bcIcms) {
        this.bcIcms = bcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegH020)) {
            return false;
        }
        RegH020 other = (RegH020) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegH020[ id=" + id + " ]";
    }

}
