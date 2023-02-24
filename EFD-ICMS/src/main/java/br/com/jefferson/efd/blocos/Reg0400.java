package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
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
@Table(name = "reg_0400")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0400.findAll", query = "SELECT r FROM Reg0400 r"),
    @NamedQuery(name = "Reg0400.findById", query = "SELECT r FROM Reg0400 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0400.findByIdPai", query = "SELECT r FROM Reg0400 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0400.findByLinha", query = "SELECT r FROM Reg0400 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0400.findByHashfile", query = "SELECT r FROM Reg0400 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0400.findByReg", query = "SELECT r FROM Reg0400 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0400.findByCodNat", query = "SELECT r FROM Reg0400 r WHERE r.codNat = :codNat"),
    @NamedQuery(name = "Reg0400.findByDescrNat", query = "SELECT r FROM Reg0400 r WHERE r.descrNat = :descrNat")})
@Registros(nivel = 2)
public class Reg0400 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    public Reg0001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0001) idPai;
    }

    public Reg0400() {
    }

    public Reg0400(Long id) {
        this.id = id;
    }

    public Reg0400(Long id, Reg0001 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "COD_NAT")
    private String codNat;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "DESCR_NAT")
    private String descrNat;

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

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public String getDescrNat() {
        return descrNat;
    }

    public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
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
        if (!(object instanceof Reg0400)) {
            return false;
        }
        Reg0400 other = (Reg0400) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0400[ id=" + id + " ]";
    }

}
