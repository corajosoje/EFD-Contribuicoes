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
@Table(name = "reg_c465")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC465.findAll", query = "SELECT r FROM RegC465 r"),
    @NamedQuery(name = "RegC465.findById", query = "SELECT r FROM RegC465 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC465.findByIdPai", query = "SELECT r FROM RegC465 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC465.findByLinha", query = "SELECT r FROM RegC465 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC465.findByHashfile", query = "SELECT r FROM RegC465 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC465.findByReg", query = "SELECT r FROM RegC465 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC465.findByChvCfe", query = "SELECT r FROM RegC465 r WHERE r.chvCfe = :chvCfe"),
    @NamedQuery(name = "RegC465.findByNumCcf", query = "SELECT r FROM RegC465 r WHERE r.numCcf = :numCcf")})
@Registros(nivel = 5)
public class RegC465 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC460 idPai;

    public RegC460 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC460) idPai;
    }

    public RegC465() {
    }

    public RegC465(Long id) {
        this.id = id;
    }

    public RegC465(Long id, RegC460 idPai, long linha, String hashfile) {
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
    @Column(name = "CHV_CFE")
    private String chvCfe;
    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "NUM_CCF")
    private int numCcf;

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

    public String getChvCfe() {
        return chvCfe;
    }

    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }

    public int getNumCcf() {
        return numCcf;
    }

    public void setNumCcf(int numCcf) {
        this.numCcf = numCcf;
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
        if (!(object instanceof RegC465)) {
            return false;
        }
        RegC465 other = (RegC465) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC465[ id=" + id + " ]";
    }

}
