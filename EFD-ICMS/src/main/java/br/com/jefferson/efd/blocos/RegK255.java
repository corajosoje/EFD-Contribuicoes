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
@Table(name = "reg_k255")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK255.findAll", query = "SELECT r FROM RegK255 r"),
    @NamedQuery(name = "RegK255.findById", query = "SELECT r FROM RegK255 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK255.findByIdPai", query = "SELECT r FROM RegK255 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK255.findByLinha", query = "SELECT r FROM RegK255 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK255.findByHash", query = "SELECT r FROM RegK255 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK255.findByReg", query = "SELECT r FROM RegK255 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK255.findByDtCons", query = "SELECT r FROM RegK255 r WHERE r.dtCons = :dtCons"),
    @NamedQuery(name = "RegK255.findByCodItem", query = "SELECT r FROM RegK255 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK255.findByQtd", query = "SELECT r FROM RegK255 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegK255.findByCodInsSubst", query = "SELECT r FROM RegK255 r WHERE r.codInsSubst = :codInsSubst")})
@Registros(nivel = 4)
public class RegK255 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK250 idPai;

    public RegK250 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK250) idPai;
    }

    public RegK255() {
    }

    public RegK255(Long id) {
        this.id = id;
    }

    public RegK255(Long id, RegK250 idPai, long linha, String hash) {
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
    @Column(name = "DT_CONS")
    @Temporal(TemporalType.DATE)
    private Date dtCons;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_INS_SUBST")
    private String codInsSubst;

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

    public Date getDtCons() {
        return dtCons;
    }

    public void setDtCons(Date dtCons) {
        this.dtCons = dtCons;
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

    public String getCodInsSubst() {
        return codInsSubst;
    }

    public void setCodInsSubst(String codInsSubst) {
        this.codInsSubst = codInsSubst;
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
        if (!(object instanceof RegK255)) {
            return false;
        }
        RegK255 other = (RegK255) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK255[ id=" + id + " ]";
    }

}
