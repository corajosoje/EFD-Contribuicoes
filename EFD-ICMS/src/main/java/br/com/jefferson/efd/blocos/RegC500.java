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
@Table(name = "reg_c500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC500.findAll", query = "SELECT r FROM RegC500 r"),
    @NamedQuery(name = "RegC500.findById", query = "SELECT r FROM RegC500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC500.findByIdPai", query = "SELECT r FROM RegC500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC500.findByLinha", query = "SELECT r FROM RegC500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC500.findByHashfile", query = "SELECT r FROM RegC500 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC500.findByReg", query = "SELECT r FROM RegC500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC500.findByIndOper", query = "SELECT r FROM RegC500 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegC500.findByIndEmit", query = "SELECT r FROM RegC500 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegC500.findByCodPart", query = "SELECT r FROM RegC500 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC500.findByCodMod", query = "SELECT r FROM RegC500 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC500.findByCodSit", query = "SELECT r FROM RegC500 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegC500.findBySer", query = "SELECT r FROM RegC500 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC500.findBySub", query = "SELECT r FROM RegC500 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegC500.findByCodCons", query = "SELECT r FROM RegC500 r WHERE r.codCons = :codCons"),
    @NamedQuery(name = "RegC500.findByNumDoc", query = "SELECT r FROM RegC500 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC500.findByDtDoc", query = "SELECT r FROM RegC500 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC500.findByDtES", query = "SELECT r FROM RegC500 r WHERE r.dtES = :dtES"),
    @NamedQuery(name = "RegC500.findByVlDoc", query = "SELECT r FROM RegC500 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC500.findByVlDesc", query = "SELECT r FROM RegC500 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC500.findByVlForn", query = "SELECT r FROM RegC500 r WHERE r.vlForn = :vlForn"),
    @NamedQuery(name = "RegC500.findByVlServNt", query = "SELECT r FROM RegC500 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "RegC500.findByVlTerc", query = "SELECT r FROM RegC500 r WHERE r.vlTerc = :vlTerc"),
    @NamedQuery(name = "RegC500.findByVlDa", query = "SELECT r FROM RegC500 r WHERE r.vlDa = :vlDa"),
    @NamedQuery(name = "RegC500.findByVlBcIcms", query = "SELECT r FROM RegC500 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC500.findByVlIcms", query = "SELECT r FROM RegC500 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC500.findByVlBcIcmsSt", query = "SELECT r FROM RegC500 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC500.findByVlIcmsSt", query = "SELECT r FROM RegC500 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC500.findByCodInf", query = "SELECT r FROM RegC500 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "RegC500.findByVlPis", query = "SELECT r FROM RegC500 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC500.findByVlCofins", query = "SELECT r FROM RegC500 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC500.findByTpLigacao", query = "SELECT r FROM RegC500 r WHERE r.tpLigacao = :tpLigacao"),
    @NamedQuery(name = "RegC500.findByCodGrupoTensao", query = "SELECT r FROM RegC500 r WHERE r.codGrupoTensao = :codGrupoTensao"),
    @NamedQuery(name = "RegC500.findByChvDoce", query = "SELECT r FROM RegC500 r WHERE r.chvDoce = :chvDoce"),
    @NamedQuery(name = "RegC500.findByFinDoce", query = "SELECT r FROM RegC500 r WHERE r.finDoce = :finDoce"),
    @NamedQuery(name = "RegC500.findByChvDoceRef", query = "SELECT r FROM RegC500 r WHERE r.chvDoceRef = :chvDoceRef"),
    @NamedQuery(name = "RegC500.findByIndDest", query = "SELECT r FROM RegC500 r WHERE r.indDest = :indDest"),
    @NamedQuery(name = "RegC500.findByCodMunDest", query = "SELECT r FROM RegC500 r WHERE r.codMunDest = :codMunDest"),
    @NamedQuery(name = "RegC500.findByCodCta", query = "SELECT r FROM RegC500 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegC500.findByCodModDocRef", query = "SELECT r FROM RegC500 r WHERE r.codModDocRef = :codModDocRef"),
    @NamedQuery(name = "RegC500.findByHashfileDocRef", query = "SELECT r FROM RegC500 r WHERE r.hashfileDocRef = :hashfileDocRef"),
    @NamedQuery(name = "RegC500.findBySerDocRef", query = "SELECT r FROM RegC500 r WHERE r.serDocRef = :serDocRef"),
    @NamedQuery(name = "RegC500.findByNumDocRef", query = "SELECT r FROM RegC500 r WHERE r.numDocRef = :numDocRef"),
    @NamedQuery(name = "RegC500.findByMesDocRef", query = "SELECT r FROM RegC500 r WHERE r.mesDocRef = :mesDocRef"),
    @NamedQuery(name = "RegC500.findByEnerInjet", query = "SELECT r FROM RegC500 r WHERE r.enerInjet = :enerInjet"),
    @NamedQuery(name = "RegC500.findByOutrasDed", query = "SELECT r FROM RegC500 r WHERE r.outrasDed = :outrasDed")})
@Registros(nivel = 2)
public class RegC500 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC001 idPai;

    public RegC001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC001) idPai;
    }

    public RegC500() {
    }

    public RegC500(Long id) {
        this.id = id;
    }

    public RegC500(Long id, RegC001 idPai, long linha, String hashfile) {
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
    private List<RegC510> regC510;

    public List<RegC510> getRegC510() {
        return regC510;
    }

    public void setRegC510(List<RegC510> regC510) {
        this.regC510 = regC510;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC590> regC590;

    public List<RegC590> getRegC590() {
        return regC590;
    }

    public void setRegC590(List<RegC590> regC590) {
        this.regC590 = regC590;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC595> regC595;

    public List<RegC595> getRegC595() {
        return regC595;
    }

    public void setRegC595(List<RegC595> regC595) {
        this.regC595 = regC595;
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
    @Campos(posicao = 28, tipo = 'C')
    @Column(name = "CHV_DOCe")
    private String chvDoce;
    @Campos(posicao = 29, tipo = 'C')
    @Column(name = "FIN_DOCe")
    private String finDoce;
    @Campos(posicao = 30, tipo = 'C')
    @Column(name = "CHV_DOCe_REF")
    private String chvDoceRef;
    @Campos(posicao = 31, tipo = 'C')
    @Column(name = "IND_DEST")
    private String indDest;
    @Campos(posicao = 32, tipo = 'C')
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;
    @Campos(posicao = 33, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;
    @Campos(posicao = 34, tipo = 'C')
    @Column(name = "COD_MOD_DOC_REF")
    private String codModDocRef;
    @Campos(posicao = 35, tipo = 'C')
    @Column(name = "HASHFILE_DOC_REF")
    private String hashfileDocRef;
    @Campos(posicao = 36, tipo = 'C')
    @Column(name = "SER_DOC_REF")
    private String serDocRef;
    @Campos(posicao = 37, tipo = 'I')
    @Column(name = "NUM_DOC_REF")
    private int numDocRef;
    @Campos(posicao = 38, tipo = 'C')
    @Column(name = "MES_DOC_REF")
    private String mesDocRef;
    @Campos(posicao = 39, tipo = 'R')
    @Column(name = "ENER_INJET", precision = 15, scale = 6)
    private BigDecimal enerInjet;
    @Campos(posicao = 40, tipo = 'R')
    @Column(name = "OUTRAS_DED", precision = 15, scale = 6)
    private BigDecimal outrasDed;

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

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
    }

    public String getFinDoce() {
        return finDoce;
    }

    public void setFinDoce(String finDoce) {
        this.finDoce = finDoce;
    }

    public String getChvDoceRef() {
        return chvDoceRef;
    }

    public void setChvDoceRef(String chvDoceRef) {
        this.chvDoceRef = chvDoceRef;
    }

    public String getIndDest() {
        return indDest;
    }

    public void setIndDest(String indDest) {
        this.indDest = indDest;
    }

    public String getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getCodModDocRef() {
        return codModDocRef;
    }

    public void setCodModDocRef(String codModDocRef) {
        this.codModDocRef = codModDocRef;
    }

    public String getHashDocRef() {
        return hashfileDocRef;
    }

    public void setHashDocRef(String hashfileDocRef) {
        this.hashfileDocRef = hashfileDocRef;
    }

    public String getSerDocRef() {
        return serDocRef;
    }

    public void setSerDocRef(String serDocRef) {
        this.serDocRef = serDocRef;
    }

    public int getNumDocRef() {
        return numDocRef;
    }

    public void setNumDocRef(int numDocRef) {
        this.numDocRef = numDocRef;
    }

    public String getMesDocRef() {
        return mesDocRef;
    }

    public void setMesDocRef(String mesDocRef) {
        this.mesDocRef = mesDocRef;
    }

    public BigDecimal getEnerInjet() {
        return enerInjet;
    }

    public void setEnerInjet(BigDecimal enerInjet) {
        this.enerInjet = enerInjet;
    }

    public BigDecimal getOutrasDed() {
        return outrasDed;
    }

    public void setOutrasDed(BigDecimal outrasDed) {
        this.outrasDed = outrasDed;
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
        if (!(object instanceof RegC500)) {
            return false;
        }
        RegC500 other = (RegC500) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC500[ id=" + id + " ]";
    }

}
