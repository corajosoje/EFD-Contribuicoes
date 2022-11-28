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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_k215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK215.findAll", query = "SELECT r FROM RegK215 r"),
    @NamedQuery(name = "RegK215.findById", query = "SELECT r FROM RegK215 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK215.findByIdPai", query = "SELECT r FROM RegK215 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK215.findByLinha", query = "SELECT r FROM RegK215 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK215.findByHash", query = "SELECT r FROM RegK215 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK215.findByReg", query = "SELECT r FROM RegK215 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK215.findByCodItemDes", query = "SELECT r FROM RegK215 r WHERE r.codItemDes = :codItemDes"),
    @NamedQuery(name = "RegK215.findByQtdDes", query = "SELECT r FROM RegK215 r WHERE r.qtdDes = :qtdDes")})
@Registros(nivel = 4)
public class RegK215 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK210 idPai;

    public RegK210 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK210) idPai;
    }

    public RegK215() {
    }

    public RegK215(Long id) {
        this.id = id;
    }

    public RegK215(Long id, RegK210 idPai, long linha, String hash) {
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
    @Column(name = "COD_ITEM_DES")
    private String codItemDes;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD_DES")
    private BigDecimal qtdDes;

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

    public String getCodItemDes() {
        return codItemDes;
    }

    public void setCodItemDes(String codItemDes) {
        this.codItemDes = codItemDes;
    }

    public BigDecimal getQtdDes() {
        return qtdDes;
    }

    public void setQtdDes(BigDecimal qtdDes) {
        this.qtdDes = qtdDes;
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
        if (!(object instanceof RegK215)) {
            return false;
        }
        RegK215 other = (RegK215) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK215[ id=" + id + " ]";
    }

}
