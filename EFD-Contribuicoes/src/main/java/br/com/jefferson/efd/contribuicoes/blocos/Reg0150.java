package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
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
@Table(name = "reg_0150")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0150.findAll", query = "SELECT r FROM Reg0150 r"),
    @NamedQuery(name = "Reg0150.findById", query = "SELECT r FROM Reg0150 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0150.findByIdPai", query = "SELECT r FROM Reg0150 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0150.findByLinha", query = "SELECT r FROM Reg0150 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0150.findByHashfile", query = "SELECT r FROM Reg0150 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0150.findByReg", query = "SELECT r FROM Reg0150 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0150.findByCodPart", query = "SELECT r FROM Reg0150 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "Reg0150.findByNome", query = "SELECT r FROM Reg0150 r WHERE r.nome = :nome"),
    @NamedQuery(name = "Reg0150.findByCodPais", query = "SELECT r FROM Reg0150 r WHERE r.codPais = :codPais"),
    @NamedQuery(name = "Reg0150.findByCnpj", query = "SELECT r FROM Reg0150 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "Reg0150.findByCpf", query = "SELECT r FROM Reg0150 r WHERE r.cpf = :cpf"),
    @NamedQuery(name = "Reg0150.findByIe", query = "SELECT r FROM Reg0150 r WHERE r.ie = :ie"),
    @NamedQuery(name = "Reg0150.findByCodMun", query = "SELECT r FROM Reg0150 r WHERE r.codMun = :codMun"),
    @NamedQuery(name = "Reg0150.findBySuframa", query = "SELECT r FROM Reg0150 r WHERE r.suframa = :suframa"),
    @NamedQuery(name = "Reg0150.findByEnder", query = "SELECT r FROM Reg0150 r WHERE r.ender = :ender"),
    @NamedQuery(name = "Reg0150.findByNum", query = "SELECT r FROM Reg0150 r WHERE r.num = :num"),
    @NamedQuery(name = "Reg0150.findByCompl", query = "SELECT r FROM Reg0150 r WHERE r.compl = :compl"),
    @NamedQuery(name = "Reg0150.findByBairro", query = "SELECT r FROM Reg0150 r WHERE r.bairro = :bairro")})
@Registros(nivel = 3)
public class Reg0150 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0140 idPai;

    @Override
    public Reg0140 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0140) idPai;
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
    @Column(name = "COD_PART")
    private String codPart;

    public String getCodPart() {
        return this.codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NOME")
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_PAIS")
    private String codPais;

    public String getCodPais() {
        return this.codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
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
    @Column(name = "CPF")
    private String cpf;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "IE")
    private String ie;

    public String getIe() {
        return this.ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;

    public String getCodMun() {
        return this.codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "SUFRAMA")
    private String suframa;

    public String getSuframa() {
        return this.suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "ENDER")
    private String ender;

    public String getEnder() {
        return this.ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "NUM")
    private String num;

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "COMPL")
    private String compl;

    public String getCompl() {
        return this.compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "BAIRRO")
    private String bairro;

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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
        final Reg0150 other = (Reg0150) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0150{" + "id=" + id + '}';
    }
}
