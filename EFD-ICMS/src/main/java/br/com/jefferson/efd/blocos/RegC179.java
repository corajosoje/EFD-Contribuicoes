package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c179")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC179.findAll", query = "SELECT r FROM RegC179 r"),
    @NamedQuery(name = "RegC179.findById", query = "SELECT r FROM RegC179 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC179.findByIdPai", query = "SELECT r FROM RegC179 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC179.findByLinha", query = "SELECT r FROM RegC179 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC179.findByHashfile", query = "SELECT r FROM RegC179 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC179.findByReg", query = "SELECT r FROM RegC179 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC179.findByBcStOrigDest", query = "SELECT r FROM RegC179 r WHERE r.bcStOrigDest = :bcStOrigDest"),
    @NamedQuery(name = "RegC179.findByIcmsStRep", query = "SELECT r FROM RegC179 r WHERE r.icmsStRep = :icmsStRep"),
    @NamedQuery(name = "RegC179.findByIcmsStCompl", query = "SELECT r FROM RegC179 r WHERE r.icmsStCompl = :icmsStCompl"),
    @NamedQuery(name = "RegC179.findByBcRet", query = "SELECT r FROM RegC179 r WHERE r.bcRet = :bcRet"),
    @NamedQuery(name = "RegC179.findByIcmsRet", query = "SELECT r FROM RegC179 r WHERE r.icmsRet = :icmsRet")})
@Registros(nivel = 4)
public class RegC179 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC170 idPai;

    public RegC170 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC170) idPai;
    }

    public RegC179() {
    }

    public RegC179(String id) {
        this.id = id;
    }

    public RegC179(String id, RegC170 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "BC_ST_ORIG_DEST", precision = 15, scale = 6)
    private BigDecimal bcStOrigDest;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "ICMS_ST_REP", precision = 15, scale = 6)
    private BigDecimal icmsStRep;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "ICMS_ST_COMPL", precision = 15, scale = 6)
    private BigDecimal icmsStCompl;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "BC_RET", precision = 15, scale = 6)
    private BigDecimal bcRet;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "ICMS_RET", precision = 15, scale = 6)
    private BigDecimal icmsRet;

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

    public BigDecimal getBcStOrigDest() {
        return bcStOrigDest;
    }

    public void setBcStOrigDest(BigDecimal bcStOrigDest) {
        this.bcStOrigDest = bcStOrigDest;
    }

    public BigDecimal getIcmsStRep() {
        return icmsStRep;
    }

    public void setIcmsStRep(BigDecimal icmsStRep) {
        this.icmsStRep = icmsStRep;
    }

    public BigDecimal getIcmsStCompl() {
        return icmsStCompl;
    }

    public void setIcmsStCompl(BigDecimal icmsStCompl) {
        this.icmsStCompl = icmsStCompl;
    }

    public BigDecimal getBcRet() {
        return bcRet;
    }

    public void setBcRet(BigDecimal bcRet) {
        this.bcRet = bcRet;
    }

    public BigDecimal getIcmsRet() {
        return icmsRet;
    }

    public void setIcmsRet(BigDecimal icmsRet) {
        this.icmsRet = icmsRet;
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
        if (!(object instanceof RegC179)) {
            return false;
        }
        RegC179 other = (RegC179) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC179[ id=" + id + " ]";
    }

}
