package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_k200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK200.findAll", query = "SELECT r FROM RegK200 r"),
    @NamedQuery(name = "RegK200.findById", query = "SELECT r FROM RegK200 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK200.findByIdPai", query = "SELECT r FROM RegK200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK200.findByLinha", query = "SELECT r FROM RegK200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK200.findByHash", query = "SELECT r FROM RegK200 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegK200.findByReg", query = "SELECT r FROM RegK200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK200.findByDtEst", query = "SELECT r FROM RegK200 r WHERE r.dtEst = :dtEst"),
    @NamedQuery(name = "RegK200.findByCodItem", query = "SELECT r FROM RegK200 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK200.findByQtd", query = "SELECT r FROM RegK200 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegK200.findByIndEst", query = "SELECT r FROM RegK200 r WHERE r.indEst = :indEst"),
    @NamedQuery(name = "RegK200.findByCodPart", query = "SELECT r FROM RegK200 r WHERE r.codPart = :codPart")})
@Registros(nivel = 3)
public class RegK200 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public RegK200() {
    }

    public RegK200(Long id) {
        this.id = id;
    }

    public RegK200(Long id, RegK100 idPai, long linha, String hash) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hash = hash;
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
    @Column(name = "HASH")
    private String hash;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_EST")
    @Temporal(TemporalType.DATE)
    private Date dtEst;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD")
    private BigDecimal qtd;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "IND_EST")
    private String indEst;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public Date getDtEst() {
        return dtEst;
    }

    public void setDtEst(Date dtEst) {
        this.dtEst = dtEst;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getIndEst() {
        return indEst;
    }

    public void setIndEst(String indEst) {
        this.indEst = indEst;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegK200)) {
            return false;
        }
        RegK200 other = (RegK200) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK200[ id=" + id + " ]";
    }

}
