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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_e001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE001.findAll", query = "SELECT r FROM RegE001 r"),
    @NamedQuery(name = "RegE001.findById", query = "SELECT r FROM RegE001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE001.findByIdPai", query = "SELECT r FROM RegE001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE001.findByLinha", query = "SELECT r FROM RegE001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE001.findByHashfile", query = "SELECT r FROM RegE001 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE001.findByReg", query = "SELECT r FROM RegE001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE001.findByIndMov", query = "SELECT r FROM RegE001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class RegE001 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0000 idPai;

    public Reg0000 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0000) idPai;
    }

    public RegE001() {
    }

    public RegE001(Long id) {
        this.id = id;
    }

    public RegE001(Long id, Reg0000 idPai, long linha, String hashfile) {
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
    private List<RegE100> regE100;

    public List<RegE100> getRegE100() {
        return regE100;
    }

    public void setRegE100(List<RegE100> regE100) {
        this.regE100 = regE100;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE200> regE200;

    public List<RegE200> getRegE200() {
        return regE200;
    }

    public void setRegE200(List<RegE200> regE200) {
        this.regE200 = regE200;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE300> regE300;

    public List<RegE300> getRegE300() {
        return regE300;
    }

    public void setRegE300(List<RegE300> regE300) {
        this.regE300 = regE300;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE500> regE500;

    public List<RegE500> getRegE500() {
        return regE500;
    }

    public void setRegE500(List<RegE500> regE500) {
        this.regE500 = regE500;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_MOV")
    private String indMov;

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

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
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
        if (!(object instanceof RegE001)) {
            return false;
        }
        RegE001 other = (RegE001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE001[ id=" + id + " ]";
    }

}
