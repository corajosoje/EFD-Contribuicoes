package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1990")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1990.findAll", query = "SELECT r FROM Reg1990 r"),
    @NamedQuery(name = "Reg1990.findById", query = "SELECT r FROM Reg1990 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1990.findByIdPai", query = "SELECT r FROM Reg1990 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1990.findByLinha", query = "SELECT r FROM Reg1990 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1990.findByHashfile", query = "SELECT r FROM Reg1990 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1990.findByReg", query = "SELECT r FROM Reg1990 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1990.findByQtdLin1", query = "SELECT r FROM Reg1990 r WHERE r.qtdLin1 = :qtdLin1")})
@Registros(nivel = 1)
public class Reg1990 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0000 idPai;

    @Override
    public Reg0000 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0000) idPai;
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
    @Column(name = "QTD_LIN_1")
    private int qtdLin1;

    public int getQtdLin1() {
        return this.qtdLin1;
    }

    public void setQtdLin1(int qtdLin1) {
        this.qtdLin1 = qtdLin1;
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
        final Reg1990 other = (Reg1990) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1990{" + "id=" + id + '}';
    }
}