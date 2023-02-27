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
@Table(name = "reg_c430")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC430.findAll", query = "SELECT r FROM RegC430 r"),
    @NamedQuery(name = "RegC430.findById", query = "SELECT r FROM RegC430 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC430.findByIdPai", query = "SELECT r FROM RegC430 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC430.findByLinha", query = "SELECT r FROM RegC430 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC430.findByHashfile", query = "SELECT r FROM RegC430 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC430.findByReg", query = "SELECT r FROM RegC430 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC430.findByCodMotRestCompl", query = "SELECT r FROM RegC430 r WHERE r.codMotRestCompl = :codMotRestCompl"),
    @NamedQuery(name = "RegC430.findByQuantConv", query = "SELECT r FROM RegC430 r WHERE r.quantConv = :quantConv"),
    @NamedQuery(name = "RegC430.findByUnid", query = "SELECT r FROM RegC430 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC430.findByVlUnitConv", query = "SELECT r FROM RegC430 r WHERE r.vlUnitConv = :vlUnitConv"),
    @NamedQuery(name = "RegC430.findByVlUnitIcmsNaOperacaoConv", query = "SELECT r FROM RegC430 r WHERE r.vlUnitIcmsNaOperacaoConv = :vlUnitIcmsNaOperacaoConv"),
    @NamedQuery(name = "RegC430.findByVlUnitIcmsOpConv", query = "SELECT r FROM RegC430 r WHERE r.vlUnitIcmsOpConv = :vlUnitIcmsOpConv"),
    @NamedQuery(name = "RegC430.findByVlUnitIcmsOpEstoqueConv", query = "SELECT r FROM RegC430 r WHERE r.vlUnitIcmsOpEstoqueConv = :vlUnitIcmsOpEstoqueConv"),
    @NamedQuery(name = "RegC430.findByVlUnitIcmsStEstoqueConv", query = "SELECT r FROM RegC430 r WHERE r.vlUnitIcmsStEstoqueConv = :vlUnitIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC430.findByVlUnitFcpIcmsStEstoqueConv", query = "SELECT r FROM RegC430 r WHERE r.vlUnitFcpIcmsStEstoqueConv = :vlUnitFcpIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC430.findByVlUnitIcmsStConvRest", query = "SELECT r FROM RegC430 r WHERE r.vlUnitIcmsStConvRest = :vlUnitIcmsStConvRest"),
    @NamedQuery(name = "RegC430.findByVlUnitFcpStConvRest", query = "SELECT r FROM RegC430 r WHERE r.vlUnitFcpStConvRest = :vlUnitFcpStConvRest"),
    @NamedQuery(name = "RegC430.findByVlUnitIcmsStConvCompl", query = "SELECT r FROM RegC430 r WHERE r.vlUnitIcmsStConvCompl = :vlUnitIcmsStConvCompl"),
    @NamedQuery(name = "RegC430.findByVlUnitFcpStConvCompl", query = "SELECT r FROM RegC430 r WHERE r.vlUnitFcpStConvCompl = :vlUnitFcpStConvCompl"),
    @NamedQuery(name = "RegC430.findByCstIcms", query = "SELECT r FROM RegC430 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC430.findByCfop", query = "SELECT r FROM RegC430 r WHERE r.cfop = :cfop")})
@Registros(nivel = 6)
public class RegC430 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC425 idPai;

    public RegC425 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC425) idPai;
    }

    public RegC430() {
    }

    public RegC430(String id) {
        this.id = id;
    }

    public RegC430(String id, RegC425 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOT_REST_COMPL")
    private String codMotRestCompl;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QUANT_CONV", precision = 15, scale = 6)
    private BigDecimal quantConv;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_UNIT_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitConv;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_NA_OPERACAO_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsNaOperacaoConv;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_OP_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsOpConv;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_OP_ESTOQUE_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsOpEstoqueConv;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_ST_ESTOQUE_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsStEstoqueConv;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitFcpIcmsStEstoqueConv;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_ST_CONV_REST", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsStConvRest;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_UNIT_FCP_ST_CONV_REST", precision = 15, scale = 6)
    private BigDecimal vlUnitFcpStConvRest;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_ST_CONV_COMPL", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsStConvCompl;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_UNIT_FCP_ST_CONV_COMPL ", precision = 15, scale = 6)
    private BigDecimal vlUnitFcpStConvCompl;
    @Campos(posicao = 15, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 16, tipo = 'C')
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
        if (!(object instanceof RegC430)) {
            return false;
        }
        RegC430 other = (RegC430) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC430[ id=" + id + " ]";
    }

}
