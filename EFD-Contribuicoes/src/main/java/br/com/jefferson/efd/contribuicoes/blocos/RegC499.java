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
@Table(name = "reg_c499")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC499.findAll", query = "SELECT r FROM RegC499 r"),
    @NamedQuery(name = "RegC499.findById", query = "SELECT r FROM RegC499 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC499.findByIdPai", query = "SELECT r FROM RegC499 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC499.findByLinha", query = "SELECT r FROM RegC499 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC499.findByHashfile", query = "SELECT r FROM RegC499 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC499.findByReg", query = "SELECT r FROM RegC499 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC499.findByNumProc", query = "SELECT r FROM RegC499 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "RegC499.findByIndProc", query = "SELECT r FROM RegC499 r WHERE r.indProc = :indProc")})
@Registros(nivel = 4)
public class RegC499 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC490 idPai;

    @Override
    public RegC490 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC490) idPai;
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
    @Column(name = "NUM_PROC")
    private String numProc;

    public String getNumProc() {
        return this.numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_PROC")
    private String indProc;

    public String getIndProc() {
        return this.indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
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
        final RegC499 other = (RegC499) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC499{" + "id=" + id + '}';
    }
}
