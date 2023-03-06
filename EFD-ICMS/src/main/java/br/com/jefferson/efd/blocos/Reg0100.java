package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_0100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0100.findAll", query = "SELECT r FROM Reg0100 r"),
    @NamedQuery(name = "Reg0100.findById", query = "SELECT r FROM Reg0100 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0100.findByIdPai", query = "SELECT r FROM Reg0100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0100.findByLinha", query = "SELECT r FROM Reg0100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0100.findByHashfile", query = "SELECT r FROM Reg0100 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0100.findByReg", query = "SELECT r FROM Reg0100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0100.findByNome", query = "SELECT r FROM Reg0100 r WHERE r.nome = :nome"),
    @NamedQuery(name = "Reg0100.findByCpf", query = "SELECT r FROM Reg0100 r WHERE r.cpf = :cpf"),
    @NamedQuery(name = "Reg0100.findByCrc", query = "SELECT r FROM Reg0100 r WHERE r.crc = :crc"),
    @NamedQuery(name = "Reg0100.findByCnpj", query = "SELECT r FROM Reg0100 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "Reg0100.findByCep", query = "SELECT r FROM Reg0100 r WHERE r.cep = :cep"),
    @NamedQuery(name = "Reg0100.findByEndereco", query = "SELECT r FROM Reg0100 r WHERE r.endereco = :endereco"),
    @NamedQuery(name = "Reg0100.findByNum", query = "SELECT r FROM Reg0100 r WHERE r.num = :num"),
    @NamedQuery(name = "Reg0100.findByCompl", query = "SELECT r FROM Reg0100 r WHERE r.compl = :compl"),
    @NamedQuery(name = "Reg0100.findByBairro", query = "SELECT r FROM Reg0100 r WHERE r.bairro = :bairro"),
    @NamedQuery(name = "Reg0100.findByFone", query = "SELECT r FROM Reg0100 r WHERE r.fone = :fone"),
    @NamedQuery(name = "Reg0100.findByFax", query = "SELECT r FROM Reg0100 r WHERE r.fax = :fax"),
    @NamedQuery(name = "Reg0100.findByEmail", query = "SELECT r FROM Reg0100 r WHERE r.email = :email"),
    @NamedQuery(name = "Reg0100.findByCodMun", query = "SELECT r FROM Reg0100 r WHERE r.codMun = :codMun")})
@Registros(nivel = 2)
public class Reg0100 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "NOME")
    private String nome;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CPF")
    private String cpf;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CRC")
    private String crc;

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CEP")
    private String cep;

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "ENDERECO")
    private String endereco;

    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "NUM")
    private String num;

    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "COMPL")
    private String compl;

    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "BAIRRO")
    private String bairro;

    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "FONE")
    private String fone;

    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "FAX")
    private String fax;

    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "EMAIL")
    private String email;

    @Campos(posicao = 14, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;

    public Reg0100() {
    }

    public Reg0100(String id) {
        this.id = id;
    }

    public Reg0100(String id, Reg0001 idPai, long linha, String hashfile) {
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

    public Reg0001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
    }

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
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
        if (!(object instanceof Reg0100)) {
            return false;
        }
        Reg0100 other = (Reg0100) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0100[ id=" + id + " ]";
    }

}
