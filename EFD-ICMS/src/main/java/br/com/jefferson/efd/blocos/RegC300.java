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
@Table(name = "reg_c300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC300.findAll", query = "SELECT r FROM RegC300 r"),
    @NamedQuery(name = "RegC300.findById", query = "SELECT r FROM RegC300 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC300.findByIdPai", query = "SELECT r FROM RegC300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC300.findByLinha", query = "SELECT r FROM RegC300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC300.findByHashfile", query = "SELECT r FROM RegC300 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC300.findByReg", query = "SELECT r FROM RegC300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC300.findByCodMod", query = "SELECT r FROM RegC300 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC300.findBySer", query = "SELECT r FROM RegC300 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC300.findBySub", query = "SELECT r FROM RegC300 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegC300.findByNumDocIni", query = "SELECT r FROM RegC300 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "RegC300.findByNumDocFin", query = "SELECT r FROM RegC300 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "RegC300.findByDtDoc", query = "SELECT r FROM RegC300 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC300.findByVlDoc", query = "SELECT r FROM RegC300 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC300.findByVlPis", query = "SELECT r FROM RegC300 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC300.findByVlCofins", query = "SELECT r FROM RegC300 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC300.findByCodCta", query = "SELECT r FROM RegC300 r WHERE r.codCta = :codCta")})
@Registros(nivel = 2)
public class RegC300 implements Serializable {

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

    public RegC300() {
    }

    public RegC300(Long id) {
        this.id = id;
    }

    public RegC300(Long id, RegC001 idPai, long linha, String hashfile) {
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
    private List<RegC310> regC310;

    public List<RegC310> getRegC310() {
        return regC310;
    }

    public void setRegC310(List<RegC310> regC310) {
        this.regC310 = regC310;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC320> regC320;

    public List<RegC320> getRegC320() {
        return regC320;
    }

    public void setRegC320(List<RegC320> regC320) {
        this.regC320 = regC320;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SUB")
    private String sub;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;
    @Campos(posicao = 7, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

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

    public int getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(int numDocIni) {
        this.numDocIni = numDocIni;
    }

    public int getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(int numDocFin) {
        this.numDocFin = numDocFin;
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

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
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
        if (!(object instanceof RegC300)) {
            return false;
        }
        RegC300 other = (RegC300) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC300[ id=" + id + " ]";
    }

}
