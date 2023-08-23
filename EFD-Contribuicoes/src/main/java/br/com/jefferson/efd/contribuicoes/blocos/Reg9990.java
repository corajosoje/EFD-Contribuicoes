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
@Table(name = "reg_9990")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg9990.findAll", query = "SELECT r FROM Reg9990 r"),
    @NamedQuery(name = "Reg9990.findById", query = "SELECT r FROM Reg9990 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg9990.findByIdPai", query = "SELECT r FROM Reg9990 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg9990.findByLinha", query = "SELECT r FROM Reg9990 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg9990.findByHashfile", query = "SELECT r FROM Reg9990 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg9990.findByReg", query = "SELECT r FROM Reg9990 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg9990.findByQtdLin9", query = "SELECT r FROM Reg9990 r WHERE r.qtdLin9 = :qtdLin9")})
@Registros(nivel = 1)
public class Reg9990 implements Serializable, BlocoSped {

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
    @Column(name = "QTD_LIN_9")
    private int qtdLin9;

    public int getQtdLin9() {
        return this.qtdLin9;
    }

    public void setQtdLin9(int qtdLin9) {
        this.qtdLin9 = qtdLin9;
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
        final Reg9990 other = (Reg9990) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg9990{" + "id=" + id + '}';
    }
}
