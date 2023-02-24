package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_e311")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE311.findAll", query = "SELECT r FROM RegE311 r"),
    @NamedQuery(name = "RegE311.findById", query = "SELECT r FROM RegE311 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE311.findByIdPai", query = "SELECT r FROM RegE311 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE311.findByLinha", query = "SELECT r FROM RegE311 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE311.findByHashfile", query = "SELECT r FROM RegE311 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE311.findByReg", query = "SELECT r FROM RegE311 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE311.findByCodAjApur", query = "SELECT r FROM RegE311 r WHERE r.codAjApur = :codAjApur"),
    @NamedQuery(name = "RegE311.findByDescrComplAj", query = "SELECT r FROM RegE311 r WHERE r.descrComplAj = :descrComplAj"),
    @NamedQuery(name = "RegE311.findByVlAjApur", query = "SELECT r FROM RegE311 r WHERE r.vlAjApur = :vlAjApur")})
@Registros(nivel = 4)
public class RegE311 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE310 idPai;

    public RegE310 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE310) idPai;
    }

    public RegE311() {
    }

    public RegE311(Long id) {
        this.id = id;
    }

    public RegE311(Long id, RegE310 idPai, long linha, String hashfile) {
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
    private List<RegE312> regE312;

    public List<RegE312> getRegE312() {
        return regE312;
    }

    public void setRegE312(List<RegE312> regE312) {
        this.regE312 = regE312;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE313> regE313;

    public List<RegE313> getRegE313() {
        return regE313;
    }

    public void setRegE313(List<RegE313> regE313) {
        this.regE313 = regE313;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_AJ_APUR")
    private String codAjApur;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "DESCR_COMPL_AJ")
    private String descrComplAj;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_AJ_APUR", precision = 15, scale = 6)
    private BigDecimal vlAjApur;

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

    public String getCodAjApur() {
        return codAjApur;
    }

    public void setCodAjApur(String codAjApur) {
        this.codAjApur = codAjApur;
    }

    public String getDescrComplAj() {
        return descrComplAj;
    }

    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }

    public BigDecimal getVlAjApur() {
        return vlAjApur;
    }

    public void setVlAjApur(BigDecimal vlAjApur) {
        this.vlAjApur = vlAjApur;
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
        if (!(object instanceof RegE311)) {
            return false;
        }
        RegE311 other = (RegE311) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE311[ id=" + id + " ]";
    }

}
