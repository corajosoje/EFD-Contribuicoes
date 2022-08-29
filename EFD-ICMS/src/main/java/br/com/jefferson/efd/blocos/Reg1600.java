package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1600")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1500.findAll", query = "SELECT r FROM Reg1500 r"),
    @NamedQuery(name = "Reg1500.findById", query = "SELECT r FROM Reg1500 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1500.findByIdPai", query = "SELECT r FROM Reg1500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1500.findByLinha", query = "SELECT r FROM Reg1500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1500.findByHash", query = "SELECT r FROM Reg1500 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1500.findByReg", query = "SELECT r FROM Reg1500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1500.findByCodPart", query = "SELECT r FROM Reg1500 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "Reg1500.findByTotCredito", query = "SELECT r FROM Reg1500 r WHERE r.totCredito = :totCredito"),
    @NamedQuery(name = "Reg1500.findByTotDebito", query = "SELECT r FROM Reg1500 r WHERE r.totDebito = :totDebito")
})

public class Reg1600 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_PAI")
    private long idPai;
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "TOT_CREDITO ")
    private BigDecimal totCredito;
    @Column(name = "TOT_DEBITO")
    private BigDecimal totDebito;

    public Reg1600() {
    }

    public Reg1600(Long id) {
        this.id = id;
    }

    public Reg1600(Long id, long idPai, long linha, String hash) {
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

    public long getIdPai() {
        return idPai;
    }

    public void setIdPai(long idPai) {
        this.idPai = idPai;
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

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public BigDecimal getTotCredito() {
        return totCredito;
    }

    public void setTotCredito(BigDecimal totCredito) {
        this.totCredito = totCredito;
    }

    public BigDecimal getTotDebito() {
        return totDebito;
    }

    public void setTotDebito(BigDecimal totDebito) {
        this.totDebito = totDebito;
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
        if (!(object instanceof Reg1600)) {
            return false;
        }
        Reg1600 other = (Reg1600) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1500[ id=" + id + " ]";
    }

}
