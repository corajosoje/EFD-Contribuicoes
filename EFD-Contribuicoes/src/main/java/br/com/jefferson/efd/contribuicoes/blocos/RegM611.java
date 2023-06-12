package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_m611")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM611.findAll", query = "SELECT r FROM RegM611 r"),
    @NamedQuery(name = "RegM611.findById", query = "SELECT r FROM RegM611 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM611.findByIdPai", query = "SELECT r FROM RegM611 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM611.findByLinha", query = "SELECT r FROM RegM611 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM611.findByHashfile", query = "SELECT r FROM RegM611 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM611.findByReg", query = "SELECT r FROM RegM611 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM611.findByIndTipCoop", query = "SELECT r FROM RegM611 r WHERE r.indTipCoop = :indTipCoop"),
    @NamedQuery(name = "RegM611.findByVlBcContAntExcCoop", query = "SELECT r FROM RegM611 r WHERE r.vlBcContAntExcCoop = :vlBcContAntExcCoop"),
    @NamedQuery(name = "RegM611.findByVlExcCoopGer", query = "SELECT r FROM RegM611 r WHERE r.vlExcCoopGer = :vlExcCoopGer"),
    @NamedQuery(name = "RegM611.findByVlExcEspCoop", query = "SELECT r FROM RegM611 r WHERE r.vlExcEspCoop = :vlExcEspCoop"),
    @NamedQuery(name = "RegM611.findByVlBcCont", query = "SELECT r FROM RegM611 r WHERE r.vlBcCont = :vlBcCont")})
@Registros(nivel = 4)
public class RegM611 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM610 idPai;

    @Override
    public RegM610 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM610) idPai;
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
    @Column(name = "IND_TIP_COOP")
    private String indTipCoop;

    public String getIndTipCoop() {
        return this.indTipCoop;
    }

    public void setIndTipCoop(String indTipCoop) {
        this.indTipCoop = indTipCoop;
    }

    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_BC_CONT_ANT_EXC_COOP", precision = 15, scale = 6)
    private BigDecimal vlBcContAntExcCoop;

    public BigDecimal getVlBcContAntExcCoop() {
        return this.vlBcContAntExcCoop;
    }

    public void setVlBcContAntExcCoop(BigDecimal vlBcContAntExcCoop) {
        this.vlBcContAntExcCoop = vlBcContAntExcCoop;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_EXC_COOP_GER", precision = 15, scale = 6)
    private BigDecimal vlExcCoopGer;

    public BigDecimal getVlExcCoopGer() {
        return this.vlExcCoopGer;
    }

    public void setVlExcCoopGer(BigDecimal vlExcCoopGer) {
        this.vlExcCoopGer = vlExcCoopGer;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_EXC_ESP_COOP", precision = 15, scale = 6)
    private BigDecimal vlExcEspCoop;

    public BigDecimal getVlExcEspCoop() {
        return this.vlExcEspCoop;
    }

    public void setVlExcEspCoop(BigDecimal vlExcEspCoop) {
        this.vlExcEspCoop = vlExcEspCoop;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_CONT", precision = 15, scale = 6)
    private BigDecimal vlBcCont;

    public BigDecimal getVlBcCont() {
        return this.vlBcCont;
    }

    public void setVlBcCont(BigDecimal vlBcCont) {
        this.vlBcCont = vlBcCont;
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
        final RegM611 other = (RegM611) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM611{" + "id=" + id + '}';
    }
}
