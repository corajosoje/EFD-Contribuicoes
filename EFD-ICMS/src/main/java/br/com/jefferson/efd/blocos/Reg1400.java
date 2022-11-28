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
@Table(name = "reg_1400")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1400.findAll", query = "SELECT r FROM Reg1400 r"),
    @NamedQuery(name = "Reg1400.findById", query = "SELECT r FROM Reg1400 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1400.findByIdPai", query = "SELECT r FROM Reg1400 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1400.findByLinha", query = "SELECT r FROM Reg1400 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1400.findByHash", query = "SELECT r FROM Reg1400 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1400.findByReg", query = "SELECT r FROM Reg1400 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1400.findByCodItemIpm", query = "SELECT r FROM Reg1400 r WHERE r.codItemIpm = :codItemIpm"),
    @NamedQuery(name = "Reg1400.findByMun", query = "SELECT r FROM Reg1400 r WHERE r.mun = :mun"),
    @NamedQuery(name = "Reg1400.findByValor", query = "SELECT r FROM Reg1400 r WHERE r.valor = :valor")})
@Registros(nivel = 2)
public class Reg1400 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
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
    @Column(name = "HASH")
    private String hash;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_ITEM_IPM")
    private String codItemIpm;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "MUN")
    private String mun;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VALOR")
    private BigDecimal valor;

    public Reg1400() {
    }

    public Reg1400(Long id) {
        this.id = id;
    }

    public Reg1400(Long id, Reg1001 idPai, long linha, String hash) {
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

    public String getCodItemIpm() {
        return codItemIpm;
    }

    public void setCodItemIpm(String codItemIpm) {
        this.codItemIpm = codItemIpm;
    }

    public String getMun() {
        return mun;
    }

    public void setMun(String mun) {
        this.mun = mun;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
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
        if (!(object instanceof Reg1400)) {
            return false;
        }
        Reg1400 other = (Reg1400) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1400[ id=" + id + " ]";
    }

}
