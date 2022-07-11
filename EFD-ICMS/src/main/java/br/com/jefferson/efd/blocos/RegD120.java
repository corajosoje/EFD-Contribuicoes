
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
@Table(name = "reg_d120")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD120.findAll", query = "SELECT r FROM RegD120 r"),
    @NamedQuery(name = "RegD120.findById", query = "SELECT r FROM RegD120 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD120.findByIdPai", query = "SELECT r FROM RegD120 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD120.findByLinha", query = "SELECT r FROM RegD120 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD120.findByHash", query = "SELECT r FROM RegD120 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD120.findByReg", query = "SELECT r FROM RegD120 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD120.findByCodMunOrig", query = "SELECT r FROM RegD120 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD120.findByCodMunDest", query = "SELECT r FROM RegD120 r WHERE r.codMunDest = :codMunDest"),
    @NamedQuery(name = "RegD120.findByVeicId", query = "SELECT r FROM RegD120 r WHERE r.veicId = :veicId"),
    @NamedQuery(name = "RegD120.findByUfId", query = "SELECT r FROM RegD120 r WHERE r.ufId = :ufId")})
public class RegD120 implements Serializable {

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
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Column(name = "VEIC_ID")
    private String veicId;
    @Column(name = "UF_ID")
    private String ufId;

    public RegD120() {
    }

    public RegD120(Long id) {
        this.id = id;
    }

    public RegD120(Long id, long idPai, long linha, long hash) {
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

    public String getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public String getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
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
        if (!(object instanceof RegD120)) {
            return false;
        }
        RegD120 other = (RegD120) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD120[ id=" + id + " ]";
    }

}
