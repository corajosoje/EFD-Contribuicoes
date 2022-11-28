package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1900")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1900.findAll", query = "SELECT r FROM Reg1900 r"),
    @NamedQuery(name = "Reg1900.findById", query = "SELECT r FROM Reg1900 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1900.findByIdPai", query = "SELECT r FROM Reg1900 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1900.findByLinha", query = "SELECT r FROM Reg1900 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1900.findByHash", query = "SELECT r FROM Reg1900 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1900.findByReg", query = "SELECT r FROM Reg1900 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1900.findByIndApurIcms", query = "SELECT r FROM Reg1900 r WHERE r.indApurIcms = :indApurIcms"),
    @NamedQuery(name = "Reg1900.findByDescrComplOutApur", query = "SELECT r FROM Reg1900 r WHERE r.descrComplOutApur = :descrComplOutApur")})
@Registros(nivel = 2)
public class Reg1900 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    public Reg1001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1001) idPai;
    }

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
    @Column(name = "IND_APUR_ICMS")
    private String indApurIcms;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "DESCR_COMPL_OUT_APUR")
    private String descrComplOutApur;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1910> reg1910;

    public List<Reg1910> getReg1910() {
        return reg1910;
    }

    public void setReg1910(List<Reg1910> reg1910) {
        this.reg1910 = reg1910;
    }

    public Reg1900() {
    }

    public Reg1900(Long id) {
        this.id = id;
    }

    public Reg1900(Long id, Reg1001 idPai, long linha, String hash) {
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

    public String getIndApurIcms() {
        return indApurIcms;
    }

    public void setIndApurIcms(String indApurIcms) {
        this.indApurIcms = indApurIcms;
    }

    public String getDescrComplOutApur() {
        return descrComplOutApur;
    }

    public void setDescrComplOutApur(String descrComplOutApur) {
        this.descrComplOutApur = descrComplOutApur;
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
        if (!(object instanceof Reg1900)) {
            return false;
        }
        Reg1900 other = (Reg1900) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1900[ id=" + id + " ]";
    }

}
