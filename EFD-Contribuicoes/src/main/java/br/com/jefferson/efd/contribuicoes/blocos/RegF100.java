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
@Table(name = "reg_f100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF100.findAll", query = "SELECT r FROM RegF100 r"),
    @NamedQuery(name = "RegF100.findById", query = "SELECT r FROM RegF100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF100.findByIdPai", query = "SELECT r FROM RegF100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF100.findByLinha", query = "SELECT r FROM RegF100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF100.findByHashfile", query = "SELECT r FROM RegF100 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF100.findByReg", query = "SELECT r FROM RegF100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF100.findByIndOper", query = "SELECT r FROM RegF100 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegF100.findByCodPart", query = "SELECT r FROM RegF100 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegF100.findByCodItem", query = "SELECT r FROM RegF100 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegF100.findByDtOper", query = "SELECT r FROM RegF100 r WHERE r.dtOper = :dtOper"),
    @NamedQuery(name = "RegF100.findByVlOper", query = "SELECT r FROM RegF100 r WHERE r.vlOper = :vlOper"),
    @NamedQuery(name = "RegF100.findByCstPis", query = "SELECT r FROM RegF100 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF100.findByVlBcPis", query = "SELECT r FROM RegF100 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegF100.findByAliqPis", query = "SELECT r FROM RegF100 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegF100.findByVlPis", query = "SELECT r FROM RegF100 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegF100.findByCstCofins", query = "SELECT r FROM RegF100 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF100.findByVlBcCofins", query = "SELECT r FROM RegF100 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegF100.findByAliqCofins", query = "SELECT r FROM RegF100 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegF100.findByVlCofins", query = "SELECT r FROM RegF100 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegF100.findByNatBcCred", query = "SELECT r FROM RegF100 r WHERE r.natBcCred = :natBcCred"),
    @NamedQuery(name = "RegF100.findByIndOrigCred", query = "SELECT r FROM RegF100 r WHERE r.indOrigCred = :indOrigCred"),
    @NamedQuery(name = "RegF100.findByCodCta", query = "SELECT r FROM RegF100 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegF100.findByCodCcus", query = "SELECT r FROM RegF100 r WHERE r.codCcus = :codCcus"),
    @NamedQuery(name = "RegF100.findByDescDocOper", query = "SELECT r FROM RegF100 r WHERE r.descDocOper = :descDocOper")})
@Registros(nivel = 3)
public class RegF100 implements Serializable, BlocoSped {

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
    private List<RegF111> regF111;

    public List<RegF111> getRegF111() {
        return regF111;
    }

    public void setRegF111(List<RegF111> regF111) {
        this.regF111 = regF111;
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
    @Column(name = "COD_PART")
    private String codPart;

    public String getCodPart() {
        return this.codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;

    public String getCodItem() {
        return this.codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_OPER")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtOper;

    public Date getDtOper() {
        return this.dtOper;
    }

    public void setDtOper(Date dtOper) {
        this.dtOper = dtOper;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_OPER", precision = 15, scale = 6)
    private BigDecimal vlOper;

    public BigDecimal getVlOper() {
        return this.vlOper;
    }

    public void setVlOper(BigDecimal vlOper) {
        this.vlOper = vlOper;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
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
    @Column(name = "NAT_BC_CRED")
    private String natBcCred;

    public String getNatBcCred() {
        return this.natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    @Campos(posicao = 16, tipo = 'C')
    @Column(name = "IND_ORIG_CRED")
    private String indOrigCred;

    public String getIndOrigCred() {
        return this.indOrigCred;
    }

    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
    }
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 18, tipo = 'C')
    @Column(name = "COD_CCUS")
    private String codCcus;

    public String getCodCcus() {
        return this.codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    @Campos(posicao = 19, tipo = 'C')
    @Column(name = "DESC_DOC_OPER")
    private String descDocOper;

    public String getDescDocOper() {
        return this.descDocOper;
    }

    public void setDescDocOper(String descDocOper) {
        this.descDocOper = descDocOper;
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
        final RegF100 other = (RegF100) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF100{" + "id=" + id + '}';
    }
}
