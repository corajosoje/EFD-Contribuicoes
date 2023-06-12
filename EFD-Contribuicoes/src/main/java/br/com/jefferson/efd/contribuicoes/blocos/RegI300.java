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
@Table(name = "reg_i300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegI300.findAll", query = "SELECT r FROM RegI300 r"),
    @NamedQuery(name = "RegI300.findById", query = "SELECT r FROM RegI300 r WHERE r.id = :id"),
    @NamedQuery(name = "RegI300.findByIdPai", query = "SELECT r FROM RegI300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegI300.findByLinha", query = "SELECT r FROM RegI300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegI300.findByHashfile", query = "SELECT r FROM RegI300 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegI300.findByReg", query = "SELECT r FROM RegI300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegI300.findByCodComp", query = "SELECT r FROM RegI300 r WHERE r.codComp = :codComp"),
    @NamedQuery(name = "RegI300.findByDetValor", query = "SELECT r FROM RegI300 r WHERE r.detValor = :detValor"),
    @NamedQuery(name = "RegI300.findByCodCta", query = "SELECT r FROM RegI300 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegI300.findByInfoCompl", query = "SELECT r FROM RegI300 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 5)
public class RegI300 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegI200 idPai;

    @Override
    public RegI200 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegI200) idPai;
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
    private List<RegI399> regI399;

    public List<RegI399> getRegI399() {
        return regI399;
    }

    public void setRegI399(List<RegI399> regI399) {
        this.regI399 = regI399;
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
    @Column(name = "COD_COMP")
    private String codComp;

    public String getCodComp() {
        return this.codComp;
    }

    public void setCodComp(String codComp) {
        this.codComp = codComp;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "DET_VALOR", precision = 15, scale = 6)
    private BigDecimal detValor;

    public BigDecimal getDetValor() {
        return this.detValor;
    }

    public void setDetValor(BigDecimal detValor) {
        this.detValor = detValor;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 5, tipo = 'C')
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
        final RegI300 other = (RegI300) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegI300{" + "id=" + id + '}';
    }
}
