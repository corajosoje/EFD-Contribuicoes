
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
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
@Table(name = "reg_1105")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1105.findAll", query = "SELECT r FROM Reg1105 r"),
    @NamedQuery(name = "Reg1105.findById", query = "SELECT r FROM Reg1105 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1105.findByIdPai", query = "SELECT r FROM Reg1105 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1105.findByLinha", query = "SELECT r FROM Reg1105 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1105.findByHash", query = "SELECT r FROM Reg1105 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1105.findByReg", query = "SELECT r FROM Reg1105 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1105.findByCodMod", query = "SELECT r FROM Reg1105 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "Reg1105.findBySer", query = "SELECT r FROM Reg1105 r WHERE r.ser = :ser"),
    @NamedQuery(name = "Reg1105.findByNumDoc", query = "SELECT r FROM Reg1105 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "Reg1105.findByChvNfe", query = "SELECT r FROM Reg1105 r WHERE r.chvNfe = :chvNfe"),
    @NamedQuery(name = "Reg1105.findByDtDoc", query = "SELECT r FROM Reg1105 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "Reg1105.findByCodItem", query = "SELECT r FROM Reg1105 r WHERE r.codItem = :codItem")})
public class Reg1105 implements Serializable {

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
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "SER")
    private String ser;
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "CHV_NFE")
    private String chvNfe;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "COD_ITEM")
    private String codItem;

    public Reg1105() {
    }

    public Reg1105(Long id) {
        this.id = id;
    }

    public Reg1105(Long id, long idPai, long linha, long hash) {
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

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reg1105)) {
            return false;
        }
        Reg1105 other = (Reg1105) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1105[ id=" + id + " ]";
    }

}
