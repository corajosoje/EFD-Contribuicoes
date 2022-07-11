
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1200.findAll", query = "SELECT r FROM Reg1200 r"),
    @NamedQuery(name = "Reg1200.findById", query = "SELECT r FROM Reg1200 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1200.findByIdPai", query = "SELECT r FROM Reg1200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1200.findByLinha", query = "SELECT r FROM Reg1200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1200.findByHash", query = "SELECT r FROM Reg1200 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1200.findByReg", query = "SELECT r FROM Reg1200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1200.findByCodAjApur", query = "SELECT r FROM Reg1200 r WHERE r.codAjApur = :codAjApur"),
    @NamedQuery(name = "Reg1200.findBySldCred", query = "SELECT r FROM Reg1200 r WHERE r.sldCred = :sldCred"),
    @NamedQuery(name = "Reg1200.findByCredApr", query = "SELECT r FROM Reg1200 r WHERE r.credApr = :credApr"),
    @NamedQuery(name = "Reg1200.findByCredReceb", query = "SELECT r FROM Reg1200 r WHERE r.credReceb = :credReceb"),
    @NamedQuery(name = "Reg1200.findByCredUtil", query = "SELECT r FROM Reg1200 r WHERE r.credUtil = :credUtil"),
    @NamedQuery(name = "Reg1200.findBySldCredFim", query = "SELECT r FROM Reg1200 r WHERE r.sldCredFim = :sldCredFim")})
public class Reg1200 implements Serializable {

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
    @Column(name = "COD_AJ_APUR")
    private String codAjApur;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SLD_CRED")
    private BigDecimal sldCred;
    @Column(name = "CRED_APR")
    private BigDecimal credApr;
    @Column(name = "CRED_RECEB")
    private BigDecimal credReceb;
    @Column(name = "CRED_UTIL")
    private BigDecimal credUtil;
    @Column(name = "SLD_CRED_FIM")
    private BigDecimal sldCredFim;

    public Reg1200() {
    }

    public Reg1200(Long id) {
        this.id = id;
    }

    public Reg1200(Long id, long idPai, long linha, long hash) {
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

    public String getCodAjApur() {
        return codAjApur;
    }

    public void setCodAjApur(String codAjApur) {
        this.codAjApur = codAjApur;
    }

    public BigDecimal getSldCred() {
        return sldCred;
    }

    public void setSldCred(BigDecimal sldCred) {
        this.sldCred = sldCred;
    }

    public BigDecimal getCredApr() {
        return credApr;
    }

    public void setCredApr(BigDecimal credApr) {
        this.credApr = credApr;
    }

    public BigDecimal getCredReceb() {
        return credReceb;
    }

    public void setCredReceb(BigDecimal credReceb) {
        this.credReceb = credReceb;
    }

    public BigDecimal getCredUtil() {
        return credUtil;
    }

    public void setCredUtil(BigDecimal credUtil) {
        this.credUtil = credUtil;
    }

    public BigDecimal getSldCredFim() {
        return sldCredFim;
    }

    public void setSldCredFim(BigDecimal sldCredFim) {
        this.sldCredFim = sldCredFim;
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
        if (!(object instanceof Reg1200)) {
            return false;
        }
        Reg1200 other = (Reg1200) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1200[ id=" + id + " ]";
    }

}
