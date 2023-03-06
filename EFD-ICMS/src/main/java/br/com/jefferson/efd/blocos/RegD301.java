package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d301")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD301.findAll", query = "SELECT r FROM RegD301 r"),
    @NamedQuery(name = "RegD301.findById", query = "SELECT r FROM RegD301 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD301.findByIdPai", query = "SELECT r FROM RegD301 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD301.findByLinha", query = "SELECT r FROM RegD301 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD301.findByHashfile", query = "SELECT r FROM RegD301 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD301.findByReg", query = "SELECT r FROM RegD301 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD301.findByNumDocCanc", query = "SELECT r FROM RegD301 r WHERE r.numDocCanc = :numDocCanc")})
@Registros(nivel = 3)
public class RegD301 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD300 idPai;

    public RegD300 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegD300) idPai;
    }

    public RegD301() {
    }

    public RegD301(String id) {
        this.id = id;
    }

    public RegD301(String id, RegD300 idPai, long linha, String hashfile) {
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
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "NUM_DOC_CANC")
    private int numDocCanc;

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

    public int getNumDocCanc() {
        return numDocCanc;
    }

    public void setNumDocCanc(int numDocCanc) {
        this.numDocCanc = numDocCanc;
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
        if (!(object instanceof RegD301)) {
            return false;
        }
        RegD301 other = (RegD301) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD301[ id=" + id + " ]";
    }

}
