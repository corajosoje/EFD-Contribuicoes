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
@Table(name = "reg_k291")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK291.findAll", query = "SELECT r FROM RegK291 r"),
    @NamedQuery(name = "RegK291.findById", query = "SELECT r FROM RegK291 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK291.findByIdPai", query = "SELECT r FROM RegK291 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK291.findByLinha", query = "SELECT r FROM RegK291 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK291.findByHashfile", query = "SELECT r FROM RegK291 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK291.findByReg", query = "SELECT r FROM RegK291 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK291.findByCodItem", query = "SELECT r FROM RegK291 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK291.findByQtd", query = "SELECT r FROM RegK291 r WHERE r.qtd = :qtd")})
@Registros(nivel = 4)
public class RegK291 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK290 idPai;

    public RegK290 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK290) idPai;
    }

    public RegK291() {
    }

    public RegK291(String id) {
        this.id = id;
    }

    public RegK291(String id, RegK290 idPai, long linha, String hashfile) {
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
    @Column(name = "QTD", precision = 15, scale = 6)
    private BigDecimal qtd;

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

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
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
        if (!(object instanceof RegK291)) {
            return false;
        }
        RegK291 other = (RegK291) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK291[ id=" + id + " ]";
    }

}
