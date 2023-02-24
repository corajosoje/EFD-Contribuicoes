package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "reg_c101")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC101.findAll", query = "SELECT r FROM RegC101 r"),
    @NamedQuery(name = "RegC101.findById", query = "SELECT r FROM RegC101 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC101.findByIdPai", query = "SELECT r FROM RegC101 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC101.findByLinha", query = "SELECT r FROM RegC101 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC101.findByHashfile", query = "SELECT r FROM RegC101 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC101.findByReg", query = "SELECT r FROM RegC101 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC101.findByVlFcpUfDest", query = "SELECT r FROM RegC101 r WHERE r.vlFcpUfDest = :vlFcpUfDest"),
    @NamedQuery(name = "RegC101.findByVlIcmsUfDest", query = "SELECT r FROM RegC101 r WHERE r.vlIcmsUfDest = :vlIcmsUfDest"),
    @NamedQuery(name = "RegC101.findByVlIcmsUfRem", query = "SELECT r FROM RegC101 r WHERE r.vlIcmsUfRem = :vlIcmsUfRem")})
@Registros(nivel = 3)
public class RegC101 implements Serializable {

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

    public RegC101() {
    }

    public RegC101(Long id) {
        this.id = id;
    }

    public RegC101(Long id, RegC100 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_FCP_UF_DEST", precision = 15, scale = 6)
    private BigDecimal vlFcpUfDest;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_ICMS_UF_DEST", precision = 15, scale = 6)
    private BigDecimal vlIcmsUfDest;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ICMS_UF_REM", precision = 15, scale = 6)
    private BigDecimal vlIcmsUfRem;

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

    public BigDecimal getVlFcpUfDest() {
        return vlFcpUfDest;
    }

    public void setVlFcpUfDest(BigDecimal vlFcpUfDest) {
        this.vlFcpUfDest = vlFcpUfDest;
    }

    public BigDecimal getVlIcmsUfDest() {
        return vlIcmsUfDest;
    }

    public void setVlIcmsUfDest(BigDecimal vlIcmsUfDest) {
        this.vlIcmsUfDest = vlIcmsUfDest;
    }

    public BigDecimal getVlIcmsUfRem() {
        return vlIcmsUfRem;
    }

    public void setVlIcmsUfRem(BigDecimal vlIcmsUfRem) {
        this.vlIcmsUfRem = vlIcmsUfRem;
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
        if (!(object instanceof RegC101)) {
            return false;
        }
        RegC101 other = (RegC101) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC101[ id=" + id + " ]";
    }

}
