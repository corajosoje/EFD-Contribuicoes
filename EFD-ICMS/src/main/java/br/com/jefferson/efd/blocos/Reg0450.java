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
@Table(name = "reg_0450")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0450.findAll", query = "SELECT r FROM Reg0450 r"),
    @NamedQuery(name = "Reg0450.findById", query = "SELECT r FROM Reg0450 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0450.findByIdPai", query = "SELECT r FROM Reg0450 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0450.findByLinha", query = "SELECT r FROM Reg0450 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0450.findByHashfile", query = "SELECT r FROM Reg0450 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0450.findByReg", query = "SELECT r FROM Reg0450 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0450.findByCodInf", query = "SELECT r FROM Reg0450 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "Reg0450.findByTxt", query = "SELECT r FROM Reg0450 r WHERE r.txt = :txt")})
@Registros(nivel = 2)
public class Reg0450 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    public Reg0001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
    }

    public Reg0450() {
    }

    public Reg0450(String id) {
        this.id = id;
    }

    public Reg0450(String id, Reg0001 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_INF")
    private String codInf;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "TXT")
    private String txt;

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

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
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
        if (!(object instanceof Reg0450)) {
            return false;
        }
        Reg0450 other = (Reg0450) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0450[ id=" + id + " ]";
    }

}
