package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.util.Date;
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
@Table(name = "reg_e500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE500.findAll", query = "SELECT r FROM RegE500 r"),
    @NamedQuery(name = "RegE500.findById", query = "SELECT r FROM RegE500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE500.findByIdPai", query = "SELECT r FROM RegE500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE500.findByLinha", query = "SELECT r FROM RegE500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE500.findByHashfile", query = "SELECT r FROM RegE500 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE500.findByReg", query = "SELECT r FROM RegE500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE500.findByIndApur", query = "SELECT r FROM RegE500 r WHERE r.indApur = :indApur"),
    @NamedQuery(name = "RegE500.findByDtIni", query = "SELECT r FROM RegE500 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "RegE500.findByDtFin", query = "SELECT r FROM RegE500 r WHERE r.dtFin = :dtFin")})
@Registros(nivel = 2)
public class RegE500 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
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

    public RegE500() {
    }

    public RegE500(Long id) {
        this.id = id;
    }

    public RegE500(Long id, RegE001 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE510> regE510;

    public List<RegE510> getRegE510() {
        return regE510;
    }

    public void setRegE510(List<RegE510> regE510) {
        this.regE510 = regE510;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegE520 regE520;

    public RegE520 getRegE520() {
        return regE520;
    }

    public void setRegE520(RegE520 regE520) {
        this.regE520 = regE520;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_APUR")
    private String indApur;
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

    public String getIndApur() {
        return indApur;
    }

    public void setIndApur(String indApur) {
        this.indApur = indApur;
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
        if (!(object instanceof RegE500)) {
            return false;
        }
        RegE500 other = (RegE500) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE500[ id=" + id + " ]";
    }

}
