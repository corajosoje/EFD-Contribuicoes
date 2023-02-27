package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
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
@Table(name = "reg_c310")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC310.findAll", query = "SELECT r FROM RegC310 r"),
    @NamedQuery(name = "RegC310.findById", query = "SELECT r FROM RegC310 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC310.findByIdPai", query = "SELECT r FROM RegC310 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC310.findByLinha", query = "SELECT r FROM RegC310 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC310.findByHashfile", query = "SELECT r FROM RegC310 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC310.findByReg", query = "SELECT r FROM RegC310 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC310.findByNumDocCanc", query = "SELECT r FROM RegC310 r WHERE r.numDocCanc = :numDocCanc")})
@Registros(nivel = 3)
public class RegC310 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC300 idPai;

    public RegC300 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC300) idPai;
    }

    public RegC310() {
    }

    public RegC310(String id) {
        this.id = id;
    }

    public RegC310(String id, RegC300 idPai, long linha, String hashfile) {
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
        if (!(object instanceof RegC310)) {
            return false;
        }
        RegC310 other = (RegC310) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC310[ id=" + id + " ]";
    }

}
