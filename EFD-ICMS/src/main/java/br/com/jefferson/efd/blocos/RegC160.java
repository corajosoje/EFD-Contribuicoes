package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c160")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC160.findAll", query = "SELECT r FROM RegC160 r"),
    @NamedQuery(name = "RegC160.findById", query = "SELECT r FROM RegC160 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC160.findByIdPai", query = "SELECT r FROM RegC160 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC160.findByLinha", query = "SELECT r FROM RegC160 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC160.findByHashfile", query = "SELECT r FROM RegC160 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC160.findByReg", query = "SELECT r FROM RegC160 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC160.findByCodPart", query = "SELECT r FROM RegC160 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC160.findByVeicId", query = "SELECT r FROM RegC160 r WHERE r.veicId = :veicId"),
    @NamedQuery(name = "RegC160.findByQtdVol", query = "SELECT r FROM RegC160 r WHERE r.qtdVol = :qtdVol"),
    @NamedQuery(name = "RegC160.findByPesoBrt", query = "SELECT r FROM RegC160 r WHERE r.pesoBrt = :pesoBrt"),
    @NamedQuery(name = "RegC160.findByPesoLiq", query = "SELECT r FROM RegC160 r WHERE r.pesoLiq = :pesoLiq"),
    @NamedQuery(name = "RegC160.findByUfId", query = "SELECT r FROM RegC160 r WHERE r.ufId = :ufId")})
@Registros(nivel = 3)
public class RegC160 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC100) idPai;
    }

    public RegC160() {
    }

    public RegC160(String id) {
        this.id = id;
    }

    public RegC160(String id, RegC100 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "VEIC_ID")
    private String veicId;
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "QTD_VOL")
    private int qtdVol;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "PESO_BRT", precision = 15, scale = 6)
    private BigDecimal pesoBrt;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "PESO_LIQ", precision = 15, scale = 6)
    private BigDecimal pesoLiq;
    @Campos(posicao = 7, tipo = 'C')
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
