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
@Table(name = "reg_1310")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1310.findAll", query = "SELECT r FROM Reg1310 r"),
    @NamedQuery(name = "Reg1310.findById", query = "SELECT r FROM Reg1310 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1310.findByIdPai", query = "SELECT r FROM Reg1310 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1310.findByLinha", query = "SELECT r FROM Reg1310 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1310.findByHashfile", query = "SELECT r FROM Reg1310 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 3)
public class Reg1310 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1300 idPai;

    public Reg1300 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1300) idPai;
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
    @Column(name = "NUM_TANQUE")
    private String numTanque;
    @Campos(posicao = 3, tipo = 'R')
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTQ_ABERT", precision = 15, scale = 6)
    private BigDecimal estqAbert;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VOL_ENTR", precision = 15, scale = 6)
    private BigDecimal volEntr;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VOL_DISP", precision = 15, scale = 6)
    private BigDecimal volDisp;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VOL_SAIDAS", precision = 15, scale = 6)
    private BigDecimal volSaidas;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "ESTQ_ESCR", precision = 15, scale = 6)
    private BigDecimal estqEscr;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VAL_AJ_PERDA", precision = 15, scale = 6)
    private BigDecimal valAjPerda;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VAL_AJ_GANHO", precision = 15, scale = 6)
    private BigDecimal valAjGanho;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "FECH_FISICO", precision = 15, scale = 6)
    private BigDecimal fechFisico;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1320> reg1320;

    public List<Reg1320> getReg1320() {
        return reg1320;
    }

    public void setReg1320(List<Reg1320> reg1320) {
        this.reg1320 = reg1320;
    }

    public Reg1310() {
    }

    public Reg1310(String id) {
        this.id = id;
    }

    public Reg1310(String id, Reg1300 idPai, long linha, String hashfile) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
