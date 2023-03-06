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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_h010")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegH010.findAll", query = "SELECT r FROM RegH010 r"),
    @NamedQuery(name = "RegH010.findById", query = "SELECT r FROM RegH010 r WHERE r.id = :id"),
    @NamedQuery(name = "RegH010.findByIdPai", query = "SELECT r FROM RegH010 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegH010.findByLinha", query = "SELECT r FROM RegH010 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegH010.findByHashfile", query = "SELECT r FROM RegH010 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegH010.findByReg", query = "SELECT r FROM RegH010 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegH010.findByCodItem", query = "SELECT r FROM RegH010 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegH010.findByUnid", query = "SELECT r FROM RegH010 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegH010.findByQtd", query = "SELECT r FROM RegH010 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegH010.findByVlUnit", query = "SELECT r FROM RegH010 r WHERE r.vlUnit = :vlUnit"),
    @NamedQuery(name = "RegH010.findByVlItem", query = "SELECT r FROM RegH010 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegH010.findByIndProp", query = "SELECT r FROM RegH010 r WHERE r.indProp = :indProp"),
    @NamedQuery(name = "RegH010.findByCodPart", query = "SELECT r FROM RegH010 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegH010.findByTxtCompl", query = "SELECT r FROM RegH010 r WHERE r.txtCompl = :txtCompl"),
    @NamedQuery(name = "RegH010.findByCodCta", query = "SELECT r FROM RegH010 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegH010.findByVlItemIr", query = "SELECT r FROM RegH010 r WHERE r.vlItemIr = :vlItemIr")})
@Registros(nivel = 3)
public class RegH010 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegH005 idPai;

    public RegH005 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegH005) idPai;
    }

    public RegH010() {
    }

    public RegH010(String id) {
        this.id = id;
    }

    public RegH010(String id, RegH005 idPai, long linha, String hashfile) {
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
    private List<RegH020> regH020;

    public List<RegH020> getRegH020() {
        return regH020;
    }

    public void setRegH020(List<RegH020> regH020) {
        this.regH020 = regH020;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegH030 regH030;

    public RegH030 getRegH030() {
        return regH030;
    }

    public void setRegH030(RegH030 regH030) {
        this.regH030 = regH030;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD", precision = 15, scale = 6)
    private BigDecimal qtd;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_UNIT", precision = 15, scale = 6)
    private BigDecimal vlUnit;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "IND_PROP")
    private String indProp;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "TXT_COMPL")
    private String txtCompl;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_ITEM_IR", precision = 15, scale = 6)
    private BigDecimal vlItemIr;

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

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getVlUnit() {
        return vlUnit;
    }

    public void setVlUnit(BigDecimal vlUnit) {
        this.vlUnit = vlUnit;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public String getIndProp() {
        return indProp;
    }

    public void setIndProp(String indProp) {
        this.indProp = indProp;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public BigDecimal getVlItemIr() {
        return vlItemIr;
    }

    public void setVlItemIr(BigDecimal vlItemIr) {
        this.vlItemIr = vlItemIr;
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
        if (!(object instanceof RegH010)) {
            return false;
        }
        RegH010 other = (RegH010) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegH010[ id=" + id + " ]";
    }

}
