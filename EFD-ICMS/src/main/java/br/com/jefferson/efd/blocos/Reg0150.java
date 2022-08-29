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
@Table(name = "reg_0150")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0150.findAll", query = "SELECT r FROM Reg0150 r"),
    @NamedQuery(name = "Reg0150.findById", query = "SELECT r FROM Reg0150 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0150.findByIdPai", query = "SELECT r FROM Reg0150 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0150.findByLinha", query = "SELECT r FROM Reg0150 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0150.findByHash", query = "SELECT r FROM Reg0150 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0150.findByReg", query = "SELECT r FROM Reg0150 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0150.findByCodPart", query = "SELECT r FROM Reg0150 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "Reg0150.findByNome", query = "SELECT r FROM Reg0150 r WHERE r.nome = :nome"),
    @NamedQuery(name = "Reg0150.findByCodPais", query = "SELECT r FROM Reg0150 r WHERE r.codPais = :codPais"),
    @NamedQuery(name = "Reg0150.findByCnpj", query = "SELECT r FROM Reg0150 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "Reg0150.findByCpf", query = "SELECT r FROM Reg0150 r WHERE r.cpf = :cpf"),
    @NamedQuery(name = "Reg0150.findByIe", query = "SELECT r FROM Reg0150 r WHERE r.ie = :ie"),
    @NamedQuery(name = "Reg0150.findByCodMun", query = "SELECT r FROM Reg0150 r WHERE r.codMun = :codMun"),
    @NamedQuery(name = "Reg0150.findBySuframa", query = "SELECT r FROM Reg0150 r WHERE r.suframa = :suframa"),
    @NamedQuery(name = "Reg0150.findByEndereco", query = "SELECT r FROM Reg0150 r WHERE r.endereco = :endereco"),
    @NamedQuery(name = "Reg0150.findByNum", query = "SELECT r FROM Reg0150 r WHERE r.num = :num"),
    @NamedQuery(name = "Reg0150.findByCompl", query = "SELECT r FROM Reg0150 r WHERE r.compl = :compl"),
    @NamedQuery(name = "Reg0150.findByBairro", query = "SELECT r FROM Reg0150 r WHERE r.bairro = :bairro")})
public class Reg0150 implements Serializable {

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
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "COD_PAIS")
    private String codPais;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "IE")
    private String ie;
    @Column(name = "COD_MUN")
    private String codMun;
    @Column(name = "SUFRAMA")
    private String suframa;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "NUM")
    private String num;
    @Column(name = "COMPL")
    private String compl;
    @Column(name = "BAIRRO")
    private String bairro;

    public Reg0150() {
    }

    public Reg0150(Long id) {
        this.id = id;
    }

    public Reg0150(Long id, long idPai, long linha, String hash) {
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

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
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

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reg0150)) {
            return false;
        }
        Reg0150 other = (Reg0150) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0150[ id=" + id + " ]";
    }

}
