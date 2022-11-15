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
@Table(name = "reg_0220")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0220.findAll", query = "SELECT r FROM Reg0220 r"),
    @NamedQuery(name = "Reg0220.findById", query = "SELECT r FROM Reg0220 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0220.findByIdPai", query = "SELECT r FROM Reg0220 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0220.findByLinha", query = "SELECT r FROM Reg0220 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0220.findByHash", query = "SELECT r FROM Reg0220 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0220.findByReg", query = "SELECT r FROM Reg0220 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0220.findByUnidConv", query = "SELECT r FROM Reg0220 r WHERE r.unidConv = :unidConv"),
    @NamedQuery(name = "Reg0220.findByFatConv", query = "SELECT r FROM Reg0220 r WHERE r.fatConv = :fatConv"),
    @NamedQuery(name = "Reg0220.findByCodBarra", query = "SELECT r FROM Reg0220 r WHERE r.codBarra = :codBarra")})
@Registros(nivel = 3)
public class Reg0221 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0200 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_ITEM_ATOMICO")
    private String codItemAtomico;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD_CONTIDA")
    private BigDecimal qtdContida;

    public Reg0221() {
    }

    public Reg0221(Long id) {
        this.id = id;
    }

    public Reg0221(Long id, Reg0200 idPai, long linha, String hash) {
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

    public Reg0200 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0200) idPai;
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

    public String getCodItemAtomico() {
        return codItemAtomico;
    }

    public void setCodItemAtomico(String codItemAtomico) {
        this.codItemAtomico = codItemAtomico;
    }

    public BigDecimal getQtdContida() {
        return qtdContida;
    }

    public void setQtdContida(BigDecimal qtdContida) {
        this.qtdContida = qtdContida;
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
        if (!(object instanceof Reg0221)) {
            return false;
        }
        Reg0221 other = (Reg0221) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0220[ id=" + id + " ]";
    }

}
