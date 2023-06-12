package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1011")

@Registros(nivel = 3)
public class Reg1011 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1010 idPai;

    @Override
    public Reg1010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg1010) idPai;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @PrePersist
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "REG_REF")
    private String regRef;

    public String getRegRef() {
        return this.regRef;
    }

    public void setRegRef(String regRef) {
        this.regRef = regRef;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CHAVE_DOC")
    private String chaveDoc;

    public String getChaveDoc() {
        return this.chaveDoc;
    }

    public void setChaveDoc(String chaveDoc) {
        this.chaveDoc = chaveDoc;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;

    public String getCodPart() {
        return this.codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;

    public String getCodItem() {
        return this.codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    @Campos(posicao = 6, tipo = 'D')
    @Column(name = "DT_OPER")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtOper;

    public Date getDtOper() {
        return this.dtOper;
    }

    public void setDtOper(Date dtOper) {
        this.dtOper = dtOper;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_OPER", precision = 15, scale = 6)
    private BigDecimal vlOper;

    public BigDecimal getVlOper() {
        return this.vlOper;
    }

    public void setVlOper(BigDecimal vlOper) {
        this.vlOper = vlOper;
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
    @Column(name = "CST_PIS_SUSP")
    private String cstPisSusp;

    public String getCstPisSusp() {
        return this.cstPisSusp;
    }

    public void setCstPisSusp(String cstPisSusp) {
        this.cstPisSusp = cstPisSusp;
    }

    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_BC_PIS_SUSP", precision = 15, scale = 6)
    private BigDecimal vlBcPisSusp;

    public BigDecimal getVlBcPisSusp() {
        return this.vlBcPisSusp;
    }

    public void setVlBcPisSusp(BigDecimal vlBcPisSusp) {
        this.vlBcPisSusp = vlBcPisSusp;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "ALIQ_PIS_SUSP", precision = 15, scale = 6)
    private BigDecimal aliqPisSusp;

    public BigDecimal getAliqPisSusp() {
        return this.aliqPisSusp;
    }

    public void setAliqPisSusp(BigDecimal aliqPisSusp) {
        this.aliqPisSusp = aliqPisSusp;
    }
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_PIS_SUSP", precision = 15, scale = 6)
    private BigDecimal vlPisSusp;

    public BigDecimal getVlPisSusp() {
        return this.vlPisSusp;
    }

    public void setVlPisSusp(BigDecimal vlPisSusp) {
        this.vlPisSusp = vlPisSusp;
    }
    @Campos(posicao = 20, tipo = 'C')
    @Column(name = "CST_COFINS_SUSP")
    private String cstCofinsSusp;

    public String getCstCofinsSusp() {
        return this.cstCofinsSusp;
    }

    public void setCstCofinsSusp(String cstCofinsSusp) {
        this.cstCofinsSusp = cstCofinsSusp;
    }

    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_BC_COFINS_SUSP", precision = 15, scale = 6)
    private BigDecimal vlBcCofinsSusp;

    public BigDecimal getVlBcCofinsSusp() {
        return this.vlBcCofinsSusp;
    }

    public void setVlBcCofinsSusp(BigDecimal vlBcCofinsSusp) {
        this.vlBcCofinsSusp = vlBcCofinsSusp;
    }
    @Campos(posicao = 22, tipo = 'R')
    @Column(name = "ALIQ_COFINS_SUSP", precision = 15, scale = 6)
    private BigDecimal aliqCofinsSusp;

    public BigDecimal getAliqCofinsSusp() {
        return this.aliqCofinsSusp;
    }

    public void setAliqCofinsSusp(BigDecimal aliqCofinsSusp) {
        this.aliqCofinsSusp = aliqCofinsSusp;
    }
    @Campos(posicao = 23, tipo = 'R')
    @Column(name = "VL_COFINS_SUSP", precision = 15, scale = 6)
    private BigDecimal vlCofinsSusp;

    public BigDecimal getVlCofinsSusp() {
        return this.vlCofinsSusp;
    }

    public void setVlCofinsSusp(BigDecimal vlCofinsSusp) {
        this.vlCofinsSusp = vlCofinsSusp;
    }
    @Campos(posicao = 24, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 25, tipo = 'C')
    @Column(name = "COD_CCUS")
    private String codCcus;

    public String getCodCcus() {
        return this.codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    @Campos(posicao = 26, tipo = 'C')
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
        final Reg1011 other = (Reg1011) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1011{" + "id=" + id + '}';
    }
}
