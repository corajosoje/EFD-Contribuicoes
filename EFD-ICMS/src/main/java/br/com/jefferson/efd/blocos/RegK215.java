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
@Table(name = "reg_k215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK215.findAll", query = "SELECT r FROM RegK215 r"),
    @NamedQuery(name = "RegK215.findById", query = "SELECT r FROM RegK215 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK215.findByIdPai", query = "SELECT r FROM RegK215 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK215.findByLinha", query = "SELECT r FROM RegK215 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK215.findByHashfile", query = "SELECT r FROM RegK215 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK215.findByReg", query = "SELECT r FROM RegK215 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK215.findByCodItemDes", query = "SELECT r FROM RegK215 r WHERE r.codItemDes = :codItemDes"),
    @NamedQuery(name = "RegK215.findByQtdDes", query = "SELECT r FROM RegK215 r WHERE r.qtdDes = :qtdDes")})
@Registros(nivel = 4)
public class RegK215 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
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

    public RegK215(String id) {
        this.id = id;
    }

    public RegK215(String id, RegK210 idPai, long linha, String hashfile) {
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
    @Column(name = "COD_ITEM_DES")
    private String codItemDes;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD_DES", precision = 15, scale = 6)
    private BigDecimal qtdDes;

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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
