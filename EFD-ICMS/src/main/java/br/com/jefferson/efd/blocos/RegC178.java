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
@Table(name = "reg_c178")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC178.findAll", query = "SELECT r FROM RegC178 r"),
    @NamedQuery(name = "RegC178.findById", query = "SELECT r FROM RegC178 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC178.findByIdPai", query = "SELECT r FROM RegC178 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC178.findByLinha", query = "SELECT r FROM RegC178 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC178.findByHash", query = "SELECT r FROM RegC178 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC178.findByReg", query = "SELECT r FROM RegC178 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC178.findByClEnq", query = "SELECT r FROM RegC178 r WHERE r.clEnq = :clEnq"),
    @NamedQuery(name = "RegC178.findByVlUnid", query = "SELECT r FROM RegC178 r WHERE r.vlUnid = :vlUnid"),
    @NamedQuery(name = "RegC178.findByQuantPad", query = "SELECT r FROM RegC178 r WHERE r.quantPad = :quantPad")})
@Registros(nivel = 4)
public class RegC178 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public RegC178() {
    }

    public RegC178(Long id) {
        this.id = id;
    }

    public RegC178(Long id, RegC170 idPai, long linha, String hash) {
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
    @Column(name = "CL_ENQ")
    private String clEnq;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_UNID")
    private BigDecimal vlUnid;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QUANT_PAD")
    private BigDecimal quantPad;

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

    public String getClEnq() {
        return clEnq;
    }

    public void setClEnq(String clEnq) {
        this.clEnq = clEnq;
    }

    public BigDecimal getVlUnid() {
        return vlUnid;
    }

    public void setVlUnid(BigDecimal vlUnid) {
        this.vlUnid = vlUnid;
    }

    public BigDecimal getQuantPad() {
        return quantPad;
    }

    public void setQuantPad(BigDecimal quantPad) {
        this.quantPad = quantPad;
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
        if (!(object instanceof RegC178)) {
            return false;
        }
        RegC178 other = (RegC178) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC178[ id=" + id + " ]";
    }

}
