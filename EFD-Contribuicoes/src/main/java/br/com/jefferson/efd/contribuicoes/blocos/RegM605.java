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
@Table(name = "reg_m605")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM605.findAll", query = "SELECT r FROM RegM605 r"),
    @NamedQuery(name = "RegM605.findById", query = "SELECT r FROM RegM605 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM605.findByIdPai", query = "SELECT r FROM RegM605 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM605.findByLinha", query = "SELECT r FROM RegM605 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM605.findByHashfile", query = "SELECT r FROM RegM605 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM605.findByReg", query = "SELECT r FROM RegM605 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM605.findByNumCampo", query = "SELECT r FROM RegM605 r WHERE r.numCampo = :numCampo"),
    @NamedQuery(name = "RegM605.findByCodRec", query = "SELECT r FROM RegM605 r WHERE r.codRec = :codRec"),
    @NamedQuery(name = "RegM605.findByVlDebito", query = "SELECT r FROM RegM605 r WHERE r.vlDebito = :vlDebito")})
@Registros(nivel = 3)
public class RegM605 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM600 idPai;

    @Override
    public RegM600 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM600) idPai;
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
        final RegM605 other = (RegM605) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM605{" + "id=" + id + '}';
    }
}
