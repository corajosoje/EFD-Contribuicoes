
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
@Table(name = "reg_k210")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK210.findAll", query = "SELECT r FROM RegK210 r"),
    @NamedQuery(name = "RegK210.findById", query = "SELECT r FROM RegK210 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK210.findByIdPai", query = "SELECT r FROM RegK210 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK210.findByLinha", query = "SELECT r FROM RegK210 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK210.findByHash", query = "SELECT r FROM RegK210 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK210.findByReg", query = "SELECT r FROM RegK210 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK210.findByDtIniOs", query = "SELECT r FROM RegK210 r WHERE r.dtIniOs = :dtIniOs"),
    @NamedQuery(name = "RegK210.findByDtFinOs", query = "SELECT r FROM RegK210 r WHERE r.dtFinOs = :dtFinOs"),
    @NamedQuery(name = "RegK210.findByCodDocOs", query = "SELECT r FROM RegK210 r WHERE r.codDocOs = :codDocOs"),
    @NamedQuery(name = "RegK210.findByCodItemOri", query = "SELECT r FROM RegK210 r WHERE r.codItemOri = :codItemOri"),
    @NamedQuery(name = "RegK210.findByQtdOri", query = "SELECT r FROM RegK210 r WHERE r.qtdOri = :qtdOri")})
public class RegK210 implements Serializable {

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
    @Column(name = "DT_INI_OS")
    @Temporal(TemporalType.DATE)
    private Date dtIniOs;
    @Column(name = "DT_FIN_OS")
    @Temporal(TemporalType.DATE)
    private Date dtFinOs;
    @Column(name = "COD_DOC_OS")
    private String codDocOs;
    @Column(name = "COD_ITEM_ORI")
    private String codItemOri;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_ORI")
    private BigDecimal qtdOri;

    public RegK210() {
    }

    public RegK210(Long id) {
        this.id = id;
    }

    public RegK210(Long id, long idPai, long linha, String hash) {
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

    public Date getDtIniOs() {
        return dtIniOs;
    }

    public void setDtIniOs(Date dtIniOs) {
        this.dtIniOs = dtIniOs;
    }

    public Date getDtFinOs() {
        return dtFinOs;
    }

    public void setDtFinOs(Date dtFinOs) {
        this.dtFinOs = dtFinOs;
    }

    public String getCodDocOs() {
        return codDocOs;
    }

    public void setCodDocOs(String codDocOs) {
        this.codDocOs = codDocOs;
    }

    public String getCodItemOri() {
        return codItemOri;
    }

    public void setCodItemOri(String codItemOri) {
        this.codItemOri = codItemOri;
    }

    public BigDecimal getQtdOri() {
        return qtdOri;
    }

    public void setQtdOri(BigDecimal qtdOri) {
        this.qtdOri = qtdOri;
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
        if (!(object instanceof RegK210)) {
            return false;
        }
        RegK210 other = (RegK210) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK210[ id=" + id + " ]";
    }

}
