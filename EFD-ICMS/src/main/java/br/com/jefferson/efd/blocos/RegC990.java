
package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_c990")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC990.findAll", query = "SELECT r FROM RegC990 r"),
    @NamedQuery(name = "RegC990.findById", query = "SELECT r FROM RegC990 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC990.findByIdPai", query = "SELECT r FROM RegC990 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC990.findByLinha", query = "SELECT r FROM RegC990 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC990.findByHash", query = "SELECT r FROM RegC990 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC990.findByReg", query = "SELECT r FROM RegC990 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC990.findByQtdLinC", query = "SELECT r FROM RegC990 r WHERE r.qtdLinC = :qtdLinC")})
public class RegC990 implements Serializable {

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
    @Column(name = "QTD_LIN_C")
    private String qtdLinC;

    public RegC990() {
    }

    public RegC990(Long id) {
        this.id = id;
    }

    public RegC990(Long id, long idPai, long linha, String hash) {
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

    public String getQtdLinC() {
        return qtdLinC;
    }

    public void setQtdLinC(String qtdLinC) {
        this.qtdLinC = qtdLinC;
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
        if (!(object instanceof RegC990)) {
            return false;
        }
        RegC990 other = (RegC990) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC990[ id=" + id + " ]";
    }

}
