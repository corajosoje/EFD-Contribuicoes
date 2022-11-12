package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_0190")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0190.findAll", query = "SELECT r FROM Reg0190 r"),
    @NamedQuery(name = "Reg0190.findById", query = "SELECT r FROM Reg0190 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0190.findByIdPai", query = "SELECT r FROM Reg0190 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0190.findByLinha", query = "SELECT r FROM Reg0190 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0190.findByHash", query = "SELECT r FROM Reg0190 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0190.findByReg", query = "SELECT r FROM Reg0190 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0190.findByUnid", query = "SELECT r FROM Reg0190 r WHERE r.unid = :unid"),
    @NamedQuery(name = "Reg0190.findByDescr", query = "SELECT r FROM Reg0190 r WHERE r.descr = :descr")})
@Registros(nivel = 2)
public class Reg0190 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "UNID")
    private String unid;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "DESCR")
    private String descr;

    public Reg0190() {
    }

    public Reg0190(Long id) {
        this.id = id;
    }

    public Reg0190(Long id, Reg0001 idPai, long linha, String hash) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hash = hash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reg0001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0001) idPai;
    }

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reg0190)) {
            return false;
        }
        Reg0190 other = (Reg0190) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0190[ id=" + id + " ]";
    }

}
