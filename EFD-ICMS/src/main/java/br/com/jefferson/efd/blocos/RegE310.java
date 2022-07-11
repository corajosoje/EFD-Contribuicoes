
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_e310")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE310.findAll", query = "SELECT r FROM RegE310 r"),
    @NamedQuery(name = "RegE310.findById", query = "SELECT r FROM RegE310 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE310.findByIdPai", query = "SELECT r FROM RegE310 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE310.findByLinha", query = "SELECT r FROM RegE310 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE310.findByHash", query = "SELECT r FROM RegE310 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE310.findByReg", query = "SELECT r FROM RegE310 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE310.findByIndMovDifal", query = "SELECT r FROM RegE310 r WHERE r.indMovDifal = :indMovDifal"),
    @NamedQuery(name = "RegE310.findByVlSldCredAntDifal", query = "SELECT r FROM RegE310 r WHERE r.vlSldCredAntDifal = :vlSldCredAntDifal"),
    @NamedQuery(name = "RegE310.findByVlTotDebitosDifal", query = "SELECT r FROM RegE310 r WHERE r.vlTotDebitosDifal = :vlTotDebitosDifal"),
    @NamedQuery(name = "RegE310.findByVlOutDebDifal", query = "SELECT r FROM RegE310 r WHERE r.vlOutDebDifal = :vlOutDebDifal"),
    @NamedQuery(name = "RegE310.findByVlTotCreditosDifal", query = "SELECT r FROM RegE310 r WHERE r.vlTotCreditosDifal = :vlTotCreditosDifal"),
    @NamedQuery(name = "RegE310.findByVlOutCredDifal", query = "SELECT r FROM RegE310 r WHERE r.vlOutCredDifal = :vlOutCredDifal"),
    @NamedQuery(name = "RegE310.findByVlSldDevAntDifal", query = "SELECT r FROM RegE310 r WHERE r.vlSldDevAntDifal = :vlSldDevAntDifal"),
    @NamedQuery(name = "RegE310.findByVlDeducoesDifal", query = "SELECT r FROM RegE310 r WHERE r.vlDeducoesDifal = :vlDeducoesDifal"),
    @NamedQuery(name = "RegE310.findByVlRecol", query = "SELECT r FROM RegE310 r WHERE r.vlRecol = :vlRecol"),
    @NamedQuery(name = "RegE310.findByVlSldCredTransportar", query = "SELECT r FROM RegE310 r WHERE r.vlSldCredTransportar = :vlSldCredTransportar"),
    @NamedQuery(name = "RegE310.findByDebEspDifal", query = "SELECT r FROM RegE310 r WHERE r.debEspDifal = :debEspDifal"),
    @NamedQuery(name = "RegE310.findByVlSldCredAntFcp", query = "SELECT r FROM RegE310 r WHERE r.vlSldCredAntFcp = :vlSldCredAntFcp"),
    @NamedQuery(name = "RegE310.findByVlTotDebFcp", query = "SELECT r FROM RegE310 r WHERE r.vlTotDebFcp = :vlTotDebFcp"),
    @NamedQuery(name = "RegE310.findByVlOutDebFcp", query = "SELECT r FROM RegE310 r WHERE r.vlOutDebFcp = :vlOutDebFcp"),
    @NamedQuery(name = "RegE310.findByVlTotCredFcp", query = "SELECT r FROM RegE310 r WHERE r.vlTotCredFcp = :vlTotCredFcp"),
    @NamedQuery(name = "RegE310.findByVlOutCredFcp", query = "SELECT r FROM RegE310 r WHERE r.vlOutCredFcp = :vlOutCredFcp"),
    @NamedQuery(name = "RegE310.findByVlSldDevAntFcp", query = "SELECT r FROM RegE310 r WHERE r.vlSldDevAntFcp = :vlSldDevAntFcp"),
    @NamedQuery(name = "RegE310.findByVlDeducoesFcp", query = "SELECT r FROM RegE310 r WHERE r.vlDeducoesFcp = :vlDeducoesFcp"),
    @NamedQuery(name = "RegE310.findByVlRecolFcp", query = "SELECT r FROM RegE310 r WHERE r.vlRecolFcp = :vlRecolFcp"),
    @NamedQuery(name = "RegE310.findByVlSldCredTransportarFcp", query = "SELECT r FROM RegE310 r WHERE r.vlSldCredTransportarFcp = :vlSldCredTransportarFcp"),
    @NamedQuery(name = "RegE310.findByDebEspFcp", query = "SELECT r FROM RegE310 r WHERE r.debEspFcp = :debEspFcp")})
public class RegE310 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_PAI")
    private long idPai;
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private long hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "IND_MOV_DIFAL")
    private String indMovDifal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_SLD_CRED_ANT_DIFAL")
    private BigDecimal vlSldCredAntDifal;
    @Column(name = "VL_TOT_DEBITOS_DIFAL")
    private BigDecimal vlTotDebitosDifal;
    @Column(name = "VL_OUT_DEB_DIFAL")
    private BigDecimal vlOutDebDifal;
    @Column(name = "VL_TOT_CREDITOS_DIFAL")
    private BigDecimal vlTotCreditosDifal;
    @Column(name = "VL_OUT_CRED_DIFAL")
    private BigDecimal vlOutCredDifal;
    @Column(name = "VL_SLD_DEV_ANT_DIFAL")
    private BigDecimal vlSldDevAntDifal;
    @Column(name = "VL_DEDUCOES_DIFAL")
    private BigDecimal vlDeducoesDifal;
    @Column(name = "VL_RECOL")
    private BigDecimal vlRecol;
    @Column(name = "VL_SLD_CRED_TRANSPORTAR")
    private BigDecimal vlSldCredTransportar;
    @Column(name = "DEB_ESP_DIFAL")
    private BigDecimal debEspDifal;
    @Column(name = "VL_SLD_CRED_ANT_FCP")
    private BigDecimal vlSldCredAntFcp;
    @Column(name = "VL_TOT_DEB_FCP")
    private BigDecimal vlTotDebFcp;
    @Column(name = "VL_OUT_DEB_FCP")
    private BigDecimal vlOutDebFcp;
    @Column(name = "VL_TOT_CRED_FCP")
    private BigDecimal vlTotCredFcp;
    @Column(name = "VL_OUT_CRED_FCP")
    private BigDecimal vlOutCredFcp;
    @Column(name = "VL_SLD_DEV_ANT_FCP")
    private BigDecimal vlSldDevAntFcp;
    @Column(name = "VL_DEDUCOES_FCP")
    private BigDecimal vlDeducoesFcp;
    @Column(name = "VL_RECOL_FCP")
    private BigDecimal vlRecolFcp;
    @Column(name = "VL_SLD_CRED_TRANSPORTAR_FCP")
    private BigDecimal vlSldCredTransportarFcp;
    @Column(name = "DEB_ESP_FCP")
    private BigDecimal debEspFcp;

    public RegE310() {
    }

    public RegE310(Long id) {
        this.id = id;
    }

    public RegE310(Long id, long idPai, long linha, long hash) {
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

    public long getIdPai() {
        return idPai;
    }

    public void setIdPai(long idPai) {
        this.idPai = idPai;
    }

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
        this.hash = hash;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getIndMovDifal() {
        return indMovDifal;
    }

    public void setIndMovDifal(String indMovDifal) {
        this.indMovDifal = indMovDifal;
    }

    public BigDecimal getVlSldCredAntDifal() {
        return vlSldCredAntDifal;
    }

    public void setVlSldCredAntDifal(BigDecimal vlSldCredAntDifal) {
        this.vlSldCredAntDifal = vlSldCredAntDifal;
    }

    public BigDecimal getVlTotDebitosDifal() {
        return vlTotDebitosDifal;
    }

    public void setVlTotDebitosDifal(BigDecimal vlTotDebitosDifal) {
        this.vlTotDebitosDifal = vlTotDebitosDifal;
    }

    public BigDecimal getVlOutDebDifal() {
        return vlOutDebDifal;
    }

    public void setVlOutDebDifal(BigDecimal vlOutDebDifal) {
        this.vlOutDebDifal = vlOutDebDifal;
    }

    public BigDecimal getVlTotCreditosDifal() {
        return vlTotCreditosDifal;
    }

    public void setVlTotCreditosDifal(BigDecimal vlTotCreditosDifal) {
        this.vlTotCreditosDifal = vlTotCreditosDifal;
    }

    public BigDecimal getVlOutCredDifal() {
        return vlOutCredDifal;
    }

    public void setVlOutCredDifal(BigDecimal vlOutCredDifal) {
        this.vlOutCredDifal = vlOutCredDifal;
    }

    public BigDecimal getVlSldDevAntDifal() {
        return vlSldDevAntDifal;
    }

    public void setVlSldDevAntDifal(BigDecimal vlSldDevAntDifal) {
        this.vlSldDevAntDifal = vlSldDevAntDifal;
    }

    public BigDecimal getVlDeducoesDifal() {
        return vlDeducoesDifal;
    }

    public void setVlDeducoesDifal(BigDecimal vlDeducoesDifal) {
        this.vlDeducoesDifal = vlDeducoesDifal;
    }

    public BigDecimal getVlRecol() {
        return vlRecol;
    }

    public void setVlRecol(BigDecimal vlRecol) {
        this.vlRecol = vlRecol;
    }

    public BigDecimal getVlSldCredTransportar() {
        return vlSldCredTransportar;
    }

    public void setVlSldCredTransportar(BigDecimal vlSldCredTransportar) {
        this.vlSldCredTransportar = vlSldCredTransportar;
    }

    public BigDecimal getDebEspDifal() {
        return debEspDifal;
    }

    public void setDebEspDifal(BigDecimal debEspDifal) {
        this.debEspDifal = debEspDifal;
    }

    public BigDecimal getVlSldCredAntFcp() {
        return vlSldCredAntFcp;
    }

    public void setVlSldCredAntFcp(BigDecimal vlSldCredAntFcp) {
        this.vlSldCredAntFcp = vlSldCredAntFcp;
    }

    public BigDecimal getVlTotDebFcp() {
        return vlTotDebFcp;
    }

    public void setVlTotDebFcp(BigDecimal vlTotDebFcp) {
        this.vlTotDebFcp = vlTotDebFcp;
    }

    public BigDecimal getVlOutDebFcp() {
        return vlOutDebFcp;
    }

    public void setVlOutDebFcp(BigDecimal vlOutDebFcp) {
        this.vlOutDebFcp = vlOutDebFcp;
    }

    public BigDecimal getVlTotCredFcp() {
        return vlTotCredFcp;
    }

    public void setVlTotCredFcp(BigDecimal vlTotCredFcp) {
        this.vlTotCredFcp = vlTotCredFcp;
    }

    public BigDecimal getVlOutCredFcp() {
        return vlOutCredFcp;
    }

    public void setVlOutCredFcp(BigDecimal vlOutCredFcp) {
        this.vlOutCredFcp = vlOutCredFcp;
    }

    public BigDecimal getVlSldDevAntFcp() {
        return vlSldDevAntFcp;
    }

    public void setVlSldDevAntFcp(BigDecimal vlSldDevAntFcp) {
        this.vlSldDevAntFcp = vlSldDevAntFcp;
    }

    public BigDecimal getVlDeducoesFcp() {
        return vlDeducoesFcp;
    }

    public void setVlDeducoesFcp(BigDecimal vlDeducoesFcp) {
        this.vlDeducoesFcp = vlDeducoesFcp;
    }

    public BigDecimal getVlRecolFcp() {
        return vlRecolFcp;
    }

    public void setVlRecolFcp(BigDecimal vlRecolFcp) {
        this.vlRecolFcp = vlRecolFcp;
    }

    public BigDecimal getVlSldCredTransportarFcp() {
        return vlSldCredTransportarFcp;
    }

    public void setVlSldCredTransportarFcp(BigDecimal vlSldCredTransportarFcp) {
        this.vlSldCredTransportarFcp = vlSldCredTransportarFcp;
    }

    public BigDecimal getDebEspFcp() {
        return debEspFcp;
    }

    public void setDebEspFcp(BigDecimal debEspFcp) {
        this.debEspFcp = debEspFcp;
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
        if (!(object instanceof RegE310)) {
            return false;
        }
        RegE310 other = (RegE310) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE310[ id=" + id + " ]";
    }

}
