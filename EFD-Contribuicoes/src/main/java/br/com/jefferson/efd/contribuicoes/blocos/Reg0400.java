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
@Table(name = "reg_0400")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0400.findAll", query = "SELECT r FROM Reg0400 r"),
    @NamedQuery(name = "Reg0400.findById", query = "SELECT r FROM Reg0400 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0400.findByIdPai", query = "SELECT r FROM Reg0400 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0400.findByLinha", query = "SELECT r FROM Reg0400 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0400.findByHashfile", query = "SELECT r FROM Reg0400 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0400.findByReg", query = "SELECT r FROM Reg0400 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0400.findByCodNat", query = "SELECT r FROM Reg0400 r WHERE r.codNat = :codNat"),
    @NamedQuery(name = "Reg0400.findByDescrNat", query = "SELECT r FROM Reg0400 r WHERE r.descrNat = :descrNat")})
@Registros(nivel = 3)
public class Reg0400 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0140 idPai;

    @Override
    public Reg0140 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0140) idPai;
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
    @Column(name = "COD_NAT")
    private String codNat;

    public String getCodNat() {
        return this.codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "DESCR_NAT")
    private String descrNat;

    public String getDescrNat() {
        return this.descrNat;
    }

    public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
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
        final Reg0400 other = (Reg0400) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0400{" + "id=" + id + '}';
    }
}
