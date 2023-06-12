package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_m620")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM620.findAll", query = "SELECT r FROM RegM620 r"),
    @NamedQuery(name = "RegM620.findById", query = "SELECT r FROM RegM620 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM620.findByIdPai", query = "SELECT r FROM RegM620 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM620.findByLinha", query = "SELECT r FROM RegM620 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM620.findByHashfile", query = "SELECT r FROM RegM620 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM620.findByReg", query = "SELECT r FROM RegM620 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM620.findByIndAj", query = "SELECT r FROM RegM620 r WHERE r.indAj = :indAj"),
    @NamedQuery(name = "RegM620.findByVlAj", query = "SELECT r FROM RegM620 r WHERE r.vlAj = :vlAj"),
    @NamedQuery(name = "RegM620.findByCodAj", query = "SELECT r FROM RegM620 r WHERE r.codAj = :codAj"),
    @NamedQuery(name = "RegM620.findByNumDoc", query = "SELECT r FROM RegM620 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegM620.findByDescrAj", query = "SELECT r FROM RegM620 r WHERE r.descrAj = :descrAj"),
    @NamedQuery(name = "RegM620.findByDtRef", query = "SELECT r FROM RegM620 r WHERE r.dtRef = :dtRef")})
@Registros(nivel = 4)
public class RegM620 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM610 idPai;

    @Override
    public RegM610 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM610) idPai;
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
    private List<RegM625> regM625;

    public List<RegM625> getRegM625() {
        return regM625;
    }

    public void setRegM625(List<RegM625> regM625) {
        this.regM625 = regM625;
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
    @Column(name = "IND_AJ")
    private String indAj;

    public String getIndAj() {
        return this.indAj;
    }

    public void setIndAj(String indAj) {
        this.indAj = indAj;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_AJ", precision = 15, scale = 6)
    private BigDecimal vlAj;

    public BigDecimal getVlAj() {
        return this.vlAj;
    }

    public void setVlAj(BigDecimal vlAj) {
        this.vlAj = vlAj;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_AJ")
    private String codAj;

    public String getCodAj() {
        return this.codAj;
    }

    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "NUM_DOC")
    private String numDoc;

    public String getNumDoc() {
        return this.numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "DESCR_AJ")
    private String descrAj;

    public String getDescrAj() {
        return this.descrAj;
    }

    public void setDescrAj(String descrAj) {
        this.descrAj = descrAj;
    }
    @Campos(posicao = 7, tipo = 'D')
    @Column(name = "DT_REF")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRef;

    public Date getDtRef() {
        return this.dtRef;
    }

    public void setDtRef(Date dtRef) {
        this.dtRef = dtRef;
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
        final RegM620 other = (RegM620) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM620{" + "id=" + id + '}';
    }
}
