package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1360")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1360.findAll", query = "SELECT r FROM Reg1360 r"),
    @NamedQuery(name = "Reg1360.findById", query = "SELECT r FROM Reg1360 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1360.findByIdPai", query = "SELECT r FROM Reg1360 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1360.findByLinha", query = "SELECT r FROM Reg1360 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1360.findByHashfile", query = "SELECT r FROM Reg1360 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1360.findByReg", query = "SELECT r FROM Reg1360 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1360.findByNumLacre", query = "SELECT r FROM Reg1360 r WHERE r.numLacre = :numLacre"),
    @NamedQuery(name = "Reg1360.findByDatAplicacao", query = "SELECT r FROM Reg1360 r WHERE r.dtAplicacao = :dtAplicacao")})
@Registros(nivel = 3)
public class Reg1360 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1350 idPai;

    public Reg1350 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1350) idPai;
    }

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "NUM_LACRE")
    private String numLacre;

    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_APLICACAO")
    @Temporal(TemporalType.DATE)
    private Date dtAplicacao;

    public Reg1360() {
    }

    public Reg1360(String id) {
        this.id = id;
    }

    public Reg1360(String id, Reg1350 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHashfile() {
        return hashfile;
    }

    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getNumLacre() {
        return numLacre;
    }

    public void setNumLacre(String numLacre) {
        this.numLacre = numLacre;
    }

    public Date getDtAplicacao() {
        return dtAplicacao;
    }

    public void setDtAplicacao(Date dtAplicacao) {
        this.dtAplicacao = dtAplicacao;
    }

    @Override
    public int hashCode() {
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reg1360)) {
            return false;
        }
        Reg1360 other = (Reg1360) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1360[ id=" + id + " ]";
    }

}
