package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
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
@Table(name = "reg_k100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK100.findAll", query = "SELECT r FROM RegK100 r"),
    @NamedQuery(name = "RegK100.findById", query = "SELECT r FROM RegK100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK100.findByIdPai", query = "SELECT r FROM RegK100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK100.findByLinha", query = "SELECT r FROM RegK100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK100.findByHashfile", query = "SELECT r FROM RegK100 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK100.findByReg", query = "SELECT r FROM RegK100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK100.findByDtIni", query = "SELECT r FROM RegK100 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "RegK100.findByDtFin", query = "SELECT r FROM RegK100 r WHERE r.dtFin = :dtFin")})
@Registros(nivel = 2)
public class RegK100 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK001 idPai;

    public RegK001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK001) idPai;
    }

    public RegK100() {
    }

    public RegK100(String id) {
        this.id = id;
    }

    public RegK100(String id, RegK001 idPai, long linha, String hashfile) {
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
    private List<RegK200> regK200;

    public List<RegK200> getRegK200() {
        return regK200;
    }

    public void setRegK200(List<RegK200> regK200) {
        this.regK200 = regK200;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK210> regK210;

    public List<RegK210> getRegK210() {
        return regK210;
    }

    public void setRegK210(List<RegK210> regK210) {
        this.regK210 = regK210;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK220> regK220;

    public List<RegK220> getRegK220() {
        return regK220;
    }

    public void setRegK220(List<RegK220> regK220) {
        this.regK220 = regK220;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK230> regK230;

    public List<RegK230> getRegK230() {
        return regK230;
    }

    public void setRegK230(List<RegK230> regK230) {
        this.regK230 = regK230;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK250> regK250;

    public List<RegK250> getRegK250() {
        return regK250;
    }

    public void setRegK250(List<RegK250> regK250) {
        this.regK250 = regK250;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK260> regK260;

    public List<RegK260> getRegK260() {
        return regK260;
    }

    public void setRegK260(List<RegK260> regK260) {
        this.regK260 = regK260;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK270> regK270;

    public List<RegK270> getRegK270() {
        return regK270;
    }

    public void setRegK270(List<RegK270> regK270) {
        this.regK270 = regK270;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK280> regK280;

    public List<RegK280> getRegK280() {
        return regK280;
    }

    public void setRegK280(List<RegK280> regK280) {
        this.regK280 = regK280;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK290> regK290;

    public List<RegK290> getRegK290() {
        return regK290;
    }

    public void setRegK290(List<RegK290> regK290) {
        this.regK290 = regK290;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK300> regK300;

    public List<RegK300> getRegK300() {
        return regK300;
    }

    public void setRegK300(List<RegK300> regK300) {
        this.regK300 = regK300;
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
        if (!(object instanceof RegK100)) {
            return false;
        }
        RegK100 other = (RegK100) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK100[ id=" + id + " ]";
    }

}
