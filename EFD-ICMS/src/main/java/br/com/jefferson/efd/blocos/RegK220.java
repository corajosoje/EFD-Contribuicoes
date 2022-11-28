package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_k220")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK220.findAll", query = "SELECT r FROM RegK220 r"),
    @NamedQuery(name = "RegK220.findById", query = "SELECT r FROM RegK220 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK220.findByIdPai", query = "SELECT r FROM RegK220 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK220.findByLinha", query = "SELECT r FROM RegK220 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK220.findByHash", query = "SELECT r FROM RegK220 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK220.findByReg", query = "SELECT r FROM RegK220 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK220.findByDtMov", query = "SELECT r FROM RegK220 r WHERE r.dtMov = :dtMov"),
    @NamedQuery(name = "RegK220.findByCodItemOri", query = "SELECT r FROM RegK220 r WHERE r.codItemOri = :codItemOri"),
    @NamedQuery(name = "RegK220.findByCodItemDest", query = "SELECT r FROM RegK220 r WHERE r.codItemDest = :codItemDest"),
    @NamedQuery(name = "RegK220.findByQtdOri", query = "SELECT r FROM RegK220 r WHERE r.qtdOri = :qtdOri"),
    @NamedQuery(name = "RegK220.findByQtdDest", query = "SELECT r FROM RegK220 r WHERE r.qtdDest = :qtdDest")})
@Registros(nivel = 3)
public class RegK220 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK100 idPai;

    public RegK100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK100) idPai;
    }

    public RegK220() {
    }

    public RegK220(Long id) {
        this.id = id;
    }

    public RegK220(Long id, RegK100 idPai, long linha, String hash) {
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
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_MOV")
    @Temporal(TemporalType.DATE)
    private Date dtMov;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM_ORI")
    private String codItemOri;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_ITEM_DEST")
    private String codItemDest;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "QTD_ORI")
    private BigDecimal qtdOri;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "QTD_DEST")
    private BigDecimal qtdDest;

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

    public Date getDtMov() {
        return dtMov;
    }

    public void setDtMov(Date dtMov) {
        this.dtMov = dtMov;
    }

    public String getCodItemOri() {
        return codItemOri;
    }

    public void setCodItemOri(String codItemOri) {
        this.codItemOri = codItemOri;
    }

    public String getCodItemDest() {
        return codItemDest;
    }

    public void setCodItemDest(String codItemDest) {
        this.codItemDest = codItemDest;
    }

    public BigDecimal getQtdOri() {
        return qtdOri;
    }

    public void setQtdOri(BigDecimal qtdOri) {
        this.qtdOri = qtdOri;
    }

    public BigDecimal getQtdDest() {
        return qtdDest;
    }

    public void setQtdDest(BigDecimal qtdDest) {
        this.qtdDest = qtdDest;
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
        if (!(object instanceof RegK220)) {
            return false;
        }
        RegK220 other = (RegK220) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK220[ id=" + id + " ]";
    }

}
