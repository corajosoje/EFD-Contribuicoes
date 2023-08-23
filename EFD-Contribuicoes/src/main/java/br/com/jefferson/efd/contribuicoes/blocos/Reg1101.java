package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1101")
@Registros(nivel = 3)
public class Reg1101 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1100 idPai;

    @Override
    public Reg1100 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg1100) idPai;
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1102 reg1102;

    public Reg1102 getReg1102() {
        return reg1102;
    }

    public void setReg1102(Reg1102 reg1102) {
        this.reg1102 = reg1102;
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
    @Column(name = "COD_ITEM")
    private String codItem;

    public String getCodItem() {
        return this.codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
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
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "SUB_SER")
    private String subSer;

    public String getSubSer() {
        return this.subSer;
    }

    public void setSubSer(String subSer) {
        this.subSer = subSer;
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
    @Column(name = "DT_OPER")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtOper;

    public Date getDtOper() {
        return this.dtOper;
    }

    public void setDtOper(Date dtOper) {
        this.dtOper = dtOper;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CHV_NFE")
    private String chvNfe;

    public String getChvNfe() {
        return this.chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_OPER", precision = 15, scale = 6)
    private BigDecimal vlOper;

    public BigDecimal getVlOper() {
        return this.vlOper;
    }

    public void setVlOper(BigDecimal vlOper) {
        this.vlOper = vlOper;
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
    @Column(name = "NAT_BC_CRED")
    private String natBcCred;

    public String getNatBcCred() {
        return this.natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "IND_ORIG_CRED")
    private String indOrigCred;

    public String getIndOrigCred() {
        return this.indOrigCred;
    }

    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
    }
    @Campos(posicao = 14, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;

    public BigDecimal getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }
    @Campos(posicao = 18, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 19, tipo = 'C')
    @Column(name = "COD_CCUS")
    private String codCcus;

    public String getCodCcus() {
        return this.codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    @Campos(posicao = 20, tipo = 'C')
    @Column(name = "DESC_COMPL")
    private String descCompl;

    public String getDescCompl() {
        return this.descCompl;
    }

    public void setDescCompl(String descCompl) {
        this.descCompl = descCompl;
    }
    @Campos(posicao = 21, tipo = 'I')
    @Column(name = "PER_ESCRIT")
    private int perEscrit;

    public int getPerEscrit() {
        return this.perEscrit;
    }

    public void setPerEscrit(int perEscrit) {
        this.perEscrit = perEscrit;
    }
    @Campos(posicao = 22, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        final Reg1101 other = (Reg1101) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1101{" + "id=" + id + '}';
    }
}
