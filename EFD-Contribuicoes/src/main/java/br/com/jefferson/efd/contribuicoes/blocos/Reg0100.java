package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
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
    @NamedQuery(name = "Reg0100.findByEnder", query = "SELECT r FROM Reg0100 r WHERE r.ender = :ender"),
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    @Override
    public Reg0001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @PrePersist
    @Override
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Override
    public long getLinha() {
        return this.linha;
    }

    @Override
    public void setLinha(long linha) {
        this.linha = linha;
    }
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Override
    public String getHashfile() {
        return this.hashfile;
    }

    @Override
    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Override
    public String getReg() {
        return this.reg;
    }

    @Override
    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "NOME")
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CPF")
    private String cpf;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CRC")
    private String crc;

    public String getCrc() {
        return this.crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CEP")
    private String cep;

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "ENDER")
    private String ender;

    public String getEnder() {
        return this.ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "NUM")
    private String num;

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "COMPL")
    private String compl;

    public String getCompl() {
        return this.compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "BAIRRO")
    private String bairro;

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "FONE")
    private String fone;

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "FAX")
    private String fax;

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "EMAIL")
    private String email;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Campos(posicao = 14, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;

    public String getCodMun() {
        return this.codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reg0100 other = (Reg0100) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0100{" + "id=" + id + '}';
    }
}
