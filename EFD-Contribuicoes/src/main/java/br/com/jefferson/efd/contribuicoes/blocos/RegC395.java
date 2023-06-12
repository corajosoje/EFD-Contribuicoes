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
@Table(name = "reg_c395")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC395.findAll", query = "SELECT r FROM RegC395 r"),
    @NamedQuery(name = "RegC395.findById", query = "SELECT r FROM RegC395 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC395.findByIdPai", query = "SELECT r FROM RegC395 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC395.findByLinha", query = "SELECT r FROM RegC395 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC395.findByHashfile", query = "SELECT r FROM RegC395 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC395.findByReg", query = "SELECT r FROM RegC395 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC395.findByCodMod", query = "SELECT r FROM RegC395 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC395.findByCodPart", query = "SELECT r FROM RegC395 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC395.findBySer", query = "SELECT r FROM RegC395 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC395.findBySubSer", query = "SELECT r FROM RegC395 r WHERE r.subSer = :subSer"),
    @NamedQuery(name = "RegC395.findByNumDoc", query = "SELECT r FROM RegC395 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC395.findByDtDoc", query = "SELECT r FROM RegC395 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC395.findByVlDoc", query = "SELECT r FROM RegC395 r WHERE r.vlDoc = :vlDoc")})
@Registros(nivel = 3)
public class RegC395 implements Serializable, BlocoSped {

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
    private List<RegC396> regC396;

    public List<RegC396> getRegC396() {
        return regC396;
    }

    public void setRegC396(List<RegC396> regC396) {
        this.regC396 = regC396;
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
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;

    public String getCodPart() {
        return this.codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    public String getSer() {
        return this.ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "SUB_SER")
    private String subSer;

    public String getSubSer() {
        return this.subSer;
    }

    public void setSubSer(String subSer) {
        this.subSer = subSer;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "NUM_DOC")
    private String numDoc;

    public String getNumDoc() {
        return this.numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    @Campos(posicao = 7, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDoc;

    public Date getDtDoc() {
        return this.dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;

    public BigDecimal getVlDoc() {
        return this.vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
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
        final RegC395 other = (RegC395) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC395{" + "id=" + id + '}';
    }
}
