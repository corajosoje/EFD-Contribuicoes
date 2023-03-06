package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
@Table(name = "reg_h030")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegH030.findAll", query = "SELECT r FROM RegH030 r"),
    @NamedQuery(name = "RegH030.findById", query = "SELECT r FROM RegH030 r WHERE r.id = :id"),
    @NamedQuery(name = "RegH030.findByIdPai", query = "SELECT r FROM RegH030 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegH030.findByLinha", query = "SELECT r FROM RegH030 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegH030.findByHashfile", query = "SELECT r FROM RegH030 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegH030.findByReg", query = "SELECT r FROM RegH030 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegH030.findByVlIcmsOp", query = "SELECT r FROM RegH030 r WHERE r.vlIcmsOp = :vlIcmsOp"),
    @NamedQuery(name = "RegH030.findByVlBcIcmsSt", query = "SELECT r FROM RegH030 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegH030.findByVlIcmsSt", query = "SELECT r FROM RegH030 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegH030.findByVlFcp", query = "SELECT r FROM RegH030 r WHERE r.vlFcp = :vlFcp")})
@Registros(nivel = 4)
public class RegH030 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegH010 idPai;

    public RegH010 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegH010) idPai;
    }

    public RegH030() {
    }

    public RegH030(String id) {
        this.id = id;
    }

    public RegH030(String id, RegH010 idPai, long linha, String hashfile) {
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
    @Column(name = "VL_ICMS_OP", precision = 15, scale = 6)
    private BigDecimal vlIcmsOp;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_FCP", precision = 15, scale = 6)
    private BigDecimal vlFcp;

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

    public BigDecimal getVlIcmsOp() {
        return vlIcmsOp;
    }

    public void setVlIcmsOp(BigDecimal vlIcmsOp) {
        this.vlIcmsOp = vlIcmsOp;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public BigDecimal getVlFcp() {
        return vlFcp;
    }

    public void setVlFcp(BigDecimal vlFcp) {
        this.vlFcp = vlFcp;
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
        if (!(object instanceof RegH030)) {
            return false;
        }
        RegH030 other = (RegH030) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegH030[ id=" + id + " ]";
    }

}
