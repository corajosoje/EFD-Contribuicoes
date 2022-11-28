package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_c420")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC420.findAll", query = "SELECT r FROM RegC420 r"),
    @NamedQuery(name = "RegC420.findById", query = "SELECT r FROM RegC420 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC420.findByIdPai", query = "SELECT r FROM RegC420 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC420.findByLinha", query = "SELECT r FROM RegC420 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC420.findByHash", query = "SELECT r FROM RegC420 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC420.findByReg", query = "SELECT r FROM RegC420 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC420.findByCodTotPar", query = "SELECT r FROM RegC420 r WHERE r.codTotPar = :codTotPar"),
    @NamedQuery(name = "RegC420.findByVlrAcumTot", query = "SELECT r FROM RegC420 r WHERE r.vlrAcumTot = :vlrAcumTot"),
    @NamedQuery(name = "RegC420.findByNrTot", query = "SELECT r FROM RegC420 r WHERE r.nrTot = :nrTot"),
    @NamedQuery(name = "RegC420.findByDescrNrTot", query = "SELECT r FROM RegC420 r WHERE r.descrNrTot = :descrNrTot")})
@Registros(nivel = 4)
public class RegC420 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC405 idPai;

    public RegC405 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC405) idPai;
    }

    public RegC420() {
    }

    public RegC420(Long id) {
        this.id = id;
    }

    public RegC420(Long id, RegC405 idPai, long linha, String hash) {
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
    private List<RegC425> regC425;

    public List<RegC425> getRegC425() {
        return regC425;
    }

    public void setRegC425(List<RegC425> regC425) {
        this.regC425 = regC425;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_TOT_PAR")
    private String codTotPar;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VLR_ACUM_TOT")
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegC420)) {
            return false;
        }
        RegC420 other = (RegC420) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC420[ id=" + id + " ]";
    }

}
