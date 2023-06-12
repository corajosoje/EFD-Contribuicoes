package br.com.jefferson.efd.contribuicoes.blocos;

import java.io.Serializable;
import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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

    @Override
    public Reg0001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
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

    public String getReg() {
        return this.reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_ALT")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAlt;

    public Date getDtAlt() {
        return this.dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_CCUS")
    private String codCcus;

    public String getCodCcus() {
        return this.codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CCUS")
    private String ccus;

    public String getCcus() {
        return this.ccus;
    }

    public void setCcus(String ccus) {
        this.ccus = ccus;
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
        final Reg0600 other = (Reg0600) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0600{" + "id=" + id + '}';
    }
}
