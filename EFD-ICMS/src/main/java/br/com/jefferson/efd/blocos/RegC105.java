package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c105")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC105.findAll", query = "SELECT r FROM RegC105 r"),
    @NamedQuery(name = "RegC105.findById", query = "SELECT r FROM RegC105 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC105.findByIdPai", query = "SELECT r FROM RegC105 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC105.findByLinha", query = "SELECT r FROM RegC105 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC105.findByHashfile", query = "SELECT r FROM RegC105 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC105.findByReg", query = "SELECT r FROM RegC105 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC105.findByOper", query = "SELECT r FROM RegC105 r WHERE r.oper = :oper"),
    @NamedQuery(name = "RegC105.findByUf", query = "SELECT r FROM RegC105 r WHERE r.uf = :uf")})
@Registros(nivel = 3)
public class RegC105 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC100) idPai;
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
    @Column(name = "OPER")
    private String oper;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "UF")
    private String uf;

    public RegC105() {
    }

    public RegC105(Long id) {
        this.id = id;
    }

    public RegC105(Long id, RegC100 idPai, long linha, String hashfile) {
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

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String getCodUf() {
        return uf;
    }

    public void setCodUf(String uf) {
        this.uf = uf;
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
        if (!(object instanceof RegC105)) {
            return false;
        }
        RegC105 other = (RegC105) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC105[ id=" + id + " ]";
    }

}
