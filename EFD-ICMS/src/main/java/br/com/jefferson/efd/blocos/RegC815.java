package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "reg_c815")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC815.findAll", query = "SELECT r FROM RegC815 r"),
    @NamedQuery(name = "RegC815.findById", query = "SELECT r FROM RegC815 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC815.findByIdPai", query = "SELECT r FROM RegC815 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC815.findByLinha", query = "SELECT r FROM RegC815 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC815.findByHashfile", query = "SELECT r FROM RegC815 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC815.findByReg", query = "SELECT r FROM RegC815 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC815.findByCodMotRestCompl", query = "SELECT r FROM RegC815 r WHERE r.codMotRestCompl = :codMotRestCompl"),
    @NamedQuery(name = "RegC815.findByQuantConv", query = "SELECT r FROM RegC815 r WHERE r.quantConv = :quantConv"),
    @NamedQuery(name = "RegC815.findByUnid", query = "SELECT r FROM RegC815 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC815.findByVlUnitConv", query = "SELECT r FROM RegC815 r WHERE r.vlUnitConv = :vlUnitConv"),
    @NamedQuery(name = "RegC815.findByVlUnitIcmsNaOperacaoConv", query = "SELECT r FROM RegC815 r WHERE r.vlUnitIcmsNaOperacaoConv = :vlUnitIcmsNaOperacaoConv"),
    @NamedQuery(name = "RegC815.findByVlUnitIcmsOpConv", query = "SELECT r FROM RegC815 r WHERE r.vlUnitIcmsOpConv = :vlUnitIcmsOpConv"),
    @NamedQuery(name = "RegC815.findByVlUnitIcmsOpEstoqueConv", query = "SELECT r FROM RegC815 r WHERE r.vlUnitIcmsOpEstoqueConv = :vlUnitIcmsOpEstoqueConv"),
    @NamedQuery(name = "RegC815.findByVlUnitIcmsStEstoqueConv", query = "SELECT r FROM RegC815 r WHERE r.vlUnitIcmsStEstoqueConv = :vlUnitIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC815.findByVlUnitFcpIcmsStEstoqueConv", query = "SELECT r FROM RegC815 r WHERE r.vlUnitFcpIcmsStEstoqueConv = :vlUnitFcpIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC815.findByVlUnitIcmsStConvRest", query = "SELECT r FROM RegC815 r WHERE r.vlUnitIcmsStConvRest = :vlUnitIcmsStConvRest"),
    @NamedQuery(name = "RegC815.findByVlUnitFcpStConvRest", query = "SELECT r FROM RegC815 r WHERE r.vlUnitFcpStConvRest = :vlUnitFcpStConvRest"),
    @NamedQuery(name = "RegC815.findByVlUnitIcmsStConvCompl", query = "SELECT r FROM RegC815 r WHERE r.vlUnitIcmsStConvCompl = :vlUnitIcmsStConvCompl"),
    @NamedQuery(name = "RegC815.findByVlUnitFcpStConvCompl", query = "SELECT r FROM RegC815 r WHERE r.vlUnitFcpStConvCompl = :vlUnitFcpStConvCompl")})
@Registros(nivel = 4)
public class RegC815 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC810 idPai;

    public RegC810 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC810) idPai;
    }

    public RegC815() {
    }

    public RegC815(Long id) {
        this.id = id;
    }

    public RegC815(Long id, RegC810 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
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
        if (!(object instanceof RegC815)) {
            return false;
        }
        RegC815 other = (RegC815) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC815[ id=" + id + " ]";
    }

}