package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_k200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK200.findAll", query = "SELECT r FROM RegK200 r"),
    @NamedQuery(name = "RegK200.findById", query = "SELECT r FROM RegK200 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK200.findByIdPai", query = "SELECT r FROM RegK200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK200.findByLinha", query = "SELECT r FROM RegK200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK200.findByHashfile", query = "SELECT r FROM RegK200 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK200.findByReg", query = "SELECT r FROM RegK200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK200.findByDtEst", query = "SELECT r FROM RegK200 r WHERE r.dtEst = :dtEst"),
    @NamedQuery(name = "RegK200.findByCodItem", query = "SELECT r FROM RegK200 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK200.findByQtd", query = "SELECT r FROM RegK200 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegK200.findByIndEst", query = "SELECT r FROM RegK200 r WHERE r.indEst = :indEst"),
    @NamedQuery(name = "RegK200.findByCodPart", query = "SELECT r FROM RegK200 r WHERE r.codPart = :codPart")})
@Registros(nivel = 3)
public class RegK200 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK100 idPai;

    public RegK100 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegK100) idPai;
    }

    public RegK200() {
    }

    public RegK200(String id) {
        this.id = id;
    }

    public RegK200(String id, RegK100 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
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
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_EST")
    @Temporal(TemporalType.DATE)
    private Date dtEst;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "QTD", precision = 15, scale = 6)
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
