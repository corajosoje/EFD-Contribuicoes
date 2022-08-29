
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
@Table(name = "reg_k280")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK280.findAll", query = "SELECT r FROM RegK280 r"),
    @NamedQuery(name = "RegK280.findById", query = "SELECT r FROM RegK280 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK280.findByIdPai", query = "SELECT r FROM RegK280 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK280.findByLinha", query = "SELECT r FROM RegK280 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK280.findByHash", query = "SELECT r FROM RegK280 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK280.findByReg", query = "SELECT r FROM RegK280 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK280.findByDtEst", query = "SELECT r FROM RegK280 r WHERE r.dtEst = :dtEst"),
    @NamedQuery(name = "RegK280.findByCodItem", query = "SELECT r FROM RegK280 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK280.findByQtdCorPos", query = "SELECT r FROM RegK280 r WHERE r.qtdCorPos = :qtdCorPos"),
    @NamedQuery(name = "RegK280.findByQtdCorNeg", query = "SELECT r FROM RegK280 r WHERE r.qtdCorNeg = :qtdCorNeg"),
    @NamedQuery(name = "RegK280.findByIndEst", query = "SELECT r FROM RegK280 r WHERE r.indEst = :indEst"),
    @NamedQuery(name = "RegK280.findByCodPart", query = "SELECT r FROM RegK280 r WHERE r.codPart = :codPart")})
public class RegK280 implements Serializable {

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
    @Column(name = "DT_EST")
    @Temporal(TemporalType.DATE)
    private Date dtEst;
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_COR_POS")
    private BigDecimal qtdCorPos;
    @Column(name = "QTD_COR_NEG")
    private BigDecimal qtdCorNeg;
    @Column(name = "IND_EST")
    private String indEst;
    @Column(name = "COD_PART")
    private String codPart;

    public RegK280() {
    }

    public RegK280(Long id) {
        this.id = id;
    }

    public RegK280(Long id, long idPai, long linha, String hash) {
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

    public Date getDtEst() {
        return dtEst;
    }

    public void setDtEst(Date dtEst) {
        this.dtEst = dtEst;
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

    public String getIndEst() {
        return indEst;
    }

    public void setIndEst(String indEst) {
        this.indEst = indEst;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
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
        if (!(object instanceof RegK280)) {
            return false;
        }
        RegK280 other = (RegK280) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK280[ id=" + id + " ]";
    }

}
