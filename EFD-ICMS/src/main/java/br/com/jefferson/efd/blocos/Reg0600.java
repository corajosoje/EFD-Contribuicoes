package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
@Table(name = "reg_0600")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0600.findAll", query = "SELECT r FROM Reg0600 r"),
    @NamedQuery(name = "Reg0600.findById", query = "SELECT r FROM Reg0600 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0600.findByIdPai", query = "SELECT r FROM Reg0600 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0600.findByLinha", query = "SELECT r FROM Reg0600 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0600.findByHashfile", query = "SELECT r FROM Reg0600 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0600.findByReg", query = "SELECT r FROM Reg0600 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0600.findByDtAlt", query = "SELECT r FROM Reg0600 r WHERE r.dtAlt = :dtAlt"),
    @NamedQuery(name = "Reg0600.findByCodCcus", query = "SELECT r FROM Reg0600 r WHERE r.codCcus = :codCcus"),
    @NamedQuery(name = "Reg0600.findByCcus", query = "SELECT r FROM Reg0600 r WHERE r.ccus = :ccus")})
@Registros(nivel = 2)
public class Reg0600 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

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
    @Column(name = "COD_CCUS")
    private String codCcus;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CCUS")
    private String ccus;

    public Reg0600() {
    }

    public Reg0600(String id) {
        this.id = id;
    }

    public Reg0600(String id, Reg0001 idPai, long linha, String hashfile) {
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

    public Reg0001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
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

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getCcus() {
        return ccus;
    }

    public void setCcus(String ccus) {
        this.ccus = ccus;
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
        if (!(object instanceof Reg0600)) {
            return false;
        }
        Reg0600 other = (Reg0600) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0600[ id=" + id + " ]";
    }

}
