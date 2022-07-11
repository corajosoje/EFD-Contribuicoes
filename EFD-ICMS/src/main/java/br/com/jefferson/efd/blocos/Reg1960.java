
package br.com.jefferson.efd.blocos;

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
@Table(name = "reg_1960")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1960.findAll", query = "SELECT r FROM Reg1960 r"),
    @NamedQuery(name = "Reg1960.findById", query = "SELECT r FROM Reg1960 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1960.findByIdPai", query = "SELECT r FROM Reg1960 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1960.findByLinha", query = "SELECT r FROM Reg1960 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1960.findByHash", query = "SELECT r FROM Reg1960 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1960.findByReg", query = "SELECT r FROM Reg1960 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1960.findByIndAp", query = "SELECT r FROM Reg1960 r WHERE r.indAp = :indAp"),
    @NamedQuery(name = "Reg1960.findByG101", query = "SELECT r FROM Reg1960 r WHERE r.g101 = :g101"),
    @NamedQuery(name = "Reg1960.findByG102", query = "SELECT r FROM Reg1960 r WHERE r.g102 = :g102"),
    @NamedQuery(name = "Reg1960.findByG103", query = "SELECT r FROM Reg1960 r WHERE r.g103 = :g103"),
    @NamedQuery(name = "Reg1960.findByG104", query = "SELECT r FROM Reg1960 r WHERE r.g104 = :g104"),
    @NamedQuery(name = "Reg1960.findByG105", query = "SELECT r FROM Reg1960 r WHERE r.g105 = :g105"),
    @NamedQuery(name = "Reg1960.findByG106", query = "SELECT r FROM Reg1960 r WHERE r.g106 = :g106"),
    @NamedQuery(name = "Reg1960.findByG107", query = "SELECT r FROM Reg1960 r WHERE r.g107 = :g107"),
    @NamedQuery(name = "Reg1960.findByG108", query = "SELECT r FROM Reg1960 r WHERE r.g108 = :g108"),
    @NamedQuery(name = "Reg1960.findByG109", query = "SELECT r FROM Reg1960 r WHERE r.g109 = :g109"),
    @NamedQuery(name = "Reg1960.findByG110", query = "SELECT r FROM Reg1960 r WHERE r.g110 = :g110"),
    @NamedQuery(name = "Reg1960.findByG111", query = "SELECT r FROM Reg1960 r WHERE r.g111 = :g111")})
public class Reg1960 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
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
    private long hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "IND_AP")
    private String indAp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "G1_01")
    private BigDecimal g101;
    @Column(name = "G1_02")
    private BigDecimal g102;
    @Column(name = "G1_03")
    private BigDecimal g103;
    @Column(name = "G1_04")
    private BigDecimal g104;
    @Column(name = "G1_05")
    private BigDecimal g105;
    @Column(name = "G1_06")
    private BigDecimal g106;
    @Column(name = "G1_07")
    private BigDecimal g107;
    @Column(name = "G1_08")
    private BigDecimal g108;
    @Column(name = "G1_09")
    private BigDecimal g109;
    @Column(name = "G1_10")
    private BigDecimal g110;
    @Column(name = "G1_11")
    private BigDecimal g111;

    public Reg1960() {
    }

    public Reg1960(Long id) {
        this.id = id;
    }

    public Reg1960(Long id, long idPai, long linha, long hash) {
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

    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
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

    public BigDecimal getG101() {
        return g101;
    }

    public void setG101(BigDecimal g101) {
        this.g101 = g101;
    }

    public BigDecimal getG102() {
        return g102;
    }

    public void setG102(BigDecimal g102) {
        this.g102 = g102;
    }

    public BigDecimal getG103() {
        return g103;
    }

    public void setG103(BigDecimal g103) {
        this.g103 = g103;
    }

    public BigDecimal getG104() {
        return g104;
    }

    public void setG104(BigDecimal g104) {
        this.g104 = g104;
    }

    public BigDecimal getG105() {
        return g105;
    }

    public void setG105(BigDecimal g105) {
        this.g105 = g105;
    }

    public BigDecimal getG106() {
        return g106;
    }

    public void setG106(BigDecimal g106) {
        this.g106 = g106;
    }

    public BigDecimal getG107() {
        return g107;
    }

    public void setG107(BigDecimal g107) {
        this.g107 = g107;
    }

    public BigDecimal getG108() {
        return g108;
    }

    public void setG108(BigDecimal g108) {
        this.g108 = g108;
    }

    public BigDecimal getG109() {
        return g109;
    }

    public void setG109(BigDecimal g109) {
        this.g109 = g109;
    }

    public BigDecimal getG110() {
        return g110;
    }

    public void setG110(BigDecimal g110) {
        this.g110 = g110;
    }

    public BigDecimal getG111() {
        return g111;
    }

    public void setG111(BigDecimal g111) {
        this.g111 = g111;
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
        if (!(object instanceof Reg1960)) {
            return false;
        }
        Reg1960 other = (Reg1960) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1960[ id=" + id + " ]";
    }

}
