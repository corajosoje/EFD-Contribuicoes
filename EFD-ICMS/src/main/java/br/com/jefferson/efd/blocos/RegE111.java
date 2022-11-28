package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_e111")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE111.findAll", query = "SELECT r FROM RegE111 r"),
    @NamedQuery(name = "RegE111.findById", query = "SELECT r FROM RegE111 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE111.findByIdPai", query = "SELECT r FROM RegE111 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE111.findByLinha", query = "SELECT r FROM RegE111 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE111.findByHash", query = "SELECT r FROM RegE111 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE111.findByReg", query = "SELECT r FROM RegE111 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE111.findByCodAjApur", query = "SELECT r FROM RegE111 r WHERE r.codAjApur = :codAjApur"),
    @NamedQuery(name = "RegE111.findByDescrComplAj", query = "SELECT r FROM RegE111 r WHERE r.descrComplAj = :descrComplAj"),
    @NamedQuery(name = "RegE111.findByVlAjApur", query = "SELECT r FROM RegE111 r WHERE r.vlAjApur = :vlAjApur")})
@Registros(nivel = 4)
public class RegE111 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE110 idPai;

    public RegE110 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE110) idPai;
    }

    public RegE111() {
    }

    public RegE111(Long id) {
        this.id = id;
    }

    public RegE111(Long id, RegE110 idPai, long linha, String hash) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE112> regE112;

    public List<RegE112> getRegE112() {
        return regE112;
    }

    public void setRegE112(List<RegE112> regE112) {
        this.regE112 = regE112;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE113> regE113;

    public List<RegE113> getRegE113() {
        return regE113;
    }

    public void setRegE113(List<RegE113> regE113) {
        this.regE113 = regE113;
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
    @Column(name = "VL_AJ_APUR")
    private BigDecimal vlAjApur;

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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegE111)) {
            return false;
        }
        RegE111 other = (RegE111) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE111[ id=" + id + " ]";
    }

}
