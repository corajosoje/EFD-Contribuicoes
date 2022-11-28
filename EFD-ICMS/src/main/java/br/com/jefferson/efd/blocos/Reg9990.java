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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_9990")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg9990.findAll", query = "SELECT r FROM Reg9990 r"),
    @NamedQuery(name = "Reg9990.findById", query = "SELECT r FROM Reg9990 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg9990.findByIdPai", query = "SELECT r FROM Reg9990 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg9990.findByLinha", query = "SELECT r FROM Reg9990 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg9990.findByHash", query = "SELECT r FROM Reg9990 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg9990.findByReg", query = "SELECT r FROM Reg9990 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg9990.findByQtdLin9", query = "SELECT r FROM Reg9990 r WHERE r.qtdLin9 = :qtdLin9")})
@Registros(nivel = 1)
public class Reg9990 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0000 idPai;

    public Reg0000 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0000) idPai;
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "QTD_LIN_9")
    private int qtdLin9;

    public Reg9990() {
    }

    public Reg9990(Long id) {
        this.id = id;
    }

    public Reg9990(Long id, Reg0000 idPai, long linha, String hash) {
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

    public int getQtdLin9() {
        return qtdLin9;
    }

    public void setQtdLin9(int qtdLin9) {
        this.qtdLin9 = qtdLin9;
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
        if (!(object instanceof Reg9990)) {
            return false;
        }
        Reg9990 other = (Reg9990) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg9990[ id=" + id + " ]";
    }

}
