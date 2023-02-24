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
@Table(name = "reg_d310")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD310.findAll", query = "SELECT r FROM RegD310 r"),
    @NamedQuery(name = "RegD310.findById", query = "SELECT r FROM RegD310 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD310.findByIdPai", query = "SELECT r FROM RegD310 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD310.findByLinha", query = "SELECT r FROM RegD310 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD310.findByHashfile", query = "SELECT r FROM RegD310 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD310.findByReg", query = "SELECT r FROM RegD310 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD310.findByCodMunOrig", query = "SELECT r FROM RegD310 r WHERE r.codMunOrig = :codMunOrig"),
    @NamedQuery(name = "RegD310.findByVlServ", query = "SELECT r FROM RegD310 r WHERE r.vlServ = :vlServ"),
    @NamedQuery(name = "RegD310.findByVlBcIcms", query = "SELECT r FROM RegD310 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegD310.findByVlIcms", query = "SELECT r FROM RegD310 r WHERE r.vlIcms = :vlIcms")})
@Registros(nivel = 3)
public class RegD310 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD300 idPai;

    public RegD300 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD300) idPai;
    }

    public RegD310() {
    }

    public RegD310(Long id) {
        this.id = id;
    }

    public RegD310(Long id, RegD300 idPai, long linha, String hashfile) {
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
    @Column(name = "COD_MUN_ORIG")
    private String codMunOrig;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_SERV", precision = 15, scale = 6)
    private BigDecimal vlServ;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;

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

    public String getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
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
        if (!(object instanceof RegD310)) {
            return false;
        }
        RegD310 other = (RegD310) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD310[ id=" + id + " ]";
    }

}
