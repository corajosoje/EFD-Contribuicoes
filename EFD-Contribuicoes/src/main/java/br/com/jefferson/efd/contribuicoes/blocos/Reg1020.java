package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1020")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1020.findAll", query = "SELECT r FROM Reg1020 r"),
    @NamedQuery(name = "Reg1020.findById", query = "SELECT r FROM Reg1020 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1020.findByIdPai", query = "SELECT r FROM Reg1020 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1020.findByLinha", query = "SELECT r FROM Reg1020 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1020.findByHashfile", query = "SELECT r FROM Reg1020 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1020.findByReg", query = "SELECT r FROM Reg1020 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1020.findByNumProc", query = "SELECT r FROM Reg1020 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "Reg1020.findByIndNatAcao", query = "SELECT r FROM Reg1020 r WHERE r.indNatAcao = :indNatAcao"),
    @NamedQuery(name = "Reg1020.findByDtDecAdm", query = "SELECT r FROM Reg1020 r WHERE r.dtDecAdm = :dtDecAdm")})
@Registros(nivel = 2)
public class Reg1020 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    @Override
    public Reg1001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg1001) idPai;
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
    @Column(name = "IND_NAT_ACAO")
    private String indNatAcao;

    public String getIndNatAcao() {
        return this.indNatAcao;
    }

    public void setIndNatAcao(String indNatAcao) {
        this.indNatAcao = indNatAcao;
    }
    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_DEC_ADM")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDecAdm;

    public Date getDtDecAdm() {
        return this.dtDecAdm;
    }

    public void setDtDecAdm(Date dtDecAdm) {
        this.dtDecAdm = dtDecAdm;
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
        final Reg1020 other = (Reg1020) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1020{" + "id=" + id + '}';
    }
}
