package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_0002")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0002.findAll", query = "SELECT r FROM Reg0002 r"),
    @NamedQuery(name = "Reg0002.findById", query = "SELECT r FROM Reg0002 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0002.findByIdPai", query = "SELECT r FROM Reg0002 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0002.findByLinha", query = "SELECT r FROM Reg0002 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0002.findByHashfile", query = "SELECT r FROM Reg0002 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0002.findByReg", query = "SELECT r FROM Reg0002 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0002.findByClasEstabInd", query = "SELECT r FROM Reg0002 r WHERE r.clasEstabInd = :clasEstabInd")})
@Registros(nivel = 2)
public class Reg0002 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
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

    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "CLAS_ESTAB_IND")
    private String clasEstabInd;

    public Reg0002() {
    }

    public Reg0002(String id) {
        this.id = id;
    }

    public Reg0002(String id, Reg0001 idPai, long linha, String hashfile) {
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

    public String getClasEstabInd() {
        return clasEstabInd;
    }

    public void setClasEstabInd(String clasEstabInd) {
        this.clasEstabInd = clasEstabInd;
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
        if (!(object instanceof Reg0002)) {
            return false;
        }
        Reg0002 other = (Reg0002) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0002[ id=" + id + " ]";
    }

}
