package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
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
    @NamedQuery(name = "Reg1350.findByHashfile", query = "SELECT r FROM Reg1350 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1350.findByReg", query = "SELECT r FROM Reg1350 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1350.findBySerie", query = "SELECT r FROM Reg1350 r WHERE r.serie = :serie"),
    @NamedQuery(name = "Reg1350.findByFabricante", query = "SELECT r FROM Reg1350 r WHERE r.fabricante = :fabricante"),
    @NamedQuery(name = "Reg1350.findByModelo", query = "SELECT r FROM Reg1350 r WHERE r.modelo = :modelo"),
    @NamedQuery(name = "Reg1350.findByTipoMedicao", query = "SELECT r FROM Reg1350 r WHERE r.tipoMedicao = :tipoMedicao")})
@Registros(nivel = 2)
public class Reg1350 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    public Reg1001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1001) idPai;
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
    @Column(name = "SERIE")
    private String serie;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "FABRICANTE")
    private String fabricante;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "MODELO")
    private String modelo;

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "TIPO_MEDICAO")
    private String tipoMedicao;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1360> reg1360;

    public List<Reg1360> getReg1360() {
        return reg1360;
    }

    public void setReg1360(List<Reg1360> reg1360) {
        this.reg1360 = reg1360;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1370> reg1370;

    public List<Reg1370> getReg1370() {
        return reg1370;
    }

    public void setReg1370(List<Reg1370> reg1370) {
        this.reg1370 = reg1370;
    }

    public Reg1350() {
    }

    public Reg1350(Long id) {
        this.id = id;
    }

    public Reg1350(Long id, Reg1001 idPai, long linha, String hashfile) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
