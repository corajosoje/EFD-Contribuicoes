
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
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
@Table(name = "reg_1370")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1370.findAll", query = "SELECT r FROM Reg1370 r"),
    @NamedQuery(name = "Reg1370.findById", query = "SELECT r FROM Reg1370 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1370.findByIdPai", query = "SELECT r FROM Reg1370 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1370.findByLinha", query = "SELECT r FROM Reg1370 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1370.findByHash", query = "SELECT r FROM Reg1370 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1370.findByReg", query = "SELECT r FROM Reg1370 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1370.findByNumBico", query = "SELECT r FROM Reg1370 r WHERE r.numBico = :numBico"),
    @NamedQuery(name = "Reg1370.findByCodItem", query = "SELECT r FROM Reg1370 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "Reg1370.findByNumTanque", query = "SELECT r FROM Reg1370 r WHERE r.numTanque = :numTanque")})
public class Reg1370 implements Serializable {

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
    @Column(name = "NUM_BICO")
    private String numBico;
    @Column(name = "COD_ITEM")
    private String codItem;
    @Column(name = "NUM_TANQUE")
    private String numTanque;

    public Reg1370() {
    }

    public Reg1370(Long id) {
        this.id = id;
    }

    public Reg1370(Long id, long idPai, long linha, long hash) {
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

    public String getNumBico() {
        return numBico;
    }

    public void setNumBico(String numBico) {
        this.numBico = numBico;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getNumTanque() {
        return numTanque;
    }

    public void setNumTanque(String numTanque) {
        this.numTanque = numTanque;
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
        if (!(object instanceof Reg1370)) {
            return false;
        }
        Reg1370 other = (Reg1370) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1370[ id=" + id + " ]";
    }

}
