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
@Table(name = "reg_c600")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC600.findAll", query = "SELECT r FROM RegC600 r"),
    @NamedQuery(name = "RegC600.findById", query = "SELECT r FROM RegC600 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC600.findByIdPai", query = "SELECT r FROM RegC600 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC600.findByLinha", query = "SELECT r FROM RegC600 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC600.findByHashfile", query = "SELECT r FROM RegC600 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC600.findByReg", query = "SELECT r FROM RegC600 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC600.findByCodMod", query = "SELECT r FROM RegC600 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC600.findByCodMun", query = "SELECT r FROM RegC600 r WHERE r.codMun = :codMun"),
    @NamedQuery(name = "RegC600.findBySer", query = "SELECT r FROM RegC600 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC600.findBySub", query = "SELECT r FROM RegC600 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegC600.findByCodCons", query = "SELECT r FROM RegC600 r WHERE r.codCons = :codCons"),
    @NamedQuery(name = "RegC600.findByQtdCons", query = "SELECT r FROM RegC600 r WHERE r.qtdCons = :qtdCons"),
    @NamedQuery(name = "RegC600.findByQtdCanc", query = "SELECT r FROM RegC600 r WHERE r.qtdCanc = :qtdCanc"),
    @NamedQuery(name = "RegC600.findByDtDoc", query = "SELECT r FROM RegC600 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC600.findByVlDoc", query = "SELECT r FROM RegC600 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC600.findByVlDesc", query = "SELECT r FROM RegC600 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC600.findByCons", query = "SELECT r FROM RegC600 r WHERE r.cons = :cons"),
    @NamedQuery(name = "RegC600.findByVlForn", query = "SELECT r FROM RegC600 r WHERE r.vlForn = :vlForn"),
    @NamedQuery(name = "RegC600.findByVlServNt", query = "SELECT r FROM RegC600 r WHERE r.vlServNt = :vlServNt"),
    @NamedQuery(name = "RegC600.findByVlTerc", query = "SELECT r FROM RegC600 r WHERE r.vlTerc = :vlTerc"),
    @NamedQuery(name = "RegC600.findByVlDa", query = "SELECT r FROM RegC600 r WHERE r.vlDa = :vlDa"),
    @NamedQuery(name = "RegC600.findByVlBcIcms", query = "SELECT r FROM RegC600 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC600.findByVlIcms", query = "SELECT r FROM RegC600 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC600.findByVlBcIcmsSt", query = "SELECT r FROM RegC600 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC600.findByVlIcmsSt", query = "SELECT r FROM RegC600 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC600.findByVlPis", query = "SELECT r FROM RegC600 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC600.findByVlCofins", query = "SELECT r FROM RegC600 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 2)
public class RegC600 implements Serializable {

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

    public RegC600() {
    }

    public RegC600(Long id) {
        this.id = id;
    }

    public RegC600(Long id, RegC001 idPai, long linha, String hashfile) {
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
    private List<RegC601> regC601;

    public List<RegC601> getRegC601() {
        return regC601;
    }

    public void setRegC601(List<RegC601> regC601) {
        this.regC601 = regC601;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC610> regC610;

    public List<RegC610> getRegC610() {
        return regC610;
    }

    public void setRegC610(List<RegC610> regC610) {
        this.regC610 = regC610;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC690> regC690;

    public List<RegC690> getRegC690() {
        return regC690;
    }

    public void setRegC690(List<RegC690> regC690) {
        this.regC690 = regC690;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "SUB")
    private int sub;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_CONS")
    private String codCons;
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "QTD_CONS")
    private int qtdCons;
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "QTD_CANC")
    private int qtdCanc;
    @Campos(posicao = 9, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "CONS")
    private String cons;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_FORN", precision = 15, scale = 6)
    private BigDecimal vlForn;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_SERV_NT", precision = 15, scale = 6)
    private BigDecimal vlServNt;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_TERC", precision = 15, scale = 6)
    private BigDecimal vlTerc;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_DA", precision = 15, scale = 6)
    private BigDecimal vlDa;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 22, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

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

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
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

    public int getQtdCons() {
        return qtdCons;
    }

    public void setQtdCons(int qtdCons) {
        this.qtdCons = qtdCons;
    }

    public int getQtdCanc() {
        return qtdCanc;
    }

    public void setQtdCanc(int qtdCanc) {
        this.qtdCanc = qtdCanc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
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

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
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

    @Override
    public int hashCode() {
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegC600)) {
            return false;
        }
        RegC600 other = (RegC600) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC600[ id=" + id + " ]";
    }

}
