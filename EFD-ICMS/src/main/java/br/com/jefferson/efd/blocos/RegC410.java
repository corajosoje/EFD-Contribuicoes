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
@Table(name = "reg_c410")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC410.findAll", query = "SELECT r FROM RegC410 r"),
    @NamedQuery(name = "RegC410.findById", query = "SELECT r FROM RegC410 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC410.findByIdPai", query = "SELECT r FROM RegC410 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC410.findByLinha", query = "SELECT r FROM RegC410 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC410.findByHash", query = "SELECT r FROM RegC410 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC410.findByReg", query = "SELECT r FROM RegC410 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC410.findByVlPis", query = "SELECT r FROM RegC410 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC410.findByVlCofins", query = "SELECT r FROM RegC410 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 4)
public class RegC410 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC405 idPai;

    public RegC405 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC405) idPai;
    }

    public RegC410() {
    }

    public RegC410(Long id) {
        this.id = id;
    }

    public RegC410(Long id, RegC405 idPai, long linha, String hash) {
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
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;

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

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
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
        if (!(object instanceof RegC410)) {
            return false;
        }
        RegC410 other = (RegC410) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC410[ id=" + id + " ]";
    }

}
