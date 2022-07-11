
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
@Table(name = "reg_0000")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0000.findAll", query = "SELECT r FROM Reg0000 r"),
    @NamedQuery(name = "Reg0000.findById", query = "SELECT r FROM Reg0000 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0000.findByIdPai", query = "SELECT r FROM Reg0000 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0000.findByLinha", query = "SELECT r FROM Reg0000 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0000.findByHash", query = "SELECT r FROM Reg0000 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0000.findByReg", query = "SELECT r FROM Reg0000 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0000.findByCodVer", query = "SELECT r FROM Reg0000 r WHERE r.codVer = :codVer"),
    @NamedQuery(name = "Reg0000.findByCodFin", query = "SELECT r FROM Reg0000 r WHERE r.codFin = :codFin"),
    @NamedQuery(name = "Reg0000.findByDtIni", query = "SELECT r FROM Reg0000 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "Reg0000.findByDtFin", query = "SELECT r FROM Reg0000 r WHERE r.dtFin = :dtFin"),
    @NamedQuery(name = "Reg0000.findByNome", query = "SELECT r FROM Reg0000 r WHERE r.nome = :nome"),
    @NamedQuery(name = "Reg0000.findByCnpj", query = "SELECT r FROM Reg0000 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "Reg0000.findByCpf", query = "SELECT r FROM Reg0000 r WHERE r.cpf = :cpf"),
    @NamedQuery(name = "Reg0000.findByUf", query = "SELECT r FROM Reg0000 r WHERE r.uf = :uf"),
    @NamedQuery(name = "Reg0000.findByIe", query = "SELECT r FROM Reg0000 r WHERE r.ie = :ie"),
    @NamedQuery(name = "Reg0000.findByCodMun", query = "SELECT r FROM Reg0000 r WHERE r.codMun = :codMun"),
    @NamedQuery(name = "Reg0000.findByIm", query = "SELECT r FROM Reg0000 r WHERE r.im = :im"),
    @NamedQuery(name = "Reg0000.findBySuframa", query = "SELECT r FROM Reg0000 r WHERE r.suframa = :suframa"),
    @NamedQuery(name = "Reg0000.findByIndPerfil", query = "SELECT r FROM Reg0000 r WHERE r.indPerfil = :indPerfil"),
    @NamedQuery(name = "Reg0000.findByIndAtiv", query = "SELECT r FROM Reg0000 r WHERE r.indAtiv = :indAtiv")})
public class Reg0000 implements Serializable {

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
    @Column(name = "COD_VER")
    private String codVer;
    @Column(name = "COD_FIN")
    private String codFin;
    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    private Date dtIni;
    @Column(name = "DT_FIN")
    @Temporal(TemporalType.DATE)
    private Date dtFin;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "UF")
    private String uf;
    @Column(name = "IE")
    private String ie;
    @Column(name = "COD_MUN")
    private String codMun;
    @Column(name = "IM")
    private String im;
    @Column(name = "SUFRAMA")
    private String suframa;
    @Column(name = "IND_PERFIL")
    private String indPerfil;
    @Column(name = "IND_ATIV")
    private String indAtiv;

    public Reg0000() {
    }

    public Reg0000(Long id) {
        this.id = id;
    }

    public Reg0000(Long id, long idPai, long linha, long hash) {
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

    public String getCodVer() {
        return codVer;
    }

    public void setCodVer(String codVer) {
        this.codVer = codVer;
    }

    public String getCodFin() {
        return codFin;
    }

    public void setCodFin(String codFin) {
        this.codFin = codFin;
    }

    public Date getDtIni() {
        return dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    public Date getDtFin() {
        return dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getIndPerfil() {
        return indPerfil;
    }

    public void setIndPerfil(String indPerfil) {
        this.indPerfil = indPerfil;
    }

    public String getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
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
        if (!(object instanceof Reg0000)) {
            return false;
        }
        Reg0000 other = (Reg0000) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0000[ id=" + id + " ]";
    }

}
