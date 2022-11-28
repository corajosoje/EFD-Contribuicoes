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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c405")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC405.findAll", query = "SELECT r FROM RegC405 r"),
    @NamedQuery(name = "RegC405.findById", query = "SELECT r FROM RegC405 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC405.findByIdPai", query = "SELECT r FROM RegC405 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC405.findByLinha", query = "SELECT r FROM RegC405 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC405.findByHash", query = "SELECT r FROM RegC405 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC405.findByReg", query = "SELECT r FROM RegC405 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC405.findByDtDoc", query = "SELECT r FROM RegC405 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC405.findByCro", query = "SELECT r FROM RegC405 r WHERE r.cro = :cro"),
    @NamedQuery(name = "RegC405.findByCrz", query = "SELECT r FROM RegC405 r WHERE r.crz = :crz"),
    @NamedQuery(name = "RegC405.findByNumCooFin", query = "SELECT r FROM RegC405 r WHERE r.numCooFin = :numCooFin"),
    @NamedQuery(name = "RegC405.findByGtFin", query = "SELECT r FROM RegC405 r WHERE r.gtFin = :gtFin"),
    @NamedQuery(name = "RegC405.findByVlBrt", query = "SELECT r FROM RegC405 r WHERE r.vlBrt = :vlBrt")})
@Registros(nivel = 3)
public class RegC405 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC400 idPai;

    public RegC400 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC400) idPai;
    }

    public RegC405() {
    }

    public RegC405(Long id) {
        this.id = id;
    }

    public RegC405(Long id, RegC400 idPai, long linha, String hash) {
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC410 regC410;

    public RegC410 getRegC410() {
        return regC410;
    }

    public void setRegC410(RegC410 regC410) {
        this.regC410 = regC410;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC420> regC420;

    public List<RegC420> getRegC420() {
        return regC420;
    }

    public void setRegC420(List<RegC420> regC420) {
        this.regC420 = regC420;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC460> regC460;

    public List<RegC460> getRegC460() {
        return regC460;
    }

    public void setRegC460(List<RegC460> regC460) {
        this.regC460 = regC460;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC490> regC490;

    public List<RegC490> getRegC490() {
        return regC490;
    }

    public void setRegC490(List<RegC490> regC490) {
        this.regC490 = regC490;
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
    @Column(name = "GT_FIN")
    private BigDecimal gtFin;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_BRT")
    private BigDecimal vlBrt;

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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegC405)) {
            return false;
        }
        RegC405 other = (RegC405) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC405[ id=" + id + " ]";
    }

}
