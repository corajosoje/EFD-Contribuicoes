package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.exceptions.BlocoException;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_9999")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg9999.findAll", query = "SELECT r FROM Reg9999 r"),
    @NamedQuery(name = "Reg9999.findById", query = "SELECT r FROM Reg9999 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg9999.findByLinha", query = "SELECT r FROM Reg9999 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg9999.findByHashfile", query = "SELECT r FROM Reg9999 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg9999.findByReg", query = "SELECT r FROM Reg9999 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg9999.findByQtdLin", query = "SELECT r FROM Reg9999 r WHERE r.qtdLin = :qtdLin")})
@Registros(nivel = 0)
public class Reg9999 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @Override
    public void setIdPai(BlocoSped idPai) {
        throw new BlocoException("Bloco não tem ID PAI");
    }

    @Override
    public BlocoSped getIdPai() {
        throw new BlocoException("Bloco não tem ID PAI");
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "QTD_LIN")
    private int qtdLin;

    public int getQtdLin() {
        return this.qtdLin;
    }

    public void setQtdLin(int qtdLin) {
        this.qtdLin = qtdLin;
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
        final Reg9999 other = (Reg9999) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg9999{" + "id=" + id + '}';
    }
}
