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
@Table(name = "reg_d420")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD420.findAll", query = "SELECT r FROM RegD420 r"),
    @NamedQuery(name = "RegD420.findById", query = "SELECT r FROM RegD420 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD420.findByIdPai", query = "SELECT r FROM RegD420 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD420.findByLinha", query = "SELECT r FROM RegD420 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD420.findByHash", query = "SELECT r FROM RegD420 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD420.findByReg", query = "SELECT r FROM RegD420 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD420.findByCodMunOrig", query = "SELECT r FROM RegD420 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD420.findByVlServ", query = "SELECT r FROM RegD420 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD420.findByVlBcIcms", query = "SELECT r FROM RegD420 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD420.findByVlIcms", query = "SELECT r FROM RegD420 r WHERE r.vlIcms = :vlIcms")})
@Registros(nivel = 3)
public class RegD420 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD400 idPai;

    public RegD400 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD400) idPai;
    }

    public RegD420() {
    }

    public RegD420(Long id) {
        this.id = id;
    }

    public RegD420(Long id, RegD400 idPai, long linha, String hash) {
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
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_SERV")
    private BigDecimal vlServ;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Campos(posicao = 5, tipo = 'R')
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

    public String getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegD420)) {
            return false;
        }
        RegD420 other = (RegD420) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD420[ id=" + id + " ]";
    }

}
