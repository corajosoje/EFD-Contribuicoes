package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
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
@Table(name = "reg_i200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegI200.findAll", query = "SELECT r FROM RegI200 r"),
    @NamedQuery(name = "RegI200.findById", query = "SELECT r FROM RegI200 r WHERE r.id = :id"),
    @NamedQuery(name = "RegI200.findByIdPai", query = "SELECT r FROM RegI200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegI200.findByLinha", query = "SELECT r FROM RegI200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegI200.findByHashfile", query = "SELECT r FROM RegI200 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegI200.findByReg", query = "SELECT r FROM RegI200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegI200.findByNumCampo", query = "SELECT r FROM RegI200 r WHERE r.numCampo = :numCampo"),
    @NamedQuery(name = "RegI200.findByCodDet", query = "SELECT r FROM RegI200 r WHERE r.codDet = :codDet"),
    @NamedQuery(name = "RegI200.findByDetValor", query = "SELECT r FROM RegI200 r WHERE r.detValor = :detValor"),
    @NamedQuery(name = "RegI200.findByCodCta", query = "SELECT r FROM RegI200 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegI200.findByInfoCompl", query = "SELECT r FROM RegI200 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 4)
public class RegI200 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegI100 idPai;

    @Override
    public RegI100 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegI100) idPai;
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
    private List<RegI299> regI299;

    public List<RegI299> getRegI299() {
        return regI299;
    }

    public void setRegI299(List<RegI299> regI299) {
        this.regI299 = regI299;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegI300> regI300;

    public List<RegI300> getRegI300() {
        return regI300;
    }

    public void setRegI300(List<RegI300> regI300) {
        this.regI300 = regI300;
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
    @Column(name = "NUM_CAMPO")
    private String numCampo;

    public String getNumCampo() {
        return this.numCampo;
    }

    public void setNumCampo(String numCampo) {
        this.numCampo = numCampo;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_DET")
    private String codDet;

    public String getCodDet() {
        return this.codDet;
    }

    public void setCodDet(String codDet) {
        this.codDet = codDet;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "DET_VALOR", precision = 15, scale = 6)
    private BigDecimal detValor;

    public BigDecimal getDetValor() {
        return this.detValor;
    }

    public void setDetValor(BigDecimal detValor) {
        this.detValor = detValor;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 6, tipo = 'C')
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
        final RegI200 other = (RegI200) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegI200{" + "id=" + id + '}';
    }
}
