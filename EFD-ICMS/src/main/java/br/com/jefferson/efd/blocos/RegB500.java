package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_b500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegB500.findAll", query = "SELECT r FROM RegB500 r"),
    @NamedQuery(name = "RegB500.findById", query = "SELECT r FROM RegB500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegB500.findByIdPai", query = "SELECT r FROM RegB500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegB500.findByLinha", query = "SELECT r FROM RegB500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegB500.findByHashfile", query = "SELECT r FROM RegB500 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegB500.findByReg", query = "SELECT r FROM RegB500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegB500.findByVlRec", query = "SELECT r FROM RegB500 r WHERE r.vlRec = :vlRec"),
    @NamedQuery(name = "RegB500.findByQtdProf", query = "SELECT r FROM RegB500 r WHERE r.qtdProf = :qtdProf"),
    @NamedQuery(name = "RegB500.findByVlOr", query = "SELECT r FROM RegB500 r WHERE r.vlOr = :vlOr")})
@Registros(nivel = 2)
public class RegB500 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegB001 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_REC", precision = 15, scale = 6)
    private BigDecimal vlRec;

    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "QTD_PROF")
    private int qtdProf;

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_OR", precision = 15, scale = 6)
    private BigDecimal vlOr;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegB510> regB510;

    public RegB500() {
    }

    public RegB500(String id) {
        this.id = id;
    }

    public RegB500(String id, RegB001 idPai, long linha, String hashfile) {
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

    public RegB001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegB001) idPai;
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

    public BigDecimal getVlRec() {
        return vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }

    public int getQtdProf() {
        return qtdProf;
    }

    public void setQtdProf(int qtdProf) {
        this.qtdProf = qtdProf;
    }

    public BigDecimal getVlOr() {
        return vlOr;
    }

    public void setVlOr(BigDecimal vlOr) {
        this.vlOr = vlOr;
    }

    public List<RegB510> getRegB510() {
        return regB510;
    }

    public void setRegB510(List<RegB510> regB510) {
        this.regB510 = regB510;
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
        if (!(object instanceof RegB500)) {
            return false;
        }
        RegB500 other = (RegB500) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegB500[ id=" + id + " ]";
    }

}
