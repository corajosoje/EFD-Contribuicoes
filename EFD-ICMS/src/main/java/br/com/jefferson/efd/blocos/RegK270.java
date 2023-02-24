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
@Table(name = "reg_k270")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK270.findAll", query = "SELECT r FROM RegK270 r"),
    @NamedQuery(name = "RegK270.findById", query = "SELECT r FROM RegK270 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK270.findByIdPai", query = "SELECT r FROM RegK270 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK270.findByLinha", query = "SELECT r FROM RegK270 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK270.findByHashfile", query = "SELECT r FROM RegK270 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK270.findByReg", query = "SELECT r FROM RegK270 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK270.findByDtIniAp", query = "SELECT r FROM RegK270 r WHERE r.dtIniAp = :dtIniAp"),
    @NamedQuery(name = "RegK270.findByDtFinAp", query = "SELECT r FROM RegK270 r WHERE r.dtFinAp = :dtFinAp"),
    @NamedQuery(name = "RegK270.findByCodOpOs", query = "SELECT r FROM RegK270 r WHERE r.codOpOs = :codOpOs"),
    @NamedQuery(name = "RegK270.findByCodItem", query = "SELECT r FROM RegK270 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK270.findByQtdCorPos", query = "SELECT r FROM RegK270 r WHERE r.qtdCorPos = :qtdCorPos"),
    @NamedQuery(name = "RegK270.findByQtdCorNeg", query = "SELECT r FROM RegK270 r WHERE r.qtdCorNeg = :qtdCorNeg"),
    @NamedQuery(name = "RegK270.findByOrigem", query = "SELECT r FROM RegK270 r WHERE r.origem = :origem")})
@Registros(nivel = 3)
public class RegK270 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK100 idPai;

    public RegK100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK100) idPai;
    }

    public RegK270() {
    }

    public RegK270(Long id) {
        this.id = id;
    }

    public RegK270(Long id, RegK100 idPai, long linha, String hashfile) {
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
    private List<RegK275> regK275;

    public List<RegK275> getRegK275() {
        return regK275;
    }

    public void setRegK275(List<RegK275> regK275) {
        this.regK275 = regK275;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_INI_AP")
    @Temporal(TemporalType.DATE)
    private Date dtIniAp;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_FIN_AP")
    @Temporal(TemporalType.DATE)
    private Date dtFinAp;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_OP_OS")
    private String codOpOs;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "QTD_COR_POS", precision = 15, scale = 6)
    private BigDecimal qtdCorPos;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "QTD_COR_NEG", precision = 15, scale = 6)
    private BigDecimal qtdCorNeg;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "ORIGEM")
    private String origem;

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

    public Date getDtIniAp() {
        return dtIniAp;
    }

    public void setDtIniAp(Date dtIniAp) {
        this.dtIniAp = dtIniAp;
    }

    public Date getDtFinAp() {
        return dtFinAp;
    }

    public void setDtFinAp(Date dtFinAp) {
        this.dtFinAp = dtFinAp;
    }

    public String getCodOpOs() {
        return codOpOs;
    }

    public void setCodOpOs(String codOpOs) {
        this.codOpOs = codOpOs;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtdCorPos() {
        return qtdCorPos;
    }

    public void setQtdCorPos(BigDecimal qtdCorPos) {
        this.qtdCorPos = qtdCorPos;
    }

    public BigDecimal getQtdCorNeg() {
        return qtdCorNeg;
    }

    public void setQtdCorNeg(BigDecimal qtdCorNeg) {
        this.qtdCorNeg = qtdCorNeg;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
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
        if (!(object instanceof RegK270)) {
            return false;
        }
        RegK270 other = (RegK270) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK270[ id=" + id + " ]";
    }

}
