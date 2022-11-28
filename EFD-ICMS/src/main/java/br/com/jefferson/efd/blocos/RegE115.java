package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_e115")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE115.findAll", query = "SELECT r FROM RegE115 r"),
    @NamedQuery(name = "RegE115.findById", query = "SELECT r FROM RegE115 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE115.findByIdPai", query = "SELECT r FROM RegE115 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE115.findByLinha", query = "SELECT r FROM RegE115 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE115.findByHash", query = "SELECT r FROM RegE115 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE115.findByReg", query = "SELECT r FROM RegE115 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE115.findByCodInfAdic", query = "SELECT r FROM RegE115 r WHERE r.codInfAdic = :codInfAdic"),
    @NamedQuery(name = "RegE115.findByVlInfAdic", query = "SELECT r FROM RegE115 r WHERE r.vlInfAdic = :vlInfAdic"),
    @NamedQuery(name = "RegE115.findByDescrComplAj", query = "SELECT r FROM RegE115 r WHERE r.descrComplAj = :descrComplAj")})
@Registros(nivel = 4)
public class RegE115 implements Serializable {

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

    public RegE115() {
    }

    public RegE115(Long id) {
        this.id = id;
    }

    public RegE115(Long id, RegE110 idPai, long linha, String hash) {
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_INF_ADIC")
    private String codInfAdic;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_INF_ADIC")
    private BigDecimal vlInfAdic;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "DESCR_COMPL_AJ")
    private String descrComplAj;

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

    public String getCodInfAdic() {
        return codInfAdic;
    }

    public void setCodInfAdic(String codInfAdic) {
        this.codInfAdic = codInfAdic;
    }

    public BigDecimal getVlInfAdic() {
        return vlInfAdic;
    }

    public void setVlInfAdic(BigDecimal vlInfAdic) {
        this.vlInfAdic = vlInfAdic;
    }

    public String getDescrComplAj() {
        return descrComplAj;
    }

    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
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
        if (!(object instanceof RegE115)) {
            return false;
        }
        RegE115 other = (RegE115) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE115[ id=" + id + " ]";
    }

}
