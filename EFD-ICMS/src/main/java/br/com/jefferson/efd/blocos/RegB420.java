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
@Table(name = "reg_b420")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB420.findAll", query = "SELECT r FROM RegB420 r"),
    @NamedQuery(name = "RegB420.findById", query = "SELECT r FROM RegB420 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB420.findByIdPai", query = "SELECT r FROM RegB420 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB420.findByLinha", query = "SELECT r FROM RegB420 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB420.findByHash", query = "SELECT r FROM RegB420 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB420.findByReg", query = "SELECT r FROM RegB420 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB420.findByVlCont", query = "SELECT r FROM RegB420 r WHERE r.vlCont = :vlCont"),
    @NamedQuery(name = "RegB420.findByVlBcIss", query = "SELECT r FROM RegB420 r WHERE r.vlBcIss = :vlBcIss"),
    @NamedQuery(name = "RegB420.findByAliqIss", query = "SELECT r FROM RegB420 r WHERE r.aliqIss = :aliqIss"),
    @NamedQuery(name = "RegB420.findByVlIsntIss", query = "SELECT r FROM RegB420 r WHERE r.vlIsntIss = :vlIsntIss"),
    @NamedQuery(name = "RegB420.findByVlIss", query = "SELECT r FROM RegB420 r WHERE r.vlIss = :vlIss"),
    @NamedQuery(name = "RegB420.findByCodServ", query = "SELECT r FROM RegB420 r WHERE r.codServ = :codServ")})
@Registros(nivel = 2)
public class RegB420 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegB001 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_CONT")
    private BigDecimal vlCont;

    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_BC_ISS")
    private BigDecimal vlBcIss;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "ALIQ_ISS")
    private BigDecimal aliqIss;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ISNT_ISS")
    private BigDecimal vlIsntIss;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ISS")
    private BigDecimal vlIss;

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "COD_SERV")
    private String codServ;

    public RegB420() {
    }

    public RegB420(Long id) {
        this.id = id;
    }

    public RegB420(Long id, RegB001 idPai, long linha, String hash) {
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

    public RegB001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegB001) idPai;
    }

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

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getAliqIss() {
        return aliqIss;
    }

    public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
    }

    public BigDecimal getVlIsntIss() {
        return vlIsntIss;
    }

    public void setVlIsntIss(BigDecimal vlIsntIss) {
        this.vlIsntIss = vlIsntIss;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
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
        if (!(object instanceof RegB420)) {
            return false;
        }
        RegB420 other = (RegB420) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB420[ id=" + id + " ]";
    }

}
