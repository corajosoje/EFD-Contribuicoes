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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_k265")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK265.findAll", query = "SELECT r FROM RegK265 r"),
    @NamedQuery(name = "RegK265.findById", query = "SELECT r FROM RegK265 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK265.findByIdPai", query = "SELECT r FROM RegK265 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK265.findByLinha", query = "SELECT r FROM RegK265 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK265.findByHashfile", query = "SELECT r FROM RegK265 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK265.findByReg", query = "SELECT r FROM RegK265 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK265.findByCodItem", query = "SELECT r FROM RegK265 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK265.findByQtdCons", query = "SELECT r FROM RegK265 r WHERE r.qtdCons = :qtdCons"),
    @NamedQuery(name = "RegK265.findByQtdRet", query = "SELECT r FROM RegK265 r WHERE r.qtdRet = :qtdRet")})
@Registros(nivel = 4)
public class RegK265 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK260 idPai;

    public RegK260 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK260) idPai;
    }

    public RegK265() {
    }

    public RegK265(String id) {
        this.id = id;
    }

    public RegK265(String id, RegK260 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD_CONS", precision = 15, scale = 6)
    private BigDecimal qtdCons;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD_RET", precision = 15, scale = 6)
    private BigDecimal qtdRet;

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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtdCons() {
        return qtdCons;
    }

    public void setQtdCons(BigDecimal qtdCons) {
        this.qtdCons = qtdCons;
    }

    public BigDecimal getQtdRet() {
        return qtdRet;
    }

    public void setQtdRet(BigDecimal qtdRet) {
        this.qtdRet = qtdRet;
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
        if (!(object instanceof RegK265)) {
            return false;
        }
        RegK265 other = (RegK265) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK265[ id=" + id + " ]";
    }

}
