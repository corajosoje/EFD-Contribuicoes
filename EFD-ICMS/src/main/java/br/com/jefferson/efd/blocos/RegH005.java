package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_h005")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegH005.findAll", query = "SELECT r FROM RegH005 r"),
    @NamedQuery(name = "RegH005.findById", query = "SELECT r FROM RegH005 r WHERE r.id = :id"),
    @NamedQuery(name = "RegH005.findByIdPai", query = "SELECT r FROM RegH005 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegH005.findByLinha", query = "SELECT r FROM RegH005 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegH005.findByHashfile", query = "SELECT r FROM RegH005 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegH005.findByReg", query = "SELECT r FROM RegH005 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegH005.findByDtInv", query = "SELECT r FROM RegH005 r WHERE r.dtInv = :dtInv"),
    @NamedQuery(name = "RegH005.findByVlInv", query = "SELECT r FROM RegH005 r WHERE r.vlInv = :vlInv"),
    @NamedQuery(name = "RegH005.findByMotInv", query = "SELECT r FROM RegH005 r WHERE r.motInv = :motInv")})
@Registros(nivel = 2)
public class RegH005 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegH001 idPai;

    public RegH001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegH001) idPai;
    }

    public RegH005() {
    }

    public RegH005(Long id) {
        this.id = id;
    }

    public RegH005(Long id, RegH001 idPai, long linha, String hashfile) {
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
    private List<RegH010> regH010;

    public List<RegH010> getRegH010() {
        return regH010;
    }

    public void setRegH010(List<RegH010> regH010) {
        this.regH010 = regH010;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_INV")
    @Temporal(TemporalType.DATE)
    private Date dtInv;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_INV", precision = 15, scale = 6)
    private BigDecimal vlInv;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "MOT_INV")
    private String motInv;

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

    public Date getDtInv() {
        return dtInv;
    }

    public void setDtInv(Date dtInv) {
        this.dtInv = dtInv;
    }

    public BigDecimal getVlInv() {
        return vlInv;
    }

    public void setVlInv(BigDecimal vlInv) {
        this.vlInv = vlInv;
    }

    public String getMotInv() {
        return motInv;
    }

    public void setMotInv(String motInv) {
        this.motInv = motInv;
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
        if (!(object instanceof RegH005)) {
            return false;
        }
        RegH005 other = (RegH005) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegH005[ id=" + id + " ]";
    }

}
