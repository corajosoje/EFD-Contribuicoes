
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
@Table(name = "reg_1923")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1923.findAll", query = "SELECT r FROM Reg1923 r"),
    @NamedQuery(name = "Reg1923.findById", query = "SELECT r FROM Reg1923 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1923.findByIdPai", query = "SELECT r FROM Reg1923 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1923.findByLinha", query = "SELECT r FROM Reg1923 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1923.findByHash", query = "SELECT r FROM Reg1923 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1923.findByReg", query = "SELECT r FROM Reg1923 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1923.findByCodPart", query = "SELECT r FROM Reg1923 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "Reg1923.findByCodMod", query = "SELECT r FROM Reg1923 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "Reg1923.findBySer", query = "SELECT r FROM Reg1923 r WHERE r.ser = :ser"),
    @NamedQuery(name = "Reg1923.findBySub", query = "SELECT r FROM Reg1923 r WHERE r.sub = :sub"),
    @NamedQuery(name = "Reg1923.findByNumDoc", query = "SELECT r FROM Reg1923 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "Reg1923.findByDtDoc", query = "SELECT r FROM Reg1923 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "Reg1923.findByCodItem", query = "SELECT r FROM Reg1923 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "Reg1923.findByVlAjItem", query = "SELECT r FROM Reg1923 r WHERE r.vlAjItem = :vlAjItem"),
    @NamedQuery(name = "Reg1923.findByChvDoce", query = "SELECT r FROM Reg1923 r WHERE r.chvDoce = :chvDoce")})
public class Reg1923 implements Serializable {

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
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "SER")
    private String ser;
    @Column(name = "SUB")
    private String sub;
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "COD_ITEM")
    private String codItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_AJ_ITEM")
    private BigDecimal vlAjItem;
    @Column(name = "CHV_DOCE")
    private String chvDoce;

    public Reg1923() {
    }

    public Reg1923(Long id) {
        this.id = id;
    }

    public Reg1923(Long id, long idPai, long linha, long hash) {
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

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getVlAjItem() {
        return vlAjItem;
    }

    public void setVlAjItem(BigDecimal vlAjItem) {
        this.vlAjItem = vlAjItem;
    }

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
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
        if (!(object instanceof Reg1923)) {
            return false;
        }
        Reg1923 other = (Reg1923) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1923[ id=" + id + " ]";
    }

}
