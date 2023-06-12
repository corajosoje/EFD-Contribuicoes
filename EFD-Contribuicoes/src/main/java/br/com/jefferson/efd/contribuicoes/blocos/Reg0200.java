package br.com.jefferson.efd.contribuicoes.blocos;

import java.io.Serializable;
import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
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
    @NamedQuery(name = "Reg0200.findByAliqIcms", query = "SELECT r FROM Reg0200 r WHERE r.aliqIcms = :aliqIcms")})
@Registros(nivel = 3)
public class Reg0200 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0140 idPai;

    @Override
    public Reg0140 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0140) idPai;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @PrePersist
    @Override
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Override
    public long getLinha() {
        return this.linha;
    }

    @Override
    public void setLinha(long linha) {
        this.linha = linha;
    }
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Override
    public String getHashfile() {
        return this.hashfile;
    }

    @Override
    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0205> reg0205;

    public List<Reg0205> getReg0205() {
        return reg0205;
    }

    public void setReg0205(List<Reg0205> reg0205) {
        this.reg0205 = reg0205;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0206 reg0206;

    public Reg0206 getReg0206() {
        return reg0206;
    }

    public void setReg0206(Reg0206 reg0206) {
        this.reg0206 = reg0206;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0208 reg0208;

    public Reg0208 getReg0208() {
        return reg0208;
    }

    public void setReg0208(Reg0208 reg0208) {
        this.reg0208 = reg0208;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Override
    public String getReg() {
        return this.reg;
    }

    @Override
    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;

    public String getCodItem() {
        return this.codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "DESCR_ITEM")
    private String descrItem;

    public String getDescrItem() {
        return this.descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_BARRA")
    private String codBarra;

    public String getCodBarra() {
        return this.codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_ANT_ITEM")
    private String codAntItem;

    public String getCodAntItem() {
        return this.codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "UNID_INV")
    private String unidInv;

    public String getUnidInv() {
        return this.unidInv;
    }

    public void setUnidInv(String unidInv) {
        this.unidInv = unidInv;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "TIPO_ITEM")
    private String tipoItem;

    public String getTipoItem() {
        return this.tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_NCM")
    private String codNcm;

    public String getCodNcm() {
        return this.codNcm;
    }

    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "EX_IPI")
    private String exIpi;

    public String getExIpi() {
        return this.exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "COD_GEN")
    private String codGen;

    public String getCodGen() {
        return this.codGen;
    }

    public void setCodGen(String codGen) {
        this.codGen = codGen;
    }

    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_LST")
    private String codLst;

    public String getCodLst() {
        return this.codLst;
    }

    public void setCodLst(String codLst) {
        this.codLst = codLst;
    }

    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;

    public BigDecimal getAliqIcms() {
        return this.aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reg0200 other = (Reg0200) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0200{" + "id=" + id + '}';
    }
}
