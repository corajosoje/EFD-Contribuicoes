package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "reg_1320")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1320.findAll", query = "SELECT r FROM Reg1320 r"),
    @NamedQuery(name = "Reg1320.findById", query = "SELECT r FROM Reg1320 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1320.findByIdPai", query = "SELECT r FROM Reg1320 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1320.findByLinha", query = "SELECT r FROM Reg1320 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1320.findByHash", query = "SELECT r FROM Reg1320 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1320.findByReg", query = "SELECT r FROM Reg1320 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1320.findByNumBico", query = "SELECT r FROM Reg1320 r WHERE r.numBico = :numBico"),
    @NamedQuery(name = "Reg1320.findByNrInterv", query = "SELECT r FROM Reg1320 r WHERE r.nrInterv = :nrInterv"),
    @NamedQuery(name = "Reg1320.findByMotInterv", query = "SELECT r FROM Reg1320 r WHERE r.motInterv = :motInterv"),
    @NamedQuery(name = "Reg1320.findByNomInterv", query = "SELECT r FROM Reg1320 r WHERE r.nomInterv = :nomInterv"),
    @NamedQuery(name = "Reg1320.findByCnpjInterv", query = "SELECT r FROM Reg1320 r WHERE r.cnpjInterv = :cnpjInterv"),
    @NamedQuery(name = "Reg1320.findByCpfInterv", query = "SELECT r FROM Reg1320 r WHERE r.cpfInterv = :cpfInterv"),
    @NamedQuery(name = "Reg1320.findByValFecha", query = "SELECT r FROM Reg1320 r WHERE r.valFecha = :valFecha"),
    @NamedQuery(name = "Reg1320.findByValAbert", query = "SELECT r FROM Reg1320 r WHERE r.valAbert = :valAbert"),
    @NamedQuery(name = "Reg1320.findByVolAferi", query = "SELECT r FROM Reg1320 r WHERE r.volAferi = :volAferi"),
    @NamedQuery(name = "Reg1320.findByVolVendas", query = "SELECT r FROM Reg1320 r WHERE r.volVendas = :volVendas")})
@Registros(nivel = 4)
public class Reg1320 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1310 idPai;

    public Reg1310 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1310) idPai;
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
    @Column(name = "NUM_BICO")
    private int numBico;
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "NR_INTERV")
    private int nrInterv;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "MOT_INTERV")
    private String motInterv;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "NOM_INTERV")
    private String nomInterv;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CNPJ_INTERV")
    private String cnpjInterv;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CPF_INTERV")
    private String cpfInterv;
    @Campos(posicao = 7, tipo = 'R')
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VAL_FECHA")
    private BigDecimal valFecha;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VAL_ABERT")
    private BigDecimal valAbert;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VOL_AFERI")
    private BigDecimal volAferi;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VOL_VENDAS")
    private BigDecimal volVendas;

    public Reg1320() {
    }

    public Reg1320(Long id) {
        this.id = id;
    }

    public Reg1320(Long id, Reg1310 idPai, long linha, String hash) {
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

    public int getNumBico() {
        return numBico;
    }

    public void setNumBico(int numBico) {
        this.numBico = numBico;
    }

    public int getNrInterv() {
        return nrInterv;
    }

    public void setNrInterv(int nrInterv) {
        this.nrInterv = nrInterv;
    }

    public String getMotInterv() {
        return motInterv;
    }

    public void setMotInterv(String motInterv) {
        this.motInterv = motInterv;
    }

    public String getNomInterv() {
        return nomInterv;
    }

    public void setNomInterv(String nomInterv) {
        this.nomInterv = nomInterv;
    }

    public String getCnpjInterv() {
        return cnpjInterv;
    }

    public void setCnpjInterv(String cnpjInterv) {
        this.cnpjInterv = cnpjInterv;
    }

    public String getCpfInterv() {
        return cpfInterv;
    }

    public void setCpfInterv(String cpfInterv) {
        this.cpfInterv = cpfInterv;
    }

    public BigDecimal getValFecha() {
        return valFecha;
    }

    public void setValFecha(BigDecimal valFecha) {
        this.valFecha = valFecha;
    }

    public BigDecimal getValAbert() {
        return valAbert;
    }

    public void setValAbert(BigDecimal valAbert) {
        this.valAbert = valAbert;
    }

    public BigDecimal getVolAferi() {
        return volAferi;
    }

    public void setVolAferi(BigDecimal volAferi) {
        this.volAferi = volAferi;
    }

    public BigDecimal getVolVendas() {
        return volVendas;
    }

    public void setVolVendas(BigDecimal volVendas) {
        this.volVendas = volVendas;
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
        if (!(object instanceof Reg1320)) {
            return false;
        }
        Reg1320 other = (Reg1320) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1320[ id=" + id + " ]";
    }

}
