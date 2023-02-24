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
@Table(name = "reg_1200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1200.findAll", query = "SELECT r FROM Reg1200 r"),
    @NamedQuery(name = "Reg1200.findById", query = "SELECT r FROM Reg1200 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1200.findByIdPai", query = "SELECT r FROM Reg1200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1200.findByLinha", query = "SELECT r FROM Reg1200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1200.findByHashfile", query = "SELECT r FROM Reg1200 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1200.findByReg", query = "SELECT r FROM Reg1200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1200.findByCodAjApur", query = "SELECT r FROM Reg1200 r WHERE r.codAjApur = :codAjApur"),
    @NamedQuery(name = "Reg1200.findBySldCred", query = "SELECT r FROM Reg1200 r WHERE r.sldCred = :sldCred"),
    @NamedQuery(name = "Reg1200.findByCredApr", query = "SELECT r FROM Reg1200 r WHERE r.credApr = :credApr"),
    @NamedQuery(name = "Reg1200.findByCredReceb", query = "SELECT r FROM Reg1200 r WHERE r.credReceb = :credReceb"),
    @NamedQuery(name = "Reg1200.findByCredUtil", query = "SELECT r FROM Reg1200 r WHERE r.credUtil = :credUtil"),
    @NamedQuery(name = "Reg1200.findBySldCredFim", query = "SELECT r FROM Reg1200 r WHERE r.sldCredFim = :sldCredFim")})
@Registros(nivel = 2)
public class Reg1200 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    public Reg1001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1001) idPai;
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
    @Column(name = "COD_AJ_APUR")
    private String codAjApur;

    @Campos(posicao = 3, tipo = 'R')
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SLD_CRED", precision = 15, scale = 6)
    private BigDecimal sldCred;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "CRED_APR", precision = 15, scale = 6)
    private BigDecimal credApr;

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "CRED_RECEB", precision = 15, scale = 6)
    private BigDecimal credReceb;

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "CRED_UTIL", precision = 15, scale = 6)
    private BigDecimal credUtil;

    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "SLD_CRED_FIM", precision = 15, scale = 6)
    private BigDecimal sldCredFim;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1210> reg1210;

    public List<Reg1210> getReg1210() {
        return reg1210;
    }

    public void setReg1210(List<Reg1210> reg1210) {
        this.reg1210 = reg1210;
    }

    public Reg1200() {
    }

    public Reg1200(Long id) {
        this.id = id;
    }

    public Reg1200(Long id, Reg1001 idPai, long linha, String hashfile) {
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

    public String getCodAjApur() {
        return codAjApur;
    }

    public void setCodAjApur(String codAjApur) {
        this.codAjApur = codAjApur;
    }

    public BigDecimal getSldCred() {
        return sldCred;
    }

    public void setSldCred(BigDecimal sldCred) {
        this.sldCred = sldCred;
    }

    public BigDecimal getCredApr() {
        return credApr;
    }

    public void setCredApr(BigDecimal credApr) {
        this.credApr = credApr;
    }

    public BigDecimal getCredReceb() {
        return credReceb;
    }

    public void setCredReceb(BigDecimal credReceb) {
        this.credReceb = credReceb;
    }

    public BigDecimal getCredUtil() {
        return credUtil;
    }

    public void setCredUtil(BigDecimal credUtil) {
        this.credUtil = credUtil;
    }

    public BigDecimal getSldCredFim() {
        return sldCredFim;
    }

    public void setSldCredFim(BigDecimal sldCredFim) {
        this.sldCredFim = sldCredFim;
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
        if (!(object instanceof Reg1200)) {
            return false;
        }
        Reg1200 other = (Reg1200) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1200[ id=" + id + " ]";
    }

}
