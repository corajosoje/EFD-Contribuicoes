package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1300.findAll", query = "SELECT r FROM Reg1300 r"),
    @NamedQuery(name = "Reg1300.findById", query = "SELECT r FROM Reg1300 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1300.findByIdPai", query = "SELECT r FROM Reg1300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1300.findByLinha", query = "SELECT r FROM Reg1300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1300.findByHashfile", query = "SELECT r FROM Reg1300 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1300.findByReg", query = "SELECT r FROM Reg1300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1300.findByCodItem", query = "SELECT r FROM Reg1300 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "Reg1300.findByDtFech", query = "SELECT r FROM Reg1300 r WHERE r.dtFech = :dtFech"),
    @NamedQuery(name = "Reg1300.findByEstqAbert", query = "SELECT r FROM Reg1300 r WHERE r.estqAbert = :estqAbert"),
    @NamedQuery(name = "Reg1300.findByVolEntr", query = "SELECT r FROM Reg1300 r WHERE r.volEntr = :volEntr"),
    @NamedQuery(name = "Reg1300.findByVolDisp", query = "SELECT r FROM Reg1300 r WHERE r.volDisp = :volDisp"),
    @NamedQuery(name = "Reg1300.findByVolSaidas", query = "SELECT r FROM Reg1300 r WHERE r.volSaidas = :volSaidas"),
    @NamedQuery(name = "Reg1300.findByEstqEscr", query = "SELECT r FROM Reg1300 r WHERE r.estqEscr = :estqEscr"),
    @NamedQuery(name = "Reg1300.findByValAjPerda", query = "SELECT r FROM Reg1300 r WHERE r.valAjPerda = :valAjPerda"),
    @NamedQuery(name = "Reg1300.findByValAjGanho", query = "SELECT r FROM Reg1300 r WHERE r.valAjGanho = :valAjGanho"),
    @NamedQuery(name = "Reg1300.findByFechFisico", query = "SELECT r FROM Reg1300 r WHERE r.fechFisico = :fechFisico")})

@Registros(nivel = 2)
public class Reg1300 implements Serializable {

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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 1, tipo = 'D')
    @Column(name = "DT_FECH")
    @Temporal(TemporalType.DATE)
    private Date dtFech;
    @Campos(posicao = 1, tipo = 'R')
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTQ_ABERT", precision = 15, scale = 6)
    private BigDecimal estqAbert;
    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "VOL_ENTR", precision = 15, scale = 6)
    private BigDecimal volEntr;
    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "VOL_DISP", precision = 15, scale = 6)
    private BigDecimal volDisp;
    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "VOL_SAIDAS", precision = 15, scale = 6)
    private BigDecimal volSaidas;
    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "ESTQ_ESCR", precision = 15, scale = 6)
    private BigDecimal estqEscr;
    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "VAL_AJ_PERDA", precision = 15, scale = 6)
    private BigDecimal valAjPerda;
    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "VAL_AJ_GANHO", precision = 15, scale = 6)
    private BigDecimal valAjGanho;
    @Campos(posicao = 1, tipo = 'R')
    @Column(name = "FECH_FISICO", precision = 15, scale = 6)
    private BigDecimal fechFisico;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1310> reg1310;

    public List<Reg1310> getReg1310() {
        return reg1310;
    }

    public void setReg1310(List<Reg1310> reg1310) {
        this.reg1310 = reg1310;
    }

    public Reg1300() {
    }

    public Reg1300(String id) {
        this.id = id;
    }

    public Reg1300(String id, Reg1001 idPai, long linha, String hashfile) {
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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public Date getDtFech() {
        return dtFech;
    }

    public void setDtFech(Date dtFech) {
        this.dtFech = dtFech;
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
        if (!(object instanceof Reg1300)) {
            return false;
        }
        Reg1300 other = (Reg1300) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1300[ id=" + id + " ]";
    }

}
