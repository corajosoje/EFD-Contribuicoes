package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_p200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegP200.findAll", query = "SELECT r FROM RegP200 r"),
    @NamedQuery(name = "RegP200.findById", query = "SELECT r FROM RegP200 r WHERE r.id = :id"),
    @NamedQuery(name = "RegP200.findByIdPai", query = "SELECT r FROM RegP200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegP200.findByLinha", query = "SELECT r FROM RegP200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegP200.findByHashfile", query = "SELECT r FROM RegP200 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegP200.findByReg", query = "SELECT r FROM RegP200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegP200.findByPerRef", query = "SELECT r FROM RegP200 r WHERE r.perRef = :perRef"),
    @NamedQuery(name = "RegP200.findByVlTotContApu", query = "SELECT r FROM RegP200 r WHERE r.vlTotContApu = :vlTotContApu"),
    @NamedQuery(name = "RegP200.findByVlTotAjReduc", query = "SELECT r FROM RegP200 r WHERE r.vlTotAjReduc = :vlTotAjReduc"),
    @NamedQuery(name = "RegP200.findByVlTotAjAcres", query = "SELECT r FROM RegP200 r WHERE r.vlTotAjAcres = :vlTotAjAcres"),
    @NamedQuery(name = "RegP200.findByVlTotContDev", query = "SELECT r FROM RegP200 r WHERE r.vlTotContDev = :vlTotContDev"),
    @NamedQuery(name = "RegP200.findByCodRec", query = "SELECT r FROM RegP200 r WHERE r.codRec = :codRec")})
@Registros(nivel = 2)
public class RegP200 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegP001 idPai;

    @Override
    public RegP001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegP001) idPai;
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
    private List<RegP210> regP210;

    public List<RegP210> getRegP210() {
        return regP210;
    }

    public void setRegP210(List<RegP210> regP210) {
        this.regP210 = regP210;
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "PER_REF")
    private int perRef;

    public int getPerRef() {
        return this.perRef;
    }

    public void setPerRef(int perRef) {
        this.perRef = perRef;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_TOT_CONT_APU", precision = 15, scale = 6)
    private BigDecimal vlTotContApu;

    public BigDecimal getVlTotContApu() {
        return this.vlTotContApu;
    }

    public void setVlTotContApu(BigDecimal vlTotContApu) {
        this.vlTotContApu = vlTotContApu;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_TOT_AJ_REDUC", precision = 15, scale = 6)
    private BigDecimal vlTotAjReduc;

    public BigDecimal getVlTotAjReduc() {
        return this.vlTotAjReduc;
    }

    public void setVlTotAjReduc(BigDecimal vlTotAjReduc) {
        this.vlTotAjReduc = vlTotAjReduc;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_TOT_AJ_ACRES", precision = 15, scale = 6)
    private BigDecimal vlTotAjAcres;

    public BigDecimal getVlTotAjAcres() {
        return this.vlTotAjAcres;
    }

    public void setVlTotAjAcres(BigDecimal vlTotAjAcres) {
        this.vlTotAjAcres = vlTotAjAcres;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_TOT_CONT_DEV", precision = 15, scale = 6)
    private BigDecimal vlTotContDev;

    public BigDecimal getVlTotContDev() {
        return this.vlTotContDev;
    }

    public void setVlTotContDev(BigDecimal vlTotContDev) {
        this.vlTotContDev = vlTotContDev;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "COD_REC")
    private String codRec;

    public String getCodRec() {
        return this.codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
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
        final RegP200 other = (RegP200) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegP200{" + "id=" + id + '}';
    }
}
