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
@Table(name = "reg_m230")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM230.findAll", query = "SELECT r FROM RegM230 r"),
    @NamedQuery(name = "RegM230.findById", query = "SELECT r FROM RegM230 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM230.findByIdPai", query = "SELECT r FROM RegM230 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM230.findByLinha", query = "SELECT r FROM RegM230 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM230.findByHashfile", query = "SELECT r FROM RegM230 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM230.findByReg", query = "SELECT r FROM RegM230 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM230.findByCnpj", query = "SELECT r FROM RegM230 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "RegM230.findByVlVend", query = "SELECT r FROM RegM230 r WHERE r.vlVend = :vlVend"),
    @NamedQuery(name = "RegM230.findByVlNaoReceb", query = "SELECT r FROM RegM230 r WHERE r.vlNaoReceb = :vlNaoReceb"),
    @NamedQuery(name = "RegM230.findByVlContDif", query = "SELECT r FROM RegM230 r WHERE r.vlContDif = :vlContDif"),
    @NamedQuery(name = "RegM230.findByVlCredDif", query = "SELECT r FROM RegM230 r WHERE r.vlCredDif = :vlCredDif"),
    @NamedQuery(name = "RegM230.findByCodCred", query = "SELECT r FROM RegM230 r WHERE r.codCred = :codCred")})
@Registros(nivel = 4)
public class RegM230 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM210 idPai;

    @Override
    public RegM210 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM210) idPai;
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
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_VEND", precision = 15, scale = 6)
    private BigDecimal vlVend;

    public BigDecimal getVlVend() {
        return this.vlVend;
    }

    public void setVlVend(BigDecimal vlVend) {
        this.vlVend = vlVend;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_NAO_RECEB", precision = 15, scale = 6)
    private BigDecimal vlNaoReceb;

    public BigDecimal getVlNaoReceb() {
        return this.vlNaoReceb;
    }

    public void setVlNaoReceb(BigDecimal vlNaoReceb) {
        this.vlNaoReceb = vlNaoReceb;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_CONT_DIF", precision = 15, scale = 6)
    private BigDecimal vlContDif;

    public BigDecimal getVlContDif() {
        return this.vlContDif;
    }

    public void setVlContDif(BigDecimal vlContDif) {
        this.vlContDif = vlContDif;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_CRED_DIF", precision = 15, scale = 6)
    private BigDecimal vlCredDif;

    public BigDecimal getVlCredDif() {
        return this.vlCredDif;
    }

    public void setVlCredDif(BigDecimal vlCredDif) {
        this.vlCredDif = vlCredDif;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "COD_CRED")
    private String codCred;

    public String getCodCred() {
        return this.codCred;
    }

    public void setCodCred(String codCred) {
        this.codCred = codCred;
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
        final RegM230 other = (RegM230) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM230{" + "id=" + id + '}';
    }
}
