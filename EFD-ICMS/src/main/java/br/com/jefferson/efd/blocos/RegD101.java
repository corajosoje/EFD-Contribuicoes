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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_d101")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD101.findAll", query = "SELECT r FROM RegD101 r"),
    @NamedQuery(name = "RegD101.findById", query = "SELECT r FROM RegD101 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD101.findByIdPai", query = "SELECT r FROM RegD101 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD101.findByLinha", query = "SELECT r FROM RegD101 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD101.findByHash", query = "SELECT r FROM RegD101 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD101.findByReg", query = "SELECT r FROM RegD101 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD101.findByVlFcpUfDest", query = "SELECT r FROM RegD101 r WHERE r.vlFcpUfDest = :vlFcpUfDest"),
    @NamedQuery(name = "RegD101.findByVlIcmsUfDest", query = "SELECT r FROM RegD101 r WHERE r.vlIcmsUfDest = :vlIcmsUfDest"),
    @NamedQuery(name = "RegD101.findByVlIcmsUfRem", query = "SELECT r FROM RegD101 r WHERE r.vlIcmsUfRem = :vlIcmsUfRem")})
@Registros(nivel = 3)
public class RegD101 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD100 idPai;

    public RegD100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD100) idPai;
    }

    public RegD101() {
    }

    public RegD101(Long id) {
        this.id = id;
    }

    public RegD101(Long id, RegD100 idPai, long linha, String hash) {
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_FCP_UF_DEST")
    private BigDecimal vlFcpUfDest;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_ICMS_UF_DEST")
    private BigDecimal vlIcmsUfDest;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ICMS_UF_REM")
    private BigDecimal vlIcmsUfRem;

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

    public BigDecimal getVlFcpUfDest() {
        return vlFcpUfDest;
    }

    public void setVlFcpUfDest(BigDecimal vlFcpUfDest) {
        this.vlFcpUfDest = vlFcpUfDest;
    }

    public BigDecimal getVlIcmsUfDest() {
        return vlIcmsUfDest;
    }

    public void setVlIcmsUfDest(BigDecimal vlIcmsUfDest) {
        this.vlIcmsUfDest = vlIcmsUfDest;
    }

    public BigDecimal getVlIcmsUfRem() {
        return vlIcmsUfRem;
    }

    public void setVlIcmsUfRem(BigDecimal vlIcmsUfRem) {
        this.vlIcmsUfRem = vlIcmsUfRem;
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
        if (!(object instanceof RegD101)) {
            return false;
        }
        RegD101 other = (RegD101) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD101[ id=" + id + " ]";
    }

}
