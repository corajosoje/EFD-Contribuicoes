package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
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
@Table(name = "reg_0190")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0190.findAll", query = "SELECT r FROM Reg0190 r"),
    @NamedQuery(name = "Reg0190.findById", query = "SELECT r FROM Reg0190 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0190.findByIdPai", query = "SELECT r FROM Reg0190 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0190.findByLinha", query = "SELECT r FROM Reg0190 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0190.findByHashfile", query = "SELECT r FROM Reg0190 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0190.findByReg", query = "SELECT r FROM Reg0190 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0190.findByUnid", query = "SELECT r FROM Reg0190 r WHERE r.unid = :unid"),
    @NamedQuery(name = "Reg0190.findByDescr", query = "SELECT r FROM Reg0190 r WHERE r.descr = :descr")})
@Registros(nivel = 3)
public class Reg0190 implements Serializable, BlocoSped {

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
    @Column(name = "UNID")
    private String unid;

    public String getUnid() {
        return this.unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "DESCR")
    private String descr;

    public String getDescr() {
        return this.descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
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
        final Reg0190 other = (Reg0190) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0190{" + "id=" + id + '}';
    }
}
