package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d355")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD355.findAll", query = "SELECT r FROM RegD355 r"),
    @NamedQuery(name = "RegD355.findById", query = "SELECT r FROM RegD355 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD355.findByIdPai", query = "SELECT r FROM RegD355 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD355.findByLinha", query = "SELECT r FROM RegD355 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD355.findByHashfile", query = "SELECT r FROM RegD355 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD355.findByReg", query = "SELECT r FROM RegD355 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD355.findByDtDoc", query = "SELECT r FROM RegD355 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD355.findByCro", query = "SELECT r FROM RegD355 r WHERE r.cro = :cro"),
    @NamedQuery(name = "RegD355.findByCrz", query = "SELECT r FROM RegD355 r WHERE r.crz = :crz"),
    @NamedQuery(name = "RegD355.findByNumCooFin", query = "SELECT r FROM RegD355 r WHERE r.numCooFin = :numCooFin"),
    @NamedQuery(name = "RegD355.findByGtFin", query = "SELECT r FROM RegD355 r WHERE r.gtFin = :gtFin"),
    @NamedQuery(name = "RegD355.findByVlBrt", query = "SELECT r FROM RegD355 r WHERE r.vlBrt = :vlBrt")})
@Registros(nivel = 3)
public class RegD355 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD350 idPai;

    public RegD350 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD350) idPai;
    }

    public RegD355() {
    }

    public RegD355(String id) {
        this.id = id;
    }

    public RegD355(String id, RegD350 idPai, long linha, String hashfile) {
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegD360 regD360;

    public RegD360 getRegD360() {
        return regD360;
    }

    public void setRegD360(RegD360 regD360) {
        this.regD360 = regD360;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD365> regD365;

    public List<RegD365> getRegD365() {
        return regD365;
    }

    public void setRegD365(List<RegD365> regD365) {
        this.regD365 = regD365;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD390> regD390;

    public List<RegD390> getRegD390() {
        return regD390;
    }

    public void setRegD390(List<RegD390> regD390) {
        this.regD390 = regD390;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "CRO")
    private int cro;
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "CRZ")
    private int crz;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "NUM_COO_FIN")
    private int numCooFin;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "GT_FIN", precision = 15, scale = 6)
    private BigDecimal gtFin;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_BRT", precision = 15, scale = 6)
    private BigDecimal vlBrt;

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

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }

    public int getCrz() {
        return crz;
    }

    public void setCrz(int crz) {
        this.crz = crz;
    }

    public int getNumCooFin() {
        return numCooFin;
    }

    public void setNumCooFin(int numCooFin) {
        this.numCooFin = numCooFin;
    }

    public BigDecimal getGtFin() {
        return gtFin;
    }

    public void setGtFin(BigDecimal gtFin) {
        this.gtFin = gtFin;
    }

    public BigDecimal getVlBrt() {
        return vlBrt;
    }

    public void setVlBrt(BigDecimal vlBrt) {
        this.vlBrt = vlBrt;
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
        if (!(object instanceof RegD355)) {
            return false;
        }
        RegD355 other = (RegD355) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD355[ id=" + id + " ]";
    }

}
