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
@Table(name = "reg_p110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegP110.findAll", query = "SELECT r FROM RegP110 r"),
    @NamedQuery(name = "RegP110.findById", query = "SELECT r FROM RegP110 r WHERE r.id = :id"),
    @NamedQuery(name = "RegP110.findByIdPai", query = "SELECT r FROM RegP110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegP110.findByLinha", query = "SELECT r FROM RegP110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegP110.findByHashfile", query = "SELECT r FROM RegP110 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegP110.findByReg", query = "SELECT r FROM RegP110 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegP110.findByNumCampo", query = "SELECT r FROM RegP110 r WHERE r.numCampo = :numCampo"),
    @NamedQuery(name = "RegP110.findByCodDet", query = "SELECT r FROM RegP110 r WHERE r.codDet = :codDet"),
    @NamedQuery(name = "RegP110.findByDetValor", query = "SELECT r FROM RegP110 r WHERE r.detValor = :detValor"),
    @NamedQuery(name = "RegP110.findByInfCompl", query = "SELECT r FROM RegP110 r WHERE r.infCompl = :infCompl")})
@Registros(nivel = 4)
public class RegP110 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegP100 idPai;

    @Override
    public RegP100 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegP100) idPai;
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
    @Column(name = "INF_COMPL")
    private String infCompl;

    public String getInfCompl() {
        return this.infCompl;
    }

    public void setInfCompl(String infCompl) {
        this.infCompl = infCompl;
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
        final RegP110 other = (RegP110) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegP110{" + "id=" + id + '}';
    }
}
