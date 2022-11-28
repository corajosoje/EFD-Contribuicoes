package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_g125")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegG125.findAll", query = "SELECT r FROM RegG125 r"),
    @NamedQuery(name = "RegG125.findById", query = "SELECT r FROM RegG125 r WHERE r.id = :id"),
    @NamedQuery(name = "RegG125.findByIdPai", query = "SELECT r FROM RegG125 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegG125.findByLinha", query = "SELECT r FROM RegG125 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegG125.findByHash", query = "SELECT r FROM RegG125 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegG125.findByReg", query = "SELECT r FROM RegG125 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegG125.findByCodIndBem", query = "SELECT r FROM RegG125 r WHERE r.codIndBem = :codIndBem"),
    @NamedQuery(name = "RegG125.findByDtMov", query = "SELECT r FROM RegG125 r WHERE r.dtMov = :dtMov"),
    @NamedQuery(name = "RegG125.findByTipoMov", query = "SELECT r FROM RegG125 r WHERE r.tipoMov = :tipoMov"),
    @NamedQuery(name = "RegG125.findByVlImobIcmsOp", query = "SELECT r FROM RegG125 r WHERE r.vlImobIcmsOp = :vlImobIcmsOp"),
    @NamedQuery(name = "RegG125.findByVlImobIcmsSt", query = "SELECT r FROM RegG125 r WHERE r.vlImobIcmsSt = :vlImobIcmsSt"),
    @NamedQuery(name = "RegG125.findByVlImobIcmsFrt", query = "SELECT r FROM RegG125 r WHERE r.vlImobIcmsFrt = :vlImobIcmsFrt"),
    @NamedQuery(name = "RegG125.findByVlImobIcmsDif", query = "SELECT r FROM RegG125 r WHERE r.vlImobIcmsDif = :vlImobIcmsDif"),
    @NamedQuery(name = "RegG125.findByNumParc", query = "SELECT r FROM RegG125 r WHERE r.numParc = :numParc"),
    @NamedQuery(name = "RegG125.findByVlParcPass", query = "SELECT r FROM RegG125 r WHERE r.vlParcPass = :vlParcPass")})
@Registros(nivel = 3)
public class RegG125 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegG110 idPai;

    public RegG110 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegG110) idPai;
    }

    public RegG125() {
    }

    public RegG125(Long id) {
        this.id = id;
    }

    public RegG125(Long id, RegG110 idPai, long linha, String hash) {
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
    private List<RegG126> regG126;

    public List<RegG126> getRegG126() {
        return regG126;
    }

    public void setRegG126(List<RegG126> regG126) {
        this.regG126 = regG126;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegG130> regG130;

    public List<RegG130> getRegG130() {
        return regG130;
    }

    public void setRegG130(List<RegG130> regG130) {
        this.regG130 = regG130;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_IND_BEM")
    private String codIndBem;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_MOV")
    @Temporal(TemporalType.DATE)
    private Date dtMov;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "TIPO_MOV")
    private String tipoMov;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_IMOB_ICMS_OP")
    private BigDecimal vlImobIcmsOp;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_IMOB_ICMS_ST")
    private BigDecimal vlImobIcmsSt;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_IMOB_ICMS_FRT")
    private BigDecimal vlImobIcmsFrt;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_IMOB_ICMS_DIF")
    private BigDecimal vlImobIcmsDif;
    @Campos(posicao = 9, tipo = 'I')
    @Column(name = "NUM_PARC")
    private int numParc;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_PARC_PASS")
    private BigDecimal vlParcPass;

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

    public String getCodIndBem() {
        return codIndBem;
    }

    public void setCodIndBem(String codIndBem) {
        this.codIndBem = codIndBem;
    }

    public Date getDtMov() {
        return dtMov;
    }

    public void setDtMov(Date dtMov) {
        this.dtMov = dtMov;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public BigDecimal getVlImobIcmsOp() {
        return vlImobIcmsOp;
    }

    public void setVlImobIcmsOp(BigDecimal vlImobIcmsOp) {
        this.vlImobIcmsOp = vlImobIcmsOp;
    }

    public BigDecimal getVlImobIcmsSt() {
        return vlImobIcmsSt;
    }

    public void setVlImobIcmsSt(BigDecimal vlImobIcmsSt) {
        this.vlImobIcmsSt = vlImobIcmsSt;
    }

    public BigDecimal getVlImobIcmsFrt() {
        return vlImobIcmsFrt;
    }

    public void setVlImobIcmsFrt(BigDecimal vlImobIcmsFrt) {
        this.vlImobIcmsFrt = vlImobIcmsFrt;
    }

    public BigDecimal getVlImobIcmsDif() {
        return vlImobIcmsDif;
    }

    public void setVlImobIcmsDif(BigDecimal vlImobIcmsDif) {
        this.vlImobIcmsDif = vlImobIcmsDif;
    }

    public int getNumParc() {
        return numParc;
    }

    public void setNumParc(int numParc) {
        this.numParc = numParc;
    }

    public BigDecimal getVlParcPass() {
        return vlParcPass;
    }

    public void setVlParcPass(BigDecimal vlParcPass) {
        this.vlParcPass = vlParcPass;
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
        if (!(object instanceof RegG125)) {
            return false;
        }
        RegG125 other = (RegG125) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegG125[ id=" + id + " ]";
    }

}
