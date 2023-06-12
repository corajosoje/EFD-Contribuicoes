package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_f120")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF120.findAll", query = "SELECT r FROM RegF120 r"),
    @NamedQuery(name = "RegF120.findById", query = "SELECT r FROM RegF120 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF120.findByIdPai", query = "SELECT r FROM RegF120 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF120.findByLinha", query = "SELECT r FROM RegF120 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF120.findByHashfile", query = "SELECT r FROM RegF120 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF120.findByReg", query = "SELECT r FROM RegF120 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF120.findByNatBcCred", query = "SELECT r FROM RegF120 r WHERE r.natBcCred = :natBcCred"),
    @NamedQuery(name = "RegF120.findByIdentBemImob", query = "SELECT r FROM RegF120 r WHERE r.identBemImob = :identBemImob"),
    @NamedQuery(name = "RegF120.findByIndOrigCred", query = "SELECT r FROM RegF120 r WHERE r.indOrigCred = :indOrigCred"),
    @NamedQuery(name = "RegF120.findByIndUtilBemImob", query = "SELECT r FROM RegF120 r WHERE r.indUtilBemImob = :indUtilBemImob"),
    @NamedQuery(name = "RegF120.findByVlOperDep", query = "SELECT r FROM RegF120 r WHERE r.vlOperDep = :vlOperDep"),
    @NamedQuery(name = "RegF120.findByParcOperNaoBcCred", query = "SELECT r FROM RegF120 r WHERE r.parcOperNaoBcCred = :parcOperNaoBcCred"),
    @NamedQuery(name = "RegF120.findByCstPis", query = "SELECT r FROM RegF120 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF120.findByVlBcPis", query = "SELECT r FROM RegF120 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegF120.findByAliqPis", query = "SELECT r FROM RegF120 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegF120.findByVlPis", query = "SELECT r FROM RegF120 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegF120.findByCstCofins", query = "SELECT r FROM RegF120 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF120.findByVlBcCofins", query = "SELECT r FROM RegF120 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegF120.findByAliqCofins", query = "SELECT r FROM RegF120 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegF120.findByVlCofins", query = "SELECT r FROM RegF120 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegF120.findByCodCta", query = "SELECT r FROM RegF120 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegF120.findByCodCcus", query = "SELECT r FROM RegF120 r WHERE r.codCcus = :codCcus"),
    @NamedQuery(name = "RegF120.findByDescBemImob", query = "SELECT r FROM RegF120 r WHERE r.descBemImob = :descBemImob")})
@Registros(nivel = 3)
public class RegF120 implements Serializable, BlocoSped {

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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF129> regF129;

    public List<RegF129> getRegF129() {
        return regF129;
    }

    public void setRegF129(List<RegF129> regF129) {
        this.regF129 = regF129;
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
    @Column(name = "NAT_BC_CRED")
    private String natBcCred;

    public String getNatBcCred() {
        return this.natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IDENT_BEM_IMOB")
    private String identBemImob;

    public String getIdentBemImob() {
        return this.identBemImob;
    }

    public void setIdentBemImob(String identBemImob) {
        this.identBemImob = identBemImob;
    }

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "IND_ORIG_CRED")
    private String indOrigCred;

    public String getIndOrigCred() {
        return this.indOrigCred;
    }

    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
    }
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "IND_UTIL_BEM_IMOB")
    private int indUtilBemImob;

    public int getIndUtilBemImob() {
        return this.indUtilBemImob;
    }

    public void setIndUtilBemImob(int indUtilBemImob) {
        this.indUtilBemImob = indUtilBemImob;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_OPER_DEP", precision = 15, scale = 6)
    private BigDecimal vlOperDep;

    public BigDecimal getVlOperDep() {
        return this.vlOperDep;
    }

    public void setVlOperDep(BigDecimal vlOperDep) {
        this.vlOperDep = vlOperDep;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "PARC_OPER_NAO_BC_CRED", precision = 15, scale = 6)
    private BigDecimal parcOperNaoBcCred;

    public BigDecimal getParcOperNaoBcCred() {
        return this.parcOperNaoBcCred;
    }

    public void setParcOperNaoBcCred(BigDecimal parcOperNaoBcCred) {
        this.parcOperNaoBcCred = parcOperNaoBcCred;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 16, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "COD_CCUS")
    private String codCcus;

    public String getCodCcus() {
        return this.codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    @Campos(posicao = 18, tipo = 'C')
    @Column(name = "DESC_BEM_IMOB")
    private String descBemImob;

    public String getDescBemImob() {
        return this.descBemImob;
    }

    public void setDescBemImob(String descBemImob) {
        this.descBemImob = descBemImob;
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
        final RegF120 other = (RegF120) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF120{" + "id=" + id + '}';
    }
}
