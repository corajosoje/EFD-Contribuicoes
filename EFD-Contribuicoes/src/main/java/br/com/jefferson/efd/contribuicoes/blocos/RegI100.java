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
@Table(name = "reg_i100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegI100.findAll", query = "SELECT r FROM RegI100 r"),
    @NamedQuery(name = "RegI100.findById", query = "SELECT r FROM RegI100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegI100.findByIdPai", query = "SELECT r FROM RegI100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegI100.findByLinha", query = "SELECT r FROM RegI100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegI100.findByHashfile", query = "SELECT r FROM RegI100 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegI100.findByReg", query = "SELECT r FROM RegI100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegI100.findByVlRec", query = "SELECT r FROM RegI100 r WHERE r.vlRec = :vlRec"),
    @NamedQuery(name = "RegI100.findByCstPisCofins", query = "SELECT r FROM RegI100 r WHERE r.cstPisCofins = :cstPisCofins"),
    @NamedQuery(name = "RegI100.findByVlTotDedGer", query = "SELECT r FROM RegI100 r WHERE r.vlTotDedGer = :vlTotDedGer"),
    @NamedQuery(name = "RegI100.findByVlTotDedEsp", query = "SELECT r FROM RegI100 r WHERE r.vlTotDedEsp = :vlTotDedEsp"),
    @NamedQuery(name = "RegI100.findByVlBcPis", query = "SELECT r FROM RegI100 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegI100.findByAliqPis", query = "SELECT r FROM RegI100 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegI100.findByVlPis", query = "SELECT r FROM RegI100 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegI100.findByVlBcCofins", query = "SELECT r FROM RegI100 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegI100.findByAliqCofins", query = "SELECT r FROM RegI100 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegI100.findByVlCofins", query = "SELECT r FROM RegI100 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegI100.findByInfoCompl", query = "SELECT r FROM RegI100 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 3)
public class RegI100 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegI010 idPai;

    @Override
    public RegI010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegI010) idPai;
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
    private List<RegI199> regI199;

    public List<RegI199> getRegI199() {
        return regI199;
    }

    public void setRegI199(List<RegI199> regI199) {
        this.regI199 = regI199;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegI200> regI200;

    public List<RegI200> getRegI200() {
        return regI200;
    }

    public void setRegI200(List<RegI200> regI200) {
        this.regI200 = regI200;
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_REC", precision = 15, scale = 6)
    private BigDecimal vlRec;

    public BigDecimal getVlRec() {
        return this.vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CST_PIS_COFINS")
    private String cstPisCofins;

    public String getCstPisCofins() {
        return this.cstPisCofins;
    }

    public void setCstPisCofins(String cstPisCofins) {
        this.cstPisCofins = cstPisCofins;
    }

    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_TOT_DED_GER", precision = 15, scale = 6)
    private BigDecimal vlTotDedGer;

    public BigDecimal getVlTotDedGer() {
        return this.vlTotDedGer;
    }

    public void setVlTotDedGer(BigDecimal vlTotDedGer) {
        this.vlTotDedGer = vlTotDedGer;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_TOT_DED_ESP", precision = 15, scale = 6)
    private BigDecimal vlTotDedEsp;

    public BigDecimal getVlTotDedEsp() {
        return this.vlTotDedEsp;
    }

    public void setVlTotDedEsp(BigDecimal vlTotDedEsp) {
        this.vlTotDedEsp = vlTotDedEsp;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "INFO_COMPL")
    private String infoCompl;

    public String getInfoCompl() {
        return this.infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
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
        final RegI100 other = (RegI100) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegI100{" + "id=" + id + '}';
    }
}
