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
@Table(name = "reg_1255")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1255.findAll", query = "SELECT r FROM Reg1255 r"),
    @NamedQuery(name = "Reg1255.findById", query = "SELECT r FROM Reg1255 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1255.findByIdPai", query = "SELECT r FROM Reg1255 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1255.findByLinha", query = "SELECT r FROM Reg1255 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1255.findByHash", query = "SELECT r FROM Reg1255 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1255.findByReg", query = "SELECT r FROM Reg1255 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1255.findByCodMotRestCompl", query = "SELECT r FROM Reg1255 r WHERE r.codMotRestCompl = :codMotRestCompl"),
    @NamedQuery(name = "Reg1255.findByVlCreditoIcmsOpMot", query = "SELECT r FROM Reg1255 r WHERE r.vlCreditoIcmsOpMot = :vlCreditoIcmsOpMot"),
    @NamedQuery(name = "Reg1255.findByVlIcmsStRestMot", query = "SELECT r FROM Reg1255 r WHERE r.vlIcmsStRestMot = :vlIcmsStRestMot"),
    @NamedQuery(name = "Reg1255.findByVlFcpStRestMot", query = "SELECT r FROM Reg1255 r WHERE r.vlFcpStRestMot = :vlFcpStRestMot"),
    @NamedQuery(name = "Reg1255.findByVlIcmsStComplMot", query = "SELECT r FROM Reg1255 r WHERE r.vlIcmsStComplMot = :vlIcmsStComplMot"),
    @NamedQuery(name = "Reg1255.findByVlFcpStComplMot", query = "SELECT r FROM Reg1255 r WHERE r.vlFcpStComplMot = :vlFcpStComplMot")})
@Registros(nivel = 3)
public class Reg1255 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1250 idPai;

    public Reg1250 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1250) idPai;
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
    @Column(name = "COD_MOT_REST_COMPL")
    private String codMotRestCompl;

    @Campos(posicao = 3, tipo = 'R')
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_CREDITO_ICMS_OP_MOT")
    private BigDecimal vlCreditoIcmsOpMot;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ICMS_ST_REST_MOT")
    private BigDecimal vlIcmsStRestMot;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_FCP_ST_REST_MOT")
    private BigDecimal vlFcpStRestMot;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ICMS_ST_COMPL_MOT")
    private BigDecimal vlIcmsStComplMot;

    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_FCP_ST_COMPL_MOT")
    private BigDecimal vlFcpStComplMot;

    public Reg1255() {
    }

    public Reg1255(Long id) {
        this.id = id;
    }

    public Reg1255(Long id, Reg1250 idPai, long linha, String hash) {
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

    public String getCodMotRestCompl() {
        return codMotRestCompl;
    }

    public void setCodMotRestCompl(String codMotRestCompl) {
        this.codMotRestCompl = codMotRestCompl;
    }

    public BigDecimal getVlCreditoIcmsOpMot() {
        return vlCreditoIcmsOpMot;
    }

    public void setVlCreditoIcmsOpMot(BigDecimal vlCreditoIcmsOpMot) {
        this.vlCreditoIcmsOpMot = vlCreditoIcmsOpMot;
    }

    public BigDecimal getVlIcmsStRestMot() {
        return vlIcmsStRestMot;
    }

    public void setVlIcmsStRestMot(BigDecimal vlIcmsStRestMot) {
        this.vlIcmsStRestMot = vlIcmsStRestMot;
    }

    public BigDecimal getVlFcpStRestMot() {
        return vlFcpStRestMot;
    }

    public void setVlFcpStRestMot(BigDecimal vlFcpStRestMot) {
        this.vlFcpStRestMot = vlFcpStRestMot;
    }

    public BigDecimal getVlIcmsStComplMot() {
        return vlIcmsStComplMot;
    }

    public void setVlIcmsStComplMot(BigDecimal vlIcmsStComplMot) {
        this.vlIcmsStComplMot = vlIcmsStComplMot;
    }

    public BigDecimal getVlFcpStComplMot() {
        return vlFcpStComplMot;
    }

    public void setVlFcpStComplMot(BigDecimal vlFcpStComplMot) {
        this.vlFcpStComplMot = vlFcpStComplMot;
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
        if (!(object instanceof Reg1255)) {
            return false;
        }
        Reg1255 other = (Reg1255) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1255[ id=" + id + " ]";
    }

}
