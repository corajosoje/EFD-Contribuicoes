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
@Table(name = "reg_c350")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC350.findAll", query = "SELECT r FROM RegC350 r"),
    @NamedQuery(name = "RegC350.findById", query = "SELECT r FROM RegC350 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC350.findByIdPai", query = "SELECT r FROM RegC350 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC350.findByLinha", query = "SELECT r FROM RegC350 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC350.findByHashfile", query = "SELECT r FROM RegC350 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC350.findByReg", query = "SELECT r FROM RegC350 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC350.findBySer", query = "SELECT r FROM RegC350 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC350.findBySubSer", query = "SELECT r FROM RegC350 r WHERE r.subSer = :subSer"),
    @NamedQuery(name = "RegC350.findByNumDoc", query = "SELECT r FROM RegC350 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC350.findByDtDoc", query = "SELECT r FROM RegC350 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC350.findByCnpjCpf", query = "SELECT r FROM RegC350 r WHERE r.cnpjCpf = :cnpjCpf"),
    @NamedQuery(name = "RegC350.findByVlMerc", query = "SELECT r FROM RegC350 r WHERE r.vlMerc = :vlMerc"),
    @NamedQuery(name = "RegC350.findByVlDoc", query = "SELECT r FROM RegC350 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC350.findByVlDesc", query = "SELECT r FROM RegC350 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC350.findByVlPis", query = "SELECT r FROM RegC350 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC350.findByVlCofis", query = "SELECT r FROM RegC350 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC350.findByCodCta", query = "SELECT r FROM RegC350 r WHERE r.codCta = :codCta")})
@Registros(nivel = 2)
public class RegC350 implements Serializable {

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

    public RegC350() {
    }

    public RegC350(String id) {
        this.id = id;
    }

    public RegC350(String id, RegC001 idPai, long linha, String hashfile) {
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
    private List<RegC370> regC370;

    public List<RegC370> getRegC370() {
        return regC370;
    }

    public void setRegC370(List<RegC370> regC370) {
        this.regC370 = regC370;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC390> regC390;

    public List<RegC390> getRegC390() {
        return regC390;
    }

    public void setRegC390(List<RegC390> regC390) {
        this.regC390 = regC390;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "SUB_SER")
    private String subSer;
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CNPJ_CPF")
    private String cnpjCpf;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_MERC", precision = 15, scale = 6)
    private BigDecimal vlMerc;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 12, tipo = 'C')
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

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSubSer() {
        return subSer;
    }

    public void setSubSer(String subSer) {
        this.subSer = subSer;
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

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
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
        if (!(object instanceof RegC350)) {
            return false;
        }
        RegC350 other = (RegC350) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC350[ id=" + id + " ]";
    }

}
