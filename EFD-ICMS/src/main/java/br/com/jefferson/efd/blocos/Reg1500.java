
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1500.findAll", query = "SELECT r FROM Reg1500 r"),
    @NamedQuery(name = "Reg1500.findById", query = "SELECT r FROM Reg1500 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1500.findByIdPai", query = "SELECT r FROM Reg1500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1500.findByLinha", query = "SELECT r FROM Reg1500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1500.findByHash", query = "SELECT r FROM Reg1500 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1500.findByReg", query = "SELECT r FROM Reg1500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1500.findByIndOper", query = "SELECT r FROM Reg1500 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "Reg1500.findByIndEmit", query = "SELECT r FROM Reg1500 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "Reg1500.findByCodPart", query = "SELECT r FROM Reg1500 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "Reg1500.findByCodMod", query = "SELECT r FROM Reg1500 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "Reg1500.findByCodSit", query = "SELECT r FROM Reg1500 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "Reg1500.findBySer", query = "SELECT r FROM Reg1500 r WHERE r.ser = :ser"),
    @NamedQuery(name = "Reg1500.findBySub", query = "SELECT r FROM Reg1500 r WHERE r.sub = :sub"),
    @NamedQuery(name = "Reg1500.findByCodCons", query = "SELECT r FROM Reg1500 r WHERE r.codCons = :codCons"),
    @NamedQuery(name = "Reg1500.findByNumDoc", query = "SELECT r FROM Reg1500 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "Reg1500.findByDtDoc", query = "SELECT r FROM Reg1500 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "Reg1500.findByDtES", query = "SELECT r FROM Reg1500 r WHERE r.dtES = :dtES"),
    @NamedQuery(name = "Reg1500.findByVlDoc", query = "SELECT r FROM Reg1500 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "Reg1500.findByVlDesc", query = "SELECT r FROM Reg1500 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "Reg1500.findByVlForn", query = "SELECT r FROM Reg1500 r WHERE r.vlForn = :vlForn"),
    @NamedQuery(name = "Reg1500.findByVlServNt", query = "SELECT r FROM Reg1500 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "Reg1500.findByVlTerc", query = "SELECT r FROM Reg1500 r WHERE r.vlTerc = :vlTerc"),
    @NamedQuery(name = "Reg1500.findByVlDa", query = "SELECT r FROM Reg1500 r WHERE r.vlDa = :vlDa"),
    @NamedQuery(name = "Reg1500.findByVlBcIcms", query = "SELECT r FROM Reg1500 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "Reg1500.findByVlIcms", query = "SELECT r FROM Reg1500 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "Reg1500.findByVlBcIcmsSt", query = "SELECT r FROM Reg1500 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "Reg1500.findByVlIcmsSt", query = "SELECT r FROM Reg1500 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "Reg1500.findByCodInf", query = "SELECT r FROM Reg1500 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "Reg1500.findByVlPis", query = "SELECT r FROM Reg1500 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "Reg1500.findByVlCofis", query = "SELECT r FROM Reg1500 r WHERE r.vlCofis = :vlCofis"),
    @NamedQuery(name = "Reg1500.findByTpLigacao", query = "SELECT r FROM Reg1500 r WHERE r.tpLigacao = :tpLigacao"),
    @NamedQuery(name = "Reg1500.findByCodGrupoTensao", query = "SELECT r FROM Reg1500 r WHERE r.codGrupoTensao = :codGrupoTensao")})
public class Reg1500 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_PAI")
    private long idPai;
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private long hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "IND_OPER")
    private String indOper;
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "COD_SIT")
    private String codSit;
    @Column(name = "SER")
    private String ser;
    @Column(name = "SUB")
    private String sub;
    @Column(name = "COD_CONS")
    private String codCons;
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Column(name = "DT_E_S")
    @Temporal(TemporalType.DATE)
    private Date dtES;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "VL_DESC")
    private BigDecimal vlDesc;
    @Column(name = "VL_FORN")
    private BigDecimal vlForn;
    @Column(name = "VL_SERV_NT")
    private BigDecimal vlServNt;
    @Column(name = "VL_TERC")
    private BigDecimal vlTerc;
    @Column(name = "VL_DA")
    private BigDecimal vlDa;
    @Column(name = "VL_BC_ICMS")
    private BigDecimal vlBcIcms;
    @Column(name = "VL_ICMS")
    private BigDecimal vlIcms;
    @Column(name = "VL_BC_ICMS_ST")
    private BigDecimal vlBcIcmsSt;
    @Column(name = "VL_ICMS_ST")
    private BigDecimal vlIcmsSt;
    @Column(name = "COD_INF")
    private String codInf;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFIS")
    private BigDecimal vlCofis;
    @Column(name = "TP_LIGACAO")
    private String tpLigacao;
    @Column(name = "COD_GRUPO_TENSAO")
    private String codGrupoTensao;

    public Reg1500() {
    }

    public Reg1500(Long id) {
        this.id = id;
    }

    public Reg1500(Long id, long idPai, long linha, long hash) {
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

    public long getIdPai() {
        return idPai;
    }

    public void setIdPai(long idPai) {
        this.idPai = idPai;
    }

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
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

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getCodCons() {
        return codCons;
    }

    public void setCodCons(String codCons) {
        this.codCons = codCons;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Date getDtES() {
        return dtES;
    }

    public void setDtES(Date dtES) {
        this.dtES = dtES;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlForn() {
        return vlForn;
    }

    public void setVlForn(BigDecimal vlForn) {
        this.vlForn = vlForn;
    }

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlTerc() {
        return vlTerc;
    }

    public void setVlTerc(BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofis() {
        return vlCofis;
    }

    public void setVlCofis(BigDecimal vlCofis) {
        this.vlCofis = vlCofis;
    }

    public String getTpLigacao() {
        return tpLigacao;
    }

    public void setTpLigacao(String tpLigacao) {
        this.tpLigacao = tpLigacao;
    }

    public String getCodGrupoTensao() {
        return codGrupoTensao;
    }

    public void setCodGrupoTensao(String codGrupoTensao) {
        this.codGrupoTensao = codGrupoTensao;
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
        if (!(object instanceof Reg1500)) {
            return false;
        }
        Reg1500 other = (Reg1500) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1500[ id=" + id + " ]";
    }

}
