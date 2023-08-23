package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
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
@Table(name = "reg_c500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC500.findAll", query = "SELECT r FROM RegC500 r"),
    @NamedQuery(name = "RegC500.findById", query = "SELECT r FROM RegC500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC500.findByIdPai", query = "SELECT r FROM RegC500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC500.findByLinha", query = "SELECT r FROM RegC500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC500.findByHashfile", query = "SELECT r FROM RegC500 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC500.findByReg", query = "SELECT r FROM RegC500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC500.findByCodPart", query = "SELECT r FROM RegC500 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC500.findByCodMod", query = "SELECT r FROM RegC500 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC500.findByCodSit", query = "SELECT r FROM RegC500 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "RegC500.findBySer", query = "SELECT r FROM RegC500 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC500.findBySub", query = "SELECT r FROM RegC500 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegC500.findByNumDoc", query = "SELECT r FROM RegC500 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC500.findByDtDoc", query = "SELECT r FROM RegC500 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC500.findByVlDoc", query = "SELECT r FROM RegC500 r WHERE r.vlDoc = :vlDoc"),
    @NamedQuery(name = "RegC500.findByVlIcms", query = "SELECT r FROM RegC500 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC500.findByCodInf", query = "SELECT r FROM RegC500 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "RegC500.findByVlPis", query = "SELECT r FROM RegC500 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC500.findByVlCofins", query = "SELECT r FROM RegC500 r WHERE r.vlCofins = :vlCofins")})
@Registros(nivel = 3)
public class RegC500 implements Serializable, BlocoSped {

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
    private List<RegC501> regC501;

    public List<RegC501> getRegC501() {
        return regC501;
    }

    public void setRegC501(List<RegC501> regC501) {
        this.regC501 = regC501;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC505> regC505;

    public List<RegC505> getRegC505() {
        return regC505;
    }

    public void setRegC505(List<RegC505> regC505) {
        this.regC505 = regC505;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC509> regC509;

    public List<RegC509> getRegC509() {
        return regC509;
    }

    public void setRegC509(List<RegC509> regC509) {
        this.regC509 = regC509;
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
    @Column(name = "COD_PART")
    private String codPart;

    public String getCodPart() {
        return this.codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_SIT")
    private String codSit;

    public String getCodSit() {
        return this.codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    public String getSer() {
        return this.ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "SUB")
    private int sub;

    public int getSub() {
        return this.sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;

    public int getNumDoc() {
        return this.numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }
    @Campos(posicao = 8, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDoc;

    public Date getDtDoc() {
        return this.dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    @Campos(posicao = 9, tipo = 'D')
    @Column(name = "DT_ENT")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtEnt;

    public Date getDtEnt() {
        return this.dtEnt;
    }

    public void setDtEnt(Date dtEnt) {
        this.dtEnt = dtEnt;
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
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;

    public BigDecimal getVlIcms() {
        return this.vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "COD_INF")
    private String codInf;

    public String getCodInf() {
        return this.codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 15, tipo = 'C')
    @Column(name = "CHV_DOCe")
    private String chvDoce;

    public String getChvDoce() {
        return this.chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
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
        final RegC500 other = (RegC500) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC500{" + "id=" + id + '}';
    }
}
