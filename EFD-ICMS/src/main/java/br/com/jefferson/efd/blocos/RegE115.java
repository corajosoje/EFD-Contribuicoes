package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_e115")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE115.findAll", query = "SELECT r FROM RegE115 r"),
    @NamedQuery(name = "RegE115.findById", query = "SELECT r FROM RegE115 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE115.findByIdPai", query = "SELECT r FROM RegE115 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE115.findByLinha", query = "SELECT r FROM RegE115 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE115.findByHashfile", query = "SELECT r FROM RegE115 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE115.findByReg", query = "SELECT r FROM RegE115 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE115.findByCodInfAdic", query = "SELECT r FROM RegE115 r WHERE r.codInfAdic = :codInfAdic"),
    @NamedQuery(name = "RegE115.findByVlInfAdic", query = "SELECT r FROM RegE115 r WHERE r.vlInfAdic = :vlInfAdic"),
    @NamedQuery(name = "RegE115.findByDescrComplAj", query = "SELECT r FROM RegE115 r WHERE r.descrComplAj = :descrComplAj")})
@Registros(nivel = 4)
public class RegE115 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
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

    public RegE115(String id) {
        this.id = id;
    }

    public RegE115(String id, RegE110 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_INF_ADIC")
    private String codInfAdic;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_INF_ADIC", precision = 15, scale = 6)
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
