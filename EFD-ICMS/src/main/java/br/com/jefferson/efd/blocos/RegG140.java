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
@Table(name = "reg_g140")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegG140.findAll", query = "SELECT r FROM RegG140 r"),
    @NamedQuery(name = "RegG140.findById", query = "SELECT r FROM RegG140 r WHERE r.id = :id"),
    @NamedQuery(name = "RegG140.findByIdPai", query = "SELECT r FROM RegG140 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegG140.findByLinha", query = "SELECT r FROM RegG140 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegG140.findByHashfile", query = "SELECT r FROM RegG140 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegG140.findByReg", query = "SELECT r FROM RegG140 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegG140.findByNumItem", query = "SELECT r FROM RegG140 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegG140.findByCodItem", query = "SELECT r FROM RegG140 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegG140.findByQtde", query = "SELECT r FROM RegG140 r WHERE r.qtde = :qtde"),
    @NamedQuery(name = "RegG140.findByUnid", query = "SELECT r FROM RegG140 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegG140.findByVlIcmsOpAplicado", query = "SELECT r FROM RegG140 r WHERE r.vlIcmsOpAplicado = :vlIcmsOpAplicado"),
    @NamedQuery(name = "RegG140.findByVlIcmsStAplicado", query = "SELECT r FROM RegG140 r WHERE r.vlIcmsStAplicado = :vlIcmsStAplicado"),
    @NamedQuery(name = "RegG140.findByVlIcmsFrtAplicado", query = "SELECT r FROM RegG140 r WHERE r.vlIcmsFrtAplicado = :vlIcmsFrtAplicado"),
    @NamedQuery(name = "RegG140.findByVlIcmsDifAplicado", query = "SELECT r FROM RegG140 r WHERE r.vlIcmsDifAplicado = :vlIcmsDifAplicado")})
@Registros(nivel = 5)
public class RegG140 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegG130 idPai;

    public RegG130 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegG130) idPai;
    }

    public RegG140() {
    }

    public RegG140(String id) {
        this.id = id;
    }

    public RegG140(String id, RegG130 idPai, long linha, String hashfile) {
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
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "NUM_ITEM")
    private int numItem;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTDE", precision = 15, scale = 6)
    private BigDecimal qtde;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ICMS_OP_APLICADO", precision = 15, scale = 6)
    private BigDecimal vlIcmsOpAplicado;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_ICMS_ST_APLICADO", precision = 15, scale = 6)
    private BigDecimal vlIcmsStAplicado;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_ICMS_FRT_APLICADO", precision = 15, scale = 6)
    private BigDecimal vlIcmsFrtAplicado;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_ICMS_DIF_APLICADO", precision = 15, scale = 6)
    private BigDecimal vlIcmsDifAplicado;

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

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtde() {
        return qtde;
    }

    public void setQtde(BigDecimal qtde) {
        this.qtde = qtde;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlIcmsOpAplicado() {
        return vlIcmsOpAplicado;
    }

    public void setVlIcmsOpAplicado(BigDecimal vlIcmsOpAplicado) {
        this.vlIcmsOpAplicado = vlIcmsOpAplicado;
    }

    public BigDecimal getVlIcmsStAplicado() {
        return vlIcmsStAplicado;
    }

    public void setVlIcmsStAplicado(BigDecimal vlIcmsStAplicado) {
        this.vlIcmsStAplicado = vlIcmsStAplicado;
    }

    public BigDecimal getVlIcmsFrtAplicado() {
        return vlIcmsFrtAplicado;
    }

    public void setVlIcmsFrtAplicado(BigDecimal vlIcmsFrtAplicado) {
        this.vlIcmsFrtAplicado = vlIcmsFrtAplicado;
    }

    public BigDecimal getVlIcmsDifAplicado() {
        return vlIcmsDifAplicado;
    }

    public void setVlIcmsDifAplicado(BigDecimal vlIcmsDifAplicado) {
        this.vlIcmsDifAplicado = vlIcmsDifAplicado;
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
        if (!(object instanceof RegG140)) {
            return false;
        }
        RegG140 other = (RegG140) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegG140[ id=" + id + " ]";
    }

}
