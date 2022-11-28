package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_e200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE200.findAll", query = "SELECT r FROM RegE200 r"),
    @NamedQuery(name = "RegE200.findById", query = "SELECT r FROM RegE200 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE200.findByIdPai", query = "SELECT r FROM RegE200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE200.findByLinha", query = "SELECT r FROM RegE200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE200.findByHash", query = "SELECT r FROM RegE200 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE200.findByReg", query = "SELECT r FROM RegE200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE200.findByUf", query = "SELECT r FROM RegE200 r WHERE r.uf = :uf"),
    @NamedQuery(name = "RegE200.findByDtIni", query = "SELECT r FROM RegE200 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "RegE200.findByDtFin", query = "SELECT r FROM RegE200 r WHERE r.dtFin = :dtFin")})
@Registros(nivel = 2)
public class RegE200 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE001 idPai;

    public RegE001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE001) idPai;
    }

    public RegE200() {
    }

    public RegE200(Long id) {
        this.id = id;
    }

    public RegE200(Long id, RegE001 idPai, long linha, String hash) {
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
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegE210 regE210;

    public RegE210 getRegE210() {
        return regE210;
    }

    public void setRegE210(RegE210 regE210) {
        this.regE210 = regE210;
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegE200)) {
            return false;
        }
        RegE200 other = (RegE200) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE200[ id=" + id + " ]";
    }

}
