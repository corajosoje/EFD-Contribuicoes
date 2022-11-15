package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1250")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1250.findAll", query = "SELECT r FROM Reg1250 r"),
    @NamedQuery(name = "Reg1250.findById", query = "SELECT r FROM Reg1250 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1250.findByIdPai", query = "SELECT r FROM Reg1250 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1250.findByLinha", query = "SELECT r FROM Reg1250 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1250.findByHash", query = "SELECT r FROM Reg1250 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1250.findByReg", query = "SELECT r FROM Reg1250 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1250.findByVlCreditoIcmsOp", query = "SELECT r FROM Reg1250 r WHERE r.vlCreditoIcmsOp = :vlCreditoIcmsOp"),
    @NamedQuery(name = "Reg1250.findByVlIcmsStRest", query = "SELECT r FROM Reg1250 r WHERE r.vlIcmsStRest = :vlIcmsStRest"),
    @NamedQuery(name = "Reg1250.findByVlFcpStRest", query = "SELECT r FROM Reg1250 r WHERE r.vlFcpStRest = :vlFcpStRest"),
    @NamedQuery(name = "Reg1250.findByVlIcmsStCompl", query = "SELECT r FROM Reg1250 r WHERE r.vlIcmsStCompl = :vlIcmsStCompl"),
    @NamedQuery(name = "Reg1250.findByVlFcpStCompl", query = "SELECT r FROM Reg1250 r WHERE r.vlFcpStCompl = :vlFcpStCompl")})
@Registros(nivel = 2)
public class Reg1250 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    public Reg1001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1001) idPai;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_CREDITO_ICMS_OP")
    private BigDecimal vlCreditoIcmsOp;

    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_ICMS_ST_REST")
    private BigDecimal vlIcmsStRest;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_FCP_ST_REST")
    private BigDecimal vlFcpStRest;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ICMS_ST_COMPL")
    private BigDecimal vlIcmsStCompl;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_FCP_ST_COMPL")
    private BigDecimal vlFcpStCompl;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1250> reg1250;

    public List<Reg1250> getReg1250() {
        return reg1250;
    }

    public void setReg1250(List<Reg1250> reg1250) {
        this.reg1250 = reg1250;
    }

    public Reg1250() {
    }

    public Reg1250(Long id) {
        this.id = id;
    }

    public Reg1250(Long id, Reg1001 idPai, long linha, String hash) {
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

    public BigDecimal getVlCreditoIcmsOp() {
        return vlCreditoIcmsOp;
    }

    public void setVlCreditoIcmsOp(BigDecimal vlCreditoIcmsOp) {
        this.vlCreditoIcmsOp = vlCreditoIcmsOp;
    }

    public BigDecimal getVlIcmsStRest() {
        return vlIcmsStRest;
    }

    public void setVlIcmsStRest(BigDecimal vlIcmsStRest) {
        this.vlIcmsStRest = vlIcmsStRest;
    }

    public BigDecimal getVlFcpStRest() {
        return vlFcpStRest;
    }

    public void setVlFcpStRest(BigDecimal vlFcpStRest) {
        this.vlFcpStRest = vlFcpStRest;
    }

    public BigDecimal getVlIcmsStCompl() {
        return vlIcmsStCompl;
    }

    public void setVlIcmsStCompl(BigDecimal vlIcmsStCompl) {
        this.vlIcmsStCompl = vlIcmsStCompl;
    }

    public BigDecimal getVlFcpStCompl() {
        return vlFcpStCompl;
    }

    public void setVlFcpStCompl(BigDecimal vlFcpStCompl) {
        this.vlFcpStCompl = vlFcpStCompl;
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
        if (!(object instanceof Reg1250)) {
            return false;
        }
        Reg1250 other = (Reg1250) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1250[ id=" + id + " ]";
    }

}
