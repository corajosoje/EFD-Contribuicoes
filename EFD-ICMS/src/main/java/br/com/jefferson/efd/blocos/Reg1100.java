
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
@Table(name = "reg_1100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1100.findAll", query = "SELECT r FROM Reg1100 r"),
    @NamedQuery(name = "Reg1100.findById", query = "SELECT r FROM Reg1100 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1100.findByIdPai", query = "SELECT r FROM Reg1100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1100.findByLinha", query = "SELECT r FROM Reg1100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1100.findByHash", query = "SELECT r FROM Reg1100 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1100.findByReg", query = "SELECT r FROM Reg1100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1100.findByIndDoc", query = "SELECT r FROM Reg1100 r WHERE r.indDoc = :indDoc"),
    @NamedQuery(name = "Reg1100.findByNroDe", query = "SELECT r FROM Reg1100 r WHERE r.nroDe = :nroDe"),
    @NamedQuery(name = "Reg1100.findByDtDe", query = "SELECT r FROM Reg1100 r WHERE r.dtDe = :dtDe"),
    @NamedQuery(name = "Reg1100.findByNatExp", query = "SELECT r FROM Reg1100 r WHERE r.natExp = :natExp"),
    @NamedQuery(name = "Reg1100.findByNroRe", query = "SELECT r FROM Reg1100 r WHERE r.nroRe = :nroRe"),
    @NamedQuery(name = "Reg1100.findByDtRe", query = "SELECT r FROM Reg1100 r WHERE r.dtRe = :dtRe"),
    @NamedQuery(name = "Reg1100.findByChcEmb", query = "SELECT r FROM Reg1100 r WHERE r.chcEmb = :chcEmb"),
    @NamedQuery(name = "Reg1100.findByDtChc", query = "SELECT r FROM Reg1100 r WHERE r.dtChc = :dtChc"),
    @NamedQuery(name = "Reg1100.findByDtAvb", query = "SELECT r FROM Reg1100 r WHERE r.dtAvb = :dtAvb"),
    @NamedQuery(name = "Reg1100.findByTpChc", query = "SELECT r FROM Reg1100 r WHERE r.tpChc = :tpChc"),
    @NamedQuery(name = "Reg1100.findByPais", query = "SELECT r FROM Reg1100 r WHERE r.pais = :pais")})
public class Reg1100 implements Serializable {

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
    @Column(name = "IND_DOC")
    private String indDoc;
    @Column(name = "NRO_DE")
    private String nroDe;
    @Column(name = "DT_DE")
    @Temporal(TemporalType.DATE)
    private Date dtDe;
    @Column(name = "NAT_EXP")
    private String natExp;
    @Column(name = "NRO_RE")
    private String nroRe;
    @Column(name = "DT_RE")
    @Temporal(TemporalType.DATE)
    private Date dtRe;
    @Column(name = "CHC_EMB")
    private String chcEmb;
    @Column(name = "DT_CHC")
    @Temporal(TemporalType.DATE)
    private Date dtChc;
    @Column(name = "DT_AVB")
    @Temporal(TemporalType.DATE)
    private Date dtAvb;
    @Column(name = "TP_CHC")
    private String tpChc;
    @Column(name = "PAIS")
    private String pais;

    public Reg1100() {
    }

    public Reg1100(Long id) {
        this.id = id;
    }

    public Reg1100(Long id, long idPai, long linha, long hash) {
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

    public String getIndDoc() {
        return indDoc;
    }

    public void setIndDoc(String indDoc) {
        this.indDoc = indDoc;
    }

    public String getNroDe() {
        return nroDe;
    }

    public void setNroDe(String nroDe) {
        this.nroDe = nroDe;
    }

    public Date getDtDe() {
        return dtDe;
    }

    public void setDtDe(Date dtDe) {
        this.dtDe = dtDe;
    }

    public String getNatExp() {
        return natExp;
    }

    public void setNatExp(String natExp) {
        this.natExp = natExp;
    }

    public String getNroRe() {
        return nroRe;
    }

    public void setNroRe(String nroRe) {
        this.nroRe = nroRe;
    }

    public Date getDtRe() {
        return dtRe;
    }

    public void setDtRe(Date dtRe) {
        this.dtRe = dtRe;
    }

    public String getChcEmb() {
        return chcEmb;
    }

    public void setChcEmb(String chcEmb) {
        this.chcEmb = chcEmb;
    }

    public Date getDtChc() {
        return dtChc;
    }

    public void setDtChc(Date dtChc) {
        this.dtChc = dtChc;
    }

    public Date getDtAvb() {
        return dtAvb;
    }

    public void setDtAvb(Date dtAvb) {
        this.dtAvb = dtAvb;
    }

    public String getTpChc() {
        return tpChc;
    }

    public void setTpChc(String tpChc) {
        this.tpChc = tpChc;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
        if (!(object instanceof Reg1100)) {
            return false;
        }
        Reg1100 other = (Reg1100) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1100[ id=" + id + " ]";
    }

}
