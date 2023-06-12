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
@Table(name = "reg_d200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD200.findAll", query = "SELECT r FROM RegD200 r"),
    @NamedQuery(name = "RegD200.findById", query = "SELECT r FROM RegD200 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD200.findByIdPai", query = "SELECT r FROM RegD200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD200.findByLinha", query = "SELECT r FROM RegD200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD200.findByHashfile", query = "SELECT r FROM RegD200 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD200.findByReg", query = "SELECT r FROM RegD200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD200.findByCodMod", query = "SELECT r FROM RegD200 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegD200.findByCodSit", query = "SELECT r FROM RegD200 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegD200.findBySer", query = "SELECT r FROM RegD200 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegD200.findBySub", query = "SELECT r FROM RegD200 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegD200.findByNumDocIni", query = "SELECT r FROM RegD200 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "RegD200.findByNumDocFin", query = "SELECT r FROM RegD200 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "RegD200.findByCfop", query = "SELECT r FROM RegD200 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegD200.findByDtRef", query = "SELECT r FROM RegD200 r WHERE r.dtRef = :dtRef"),
    @NamedQuery(name = "RegD200.findByVlDoc", query = "SELECT r FROM RegD200 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegD200.findByVlDesc", query = "SELECT r FROM RegD200 r WHERE r.vlDesc = :vlDesc")})
@Registros(nivel = 3)
public class RegD200 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD010 idPai;

    @Override
    public RegD010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegD010) idPai;
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
    private List<RegD201> regD201;

    public List<RegD201> getRegD201() {
        return regD201;
    }

    public void setRegD201(List<RegD201> regD201) {
        this.regD201 = regD201;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD205> regD205;

    public List<RegD205> getRegD205() {
        return regD205;
    }

    public void setRegD205(List<RegD205> regD205) {
        this.regD205 = regD205;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD209> regD209;

    public List<RegD209> getRegD209() {
        return regD209;
    }

    public void setRegD209(List<RegD209> regD209) {
        this.regD209 = regD209;
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
    @Column(name = "COD_SIT")
    private String codSit;

    public String getCodSit() {
        return this.codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
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
    @Column(name = "SUB")
    private String sub;

    public String getSub() {
        return this.sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;

    public int getNumDocIni() {
        return this.numDocIni;
    }

    public void setNumDocIni(int numDocIni) {
        this.numDocIni = numDocIni;
    }
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;

    public int getNumDocFin() {
        return this.numDocFin;
    }

    public void setNumDocFin(int numDocFin) {
        this.numDocFin = numDocFin;
    }
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "CFOP")
    private int cfop;

    public int getCfop() {
        return this.cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }
    @Campos(posicao = 9, tipo = 'D')
    @Column(name = "DT_REF")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRef;

    public Date getDtRef() {
        return this.dtRef;
    }

    public void setDtRef(Date dtRef) {
        this.dtRef = dtRef;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;

    public BigDecimal getVlDoc() {
        return this.vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
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
        final RegD200 other = (RegD200) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegD200{" + "id=" + id + '}';
    }
}
