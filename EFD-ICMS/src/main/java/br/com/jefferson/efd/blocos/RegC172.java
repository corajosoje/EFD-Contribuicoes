package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
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
@Table(name = "reg_c172")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC172.findAll", query = "SELECT r FROM RegC172 r"),
    @NamedQuery(name = "RegC172.findById", query = "SELECT r FROM RegC172 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC172.findByIdPai", query = "SELECT r FROM RegC172 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC172.findByLinha", query = "SELECT r FROM RegC172 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC172.findByHashfile", query = "SELECT r FROM RegC172 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC172.findByReg", query = "SELECT r FROM RegC172 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC172.findByVlBcIssqn", query = "SELECT r FROM RegC172 r WHERE r.vlBcIssqn = :vlBcIssqn"),
    @NamedQuery(name = "RegC172.findByAliqIssqn", query = "SELECT r FROM RegC172 r WHERE r.aliqIssqn = :aliqIssqn"),
    @NamedQuery(name = "RegC172.findByVlIssqn", query = "SELECT r FROM RegC172 r WHERE r.vlIssqn = :vlIssqn")})
@Registros(nivel = 4)
public class RegC172 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC170 idPai;

    public RegC170 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC170) idPai;
    }

    public RegC172() {
    }

    public RegC172(Long id) {
        this.id = id;
    }

    public RegC172(Long id, RegC170 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
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
    @Column(name = "HASHFILE")
    private String hashfile;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_BC_ISSQN", precision = 15, scale = 6)
    private BigDecimal vlBcIssqn;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "ALIQ_ISSQN", precision = 15, scale = 6)
    private BigDecimal aliqIssqn;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ISSQN", precision = 15, scale = 6)
    private BigDecimal vlIssqn;

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

    public BigDecimal getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(BigDecimal vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public BigDecimal getAliqIssqn() {
        return aliqIssqn;
    }

    public void setAliqIssqn(BigDecimal aliqIssqn) {
        this.aliqIssqn = aliqIssqn;
    }

    public BigDecimal getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(BigDecimal vlIssqn) {
        this.vlIssqn = vlIssqn;
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
        if (!(object instanceof RegC172)) {
            return false;
        }
        RegC172 other = (RegC172) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC172[ id=" + id + " ]";
    }

}
