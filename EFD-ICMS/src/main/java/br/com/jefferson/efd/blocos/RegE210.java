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
@Table(name = "reg_e210")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE210.findAll", query = "SELECT r FROM RegE210 r"),
    @NamedQuery(name = "RegE210.findById", query = "SELECT r FROM RegE210 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE210.findByIdPai", query = "SELECT r FROM RegE210 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE210.findByLinha", query = "SELECT r FROM RegE210 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE210.findByHash", query = "SELECT r FROM RegE210 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE210.findByReg", query = "SELECT r FROM RegE210 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE210.findByIndMovSt", query = "SELECT r FROM RegE210 r WHERE r.indMovSt = :indMovSt"),
    @NamedQuery(name = "RegE210.findByVlSldCredAntSt", query = "SELECT r FROM RegE210 r WHERE r.vlSldCredAntSt = :vlSldCredAntSt"),
    @NamedQuery(name = "RegE210.findByVlDevolSt", query = "SELECT r FROM RegE210 r WHERE r.vlDevolSt = :vlDevolSt"),
    @NamedQuery(name = "RegE210.findByVlRessarcSt", query = "SELECT r FROM RegE210 r WHERE r.vlRessarcSt = :vlRessarcSt"),
    @NamedQuery(name = "RegE210.findByVlOutCredSt", query = "SELECT r FROM RegE210 r WHERE r.vlOutCredSt = :vlOutCredSt"),
    @NamedQuery(name = "RegE210.findByVlAjCreditosSt", query = "SELECT r FROM RegE210 r WHERE r.vlAjCreditosSt = :vlAjCreditosSt"),
    @NamedQuery(name = "RegE210.findByVlRetencaoSt", query = "SELECT r FROM RegE210 r WHERE r.vlRetencaoSt = :vlRetencaoSt"),
    @NamedQuery(name = "RegE210.findByVlOutDebSt", query = "SELECT r FROM RegE210 r WHERE r.vlOutDebSt = :vlOutDebSt"),
    @NamedQuery(name = "RegE210.findByVlAjDebitosSt", query = "SELECT r FROM RegE210 r WHERE r.vlAjDebitosSt = :vlAjDebitosSt"),
    @NamedQuery(name = "RegE210.findByVlSldDevAntSt", query = "SELECT r FROM RegE210 r WHERE r.vlSldDevAntSt = :vlSldDevAntSt"),
    @NamedQuery(name = "RegE210.findByVlDeducoesSt", query = "SELECT r FROM RegE210 r WHERE r.vlDeducoesSt = :vlDeducoesSt"),
    @NamedQuery(name = "RegE210.findByVlIcmsRecolSt", query = "SELECT r FROM RegE210 r WHERE r.vlIcmsRecolSt = :vlIcmsRecolSt"),
    @NamedQuery(name = "RegE210.findByVlSldCredStTransportar", query = "SELECT r FROM RegE210 r WHERE r.vlSldCredStTransportar = :vlSldCredStTransportar"),
    @NamedQuery(name = "RegE210.findByDebEspSt", query = "SELECT r FROM RegE210 r WHERE r.debEspSt = :debEspSt")})
@Registros(nivel = 3)
public class RegE210 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE200 idPai;

    public RegE200 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE200) idPai;
    }

    public RegE210() {
    }

    public RegE210(Long id) {
        this.id = id;
    }

    public RegE210(Long id, RegE200 idPai, long linha, String hash) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE220> regE220;

    public List<RegE220> getRegE220() {
        return regE220;
    }

    public void setRegE220(List<RegE220> regE220) {
        this.regE220 = regE220;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE250> regE250;

    public List<RegE250> getRegE250() {
        return regE250;
    }

    public void setRegE250(List<RegE250> regE250) {
        this.regE250 = regE250;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_MOV_ST")
    private String indMovSt;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_SLD_CRED_ANT_ST")
    private BigDecimal vlSldCredAntSt;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_DEVOL_ST")
    private BigDecimal vlDevolSt;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_RESSARC_ST")
    private BigDecimal vlRessarcSt;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_OUT_CRED_ST")
    private BigDecimal vlOutCredSt;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_AJ_CREDITOS_ST")
    private BigDecimal vlAjCreditosSt;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_RETENCAO_ST")
    private BigDecimal vlRetencaoSt;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_OUT_DEB_ST")
    private BigDecimal vlOutDebSt;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_AJ_DEBITOS_ST")
    private BigDecimal vlAjDebitosSt;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_SLD_DEV_ANT_ST")
    private BigDecimal vlSldDevAntSt;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_DEDUCOES_ST")
    private BigDecimal vlDeducoesSt;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_ICMS_RECOL_ST")
    private BigDecimal vlIcmsRecolSt;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_SLD_CRED_ST_TRANSPORTAR")
    private BigDecimal vlSldCredStTransportar;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "DEB_ESP_ST")
    private BigDecimal debEspSt;

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

    public String getIndMovSt() {
        return indMovSt;
    }

    public void setIndMovSt(String indMovSt) {
        this.indMovSt = indMovSt;
    }

    public BigDecimal getVlSldCredAntSt() {
        return vlSldCredAntSt;
    }

    public void setVlSldCredAntSt(BigDecimal vlSldCredAntSt) {
        this.vlSldCredAntSt = vlSldCredAntSt;
    }

    public BigDecimal getVlDevolSt() {
        return vlDevolSt;
    }

    public void setVlDevolSt(BigDecimal vlDevolSt) {
        this.vlDevolSt = vlDevolSt;
    }

    public BigDecimal getVlRessarcSt() {
        return vlRessarcSt;
    }

    public void setVlRessarcSt(BigDecimal vlRessarcSt) {
        this.vlRessarcSt = vlRessarcSt;
    }

    public BigDecimal getVlOutCredSt() {
        return vlOutCredSt;
    }

    public void setVlOutCredSt(BigDecimal vlOutCredSt) {
        this.vlOutCredSt = vlOutCredSt;
    }

    public BigDecimal getVlAjCreditosSt() {
        return vlAjCreditosSt;
    }

    public void setVlAjCreditosSt(BigDecimal vlAjCreditosSt) {
        this.vlAjCreditosSt = vlAjCreditosSt;
    }

    public BigDecimal getVlRetencaoSt() {
        return vlRetencaoSt;
    }

    public void setVlRetencaoSt(BigDecimal vlRetencaoSt) {
        this.vlRetencaoSt = vlRetencaoSt;
    }

    public BigDecimal getVlOutDebSt() {
        return vlOutDebSt;
    }

    public void setVlOutDebSt(BigDecimal vlOutDebSt) {
        this.vlOutDebSt = vlOutDebSt;
    }

    public BigDecimal getVlAjDebitosSt() {
        return vlAjDebitosSt;
    }

    public void setVlAjDebitosSt(BigDecimal vlAjDebitosSt) {
        this.vlAjDebitosSt = vlAjDebitosSt;
    }

    public BigDecimal getVlSldDevAntSt() {
        return vlSldDevAntSt;
    }

    public void setVlSldDevAntSt(BigDecimal vlSldDevAntSt) {
        this.vlSldDevAntSt = vlSldDevAntSt;
    }

    public BigDecimal getVlDeducoesSt() {
        return vlDeducoesSt;
    }

    public void setVlDeducoesSt(BigDecimal vlDeducoesSt) {
        this.vlDeducoesSt = vlDeducoesSt;
    }

    public BigDecimal getVlIcmsRecolSt() {
        return vlIcmsRecolSt;
    }

    public void setVlIcmsRecolSt(BigDecimal vlIcmsRecolSt) {
        this.vlIcmsRecolSt = vlIcmsRecolSt;
    }

    public BigDecimal getVlSldCredStTransportar() {
        return vlSldCredStTransportar;
    }

    public void setVlSldCredStTransportar(BigDecimal vlSldCredStTransportar) {
        this.vlSldCredStTransportar = vlSldCredStTransportar;
    }

    public BigDecimal getDebEspSt() {
        return debEspSt;
    }

    public void setDebEspSt(BigDecimal debEspSt) {
        this.debEspSt = debEspSt;
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
        if (!(object instanceof RegE210)) {
            return false;
        }
        RegE210 other = (RegE210) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE210[ id=" + id + " ]";
    }

}
