package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c425")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC425.findAll", query = "SELECT r FROM RegC425 r"),
    @NamedQuery(name = "RegC425.findById", query = "SELECT r FROM RegC425 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC425.findByIdPai", query = "SELECT r FROM RegC425 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC425.findByLinha", query = "SELECT r FROM RegC425 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC425.findByHashfile", query = "SELECT r FROM RegC425 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC425.findByReg", query = "SELECT r FROM RegC425 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC425.findByCodItem", query = "SELECT r FROM RegC425 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC425.findByQtd", query = "SELECT r FROM RegC425 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC425.findByUnid", query = "SELECT r FROM RegC425 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC425.findByVlItem", query = "SELECT r FROM RegC425 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC425.findByVlPis", query = "SELECT r FROM RegC425 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC425.findByVlCofins", query = "SELECT r FROM RegC425 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 5)
public class RegC425 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC420 idPai;

    public RegC420 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC420) idPai;
    }

    public RegC425() {
    }

    public RegC425(String id) {
        this.id = id;
    }

    public RegC425(String id, RegC420 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC430> regC430;

    public List<RegC430> getRegC430() {
        return regC430;
    }

    public void setRegC430(List<RegC430> regC430) {
        this.regC430 = regC430;
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
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

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

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
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
        if (!(object instanceof RegC425)) {
            return false;
        }
        RegC425 other = (RegC425) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC425[ id=" + id + " ]";
    }

}
