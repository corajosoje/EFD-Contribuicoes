package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_a170")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegA170.findAll", query = "SELECT r FROM RegA170 r"),
    @NamedQuery(name = "RegA170.findById", query = "SELECT r FROM RegA170 r WHERE r.id = :id"),
    @NamedQuery(name = "RegA170.findByIdPai", query = "SELECT r FROM RegA170 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegA170.findByLinha", query = "SELECT r FROM RegA170 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegA170.findByHashfile", query = "SELECT r FROM RegA170 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegA170.findByReg", query = "SELECT r FROM RegA170 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegA170.findByNumItem", query = "SELECT r FROM RegA170 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegA170.findByCodItem", query = "SELECT r FROM RegA170 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegA170.findByDescrCompl", query = "SELECT r FROM RegA170 r WHERE r.descrCompl = :descrCompl"),
    @NamedQuery(name = "RegA170.findByVlItem", query = "SELECT r FROM RegA170 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegA170.findByVlDesc", query = "SELECT r FROM RegA170 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegA170.findByNatBcCred", query = "SELECT r FROM RegA170 r WHERE r.natBcCred = :natBcCred"),
    @NamedQuery(name = "RegA170.findByIndOrigCred", query = "SELECT r FROM RegA170 r WHERE r.indOrigCred = :indOrigCred"),
    @NamedQuery(name = "RegA170.findByCstPis", query = "SELECT r FROM RegA170 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegA170.findByVlBcPis", query = "SELECT r FROM RegA170 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegA170.findByAliqPis", query = "SELECT r FROM RegA170 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegA170.findByVlPis", query = "SELECT r FROM RegA170 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegA170.findByCstCofins", query = "SELECT r FROM RegA170 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegA170.findByVlBcCofins", query = "SELECT r FROM RegA170 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegA170.findByAliqCofins", query = "SELECT r FROM RegA170 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegA170.findByVlCofins", query = "SELECT r FROM RegA170 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegA170.findByCodCta", query = "SELECT r FROM RegA170 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegA170.findByCodCcus", query = "SELECT r FROM RegA170 r WHERE r.codCcus = :codCcus")})
@Registros(nivel = 4)
public class RegA170 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegA100 idPai;

    @Override
    public RegA100 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegA100) idPai;
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "NUM_ITEM")
    private int numItem;

    public int getNumItem() {
        return this.numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;

    public String getCodItem() {
        return this.codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "DESCR_COMPL")
    private String descrCompl;

    public String getDescrCompl() {
        return this.descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;

    public BigDecimal getVlItem() {
        return this.vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "NAT_BC_CRED")
    private String natBcCred;

    public String getNatBcCred() {
        return this.natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "IND_ORIG_CRED")
    private String indOrigCred;

    public String getIndOrigCred() {
        return this.indOrigCred;
    }

    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
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
        final RegA170 other = (RegA170) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegA170{" + "id=" + id + '}';
    }
}
