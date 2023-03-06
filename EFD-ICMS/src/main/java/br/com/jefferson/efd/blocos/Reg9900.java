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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_9900")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg9900.findAll", query = "SELECT r FROM Reg9900 r"),
    @NamedQuery(name = "Reg9900.findById", query = "SELECT r FROM Reg9900 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg9900.findByIdPai", query = "SELECT r FROM Reg9900 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg9900.findByLinha", query = "SELECT r FROM Reg9900 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg9900.findByHashfile", query = "SELECT r FROM Reg9900 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg9900.findByReg", query = "SELECT r FROM Reg9900 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg9900.findByRegBlc", query = "SELECT r FROM Reg9900 r WHERE r.regBlc = :regBlc"),
    @NamedQuery(name = "Reg9900.findByQtdRegBlc", query = "SELECT r FROM Reg9900 r WHERE r.qtdRegBlc = :qtdRegBlc")})
@Registros(nivel = 2)
public class Reg9900 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg9001 idPai;

    public Reg9001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg9001) idPai;
    }

    public Reg9900() {
    }

    public Reg9900(String id) {
        this.id = id;
    }

    public Reg9900(String id, Reg9001 idPai, long linha, String hashfile) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
