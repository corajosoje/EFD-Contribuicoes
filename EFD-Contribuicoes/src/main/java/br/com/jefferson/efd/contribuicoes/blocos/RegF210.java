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
@Table(name = "reg_f210")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF210.findAll", query = "SELECT r FROM RegF210 r"),
    @NamedQuery(name = "RegF210.findById", query = "SELECT r FROM RegF210 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF210.findByIdPai", query = "SELECT r FROM RegF210 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF210.findByLinha", query = "SELECT r FROM RegF210 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF210.findByHashfile", query = "SELECT r FROM RegF210 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF210.findByReg", query = "SELECT r FROM RegF210 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF210.findByVlCusOrc", query = "SELECT r FROM RegF210 r WHERE r.vlCusOrc = :vlCusOrc"),
    @NamedQuery(name = "RegF210.findByVlExc", query = "SELECT r FROM RegF210 r WHERE r.vlExc = :vlExc"),
    @NamedQuery(name = "RegF210.findByVlCusOrcAju", query = "SELECT r FROM RegF210 r WHERE r.vlCusOrcAju = :vlCusOrcAju"),
    @NamedQuery(name = "RegF210.findByVlBcCred", query = "SELECT r FROM RegF210 r WHERE r.vlBcCred = :vlBcCred"),
    @NamedQuery(name = "RegF210.findByCstPis", query = "SELECT r FROM RegF210 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF210.findByAliqPis", query = "SELECT r FROM RegF210 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegF210.findByVlCredPisUtil", query = "SELECT r FROM RegF210 r WHERE r.vlCredPisUtil = :vlCredPisUtil"),
    @NamedQuery(name = "RegF210.findByCstCofins", query = "SELECT r FROM RegF210 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF210.findByAliqCofins", query = "SELECT r FROM RegF210 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegF210.findByVlCredCofinsUtil", query = "SELECT r FROM RegF210 r WHERE r.vlCredCofinsUtil = :vlCredCofinsUtil")})
@Registros(nivel = 4)
public class RegF210 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegF200 idPai;

    @Override
    public RegF200 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegF200) idPai;
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
    @Column(name = "VL_CUS_ORC", precision = 15, scale = 6)
    private BigDecimal vlCusOrc;

    public BigDecimal getVlCusOrc() {
        return this.vlCusOrc;
    }

    public void setVlCusOrc(BigDecimal vlCusOrc) {
        this.vlCusOrc = vlCusOrc;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_EXC", precision = 15, scale = 6)
    private BigDecimal vlExc;

    public BigDecimal getVlExc() {
        return this.vlExc;
    }

    public void setVlExc(BigDecimal vlExc) {
        this.vlExc = vlExc;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_CUS_ORC_AJU", precision = 15, scale = 6)
    private BigDecimal vlCusOrcAju;

    public BigDecimal getVlCusOrcAju() {
        return this.vlCusOrcAju;
    }

    public void setVlCusOrcAju(BigDecimal vlCusOrcAju) {
        this.vlCusOrcAju = vlCusOrcAju;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_BC_CRED", precision = 15, scale = 6)
    private BigDecimal vlBcCred;

    public BigDecimal getVlBcCred() {
        return this.vlBcCred;
    }

    public void setVlBcCred(BigDecimal vlBcCred) {
        this.vlBcCred = vlBcCred;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
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
    @Column(name = "VL_CRED_PIS_UTIL", precision = 15, scale = 6)
    private BigDecimal vlCredPisUtil;

    public BigDecimal getVlCredPisUtil() {
        return this.vlCredPisUtil;
    }

    public void setVlCredPisUtil(BigDecimal vlCredPisUtil) {
        this.vlCredPisUtil = vlCredPisUtil;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
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
    @Column(name = "VL_CRED_COFINS_UTIL", precision = 15, scale = 6)
    private BigDecimal vlCredCofinsUtil;

    public BigDecimal getVlCredCofinsUtil() {
        return this.vlCredCofinsUtil;
    }

    public void setVlCredCofinsUtil(BigDecimal vlCredCofinsUtil) {
        this.vlCredCofinsUtil = vlCredCofinsUtil;
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
        final RegF210 other = (RegF210) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF210{" + "id=" + id + '}';
    }
}
