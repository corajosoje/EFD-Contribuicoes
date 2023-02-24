package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.util.Date;
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
@Table(name = "reg_1910")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1910.findAll", query = "SELECT r FROM Reg1910 r"),
    @NamedQuery(name = "Reg1910.findById", query = "SELECT r FROM Reg1910 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1910.findByIdPai", query = "SELECT r FROM Reg1910 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1910.findByLinha", query = "SELECT r FROM Reg1910 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1910.findByHashfile", query = "SELECT r FROM Reg1910 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1910.findByReg", query = "SELECT r FROM Reg1910 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1910.findByDtIni", query = "SELECT r FROM Reg1910 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "Reg1910.findByDtFin", query = "SELECT r FROM Reg1910 r WHERE r.dtFin = :dtFin")})
@Registros(nivel = 3)
public class Reg1910 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1900 idPai;

    public Reg1900 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1900) idPai;
    }

    public Reg1910() {
    }

    public Reg1910(Long id) {
        this.id = id;
    }

    public Reg1910(Long id, Reg1900 idPai, long linha, String hashfile) {
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1920 reg1920;

    public Reg1920 getReg1920() {
        return reg1920;
    }

    public void setReg1920(Reg1920 reg1920) {
        this.reg1920 = reg1920;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    private Date dtIni;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_FIN")
    @Temporal(TemporalType.DATE)
    private Date dtFin;

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

    public Date getDtIni() {
        return dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    public Date getDtFin() {
        return dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
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
        if (!(object instanceof Reg1910)) {
            return false;
        }
        Reg1910 other = (Reg1910) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1910[ id=" + id + " ]";
    }

}
