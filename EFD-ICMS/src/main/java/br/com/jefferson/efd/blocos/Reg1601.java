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
@Table(name = "reg_1601")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1601.findAll", query = "SELECT r FROM Reg1601 r"),
    @NamedQuery(name = "Reg1601.findById", query = "SELECT r FROM Reg1601 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1601.findByIdPai", query = "SELECT r FROM Reg1601 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1601.findByLinha", query = "SELECT r FROM Reg1601 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1601.findByHash", query = "SELECT r FROM Reg1601 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1601.findByReg", query = "SELECT r FROM Reg1601 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1601.findByCodPartIp", query = "SELECT r FROM Reg1601 r WHERE r.codPartIp = :codPartIp"),
    @NamedQuery(name = "Reg1601.findByCodPartIt", query = "SELECT r FROM Reg1601 r WHERE r.codPartIt = :codPartIt"),
    @NamedQuery(name = "Reg1601.findByTotVs", query = "SELECT r FROM Reg1601 r WHERE r.totVs = :totVs"),
    @NamedQuery(name = "Reg1601.findByTotIss", query = "SELECT r FROM Reg1601 r WHERE r.totIss = :totIss"),
    @NamedQuery(name = "Reg1601.findByTotOutros", query = "SELECT r FROM Reg1601 r WHERE r.totOutros = :totOutros")})
@Registros(nivel = 2)
public class Reg1601 implements Serializable {

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
    @Column(name = "COD_PART_IP")
    private String codPartIp;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_PART_IT")
    private String codPartIt;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "TOT_VS")
    private BigDecimal totVs;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "TOT_ISS")
    private BigDecimal totIss;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "TOT_OUTROS")
    private BigDecimal totOutros;

    public Reg1601() {
    }

    public Reg1601(Long id) {
        this.id = id;
    }

    public Reg1601(Long id, Reg1001 idPai, long linha, String hash) {
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

    public String getCodPartIp() {
        return codPartIp;
    }

    public void setCodPartIp(String codPartIp) {
        this.codPartIp = codPartIp;
    }

    public String getCodPartIt() {
        return codPartIt;
    }

    public void setCodPartIt(String codPartIt) {
        this.codPartIt = codPartIt;
    }

    public BigDecimal getTotVs() {
        return totVs;
    }

    public void setTotVs(BigDecimal totVs) {
        this.totVs = totVs;
    }

    public BigDecimal getTotIss() {
        return totIss;
    }

    public void setTotIss(BigDecimal totIss) {
        this.totIss = totIss;
    }

    public BigDecimal getTotOutros() {
        return totOutros;
    }

    public void setTotOutros(BigDecimal totOutros) {
        this.totOutros = totOutros;
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
        if (!(object instanceof Reg1601)) {
            return false;
        }
        Reg1601 other = (Reg1601) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1601[ id=" + id + " ]";
    }

}
