package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_a120")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegA120.findAll", query = "SELECT r FROM RegA120 r"),
    @NamedQuery(name = "RegA120.findById", query = "SELECT r FROM RegA120 r WHERE r.id = :id"),
    @NamedQuery(name = "RegA120.findByIdPai", query = "SELECT r FROM RegA120 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegA120.findByLinha", query = "SELECT r FROM RegA120 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegA120.findByHashfile", query = "SELECT r FROM RegA120 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegA120.findByReg", query = "SELECT r FROM RegA120 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegA120.findByVlTotServ", query = "SELECT r FROM RegA120 r WHERE r.vlTotServ = :vlTotServ"),
    @NamedQuery(name = "RegA120.findByVlBcPis", query = "SELECT r FROM RegA120 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegA120.findByVlPisImp", query = "SELECT r FROM RegA120 r WHERE r.vlPisImp = :vlPisImp"),
    @NamedQuery(name = "RegA120.findByDtPagPis", query = "SELECT r FROM RegA120 r WHERE r.dtPagPis = :dtPagPis"),
    @NamedQuery(name = "RegA120.findByVlBcCofins", query = "SELECT r FROM RegA120 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegA120.findByVlCofinsImp", query = "SELECT r FROM RegA120 r WHERE r.vlCofinsImp = :vlCofinsImp"),
    @NamedQuery(name = "RegA120.findByDtPagCofins", query = "SELECT r FROM RegA120 r WHERE r.dtPagCofins = :dtPagCofins"),
    @NamedQuery(name = "RegA120.findByLocExeServ", query = "SELECT r FROM RegA120 r WHERE r.locExeServ = :locExeServ")})
@Registros(nivel = 4)
public class RegA120 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegA100 idPai;

    @Override
    public RegA100 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegA100) idPai;
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_TOT_SERV", precision = 15, scale = 6)
    private BigDecimal vlTotServ;

    public BigDecimal getVlTotServ() {
        return this.vlTotServ;
    }

    public void setVlTotServ(BigDecimal vlTotServ) {
        this.vlTotServ = vlTotServ;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
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
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_PAG_PIS")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtPagPis;

    public Date getDtPagPis() {
        return this.dtPagPis;
    }

    public void setDtPagPis(Date dtPagPis) {
        this.dtPagPis = dtPagPis;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_COFINS_IMP", precision = 15, scale = 6)
    private BigDecimal vlCofinsImp;

    public BigDecimal getVlCofinsImp() {
        return this.vlCofinsImp;
    }

    public void setVlCofinsImp(BigDecimal vlCofinsImp) {
        this.vlCofinsImp = vlCofinsImp;
    }
    @Campos(posicao = 8, tipo = 'D')
    @Column(name = "DT_PAG_COFINS")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtPagCofins;

    public Date getDtPagCofins() {
        return this.dtPagCofins;
    }

    public void setDtPagCofins(Date dtPagCofins) {
        this.dtPagCofins = dtPagCofins;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "LOC_EXE_SERV")
    private String locExeServ;

    public String getLocExeServ() {
        return this.locExeServ;
    }

    public void setLocExeServ(String locExeServ) {
        this.locExeServ = locExeServ;
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
        final RegA120 other = (RegA120) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegA120{" + "id=" + id + '}';
    }
}
