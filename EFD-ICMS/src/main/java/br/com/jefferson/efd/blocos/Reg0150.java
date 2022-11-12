package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Registros(nivel = 2)
public class Reg0150 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NOME")
    private String nome;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_PAIS")
    private String codPais;

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CPF")
    private String cpf;

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "IE")
    private String ie;

    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;

    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "SUFRAMA")
    private String suframa;

    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "ENDERECO")
    private String endereco;

    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "NUM")
    private String num;

    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "COMPL")
    private String compl;

    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "BAIRRO")
    private String bairro;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0175> reg0175;

    public Reg0150() {
    }

    public Reg0150(Long id) {
        this.id = id;
    }

    public Reg0150(Long id, Reg0001 idPai, long linha, String hash) {
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

    public Reg0001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0001) idPai;
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

    public List<Reg0175> getReg0175() {
        return reg0175;
    }

    public void setReg0175(List<Reg0175> reg0175) {
        this.reg0175 = reg0175;
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
