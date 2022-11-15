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
@Table(name = "reg_b470")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB470.findAll", query = "SELECT r FROM RegB470 r"),
    @NamedQuery(name = "RegB470.findById", query = "SELECT r FROM RegB470 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB470.findByIdPai", query = "SELECT r FROM RegB470 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB470.findByLinha", query = "SELECT r FROM RegB470 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB470.findByHash", query = "SELECT r FROM RegB470 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegB470.findByReg", query = "SELECT r FROM RegB470 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB470.findByVlCont", query = "SELECT r FROM RegB470 r WHERE r.vlCont = :vlCont"),
    @NamedQuery(name = "RegB470.findByVlMatTerc", query = "SELECT r FROM RegB470 r WHERE r.vlMatTerc = :vlMatTerc"),
    @NamedQuery(name = "RegB470.findByVlMatProp", query = "SELECT r FROM RegB470 r WHERE r.vlMatProp = :vlMatProp"),
    @NamedQuery(name = "RegB470.findByVlSub", query = "SELECT r FROM RegB470 r WHERE r.vlSub = :vlSub"),
    @NamedQuery(name = "RegB470.findByVlIsnt", query = "SELECT r FROM RegB470 r WHERE r.vlIsnt = :vlIsnt"),
    @NamedQuery(name = "RegB470.findByVlDedBc", query = "SELECT r FROM RegB470 r WHERE r.vlDedBc = :vlDedBc"),
    @NamedQuery(name = "RegB470.findByVlBcIss", query = "SELECT r FROM RegB470 r WHERE r.vlBcIss = :vlBcIss"),
    @NamedQuery(name = "RegB470.findByVlBcIssRt", query = "SELECT r FROM RegB470 r WHERE r.vlBcIssRt = :vlBcIssRt"),
    @NamedQuery(name = "RegB470.findByVlIss", query = "SELECT r FROM RegB470 r WHERE r.vlIss = :vlIss"),
    @NamedQuery(name = "RegB470.findByVlIssRt", query = "SELECT r FROM RegB470 r WHERE r.vlIssRt = :vlIssRt"),
    @NamedQuery(name = "RegB470.findByVlDed", query = "SELECT r FROM RegB470 r WHERE r.vlDed = :vlDed"),
    @NamedQuery(name = "RegB470.findByVlIssRec", query = "SELECT r FROM RegB470 r WHERE r.vlIssRec = :vlIssRec"),
    @NamedQuery(name = "RegB470.findByVlIssSt", query = "SELECT r FROM RegB470 r WHERE r.vlIssSt = :vlIssSt"),
    @NamedQuery(name = "RegB470.findByVlIssRecUni", query = "SELECT r FROM RegB470 r WHERE r.vlIssRecUni = :vlIssRecUni")})
@Registros(nivel = 2)
public class RegB470 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
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

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_CONT")
    private BigDecimal vlCont;

    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_MAT_TERC")
    private BigDecimal vlMatTerc;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_MAT_PROP")
    private BigDecimal vlMatProp;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_SUB")
    private BigDecimal vlSub;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_ISNT")
    private BigDecimal vlIsnt;

    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_DED_BC")
    private BigDecimal vlDedBc;

    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_BC_ISS")
    private BigDecimal vlBcIss;

    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_BC_ISS_RT")
    private BigDecimal vlBcIssRt;

    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_ISS")
    private BigDecimal vlIss;

    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_ISS_RT")
    private BigDecimal vlIssRt;

    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_DED")
    private BigDecimal vlDed;

    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_ISS_REC")
    private BigDecimal vlIssRec;

    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_ISS_ST")
    private BigDecimal vlIssSt;

    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_ISS_REC_UNI")
    private BigDecimal vlIssRecUni;

    public RegB470() {
    }

    public RegB470(Long id) {
        this.id = id;
    }

    public RegB470(Long id, RegB001 idPai, long linha, String hash) {
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

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlMatTerc() {
        return vlMatTerc;
    }

    public void setVlMatTerc(BigDecimal vlMatTerc) {
        this.vlMatTerc = vlMatTerc;
    }

    public BigDecimal getVlMatProp() {
        return vlMatProp;
    }

    public void setVlMatProp(BigDecimal vlMatProp) {
        this.vlMatProp = vlMatProp;
    }

    public BigDecimal getVlSub() {
        return vlSub;
    }

    public void setVlSub(BigDecimal vlSub) {
        this.vlSub = vlSub;
    }

    public BigDecimal getVlIsnt() {
        return vlIsnt;
    }

    public void setVlIsnt(BigDecimal vlIsnt) {
        this.vlIsnt = vlIsnt;
    }

    public BigDecimal getVlDedBc() {
        return vlDedBc;
    }

    public void setVlDedBc(BigDecimal vlDedBc) {
        this.vlDedBc = vlDedBc;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getVlBcIssRt() {
        return vlBcIssRt;
    }

    public void setVlBcIssRt(BigDecimal vlBcIssRt) {
        this.vlBcIssRt = vlBcIssRt;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public BigDecimal getVlIssRt() {
        return vlIssRt;
    }

    public void setVlIssRt(BigDecimal vlIssRt) {
        this.vlIssRt = vlIssRt;
    }

    public BigDecimal getVlDed() {
        return vlDed;
    }

    public void setVlDed(BigDecimal vlDed) {
        this.vlDed = vlDed;
    }

    public BigDecimal getVlIssRec() {
        return vlIssRec;
    }

    public void setVlIssRec(BigDecimal vlIssRec) {
        this.vlIssRec = vlIssRec;
    }

    public BigDecimal getVlIssSt() {
        return vlIssSt;
    }

    public void setVlIssSt(BigDecimal vlIssSt) {
        this.vlIssSt = vlIssSt;
    }

    public BigDecimal getVlIssRecUni() {
        return vlIssRecUni;
    }

    public void setVlIssRecUni(BigDecimal vlIssRecUni) {
        this.vlIssRecUni = vlIssRecUni;
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
        if (!(object instanceof RegB470)) {
            return false;
        }
        RegB470 other = (RegB470) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB470[ id=" + id + " ]";
    }

}
