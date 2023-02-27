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
@Table(name = "reg_d697")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD697.findAll", query = "SELECT r FROM RegD697 r"),
    @NamedQuery(name = "RegD697.findById", query = "SELECT r FROM RegD697 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD697.findByIdPai", query = "SELECT r FROM RegD697 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD697.findByLinha", query = "SELECT r FROM RegD697 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD697.findByHashfile", query = "SELECT r FROM RegD697 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD697.findByReg", query = "SELECT r FROM RegD697 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD697.findByUf", query = "SELECT r FROM RegD697 r WHERE r.uf = :uf"),
    @NamedQuery(name = "RegD697.findByVlBcIcms", query = "SELECT r FROM RegD697 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD697.findByVlIcms", query = "SELECT r FROM RegD697 r WHERE r.vlIcms = :vlIcms")})
@Registros(nivel = 4)
public class RegD697 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD696 idPai;

    public RegD696 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD696) idPai;
    }

    public RegD697() {
    }

    public RegD697(String id) {
        this.id = id;
    }

    public RegD697(String id, RegD696 idPai, long linha, String hashfile) {
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
    @Column(name = "UF")
    private String uf;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;

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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegD697)) {
            return false;
        }
        RegD697 other = (RegD697) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD697[ id=" + id + " ]";
    }

}
