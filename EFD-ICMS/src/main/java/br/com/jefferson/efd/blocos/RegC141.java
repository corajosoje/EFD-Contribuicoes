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
@Table(name = "reg_c141")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC141.findAll", query = "SELECT r FROM RegC141 r"),
    @NamedQuery(name = "RegC141.findById", query = "SELECT r FROM RegC141 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC141.findByIdPai", query = "SELECT r FROM RegC141 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC141.findByLinha", query = "SELECT r FROM RegC141 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC141.findByHashfile", query = "SELECT r FROM RegC141 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC141.findByReg", query = "SELECT r FROM RegC141 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC141.findByNumParc", query = "SELECT r FROM RegC141 r WHERE r.numParc = :numParc"),
    @NamedQuery(name = "RegC141.findByDtVcto", query = "SELECT r FROM RegC141 r WHERE r.dtVcto = :dtVcto"),
    @NamedQuery(name = "RegC141.findByVlParc", query = "SELECT r FROM RegC141 r WHERE r.vlParc = :vlParc")})
@Registros(nivel = 4)
public class RegC141 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC140 idPai;

    public RegC140 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC140) idPai;
    }

    public RegC141() {
    }

    public RegC141(String id) {
        this.id = id;
    }

    public RegC141(String id, RegC140 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "NUM_PARC")
    private int numParc;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_VCTO")
    @Temporal(TemporalType.DATE)
    private Date dtVcto;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_PARC", precision = 15, scale = 6)
    private BigDecimal vlParc;

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

    public int getNumParc() {
        return numParc;
    }

    public void setNumParc(int numParc) {
        this.numParc = numParc;
    }

    public Date getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }

    public BigDecimal getVlParc() {
        return vlParc;
    }

    public void setVlParc(BigDecimal vlParc) {
        this.vlParc = vlParc;
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
        if (!(object instanceof RegC141)) {
            return false;
        }
        RegC141 other = (RegC141) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC141[ id=" + id + " ]";
    }

}
