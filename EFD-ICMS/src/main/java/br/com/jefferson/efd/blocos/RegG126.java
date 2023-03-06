package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_g126")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegG126.findAll", query = "SELECT r FROM RegG126 r"),
    @NamedQuery(name = "RegG126.findById", query = "SELECT r FROM RegG126 r WHERE r.id = :id"),
    @NamedQuery(name = "RegG126.findByIdPai", query = "SELECT r FROM RegG126 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegG126.findByLinha", query = "SELECT r FROM RegG126 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegG126.findByHashfile", query = "SELECT r FROM RegG126 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegG126.findByReg", query = "SELECT r FROM RegG126 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegG126.findByDtIni", query = "SELECT r FROM RegG126 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "RegG126.findByDtFin", query = "SELECT r FROM RegG126 r WHERE r.dtFim = :dtFim"),
    @NamedQuery(name = "RegG126.findByNumParc", query = "SELECT r FROM RegG126 r WHERE r.numParc = :numParc"),
    @NamedQuery(name = "RegG126.findByVlParcPass", query = "SELECT r FROM RegG126 r WHERE r.vlParcPass = :vlParcPass"),
    @NamedQuery(name = "RegG126.findByVlTribOc", query = "SELECT r FROM RegG126 r WHERE r.vlTribOc = :vlTribOc"),
    @NamedQuery(name = "RegG126.findByVlTotal", query = "SELECT r FROM RegG126 r WHERE r.vlTotal = :vlTotal"),
    @NamedQuery(name = "RegG126.findByIndPerSai", query = "SELECT r FROM RegG126 r WHERE r.indPerSai = :indPerSai"),
    @NamedQuery(name = "RegG126.findByVlParcAprop", query = "SELECT r FROM RegG126 r WHERE r.vlParcAprop = :vlParcAprop")})
@Registros(nivel = 4)
public class RegG126 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegG125 idPai;

    public RegG125 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegG125) idPai;
    }

    public RegG126() {
    }

    public RegG126(String id) {
        this.id = id;
    }

    public RegG126(String id, RegG125 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    private Date dtIni;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_FIM")
    @Temporal(TemporalType.DATE)
    private Date dtFim;
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "NUM_PARC")
    private int numParc;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_PARC_PASS", precision = 15, scale = 6)
    private BigDecimal vlParcPass;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_TRIB_OC", precision = 15, scale = 6)
    private BigDecimal vlTribOc;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_TOTAL", precision = 15, scale = 6)
    private BigDecimal vlTotal;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "IND_PER_SAI", precision = 15, scale = 6)
    private BigDecimal indPerSai;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_PARC_APROP", precision = 15, scale = 6)
    private BigDecimal vlParcAprop;

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

    public Date getDtIni() {
        return dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public int getNumParc() {
        return numParc;
    }

    public void setNumParc(int numParc) {
        this.numParc = numParc;
    }

    public BigDecimal getVlParcPass() {
        return vlParcPass;
    }

    public void setVlParcPass(BigDecimal vlParcPass) {
        this.vlParcPass = vlParcPass;
    }

    public BigDecimal getVlTribOc() {
        return vlTribOc;
    }

    public void setVlTribOc(BigDecimal vlTribOc) {
        this.vlTribOc = vlTribOc;
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    public BigDecimal getIndPerSai() {
        return indPerSai;
    }

    public void setIndPerSai(BigDecimal indPerSai) {
        this.indPerSai = indPerSai;
    }

    public BigDecimal getVlParcAprop() {
        return vlParcAprop;
    }

    public void setVlParcAprop(BigDecimal vlParcAprop) {
        this.vlParcAprop = vlParcAprop;
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
        if (!(object instanceof RegG126)) {
            return false;
        }
        RegG126 other = (RegG126) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegG126[ id=" + id + " ]";
    }

}
