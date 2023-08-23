package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
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
@Table(name = "reg_c170")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC170.findAll", query = "SELECT r FROM RegC170 r"),
    @NamedQuery(name = "RegC170.findById", query = "SELECT r FROM RegC170 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC170.findByIdPai", query = "SELECT r FROM RegC170 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC170.findByLinha", query = "SELECT r FROM RegC170 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC170.findByHashfile", query = "SELECT r FROM RegC170 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC170.findByReg", query = "SELECT r FROM RegC170 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC170.findByNumItem", query = "SELECT r FROM RegC170 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegC170.findByCodItem", query = "SELECT r FROM RegC170 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC170.findByDescrCompl", query = "SELECT r FROM RegC170 r WHERE r.descrCompl = :descrCompl"),
    @NamedQuery(name = "RegC170.findByQtd", query = "SELECT r FROM RegC170 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC170.findByUnid", query = "SELECT r FROM RegC170 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC170.findByVlItem", query = "SELECT r FROM RegC170 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC170.findByVlDesc", query = "SELECT r FROM RegC170 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC170.findByIndMov", query = "SELECT r FROM RegC170 r WHERE r.indMov = :indMov"),
    @NamedQuery(name = "RegC170.findByCstIcms", query = "SELECT r FROM RegC170 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC170.findByCfop", query = "SELECT r FROM RegC170 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC170.findByCodNat", query = "SELECT r FROM RegC170 r WHERE r.codNat = :codNat"),
    @NamedQuery(name = "RegC170.findByVlBcIcms", query = "SELECT r FROM RegC170 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC170.findByAliqIcms", query = "SELECT r FROM RegC170 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC170.findByVlIcms", query = "SELECT r FROM RegC170 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC170.findByVlBcIcmsSt", query = "SELECT r FROM RegC170 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC170.findByAliqSt", query = "SELECT r FROM RegC170 r WHERE r.aliqSt = :aliqSt"),
    @NamedQuery(name = "RegC170.findByVlIcmsSt", query = "SELECT r FROM RegC170 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC170.findByIndApur", query = "SELECT r FROM RegC170 r WHERE r.indApur = :indApur"),
    @NamedQuery(name = "RegC170.findByCstIpi", query = "SELECT r FROM RegC170 r WHERE r.cstIpi = :cstIpi"),
    @NamedQuery(name = "RegC170.findByCodEnq", query = "SELECT r FROM RegC170 r WHERE r.codEnq = :codEnq"),
    @NamedQuery(name = "RegC170.findByVlBcIpi", query = "SELECT r FROM RegC170 r WHERE r.vlBcIpi = :vlBcIpi"),
    @NamedQuery(name = "RegC170.findByAliqIpi", query = "SELECT r FROM RegC170 r WHERE r.aliqIpi = :aliqIpi"),
    @NamedQuery(name = "RegC170.findByVlIpi", query = "SELECT r FROM RegC170 r WHERE r.vlIpi = :vlIpi"),
    @NamedQuery(name = "RegC170.findByCstPis", query = "SELECT r FROM RegC170 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegC170.findByVlBcPis", query = "SELECT r FROM RegC170 r WHERE r.vlBcPis = :vlBcPis"),
    @NamedQuery(name = "RegC170.findByAliqPis", query = "SELECT r FROM RegC170 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegC170.findByQuantBcPis", query = "SELECT r FROM RegC170 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegC170.findByAliqPisQuant", query = "SELECT r FROM RegC170 r WHERE r.aliqPisQuant = :aliqPisQuant"),
    @NamedQuery(name = "RegC170.findByVlPis", query = "SELECT r FROM RegC170 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC170.findByCstCofins", query = "SELECT r FROM RegC170 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegC170.findByVlBcCofins", query = "SELECT r FROM RegC170 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegC170.findByAliqCofins", query = "SELECT r FROM RegC170 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegC170.findByQuantBcCofins", query = "SELECT r FROM RegC170 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegC170.findByAliqCofinsQuant", query = "SELECT r FROM RegC170 r WHERE r.aliqCofinsQuant = :aliqCofinsQuant"),
    @NamedQuery(name = "RegC170.findByVlCofins", query = "SELECT r FROM RegC170 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC170.findByCodCta", query = "SELECT r FROM RegC170 r WHERE r.codCta = :codCta")})
@Registros(nivel = 4)
public class RegC170 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    @Override
    public RegC100 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC100) idPai;
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
    @Column(name = "QTD", precision = 15, scale = 6)
    private BigDecimal qtd;

    public BigDecimal getQtd() {
        return this.qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "UNID")
    private String unid;

    public String getUnid() {
        return this.unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;

    public BigDecimal getVlItem() {
        return this.vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;

    public BigDecimal getVlDesc() {
        return this.vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "IND_MOV")
    private String indMov;

    public String getIndMov() {
        return this.indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;

    public String getCstIcms() {
        return this.cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    @Campos(posicao = 11, tipo = 'I')
    @Column(name = "CFOP")
    private int cfop;

    public int getCfop() {
        return this.cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "COD_NAT")
    private String codNat;

    public String getCodNat() {
        return this.codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;

    public BigDecimal getVlBcIcms() {
        return this.vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;

    public BigDecimal getAliqIcms() {
        return this.aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;

    public BigDecimal getVlIcms() {
        return this.vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;

    public BigDecimal getVlBcIcmsSt() {
        return this.vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "ALIQ_ST", precision = 15, scale = 6)
    private BigDecimal aliqSt;

    public BigDecimal getAliqSt() {
        return this.aliqSt;
    }

    public void setAliqSt(BigDecimal aliqSt) {
        this.aliqSt = aliqSt;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;

    public BigDecimal getVlIcmsSt() {
        return this.vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    @Campos(posicao = 19, tipo = 'C')
    @Column(name = "IND_APUR")
    private String indApur;

    public String getIndApur() {
        return this.indApur;
    }

    public void setIndApur(String indApur) {
        this.indApur = indApur;
    }
    @Campos(posicao = 20, tipo = 'C')
    @Column(name = "CST_IPI")
    private String cstIpi;

    public String getCstIpi() {
        return this.cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }
    @Campos(posicao = 21, tipo = 'C')
    @Column(name = "COD_ENQ")
    private String codEnq;

    public String getCodEnq() {
        return this.codEnq;
    }

    public void setCodEnq(String codEnq) {
        this.codEnq = codEnq;
    }
    @Campos(posicao = 22, tipo = 'R')
    @Column(name = "VL_BC_IPI", precision = 15, scale = 6)
    private BigDecimal vlBcIpi;

    public BigDecimal getVlBcIpi() {
        return this.vlBcIpi;
    }

    public void setVlBcIpi(BigDecimal vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }
    @Campos(posicao = 23, tipo = 'R')
    @Column(name = "ALIQ_IPI", precision = 15, scale = 6)
    private BigDecimal aliqIpi;

    public BigDecimal getAliqIpi() {
        return this.aliqIpi;
    }

    public void setAliqIpi(BigDecimal aliqIpi) {
        this.aliqIpi = aliqIpi;
    }
    @Campos(posicao = 24, tipo = 'R')
    @Column(name = "VL_IPI", precision = 15, scale = 6)
    private BigDecimal vlIpi;

    public BigDecimal getVlIpi() {
        return this.vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }
    @Campos(posicao = 25, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    @Campos(posicao = 26, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 27, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 28, tipo = 'R')
    @Column(name = "QUANT_BC_PIS", precision = 15, scale = 6)
    private BigDecimal quantBcPis;

    public BigDecimal getQuantBcPis() {
        return this.quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    @Campos(posicao = 29, tipo = 'R')
    @Column(name = "ALIQ_PIS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqPisQuant;

    public BigDecimal getAliqPisQuant() {
        return this.aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }
    @Campos(posicao = 30, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 31, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    @Campos(posicao = 32, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 33, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 34, tipo = 'R')
    @Column(name = "QUANT_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal quantBcCofins;

    public BigDecimal getQuantBcCofins() {
        return this.quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    @Campos(posicao = 35, tipo = 'R')
    @Column(name = "ALIQ_COFINS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqCofinsQuant;

    public BigDecimal getAliqCofinsQuant() {
        return this.aliqCofinsQuant;
    }

    public void setAliqCofinsQuant(BigDecimal aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
    }
    @Campos(posicao = 36, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;

    public BigDecimal getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }
    @Campos(posicao = 37, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
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
        final RegC170 other = (RegC170) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC170{" + "id=" + id + '}';
    }
}
