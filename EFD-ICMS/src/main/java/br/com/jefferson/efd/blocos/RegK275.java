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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_k275")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK275.findAll", query = "SELECT r FROM RegK275 r"),
    @NamedQuery(name = "RegK275.findById", query = "SELECT r FROM RegK275 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK275.findByIdPai", query = "SELECT r FROM RegK275 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK275.findByLinha", query = "SELECT r FROM RegK275 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK275.findByHashfile", query = "SELECT r FROM RegK275 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK275.findByReg", query = "SELECT r FROM RegK275 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK275.findByCodItem", query = "SELECT r FROM RegK275 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK275.findByQtdCorPos", query = "SELECT r FROM RegK275 r WHERE r.qtdCorPos = :qtdCorPos"),
    @NamedQuery(name = "RegK275.findByQtdCorNeg", query = "SELECT r FROM RegK275 r WHERE r.qtdCorNeg = :qtdCorNeg"),
    @NamedQuery(name = "RegK275.findByCodInsSubst", query = "SELECT r FROM RegK275 r WHERE r.codInsSubst = :codInsSubst")})
@Registros(nivel = 4)
public class RegK275 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK270 idPai;

    public RegK270 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK270) idPai;
    }

    public RegK275() {
    }

    public RegK275(Long id) {
        this.id = id;
    }

    public RegK275(Long id, RegK270 idPai, long linha, String hashfile) {
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
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTD_COR_POS", precision = 15, scale = 6)
    private BigDecimal qtdCorPos;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD_COR_NEG", precision = 15, scale = 6)
    private BigDecimal qtdCorNeg;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_INS_SUBST")
    private String codInsSubst;

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

    public String getCodInsSubst() {
        return codInsSubst;
    }

    public void setCodInsSubst(String codInsSubst) {
        this.codInsSubst = codInsSubst;
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
        if (!(object instanceof RegK275)) {
            return false;
        }
        RegK275 other = (RegK275) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK275[ id=" + id + " ]";
    }

}
