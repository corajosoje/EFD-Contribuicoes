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
@Table(name = "reg_c185")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC185.findAll", query = "SELECT r FROM RegC185 r"),
    @NamedQuery(name = "RegC185.findById", query = "SELECT r FROM RegC185 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC185.findByIdPai", query = "SELECT r FROM RegC185 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC185.findByLinha", query = "SELECT r FROM RegC185 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC185.findByHashfile", query = "SELECT r FROM RegC185 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC185.findByReg", query = "SELECT r FROM RegC185 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC185.findByNumItem", query = "SELECT r FROM RegC185 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegC185.findByCodItem", query = "SELECT r FROM RegC185 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC185.findByCstIcms", query = "SELECT r FROM RegC185 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC185.findByCfop", query = "SELECT r FROM RegC185 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC185.findByCodMotRestCompl", query = "SELECT r FROM RegC185 r WHERE r.codMotRestCompl = :codMotRestCompl"),
    @NamedQuery(name = "RegC185.findByQuantConv", query = "SELECT r FROM RegC185 r WHERE r.quantConv = :quantConv"),
    @NamedQuery(name = "RegC185.findByUnid", query = "SELECT r FROM RegC185 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC185.findByVlUnitConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitConv = :vlUnitConv"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsNaOperacaoConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsNaOperacaoConv = :vlUnitIcmsNaOperacaoConv"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsOpConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsOpConv = :vlUnitIcmsOpConv"),
    @NamedQuery(name = "RegC185.findByVlUnitBcIcmsStEstoqueConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsOpEstoqueConv = :vlUnitIcmsOpEstoqueConv"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsStEstoqueConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsStEstoqueConv = :vlUnitIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC185.findByVlUnitFcpIcmsStEstoqueConv", query = "SELECT r FROM RegC185 r WHERE r.vlUnitFcpIcmsStEstoqueConv = :vlUnitFcpIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsStConvRest", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsStConvRest = :vlUnitIcmsStConvRest"),
    @NamedQuery(name = "RegC185.findByVlUnitFcpStConvRest", query = "SELECT r FROM RegC185 r WHERE r.vlUnitFcpStConvRest = :vlUnitFcpStConvRest"),
    @NamedQuery(name = "RegC185.findByVlUnitIcmsStConvCompl", query = "SELECT r FROM RegC185 r WHERE r.vlUnitIcmsStConvCompl = :vlUnitIcmsStConvCompl"),
    @NamedQuery(name = "RegC185.findByVlUnitFcpStConvCompl", query = "SELECT r FROM RegC185 r WHERE r.vlUnitFcpStConvCompl = :vlUnitFcpStConvCompl")})
@Registros(nivel = 3)
public class RegC185 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC100) idPai;
    }

    public RegC185() {
    }

    public RegC185(String id) {
        this.id = id;
    }

    public RegC185(String id, RegC100 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_MOT_REST_COMPL")
    private String codMotRestCompl;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "QUANT_CONV", precision = 15, scale = 6)
    private BigDecimal quantConv;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_UNIT_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitConv;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_NA_OPERACAO_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsNaOperacaoConv;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_OP_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsOpConv;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_OP_ESTOQUE_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsOpEstoqueConv;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_ST_ESTOQUE_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsStEstoqueConv;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitFcpIcmsStEstoqueConv;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_ST_CONV_REST", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsStConvRest;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_UNIT_FCP_ST_CONV_REST", precision = 15, scale = 6)
    private BigDecimal vlUnitFcpStConvRest;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_ST_CONV_COMPL", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsStConvCompl;
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_UNIT_FCP_ST_CONV_COMPL", precision = 15, scale = 6)
    private BigDecimal vlUnitFcpStConvCompl;

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

    public String getCodMotRestCompl() {
        return codMotRestCompl;
    }

    public void setCodMotRestCompl(String codMotRestCompl) {
        this.codMotRestCompl = codMotRestCompl;
    }

    public BigDecimal getQuantConv() {
        return quantConv;
    }

    public void setQuantConv(BigDecimal quantConv) {
        this.quantConv = quantConv;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlUnitConv() {
        return vlUnitConv;
    }

    public void setVlUnitConv(BigDecimal vlUnitConv) {
        this.vlUnitConv = vlUnitConv;
    }

    public BigDecimal getVlUnitIcmsNaOperacaoConv() {
        return vlUnitIcmsNaOperacaoConv;
    }

    public void setVlUnitIcmsNaOperacaoConv(BigDecimal vlUnitIcmsNaOperacaoConv) {
        this.vlUnitIcmsNaOperacaoConv = vlUnitIcmsNaOperacaoConv;
    }

    public BigDecimal getVlUnitIcmsOpConv() {
        return vlUnitIcmsOpConv;
    }

    public void setVlUnitIcmsOpConv(BigDecimal vlUnitIcmsOpConv) {
        this.vlUnitIcmsOpConv = vlUnitIcmsOpConv;
    }

    public BigDecimal getVlUnitIcmsOpEstoqueConv() {
        return vlUnitIcmsOpEstoqueConv;
    }

    public void setVlUnitIcmsOpEstoqueConv(BigDecimal vlUnitIcmsOpEstoqueConv) {
        this.vlUnitIcmsOpEstoqueConv = vlUnitIcmsOpEstoqueConv;
    }

    public BigDecimal getVlUnitIcmsStEstoqueConv() {
        return vlUnitIcmsStEstoqueConv;
    }

    public void setVlUnitIcmsStEstoqueConv(BigDecimal vlUnitIcmsStEstoqueConv) {
        this.vlUnitIcmsStEstoqueConv = vlUnitIcmsStEstoqueConv;
    }

    public BigDecimal getVlUnitFcpIcmsStEstoqueConv() {
        return vlUnitFcpIcmsStEstoqueConv;
    }

    public void setVlUnitFcpIcmsStEstoqueConv(BigDecimal vlUnitFcpIcmsStEstoqueConv) {
        this.vlUnitFcpIcmsStEstoqueConv = vlUnitFcpIcmsStEstoqueConv;
    }

    public BigDecimal getVlUnitIcmsStConvRest() {
        return vlUnitIcmsStConvRest;
    }

    public void setVlUnitIcmsStConvRest(BigDecimal vlUnitIcmsStConvRest) {
        this.vlUnitIcmsStConvRest = vlUnitIcmsStConvRest;
    }

    public BigDecimal getVlUnitFcpStConvRest() {
        return vlUnitFcpStConvRest;
    }

    public void setVlUnitFcpStConvRest(BigDecimal vlUnitFcpStConvRest) {
        this.vlUnitFcpStConvRest = vlUnitFcpStConvRest;
    }

    public BigDecimal getVlUnitIcmsStConvCompl() {
        return vlUnitIcmsStConvCompl;
    }

    public void setVlUnitIcmsStConvCompl(BigDecimal vlUnitIcmsStConvCompl) {
        this.vlUnitIcmsStConvCompl = vlUnitIcmsStConvCompl;
    }

    public BigDecimal getVlUnitFcpStConvCompl() {
        return vlUnitFcpStConvCompl;
    }

    public void setVlUnitFcpStConvCompl(BigDecimal vlUnitFcpStConvCompl) {
        this.vlUnitFcpStConvCompl = vlUnitFcpStConvCompl;
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
        if (!(object instanceof RegC185)) {
            return false;
        }
        RegC185 other = (RegC185) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC185[ id=" + id + " ]";
    }

}
