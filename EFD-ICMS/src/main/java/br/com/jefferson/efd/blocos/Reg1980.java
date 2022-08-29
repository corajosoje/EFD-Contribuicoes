
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
@Table(name = "reg_1980")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1980.findAll", query = "SELECT r FROM Reg1980 r"),
    @NamedQuery(name = "Reg1980.findById", query = "SELECT r FROM Reg1980 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1980.findByIdPai", query = "SELECT r FROM Reg1980 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1980.findByLinha", query = "SELECT r FROM Reg1980 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1980.findByHash", query = "SELECT r FROM Reg1980 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1980.findByReg", query = "SELECT r FROM Reg1980 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1980.findByIndAp", query = "SELECT r FROM Reg1980 r WHERE r.indAp = :indAp"),
    @NamedQuery(name = "Reg1980.findByG401", query = "SELECT r FROM Reg1980 r WHERE r.g401 = :g401"),
    @NamedQuery(name = "Reg1980.findByG402", query = "SELECT r FROM Reg1980 r WHERE r.g402 = :g402"),
    @NamedQuery(name = "Reg1980.findByG403", query = "SELECT r FROM Reg1980 r WHERE r.g403 = :g403"),
    @NamedQuery(name = "Reg1980.findByG404", query = "SELECT r FROM Reg1980 r WHERE r.g404 = :g404"),
    @NamedQuery(name = "Reg1980.findByG405", query = "SELECT r FROM Reg1980 r WHERE r.g405 = :g405"),
    @NamedQuery(name = "Reg1980.findByG406", query = "SELECT r FROM Reg1980 r WHERE r.g406 = :g406"),
    @NamedQuery(name = "Reg1980.findByG407", query = "SELECT r FROM Reg1980 r WHERE r.g407 = :g407"),
    @NamedQuery(name = "Reg1980.findByG408", query = "SELECT r FROM Reg1980 r WHERE r.g408 = :g408"),
    @NamedQuery(name = "Reg1980.findByG409", query = "SELECT r FROM Reg1980 r WHERE r.g409 = :g409"),
    @NamedQuery(name = "Reg1980.findByG410", query = "SELECT r FROM Reg1980 r WHERE r.g410 = :g410"),
    @NamedQuery(name = "Reg1980.findByG411", query = "SELECT r FROM Reg1980 r WHERE r.g411 = :g411"),
    @NamedQuery(name = "Reg1980.findByG412", query = "SELECT r FROM Reg1980 r WHERE r.g412 = :g412")})
public class Reg1980 implements Serializable {

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
    @Column(name = "IND_AP")
    private String indAp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "G4_01")
    private BigDecimal g401;
    @Column(name = "G4_02")
    private BigDecimal g402;
    @Column(name = "G4_03")
    private BigDecimal g403;
    @Column(name = "G4_04")
    private BigDecimal g404;
    @Column(name = "G4_05")
    private BigDecimal g405;
    @Column(name = "G4_06")
    private BigDecimal g406;
    @Column(name = "G4_07")
    private BigDecimal g407;
    @Column(name = "G4_08")
    private BigDecimal g408;
    @Column(name = "G4_09")
    private BigDecimal g409;
    @Column(name = "G4_10")
    private BigDecimal g410;
    @Column(name = "G4_11")
    private BigDecimal g411;
    @Column(name = "G4_12")
    private BigDecimal g412;

    public Reg1980() {
    }

    public Reg1980(Long id) {
        this.id = id;
    }

    public Reg1980(Long id, long idPai, long linha, String hash) {
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

    public String getIndAp() {
        return indAp;
    }

    public void setIndAp(String indAp) {
        this.indAp = indAp;
    }

    public BigDecimal getG401() {
        return g401;
    }

    public void setG401(BigDecimal g401) {
        this.g401 = g401;
    }

    public BigDecimal getG402() {
        return g402;
    }

    public void setG402(BigDecimal g402) {
        this.g402 = g402;
    }

    public BigDecimal getG403() {
        return g403;
    }

    public void setG403(BigDecimal g403) {
        this.g403 = g403;
    }

    public BigDecimal getG404() {
        return g404;
    }

    public void setG404(BigDecimal g404) {
        this.g404 = g404;
    }

    public BigDecimal getG405() {
        return g405;
    }

    public void setG405(BigDecimal g405) {
        this.g405 = g405;
    }

    public BigDecimal getG406() {
        return g406;
    }

    public void setG406(BigDecimal g406) {
        this.g406 = g406;
    }

    public BigDecimal getG407() {
        return g407;
    }

    public void setG407(BigDecimal g407) {
        this.g407 = g407;
    }

    public BigDecimal getG408() {
        return g408;
    }

    public void setG408(BigDecimal g408) {
        this.g408 = g408;
    }

    public BigDecimal getG409() {
        return g409;
    }

    public void setG409(BigDecimal g409) {
        this.g409 = g409;
    }

    public BigDecimal getG410() {
        return g410;
    }

    public void setG410(BigDecimal g410) {
        this.g410 = g410;
    }

    public BigDecimal getG411() {
        return g411;
    }

    public void setG411(BigDecimal g411) {
        this.g411 = g411;
    }

    public BigDecimal getG412() {
        return g412;
    }

    public void setG412(BigDecimal g412) {
        this.g412 = g412;
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
        if (!(object instanceof Reg1980)) {
            return false;
        }
        Reg1980 other = (Reg1980) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1980[ id=" + id + " ]";
    }

}
