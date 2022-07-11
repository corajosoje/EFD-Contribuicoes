
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
@Table(name = "reg_c105")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC105.findAll", query = "SELECT r FROM RegC105 r"),
    @NamedQuery(name = "RegC105.findById", query = "SELECT r FROM RegC105 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC105.findByIdPai", query = "SELECT r FROM RegC105 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC105.findByLinha", query = "SELECT r FROM RegC105 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC105.findByHash", query = "SELECT r FROM RegC105 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC105.findByReg", query = "SELECT r FROM RegC105 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC105.findByOper", query = "SELECT r FROM RegC105 r WHERE r.oper = :oper"),
    @NamedQuery(name = "RegC105.findByCodUf", query = "SELECT r FROM RegC105 r WHERE r.codUf = :codUf")})
public class RegC105 implements Serializable {

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
    @Column(name = "OPER")
    private String oper;
    @Column(name = "COD_UF")
    private String codUf;

    public RegC105() {
    }

    public RegC105(Long id) {
        this.id = id;
    }

    public RegC105(Long id, long idPai, long linha, long hash) {
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

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String getCodUf() {
        return codUf;
    }

    public void setCodUf(String codUf) {
        this.codUf = codUf;
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
        if (!(object instanceof RegC105)) {
            return false;
        }
        RegC105 other = (RegC105) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC105[ id=" + id + " ]";
    }

}
