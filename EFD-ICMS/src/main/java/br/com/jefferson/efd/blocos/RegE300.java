package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_e300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE300.findAll", query = "SELECT r FROM RegE300 r"),
    @NamedQuery(name = "RegE300.findById", query = "SELECT r FROM RegE300 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE300.findByIdPai", query = "SELECT r FROM RegE300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE300.findByLinha", query = "SELECT r FROM RegE300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE300.findByHashfile", query = "SELECT r FROM RegE300 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE300.findByReg", query = "SELECT r FROM RegE300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE300.findByUf", query = "SELECT r FROM RegE300 r WHERE r.uf = :uf"),
    @NamedQuery(name = "RegE300.findByDtIni", query = "SELECT r FROM RegE300 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "RegE300.findByDtFin", query = "SELECT r FROM RegE300 r WHERE r.dtFin = :dtFin")})
@Registros(nivel = 2)
public class RegE300 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE001 idPai;

    public RegE001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE001) idPai;
    }

    public RegE300() {
    }

    public RegE300(String id) {
        this.id = id;
    }

    public RegE300(String id, RegE001 idPai, long linha, String hashfile) {
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegE310 regE310;

    public RegE310 getRegE310() {
        return regE310;
    }

    public void setRegE310(RegE310 regE310) {
        this.regE310 = regE310;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "UF")
    private String uf;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    private Date dtIni;
    @Campos(posicao = 4, tipo = 'D')
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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
        if (!(object instanceof RegE300)) {
            return false;
        }
        RegE300 other = (RegE300) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE300[ id=" + id + " ]";
    }

}
