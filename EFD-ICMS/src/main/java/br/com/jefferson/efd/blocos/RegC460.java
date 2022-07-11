
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
    @NamedQuery(name = "RegC460.findByNomeAdq", query = "SELECT r FROM RegC460 r WHERE r.nomeAdq = :nomeAdq")})
public class RegC460 implements Serializable {

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
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "COD_SIT")
    private String codSit;
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DOC")
    private BigDecimal vlDoc;
    @Column(name = "VL_PIS")
    private BigDecimal vlPis;
    @Column(name = "VL_COFINS")
    private BigDecimal vlCofins;
    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;
    @Column(name = "NOME_ADQ")
    private String nomeAdq;

    public RegC460() {
    }

    public RegC460(Long id) {
        this.id = id;
    }

    public RegC460(Long id, long idPai, long linha, long hash) {
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

    public String getNomeAdq() {
        return nomeAdq;
    }

    public void setNomeAdq(String nomeAdq) {
        this.nomeAdq = nomeAdq;
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
