
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1210")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1210.findAll", query = "SELECT r FROM Reg1210 r"),
    @NamedQuery(name = "Reg1210.findById", query = "SELECT r FROM Reg1210 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1210.findByIdPai", query = "SELECT r FROM Reg1210 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1210.findByLinha", query = "SELECT r FROM Reg1210 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1210.findByHash", query = "SELECT r FROM Reg1210 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1210.findByReg", query = "SELECT r FROM Reg1210 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1210.findByTipoUtil", query = "SELECT r FROM Reg1210 r WHERE r.tipoUtil = :tipoUtil"),
    @NamedQuery(name = "Reg1210.findByNrDoc", query = "SELECT r FROM Reg1210 r WHERE r.nrDoc = :nrDoc"),
    @NamedQuery(name = "Reg1210.findByVlCredUtil", query = "SELECT r FROM Reg1210 r WHERE r.vlCredUtil = :vlCredUtil"),
    @NamedQuery(name = "Reg1210.findByChvDoce", query = "SELECT r FROM Reg1210 r WHERE r.chvDoce = :chvDoce")})
public class Reg1210 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_PAI")
    private long idPai;
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private long hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "TIPO_UTIL")
    private String tipoUtil;
    @Column(name = "NR_DOC")
    private String nrDoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_CRED_UTIL")
    private BigDecimal vlCredUtil;
    @Column(name = "CHV_DOCE")
    private String chvDoce;

    public Reg1210() {
    }

    public Reg1210(Long id) {
        this.id = id;
    }

    public Reg1210(Long id, long idPai, long linha, long hash) {
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

    public long getIdPai() {
        return idPai;
    }

    public void setIdPai(long idPai) {
        this.idPai = idPai;
    }

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
        this.hash = hash;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getTipoUtil() {
        return tipoUtil;
    }

    public void setTipoUtil(String tipoUtil) {
        this.tipoUtil = tipoUtil;
    }

    public String getNrDoc() {
        return nrDoc;
    }

    public void setNrDoc(String nrDoc) {
        this.nrDoc = nrDoc;
    }

    public BigDecimal getVlCredUtil() {
        return vlCredUtil;
    }

    public void setVlCredUtil(BigDecimal vlCredUtil) {
        this.vlCredUtil = vlCredUtil;
    }

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
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
        if (!(object instanceof Reg1210)) {
            return false;
        }
        Reg1210 other = (Reg1210) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1210[ id=" + id + " ]";
    }

}
