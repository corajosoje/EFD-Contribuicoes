
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c160")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC160.findAll", query = "SELECT r FROM RegC160 r"),
    @NamedQuery(name = "RegC160.findById", query = "SELECT r FROM RegC160 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC160.findByIdPai", query = "SELECT r FROM RegC160 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC160.findByLinha", query = "SELECT r FROM RegC160 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC160.findByHash", query = "SELECT r FROM RegC160 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC160.findByReg", query = "SELECT r FROM RegC160 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC160.findByCodPart", query = "SELECT r FROM RegC160 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC160.findByVeicId", query = "SELECT r FROM RegC160 r WHERE r.veicId = :veicId"),
    @NamedQuery(name = "RegC160.findByQtdVol", query = "SELECT r FROM RegC160 r WHERE r.qtdVol = :qtdVol"),
    @NamedQuery(name = "RegC160.findByPesoBrt", query = "SELECT r FROM RegC160 r WHERE r.pesoBrt = :pesoBrt"),
    @NamedQuery(name = "RegC160.findByPesoLiq", query = "SELECT r FROM RegC160 r WHERE r.pesoLiq = :pesoLiq"),
    @NamedQuery(name = "RegC160.findByUfId", query = "SELECT r FROM RegC160 r WHERE r.ufId = :ufId")})
public class RegC160 implements Serializable {

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
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "VEIC_ID")
    private String veicId;
    @Column(name = "QTD_VOL")
    private String qtdVol;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO_BRT")
    private BigDecimal pesoBrt;
    @Column(name = "PESO_LIQ")
    private BigDecimal pesoLiq;
    @Column(name = "UF_ID")
    private String ufId;

    public RegC160() {
    }

    public RegC160(Long id) {
        this.id = id;
    }

    public RegC160(Long id, long idPai, long linha, long hash) {
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

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public String getQtdVol() {
        return qtdVol;
    }

    public void setQtdVol(String qtdVol) {
        this.qtdVol = qtdVol;
    }

    public BigDecimal getPesoBrt() {
        return pesoBrt;
    }

    public void setPesoBrt(BigDecimal pesoBrt) {
        this.pesoBrt = pesoBrt;
    }

    public BigDecimal getPesoLiq() {
        return pesoLiq;
    }

    public void setPesoLiq(BigDecimal pesoLiq) {
        this.pesoLiq = pesoLiq;
    }

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
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
        if (!(object instanceof RegC160)) {
            return false;
        }
        RegC160 other = (RegC160) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC160[ id=" + id + " ]";
    }

}
