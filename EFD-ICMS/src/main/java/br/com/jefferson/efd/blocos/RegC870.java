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
@Table(name = "reg_c870")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC870.findAll", query = "SELECT r FROM RegC870 r"),
    @NamedQuery(name = "RegC870.findById", query = "SELECT r FROM RegC870 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC870.findByIdPai", query = "SELECT r FROM RegC870 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC870.findByLinha", query = "SELECT r FROM RegC870 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC870.findByHashfile", query = "SELECT r FROM RegC870 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC870.findByReg", query = "SELECT r FROM RegC870 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC870.findByCodItem", query = "SELECT r FROM RegC870 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC870.findByQtd", query = "SELECT r FROM RegC870 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC870.findByUnid", query = "SELECT r FROM RegC870 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC870.findByCstIcms", query = "SELECT r FROM RegC870 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC870.findByCfop", query = "SELECT r FROM RegC870 r WHERE r.cfop = :cfop")})
@Registros(nivel = 3)
public class RegC870 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC860 idPai;

    public RegC860 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC860) idPai;
    }

    public RegC870() {
    }

    public RegC870(String id) {
        this.id = id;
    }

    public RegC870(String id, RegC860 idPai, long linha, String hashfile) {
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
    @Column(name = "QTD", precision = 15, scale = 6)
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
