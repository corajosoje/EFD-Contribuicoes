
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
@Table(name = "reg_c110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC110.findAll", query = "SELECT r FROM RegC110 r"),
    @NamedQuery(name = "RegC110.findById", query = "SELECT r FROM RegC110 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC110.findByIdPai", query = "SELECT r FROM RegC110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC110.findByLinha", query = "SELECT r FROM RegC110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC110.findByHash", query = "SELECT r FROM RegC110 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC110.findByReg", query = "SELECT r FROM RegC110 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC110.findByCodInf", query = "SELECT r FROM RegC110 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "RegC110.findByTxtCompl", query = "SELECT r FROM RegC110 r WHERE r.txtCompl = :txtCompl")})
public class RegC110 implements Serializable {

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
    @Column(name = "COD_INF")
    private String codInf;
    @Column(name = "TXT_COMPL")
    private String txtCompl;

    public RegC110() {
    }

    public RegC110(Long id) {
        this.id = id;
    }

    public RegC110(Long id, long idPai, long linha, String hash) {
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

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
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
        if (!(object instanceof RegC110)) {
            return false;
        }
        RegC110 other = (RegC110) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC110[ id=" + id + " ]";
    }

}
