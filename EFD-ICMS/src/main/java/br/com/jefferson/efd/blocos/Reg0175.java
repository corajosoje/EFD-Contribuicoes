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
@Table(name = "reg_0175")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0175.findAll", query = "SELECT r FROM Reg0175 r"),
    @NamedQuery(name = "Reg0175.findById", query = "SELECT r FROM Reg0175 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0175.findByIdPai", query = "SELECT r FROM Reg0175 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0175.findByLinha", query = "SELECT r FROM Reg0175 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0175.findByHashfile", query = "SELECT r FROM Reg0175 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0175.findByReg", query = "SELECT r FROM Reg0175 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0175.findByDtAlt", query = "SELECT r FROM Reg0175 r WHERE r.dtAlt = :dtAlt"),
    @NamedQuery(name = "Reg0175.findByNrCampo", query = "SELECT r FROM Reg0175 r WHERE r.nrCampo = :nrCampo"),
    @NamedQuery(name = "Reg0175.findByContAnt", query = "SELECT r FROM Reg0175 r WHERE r.contAnt = :contAnt")})
@Registros(nivel = 3)
public class Reg0175 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0150 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_ALT")
    @Temporal(TemporalType.DATE)
    private Date dtAlt;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NR_CAMPO")
    private String nrCampo;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CONT_ANT")
    private String contAnt;

    public Reg0175() {
    }

    public Reg0175(String id) {
        this.id = id;
    }

    public Reg0175(String id, Reg0150 idPai, long linha, String hashfile) {
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

    public Reg0150 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0150) idPai;
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

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getNrCampo() {
        return nrCampo;
    }

    public void setNrCampo(String nrCampo) {
        this.nrCampo = nrCampo;
    }

    public String getContAnt() {
        return contAnt;
    }

    public void setContAnt(String contAnt) {
        this.contAnt = contAnt;
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
        if (!(object instanceof Reg0175)) {
            return false;
        }
        Reg0175 other = (Reg0175) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0175[ id=" + id + " ]";
    }

}
