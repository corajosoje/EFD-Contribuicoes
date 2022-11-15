package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_b440")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB440.findAll", query = "SELECT r FROM RegB440 r"),
    @NamedQuery(name = "RegB440.findById", query = "SELECT r FROM RegB440 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB440.findByIdPai", query = "SELECT r FROM RegB440 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB440.findByLinha", query = "SELECT r FROM RegB440 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB440.findByHash", query = "SELECT r FROM RegB440 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB440.findByReg", query = "SELECT r FROM RegB440 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB440.findByIndOper", query = "SELECT r FROM RegB440 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegB440.findByCodPart", query = "SELECT r FROM RegB440 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegB440.findByVlContRt", query = "SELECT r FROM RegB440 r WHERE r.vlContRt = :vlContRt"),
    @NamedQuery(name = "RegB440.findByVlBcIssRt", query = "SELECT r FROM RegB440 r WHERE r.vlBcIssRt = :vlBcIssRt"),
    @NamedQuery(name = "RegB440.findByVlIssRt", query = "SELECT r FROM RegB440 r WHERE r.vlIssRt = :vlIssRt")})
@Registros(nivel = 2)
public class RegB440 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegB001 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_OPER")
    private String indOper;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_CONT_RT")
    private BigDecimal vlContRt;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_BC_ISS_RT")
    private BigDecimal vlBcIssRt;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ISS_RT")
    private BigDecimal vlIssRt;

    public RegB440() {
    }

    public RegB440(Long id) {
        this.id = id;
    }

    public RegB440(Long id, RegB001 idPai, long linha, String hash) {
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

    public RegB001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegB001) idPai;
    }

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

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public BigDecimal getVlContRt() {
        return vlContRt;
    }

    public void setVlContRt(BigDecimal vlContRt) {
        this.vlContRt = vlContRt;
    }

    public BigDecimal getVlBcIssRt() {
        return vlBcIssRt;
    }

    public void setVlBcIssRt(BigDecimal vlBcIssRt) {
        this.vlBcIssRt = vlBcIssRt;
    }

    public BigDecimal getVlIssRt() {
        return vlIssRt;
    }

    public void setVlIssRt(BigDecimal vlIssRt) {
        this.vlIssRt = vlIssRt;
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
        if (!(object instanceof RegB440)) {
            return false;
        }
        RegB440 other = (RegB440) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB440[ id=" + id + " ]";
    }

}
