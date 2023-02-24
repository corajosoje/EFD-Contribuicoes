package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @NamedQuery(name = "Reg1500.findByHashfile", query = "SELECT r FROM Reg1500 r WHERE r.hashfile = :hashfile"),
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
    @NamedQuery(name = "Reg1500.findByVlCofis", query = "SELECT r FROM Reg1500 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "Reg1500.findByTpLigacao", query = "SELECT r FROM Reg1500 r WHERE r.tpLigacao = :tpLigacao"),
    @NamedQuery(name = "Reg1500.findByCodGrupoTensao", query = "SELECT r FROM Reg1500 r WHERE r.codGrupoTensao = :codGrupoTensao")})
@Registros(nivel = 2)
public class Reg1500 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    public Reg1001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1001) idPai;
    }

    public Reg1500() {
    }

    public Reg1500(Long id) {
        this.id = id;
    }

    public Reg1500(Long id, Reg1001 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1510> reg1510;

    public List<Reg1510> getReg1510() {
        return reg1510;
    }

    public void setReg1510(List<Reg1510> reg1510) {
        this.reg1510 = reg1510;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_OPER")
    private String indOper;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_SIT")
    private String codSit;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "SUB")
    private int sub;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "COD_CONS")
    private String codCons;
    @Campos(posicao = 10, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 11, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 12, tipo = 'D')
    @Column(name = "DT_E_S")
    @Temporal(TemporalType.DATE)
    private Date dtES;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_FORN", precision = 15, scale = 6)
    private BigDecimal vlForn;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_SERV_NT", precision = 15, scale = 6)
    private BigDecimal vlServNt;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_TERC", precision = 15, scale = 6)
    private BigDecimal vlTerc;
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_DA", precision = 15, scale = 6)
    private BigDecimal vlDa;
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;
    @Campos(posicao = 22, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;
    @Campos(posicao = 23, tipo = 'C')
    @Column(name = "COD_INF")
    private String codInf;
    @Campos(posicao = 24, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 25, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 26, tipo = 'C')
    @Column(name = "TP_LIGACAO")
    private String tpLigacao;
    @Campos(posicao = 27, tipo = 'C')
    @Column(name = "COD_GRUPO_TENSAO")
    private String codGrupoTensao;

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

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public String getCodCons() {
        return codCons;
    }

    public void setCodCons(String codCons) {
        this.codCons = codCons;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
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

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
