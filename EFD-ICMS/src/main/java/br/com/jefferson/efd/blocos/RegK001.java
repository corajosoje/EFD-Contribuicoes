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
@Table(name = "reg_k001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK001.findAll", query = "SELECT r FROM RegK001 r"),
    @NamedQuery(name = "RegK001.findById", query = "SELECT r FROM RegK001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK001.findByIdPai", query = "SELECT r FROM RegK001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK001.findByLinha", query = "SELECT r FROM RegK001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK001.findByHashfile", query = "SELECT r FROM RegK001 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK001.findByReg", query = "SELECT r FROM RegK001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK001.findByIndMov", query = "SELECT r FROM RegK001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class RegK001 implements Serializable {

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

    public RegK001() {
    }

    public RegK001(Long id) {
        this.id = id;
    }

    public RegK001(Long id, Reg0000 idPai, long linha, String hashfile) {
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
    private RegK010 regK010;

    public RegK010 getRegK010() {
        return regK010;
    }

    public void setRegK010(RegK010 regK010) {
        this.regK010 = regK010;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK100> regK100;

    public List<RegK100> getRegK100() {
        return regK100;
    }

    public void setRegK100(List<RegK100> regK100) {
        this.regK100 = regK100;
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
        if (!(object instanceof RegK001)) {
            return false;
        }
        RegK001 other = (RegK001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK001[ id=" + id + " ]";
    }

}
