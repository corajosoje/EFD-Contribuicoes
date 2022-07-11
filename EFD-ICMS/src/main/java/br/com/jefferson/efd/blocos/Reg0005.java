
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
@Table(name = "reg_0005")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0005.findAll", query = "SELECT r FROM Reg0005 r"),
    @NamedQuery(name = "Reg0005.findById", query = "SELECT r FROM Reg0005 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0005.findByIdPai", query = "SELECT r FROM Reg0005 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0005.findByLinha", query = "SELECT r FROM Reg0005 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0005.findByHash", query = "SELECT r FROM Reg0005 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0005.findByReg", query = "SELECT r FROM Reg0005 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0005.findByFantasia", query = "SELECT r FROM Reg0005 r WHERE r.fantasia = :fantasia"),
    @NamedQuery(name = "Reg0005.findByCep", query = "SELECT r FROM Reg0005 r WHERE r.cep = :cep"),
    @NamedQuery(name = "Reg0005.findByEndereco", query = "SELECT r FROM Reg0005 r WHERE r.endereco = :endereco"),
    @NamedQuery(name = "Reg0005.findByNum", query = "SELECT r FROM Reg0005 r WHERE r.num = :num"),
    @NamedQuery(name = "Reg0005.findByCompl", query = "SELECT r FROM Reg0005 r WHERE r.compl = :compl"),
    @NamedQuery(name = "Reg0005.findByBairro", query = "SELECT r FROM Reg0005 r WHERE r.bairro = :bairro"),
    @NamedQuery(name = "Reg0005.findByFone", query = "SELECT r FROM Reg0005 r WHERE r.fone = :fone"),
    @NamedQuery(name = "Reg0005.findByFax", query = "SELECT r FROM Reg0005 r WHERE r.fax = :fax"),
    @NamedQuery(name = "Reg0005.findByEmail", query = "SELECT r FROM Reg0005 r WHERE r.email = :email")})
public class Reg0005 implements Serializable {

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
    @Column(name = "FANTASIA")
    private String fantasia;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "NUM")
    private String num;
    @Column(name = "COMPL")
    private String compl;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "EMAIL")
    private String email;

    public Reg0005() {
    }

    public Reg0005(Long id) {
        this.id = id;
    }

    public Reg0005(Long id, long idPai, long linha, long hash) {
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

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Reg0005)) {
            return false;
        }
        Reg0005 other = (Reg0005) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0005[ id=" + id + " ]";
    }

}
