package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_e310")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE310.findAll", query = "SELECT r FROM RegE310 r"),
    @NamedQuery(name = "RegE310.findById", query = "SELECT r FROM RegE310 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE310.findByIdPai", query = "SELECT r FROM RegE310 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE310.findByLinha", query = "SELECT r FROM RegE310 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE310.findByHashfile", query = "SELECT r FROM RegE310 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE310.findByReg", query = "SELECT r FROM RegE310 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE310.findByIndMovDifal", query = "SELECT r FROM RegE310 r WHERE r.indMovDifal = :indMovDifal"),
    @NamedQuery(name = "RegE310.findByVlSldCredAntDifal", query = "SELECT r FROM RegE310 r WHERE r.vlSldCredAntDifal = :vlSldCredAntDifal"),
    @NamedQuery(name = "RegE310.findByVlTotDebitosDifal", query = "SELECT r FROM RegE310 r WHERE r.vlTotDebitosDifal = :vlTotDebitosDifal"),
    @NamedQuery(name = "RegE310.findByVlOutDebDifal", query = "SELECT r FROM RegE310 r WHERE r.vlOutDebDifal = :vlOutDebDifal"),
    @NamedQuery(name = "RegE310.findByVlTotCreditosDifal", query = "SELECT r FROM RegE310 r WHERE r.vlTotCreditosDifal = :vlTotCreditosDifal"),
    @NamedQuery(name = "RegE310.findByVlOutCredDifal", query = "SELECT r FROM RegE310 r WHERE r.vlOutCredDifal = :vlOutCredDifal"),
    @NamedQuery(name = "RegE310.findByVlSldDevAntDifal", query = "SELECT r FROM RegE310 r WHERE r.vlSldDevAntDifal = :vlSldDevAntDifal"),
    @NamedQuery(name = "RegE310.findByVlDeducoesDifal", query = "SELECT r FROM RegE310 r WHERE r.vlDeducoesDifal = :vlDeducoesDifal"),
    @NamedQuery(name = "RegE310.findByVlRecolDifal", query = "SELECT r FROM RegE310 r WHERE r.vlRecolDifal = :vlRecolDifal"),
    @NamedQuery(name = "RegE310.findByVlSldCredTransportarDifal", query = "SELECT r FROM RegE310 r WHERE r.vlSldCredTransportarDifal = :vlSldCredTransportarDifal"),
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
@Registros(nivel = 3)
public class RegE310 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE300 idPai;

    public RegE300 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE300) idPai;
    }

    public RegE310() {
    }

    public RegE310(String id) {
        this.id = id;
    }

    public RegE310(String id, RegE300 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE311> regE311;

    public List<RegE311> getRegE311() {
        return regE311;
    }

    public void setRegE311(List<RegE311> regE311) {
        this.regE311 = regE311;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE316> regE316;

    public List<RegE316> getRegE316() {
        return regE316;
    }

    public void setRegE316(List<RegE316> regE316) {
        this.regE316 = regE316;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_MOV_DIFAL")
    private String indMovDifal;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_SLD_CRED_ANT_DIFAL", precision = 15, scale = 6)
    private BigDecimal vlSldCredAntDifal;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_TOT_DEBITOS_DIFAL", precision = 15, scale = 6)
    private BigDecimal vlTotDebitosDifal;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_OUT_DEB_DIFAL", precision = 15, scale = 6)
    private BigDecimal vlOutDebDifal;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_TOT_CREDITOS_DIFAL", precision = 15, scale = 6)
    private BigDecimal vlTotCreditosDifal;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_OUT_CRED_DIFAL", precision = 15, scale = 6)
    private BigDecimal vlOutCredDifal;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_SLD_DEV_ANT_DIFAL", precision = 15, scale = 6)
    private BigDecimal vlSldDevAntDifal;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_DEDUCOES_DIFAL", precision = 15, scale = 6)
    private BigDecimal vlDeducoesDifal;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_RECOL_DIFAL", precision = 15, scale = 6)
    private BigDecimal vlRecolDifal;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_SLD_CRED_TRANSPORTAR_DIFAL", precision = 15, scale = 6)
    private BigDecimal vlSldCredTransportarDifal;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "DEB_ESP_DIFAL", precision = 15, scale = 6)
    private BigDecimal debEspDifal;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_SLD_CRED_ANT_FCP", precision = 15, scale = 6)
    private BigDecimal vlSldCredAntFcp;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_TOT_DEB_FCP", precision = 15, scale = 6)
    private BigDecimal vlTotDebFcp;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_OUT_DEB_FCP", precision = 15, scale = 6)
    private BigDecimal vlOutDebFcp;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_TOT_CRED_FCP", precision = 15, scale = 6)
    private BigDecimal vlTotCredFcp;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_OUT_CRED_FCP", precision = 15, scale = 6)
    private BigDecimal vlOutCredFcp;
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_SLD_DEV_ANT_FCP", precision = 15, scale = 6)
    private BigDecimal vlSldDevAntFcp;
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_DEDUCOES_FCP", precision = 15, scale = 6)
    private BigDecimal vlDeducoesFcp;
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_RECOL_FCP", precision = 15, scale = 6)
    private BigDecimal vlRecolFcp;
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_SLD_CRED_TRANSPORTAR_FCP", precision = 15, scale = 6)
    private BigDecimal vlSldCredTransportarFcp;
    @Campos(posicao = 22, tipo = 'R')
    @Column(name = "DEB_ESP_FCP", precision = 15, scale = 6)
    private BigDecimal debEspFcp;

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

    public BigDecimal getVlRecolDifal() {
        return vlRecolDifal;
    }

    public void setVlRecolDifal(BigDecimal vlRecolDifal) {
        this.vlRecolDifal = vlRecolDifal;
    }

    public BigDecimal getVlSldCredTransportarDifal() {
        return vlSldCredTransportarDifal;
    }

    public void setVlSldCredTransportarDifal(BigDecimal vlSldCredTransportarDifal) {
        this.vlSldCredTransportarDifal = vlSldCredTransportarDifal;
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
