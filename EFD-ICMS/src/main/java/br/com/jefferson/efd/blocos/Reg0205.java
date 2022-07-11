
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
@Table(name = "reg_0205")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0205.findAll", query = "SELECT r FROM Reg0205 r"),
    @NamedQuery(name = "Reg0205.findById", query = "SELECT r FROM Reg0205 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0205.findByIdPai", query = "SELECT r FROM Reg0205 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0205.findByLinha", query = "SELECT r FROM Reg0205 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0205.findByHash", query = "SELECT r FROM Reg0205 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0205.findByReg", query = "SELECT r FROM Reg0205 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0205.findByDescrAntItem", query = "SELECT r FROM Reg0205 r WHERE r.descrAntItem = :descrAntItem"),
    @NamedQuery(name = "Reg0205.findByDtIni", query = "SELECT r FROM Reg0205 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "Reg0205.findByDtFim", query = "SELECT r FROM Reg0205 r WHERE r.dtFim = :dtFim"),
    @NamedQuery(name = "Reg0205.findByCodAntItem", query = "SELECT r FROM Reg0205 r WHERE r.codAntItem = :codAntItem")})
public class Reg0205 implements Serializable {

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
    @Column(name = "DESCR_ANT_ITEM")
    private String descrAntItem;
    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    private Date dtIni;
    @Column(name = "DT_FIM")
    @Temporal(TemporalType.DATE)
    private Date dtFim;
    @Column(name = "COD_ANT_ITEM")
    private String codAntItem;

    public Reg0205() {
    }

    public Reg0205(Long id) {
        this.id = id;
    }

    public Reg0205(Long id, long idPai, long linha, long hash) {
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

    public String getDescrAntItem() {
        return descrAntItem;
    }

    public void setDescrAntItem(String descrAntItem) {
        this.descrAntItem = descrAntItem;
    }

    public Date getDtIni() {
        return dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
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
        if (!(object instanceof Reg0205)) {
            return false;
        }
        Reg0205 other = (Reg0205) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0205[ id=" + id + " ]";
    }

}
