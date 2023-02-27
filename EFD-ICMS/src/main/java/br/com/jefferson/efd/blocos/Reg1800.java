package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1800")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1800.findAll", query = "SELECT r FROM Reg1800 r"),
    @NamedQuery(name = "Reg1800.findById", query = "SELECT r FROM Reg1800 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1800.findByIdPai", query = "SELECT r FROM Reg1800 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1800.findByLinha", query = "SELECT r FROM Reg1800 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1800.findByHashfile", query = "SELECT r FROM Reg1800 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 2)
public class Reg1800 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    public Reg1001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1001) idPai;
    }

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_CARGA", precision = 15, scale = 6)
    private BigDecimal vlCarga;

    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_PASS", precision = 15, scale = 6)
    private BigDecimal vlPass;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_FAT", precision = 15, scale = 6)
    private BigDecimal vlFat;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "IND_RAT", precision = 15, scale = 6)
    private BigDecimal indRat;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ICMS_ANT", precision = 15, scale = 6)
    private BigDecimal vlIcmsAnt;

    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;

    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_ICMS_APUR", precision = 15, scale = 6)
    private BigDecimal vlIcmsApur;

    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_BC_ICMS_APUR", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsApur;

    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_DIF", precision = 15, scale = 6)
    private BigDecimal vlDif;

    public Reg1800() {
    }

    public Reg1800(String id) {
        this.id = id;
    }

    public Reg1800(String id, Reg1001 idPai, long linha, String hashfile) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
