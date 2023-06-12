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
@Table(name = "reg_m205")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM205.findAll", query = "SELECT r FROM RegM205 r"),
    @NamedQuery(name = "RegM205.findById", query = "SELECT r FROM RegM205 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM205.findByIdPai", query = "SELECT r FROM RegM205 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM205.findByLinha", query = "SELECT r FROM RegM205 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM205.findByHashfile", query = "SELECT r FROM RegM205 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM205.findByReg", query = "SELECT r FROM RegM205 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM205.findByNumCampo", query = "SELECT r FROM RegM205 r WHERE r.numCampo = :numCampo"),
    @NamedQuery(name = "RegM205.findByCodRec", query = "SELECT r FROM RegM205 r WHERE r.codRec = :codRec"),
    @NamedQuery(name = "RegM205.findByVlDebito", query = "SELECT r FROM RegM205 r WHERE r.vlDebito = :vlDebito")})
@Registros(nivel = 3)
public class RegM205 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM200 idPai;

    @Override
    public RegM200 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM200) idPai;
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
    @Column(name = "COD_REC")
    private String codRec;

    public String getCodRec() {
        return this.codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_DEBITO", precision = 15, scale = 6)
    private BigDecimal vlDebito;

    public BigDecimal getVlDebito() {
        return this.vlDebito;
    }

    public void setVlDebito(BigDecimal vlDebito) {
        this.vlDebito = vlDebito;
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
        final RegM205 other = (RegM205) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM205{" + "id=" + id + '}';
    }
}
