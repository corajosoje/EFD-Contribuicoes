package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
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
@Table(name = "reg_f130")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF130.findAll", query = "SELECT r FROM RegF130 r"),
    @NamedQuery(name = "RegF130.findById", query = "SELECT r FROM RegF130 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF130.findByIdPai", query = "SELECT r FROM RegF130 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF130.findByLinha", query = "SELECT r FROM RegF130 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF130.findByHashfile", query = "SELECT r FROM RegF130 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF130.findByReg", query = "SELECT r FROM RegF130 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF130.findByNatBcCred", query = "SELECT r FROM RegF130 r WHERE r.natBcCred = :natBcCred"),
    @NamedQuery(name = "RegF130.findByIdentBemImob", query = "SELECT r FROM RegF130 r WHERE r.identBemImob = :identBemImob"),
    @NamedQuery(name = "RegF130.findByIndOrigCred", query = "SELECT r FROM RegF130 r WHERE r.indOrigCred = :indOrigCred"),
    @NamedQuery(name = "RegF130.findByIndUtilBemImob", query = "SELECT r FROM RegF130 r WHERE r.indUtilBemImob = :indUtilBemImob"),
    @NamedQuery(name = "RegF130.findByMesOperAquis", query = "SELECT r FROM RegF130 r WHERE r.mesOperAquis = :mesOperAquis"),
    @NamedQuery(name = "RegF130.findByVlOperAquis", query = "SELECT r FROM RegF130 r WHERE r.vlOperAquis = :vlOperAquis"),
    @NamedQuery(name = "RegF130.findByParcOperNaoBcCred", query = "SELECT r FROM RegF130 r WHERE r.parcOperNaoBcCred = :parcOperNaoBcCred"),
    @NamedQuery(name = "RegF130.findByVlBcCred", query = "SELECT r FROM RegF130 r WHERE r.vlBcCred = :vlBcCred"),
    @NamedQuery(name = "RegF130.findByIndNrParc", query = "SELECT r FROM RegF130 r WHERE r.indNrParc = :indNrParc"),
    @NamedQuery(name = "RegF130.findByCstPis", query = "SELECT r FROM RegF130 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF130.findByVlBcPis", query = "SELECT r FROM RegF130 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegF130.findByAliqPis", query = "SELECT r FROM RegF130 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegF130.findByVlPis", query = "SELECT r FROM RegF130 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegF130.findByCstCofins", query = "SELECT r FROM RegF130 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF130.findByVlBcCofins", query = "SELECT r FROM RegF130 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegF130.findByAliqCofins", query = "SELECT r FROM RegF130 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegF130.findByVlCofins", query = "SELECT r FROM RegF130 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegF130.findByCodCta", query = "SELECT r FROM RegF130 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegF130.findByCodCcus", query = "SELECT r FROM RegF130 r WHERE r.codCcus = :codCcus"),
    @NamedQuery(name = "RegF130.findByDescBemImob", query = "SELECT r FROM RegF130 r WHERE r.descBemImob = :descBemImob")})
@Registros(nivel = 3)
public class RegF130 implements Serializable, BlocoSped {

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
    private List<RegF139> regF139;

    public List<RegF139> getRegF139() {
        return regF139;
    }

    public void setRegF139(List<RegF139> regF139) {
        this.regF139 = regF139;
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
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "MES_OPER_AQUIS")
    private String mesOperAquis;

    public String getMesOperAquis() {
        return this.mesOperAquis;
    }

    public void setMesOperAquis(String mesOperAquis) {
        this.mesOperAquis = mesOperAquis;
    }

    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_OPER_AQUIS", precision = 15, scale = 6)
    private BigDecimal vlOperAquis;

    public BigDecimal getVlOperAquis() {
        return this.vlOperAquis;
    }

    public void setVlOperAquis(BigDecimal vlOperAquis) {
        this.vlOperAquis = vlOperAquis;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "PARC_OPER_NAO_BC_CRED", precision = 15, scale = 6)
    private BigDecimal parcOperNaoBcCred;

    public BigDecimal getParcOperNaoBcCred() {
        return this.parcOperNaoBcCred;
    }

    public void setParcOperNaoBcCred(BigDecimal parcOperNaoBcCred) {
        this.parcOperNaoBcCred = parcOperNaoBcCred;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_BC_CRED", precision = 15, scale = 6)
    private BigDecimal vlBcCred;

    public BigDecimal getVlBcCred() {
        return this.vlBcCred;
    }

    public void setVlBcCred(BigDecimal vlBcCred) {
        this.vlBcCred = vlBcCred;
    }
    @Campos(posicao = 10, tipo = 'I')
    @Column(name = "IND_NR_PARC")
    private int indNrParc;

    public int getIndNrParc() {
        return this.indNrParc;
    }

    public void setIndNrParc(int indNrParc) {
        this.indNrParc = indNrParc;
    }
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 15, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 19, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 20, tipo = 'C')
    @Column(name = "COD_CCUS")
    private String codCcus;

    public String getCodCcus() {
        return this.codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    @Campos(posicao = 21, tipo = 'C')
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
        final RegF130 other = (RegF130) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF130{" + "id=" + id + '}';
    }
}
