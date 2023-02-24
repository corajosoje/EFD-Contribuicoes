package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "RegC165.findByHashfile", query = "SELECT r FROM RegC165 r WHERE r.hashfile = :hashfile"),
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
@Registros(nivel = 3)
public class RegC165 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC100) idPai;
    }

    public RegC165() {
    }

    public RegC165(Long id) {
        this.id = id;
    }

    public RegC165(Long id, RegC100 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "VEIC_ID")
    private String veicId;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_AUT")
    private String codAut;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "NR_PASSE")
    private String nrPasse;
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "HORA")
    private int hora;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "TEMPER", precision = 15, scale = 6)
    private BigDecimal temper;
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "QTD_VOL")
    private int qtdVol;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "PESO_BRT", precision = 15, scale = 6)
    private BigDecimal pesoBrt;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "PESO_LIQ", precision = 15, scale = 6)
    private BigDecimal pesoLiq;
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "NOM_MOT")
    private String nomMot;
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "CPF")
    private String cpf;
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "UF_ID")
    private String ufId;

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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
