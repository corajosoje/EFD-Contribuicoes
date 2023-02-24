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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_d365")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD365.findAll", query = "SELECT r FROM RegD365 r"),
    @NamedQuery(name = "RegD365.findById", query = "SELECT r FROM RegD365 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD365.findByIdPai", query = "SELECT r FROM RegD365 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD365.findByLinha", query = "SELECT r FROM RegD365 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD365.findByHashfile", query = "SELECT r FROM RegD365 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD365.findByReg", query = "SELECT r FROM RegD365 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD365.findByCodTotPar", query = "SELECT r FROM RegD365 r WHERE r.codTotPar = :codTotPar"),
    @NamedQuery(name = "RegD365.findByVlrAcumTot", query = "SELECT r FROM RegD365 r WHERE r.vlrAcumTot = :vlrAcumTot"),
    @NamedQuery(name = "RegD365.findByNrTot", query = "SELECT r FROM RegD365 r WHERE r.nrTot = :nrTot"),
    @NamedQuery(name = "RegD365.findByDescrNrTot", query = "SELECT r FROM RegD365 r WHERE r.descrNrTot = :descrNrTot")})
@Registros(nivel = 4)
public class RegD365 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD355 idPai;

    public RegD355 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD355) idPai;
    }

    public RegD365() {
    }

    public RegD365(Long id) {
        this.id = id;
    }

    public RegD365(Long id, RegD355 idPai, long linha, String hashfile) {
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
    private List<RegD370> regD370;

    public List<RegD370> getRegD370() {
        return regD370;
    }

    public void setRegD370(List<RegD370> regD370) {
        this.regD370 = regD370;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_TOT_PAR")
    private String codTotPar;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VLR_ACUM_TOT", precision = 15, scale = 6)
    private BigDecimal vlrAcumTot;
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "NR_TOT")
    private int nrTot;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "DESCR_NR_TOT")
    private String descrNrTot;

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

    public String getCodTotPar() {
        return codTotPar;
    }

    public void setCodTotPar(String codTotPar) {
        this.codTotPar = codTotPar;
    }

    public BigDecimal getVlrAcumTot() {
        return vlrAcumTot;
    }

    public void setVlrAcumTot(BigDecimal vlrAcumTot) {
        this.vlrAcumTot = vlrAcumTot;
    }

    public int getNrTot() {
        return nrTot;
    }

    public void setNrTot(int nrTot) {
        this.nrTot = nrTot;
    }

    public String getDescrNrTot() {
        return descrNrTot;
    }

    public void setDescrNrTot(String descrNrTot) {
        this.descrNrTot = descrNrTot;
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
        if (!(object instanceof RegD365)) {
            return false;
        }
        RegD365 other = (RegD365) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD365[ id=" + id + " ]";
    }

}
