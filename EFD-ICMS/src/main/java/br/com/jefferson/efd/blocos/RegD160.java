
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
@Table(name = "reg_d160")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD160.findAll", query = "SELECT r FROM RegD160 r"),
    @NamedQuery(name = "RegD160.findById", query = "SELECT r FROM RegD160 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD160.findByIdPai", query = "SELECT r FROM RegD160 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD160.findByLinha", query = "SELECT r FROM RegD160 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD160.findByHash", query = "SELECT r FROM RegD160 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegD160.findByReg", query = "SELECT r FROM RegD160 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD160.findByDespacho", query = "SELECT r FROM RegD160 r WHERE r.despacho = :despacho"),
    @NamedQuery(name = "RegD160.findByCnpjCpfRem", query = "SELECT r FROM RegD160 r WHERE r.cnpjCpfRem = :cnpjCpfRem"),
    @NamedQuery(name = "RegD160.findByIeRem", query = "SELECT r FROM RegD160 r WHERE r.ieRem = :ieRem"),
    @NamedQuery(name = "RegD160.findByCodMunOri", query = "SELECT r FROM RegD160 r WHERE r.codMunOri = :codMunOri"),
    @NamedQuery(name = "RegD160.findByCnpjCpfDest", query = "SELECT r FROM RegD160 r WHERE r.cnpjCpfDest = :cnpjCpfDest"),
    @NamedQuery(name = "RegD160.findByIeDest", query = "SELECT r FROM RegD160 r WHERE r.ieDest = :ieDest"),
    @NamedQuery(name = "RegD160.findByCodMunDest", query = "SELECT r FROM RegD160 r WHERE r.codMunDest = :codMunDest")})
public class RegD160 implements Serializable {

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
    @Column(name = "DESPACHO")
    private String despacho;
    @Column(name = "CNPJ_CPF_REM")
    private String cnpjCpfRem;
    @Column(name = "IE_REM")
    private String ieRem;
    @Column(name = "COD_MUN_ORI")
    private String codMunOri;
    @Column(name = "CNPJ_CPF_DEST")
    private String cnpjCpfDest;
    @Column(name = "IE_DEST")
    private String ieDest;
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;

    public RegD160() {
    }

    public RegD160(Long id) {
        this.id = id;
    }

    public RegD160(Long id, long idPai, long linha, String hash) {
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

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getCnpjCpfRem() {
        return cnpjCpfRem;
    }

    public void setCnpjCpfRem(String cnpjCpfRem) {
        this.cnpjCpfRem = cnpjCpfRem;
    }

    public String getIeRem() {
        return ieRem;
    }

    public void setIeRem(String ieRem) {
        this.ieRem = ieRem;
    }

    public String getCodMunOri() {
        return codMunOri;
    }

    public void setCodMunOri(String codMunOri) {
        this.codMunOri = codMunOri;
    }

    public String getCnpjCpfDest() {
        return cnpjCpfDest;
    }

    public void setCnpjCpfDest(String cnpjCpfDest) {
        this.cnpjCpfDest = cnpjCpfDest;
    }

    public String getIeDest() {
        return ieDest;
    }

    public void setIeDest(String ieDest) {
        this.ieDest = ieDest;
    }

    public String getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
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
        if (!(object instanceof RegD160)) {
            return false;
        }
        RegD160 other = (RegD160) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD160[ id=" + id + " ]";
    }

}
