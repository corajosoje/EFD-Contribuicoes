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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_h030")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegH030.findAll", query = "SELECT r FROM RegH030 r"),
    @NamedQuery(name = "RegH030.findById", query = "SELECT r FROM RegH030 r WHERE r.id = :id"),
    @NamedQuery(name = "RegH030.findByIdPai", query = "SELECT r FROM RegH030 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegH030.findByLinha", query = "SELECT r FROM RegH030 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegH030.findByHash", query = "SELECT r FROM RegH030 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegH030.findByReg", query = "SELECT r FROM RegH030 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegH030.findByVlIcmsOp", query = "SELECT r FROM RegH030 r WHERE r.vlIcmsOp = :vlIcmsOp"),
    @NamedQuery(name = "RegH030.findByVlBcIcmsSt", query = "SELECT r FROM RegH030 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegH030.findByVlIcmsSt", query = "SELECT r FROM RegH030 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegH030.findByVlFcp", query = "SELECT r FROM RegH030 r WHERE r.vlFcp = :vlFcp")})
@Registros(nivel = 4)
public class RegH030 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegH010 idPai;

    public RegH010 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegH010) idPai;
    }

    public RegH030() {
    }

    public RegH030(Long id) {
        this.id = id;
    }

    public RegH030(Long id, RegH010 idPai, long linha, String hash) {
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_ICMS_OP")
    private BigDecimal vlIcmsOp;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST")
    private BigDecimal vlBcIcmsSt;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ICMS_ST")
    private BigDecimal vlIcmsSt;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_FCP")
    private BigDecimal vlFcp;

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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
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
