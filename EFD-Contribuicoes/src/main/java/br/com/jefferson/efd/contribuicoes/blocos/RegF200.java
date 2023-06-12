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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_f200")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF200.findAll", query = "SELECT r FROM RegF200 r"),
    @NamedQuery(name = "RegF200.findById", query = "SELECT r FROM RegF200 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF200.findByIdPai", query = "SELECT r FROM RegF200 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF200.findByLinha", query = "SELECT r FROM RegF200 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF200.findByHashfile", query = "SELECT r FROM RegF200 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF200.findByReg", query = "SELECT r FROM RegF200 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF200.findByIndOper", query = "SELECT r FROM RegF200 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegF200.findByUnidImob", query = "SELECT r FROM RegF200 r WHERE r.unidImob = :unidImob"),
    @NamedQuery(name = "RegF200.findByIdentEmp", query = "SELECT r FROM RegF200 r WHERE r.identEmp = :identEmp"),
    @NamedQuery(name = "RegF200.findByDescUnidImob", query = "SELECT r FROM RegF200 r WHERE r.descUnidImob = :descUnidImob"),
    @NamedQuery(name = "RegF200.findByNumCont", query = "SELECT r FROM RegF200 r WHERE r.numCont = :numCont"),
    @NamedQuery(name = "RegF200.findByCpfCnpjAdqu", query = "SELECT r FROM RegF200 r WHERE r.cpfCnpjAdqu = :cpfCnpjAdqu"),
    @NamedQuery(name = "RegF200.findByDtOper", query = "SELECT r FROM RegF200 r WHERE r.dtOper = :dtOper"),
    @NamedQuery(name = "RegF200.findByVlTotVend", query = "SELECT r FROM RegF200 r WHERE r.vlTotVend = :vlTotVend"),
    @NamedQuery(name = "RegF200.findByVlRecAcum", query = "SELECT r FROM RegF200 r WHERE r.vlRecAcum = :vlRecAcum"),
    @NamedQuery(name = "RegF200.findByVlTotRec", query = "SELECT r FROM RegF200 r WHERE r.vlTotRec = :vlTotRec"),
    @NamedQuery(name = "RegF200.findByCstPis", query = "SELECT r FROM RegF200 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF200.findByVlBcPis", query = "SELECT r FROM RegF200 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegF200.findByAliqPis", query = "SELECT r FROM RegF200 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegF200.findByVlPis", query = "SELECT r FROM RegF200 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegF200.findByCstCofins", query = "SELECT r FROM RegF200 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF200.findByVlBcCofins", query = "SELECT r FROM RegF200 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegF200.findByAliqCofins", query = "SELECT r FROM RegF200 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegF200.findByVlCofins", query = "SELECT r FROM RegF200 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegF200.findByPercRecReceb", query = "SELECT r FROM RegF200 r WHERE r.percRecReceb = :percRecReceb"),
    @NamedQuery(name = "RegF200.findByIndNatEmp", query = "SELECT r FROM RegF200 r WHERE r.indNatEmp = :indNatEmp"),
    @NamedQuery(name = "RegF200.findByInfComp", query = "SELECT r FROM RegF200 r WHERE r.infComp = :infComp")})
@Registros(nivel = 3)
public class RegF200 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegF010 idPai;

    @Override
    public RegF010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegF010) idPai;
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegF205 regF205;

    public RegF205 getRegF205() {
        return regF205;
    }

    public void setRegF205(RegF205 regF205) {
        this.regF205 = regF205;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF210> regF210;

    public List<RegF210> getRegF210() {
        return regF210;
    }

    public void setRegF210(List<RegF210> regF210) {
        this.regF210 = regF210;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF211> regF211;

    public List<RegF211> getRegF211() {
        return regF211;
    }

    public void setRegF211(List<RegF211> regF211) {
        this.regF211 = regF211;
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
    @Column(name = "IND_OPER")
    private String indOper;

    public String getIndOper() {
        return this.indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "UNID_IMOB")
    private String unidImob;

    public String getUnidImob() {
        return this.unidImob;
    }

    public void setUnidImob(String unidImob) {
        this.unidImob = unidImob;
    }

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "IDENT_EMP")
    private String identEmp;

    public String getIdentEmp() {
        return this.identEmp;
    }

    public void setIdentEmp(String identEmp) {
        this.identEmp = identEmp;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "DESC_UNID_IMOB")
    private String descUnidImob;

    public String getDescUnidImob() {
        return this.descUnidImob;
    }

    public void setDescUnidImob(String descUnidImob) {
        this.descUnidImob = descUnidImob;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "NUM_CONT")
    private String numCont;

    public String getNumCont() {
        return this.numCont;
    }

    public void setNumCont(String numCont) {
        this.numCont = numCont;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CPF_CNPJ_ADQU")
    private String cpfCnpjAdqu;

    public String getCpfCnpjAdqu() {
        return this.cpfCnpjAdqu;
    }

    public void setCpfCnpjAdqu(String cpfCnpjAdqu) {
        this.cpfCnpjAdqu = cpfCnpjAdqu;
    }
    @Campos(posicao = 8, tipo = 'D')
    @Column(name = "DT_OPER")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtOper;

    public Date getDtOper() {
        return this.dtOper;
    }

    public void setDtOper(Date dtOper) {
        this.dtOper = dtOper;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_TOT_VEND", precision = 15, scale = 6)
    private BigDecimal vlTotVend;

    public BigDecimal getVlTotVend() {
        return this.vlTotVend;
    }

    public void setVlTotVend(BigDecimal vlTotVend) {
        this.vlTotVend = vlTotVend;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_REC_ACUM", precision = 15, scale = 6)
    private BigDecimal vlRecAcum;

    public BigDecimal getVlRecAcum() {
        return this.vlRecAcum;
    }

    public void setVlRecAcum(BigDecimal vlRecAcum) {
        this.vlRecAcum = vlRecAcum;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_TOT_REC", precision = 15, scale = 6)
    private BigDecimal vlTotRec;

    public BigDecimal getVlTotRec() {
        return this.vlTotRec;
    }

    public void setVlTotRec(BigDecimal vlTotRec) {
        this.vlTotRec = vlTotRec;
    }
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 16, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "PERC_REC_RECEB", precision = 15, scale = 6)
    private BigDecimal percRecReceb;

    public BigDecimal getPercRecReceb() {
        return this.percRecReceb;
    }

    public void setPercRecReceb(BigDecimal percRecReceb) {
        this.percRecReceb = percRecReceb;
    }
    @Campos(posicao = 21, tipo = 'I')
    @Column(name = "IND_NAT_EMP")
    private int indNatEmp;

    public int getIndNatEmp() {
        return this.indNatEmp;
    }

    public void setIndNatEmp(int indNatEmp) {
        this.indNatEmp = indNatEmp;
    }
    @Campos(posicao = 22, tipo = 'C')
    @Column(name = "INF_COMP")
    private String infComp;

    public String getInfComp() {
        return this.infComp;
    }

    public void setInfComp(String infComp) {
        this.infComp = infComp;
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
        final RegF200 other = (RegF200) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF200{" + "id=" + id + '}';
    }
}
