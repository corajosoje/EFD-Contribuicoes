
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
@Table(name = "reg_1310")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1310.findAll", query = "SELECT r FROM Reg1310 r"),
    @NamedQuery(name = "Reg1310.findById", query = "SELECT r FROM Reg1310 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1310.findByIdPai", query = "SELECT r FROM Reg1310 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1310.findByLinha", query = "SELECT r FROM Reg1310 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1310.findByHash", query = "SELECT r FROM Reg1310 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1310.findByReg", query = "SELECT r FROM Reg1310 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1310.findByNumTanque", query = "SELECT r FROM Reg1310 r WHERE r.numTanque = :numTanque"),
    @NamedQuery(name = "Reg1310.findByEstqAbert", query = "SELECT r FROM Reg1310 r WHERE r.estqAbert = :estqAbert"),
    @NamedQuery(name = "Reg1310.findByVolEntr", query = "SELECT r FROM Reg1310 r WHERE r.volEntr = :volEntr"),
    @NamedQuery(name = "Reg1310.findByVolDisp", query = "SELECT r FROM Reg1310 r WHERE r.volDisp = :volDisp"),
    @NamedQuery(name = "Reg1310.findByVolSaidas", query = "SELECT r FROM Reg1310 r WHERE r.volSaidas = :volSaidas"),
    @NamedQuery(name = "Reg1310.findByEstqEscr", query = "SELECT r FROM Reg1310 r WHERE r.estqEscr = :estqEscr"),
    @NamedQuery(name = "Reg1310.findByValAjPerda", query = "SELECT r FROM Reg1310 r WHERE r.valAjPerda = :valAjPerda"),
    @NamedQuery(name = "Reg1310.findByValAjGanho", query = "SELECT r FROM Reg1310 r WHERE r.valAjGanho = :valAjGanho"),
    @NamedQuery(name = "Reg1310.findByFechFisico", query = "SELECT r FROM Reg1310 r WHERE r.fechFisico = :fechFisico")})
public class Reg1310 implements Serializable {

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
    @Column(name = "NUM_TANQUE")
    private String numTanque;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTQ_ABERT")
    private BigDecimal estqAbert;
    @Column(name = "VOL_ENTR")
    private BigDecimal volEntr;
    @Column(name = "VOL_DISP")
    private BigDecimal volDisp;
    @Column(name = "VOL_SAIDAS")
    private BigDecimal volSaidas;
    @Column(name = "ESTQ_ESCR")
    private BigDecimal estqEscr;
    @Column(name = "VAL_AJ_PERDA")
    private BigDecimal valAjPerda;
    @Column(name = "VAL_AJ_GANHO")
    private BigDecimal valAjGanho;
    @Column(name = "FECH_FISICO")
    private BigDecimal fechFisico;

    public Reg1310() {
    }

    public Reg1310(Long id) {
        this.id = id;
    }

    public Reg1310(Long id, long idPai, long linha, String hash) {
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

    public String getNumTanque() {
        return numTanque;
    }

    public void setNumTanque(String numTanque) {
        this.numTanque = numTanque;
    }

    public BigDecimal getEstqAbert() {
        return estqAbert;
    }

    public void setEstqAbert(BigDecimal estqAbert) {
        this.estqAbert = estqAbert;
    }

    public BigDecimal getVolEntr() {
        return volEntr;
    }

    public void setVolEntr(BigDecimal volEntr) {
        this.volEntr = volEntr;
    }

    public BigDecimal getVolDisp() {
        return volDisp;
    }

    public void setVolDisp(BigDecimal volDisp) {
        this.volDisp = volDisp;
    }

    public BigDecimal getVolSaidas() {
        return volSaidas;
    }

    public void setVolSaidas(BigDecimal volSaidas) {
        this.volSaidas = volSaidas;
    }

    public BigDecimal getEstqEscr() {
        return estqEscr;
    }

    public void setEstqEscr(BigDecimal estqEscr) {
        this.estqEscr = estqEscr;
    }

    public BigDecimal getValAjPerda() {
        return valAjPerda;
    }

    public void setValAjPerda(BigDecimal valAjPerda) {
        this.valAjPerda = valAjPerda;
    }

    public BigDecimal getValAjGanho() {
        return valAjGanho;
    }

    public void setValAjGanho(BigDecimal valAjGanho) {
        this.valAjGanho = valAjGanho;
    }

    public BigDecimal getFechFisico() {
        return fechFisico;
    }

    public void setFechFisico(BigDecimal fechFisico) {
        this.fechFisico = fechFisico;
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
        if (!(object instanceof Reg1310)) {
            return false;
        }
        Reg1310 other = (Reg1310) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1310[ id=" + id + " ]";
    }

}
