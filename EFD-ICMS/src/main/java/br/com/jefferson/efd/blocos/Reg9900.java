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
@Table(name = "reg_9900")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg9900.findAll", query = "SELECT r FROM Reg9900 r"),
    @NamedQuery(name = "Reg9900.findById", query = "SELECT r FROM Reg9900 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg9900.findByIdPai", query = "SELECT r FROM Reg9900 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg9900.findByLinha", query = "SELECT r FROM Reg9900 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg9900.findByHash", query = "SELECT r FROM Reg9900 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg9900.findByReg", query = "SELECT r FROM Reg9900 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg9900.findByRegBlc", query = "SELECT r FROM Reg9900 r WHERE r.regBlc = :regBlc"),
    @NamedQuery(name = "Reg9900.findByQtdRegBlc", query = "SELECT r FROM Reg9900 r WHERE r.qtdRegBlc = :qtdRegBlc")})
@Registros(nivel = 2)
public class Reg9900 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg9001 idPai;

    public Reg9001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg9001) idPai;
    }

    public Reg9900() {
    }

    public Reg9900(Long id) {
        this.id = id;
    }

    public Reg9900(Long id, Reg9001 idPai, long linha, String hash) {
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
    @Column(name = "REG_BLC")
    private String regBlc;
    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "QTD_REG_BLC")
    private int qtdRegBlc;

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

    public String getRegBlc() {
        return regBlc;
    }

    public void setRegBlc(String regBlc) {
        this.regBlc = regBlc;
    }

    public int getQtdRegBlc() {
        return qtdRegBlc;
    }

    public void setQtdRegBlc(int qtdRegBlc) {
        this.qtdRegBlc = qtdRegBlc;
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
        if (!(object instanceof Reg9900)) {
            return false;
        }
        Reg9900 other = (Reg9900) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg9900[ id=" + id + " ]";
    }

}
