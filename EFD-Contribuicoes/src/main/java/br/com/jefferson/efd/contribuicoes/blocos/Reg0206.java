package br.com.jefferson.efd.contribuicoes.blocos;

import java.io.Serializable;
import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
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
@Table(name = "reg_0206")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0206.findAll", query = "SELECT r FROM Reg0206 r"),
    @NamedQuery(name = "Reg0206.findById", query = "SELECT r FROM Reg0206 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0206.findByIdPai", query = "SELECT r FROM Reg0206 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0206.findByLinha", query = "SELECT r FROM Reg0206 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0206.findByHashfile", query = "SELECT r FROM Reg0206 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0206.findByReg", query = "SELECT r FROM Reg0206 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0206.findByCodComb", query = "SELECT r FROM Reg0206 r WHERE r.codComb = :codComb")})
@Registros(nivel = 4)
public class Reg0206 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0200 idPai;

    @Override
    public Reg0200 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0200) idPai;
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
    @Column(name = "COD_COMB")
    private String codComb;

    public String getCodComb() {
        return this.codComb;
    }

    public void setCodComb(String codComb) {
        this.codComb = codComb;
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
        final Reg0206 other = (Reg0206) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0206{" + "id=" + id + '}';
    }
}
