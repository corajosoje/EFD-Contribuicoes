package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c199")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC199.findAll", query = "SELECT r FROM RegC199 r"),
    @NamedQuery(name = "RegC199.findById", query = "SELECT r FROM RegC199 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC199.findByIdPai", query = "SELECT r FROM RegC199 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC199.findByLinha", query = "SELECT r FROM RegC199 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC199.findByHashfile", query = "SELECT r FROM RegC199 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC199.findByReg", query = "SELECT r FROM RegC199 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC199.findByCodDocImp", query = "SELECT r FROM RegC199 r WHERE r.codDocImp = :codDocImp"),
    @NamedQuery(name = "RegC199.findByNumDocImp", query = "SELECT r FROM RegC199 r WHERE r.numDocImp = :numDocImp"),
    @NamedQuery(name = "RegC199.findByVlPisImp", query = "SELECT r FROM RegC199 r WHERE r.vlPisImp = :vlPisImp"),
    @NamedQuery(name = "RegC199.findByVlCofinsImp", query = "SELECT r FROM RegC199 r WHERE r.vlCofinsImp = :vlCofinsImp"),
    @NamedQuery(name = "RegC199.findByNumAcdraw", query = "SELECT r FROM RegC199 r WHERE r.numAcdraw = :numAcdraw")})
@Registros(nivel = 4)
public class RegC199 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC190 idPai;

    @Override
    public RegC190 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC190) idPai;
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
    @Column(name = "COD_DOC_IMP")
    private String codDocImp;

    public String getCodDocImp() {
        return this.codDocImp;
    }

    public void setCodDocImp(String codDocImp) {
        this.codDocImp = codDocImp;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NUM_DOC__IMP")
    private String numDocImp;

    public String getNumDocImp() {
        return this.numDocImp;
    }

    public void setNumDocImp(String numDocImp) {
        this.numDocImp = numDocImp;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_PIS_IMP", precision = 15, scale = 6)
    private BigDecimal vlPisImp;

    public BigDecimal getVlPisImp() {
        return this.vlPisImp;
    }

    public void setVlPisImp(BigDecimal vlPisImp) {
        this.vlPisImp = vlPisImp;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_COFINS_IMP", precision = 15, scale = 6)
    private BigDecimal vlCofinsImp;

    public BigDecimal getVlCofinsImp() {
        return this.vlCofinsImp;
    }

    public void setVlCofinsImp(BigDecimal vlCofinsImp) {
        this.vlCofinsImp = vlCofinsImp;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "NUM_ACDRAW")
    private String numAcdraw;

    public String getNumAcdraw() {
        return this.numAcdraw;
    }

    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
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
        final RegC199 other = (RegC199) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC199{" + "id=" + id + '}';
    }
}
