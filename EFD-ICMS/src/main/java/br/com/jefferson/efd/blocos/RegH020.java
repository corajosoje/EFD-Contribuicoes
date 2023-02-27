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
@Table(name = "reg_h020")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegH020.findAll", query = "SELECT r FROM RegH020 r"),
    @NamedQuery(name = "RegH020.findById", query = "SELECT r FROM RegH020 r WHERE r.id = :id"),
    @NamedQuery(name = "RegH020.findByIdPai", query = "SELECT r FROM RegH020 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegH020.findByLinha", query = "SELECT r FROM RegH020 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegH020.findByHashfile", query = "SELECT r FROM RegH020 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegH020.findByReg", query = "SELECT r FROM RegH020 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegH020.findByCstIcms", query = "SELECT r FROM RegH020 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegH020.findByBlIcms", query = "SELECT r FROM RegH020 r WHERE r.bcIcms = :bcIcms"),
    @NamedQuery(name = "RegH020.findByVlIcms", query = "SELECT r FROM RegH020 r WHERE r.vlIcms = :vlIcms")})
@Registros(nivel = 4)
public class RegH020 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
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

    public RegH020(String id) {
        this.id = id;
    }

    public RegH020(String id, RegH010 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "BC_ICMS", precision = 15, scale = 6)
    private BigDecimal bcIcms;
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
