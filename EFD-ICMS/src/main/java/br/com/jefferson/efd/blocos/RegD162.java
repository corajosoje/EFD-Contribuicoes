package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_d162")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD162.findAll", query = "SELECT r FROM RegD162 r"),
    @NamedQuery(name = "RegD162.findById", query = "SELECT r FROM RegD162 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD162.findByIdPai", query = "SELECT r FROM RegD162 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD162.findByLinha", query = "SELECT r FROM RegD162 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD162.findByHashfile", query = "SELECT r FROM RegD162 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD162.findByReg", query = "SELECT r FROM RegD162 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD162.findByCodMod", query = "SELECT r FROM RegD162 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD162.findBySer", query = "SELECT r FROM RegD162 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD162.findByNumDoc", query = "SELECT r FROM RegD162 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegD162.findByDtDoc", query = "SELECT r FROM RegD162 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegD162.findByVlDoc", query = "SELECT r FROM RegD162 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD162.findByVlMerc", query = "SELECT r FROM RegD162 r WHERE r.vlMerc = :vlMerc"),
    @NamedQuery(name = "RegD162.findByQtdVol", query = "SELECT r FROM RegD162 r WHERE r.qtdVol = :qtdVol"),
    @NamedQuery(name = "RegD162.findByPesoBrt", query = "SELECT r FROM RegD162 r WHERE r.pesoBrt = :pesoBrt"),
    @NamedQuery(name = "RegD162.findByPesoLiq", query = "SELECT r FROM RegD162 r WHERE r.pesoLiq = :pesoLiq")})
@Registros(nivel = 4)
public class RegD162 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD160 idPai;

    public RegD160 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD160) idPai;
    }

    public RegD162() {
    }

    public RegD162(Long id) {
        this.id = id;
    }

    public RegD162(Long id, RegD160 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_MERC", precision = 15, scale = 6)
    private BigDecimal vlMerc;
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "QTD_VOL")
    private int qtdVol;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "PESO_BRT", precision = 15, scale = 6)
    private BigDecimal pesoBrt;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "PESO_LIQ", precision = 15, scale = 6)
    private BigDecimal pesoLiq;

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

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public int getQtdVol() {
        return qtdVol;
    }

    public void setQtdVol(int qtdVol) {
        this.qtdVol = qtdVol;
    }

    public BigDecimal getPesoBrt() {
        return pesoBrt;
    }

    public void setPesoBrt(BigDecimal pesoBrt) {
        this.pesoBrt = pesoBrt;
    }

    public BigDecimal getPesoLiq() {
        return pesoLiq;
    }

    public void setPesoLiq(BigDecimal pesoLiq) {
        this.pesoLiq = pesoLiq;
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
        if (!(object instanceof RegD162)) {
            return false;
        }
        RegD162 other = (RegD162) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD162[ id=" + id + " ]";
    }

}
