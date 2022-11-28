package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c120")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC120.findAll", query = "SELECT r FROM RegC120 r"),
    @NamedQuery(name = "RegC120.findById", query = "SELECT r FROM RegC120 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC120.findByIdPai", query = "SELECT r FROM RegC120 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC120.findByLinha", query = "SELECT r FROM RegC120 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC120.findByHash", query = "SELECT r FROM RegC120 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC120.findByReg", query = "SELECT r FROM RegC120 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC120.findByCodDocImp", query = "SELECT r FROM RegC120 r WHERE r.codDocImp = :codDocImp"),
    @NamedQuery(name = "RegC120.findByNumDocImp", query = "SELECT r FROM RegC120 r WHERE r.numDocImp = :numDocImp"),
    @NamedQuery(name = "RegC120.findByPisImp", query = "SELECT r FROM RegC120 r WHERE r.pisImp = :pisImp"),
    @NamedQuery(name = "RegC120.findByCofinsImp", query = "SELECT r FROM RegC120 r WHERE r.cofinsImp = :cofinsImp"),
    @NamedQuery(name = "RegC120.findByNumAcdraw", query = "SELECT r FROM RegC120 r WHERE r.numAcdraw = :numAcdraw")})
@Registros(nivel = 3)
public class RegC120 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC100) idPai;
    }

    public RegC120() {
    }

    public RegC120(Long id) {
        this.id = id;
    }

    public RegC120(Long id, RegC100 idPai, long linha, String hash) {
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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_DOC_IMP")
    private String codDocImp;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NUM_DOC__IMP")
    private String numDocImp;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "PIS_IMP")
    private BigDecimal pisImp;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "COFINS_IMP")
    private BigDecimal cofinsImp;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "NUM_ACDRAW")
    private String numAcdraw;

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

    public String getCodDocImp() {
        return codDocImp;
    }

    public void setCodDocImp(String codDocImp) {
        this.codDocImp = codDocImp;
    }

    public String getNumDocImp() {
        return numDocImp;
    }

    public void setNumDocImp(String numDocImp) {
        this.numDocImp = numDocImp;
    }

    public BigDecimal getPisImp() {
        return pisImp;
    }

    public void setPisImp(BigDecimal pisImp) {
        this.pisImp = pisImp;
    }

    public BigDecimal getCofinsImp() {
        return cofinsImp;
    }

    public void setCofinsImp(BigDecimal cofinsImp) {
        this.cofinsImp = cofinsImp;
    }

    public String getNumAcdraw() {
        return numAcdraw;
    }

    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
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
        if (!(object instanceof RegC120)) {
            return false;
        }
        RegC120 other = (RegC120) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC120[ id=" + id + " ]";
    }

}
