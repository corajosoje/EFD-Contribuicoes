package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c800")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC800.findAll", query = "SELECT r FROM RegC800 r"),
    @NamedQuery(name = "RegC800.findById", query = "SELECT r FROM RegC800 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC800.findByIdPai", query = "SELECT r FROM RegC800 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC800.findByLinha", query = "SELECT r FROM RegC800 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC800.findByHashfile", query = "SELECT r FROM RegC800 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC800.findByReg", query = "SELECT r FROM RegC800 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC800.findByCodMod", query = "SELECT r FROM RegC800 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC800.findByCodSit", query = "SELECT r FROM RegC800 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegC800.findByNumCfe", query = "SELECT r FROM RegC800 r WHERE r.numCfe = :numCfe"),
    @NamedQuery(name = "RegC800.findByDtDoc", query = "SELECT r FROM RegC800 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC800.findByVlCfe", query = "SELECT r FROM RegC800 r WHERE r.vlCfe = :vlCfe"),
    @NamedQuery(name = "RegC800.findByVlPis", query = "SELECT r FROM RegC800 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC800.findByVlCofins", query = "SELECT r FROM RegC800 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC800.findByCnpjCpf", query = "SELECT r FROM RegC800 r WHERE r.cnpjCpf = :cnpjCpf"),
    @NamedQuery(name = "RegC800.findByNrSat", query = "SELECT r FROM RegC800 r WHERE r.nrSat = :nrSat"),
    @NamedQuery(name = "RegC800.findByChvCfe", query = "SELECT r FROM RegC800 r WHERE r.chvCfe = :chvCfe"),
    @NamedQuery(name = "RegC800.findByVlDesc", query = "SELECT r FROM RegC800 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC800.findByVlMerc", query = "SELECT r FROM RegC800 r WHERE r.vlMerc = :vlMerc"),
    @NamedQuery(name = "RegC800.findByVlOutDa", query = "SELECT r FROM RegC800 r WHERE r.vlOutDa = :vlOutDa"),
    @NamedQuery(name = "RegC800.findByVlIcms", query = "SELECT r FROM RegC800 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC800.findByVlPisSt", query = "SELECT r FROM RegC800 r WHERE r.vlPisSt = :vlPisSt"),
    @NamedQuery(name = "RegC800.findByVlCofinsSt", query = "SELECT r FROM RegC800 r WHERE r.vlCofinsSt = :vlCofinsSt")})
@Registros(nivel = 2)
public class RegC800 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC001 idPai;

    public RegC001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC001) idPai;
    }

    public RegC800() {
    }

    public RegC800(String id) {
        this.id = id;
    }

    public RegC800(String id, RegC001 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC810> regC810;

    public List<RegC810> getRegC810() {
        return regC810;
    }

    public void setRegC810(List<RegC810> regC810) {
        this.regC810 = regC810;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC850> regC850;

    public List<RegC850> getRegC850() {
        return regC850;
    }

    public void setRegC850(List<RegC850> regC850) {
        this.regC850 = regC850;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC855> regC855;

    public List<RegC855> getRegC855() {
        return regC855;
    }

    public void setRegC855(List<RegC855> regC855) {
        this.regC855 = regC855;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_SIT")
    private String codSit;
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "NUM_CFE")
    private int numCfe;
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_CFE", precision = 15, scale = 6)
    private BigDecimal vlCfe;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CNPJ_CPF")
    private String cnpjCpf;
    @Campos(posicao = 10, tipo = 'I')
    @Column(name = "NR_SAT")
    private int nrSat;
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "CHV_CFE")
    private String chvCfe;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_MERC", precision = 15, scale = 6)
    private BigDecimal vlMerc;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_OUT_DA", precision = 15, scale = 6)
    private BigDecimal vlOutDa;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_PIS_ST", precision = 15, scale = 6)
    private BigDecimal vlPisSt;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_COFINS_ST", precision = 15, scale = 6)
    private BigDecimal vlCofinsSt;

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

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    public int getNumCfe() {
        return numCfe;
    }

    public void setNumCfe(int numCfe) {
        this.numCfe = numCfe;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlCfe() {
        return vlCfe;
    }

    public void setVlCfe(BigDecimal vlCfe) {
        this.vlCfe = vlCfe;
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

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public int getNrSat() {
        return nrSat;
    }

    public void setNrSat(int nrSat) {
        this.nrSat = nrSat;
    }

    public String getChvCfe() {
        return chvCfe;
    }

    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public BigDecimal getVlOutDa() {
        return vlOutDa;
    }

    public void setVlOutDa(BigDecimal vlOutDa) {
        this.vlOutDa = vlOutDa;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(BigDecimal vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public BigDecimal getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(BigDecimal vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
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
        if (!(object instanceof RegC800)) {
            return false;
        }
        RegC800 other = (RegC800) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC800[ id=" + id + " ]";
    }

}
