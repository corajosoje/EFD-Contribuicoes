package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
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
@Table(name = "reg_k210")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK210.findAll", query = "SELECT r FROM RegK210 r"),
    @NamedQuery(name = "RegK210.findById", query = "SELECT r FROM RegK210 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK210.findByIdPai", query = "SELECT r FROM RegK210 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK210.findByLinha", query = "SELECT r FROM RegK210 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK210.findByHashfile", query = "SELECT r FROM RegK210 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK210.findByReg", query = "SELECT r FROM RegK210 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK210.findByDtIniOs", query = "SELECT r FROM RegK210 r WHERE r.dtIniOs = :dtIniOs"),
    @NamedQuery(name = "RegK210.findByDtFinOs", query = "SELECT r FROM RegK210 r WHERE r.dtFinOs = :dtFinOs"),
    @NamedQuery(name = "RegK210.findByCodDocOs", query = "SELECT r FROM RegK210 r WHERE r.codDocOs = :codDocOs"),
    @NamedQuery(name = "RegK210.findByCodItemOri", query = "SELECT r FROM RegK210 r WHERE r.codItemOri = :codItemOri"),
    @NamedQuery(name = "RegK210.findByQtdOri", query = "SELECT r FROM RegK210 r WHERE r.qtdOri = :qtdOri")})
@Registros(nivel = 3)
public class RegK210 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK100 idPai;

    public RegK100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK100) idPai;
    }

    public RegK210() {
    }

    public RegK210(String id) {
        this.id = id;
    }

    public RegK210(String id, RegK100 idPai, long linha, String hashfile) {
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
    private List<RegK215> regK215;

    public List<RegK215> getRegK215() {
        return regK215;
    }

    public void setRegK215(List<RegK215> regK215) {
        this.regK215 = regK215;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_INI_OS")
    @Temporal(TemporalType.DATE)
    private Date dtIniOs;
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_FIN_OS")
    @Temporal(TemporalType.DATE)
    private Date dtFinOs;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_DOC_OS")
    private String codDocOs;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_ITEM_ORI")
    private String codItemOri;
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "QTD_ORI", precision = 15, scale = 6)
    private BigDecimal qtdOri;

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

    public Date getDtIniOs() {
        return dtIniOs;
    }

    public void setDtIniOs(Date dtIniOs) {
        this.dtIniOs = dtIniOs;
    }

    public Date getDtFinOs() {
        return dtFinOs;
    }

    public void setDtFinOs(Date dtFinOs) {
        this.dtFinOs = dtFinOs;
    }

    public String getCodDocOs() {
        return codDocOs;
    }

    public void setCodDocOs(String codDocOs) {
        this.codDocOs = codDocOs;
    }

    public String getCodItemOri() {
        return codItemOri;
    }

    public void setCodItemOri(String codItemOri) {
        this.codItemOri = codItemOri;
    }

    public BigDecimal getQtdOri() {
        return qtdOri;
    }

    public void setQtdOri(BigDecimal qtdOri) {
        this.qtdOri = qtdOri;
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
        if (!(object instanceof RegK210)) {
            return false;
        }
        RegK210 other = (RegK210) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK210[ id=" + id + " ]";
    }

}
