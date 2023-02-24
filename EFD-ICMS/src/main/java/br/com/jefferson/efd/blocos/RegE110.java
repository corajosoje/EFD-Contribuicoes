package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
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
@Table(name = "reg_e110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE110.findAll", query = "SELECT r FROM RegE110 r"),
    @NamedQuery(name = "RegE110.findById", query = "SELECT r FROM RegE110 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE110.findByIdPai", query = "SELECT r FROM RegE110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE110.findByLinha", query = "SELECT r FROM RegE110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE110.findByHashfile", query = "SELECT r FROM RegE110 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 3)
public class RegE110 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE100 idPai;

    public RegE100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE100) idPai;
    }

    public RegE110() {
    }

    public RegE110(Long id) {
        this.id = id;
    }

    public RegE110(Long id, RegE100 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
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
    @Column(name = "HASHFILE")
    private String hashfile;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE111> regE111;

    public List<RegE111> getRegE111() {
        return regE111;
    }

    public void setRegE111(List<RegE111> regE111) {
        this.regE111 = regE111;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE115> regE115;

    public List<RegE115> getRegE115() {
        return regE115;
    }

    public void setRegE115(List<RegE115> regE115) {
        this.regE115 = regE115;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE116> regE116;

    public List<RegE116> getRegE116() {
        return regE116;
    }

    public void setRegE116(List<RegE116> regE116) {
        this.regE116 = regE116;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_TOT_DEBITOS", precision = 15, scale = 6)
    private BigDecimal vlTotDebitos;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_AJ_DEBITOS", precision = 15, scale = 6)
    private BigDecimal vlAjDebitos;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_TOT_AJ_DEBITOS", precision = 15, scale = 6)
    private BigDecimal vlTotAjDebitos;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ESTORNOS_CRED", precision = 15, scale = 6)
    private BigDecimal vlEstornosCred;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_TOT_CREDITOS", precision = 15, scale = 6)
    private BigDecimal vlTotCreditos;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_AJ_CREDITOS", precision = 15, scale = 6)
    private BigDecimal vlAjCreditos;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_TOT_AJ_CREDITOS", precision = 15, scale = 6)
    private BigDecimal vlTotAjCreditos;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_ESTORNOS_DEB", precision = 15, scale = 6)
    private BigDecimal vlEstornosDeb;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_SLD_CREDOR_ANT", precision = 15, scale = 6)
    private BigDecimal vlSldCredorAnt;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_SLD_APURADO", precision = 15, scale = 6)
    private BigDecimal vlSldApurado;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_TOT_DED", precision = 15, scale = 6)
    private BigDecimal vlTotDed;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_ICMS_RECOLHER", precision = 15, scale = 6)
    private BigDecimal vlIcmsRecolher;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_SLD_CREDOR_TRANSPORTAR", precision = 15, scale = 6)
    private BigDecimal vlSldCredorTransportar;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "DEB_ESP", precision = 15, scale = 6)
    private BigDecimal debEsp;

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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
