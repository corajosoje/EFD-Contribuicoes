package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c460")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC460.findAll", query = "SELECT r FROM RegC460 r"),
    @NamedQuery(name = "RegC460.findById", query = "SELECT r FROM RegC460 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC460.findByIdPai", query = "SELECT r FROM RegC460 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC460.findByLinha", query = "SELECT r FROM RegC460 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC460.findByHash", query = "SELECT r FROM RegC460 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC460.findByReg", query = "SELECT r FROM RegC460 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC460.findByCodMod", query = "SELECT r FROM RegC460 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC460.findByCodSit", query = "SELECT r FROM RegC460 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegC460.findByNumDoc", query = "SELECT r FROM RegC460 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC460.findByDtDoc", query = "SELECT r FROM RegC460 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC460.findByVlDoc", query = "SELECT r FROM RegC460 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC460.findByVlPis", query = "SELECT r FROM RegC460 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC460.findByVlCofins", query = "SELECT r FROM RegC460 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC460.findByCpfCnpj", query = "SELECT r FROM RegC460 r WHERE r.cpfCnpj = :cpfCnpj"),
    @NamedQuery(name = "RegC460.findByNomAdq", query = "SELECT r FROM RegC460 r WHERE r.nomAdq = :nomAdq")})
@Registros(nivel = 4)
public class RegC460 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC405 idPai;

    public RegC405 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC405) idPai;
    }

    public RegC460() {
    }

    public RegC460(Long id) {
        this.id = id;
    }

    public RegC460(Long id, RegC405 idPai, long linha, String hash) {
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
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC465 regC465;

    public RegC465 getRegC465() {
        return regC465;
    }

    public void setRegC465(RegC465 regC465) {
        this.regC465 = regC465;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC470> regC470;

    public List<RegC470> getRegC470() {
        return regC470;
    }

    public void setRegC470(List<RegC470> regC470) {
        this.regC470 = regC470;
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
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "NOM_ADQ")
    private String nomAdq;

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

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNomAdq() {
        return nomAdq;
    }

    public void setNomAdq(String nomAdq) {
        this.nomAdq = nomAdq;
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
        if (!(object instanceof RegC460)) {
            return false;
        }
        RegC460 other = (RegC460) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC460[ id=" + id + " ]";
    }

}
