package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_c165")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC165.findAll", query = "SELECT r FROM RegC165 r"),
    @NamedQuery(name = "RegC165.findById", query = "SELECT r FROM RegC165 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC165.findByIdPai", query = "SELECT r FROM RegC165 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC165.findByLinha", query = "SELECT r FROM RegC165 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC165.findByHash", query = "SELECT r FROM RegC165 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC165.findByReg", query = "SELECT r FROM RegC165 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC165.findByCodPart", query = "SELECT r FROM RegC165 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC165.findByVeicId", query = "SELECT r FROM RegC165 r WHERE r.veicId = :veicId"),
    @NamedQuery(name = "RegC165.findByCodAut", query = "SELECT r FROM RegC165 r WHERE r.codAut = :codAut"),
    @NamedQuery(name = "RegC165.findByNrPasse", query = "SELECT r FROM RegC165 r WHERE r.nrPasse = :nrPasse"),
    @NamedQuery(name = "RegC165.findByHora", query = "SELECT r FROM RegC165 r WHERE r.hora = :hora"),
    @NamedQuery(name = "RegC165.findByTemper", query = "SELECT r FROM RegC165 r WHERE r.temper = :temper"),
    @NamedQuery(name = "RegC165.findByQtdVol", query = "SELECT r FROM RegC165 r WHERE r.qtdVol = :qtdVol"),
    @NamedQuery(name = "RegC165.findByPesoBrt", query = "SELECT r FROM RegC165 r WHERE r.pesoBrt = :pesoBrt"),
    @NamedQuery(name = "RegC165.findByPesoLiq", query = "SELECT r FROM RegC165 r WHERE r.pesoLiq = :pesoLiq"),
    @NamedQuery(name = "RegC165.findByNomMot", query = "SELECT r FROM RegC165 r WHERE r.nomMot = :nomMot"),
    @NamedQuery(name = "RegC165.findByCpf", query = "SELECT r FROM RegC165 r WHERE r.cpf = :cpf"),
    @NamedQuery(name = "RegC165.findByUfId", query = "SELECT r FROM RegC165 r WHERE r.ufId = :ufId")})
public class RegC165 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "COD_PART")
    private String codPart;
    @Column(name = "VEIC_ID")
    private String veicId;
    @Column(name = "COD_AUT")
    private String codAut;
    @Column(name = "NR_PASSE")
    private String nrPasse;
    @Column(name = "HORA")
    private int hora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TEMPER")
    private BigDecimal temper;
    @Column(name = "QTD_VOL")
    private int qtdVol;
    @Column(name = "PESO_BRT")
    private BigDecimal pesoBrt;
    @Column(name = "PESO_LIQ")
    private BigDecimal pesoLiq;
    @Column(name = "NOM_MOT")
    private String nomMot;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "UF_ID")
    private String ufId;

    public RegC165() {
    }

    public RegC165(Long id) {
        this.id = id;
    }

    public RegC165(Long id, long idPai, long linha, String hash) {
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

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }

    public String getNrPasse() {
        return nrPasse;
    }

    public void setNrPasse(String nrPasse) {
        this.nrPasse = nrPasse;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public BigDecimal getTemper() {
        return temper;
    }

    public void setTemper(BigDecimal temper) {
        this.temper = temper;
    }

    public int getQtdVol() {
        return qtdVol;
    }

    public void setQtdVol(int qtdVol) {
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

    public String getNomMot() {
        return nomMot;
    }

    public void setNomMot(String nomMot) {
        this.nomMot = nomMot;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        if (!(object instanceof RegC165)) {
            return false;
        }
        RegC165 other = (RegC165) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC165[ id=" + id + " ]";
    }

}
