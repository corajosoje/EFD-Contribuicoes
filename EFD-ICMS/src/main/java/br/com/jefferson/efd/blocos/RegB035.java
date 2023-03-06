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
@Table(name = "reg_b035")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB035.findAll", query = "SELECT r FROM RegB035 r"),
    @NamedQuery(name = "RegB035.findById", query = "SELECT r FROM RegB035 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB035.findByIdPai", query = "SELECT r FROM RegB035 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB035.findByLinha", query = "SELECT r FROM RegB035 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB035.findByHashfile", query = "SELECT r FROM RegB035 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegB035.findByReg", query = "SELECT r FROM RegB035 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB035.findByVlContP", query = "SELECT r FROM RegB035 r WHERE r.vlContP = :vlContP"),
    @NamedQuery(name = "RegB035.findByVlBcIssP", query = "SELECT r FROM RegB035 r WHERE r.vlBcIssP = :vlBcIssP"),
    @NamedQuery(name = "RegB035.findByAliqIss", query = "SELECT r FROM RegB035 r WHERE r.aliqIss = :aliqIss"),
    @NamedQuery(name = "RegB035.findByVlIssP", query = "SELECT r FROM RegB035 r WHERE r.vlIssP = :vlIssP"),
    @NamedQuery(name = "RegB035.findByVlIsntIssP", query = "SELECT r FROM RegB035 r WHERE r.vlIsntIssP = :vlIsntIssP"),
    @NamedQuery(name = "RegB035.findByCodServ", query = "SELECT r FROM RegB035 r WHERE r.codServ = :codServ")})
@Registros(nivel = 3)
public class RegB035 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegB030 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_CONT_P", precision = 15, scale = 6)
    private BigDecimal vlContP;

    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_BC_ISS_P", precision = 15, scale = 6)
    private BigDecimal vlBcIssP;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "ALIQ_ISS", precision = 15, scale = 6)
    private BigDecimal aliqIss;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ISS_P", precision = 15, scale = 6)
    private BigDecimal vlIssP;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ISNT_ISS_P", precision = 15, scale = 6)
    private BigDecimal vlIsntIssP;

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "COD_SERV")
    private String codServ;

    public RegB035() {
    }

    public RegB035(String id) {
        this.id = id;
    }

    public RegB035(String id, RegB030 idPai, long linha, String hashfile) {
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

    public RegB030 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegB030) idPai;
    }

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

    public BigDecimal getVlContP() {
        return vlContP;
    }

    public void setVlContP(BigDecimal vlContP) {
        this.vlContP = vlContP;
    }

    public BigDecimal getVlBcIssP() {
        return vlBcIssP;
    }

    public void setVlBcIssP(BigDecimal vlBcIssP) {
        this.vlBcIssP = vlBcIssP;
    }

    public BigDecimal getAliqIss() {
        return aliqIss;
    }

    public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
    }

    public BigDecimal getVlIssP() {
        return vlIssP;
    }

    public void setVlIssP(BigDecimal vlIssP) {
        this.vlIssP = vlIssP;
    }

    public BigDecimal getVlIsntIssP() {
        return vlIsntIssP;
    }

    public void setVlIsntIssP(BigDecimal vlIsntIssP) {
        this.vlIsntIssP = vlIsntIssP;
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
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
        if (!(object instanceof RegB035)) {
            return false;
        }
        RegB035 other = (RegB035) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB035[ id=" + id + " ]";
    }

}
