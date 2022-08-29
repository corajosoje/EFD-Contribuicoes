
package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_k230")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK230.findAll", query = "SELECT r FROM RegK230 r"),
    @NamedQuery(name = "RegK230.findById", query = "SELECT r FROM RegK230 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK230.findByIdPai", query = "SELECT r FROM RegK230 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK230.findByLinha", query = "SELECT r FROM RegK230 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK230.findByHash", query = "SELECT r FROM RegK230 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK230.findByReg", query = "SELECT r FROM RegK230 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK230.findByDtIniOp", query = "SELECT r FROM RegK230 r WHERE r.dtIniOp = :dtIniOp"),
    @NamedQuery(name = "RegK230.findByDtFinOp", query = "SELECT r FROM RegK230 r WHERE r.dtFinOp = :dtFinOp"),
    @NamedQuery(name = "RegK230.findByCodDocOp", query = "SELECT r FROM RegK230 r WHERE r.codDocOp = :codDocOp"),
    @NamedQuery(name = "RegK230.findByCodItem", query = "SELECT r FROM RegK230 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK230.findByQtdEnc", query = "SELECT r FROM RegK230 r WHERE r.qtdEnc = :qtdEnc")})
public class RegK230 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "DT_INI_OP")
    @Temporal(TemporalType.DATE)
    private Date dtIniOp;
    @Column(name = "DT_FIN_OP")
    @Temporal(TemporalType.DATE)
    private Date dtFinOp;
    @Column(name = "COD_DOC_OP")
    private String codDocOp;
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_ENC")
    private BigDecimal qtdEnc;

    public RegK230() {
    }

    public RegK230(Long id) {
        this.id = id;
    }

    public RegK230(Long id, long idPai, long linha, String hash) {
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

    public Date getDtIniOp() {
        return dtIniOp;
    }

    public void setDtIniOp(Date dtIniOp) {
        this.dtIniOp = dtIniOp;
    }

    public Date getDtFinOp() {
        return dtFinOp;
    }

    public void setDtFinOp(Date dtFinOp) {
        this.dtFinOp = dtFinOp;
    }

    public String getCodDocOp() {
        return codDocOp;
    }

    public void setCodDocOp(String codDocOp) {
        this.codDocOp = codDocOp;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtdEnc() {
        return qtdEnc;
    }

    public void setQtdEnc(BigDecimal qtdEnc) {
        this.qtdEnc = qtdEnc;
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
        if (!(object instanceof RegK230)) {
            return false;
        }
        RegK230 other = (RegK230) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK230[ id=" + id + " ]";
    }

}
