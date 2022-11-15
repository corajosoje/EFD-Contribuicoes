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
@Table(name = "reg_b460")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB460.findAll", query = "SELECT r FROM RegB460 r"),
    @NamedQuery(name = "RegB460.findById", query = "SELECT r FROM RegB460 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB460.findByIdPai", query = "SELECT r FROM RegB460 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB460.findByLinha", query = "SELECT r FROM RegB460 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB460.findByHash", query = "SELECT r FROM RegB460 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB460.findByReg", query = "SELECT r FROM RegB460 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB460.findByIndDed", query = "SELECT r FROM RegB460 r WHERE r.indDed = :indDed"),
    @NamedQuery(name = "RegB460.findByVlDed", query = "SELECT r FROM RegB460 r WHERE r.vlDed = :vlDed"),
    @NamedQuery(name = "RegB460.findByNumProc", query = "SELECT r FROM RegB460 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "RegB460.findByIndProc", query = "SELECT r FROM RegB460 r WHERE r.indProc = :indProc"),
    @NamedQuery(name = "RegB460.findByProc", query = "SELECT r FROM RegB460 r WHERE r.proc = :proc"),
    @NamedQuery(name = "RegB460.findByCodInfObs", query = "SELECT r FROM RegB460 r WHERE r.codInfObs = :codInfObs"),
    @NamedQuery(name = "RegB460.findByIndObr", query = "SELECT r FROM RegB460 r WHERE r.indObr = :indObr")})
@Registros(nivel = 2)
public class RegB460 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegB001 idPai;

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
    @Column(name = "IND_DED")
    private String indDed;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_DED")
    private BigDecimal vlDed;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "NUM_PROC")
    private String numProc;

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "IND_PROC")
    private String indProc;

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "PROC")
    private String proc;

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "COD_INF_OBS")
    private String codInfObs;

    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "IND_OBR")
    private String indObr;

    public RegB460() {
    }

    public RegB460(Long id) {
        this.id = id;
    }

    public RegB460(Long id, RegB001 idPai, long linha, String hash) {
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

    public String getIndDed() {
        return indDed;
    }

    public void setIndDed(String indDed) {
        this.indDed = indDed;
    }

    public BigDecimal getVlDed() {
        return vlDed;
    }

    public void setVlDed(BigDecimal vlDed) {
        this.vlDed = vlDed;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIndProc() {
        return indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getCodInfObs() {
        return codInfObs;
    }

    public void setCodInfObs(String codInfObs) {
        this.codInfObs = codInfObs;
    }

    public String getIndObr() {
        return indObr;
    }

    public void setIndObr(String indObr) {
        this.indObr = indObr;
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
        if (!(object instanceof RegB460)) {
            return false;
        }
        RegB460 other = (RegB460) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB460[ id=" + id + " ]";
    }

}
