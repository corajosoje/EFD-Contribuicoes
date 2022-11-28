package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * @author 88717
 */
@Entity
@Table(name = "reg_c870")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC870.findAll", query = "SELECT r FROM RegC870 r"),
    @NamedQuery(name = "RegC870.findById", query = "SELECT r FROM RegC870 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC870.findByIdPai", query = "SELECT r FROM RegC870 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC870.findByLinha", query = "SELECT r FROM RegC870 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC870.findByHash", query = "SELECT r FROM RegC870 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC870.findByReg", query = "SELECT r FROM RegC870 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC870.findByCodItem", query = "SELECT r FROM RegC870 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC870.findByQtd", query = "SELECT r FROM RegC870 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC870.findByUnid", query = "SELECT r FROM RegC870 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC870.findByCstIcms", query = "SELECT r FROM RegC870 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC870.findByCfop", query = "SELECT r FROM RegC870 r WHERE r.cfop = :cfop")})
@Registros(nivel = 3)
public class RegC870 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC860 idPai;

    public RegC860 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC860) idPai;
    }

    public RegC870() {
    }

    public RegC870(Long id) {
        this.id = id;
    }

    public RegC870(Long id, RegC860 idPai, long linha, String hash) {
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
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC880 regC880;

    public RegC880 getRegC880() {
        return regC880;
    }

    public void setRegC880(RegC880 regC880) {
        this.regC880 = regC880;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;

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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegC870)) {
            return false;
        }
        RegC870 other = (RegC870) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC870[ id=" + id + " ]";
    }

}
