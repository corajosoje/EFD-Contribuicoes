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
@Table(name = "reg_d370")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD370.findAll", query = "SELECT r FROM RegD370 r"),
    @NamedQuery(name = "RegD370.findById", query = "SELECT r FROM RegD370 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD370.findByIdPai", query = "SELECT r FROM RegD370 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD370.findByLinha", query = "SELECT r FROM RegD370 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD370.findByHashfile", query = "SELECT r FROM RegD370 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD370.findByReg", query = "SELECT r FROM RegD370 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD370.findByCodMunOrig", query = "SELECT r FROM RegD370 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD370.findByVlServ", query = "SELECT r FROM RegD370 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD370.findByQtdBilh", query = "SELECT r FROM RegD370 r WHERE r.qtdBilh = :qtdBilh"),
    @NamedQuery(name = "RegD370.findByVlBcIcms", query = "SELECT r FROM RegD370 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD370.findByVlIcms", query = "SELECT r FROM RegD370 r WHERE r.vlIcms = :vlIcms")})
@Registros(nivel = 5)
public class RegD370 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD365 idPai;

    public RegD365 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD365) idPai;
    }

    public RegD370() {
    }

    public RegD370(String id) {
        this.id = id;
    }

    public RegD370(String id, RegD365 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "QTD_BILH")
    private int qtdBilh;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 6, tipo = 'R')
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

    public int getQtdBilh() {
        return qtdBilh;
    }

    public void setQtdBilh(int qtdBilh) {
        this.qtdBilh = qtdBilh;
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
        if (!(object instanceof RegD370)) {
            return false;
        }
        RegD370 other = (RegD370) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD370[ id=" + id + " ]";
    }

}
