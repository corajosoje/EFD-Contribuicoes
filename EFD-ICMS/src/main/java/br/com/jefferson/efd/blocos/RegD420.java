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
@Table(name = "reg_d420")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD420.findAll", query = "SELECT r FROM RegD420 r"),
    @NamedQuery(name = "RegD420.findById", query = "SELECT r FROM RegD420 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD420.findByIdPai", query = "SELECT r FROM RegD420 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD420.findByLinha", query = "SELECT r FROM RegD420 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD420.findByHashfile", query = "SELECT r FROM RegD420 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD420.findByReg", query = "SELECT r FROM RegD420 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD420.findByCodMunOrig", query = "SELECT r FROM RegD420 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD420.findByVlServ", query = "SELECT r FROM RegD420 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD420.findByVlBcIcms", query = "SELECT r FROM RegD420 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD420.findByVlIcms", query = "SELECT r FROM RegD420 r WHERE r.vlIcms = :vlIcms")})
@Registros(nivel = 3)
public class RegD420 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD400 idPai;

    public RegD400 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegD400) idPai;
    }

    public RegD420() {
    }

    public RegD420(String id) {
        this.id = id;
    }

    public RegD420(String id, RegD400 idPai, long linha, String hashfile) {
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
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_SERV", precision = 15, scale = 6)
    private BigDecimal vlServ;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 5, tipo = 'R')
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
