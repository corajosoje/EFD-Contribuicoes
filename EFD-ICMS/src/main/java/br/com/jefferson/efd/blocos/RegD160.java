package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d160")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD160.findAll", query = "SELECT r FROM RegD160 r"),
    @NamedQuery(name = "RegD160.findById", query = "SELECT r FROM RegD160 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD160.findByIdPai", query = "SELECT r FROM RegD160 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD160.findByLinha", query = "SELECT r FROM RegD160 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD160.findByHashfile", query = "SELECT r FROM RegD160 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD160.findByReg", query = "SELECT r FROM RegD160 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD160.findByDespacho", query = "SELECT r FROM RegD160 r WHERE r.despacho = :despacho"),
    @NamedQuery(name = "RegD160.findByCnpjCpfRem", query = "SELECT r FROM RegD160 r WHERE r.cnpjCpfRem = :cnpjCpfRem"),
    @NamedQuery(name = "RegD160.findByIeRem", query = "SELECT r FROM RegD160 r WHERE r.ieRem = :ieRem"),
    @NamedQuery(name = "RegD160.findByCodMunOri", query = "SELECT r FROM RegD160 r WHERE r.codMunOri = :codMunOri"),
    @NamedQuery(name = "RegD160.findByCnpjCpfDest", query = "SELECT r FROM RegD160 r WHERE r.cnpjCpfDest = :cnpjCpfDest"),
    @NamedQuery(name = "RegD160.findByIeDest", query = "SELECT r FROM RegD160 r WHERE r.ieDest = :ieDest"),
    @NamedQuery(name = "RegD160.findByCodMunDest", query = "SELECT r FROM RegD160 r WHERE r.codMunDest = :codMunDest")})
@Registros(nivel = 3)
public class RegD160 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD100 idPai;

    public RegD100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD100) idPai;
    }

    public RegD160() {
    }

    public RegD160(String id) {
        this.id = id;
    }

    public RegD160(String id, RegD100 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegD161 regD161;

    public RegD161 getRegD161() {
        return regD161;
    }

    public void setRegD161(RegD161 regD161) {
        this.regD161 = regD161;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD162> regD162;

    public List<RegD162> getRegD162() {
        return regD162;
    }

    public void setRegD162(List<RegD162> regD162) {
        this.regD162 = regD162;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "DESPACHO")
    private String despacho;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CNPJ_CPF_REM")
    private String cnpjCpfRem;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "IE_REM")
    private String ieRem;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MUN_ORI")
    private String codMunOri;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CNPJ_CPF_DEST")
    private String cnpjCpfDest;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "IE_DEST")
    private String ieDest;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHashfile() {
        return hashfile;
    }

    public void setHash(String hashfile) {
        this.hashfile = hashfile;
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
