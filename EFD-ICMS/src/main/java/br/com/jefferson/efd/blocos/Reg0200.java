
package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_0200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0200.findAll", query = "SELECT r FROM Reg0200 r"),
    @NamedQuery(name = "Reg0200.findById", query = "SELECT r FROM Reg0200 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0200.findByIdPai", query = "SELECT r FROM Reg0200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0200.findByLinha", query = "SELECT r FROM Reg0200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0200.findByHash", query = "SELECT r FROM Reg0200 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0200.findByReg", query = "SELECT r FROM Reg0200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0200.findByCodItem", query = "SELECT r FROM Reg0200 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "Reg0200.findByDescrItem", query = "SELECT r FROM Reg0200 r WHERE r.descrItem = :descrItem"),
    @NamedQuery(name = "Reg0200.findByCodBarra", query = "SELECT r FROM Reg0200 r WHERE r.codBarra = :codBarra"),
    @NamedQuery(name = "Reg0200.findByCodAntItem", query = "SELECT r FROM Reg0200 r WHERE r.codAntItem = :codAntItem"),
    @NamedQuery(name = "Reg0200.findByUnidInv", query = "SELECT r FROM Reg0200 r WHERE r.unidInv = :unidInv"),
    @NamedQuery(name = "Reg0200.findByTipoItem", query = "SELECT r FROM Reg0200 r WHERE r.tipoItem = :tipoItem"),
    @NamedQuery(name = "Reg0200.findByCodNcm", query = "SELECT r FROM Reg0200 r WHERE r.codNcm = :codNcm"),
    @NamedQuery(name = "Reg0200.findByExIpi", query = "SELECT r FROM Reg0200 r WHERE r.exIpi = :exIpi"),
    @NamedQuery(name = "Reg0200.findByCodGen", query = "SELECT r FROM Reg0200 r WHERE r.codGen = :codGen"),
    @NamedQuery(name = "Reg0200.findByCodLst", query = "SELECT r FROM Reg0200 r WHERE r.codLst = :codLst"),
    @NamedQuery(name = "Reg0200.findByAliqIcms", query = "SELECT r FROM Reg0200 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "Reg0200.findByCest", query = "SELECT r FROM Reg0200 r WHERE r.cest = :cest")})
public class Reg0200 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "COD_ITEM")
    private String codItem;
    @Column(name = "DESCR_ITEM")
    private String descrItem;
    @Column(name = "COD_BARRA")
    private String codBarra;
    @Column(name = "COD_ANT_ITEM")
    private String codAntItem;
    @Column(name = "UNID_INV")
    private String unidInv;
    @Column(name = "TIPO_ITEM")
    private String tipoItem;
    @Column(name = "COD_NCM")
    private String codNcm;
    @Column(name = "EX_IPI")
    private String exIpi;
    @Column(name = "COD_GEN")
    private String codGen;
    @Column(name = "COD_LST")
    private String codLst;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALIQ_ICMS")
    private BigDecimal aliqIcms;
    @Column(name = "CEST")
    private String cest;

    public Reg0200() {
    }

    public Reg0200(Long id) {
        this.id = id;
    }

    public Reg0200(Long id, long idPai, long linha, String hash) {
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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }

    public String getUnidInv() {
        return unidInv;
    }

    public void setUnidInv(String unidInv) {
        this.unidInv = unidInv;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getCodNcm() {
        return codNcm;
    }

    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }

    public String getExIpi() {
        return exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }

    public String getCodGen() {
        return codGen;
    }

    public void setCodGen(String codGen) {
        this.codGen = codGen;
    }

    public String getCodLst() {
        return codLst;
    }

    public void setCodLst(String codLst) {
        this.codLst = codLst;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
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
        if (!(object instanceof Reg0200)) {
            return false;
        }
        Reg0200 other = (Reg0200) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0200[ id=" + id + " ]";
    }

}
