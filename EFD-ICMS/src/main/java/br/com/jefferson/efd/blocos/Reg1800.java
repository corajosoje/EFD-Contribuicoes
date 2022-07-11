
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
@Table(name = "reg_1800")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1800.findAll", query = "SELECT r FROM Reg1800 r"),
    @NamedQuery(name = "Reg1800.findById", query = "SELECT r FROM Reg1800 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1800.findByIdPai", query = "SELECT r FROM Reg1800 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1800.findByLinha", query = "SELECT r FROM Reg1800 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1800.findByHash", query = "SELECT r FROM Reg1800 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1800.findByReg", query = "SELECT r FROM Reg1800 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1800.findByVlCarga", query = "SELECT r FROM Reg1800 r WHERE r.vlCarga = :vlCarga"),
    @NamedQuery(name = "Reg1800.findByVlPass", query = "SELECT r FROM Reg1800 r WHERE r.vlPass = :vlPass"),
    @NamedQuery(name = "Reg1800.findByVlFat", query = "SELECT r FROM Reg1800 r WHERE r.vlFat = :vlFat"),
    @NamedQuery(name = "Reg1800.findByIndRat", query = "SELECT r FROM Reg1800 r WHERE r.indRat = :indRat"),
    @NamedQuery(name = "Reg1800.findByVlIcmsAnt", query = "SELECT r FROM Reg1800 r WHERE r.vlIcmsAnt = :vlIcmsAnt"),
    @NamedQuery(name = "Reg1800.findByVlBcIcms", query = "SELECT r FROM Reg1800 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "Reg1800.findByVlIcmsApur", query = "SELECT r FROM Reg1800 r WHERE r.vlIcmsApur = :vlIcmsApur"),
    @NamedQuery(name = "Reg1800.findByVlBcIcmsApur", query = "SELECT r FROM Reg1800 r WHERE r.vlBcIcmsApur = :vlBcIcmsApur"),
    @NamedQuery(name = "Reg1800.findByVlDif", query = "SELECT r FROM Reg1800 r WHERE r.vlDif = :vlDif")})
public class Reg1800 implements Serializable {

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
    @Column(name = "VL_CARGA")
    private BigDecimal vlCarga;
    @Column(name = "VL_PASS")
    private BigDecimal vlPass;
    @Column(name = "VL_FAT")
    private BigDecimal vlFat;
    @Column(name = "IND_RAT")
    private BigDecimal indRat;
    @Column(name = "VL_ICMS_ANT")
    private BigDecimal vlIcmsAnt;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS_APUR")
    private BigDecimal vlIcmsApur;
    @Column(name = "VL_BC_ICMS_APUR")
    private BigDecimal vlBcIcmsApur;
    @Column(name = "VL_DIF")
    private BigDecimal vlDif;

    public Reg1800() {
    }

    public Reg1800(Long id) {
        this.id = id;
    }

    public Reg1800(Long id, long idPai, long linha, long hash) {
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

    public BigDecimal getVlCarga() {
        return vlCarga;
    }

    public void setVlCarga(BigDecimal vlCarga) {
        this.vlCarga = vlCarga;
    }

    public BigDecimal getVlPass() {
        return vlPass;
    }

    public void setVlPass(BigDecimal vlPass) {
        this.vlPass = vlPass;
    }

    public BigDecimal getVlFat() {
        return vlFat;
    }

    public void setVlFat(BigDecimal vlFat) {
        this.vlFat = vlFat;
    }

    public BigDecimal getIndRat() {
        return indRat;
    }

    public void setIndRat(BigDecimal indRat) {
        this.indRat = indRat;
    }

    public BigDecimal getVlIcmsAnt() {
        return vlIcmsAnt;
    }

    public void setVlIcmsAnt(BigDecimal vlIcmsAnt) {
        this.vlIcmsAnt = vlIcmsAnt;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcmsApur() {
        return vlIcmsApur;
    }

    public void setVlIcmsApur(BigDecimal vlIcmsApur) {
        this.vlIcmsApur = vlIcmsApur;
    }

    public BigDecimal getVlBcIcmsApur() {
        return vlBcIcmsApur;
    }

    public void setVlBcIcmsApur(BigDecimal vlBcIcmsApur) {
        this.vlBcIcmsApur = vlBcIcmsApur;
    }

    public BigDecimal getVlDif() {
        return vlDif;
    }

    public void setVlDif(BigDecimal vlDif) {
        this.vlDif = vlDif;
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
        if (!(object instanceof Reg1800)) {
            return false;
        }
        Reg1800 other = (Reg1800) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1800[ id=" + id + " ]";
    }

}
