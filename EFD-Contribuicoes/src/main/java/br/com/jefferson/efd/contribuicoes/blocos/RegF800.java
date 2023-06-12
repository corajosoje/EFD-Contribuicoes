package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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
@Table(name = "reg_f800")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF800.findAll", query = "SELECT r FROM RegF800 r"),
    @NamedQuery(name = "RegF800.findById", query = "SELECT r FROM RegF800 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF800.findByIdPai", query = "SELECT r FROM RegF800 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF800.findByLinha", query = "SELECT r FROM RegF800 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF800.findByHashfile", query = "SELECT r FROM RegF800 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF800.findByReg", query = "SELECT r FROM RegF800 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF800.findByIndNatEven", query = "SELECT r FROM RegF800 r WHERE r.indNatEven = :indNatEven"),
    @NamedQuery(name = "RegF800.findByDtEven", query = "SELECT r FROM RegF800 r WHERE r.dtEven = :dtEven"),
    @NamedQuery(name = "RegF800.findByCnpjSuced", query = "SELECT r FROM RegF800 r WHERE r.cnpjSuced = :cnpjSuced"),
    @NamedQuery(name = "RegF800.findByPaContCred", query = "SELECT r FROM RegF800 r WHERE r.paContCred = :paContCred"),
    @NamedQuery(name = "RegF800.findByCodCred", query = "SELECT r FROM RegF800 r WHERE r.codCred = :codCred"),
    @NamedQuery(name = "RegF800.findByVlCredPis", query = "SELECT r FROM RegF800 r WHERE r.vlCredPis = :vlCredPis"),
    @NamedQuery(name = "RegF800.findByVlCredCofins", query = "SELECT r FROM RegF800 r WHERE r.vlCredCofins = :vlCredCofins"),
    @NamedQuery(name = "RegF800.findByPerCredCis", query = "SELECT r FROM RegF800 r WHERE r.perCredCis = :perCredCis")})
@Registros(nivel = 3)
public class RegF800 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegF010 idPai;

    @Override
    public RegF010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegF010) idPai;
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
    @Column(name = "IND_NAT_EVEN")
    private String indNatEven;

    public String getIndNatEven() {
        return this.indNatEven;
    }

    public void setIndNatEven(String indNatEven) {
        this.indNatEven = indNatEven;
    }

    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_EVEN")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtEven;

    public Date getDtEven() {
        return this.dtEven;
    }

    public void setDtEven(Date dtEven) {
        this.dtEven = dtEven;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CNPJ_SUCED")
    private String cnpjSuced;

    public String getCnpjSuced() {
        return this.cnpjSuced;
    }

    public void setCnpjSuced(String cnpjSuced) {
        this.cnpjSuced = cnpjSuced;
    }

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "PA_CONT_CRED")
    private String paContCred;

    public String getPaContCred() {
        return this.paContCred;
    }

    public void setPaContCred(String paContCred) {
        this.paContCred = paContCred;
    }

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_CRED")
    private String codCred;

    public String getCodCred() {
        return this.codCred;
    }

    public void setCodCred(String codCred) {
        this.codCred = codCred;
    }

    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_CRED_PIS", precision = 15, scale = 6)
    private BigDecimal vlCredPis;

    public BigDecimal getVlCredPis() {
        return this.vlCredPis;
    }

    public void setVlCredPis(BigDecimal vlCredPis) {
        this.vlCredPis = vlCredPis;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_CRED_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCredCofins;

    public BigDecimal getVlCredCofins() {
        return this.vlCredCofins;
    }

    public void setVlCredCofins(BigDecimal vlCredCofins) {
        this.vlCredCofins = vlCredCofins;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "PER_CRED_CIS", precision = 15, scale = 6)
    private BigDecimal perCredCis;

    public BigDecimal getPerCredCis() {
        return this.perCredCis;
    }

    public void setPerCredCis(BigDecimal perCredCis) {
        this.perCredCis = perCredCis;
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
        final RegF800 other = (RegF800) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF800{" + "id=" + id + '}';
    }
}
