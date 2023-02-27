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
@Table(name = "reg_0220")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0220.findAll", query = "SELECT r FROM Reg0220 r"),
    @NamedQuery(name = "Reg0220.findById", query = "SELECT r FROM Reg0220 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0220.findByIdPai", query = "SELECT r FROM Reg0220 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0220.findByLinha", query = "SELECT r FROM Reg0220 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0220.findByHashfile", query = "SELECT r FROM Reg0220 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0220.findByReg", query = "SELECT r FROM Reg0220 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0220.findByUnidConv", query = "SELECT r FROM Reg0220 r WHERE r.unidConv = :unidConv"),
    @NamedQuery(name = "Reg0220.findByFatConv", query = "SELECT r FROM Reg0220 r WHERE r.fatConv = :fatConv"),
    @NamedQuery(name = "Reg0220.findByCodBarra", query = "SELECT r FROM Reg0220 r WHERE r.codBarra = :codBarra")})
@Registros(nivel = 3)
public class Reg0220 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0200 idPai;

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
    @Column(name = "UNID_CONV")
    private String unidConv;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "FAT_CONV", precision = 15, scale = 6)
    private BigDecimal fatConv;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_BARRA")
    private String codBarra;

    public Reg0220() {
    }

    public Reg0220(String id) {
        this.id = id;
    }

    public Reg0220(String id, Reg0200 idPai, long linha, String hashfile) {
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

    public String getUnidConv() {
        return unidConv;
    }

    public void setUnidConv(String unidConv) {
        this.unidConv = unidConv;
    }

    public BigDecimal getFatConv() {
        return fatConv;
    }

    public void setFatConv(BigDecimal fatConv) {
        this.fatConv = fatConv;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
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
        if (!(object instanceof Reg0220)) {
            return false;
        }
        Reg0220 other = (Reg0220) object;
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
