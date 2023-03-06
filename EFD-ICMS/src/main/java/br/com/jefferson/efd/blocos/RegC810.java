package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c810")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC810.findAll", query = "SELECT r FROM RegC810 r"),
    @NamedQuery(name = "RegC810.findById", query = "SELECT r FROM RegC810 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC810.findByIdPai", query = "SELECT r FROM RegC810 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC810.findByLinha", query = "SELECT r FROM RegC810 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC810.findByHashfile", query = "SELECT r FROM RegC810 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC810.findByReg", query = "SELECT r FROM RegC810 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC810.findByNumItem", query = "SELECT r FROM RegC810 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegC810.findByCodItem", query = "SELECT r FROM RegC810 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC810.findByQtd", query = "SELECT r FROM RegC810 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC810.findByUnid", query = "SELECT r FROM RegC810 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC810.findByVlItem", query = "SELECT r FROM RegC810 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC810.findByCstIcms", query = "SELECT r FROM RegC810 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC810.findByCfop", query = "SELECT r FROM RegC810 r WHERE r.cfop = :cfop")})
@Registros(nivel = 3)
public class RegC810 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC800 idPai;

    public RegC800 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC800) idPai;
    }

    public RegC810() {
    }

    public RegC810(String id) {
        this.id = id;
    }

    public RegC810(String id, RegC800 idPai, long linha, String hashfile) {
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC815 regC815;

    public RegC815 getRegC815() {
        return regC815;
    }

    public void setRegC815(RegC815 regC815) {
        this.regC815 = regC815;
    }
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
    @Column(name = "QTD", precision = 15, scale = 6)
    private BigDecimal qtd;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;

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

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
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
        if (!(object instanceof RegC810)) {
            return false;
        }
        RegC810 other = (RegC810) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC810[ id=" + id + " ]";
    }

}
