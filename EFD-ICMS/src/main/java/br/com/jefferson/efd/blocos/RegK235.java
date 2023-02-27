package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_k235")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK235.findAll", query = "SELECT r FROM RegK235 r"),
    @NamedQuery(name = "RegK235.findById", query = "SELECT r FROM RegK235 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK235.findByIdPai", query = "SELECT r FROM RegK235 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK235.findByLinha", query = "SELECT r FROM RegK235 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK235.findByHashfile", query = "SELECT r FROM RegK235 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK235.findByReg", query = "SELECT r FROM RegK235 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK235.findByDtSaida", query = "SELECT r FROM RegK235 r WHERE r.dtSaida = :dtSaida"),
    @NamedQuery(name = "RegK235.findByCodItem", query = "SELECT r FROM RegK235 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK235.findByQtd", query = "SELECT r FROM RegK235 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegK235.findByCodInsSubst", query = "SELECT r FROM RegK235 r WHERE r.codInsSubst = :codInsSubst")})
@Registros(nivel = 4)
public class RegK235 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK230 idPai;

    public RegK230 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK230) idPai;
    }

    public RegK235() {
    }

    public RegK235(String id) {
        this.id = id;
    }

    public RegK235(String id, RegK230 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_SAIDA")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD", precision = 15, scale = 6)
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

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegK235)) {
            return false;
        }
        RegK235 other = (RegK235) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK235[ id=" + id + " ]";
    }

}
