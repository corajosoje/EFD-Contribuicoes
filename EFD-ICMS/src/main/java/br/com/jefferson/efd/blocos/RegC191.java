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
@Table(name = "reg_c191")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC191.findAll", query = "SELECT r FROM RegC191 r"),
    @NamedQuery(name = "RegC191.findById", query = "SELECT r FROM RegC191 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC191.findByIdPai", query = "SELECT r FROM RegC191 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC191.findByLinha", query = "SELECT r FROM RegC191 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC191.findByHashfile", query = "SELECT r FROM RegC191 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC191.findByReg", query = "SELECT r FROM RegC191 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC191.findByVlFcpOp", query = "SELECT r FROM RegC191 r WHERE r.vlFcpOp = :vlFcpOp"),
    @NamedQuery(name = "RegC191.findByVlFcpSt", query = "SELECT r FROM RegC191 r WHERE r.vlFcpSt = :vlFcpSt"),
    @NamedQuery(name = "RegC191.findByVlFcpRet", query = "SELECT r FROM RegC191 r WHERE r.vlFcpRet = :vlFcpRet")})
@Registros(nivel = 4)
public class RegC191 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC190 idPai;

    public RegC190 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC190) idPai;
    }

    public RegC191() {
    }

    public RegC191(String id) {
        this.id = id;
    }

    public RegC191(String id, RegC190 idPai, long linha, String hashfile) {
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
    @Column(name = "VL_FCP_OP", precision = 15, scale = 6)
    private BigDecimal vlFcpOp;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_FCP_ST", precision = 15, scale = 6)
    private BigDecimal vlFcpSt;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_FCP_RET", precision = 15, scale = 6)
    private BigDecimal vlFcpRet;

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

    public BigDecimal getVlFcpOp() {
        return vlFcpOp;
    }

    public void setVlFcpOp(BigDecimal vlFcpOp) {
        this.vlFcpOp = vlFcpOp;
    }

    public BigDecimal getVlFcpSt() {
        return vlFcpSt;
    }

    public void setVlFcpSt(BigDecimal vlFcpSt) {
        this.vlFcpSt = vlFcpSt;
    }

    public BigDecimal getVlFcpRet() {
        return vlFcpRet;
    }

    public void setVlFcpRet(BigDecimal vlFcpRet) {
        this.vlFcpRet = vlFcpRet;
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
        if (!(object instanceof RegC191)) {
            return false;
        }
        RegC191 other = (RegC191) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC191[ id=" + id + " ]";
    }

}
