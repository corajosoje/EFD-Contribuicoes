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
@Table(name = "reg_c330")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC330.findAll", query = "SELECT r FROM RegC330 r"),
    @NamedQuery(name = "RegC330.findById", query = "SELECT r FROM RegC330 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC330.findByIdPai", query = "SELECT r FROM RegC330 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC330.findByLinha", query = "SELECT r FROM RegC330 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC330.findByHashfile", query = "SELECT r FROM RegC330 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC330.findByReg", query = "SELECT r FROM RegC330 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC330.findByCodMotRestCompl", query = "SELECT r FROM RegC330 r WHERE r.codMotRestCompl = :codMotRestCompl"),
    @NamedQuery(name = "RegC330.findByQuantConv", query = "SELECT r FROM RegC330 r WHERE r.quantConv = :quantConv"),
    @NamedQuery(name = "RegC330.findByUnid", query = "SELECT r FROM RegC330 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC330.findByVlUnitConv", query = "SELECT r FROM RegC330 r WHERE r.vlUnitConv = :vlUnitConv"),
    @NamedQuery(name = "RegC330.findByVlUnitIcmsNaOperacaoConv", query = "SELECT r FROM RegC330 r WHERE r.vlUnitIcmsNaOperacaoConv = :vlUnitIcmsNaOperacaoConv"),
    @NamedQuery(name = "RegC330.findByVlUnitIcmsOpConv", query = "SELECT r FROM RegC330 r WHERE r.vlUnitIcmsOpConv = :vlUnitIcmsOpConv"),
    @NamedQuery(name = "RegC330.findByVlUnitBcIcmsStEstoqueConv", query = "SELECT r FROM RegC330 r WHERE r.vlUnitIcmsOpEstoqueConv = :vlUnitIcmsOpEstoqueConv"),
    @NamedQuery(name = "RegC330.findByVlUnitIcmsStEstoqueConv", query = "SELECT r FROM RegC330 r WHERE r.vlUnitIcmsStEstoqueConv = :vlUnitIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC330.findByVlUnitFcpIcmsStEstoqueConv", query = "SELECT r FROM RegC330 r WHERE r.vlUnitFcpIcmsStEstoqueConv = :vlUnitFcpIcmsStEstoqueConv"),
    @NamedQuery(name = "RegC330.findByVlUnitIcmsStConvRest", query = "SELECT r FROM RegC330 r WHERE r.vlUnitIcmsStConvRest = :vlUnitIcmsStConvRest"),
    @NamedQuery(name = "RegC330.findByVlUnitFcpStConvRest", query = "SELECT r FROM RegC330 r WHERE r.vlUnitFcpStConvRest = :vlUnitFcpStConvRest"),
    @NamedQuery(name = "RegC330.findByVlUnitIcmsStConvCompl", query = "SELECT r FROM RegC330 r WHERE r.vlUnitIcmsStConvCompl = :vlUnitIcmsStConvCompl"),
    @NamedQuery(name = "RegC330.findByVlUnitFcpStConvCompl", query = "SELECT r FROM RegC330 r WHERE r.vlUnitFcpStConvCompl = :vlUnitFcpStConvCompl")})
@Registros(nivel = 5)
public class RegC330 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC321 idPai;

    public RegC321 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC321) idPai;
    }

    public RegC330() {
    }

    public RegC330(Long id) {
        this.id = id;
    }

    public RegC330(Long id, RegC321 idPai, long linha, String hashfile) {
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
    @Column(name = "VL_UNIT_FCP_ST_CONV_COMPL ", precision = 15, scale = 6)
    private BigDecimal vlUnitFcpStConvCompl;

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
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
        if (!(object instanceof RegC330)) {
            return false;
        }
        RegC330 other = (RegC330) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC330[ id=" + id + " ]";
    }

}
