package br.com.jefferson.efd.contribuicoes.blocos;

import java.io.Serializable;
import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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
@Table(name = "reg_0500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0500.findAll", query = "SELECT r FROM Reg0500 r"),
    @NamedQuery(name = "Reg0500.findById", query = "SELECT r FROM Reg0500 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0500.findByIdPai", query = "SELECT r FROM Reg0500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0500.findByLinha", query = "SELECT r FROM Reg0500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0500.findByHashfile", query = "SELECT r FROM Reg0500 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0500.findByReg", query = "SELECT r FROM Reg0500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0500.findByDtAlt", query = "SELECT r FROM Reg0500 r WHERE r.dtAlt = :dtAlt"),
    @NamedQuery(name = "Reg0500.findByCodNatCc", query = "SELECT r FROM Reg0500 r WHERE r.codNatCc = :codNatCc"),
    @NamedQuery(name = "Reg0500.findByIndCta", query = "SELECT r FROM Reg0500 r WHERE r.indCta = :indCta"),
    @NamedQuery(name = "Reg0500.findByNivel", query = "SELECT r FROM Reg0500 r WHERE r.nivel = :nivel"),
    @NamedQuery(name = "Reg0500.findByCodCta", query = "SELECT r FROM Reg0500 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "Reg0500.findByNomeCta", query = "SELECT r FROM Reg0500 r WHERE r.nomeCta = :nomeCta"),
    @NamedQuery(name = "Reg0500.findByCodCtaRef", query = "SELECT r FROM Reg0500 r WHERE r.codCtaRef = :codCtaRef"),
    @NamedQuery(name = "Reg0500.findByCnpjEst", query = "SELECT r FROM Reg0500 r WHERE r.cnpjEst = :cnpjEst")})
@Registros(nivel = 2)
public class Reg0500 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    @Override
    public Reg0001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
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

    public String getReg() {
        return this.reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_ALT")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAlt;

    public Date getDtAlt() {
        return this.dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_NAT_CC")
    private String codNatCc;

    public String getCodNatCc() {
        return this.codNatCc;
    }

    public void setCodNatCc(String codNatCc) {
        this.codNatCc = codNatCc;
    }

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "IND_CTA")
    private String indCta;

    public String getIndCta() {
        return this.indCta;
    }

    public void setIndCta(String indCta) {
        this.indCta = indCta;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "NIVEL")
    private String nivel;

    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "NOME_CTA")
    private String nomeCta;

    public String getNomeCta() {
        return this.nomeCta;
    }

    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_CTA_REF")
    private String codCtaRef;

    public String getCodCtaRef() {
        return this.codCtaRef;
    }

    public void setCodCtaRef(String codCtaRef) {
        this.codCtaRef = codCtaRef;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CNPJ_EST")
    private String cnpjEst;

    public String getCnpjEst() {
        return this.cnpjEst;
    }

    public void setCnpjEst(String cnpjEst) {
        this.cnpjEst = cnpjEst;
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
        final Reg0500 other = (Reg0500) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0500{" + "id=" + id + '}';
    }
}
