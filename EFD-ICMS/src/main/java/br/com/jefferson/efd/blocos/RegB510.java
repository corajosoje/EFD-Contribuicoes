package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_b510")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB510.findAll", query = "SELECT r FROM RegB510 r"),
    @NamedQuery(name = "RegB510.findById", query = "SELECT r FROM RegB510 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB510.findByIdPai", query = "SELECT r FROM RegB510 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB510.findByLinha", query = "SELECT r FROM RegB510 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB510.findByHash", query = "SELECT r FROM RegB510 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB510.findByReg", query = "SELECT r FROM RegB510 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB510.findByIndProf", query = "SELECT r FROM RegB510 r WHERE r.indProf = :indProf"),
    @NamedQuery(name = "RegB510.findByIndEsc", query = "SELECT r FROM RegB510 r WHERE r.indEsc = :indEsc"),
    @NamedQuery(name = "RegB510.findByIndSoc", query = "SELECT r FROM RegB510 r WHERE r.indSoc = :indSoc"),
    @NamedQuery(name = "RegB510.findByCpf", query = "SELECT r FROM RegB510 r WHERE r.cpf = :cpf"),
    @NamedQuery(name = "RegB510.findByNome", query = "SELECT r FROM RegB510 r WHERE r.nome = :nome")})
@Registros(nivel = 3)
public class RegB510 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegB500 idPai;

    public RegB500 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegB500) idPai;
    }

    public RegB510() {
    }

    public RegB510(Long id) {
        this.id = id;
    }

    public RegB510(Long id, RegB500 idPai, long linha, String hash) {
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
    @Column(name = "IND_PROF")
    private String indProf;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_ESC")
    private String indEsc;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "IND_SOC")
    private String indSoc;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CPF")
    private String cpf;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "NOME")
    private String nome;

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

    public String getIndProf() {
        return indProf;
    }

    public void setIndProf(String indProf) {
        this.indProf = indProf;
    }

    public String getIndEsc() {
        return indEsc;
    }

    public void setIndEsc(String indEsc) {
        this.indEsc = indEsc;
    }

    public String getIndSoc() {
        return indSoc;
    }

    public void setIndSoc(String indSoc) {
        this.indSoc = indSoc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (!(object instanceof RegB510)) {
            return false;
        }
        RegB510 other = (RegB510) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB510[ id=" + id + " ]";
    }

}
