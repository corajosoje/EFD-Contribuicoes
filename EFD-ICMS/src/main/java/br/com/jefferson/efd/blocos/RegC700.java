package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
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
@Table(name = "reg_c700")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC700.findAll", query = "SELECT r FROM RegC700 r"),
    @NamedQuery(name = "RegC700.findById", query = "SELECT r FROM RegC700 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC700.findByIdPai", query = "SELECT r FROM RegC700 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC700.findByLinha", query = "SELECT r FROM RegC700 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC700.findByHashfile", query = "SELECT r FROM RegC700 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC700.findByReg", query = "SELECT r FROM RegC700 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC700.findByCodMod", query = "SELECT r FROM RegC700 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC700.findBySer", query = "SELECT r FROM RegC700 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC700.findByNroOrdIni", query = "SELECT r FROM RegC700 r WHERE r.nroOrdIni = :nroOrdIni"),
    @NamedQuery(name = "RegC700.findByNroOrdFin", query = "SELECT r FROM RegC700 r WHERE r.nroOrdFin = :nroOrdFin"),
    @NamedQuery(name = "RegC700.findByDtDocIni", query = "SELECT r FROM RegC700 r WHERE r.dtDocIni = :dtDocIni"),
    @NamedQuery(name = "RegC700.findByDtDocFin", query = "SELECT r FROM RegC700 r WHERE r.dtDocFin = :dtDocFin"),
    @NamedQuery(name = "RegC700.findByNomMest", query = "SELECT r FROM RegC700 r WHERE r.nomMest = :nomMest"),
    @NamedQuery(name = "RegC700.findByChvCodDig", query = "SELECT r FROM RegC700 r WHERE r.chvCodDig = :chvCodDig")})
@Registros(nivel = 2)
public class RegC700 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC001 idPai;

    public RegC001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC001) idPai;
    }

    public RegC700() {
    }

    public RegC700(Long id) {
        this.id = id;
    }

    public RegC700(Long id, RegC001 idPai, long linha, String hashfile) {
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
    private List<RegC790> regC790;

    public List<RegC790> getRegC790() {
        return regC790;
    }

    public void setRegC790(List<RegC790> regC790) {
        this.regC790 = regC790;
    }
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
    @Column(name = "NRO_ORD_INI")
    private int nroOrdIni;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "NRO_ORD_FIN")
    private int nroOrdFin;
    @Campos(posicao = 6, tipo = 'D')
    @Column(name = "DT_DOC_INI")
    @Temporal(TemporalType.DATE)
    private Date dtDocIni;
    @Campos(posicao = 7, tipo = 'D')
    @Column(name = "DT_DOC_FIN")
    @Temporal(TemporalType.DATE)
    private Date dtDocFin;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "NOM_MEST")
    private String nomMest;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CHV_COD_DIG")
    private String chvCodDig;

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

    public int getNroOrdIni() {
        return nroOrdIni;
    }

    public void setNroOrdIni(int nroOrdIni) {
        this.nroOrdIni = nroOrdIni;
    }

    public int getNroOrdFin() {
        return nroOrdFin;
    }

    public void setNroOrdFin(int nroOrdFin) {
        this.nroOrdFin = nroOrdFin;
    }

    public Date getDtDocIni() {
        return dtDocIni;
    }

    public void setDtDocIni(Date dtDocIni) {
        this.dtDocIni = dtDocIni;
    }

    public Date getDtDocFin() {
        return dtDocFin;
    }

    public void setDtDocFin(Date dtDocFin) {
        this.dtDocFin = dtDocFin;
    }

    public String getNomMest() {
        return nomMest;
    }

    public void setNomMest(String nomMest) {
        this.nomMest = nomMest;
    }

    public String getChvCodDig() {
        return chvCodDig;
    }

    public void setChvCodDig(String chvCodDig) {
        this.chvCodDig = chvCodDig;
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
        if (!(object instanceof RegC700)) {
            return false;
        }
        RegC700 other = (RegC700) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC700[ id=" + id + " ]";
    }

}
