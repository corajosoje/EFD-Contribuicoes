
package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
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
@Table(name = "reg_1350")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1350.findAll", query = "SELECT r FROM Reg1350 r"),
    @NamedQuery(name = "Reg1350.findById", query = "SELECT r FROM Reg1350 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1350.findByIdPai", query = "SELECT r FROM Reg1350 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1350.findByLinha", query = "SELECT r FROM Reg1350 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1350.findByHash", query = "SELECT r FROM Reg1350 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1350.findByReg", query = "SELECT r FROM Reg1350 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1350.findBySerie", query = "SELECT r FROM Reg1350 r WHERE r.serie = :serie"),
    @NamedQuery(name = "Reg1350.findByFabricante", query = "SELECT r FROM Reg1350 r WHERE r.fabricante = :fabricante"),
    @NamedQuery(name = "Reg1350.findByModelo", query = "SELECT r FROM Reg1350 r WHERE r.modelo = :modelo"),
    @NamedQuery(name = "Reg1350.findByTipoMedicao", query = "SELECT r FROM Reg1350 r WHERE r.tipoMedicao = :tipoMedicao")})
public class Reg1350 implements Serializable {

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
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "FABRICANTE")
    private String fabricante;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "TIPO_MEDICAO")
    private String tipoMedicao;

    public Reg1350() {
    }

    public Reg1350(Long id) {
        this.id = id;
    }

    public Reg1350(Long id, long idPai, long linha, String hash) {
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMedicao() {
        return tipoMedicao;
    }

    public void setTipoMedicao(String tipoMedicao) {
        this.tipoMedicao = tipoMedicao;
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
        if (!(object instanceof Reg1350)) {
            return false;
        }
        Reg1350 other = (Reg1350) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1350[ id=" + id + " ]";
    }

}
