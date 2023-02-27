package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
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
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d700")
@XmlRootElement
@Registros(nivel = 2)
public class RegD700 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD001 idPai;

    public RegD001 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD001) idPai;
    }

    public RegD700() {
    }

    public RegD700(String id) {
        this.id = id;
    }

    public RegD700(String id, RegD001 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD730> regD730;

    public List<RegD730> getRegD730() {
        return regD730;
    }

    public void setRegD730(List<RegD730> regD730) {
        this.regD730 = regD730;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegD735> regD735;

    public List<RegD735> getRegD735() {
        return regD735;
    }

    public void setRegD735(List<RegD735> regD735) {
        this.regD735 = regD735;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_OPER")
    private String indOper;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_SIT")
    private String codSit;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "SER ")
    private String ser;
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 9, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 10, tipo = 'D')
    @Column(name = "DT_E_S")
    @Temporal(TemporalType.DATE)
    private Date dtES;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_DOC", precision = 15, scale = 6)
    private BigDecimal vlDoc;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_SERV", precision = 15, scale = 6)
    private BigDecimal vlServ;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_SERV_NT", precision = 15, scale = 6)
    private BigDecimal vlServNt;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_TERC", precision = 15, scale = 6)
    private BigDecimal vlTerc;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_DA", precision = 15, scale = 6)
    private BigDecimal vlDa;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 19, tipo = 'C')
    @Column(name = "COD_INF")
    private String codInf;
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 21, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 22, tipo = 'C')
    @Column(name = "CHV_DOCe")
    private String chvDoce;
    @Campos(posicao = 23, tipo = 'C')
    @Column(name = "FIN_DOCe")
    private String finDoce;
    @Campos(posicao = 24, tipo = 'C')
    @Column(name = "TIP_FAT")
    private String tipFat;
    @Campos(posicao = 25, tipo = 'C')
    @Column(name = "COD_MOD_DOC_REF")
    private String codModDocRef;
    @Campos(posicao = 26, tipo = 'C')
    @Column(name = "CHV_DOCe_REF")
    private String chvDoceRef;
    @Campos(posicao = 27, tipo = 'C')
    @Column(name = "HASHFILE_DOC_REF")
    private String hashfileDocRef;
    @Campos(posicao = 28, tipo = 'C')
    @Column(name = "SER_DOC_REF")
    private String serDocRef;
    @Campos(posicao = 29, tipo = 'C')
    @Column(name = "NUM_DOC_REF")
    private String numDocRef;
    @Campos(posicao = 30, tipo = 'C')
    @Column(name = "MES_DOC_REF")
    private String mesDocRef;
    @Campos(posicao = 31, tipo = 'C')
    @Column(name = "COD_MUN_DEST")
    private String codMunDest;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHashfile() {
        return hashfile;
    }

    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Date getDtES() {
        return dtES;
    }

    public void setDtES(Date dtES) {
        this.dtES = dtES;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlTerc() {
        return vlTerc;
    }

    public void setVlTerc(BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
    }

    public String getFinDoce() {
        return finDoce;
    }

    public void setFinDoce(String finDoce) {
        this.finDoce = finDoce;
    }

    public String getTipFat() {
        return tipFat;
    }

    public void setTipFat(String tipFat) {
        this.tipFat = tipFat;
    }

    public String getCodModDocRef() {
        return codModDocRef;
    }

    public void setCodModDocRef(String codModDocRef) {
        this.codModDocRef = codModDocRef;
    }

    public String getChvDoceRef() {
        return chvDoceRef;
    }

    public void setChvDoceRef(String chvDoceRef) {
        this.chvDoceRef = chvDoceRef;
    }

    public String getHashDocRef() {
        return hashfileDocRef;
    }

    public void setHashDocRef(String hashfileDocRef) {
        this.hashfileDocRef = hashfileDocRef;
    }

    public String getSerDocRef() {
        return serDocRef;
    }

    public void setSerDocRef(String serDocRef) {
        this.serDocRef = serDocRef;
    }

    public String getNumDocRef() {
        return numDocRef;
    }

    public void setNumDocRef(String numDocRef) {
        this.numDocRef = numDocRef;
    }

    public String getMesDocRef() {
        return mesDocRef;
    }

    public void setMesDocRef(String mesDocRef) {
        this.mesDocRef = mesDocRef;
    }

    public String getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }

    @Override
    public int hashCode() {
        int hashfile = 7;
        hashfile = 67 * hashfile + Objects.hashCode(this.hashfile);
        return hashfile;
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
        final RegD700 other = (RegD700) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegD700{" + "id=" + id + '}';
    }

}
