
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
@Table(name = "reg_e110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE110.findAll", query = "SELECT r FROM RegE110 r"),
    @NamedQuery(name = "RegE110.findById", query = "SELECT r FROM RegE110 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE110.findByIdPai", query = "SELECT r FROM RegE110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE110.findByLinha", query = "SELECT r FROM RegE110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE110.findByHash", query = "SELECT r FROM RegE110 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE110.findByReg", query = "SELECT r FROM RegE110 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE110.findByVlTotDebitos", query = "SELECT r FROM RegE110 r WHERE r.vlTotDebitos = :vlTotDebitos"),
    @NamedQuery(name = "RegE110.findByVlAjDebitos", query = "SELECT r FROM RegE110 r WHERE r.vlAjDebitos = :vlAjDebitos"),
    @NamedQuery(name = "RegE110.findByVlTotAjDebitos", query = "SELECT r FROM RegE110 r WHERE r.vlTotAjDebitos = :vlTotAjDebitos"),
    @NamedQuery(name = "RegE110.findByVlEstornosCred", query = "SELECT r FROM RegE110 r WHERE r.vlEstornosCred = :vlEstornosCred"),
    @NamedQuery(name = "RegE110.findByVlTotCreditos", query = "SELECT r FROM RegE110 r WHERE r.vlTotCreditos = :vlTotCreditos"),
    @NamedQuery(name = "RegE110.findByVlAjCreditos", query = "SELECT r FROM RegE110 r WHERE r.vlAjCreditos = :vlAjCreditos"),
    @NamedQuery(name = "RegE110.findByVlTotAjCreditos", query = "SELECT r FROM RegE110 r WHERE r.vlTotAjCreditos = :vlTotAjCreditos"),
    @NamedQuery(name = "RegE110.findByVlEstornosDeb", query = "SELECT r FROM RegE110 r WHERE r.vlEstornosDeb = :vlEstornosDeb"),
    @NamedQuery(name = "RegE110.findByVlSldCredorAnt", query = "SELECT r FROM RegE110 r WHERE r.vlSldCredorAnt = :vlSldCredorAnt"),
    @NamedQuery(name = "RegE110.findByVlSldApurado", query = "SELECT r FROM RegE110 r WHERE r.vlSldApurado = :vlSldApurado"),
    @NamedQuery(name = "RegE110.findByVlTotDed", query = "SELECT r FROM RegE110 r WHERE r.vlTotDed = :vlTotDed"),
    @NamedQuery(name = "RegE110.findByVlIcmsRecolher", query = "SELECT r FROM RegE110 r WHERE r.vlIcmsRecolher = :vlIcmsRecolher"),
    @NamedQuery(name = "RegE110.findByVlSldCredorTransportar", query = "SELECT r FROM RegE110 r WHERE r.vlSldCredorTransportar = :vlSldCredorTransportar"),
    @NamedQuery(name = "RegE110.findByDebEsp", query = "SELECT r FROM RegE110 r WHERE r.debEsp = :debEsp")})
public class RegE110 implements Serializable {

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
    @Column(name = "VL_TOT_DEBITOS")
    private BigDecimal vlTotDebitos;
    @Column(name = "VL_AJ_DEBITOS")
    private BigDecimal vlAjDebitos;
    @Column(name = "VL_TOT_AJ_DEBITOS")
    private BigDecimal vlTotAjDebitos;
    @Column(name = "VL_ESTORNOS_CRED")
    private BigDecimal vlEstornosCred;
    @Column(name = "VL_TOT_CREDITOS")
    private BigDecimal vlTotCreditos;
    @Column(name = "VL_AJ_CREDITOS")
    private BigDecimal vlAjCreditos;
    @Column(name = "VL_TOT_AJ_CREDITOS")
    private BigDecimal vlTotAjCreditos;
    @Column(name = "VL_ESTORNOS_DEB")
    private BigDecimal vlEstornosDeb;
    @Column(name = "VL_SLD_CREDOR_ANT")
    private BigDecimal vlSldCredorAnt;
    @Column(name = "VL_SLD_APURADO")
    private BigDecimal vlSldApurado;
    @Column(name = "VL_TOT_DED")
    private BigDecimal vlTotDed;
    @Column(name = "VL_ICMS_RECOLHER")
    private BigDecimal vlIcmsRecolher;
    @Column(name = "VL_SLD_CREDOR_TRANSPORTAR")
    private BigDecimal vlSldCredorTransportar;
    @Column(name = "DEB_ESP")
    private BigDecimal debEsp;

    public RegE110() {
    }

    public RegE110(Long id) {
        this.id = id;
    }

    public RegE110(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getVlTotDebitos() {
        return vlTotDebitos;
    }

    public void setVlTotDebitos(BigDecimal vlTotDebitos) {
        this.vlTotDebitos = vlTotDebitos;
    }

    public BigDecimal getVlAjDebitos() {
        return vlAjDebitos;
    }

    public void setVlAjDebitos(BigDecimal vlAjDebitos) {
        this.vlAjDebitos = vlAjDebitos;
    }

    public BigDecimal getVlTotAjDebitos() {
        return vlTotAjDebitos;
    }

    public void setVlTotAjDebitos(BigDecimal vlTotAjDebitos) {
        this.vlTotAjDebitos = vlTotAjDebitos;
    }

    public BigDecimal getVlEstornosCred() {
        return vlEstornosCred;
    }

    public void setVlEstornosCred(BigDecimal vlEstornosCred) {
        this.vlEstornosCred = vlEstornosCred;
    }

    public BigDecimal getVlTotCreditos() {
        return vlTotCreditos;
    }

    public void setVlTotCreditos(BigDecimal vlTotCreditos) {
        this.vlTotCreditos = vlTotCreditos;
    }

    public BigDecimal getVlAjCreditos() {
        return vlAjCreditos;
    }

    public void setVlAjCreditos(BigDecimal vlAjCreditos) {
        this.vlAjCreditos = vlAjCreditos;
    }

    public BigDecimal getVlTotAjCreditos() {
        return vlTotAjCreditos;
    }

    public void setVlTotAjCreditos(BigDecimal vlTotAjCreditos) {
        this.vlTotAjCreditos = vlTotAjCreditos;
    }

    public BigDecimal getVlEstornosDeb() {
        return vlEstornosDeb;
    }

    public void setVlEstornosDeb(BigDecimal vlEstornosDeb) {
        this.vlEstornosDeb = vlEstornosDeb;
    }

    public BigDecimal getVlSldCredorAnt() {
        return vlSldCredorAnt;
    }

    public void setVlSldCredorAnt(BigDecimal vlSldCredorAnt) {
        this.vlSldCredorAnt = vlSldCredorAnt;
    }

    public BigDecimal getVlSldApurado() {
        return vlSldApurado;
    }

    public void setVlSldApurado(BigDecimal vlSldApurado) {
        this.vlSldApurado = vlSldApurado;
    }

    public BigDecimal getVlTotDed() {
        return vlTotDed;
    }

    public void setVlTotDed(BigDecimal vlTotDed) {
        this.vlTotDed = vlTotDed;
    }

    public BigDecimal getVlIcmsRecolher() {
        return vlIcmsRecolher;
    }

    public void setVlIcmsRecolher(BigDecimal vlIcmsRecolher) {
        this.vlIcmsRecolher = vlIcmsRecolher;
    }

    public BigDecimal getVlSldCredorTransportar() {
        return vlSldCredorTransportar;
    }

    public void setVlSldCredorTransportar(BigDecimal vlSldCredorTransportar) {
        this.vlSldCredorTransportar = vlSldCredorTransportar;
    }

    public BigDecimal getDebEsp() {
        return debEsp;
    }

    public void setDebEsp(BigDecimal debEsp) {
        this.debEsp = debEsp;
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
        if (!(object instanceof RegE110)) {
            return false;
        }
        RegE110 other = (RegE110) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE110[ id=" + id + " ]";
    }

}
