
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
@Table(name = "reg_c175")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC175.findAll", query = "SELECT r FROM RegC175 r"),
    @NamedQuery(name = "RegC175.findById", query = "SELECT r FROM RegC175 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC175.findByIdPai", query = "SELECT r FROM RegC175 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC175.findByLinha", query = "SELECT r FROM RegC175 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC175.findByHash", query = "SELECT r FROM RegC175 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC175.findByReg", query = "SELECT r FROM RegC175 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC175.findByIndVeicOper", query = "SELECT r FROM RegC175 r WHERE r.indVeicOper = :indVeicOper"),
    @NamedQuery(name = "RegC175.findByCnpj", query = "SELECT r FROM RegC175 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "RegC175.findByUf", query = "SELECT r FROM RegC175 r WHERE r.uf = :uf"),
    @NamedQuery(name = "RegC175.findByChassiVeic", query = "SELECT r FROM RegC175 r WHERE r.chassiVeic = :chassiVeic")})
public class RegC175 implements Serializable {

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
    @Column(name = "IND_VEIC_OPER")
    private String indVeicOper;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "UF")
    private String uf;
    @Column(name = "CHASSI_VEIC")
    private String chassiVeic;

    public RegC175() {
    }

    public RegC175(Long id) {
        this.id = id;
    }

    public RegC175(Long id, long idPai, long linha, String hash) {
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

    public String getIndVeicOper() {
        return indVeicOper;
    }

    public void setIndVeicOper(String indVeicOper) {
        this.indVeicOper = indVeicOper;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getChassiVeic() {
        return chassiVeic;
    }

    public void setChassiVeic(String chassiVeic) {
        this.chassiVeic = chassiVeic;
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
        if (!(object instanceof RegC175)) {
            return false;
        }
        RegC175 other = (RegC175) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC175[ id=" + id + " ]";
    }

}
