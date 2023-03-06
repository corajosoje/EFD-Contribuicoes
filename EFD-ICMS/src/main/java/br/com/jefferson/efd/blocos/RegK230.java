package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_k230")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK230.findAll", query = "SELECT r FROM RegK230 r"),
    @NamedQuery(name = "RegK230.findById", query = "SELECT r FROM RegK230 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK230.findByIdPai", query = "SELECT r FROM RegK230 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK230.findByLinha", query = "SELECT r FROM RegK230 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK230.findByHashfile", query = "SELECT r FROM RegK230 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK230.findByReg", query = "SELECT r FROM RegK230 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK230.findByDtIniOp", query = "SELECT r FROM RegK230 r WHERE r.dtIniOp = :dtIniOp"),
    @NamedQuery(name = "RegK230.findByDtFinOp", query = "SELECT r FROM RegK230 r WHERE r.dtFinOp = :dtFinOp"),
    @NamedQuery(name = "RegK230.findByCodDocOp", query = "SELECT r FROM RegK230 r WHERE r.codDocOp = :codDocOp"),
    @NamedQuery(name = "RegK230.findByCodItem", query = "SELECT r FROM RegK230 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK230.findByQtdEnc", query = "SELECT r FROM RegK230 r WHERE r.qtdEnc = :qtdEnc")})
@Registros(nivel = 3)
public class RegK230 implements Serializable, BlocoSped {

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

    public RegK230() {
    }

    public RegK230(String id) {
        this.id = id;
    }

    public RegK230(String id, RegK100 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK235> regK235;

    public List<RegK235> getRegK235() {
        return regK235;
    }

    public void setRegK235(List<RegK235> regK235) {
        this.regK235 = regK235;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_INI_OP")
    @Temporal(TemporalType.DATE)
    private Date dtIniOp;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_FIN_OP")
    @Temporal(TemporalType.DATE)
    private Date dtFinOp;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_DOC_OP")
    private String codDocOp;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "QTD_ENC", precision = 15, scale = 6)
    private BigDecimal qtdEnc;

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

    public Date getDtIniOp() {
        return dtIniOp;
    }

    public void setDtIniOp(Date dtIniOp) {
        this.dtIniOp = dtIniOp;
    }

    public Date getDtFinOp() {
        return dtFinOp;
    }

    public void setDtFinOp(Date dtFinOp) {
        this.dtFinOp = dtFinOp;
    }

    public String getCodDocOp() {
        return codDocOp;
    }

    public void setCodDocOp(String codDocOp) {
        this.codDocOp = codDocOp;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtdEnc() {
        return qtdEnc;
    }

    public void setQtdEnc(BigDecimal qtdEnc) {
        this.qtdEnc = qtdEnc;
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
        if (!(object instanceof RegK230)) {
            return false;
        }
        RegK230 other = (RegK230) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK230[ id=" + id + " ]";
    }

}
