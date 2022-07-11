
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
@Table(name = "reg_1920")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1920.findAll", query = "SELECT r FROM Reg1920 r"),
    @NamedQuery(name = "Reg1920.findById", query = "SELECT r FROM Reg1920 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1920.findByIdPai", query = "SELECT r FROM Reg1920 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1920.findByLinha", query = "SELECT r FROM Reg1920 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1920.findByHash", query = "SELECT r FROM Reg1920 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1920.findByReg", query = "SELECT r FROM Reg1920 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1920.findByVlTotTransfDebitosOa", query = "SELECT r FROM Reg1920 r WHERE r.vlTotTransfDebitosOa = :vlTotTransfDebitosOa"),
    @NamedQuery(name = "Reg1920.findByVlTotAjDebitosOa", query = "SELECT r FROM Reg1920 r WHERE r.vlTotAjDebitosOa = :vlTotAjDebitosOa"),
    @NamedQuery(name = "Reg1920.findByVlEstornosCredOa", query = "SELECT r FROM Reg1920 r WHERE r.vlEstornosCredOa = :vlEstornosCredOa"),
    @NamedQuery(name = "Reg1920.findByVlTotTransfCreditosOa", query = "SELECT r FROM Reg1920 r WHERE r.vlTotTransfCreditosOa = :vlTotTransfCreditosOa"),
    @NamedQuery(name = "Reg1920.findByVlTotAjCreditosOa", query = "SELECT r FROM Reg1920 r WHERE r.vlTotAjCreditosOa = :vlTotAjCreditosOa"),
    @NamedQuery(name = "Reg1920.findByVlEstornosDebOa", query = "SELECT r FROM Reg1920 r WHERE r.vlEstornosDebOa = :vlEstornosDebOa"),
    @NamedQuery(name = "Reg1920.findByVlSldCredorAntOa", query = "SELECT r FROM Reg1920 r WHERE r.vlSldCredorAntOa = :vlSldCredorAntOa"),
    @NamedQuery(name = "Reg1920.findByVlSldApuradoOa", query = "SELECT r FROM Reg1920 r WHERE r.vlSldApuradoOa = :vlSldApuradoOa"),
    @NamedQuery(name = "Reg1920.findByVlTotDed", query = "SELECT r FROM Reg1920 r WHERE r.vlTotDed = :vlTotDed"),
    @NamedQuery(name = "Reg1920.findByVlIcmsRecolherOa", query = "SELECT r FROM Reg1920 r WHERE r.vlIcmsRecolherOa = :vlIcmsRecolherOa"),
    @NamedQuery(name = "Reg1920.findByVlSldCredorTranspOa", query = "SELECT r FROM Reg1920 r WHERE r.vlSldCredorTranspOa = :vlSldCredorTranspOa"),
    @NamedQuery(name = "Reg1920.findByDebEspOa", query = "SELECT r FROM Reg1920 r WHERE r.debEspOa = :debEspOa")})
public class Reg1920 implements Serializable {

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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_TOT_TRANSF_DEBITOS_OA")
    private BigDecimal vlTotTransfDebitosOa;
    @Column(name = "VL_TOT_AJ_DEBITOS_OA")
    private BigDecimal vlTotAjDebitosOa;
    @Column(name = "VL_ESTORNOS_CRED_OA")
    private BigDecimal vlEstornosCredOa;
    @Column(name = "VL_TOT_TRANSF_CREDITOS_OA")
    private BigDecimal vlTotTransfCreditosOa;
    @Column(name = "VL_TOT_AJ_CREDITOS_OA")
    private BigDecimal vlTotAjCreditosOa;
    @Column(name = "VL_ESTORNOS_DEB_OA")
    private BigDecimal vlEstornosDebOa;
    @Column(name = "VL_SLD_CREDOR_ANT_OA")
    private BigDecimal vlSldCredorAntOa;
    @Column(name = "VL_SLD_APURADO_OA")
    private BigDecimal vlSldApuradoOa;
    @Column(name = "VL_TOT_DED")
    private BigDecimal vlTotDed;
    @Column(name = "VL_ICMS_RECOLHER_OA")
    private BigDecimal vlIcmsRecolherOa;
    @Column(name = "VL_SLD_CREDOR_TRANSP_OA")
    private BigDecimal vlSldCredorTranspOa;
    @Column(name = "DEB_ESP_OA")
    private BigDecimal debEspOa;

    public Reg1920() {
    }

    public Reg1920(Long id) {
        this.id = id;
    }

    public Reg1920(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getVlTotTransfDebitosOa() {
        return vlTotTransfDebitosOa;
    }

    public void setVlTotTransfDebitosOa(BigDecimal vlTotTransfDebitosOa) {
        this.vlTotTransfDebitosOa = vlTotTransfDebitosOa;
    }

    public BigDecimal getVlTotAjDebitosOa() {
        return vlTotAjDebitosOa;
    }

    public void setVlTotAjDebitosOa(BigDecimal vlTotAjDebitosOa) {
        this.vlTotAjDebitosOa = vlTotAjDebitosOa;
    }

    public BigDecimal getVlEstornosCredOa() {
        return vlEstornosCredOa;
    }

    public void setVlEstornosCredOa(BigDecimal vlEstornosCredOa) {
        this.vlEstornosCredOa = vlEstornosCredOa;
    }

    public BigDecimal getVlTotTransfCreditosOa() {
        return vlTotTransfCreditosOa;
    }

    public void setVlTotTransfCreditosOa(BigDecimal vlTotTransfCreditosOa) {
        this.vlTotTransfCreditosOa = vlTotTransfCreditosOa;
    }

    public BigDecimal getVlTotAjCreditosOa() {
        return vlTotAjCreditosOa;
    }

    public void setVlTotAjCreditosOa(BigDecimal vlTotAjCreditosOa) {
        this.vlTotAjCreditosOa = vlTotAjCreditosOa;
    }

    public BigDecimal getVlEstornosDebOa() {
        return vlEstornosDebOa;
    }

    public void setVlEstornosDebOa(BigDecimal vlEstornosDebOa) {
        this.vlEstornosDebOa = vlEstornosDebOa;
    }

    public BigDecimal getVlSldCredorAntOa() {
        return vlSldCredorAntOa;
    }

    public void setVlSldCredorAntOa(BigDecimal vlSldCredorAntOa) {
        this.vlSldCredorAntOa = vlSldCredorAntOa;
    }

    public BigDecimal getVlSldApuradoOa() {
        return vlSldApuradoOa;
    }

    public void setVlSldApuradoOa(BigDecimal vlSldApuradoOa) {
        this.vlSldApuradoOa = vlSldApuradoOa;
    }

    public BigDecimal getVlTotDed() {
        return vlTotDed;
    }

    public void setVlTotDed(BigDecimal vlTotDed) {
        this.vlTotDed = vlTotDed;
    }

    public BigDecimal getVlIcmsRecolherOa() {
        return vlIcmsRecolherOa;
    }

    public void setVlIcmsRecolherOa(BigDecimal vlIcmsRecolherOa) {
        this.vlIcmsRecolherOa = vlIcmsRecolherOa;
    }

    public BigDecimal getVlSldCredorTranspOa() {
        return vlSldCredorTranspOa;
    }

    public void setVlSldCredorTranspOa(BigDecimal vlSldCredorTranspOa) {
        this.vlSldCredorTranspOa = vlSldCredorTranspOa;
    }

    public BigDecimal getDebEspOa() {
        return debEspOa;
    }

    public void setDebEspOa(BigDecimal debEspOa) {
        this.debEspOa = debEspOa;
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
        if (!(object instanceof Reg1920)) {
            return false;
        }
        Reg1920 other = (Reg1920) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1920[ id=" + id + " ]";
    }

}
