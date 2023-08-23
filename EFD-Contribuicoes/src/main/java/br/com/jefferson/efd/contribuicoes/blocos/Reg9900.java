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

    @Override
    public Reg9001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg9001) idPai;
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
    @Column(name = "REG_BLC")
    private String regBlc;

    public String getRegBlc() {
        return this.regBlc;
    }

    public void setRegBlc(String regBlc) {
        this.regBlc = regBlc;
    }
    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "QTD_REG_BLC")
    private int qtdRegBlc;

    public int getQtdRegBlc() {
        return this.qtdRegBlc;
    }

    public void setQtdRegBlc(int qtdRegBlc) {
        this.qtdRegBlc = qtdRegBlc;
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
        final Reg9900 other = (Reg9900) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg9900{" + "id=" + id + '}';
    }
}
