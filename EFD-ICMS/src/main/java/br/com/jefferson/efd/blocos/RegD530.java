package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_d530")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD530.findAll", query = "SELECT r FROM RegD530 r"),
    @NamedQuery(name = "RegD530.findById", query = "SELECT r FROM RegD530 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD530.findByIdPai", query = "SELECT r FROM RegD530 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD530.findByLinha", query = "SELECT r FROM RegD530 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD530.findByHashfile", query = "SELECT r FROM RegD530 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD530.findByReg", query = "SELECT r FROM RegD530 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD530.findByIndServ", query = "SELECT r FROM RegD530 r WHERE r.indServ = :indServ"),
    @NamedQuery(name = "RegD530.findByDtIniServ", query = "SELECT r FROM RegD530 r WHERE r.dtIniServ = :dtIniServ"),
    @NamedQuery(name = "RegD530.findByDtFinServ", query = "SELECT r FROM RegD530 r WHERE r.dtFinServ = :dtFinServ"),
    @NamedQuery(name = "RegD530.findByPerFiscal", query = "SELECT r FROM RegD530 r WHERE r.perFiscal = :perFiscal"),
    @NamedQuery(name = "RegD530.findByCodArea", query = "SELECT r FROM RegD530 r WHERE r.codArea = :codArea"),
    @NamedQuery(name = "RegD530.findByTerminal", query = "SELECT r FROM RegD530 r WHERE r.terminal = :terminal")})
@Registros(nivel = 3)
public class RegD530 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD500 idPai;

    public RegD500 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD500) idPai;
    }

    public RegD530() {
    }

    public RegD530(Long id) {
        this.id = id;
    }

    public RegD530(Long id, RegD500 idPai, long linha, String hashfile) {
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
    @Column(name = "IND_SERV")
    private String indServ;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_INI_SERV")
    @Temporal(TemporalType.DATE)
    private Date dtIniServ;
    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_FIN_SERV")
    @Temporal(TemporalType.DATE)
    private Date dtFinServ;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "PER_FISCAL")
    private String perFiscal;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_AREA")
    private String codArea;
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "TERMINAL")
    private int terminal;

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

    public String getIndServ() {
        return indServ;
    }

    public void setIndServ(String indServ) {
        this.indServ = indServ;
    }

    public Date getDtIniServ() {
        return dtIniServ;
    }

    public void setDtIniServ(Date dtIniServ) {
        this.dtIniServ = dtIniServ;
    }

    public Date getDtFinServ() {
        return dtFinServ;
    }

    public void setDtFinServ(Date dtFinServ) {
        this.dtFinServ = dtFinServ;
    }

    public String getPerFiscal() {
        return perFiscal;
    }

    public void setPerFiscal(String perFiscal) {
        this.perFiscal = perFiscal;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public int getTerminal() {
        return terminal;
    }

    public void setTerminal(int terminal) {
        this.terminal = terminal;
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
        if (!(object instanceof RegD530)) {
            return false;
        }
        RegD530 other = (RegD530) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD530[ id=" + id + " ]";
    }

}
