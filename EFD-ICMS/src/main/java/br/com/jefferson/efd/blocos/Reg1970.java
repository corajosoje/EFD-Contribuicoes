package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1970")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1970.findAll", query = "SELECT r FROM Reg1970 r"),
    @NamedQuery(name = "Reg1970.findById", query = "SELECT r FROM Reg1970 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1970.findByIdPai", query = "SELECT r FROM Reg1970 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1970.findByLinha", query = "SELECT r FROM Reg1970 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1970.findByHashfile", query = "SELECT r FROM Reg1970 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1970.findByReg", query = "SELECT r FROM Reg1970 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1970.findByIndAp", query = "SELECT r FROM Reg1970 r WHERE r.indAp = :indAp"),
    @NamedQuery(name = "Reg1970.findByG301", query = "SELECT r FROM Reg1970 r WHERE r.g301 = :g301"),
    @NamedQuery(name = "Reg1970.findByG302", query = "SELECT r FROM Reg1970 r WHERE r.g302 = :g302"),
    @NamedQuery(name = "Reg1970.findByG303", query = "SELECT r FROM Reg1970 r WHERE r.g303 = :g303"),
    @NamedQuery(name = "Reg1970.findByG304", query = "SELECT r FROM Reg1970 r WHERE r.g304 = :g304"),
    @NamedQuery(name = "Reg1970.findByG305", query = "SELECT r FROM Reg1970 r WHERE r.g305 = :g305"),
    @NamedQuery(name = "Reg1970.findByG306", query = "SELECT r FROM Reg1970 r WHERE r.g306 = :g306"),
    @NamedQuery(name = "Reg1970.findByG307", query = "SELECT r FROM Reg1970 r WHERE r.g307 = :g307"),
    @NamedQuery(name = "Reg1970.findByG3T", query = "SELECT r FROM Reg1970 r WHERE r.g3T = :g3T"),
    @NamedQuery(name = "Reg1970.findByG308", query = "SELECT r FROM Reg1970 r WHERE r.g308 = :g308"),
    @NamedQuery(name = "Reg1970.findByG309", query = "SELECT r FROM Reg1970 r WHERE r.g309 = :g309")})
@Registros(nivel = 2)
public class Reg1970 implements Serializable {

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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_AP")
    private String indAp;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "G3_01", precision = 15, scale = 6)
    private BigDecimal g301;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "G3_02", precision = 15, scale = 6)
    private BigDecimal g302;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "G3_03", precision = 15, scale = 6)
    private BigDecimal g303;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "G3_04", precision = 15, scale = 6)
    private BigDecimal g304;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "G3_05", precision = 15, scale = 6)
    private BigDecimal g305;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "G3_06", precision = 15, scale = 6)
    private BigDecimal g306;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "G3_07", precision = 15, scale = 6)
    private BigDecimal g307;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "G3_T", precision = 15, scale = 6)
    private BigDecimal g3T;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "G3_08", precision = 15, scale = 6)
    private BigDecimal g308;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "G3_09", precision = 15, scale = 6)
    private BigDecimal g309;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1975> reg1975;

    public List<Reg1975> getReg1975() {
        return reg1975;
    }

    public void setReg1975(List<Reg1975> reg1975) {
        this.reg1975 = reg1975;
    }

    public Reg1970() {
    }

    public Reg1970(String id) {
        this.id = id;
    }

    public Reg1970(String id, Reg1001 idPai, long linha, String hashfile) {
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

    public String getIndAp() {
        return indAp;
    }

    public void setIndAp(String indAp) {
        this.indAp = indAp;
    }

    public BigDecimal getG301() {
        return g301;
    }

    public void setG301(BigDecimal g301) {
        this.g301 = g301;
    }

    public BigDecimal getG302() {
        return g302;
    }

    public void setG302(BigDecimal g302) {
        this.g302 = g302;
    }

    public BigDecimal getG303() {
        return g303;
    }

    public void setG303(BigDecimal g303) {
        this.g303 = g303;
    }

    public BigDecimal getG304() {
        return g304;
    }

    public void setG304(BigDecimal g304) {
        this.g304 = g304;
    }

    public BigDecimal getG305() {
        return g305;
    }

    public void setG305(BigDecimal g305) {
        this.g305 = g305;
    }

    public BigDecimal getG306() {
        return g306;
    }

    public void setG306(BigDecimal g306) {
        this.g306 = g306;
    }

    public BigDecimal getG307() {
        return g307;
    }

    public void setG307(BigDecimal g307) {
        this.g307 = g307;
    }

    public BigDecimal getG3T() {
        return g3T;
    }

    public void setG3T(BigDecimal g3T) {
        this.g3T = g3T;
    }

    public BigDecimal getG308() {
        return g308;
    }

    public void setG308(BigDecimal g308) {
        this.g308 = g308;
    }

    public BigDecimal getG309() {
        return g309;
    }

    public void setG309(BigDecimal g309) {
        this.g309 = g309;
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
        if (!(object instanceof Reg1970)) {
            return false;
        }
        Reg1970 other = (Reg1970) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1970[ id=" + id + " ]";
    }

}
