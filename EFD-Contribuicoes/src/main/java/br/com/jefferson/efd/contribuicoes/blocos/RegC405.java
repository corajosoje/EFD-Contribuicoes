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
@Table(name = "reg_c405")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC405.findAll", query = "SELECT r FROM RegC405 r"),
    @NamedQuery(name = "RegC405.findById", query = "SELECT r FROM RegC405 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC405.findByIdPai", query = "SELECT r FROM RegC405 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC405.findByLinha", query = "SELECT r FROM RegC405 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC405.findByHashfile", query = "SELECT r FROM RegC405 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC405.findByReg", query = "SELECT r FROM RegC405 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC405.findByDtDoc", query = "SELECT r FROM RegC405 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC405.findByCro", query = "SELECT r FROM RegC405 r WHERE r.cro = :cro"),
    @NamedQuery(name = "RegC405.findByCrz", query = "SELECT r FROM RegC405 r WHERE r.crz = :crz"),
    @NamedQuery(name = "RegC405.findByNumCooFin", query = "SELECT r FROM RegC405 r WHERE r.numCooFin = :numCooFin"),
    @NamedQuery(name = "RegC405.findByGtFin", query = "SELECT r FROM RegC405 r WHERE r.gtFin = :gtFin"),
    @NamedQuery(name = "RegC405.findByVlBrt", query = "SELECT r FROM RegC405 r WHERE r.vlBrt = :vlBrt")})
@Registros(nivel = 4)
public class RegC405 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC400 idPai;

    @Override
    public RegC400 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC400) idPai;
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
    private List<RegC481> regC481;

    public List<RegC481> getRegC481() {
        return regC481;
    }

    public void setRegC481(List<RegC481> regC481) {
        this.regC481 = regC481;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC485> regC485;

    public List<RegC485> getRegC485() {
        return regC485;
    }

    public void setRegC485(List<RegC485> regC485) {
        this.regC485 = regC485;
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
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDoc;

    public Date getDtDoc() {
        return this.dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CRO")
    private String cro;

    public String getCro() {
        return this.cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CRZ")
    private String crz;

    public String getCrz() {
        return this.crz;
    }

    public void setCrz(String crz) {
        this.crz = crz;
    }

    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "NUM_COO_FIN")
    private int numCooFin;

    public int getNumCooFin() {
        return this.numCooFin;
    }

    public void setNumCooFin(int numCooFin) {
        this.numCooFin = numCooFin;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "GT_FIN", precision = 15, scale = 6)
    private BigDecimal gtFin;

    public BigDecimal getGtFin() {
        return this.gtFin;
    }

    public void setGtFin(BigDecimal gtFin) {
        this.gtFin = gtFin;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_BRT", precision = 15, scale = 6)
    private BigDecimal vlBrt;

    public BigDecimal getVlBrt() {
        return this.vlBrt;
    }

    public void setVlBrt(BigDecimal vlBrt) {
        this.vlBrt = vlBrt;
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
        final RegC405 other = (RegC405) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC405{" + "id=" + id + '}';
    }
}
