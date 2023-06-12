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
@Table(name = "reg_c380")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC380.findAll", query = "SELECT r FROM RegC380 r"),
    @NamedQuery(name = "RegC380.findById", query = "SELECT r FROM RegC380 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC380.findByIdPai", query = "SELECT r FROM RegC380 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC380.findByLinha", query = "SELECT r FROM RegC380 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC380.findByHashfile", query = "SELECT r FROM RegC380 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC380.findByReg", query = "SELECT r FROM RegC380 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC380.findByCodMod", query = "SELECT r FROM RegC380 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC380.findByDtDocIni", query = "SELECT r FROM RegC380 r WHERE r.dtDocIni = :dtDocIni"),
    @NamedQuery(name = "RegC380.findByDtDocFin", query = "SELECT r FROM RegC380 r WHERE r.dtDocFin = :dtDocFin"),
    @NamedQuery(name = "RegC380.findByNumDocIni", query = "SELECT r FROM RegC380 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "RegC380.findByNumDocFin", query = "SELECT r FROM RegC380 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "RegC380.findByVlDoc", query = "SELECT r FROM RegC380 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC380.findByVlDocCanc", query = "SELECT r FROM RegC380 r WHERE r.vlDocCanc = :vlDocCanc")})
@Registros(nivel = 3)
public class RegC380 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC010 idPai;

    @Override
    public RegC010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC010) idPai;
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
    private List<RegC381> regC381;

    public List<RegC381> getRegC381() {
        return regC381;
    }

    public void setRegC381(List<RegC381> regC381) {
        this.regC381 = regC381;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC385> regC385;

    public List<RegC385> getRegC385() {
        return regC385;
    }

    public void setRegC385(List<RegC385> regC385) {
        this.regC385 = regC385;
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
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_DOC_INI")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDocIni;

    public Date getDtDocIni() {
        return this.dtDocIni;
    }

    public void setDtDocIni(Date dtDocIni) {
        this.dtDocIni = dtDocIni;
    }
    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_DOC_FIN")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDocFin;

    public Date getDtDocFin() {
        return this.dtDocFin;
    }

    public void setDtDocFin(Date dtDocFin) {
        this.dtDocFin = dtDocFin;
    }
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;

    public int getNumDocIni() {
        return this.numDocIni;
    }

    public void setNumDocIni(int numDocIni) {
        this.numDocIni = numDocIni;
    }
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;

    public int getNumDocFin() {
        return this.numDocFin;
    }

    public void setNumDocFin(int numDocFin) {
        this.numDocFin = numDocFin;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;

    public BigDecimal getVlDoc() {
        return this.vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_DOC_CANC", precision = 15, scale = 6)
    private BigDecimal vlDocCanc;

    public BigDecimal getVlDocCanc() {
        return this.vlDocCanc;
    }

    public void setVlDocCanc(BigDecimal vlDocCanc) {
        this.vlDocCanc = vlDocCanc;
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
        final RegC380 other = (RegC380) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC380{" + "id=" + id + '}';
    }
}
