
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
@Table(name = "reg_k270")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK270.findAll", query = "SELECT r FROM RegK270 r"),
    @NamedQuery(name = "RegK270.findById", query = "SELECT r FROM RegK270 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK270.findByIdPai", query = "SELECT r FROM RegK270 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK270.findByLinha", query = "SELECT r FROM RegK270 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK270.findByHash", query = "SELECT r FROM RegK270 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK270.findByReg", query = "SELECT r FROM RegK270 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK270.findByDtIniAp", query = "SELECT r FROM RegK270 r WHERE r.dtIniAp = :dtIniAp"),
    @NamedQuery(name = "RegK270.findByDtFinAp", query = "SELECT r FROM RegK270 r WHERE r.dtFinAp = :dtFinAp"),
    @NamedQuery(name = "RegK270.findByCodOpOs", query = "SELECT r FROM RegK270 r WHERE r.codOpOs = :codOpOs"),
    @NamedQuery(name = "RegK270.findByCodItem", query = "SELECT r FROM RegK270 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK270.findByQtdCorPos", query = "SELECT r FROM RegK270 r WHERE r.qtdCorPos = :qtdCorPos"),
    @NamedQuery(name = "RegK270.findByQtdCorNeg", query = "SELECT r FROM RegK270 r WHERE r.qtdCorNeg = :qtdCorNeg"),
    @NamedQuery(name = "RegK270.findByOrigem", query = "SELECT r FROM RegK270 r WHERE r.origem = :origem")})
public class RegK270 implements Serializable {

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
    @Column(name = "DT_INI_AP")
    @Temporal(TemporalType.DATE)
    private Date dtIniAp;
    @Column(name = "DT_FIN_AP")
    @Temporal(TemporalType.DATE)
    private Date dtFinAp;
    @Column(name = "COD_OP_OS")
    private String codOpOs;
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_COR_POS")
    private BigDecimal qtdCorPos;
    @Column(name = "QTD_COR_NEG")
    private BigDecimal qtdCorNeg;
    @Column(name = "ORIGEM")
    private String origem;

    public RegK270() {
    }

    public RegK270(Long id) {
        this.id = id;
    }

    public RegK270(Long id, long idPai, long linha, long hash) {
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

    public Date getDtIniAp() {
        return dtIniAp;
    }

    public void setDtIniAp(Date dtIniAp) {
        this.dtIniAp = dtIniAp;
    }

    public Date getDtFinAp() {
        return dtFinAp;
    }

    public void setDtFinAp(Date dtFinAp) {
        this.dtFinAp = dtFinAp;
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

    public BigDecimal getQtdCorPos() {
        return qtdCorPos;
    }

    public void setQtdCorPos(BigDecimal qtdCorPos) {
        this.qtdCorPos = qtdCorPos;
    }

    public BigDecimal getQtdCorNeg() {
        return qtdCorNeg;
    }

    public void setQtdCorNeg(BigDecimal qtdCorNeg) {
        this.qtdCorNeg = qtdCorNeg;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
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
        if (!(object instanceof RegK270)) {
            return false;
        }
        RegK270 other = (RegK270) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK270[ id=" + id + " ]";
    }

}
