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
@Table(name = "reg_1210")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1210.findAll", query = "SELECT r FROM Reg1210 r"),
    @NamedQuery(name = "Reg1210.findById", query = "SELECT r FROM Reg1210 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1210.findByIdPai", query = "SELECT r FROM Reg1210 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1210.findByLinha", query = "SELECT r FROM Reg1210 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1210.findByHashfile", query = "SELECT r FROM Reg1210 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1210.findByReg", query = "SELECT r FROM Reg1210 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1210.findByTipoUtil", query = "SELECT r FROM Reg1210 r WHERE r.tipoUtil = :tipoUtil"),
    @NamedQuery(name = "Reg1210.findByNrDoc", query = "SELECT r FROM Reg1210 r WHERE r.nrDoc = :nrDoc"),
    @NamedQuery(name = "Reg1210.findByVlCredUtil", query = "SELECT r FROM Reg1210 r WHERE r.vlCredUtil = :vlCredUtil"),
    @NamedQuery(name = "Reg1210.findByChvDoce", query = "SELECT r FROM Reg1210 r WHERE r.chvDoce = :chvDoce")})
@Registros(nivel = 3)
public class Reg1210 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1200 idPai;

    public Reg1200 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1200) idPai;
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
    @Column(name = "TIPO_UTIL")
    private String tipoUtil;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NR_DOC")
    private String nrDoc;

    @Campos(posicao = 4, tipo = 'R')
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_CRED_UTIL", precision = 15, scale = 6)
    private BigDecimal vlCredUtil;

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CHV_DOCE")
    private String chvDoce;

    public Reg1210() {
    }

    public Reg1210(String id) {
        this.id = id;
    }

    public Reg1210(String id, Reg1200 idPai, long linha, String hashfile) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
