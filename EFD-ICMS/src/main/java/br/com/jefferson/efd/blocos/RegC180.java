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
@Table(name = "reg_c180")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC180.findAll", query = "SELECT r FROM RegC180 r"),
    @NamedQuery(name = "RegC180.findById", query = "SELECT r FROM RegC180 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC180.findByIdPai", query = "SELECT r FROM RegC180 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC180.findByLinha", query = "SELECT r FROM RegC180 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC180.findByHashfile", query = "SELECT r FROM RegC180 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC180.findByReg", query = "SELECT r FROM RegC180 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC180.findByCodRespRet", query = "SELECT r FROM RegC180 r WHERE r.codRespRet = :codRespRet"),
    @NamedQuery(name = "RegC180.findByQuantConv", query = "SELECT r FROM RegC180 r WHERE r.quantConv = :quantConv"),
    @NamedQuery(name = "RegC180.findByUnid", query = "SELECT r FROM RegC180 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC180.findByVlUnitConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitConv = :vlUnitConv"),
    @NamedQuery(name = "RegC180.findByVlUnitIcmsOpConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitIcmsOpConv = :vlUnitIcmsOpConv"),
    @NamedQuery(name = "RegC180.findByVlUnitBcIcmsStConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitBcIcmsStConv = :vlUnitBcIcmsStConv"),
    @NamedQuery(name = "RegC180.findByVlUnitIcmsStConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitIcmsStConv = :vlUnitIcmsStConv"),
    @NamedQuery(name = "RegC180.findByVlUnitFcpStConv", query = "SELECT r FROM RegC180 r WHERE r.vlUnitFcpStConv = :vlUnitFcpStConv"),
    @NamedQuery(name = "RegC180.findByCodDa", query = "SELECT r FROM RegC180 r WHERE r.codDa = :codDa"),
    @NamedQuery(name = "RegC180.findByNumDa", query = "SELECT r FROM RegC180 r WHERE r.numDa = :numDa")})
@Registros(nivel = 4)
public class RegC180 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC170 idPai;

    public RegC170 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC170) idPai;
    }

    public RegC180() {
    }

    public RegC180(Long id) {
        this.id = id;
    }

    public RegC180(Long id, RegC170 idPai, long linha, String hashfile) {
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
    @Column(name = "COD_RESP_RET")
    private String codRespRet;
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
    @Column(name = "VL_UNIT_ICMS_OP_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsOpConv;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_UNIT_BC_ICMS_ST_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitBcIcmsStConv;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_UNIT_ICMS_ST_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitIcmsStConv;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_UNIT_FCP_ST_CONV", precision = 15, scale = 6)
    private BigDecimal vlUnitFcpStConv;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "COD_DA")
    private String codDa;
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "NUM_DA")
    private String numDa;

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

    public String getCodRespRet() {
        return codRespRet;
    }

    public void setCodRespRet(String codRespRet) {
        this.codRespRet = codRespRet;
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

    public BigDecimal getVlUnitIcmsOpConv() {
        return vlUnitIcmsOpConv;
    }

    public void setVlUnitIcmsOpConv(BigDecimal vlUnitIcmsOpConv) {
        this.vlUnitIcmsOpConv = vlUnitIcmsOpConv;
    }

    public BigDecimal getVlUnitBcIcmsStConv() {
        return vlUnitBcIcmsStConv;
    }

    public void setVlUnitBcIcmsStConv(BigDecimal vlUnitBcIcmsStConv) {
        this.vlUnitBcIcmsStConv = vlUnitBcIcmsStConv;
    }

    public BigDecimal getVlUnitIcmsStConv() {
        return vlUnitIcmsStConv;
    }

    public void setVlUnitIcmsStConv(BigDecimal vlUnitIcmsStConv) {
        this.vlUnitIcmsStConv = vlUnitIcmsStConv;
    }

    public BigDecimal getVlUnitFcpStConv() {
        return vlUnitFcpStConv;
    }

    public void setVlUnitFcpStConv(BigDecimal vlUnitFcpStConv) {
        this.vlUnitFcpStConv = vlUnitFcpStConv;
    }

    public String getCodDa() {
        return codDa;
    }

    public void setCodDa(String codDa) {
        this.codDa = codDa;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
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
        if (!(object instanceof RegC180)) {
            return false;
        }
        RegC180 other = (RegC180) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC180[ id=" + id + " ]";
    }

}
