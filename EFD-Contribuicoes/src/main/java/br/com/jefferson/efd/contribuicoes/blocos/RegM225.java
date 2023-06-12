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
@Table(name = "reg_m225")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM225.findAll", query = "SELECT r FROM RegM225 r"),
    @NamedQuery(name = "RegM225.findById", query = "SELECT r FROM RegM225 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM225.findByIdPai", query = "SELECT r FROM RegM225 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM225.findByLinha", query = "SELECT r FROM RegM225 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM225.findByHashfile", query = "SELECT r FROM RegM225 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM225.findByReg", query = "SELECT r FROM RegM225 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM225.findByDetValorAj", query = "SELECT r FROM RegM225 r WHERE r.detValorAj = :detValorAj"),
    @NamedQuery(name = "RegM225.findByCstPis", query = "SELECT r FROM RegM225 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegM225.findByDetBcCred", query = "SELECT r FROM RegM225 r WHERE r.detBcCred = :detBcCred"),
    @NamedQuery(name = "RegM225.findByDetAliq", query = "SELECT r FROM RegM225 r WHERE r.detAliq = :detAliq"),
    @NamedQuery(name = "RegM225.findByDtOperAj", query = "SELECT r FROM RegM225 r WHERE r.dtOperAj = :dtOperAj"),
    @NamedQuery(name = "RegM225.findByDescAj", query = "SELECT r FROM RegM225 r WHERE r.descAj = :descAj"),
    @NamedQuery(name = "RegM225.findByCodCta", query = "SELECT r FROM RegM225 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegM225.findByInfoCompl", query = "SELECT r FROM RegM225 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 5)
public class RegM225 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM220 idPai;

    @Override
    public RegM220 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM220) idPai;
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
    @Column(name = "DET_VALOR_AJ", precision = 15, scale = 6)
    private BigDecimal detValorAj;

    public BigDecimal getDetValorAj() {
        return this.detValorAj;
    }

    public void setDetValorAj(BigDecimal detValorAj) {
        this.detValorAj = detValorAj;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "DET_BC_CRED", precision = 15, scale = 6)
    private BigDecimal detBcCred;

    public BigDecimal getDetBcCred() {
        return this.detBcCred;
    }

    public void setDetBcCred(BigDecimal detBcCred) {
        this.detBcCred = detBcCred;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "DET_ALIQ", precision = 15, scale = 6)
    private BigDecimal detAliq;

    public BigDecimal getDetAliq() {
        return this.detAliq;
    }

    public void setDetAliq(BigDecimal detAliq) {
        this.detAliq = detAliq;
    }
    @Campos(posicao = 6, tipo = 'D')
    @Column(name = "DT_OPER_AJ")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtOperAj;

    public Date getDtOperAj() {
        return this.dtOperAj;
    }

    public void setDtOperAj(Date dtOperAj) {
        this.dtOperAj = dtOperAj;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "DESC_AJ")
    private String descAj;

    public String getDescAj() {
        return this.descAj;
    }

    public void setDescAj(String descAj) {
        this.descAj = descAj;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 9, tipo = 'C')
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
        final RegM225 other = (RegM225) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM225{" + "id=" + id + '}';
    }
}
