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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c140")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC140.findAll", query = "SELECT r FROM RegC140 r"),
    @NamedQuery(name = "RegC140.findById", query = "SELECT r FROM RegC140 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC140.findByIdPai", query = "SELECT r FROM RegC140 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC140.findByLinha", query = "SELECT r FROM RegC140 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC140.findByHash", query = "SELECT r FROM RegC140 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC140.findByReg", query = "SELECT r FROM RegC140 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC140.findByIndEmit", query = "SELECT r FROM RegC140 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegC140.findByIndTit", query = "SELECT r FROM RegC140 r WHERE r.indTit = :indTit"),
    @NamedQuery(name = "RegC140.findByDescTit", query = "SELECT r FROM RegC140 r WHERE r.descTit = :descTit"),
    @NamedQuery(name = "RegC140.findByNumTit", query = "SELECT r FROM RegC140 r WHERE r.numTit = :numTit"),
    @NamedQuery(name = "RegC140.findByQtdParc", query = "SELECT r FROM RegC140 r WHERE r.qtdParc = :qtdParc"),
    @NamedQuery(name = "RegC140.findByVlTit", query = "SELECT r FROM RegC140 r WHERE r.vlTit = :vlTit")})
@Registros(nivel = 3)
public class RegC140 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC100) idPai;
    }

    public RegC140() {
    }

    public RegC140(Long id) {
        this.id = id;
    }

    public RegC140(Long id, RegC100 idPai, long linha, String hash) {
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
    private List<RegC141> regC141;

    public List<RegC141> getRegC141() {
        return regC141;
    }

    public void setRegC141(List<RegC141> regC141) {
        this.regC141 = regC141;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_TIT")
    private String indTit;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "DESC_TIT")
    private String descTit;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "NUM_TIT")
    private String numTit;
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "QTD_PARC")
    private int qtdParc;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_TIT")
    private BigDecimal vlTit;

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

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getIndTit() {
        return indTit;
    }

    public void setIndTit(String indTit) {
        this.indTit = indTit;
    }

    public String getDescTit() {
        return descTit;
    }

    public void setDescTit(String descTit) {
        this.descTit = descTit;
    }

    public String getNumTit() {
        return numTit;
    }

    public void setNumTit(String numTit) {
        this.numTit = numTit;
    }

    public int getQtdParc() {
        return qtdParc;
    }

    public void setQtdParc(int qtdParc) {
        this.qtdParc = qtdParc;
    }

    public BigDecimal getVlTit() {
        return vlTit;
    }

    public void setVlTit(BigDecimal vlTit) {
        this.vlTit = vlTit;
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
        if (!(object instanceof RegC140)) {
            return false;
        }
        RegC140 other = (RegC140) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC140[ id=" + id + " ]";
    }

}
