package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
@Table(name = "reg_1601")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1601.findAll", query = "SELECT r FROM Reg1601 r"),
    @NamedQuery(name = "Reg1601.findById", query = "SELECT r FROM Reg1601 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1601.findByIdPai", query = "SELECT r FROM Reg1601 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1601.findByLinha", query = "SELECT r FROM Reg1601 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1601.findByHashfile", query = "SELECT r FROM Reg1601 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1601.findByReg", query = "SELECT r FROM Reg1601 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1601.findByCodPartIp", query = "SELECT r FROM Reg1601 r WHERE r.codPartIp = :codPartIp"),
    @NamedQuery(name = "Reg1601.findByCodPartIt", query = "SELECT r FROM Reg1601 r WHERE r.codPartIt = :codPartIt"),
    @NamedQuery(name = "Reg1601.findByTotVs", query = "SELECT r FROM Reg1601 r WHERE r.totVs = :totVs"),
    @NamedQuery(name = "Reg1601.findByTotIss", query = "SELECT r FROM Reg1601 r WHERE r.totIss = :totIss"),
    @NamedQuery(name = "Reg1601.findByTotOutros", query = "SELECT r FROM Reg1601 r WHERE r.totOutros = :totOutros")})
@Registros(nivel = 2)
public class Reg1601 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    public Reg1001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
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
    @Column(name = "COD_PART_IP")
    private String codPartIp;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_PART_IT")
    private String codPartIt;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "TOT_VS", precision = 15, scale = 6)
    private BigDecimal totVs;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "TOT_ISS", precision = 15, scale = 6)
    private BigDecimal totIss;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "TOT_OUTROS", precision = 15, scale = 6)
    private BigDecimal totOutros;

    public Reg1601() {
    }

    public Reg1601(String id) {
        this.id = id;
    }

    public Reg1601(String id, Reg1001 idPai, long linha, String hashfile) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
