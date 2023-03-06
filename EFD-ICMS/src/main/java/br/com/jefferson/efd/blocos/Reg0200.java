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
import javax.persistence.ManyToOne;
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
@Table(name = "reg_0200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0200.findAll", query = "SELECT r FROM Reg0200 r"),
    @NamedQuery(name = "Reg0200.findById", query = "SELECT r FROM Reg0200 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0200.findByIdPai", query = "SELECT r FROM Reg0200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0200.findByLinha", query = "SELECT r FROM Reg0200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0200.findByHashfile", query = "SELECT r FROM Reg0200 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0200.findByReg", query = "SELECT r FROM Reg0200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0200.findByCodItem", query = "SELECT r FROM Reg0200 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "Reg0200.findByDescrItem", query = "SELECT r FROM Reg0200 r WHERE r.descrItem = :descrItem"),
    @NamedQuery(name = "Reg0200.findByCodBarra", query = "SELECT r FROM Reg0200 r WHERE r.codBarra = :codBarra"),
    @NamedQuery(name = "Reg0200.findByCodAntItem", query = "SELECT r FROM Reg0200 r WHERE r.codAntItem = :codAntItem"),
    @NamedQuery(name = "Reg0200.findByUnidInv", query = "SELECT r FROM Reg0200 r WHERE r.unidInv = :unidInv"),
    @NamedQuery(name = "Reg0200.findByTipoItem", query = "SELECT r FROM Reg0200 r WHERE r.tipoItem = :tipoItem"),
    @NamedQuery(name = "Reg0200.findByCodNcm", query = "SELECT r FROM Reg0200 r WHERE r.codNcm = :codNcm"),
    @NamedQuery(name = "Reg0200.findByExIpi", query = "SELECT r FROM Reg0200 r WHERE r.exIpi = :exIpi"),
    @NamedQuery(name = "Reg0200.findByCodGen", query = "SELECT r FROM Reg0200 r WHERE r.codGen = :codGen"),
    @NamedQuery(name = "Reg0200.findByCodLst", query = "SELECT r FROM Reg0200 r WHERE r.codLst = :codLst"),
    @NamedQuery(name = "Reg0200.findByAliqIcms", query = "SELECT r FROM Reg0200 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "Reg0200.findByCest", query = "SELECT r FROM Reg0200 r WHERE r.cest = :cest")})
@Registros(nivel = 2)
public class Reg0200 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

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
    @Column(name = "COD_ITEM")
    private String codItem;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "DESCR_ITEM")
    private String descrItem;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_BARRA")
    private String codBarra;

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_ANT_ITEM")
    private String codAntItem;

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "UNID_INV")
    private String unidInv;

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "TIPO_ITEM")
    private String tipoItem;

    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_NCM")
    private String codNcm;

    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "EX_IPI")
    private String exIpi;

    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "COD_GEN")
    private String codGen;

    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_LST")
    private String codLst;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;

    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "CEST")
    private String cest;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0205> reg0205;

    @OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0206 reg0206;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0210> reg0210;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0220> reg0220;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0221> reg0221;

    public Reg0200() {
    }

    public Reg0200(String id) {
        this.id = id;
    }

    public Reg0200(String id, Reg0001 idPai, long linha, String hashfile) {
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

    public Reg0001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }

    public String getUnidInv() {
        return unidInv;
    }

    public void setUnidInv(String unidInv) {
        this.unidInv = unidInv;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getCodNcm() {
        return codNcm;
    }

    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }

    public String getExIpi() {
        return exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }

    public String getCodGen() {
        return codGen;
    }

    public void setCodGen(String codGen) {
        this.codGen = codGen;
    }

    public String getCodLst() {
        return codLst;
    }

    public void setCodLst(String codLst) {
        this.codLst = codLst;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public List<Reg0205> getReg0205() {
        return reg0205;
    }

    public void setReg0205(List<Reg0205> reg0205) {
        this.reg0205 = reg0205;
    }

    public Reg0206 getReg0206() {
        return reg0206;
    }

    public void setReg0206(Reg0206 reg0206) {
        this.reg0206 = reg0206;
    }

    public List<Reg0210> getReg0210() {
        return reg0210;
    }

    public void setReg0210(List<Reg0210> reg0210) {
        this.reg0210 = reg0210;
    }

    public List<Reg0220> getReg0220() {
        return reg0220;
    }

    public void setReg0220(List<Reg0220> reg0220) {
        this.reg0220 = reg0220;
    }

    public List<Reg0221> getReg0221() {
        return reg0221;
    }

    public void setReg0221(List<Reg0221> reg0221) {
        this.reg0221 = reg0221;
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
        if (!(object instanceof Reg0200)) {
            return false;
        }
        Reg0200 other = (Reg0200) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0200[ id=" + id + " ]";
    }

}
