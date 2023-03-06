package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
@Table(name = "reg_g110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegG110.findAll", query = "SELECT r FROM RegG110 r"),
    @NamedQuery(name = "RegG110.findById", query = "SELECT r FROM RegG110 r WHERE r.id = :id"),
    @NamedQuery(name = "RegG110.findByIdPai", query = "SELECT r FROM RegG110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegG110.findByLinha", query = "SELECT r FROM RegG110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegG110.findByHashfile", query = "SELECT r FROM RegG110 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegG110.findByReg", query = "SELECT r FROM RegG110 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegG110.findByDtIni", query = "SELECT r FROM RegG110 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "RegG110.findByDtFin", query = "SELECT r FROM RegG110 r WHERE r.dtFin = :dtFin"),
    @NamedQuery(name = "RegG110.findBySaldoInIcms", query = "SELECT r FROM RegG110 r WHERE r.saldoInIcms = :saldoInIcms"),
    @NamedQuery(name = "RegG110.findBySomParc", query = "SELECT r FROM RegG110 r WHERE r.somParc = :somParc"),
    @NamedQuery(name = "RegG110.findByVlTribExp", query = "SELECT r FROM RegG110 r WHERE r.vlTribExp = :vlTribExp"),
    @NamedQuery(name = "RegG110.findByVlTotal", query = "SELECT r FROM RegG110 r WHERE r.vlTotal = :vlTotal"),
    @NamedQuery(name = "RegG110.findByIndPerSai", query = "SELECT r FROM RegG110 r WHERE r.indPerSai = :indPerSai"),
    @NamedQuery(name = "RegG110.findByIcmsAprop", query = "SELECT r FROM RegG110 r WHERE r.icmsAprop = :icmsAprop"),
    @NamedQuery(name = "RegG110.findBySomIcmsOc", query = "SELECT r FROM RegG110 r WHERE r.somIcmsOc = :somIcmsOc")})
@Registros(nivel = 2)
public class RegG110 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegG001 idPai;

    public RegG001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegG001) idPai;
    }

    public RegG110() {
    }

    public RegG110(String id) {
        this.id = id;
    }

    public RegG110(String id, RegG001 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegG125> regG125;

    public List<RegG125> getRegG125() {
        return regG125;
    }

    public void setRegG125(List<RegG125> regG125) {
        this.regG125 = regG125;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    private Date dtIni;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_FIN")
    @Temporal(TemporalType.DATE)
    private Date dtFin;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "SALDO_IN_ICMS", precision = 15, scale = 6)
    private BigDecimal saldoInIcms;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "SOM_PARC", precision = 15, scale = 6)
    private BigDecimal somParc;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_TRIB_EXP", precision = 15, scale = 6)
    private BigDecimal vlTribExp;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_TOTAL", precision = 15, scale = 6)
    private BigDecimal vlTotal;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "IND_PER_SAI", precision = 15, scale = 6)
    private BigDecimal indPerSai;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "ICMS_APROP", precision = 15, scale = 6)
    private BigDecimal icmsAprop;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "SOM_ICMS_OC", precision = 15, scale = 6)
    private BigDecimal somIcmsOc;

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

    public Date getDtFin() {
        return dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }

    public BigDecimal getSaldoInIcms() {
        return saldoInIcms;
    }

    public void setSaldoInIcms(BigDecimal saldoInIcms) {
        this.saldoInIcms = saldoInIcms;
    }

    public BigDecimal getSomParc() {
        return somParc;
    }

    public void setSomParc(BigDecimal somParc) {
        this.somParc = somParc;
    }

    public BigDecimal getVlTribExp() {
        return vlTribExp;
    }

    public void setVlTribExp(BigDecimal vlTribExp) {
        this.vlTribExp = vlTribExp;
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

    public BigDecimal getIcmsAprop() {
        return icmsAprop;
    }

    public void setIcmsAprop(BigDecimal icmsAprop) {
        this.icmsAprop = icmsAprop;
    }

    public BigDecimal getSomIcmsOc() {
        return somIcmsOc;
    }

    public void setSomIcmsOc(BigDecimal somIcmsOc) {
        this.somIcmsOc = somIcmsOc;
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
        if (!(object instanceof RegG110)) {
            return false;
        }
        RegG110 other = (RegG110) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegG110[ id=" + id + " ]";
    }

}
