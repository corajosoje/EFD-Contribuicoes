package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "reg_1960")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1960.findAll", query = "SELECT r FROM Reg1960 r"),
    @NamedQuery(name = "Reg1960.findById", query = "SELECT r FROM Reg1960 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1960.findByIdPai", query = "SELECT r FROM Reg1960 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1960.findByLinha", query = "SELECT r FROM Reg1960 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1960.findByHashfile", query = "SELECT r FROM Reg1960 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 2)
public class Reg1960 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
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
    @Column(name = "HASHFILE")
    private String hashfile;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "IND_AP")
    private int indAp;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "G1_01", precision = 15, scale = 6)
    private BigDecimal g101;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "G1_02", precision = 15, scale = 6)
    private BigDecimal g102;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "G1_03", precision = 15, scale = 6)
    private BigDecimal g103;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "G1_04", precision = 15, scale = 6)
    private BigDecimal g104;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "G1_05", precision = 15, scale = 6)
    private BigDecimal g105;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "G1_06", precision = 15, scale = 6)
    private BigDecimal g106;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "G1_07", precision = 15, scale = 6)
    private BigDecimal g107;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "G1_08", precision = 15, scale = 6)
    private BigDecimal g108;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "G1_09", precision = 15, scale = 6)
    private BigDecimal g109;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "G1_10", precision = 15, scale = 6)
    private BigDecimal g110;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "G1_11", precision = 15, scale = 6)
    private BigDecimal g111;

    public Reg1960() {
    }

    public Reg1960(String id) {
        this.id = id;
    }

    public Reg1960(String id, Reg1001 idPai, long linha, String hashfile) {
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

    public int getIndAp() {
        return indAp;
    }

    public void setIndAp(int indAp) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
