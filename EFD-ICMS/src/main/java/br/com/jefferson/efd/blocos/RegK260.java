
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "reg_k260")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK260.findAll", query = "SELECT r FROM RegK260 r"),
    @NamedQuery(name = "RegK260.findById", query = "SELECT r FROM RegK260 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK260.findByIdPai", query = "SELECT r FROM RegK260 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK260.findByLinha", query = "SELECT r FROM RegK260 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK260.findByHash", query = "SELECT r FROM RegK260 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK260.findByReg", query = "SELECT r FROM RegK260 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK260.findByCodOpOs", query = "SELECT r FROM RegK260 r WHERE r.codOpOs = :codOpOs"),
    @NamedQuery(name = "RegK260.findByCodItem", query = "SELECT r FROM RegK260 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK260.findByDtSaida", query = "SELECT r FROM RegK260 r WHERE r.dtSaida = :dtSaida"),
    @NamedQuery(name = "RegK260.findByQtdSaida", query = "SELECT r FROM RegK260 r WHERE r.qtdSaida = :qtdSaida"),
    @NamedQuery(name = "RegK260.findByDtRet", query = "SELECT r FROM RegK260 r WHERE r.dtRet = :dtRet"),
    @NamedQuery(name = "RegK260.findByQtdRet", query = "SELECT r FROM RegK260 r WHERE r.qtdRet = :qtdRet")})
public class RegK260 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_PAI")
    private long idPai;
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private long hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "COD_OP_OS")
    private String codOpOs;
    @Column(name = "COD_ITEM")
    private String codItem;
    @Column(name = "DT_SAIDA")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_SAIDA")
    private BigDecimal qtdSaida;
    @Column(name = "DT_RET")
    @Temporal(TemporalType.DATE)
    private Date dtRet;
    @Column(name = "QTD_RET")
    private BigDecimal qtdRet;

    public RegK260() {
    }

    public RegK260(Long id) {
        this.id = id;
    }

    public RegK260(Long id, long idPai, long linha, long hash) {
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

    public long getIdPai() {
        return idPai;
    }

    public void setIdPai(long idPai) {
        this.idPai = idPai;
    }

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
        this.hash = hash;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getCodOpOs() {
        return codOpOs;
    }

    public void setCodOpOs(String codOpOs) {
        this.codOpOs = codOpOs;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public BigDecimal getQtdSaida() {
        return qtdSaida;
    }

    public void setQtdSaida(BigDecimal qtdSaida) {
        this.qtdSaida = qtdSaida;
    }

    public Date getDtRet() {
        return dtRet;
    }

    public void setDtRet(Date dtRet) {
        this.dtRet = dtRet;
    }

    public BigDecimal getQtdRet() {
        return qtdRet;
    }

    public void setQtdRet(BigDecimal qtdRet) {
        this.qtdRet = qtdRet;
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
        if (!(object instanceof RegK260)) {
            return false;
        }
        RegK260 other = (RegK260) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK260[ id=" + id + " ]";
    }

}
