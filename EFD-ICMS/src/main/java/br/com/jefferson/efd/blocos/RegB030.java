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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_b030")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB030.findAll", query = "SELECT r FROM RegB030 r"),
    @NamedQuery(name = "RegB030.findById", query = "SELECT r FROM RegB030 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB030.findByIdPai", query = "SELECT r FROM RegB030 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB030.findByLinha", query = "SELECT r FROM RegB030 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB030.findByHashfile", query = "SELECT r FROM RegB030 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegB030.findByReg", query = "SELECT r FROM RegB030 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB030.findByCodMod", query = "SELECT r FROM RegB030 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegB030.findBySer", query = "SELECT r FROM RegB030 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegB030.findByNumDocIni", query = "SELECT r FROM RegB030 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "RegB030.findByNumDocFin", query = "SELECT r FROM RegB030 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "RegB030.findByDtDoc", query = "SELECT r FROM RegB030 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegB030.findByQtdCanc", query = "SELECT r FROM RegB030 r WHERE r.qtdCanc = :qtdCanc"),
    @NamedQuery(name = "RegB030.findByVlCont", query = "SELECT r FROM RegB030 r WHERE r.vlCont = :vlCont"),
    @NamedQuery(name = "RegB030.findByVlIsntIss", query = "SELECT r FROM RegB030 r WHERE r.vlIsntIss = :vlIsntIss"),
    @NamedQuery(name = "RegB030.findByVlBcIss", query = "SELECT r FROM RegB030 r WHERE r.vlBcIss = :vlBcIss"),
    @NamedQuery(name = "RegB030.findByVlIss", query = "SELECT r FROM RegB030 r WHERE r.vlIss = :vlIss"),
    @NamedQuery(name = "RegB030.findByCodInfObs", query = "SELECT r FROM RegB030 r WHERE r.codInfObs = :codInfObs")})
@Registros(nivel = 2)
public class RegB030 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegB001 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    @Campos(posicao = 1, tipo = 'I')
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;

    @Campos(posicao = 1, tipo = 'I')
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;

    @Campos(posicao = 1, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;

    @Campos(posicao = 1, tipo = 'I')
    @Column(name = "QTD_CANC")
    private int qtdCanc;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "VL_CONT", precision = 15, scale = 6)
    private BigDecimal vlCont;

    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "VL_ISNT_ISS", precision = 15, scale = 6)
    private BigDecimal vlIsntIss;

    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "VL_BC_ISS", precision = 15, scale = 6)
    private BigDecimal vlBcIss;

    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "VL_ISS", precision = 15, scale = 6)
    private BigDecimal vlIss;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "COD_INF_OBS")
    private String codInfObs;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegB035> regB035;

    public RegB030() {
    }

    public RegB030(String id) {
        this.id = id;
    }

    public RegB030(String id, RegB001 idPai, long linha, String hashfile) {
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

    public RegB001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegB001) idPai;
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

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public int getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(int numDocIni) {
        this.numDocIni = numDocIni;
    }

    public int getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(int numDocFin) {
        this.numDocFin = numDocFin;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public int getQtdCanc() {
        return qtdCanc;
    }

    public void setQtdCanc(int qtdCanc) {
        this.qtdCanc = qtdCanc;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlIsntIss() {
        return vlIsntIss;
    }

    public void setVlIsntIss(BigDecimal vlIsntIss) {
        this.vlIsntIss = vlIsntIss;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public String getCodInfObs() {
        return codInfObs;
    }

    public void setCodInfObs(String codInfObs) {
        this.codInfObs = codInfObs;
    }

    public List<RegB035> getRegB035() {
        return regB035;
    }

    public void setRegB035(List<RegB035> regB035) {
        this.regB035 = regB035;
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
        if (!(object instanceof RegB030)) {
            return false;
        }
        RegB030 other = (RegB030) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB030[ id=" + id + " ]";
    }

}
