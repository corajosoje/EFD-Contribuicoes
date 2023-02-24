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
@Table(name = "reg_1370")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1370.findAll", query = "SELECT r FROM Reg1370 r"),
    @NamedQuery(name = "Reg1370.findById", query = "SELECT r FROM Reg1370 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1370.findByIdPai", query = "SELECT r FROM Reg1370 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1370.findByLinha", query = "SELECT r FROM Reg1370 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1370.findByHashfile", query = "SELECT r FROM Reg1370 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1370.findByReg", query = "SELECT r FROM Reg1370 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1370.findByNumBico", query = "SELECT r FROM Reg1370 r WHERE r.numBico = :numBico"),
    @NamedQuery(name = "Reg1370.findByCodItem", query = "SELECT r FROM Reg1370 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "Reg1370.findByNumTanque", query = "SELECT r FROM Reg1370 r WHERE r.numTanque = :numTanque")})
@Registros(nivel = 3)
public class Reg1370 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1350 idPai;

    public Reg1350 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1350) idPai;
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
    @Column(name = "NUM_BICO")
    private int numBico;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "NUM_TANQUE")
    private String numTanque;

    public Reg1370() {
    }

    public Reg1370(Long id) {
        this.id = id;
    }

    public Reg1370(Long id, Reg1350 idPai, long linha, String hashfile) {
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

    public int getNumBico() {
        return numBico;
    }

    public void setNumBico(int numBico) {
        this.numBico = numBico;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getNumTanque() {
        return numTanque;
    }

    public void setNumTanque(String numTanque) {
        this.numTanque = numTanque;
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
        if (!(object instanceof Reg1370)) {
            return false;
        }
        Reg1370 other = (Reg1370) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1370[ id=" + id + " ]";
    }

}
