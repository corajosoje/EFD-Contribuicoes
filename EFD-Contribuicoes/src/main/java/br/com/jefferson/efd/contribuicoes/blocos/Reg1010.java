package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1010")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1010.findAll", query = "SELECT r FROM Reg1010 r"),
    @NamedQuery(name = "Reg1010.findById", query = "SELECT r FROM Reg1010 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1010.findByIdPai", query = "SELECT r FROM Reg1010 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1010.findByLinha", query = "SELECT r FROM Reg1010 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1010.findByHashfile", query = "SELECT r FROM Reg1010 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1010.findByReg", query = "SELECT r FROM Reg1010 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1010.findByNumProc", query = "SELECT r FROM Reg1010 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "Reg1010.findByIdSecJud", query = "SELECT r FROM Reg1010 r WHERE r.idSecJud = :idSecJud"),
    @NamedQuery(name = "Reg1010.findByIdVara", query = "SELECT r FROM Reg1010 r WHERE r.idVara = :idVara"),
    @NamedQuery(name = "Reg1010.findByIndNatAcao", query = "SELECT r FROM Reg1010 r WHERE r.indNatAcao = :indNatAcao"),
    @NamedQuery(name = "Reg1010.findByDescDecJud", query = "SELECT r FROM Reg1010 r WHERE r.descDecJud = :descDecJud"),
    @NamedQuery(name = "Reg1010.findByDtSentJud", query = "SELECT r FROM Reg1010 r WHERE r.dtSentJud = :dtSentJud")})
@Registros(nivel = 2)
public class Reg1010 implements Serializable, BlocoSped {

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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1011> reg1011;

    public List<Reg1011> getReg1011() {
        return reg1011;
    }

    public void setReg1011(List<Reg1011> reg1011) {
        this.reg1011 = reg1011;
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
    @Column(name = "ID_SEC_JUD")
    private String idSecJud;

    public String getIdSecJud() {
        return this.idSecJud;
    }

    public void setIdSecJud(String idSecJud) {
        this.idSecJud = idSecJud;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "ID_VARA")
    private String idVara;

    public String getIdVara() {
        return this.idVara;
    }

    public void setIdVara(String idVara) {
        this.idVara = idVara;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "IND_NAT_ACAO")
    private String indNatAcao;

    public String getIndNatAcao() {
        return this.indNatAcao;
    }

    public void setIndNatAcao(String indNatAcao) {
        this.indNatAcao = indNatAcao;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "DESC_DEC_JUD")
    private String descDecJud;

    public String getDescDecJud() {
        return this.descDecJud;
    }

    public void setDescDecJud(String descDecJud) {
        this.descDecJud = descDecJud;
    }
    @Campos(posicao = 7, tipo = 'D')
    @Column(name = "DT_SENT_JUD")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtSentJud;

    public Date getDtSentJud() {
        return this.dtSentJud;
    }

    public void setDtSentJud(Date dtSentJud) {
        this.dtSentJud = dtSentJud;
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
        final Reg1010 other = (Reg1010) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1010{" + "id=" + id + '}';
    }
}
