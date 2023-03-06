package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
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
    @NamedQuery(name = "RegC170.findByAliqPisPerc", query = "SELECT r FROM RegC170 r WHERE r.aliqPisPerc = :aliqPisPerc"),
    @NamedQuery(name = "RegC170.findByQuantBcPis", query = "SELECT r FROM RegC170 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegC170.findByAliqPisReais", query = "SELECT r FROM RegC170 r WHERE r.aliqPisReais = :aliqPisReais"),
    @NamedQuery(name = "RegC170.findByVlPis", query = "SELECT r FROM RegC170 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC170.findByCstCofins", query = "SELECT r FROM RegC170 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegC170.findByVlBcCofins", query = "SELECT r FROM RegC170 r WHERE r.vlBcCofins = :vlBcCofins"),
    @NamedQuery(name = "RegC170.findByAliqCofinsPerc", query = "SELECT r FROM RegC170 r WHERE r.aliqCofinsPerc = :aliqCofinsPerc"),
    @NamedQuery(name = "RegC170.findByQuantBcCofins", query = "SELECT r FROM RegC170 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegC170.findByAliqCofinsReais", query = "SELECT r FROM RegC170 r WHERE r.aliqCofinsReais = :aliqCofinsReais"),
    @NamedQuery(name = "RegC170.findByVlCofins", query = "SELECT r FROM RegC170 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC170.findByCodCta", query = "SELECT r FROM RegC170 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegC170.findByVlAbatNt", query = "SELECT r FROM RegC170 r WHERE r.vlAbatNt = :vlAbatNt")})
@Registros(nivel = 3)
public class RegC170 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC100) idPai;
    }

    public RegC170() {
    }

    public RegC170(String id) {
        this.id = id;
    }

    public RegC170(String id, RegC100 idPai, long linha, String hashfile) {
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
    private List<RegC171> regC171;

    public List<RegC171> getRegC171() {
        return regC171;
    }

    public void setRegC171(List<RegC171> regC171) {
        this.regC171 = regC171;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC172 regC172;

    public RegC172 getRegC172() {
        return regC172;
    }

    public void setRegC172(RegC172 regC172) {
        this.regC172 = regC172;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC173> regC173;

    public List<RegC173> getRegC173() {
        return regC173;
    }

    public void setRegC173(List<RegC173> regC173) {
        this.regC173 = regC173;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC174> regC174;

    public List<RegC174> getRegC174() {
        return regC174;
    }

    public void setRegC174(List<RegC174> regC174) {
        this.regC174 = regC174;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC175> regC175;

    public List<RegC175> getRegC175() {
        return regC175;
    }

    public void setRegC175(List<RegC175> regC175) {
        this.regC175 = regC175;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC176> regC176;

    public List<RegC176> getRegC176() {
        return regC176;
    }

    public void setRegC176(List<RegC176> regC176) {
        this.regC176 = regC176;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC177 regC177;

    public RegC177 getRegC177() {
        return regC177;
    }

    public void setRegC177(RegC177 regC177) {
        this.regC177 = regC177;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC178 regC178;

    public RegC178 getRegC178() {
        return regC178;
    }

    public void setRegC178(RegC178 regC178) {
        this.regC178 = regC178;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC179 regC179;

    public RegC179 getRegC179() {
        return regC179;
    }

    public void setRegC179(RegC179 regC179) {
        this.regC179 = regC179;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC180 regC180;

    public RegC180 getRegC180() {
        return regC180;
    }

    public void setRegC180(RegC180 regC180) {
        this.regC180 = regC180;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC181> regC181;

    public List<RegC181> getRegC181() {
        return regC181;
    }

    public void setRegC181(List<RegC181> regC181) {
        this.regC181 = regC181;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "NUM_ITEM")
    private int numItem;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "DESCR_COMPL")
    private String descrCompl;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "QTD", precision = 15, scale = 6)
    private BigDecimal qtd;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "UNID")
    private String unid;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_ITEM", precision = 15, scale = 6)
    private BigDecimal vlItem;
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_DESC", precision = 15, scale = 6)
    private BigDecimal vlDesc;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "IND_MOV")
    private String indMov;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "COD_NAT")
    private String codNat;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "ALIQ_ST", precision = 15, scale = 6)
    private BigDecimal aliqSt;
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;
    @Campos(posicao = 19, tipo = 'C')
    @Column(name = "IND_APUR")
    private String indApur;
    @Campos(posicao = 20, tipo = 'C')
    @Column(name = "CST_IPI")
    private String cstIpi;
    @Campos(posicao = 21, tipo = 'C')
    @Column(name = "COD_ENQ")
    private String codEnq;
    @Campos(posicao = 22, tipo = 'R')
    @Column(name = "VL_BC_IPI", precision = 15, scale = 6)
    private BigDecimal vlBcIpi;
    @Campos(posicao = 23, tipo = 'R')
    @Column(name = "ALIQ_IPI", precision = 15, scale = 6)
    private BigDecimal aliqIpi;
    @Campos(posicao = 24, tipo = 'R')
    @Column(name = "VL_IPI", precision = 15, scale = 6)
    private BigDecimal vlIpi;
    @Campos(posicao = 25, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;
    @Campos(posicao = 26, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;
    @Campos(posicao = 27, tipo = 'R')
    @Column(name = "ALIQ_PIS_PERC", precision = 15, scale = 6)
    private BigDecimal aliqPisPerc;
    @Campos(posicao = 28, tipo = 'R')
    @Column(name = "QUANT_BC_PIS", precision = 15, scale = 6)
    private BigDecimal quantBcPis;
    @Campos(posicao = 29, tipo = 'R')
    @Column(name = "ALIQ_PIS_REAIS", precision = 15, scale = 6)
    private BigDecimal aliqPisReais;
    @Campos(posicao = 30, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 31, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;
    @Campos(posicao = 32, tipo = 'R')
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;
    @Campos(posicao = 33, tipo = 'R')
    @Column(name = "ALIQ_COFINS_PERC", precision = 15, scale = 6)
    private BigDecimal aliqCofinsPerc;
    @Campos(posicao = 34, tipo = 'R')
    @Column(name = "QUANT_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal quantBcCofins;
    @Campos(posicao = 35, tipo = 'R')
    @Column(name = "ALIQ_COFINS_REAIS", precision = 15, scale = 6)
    private BigDecimal aliqCofinsReais;
    @Campos(posicao = 36, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 37, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;
    @Campos(posicao = 38, tipo = 'R')
    @Column(name = "VL_ABAT_NT", precision = 15, scale = 6)
    private BigDecimal vlAbatNt;

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

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getAliqSt() {
        return aliqSt;
    }

    public void setAliqSt(BigDecimal aliqSt) {
        this.aliqSt = aliqSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public String getIndApur() {
        return indApur;
    }

    public void setIndApur(String indApur) {
        this.indApur = indApur;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }

    public String getCodEnq() {
        return codEnq;
    }

    public void setCodEnq(String codEnq) {
        this.codEnq = codEnq;
    }

    public BigDecimal getVlBcIpi() {
        return vlBcIpi;
    }

    public void setVlBcIpi(BigDecimal vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }

    public BigDecimal getAliqIpi() {
        return aliqIpi;
    }

    public void setAliqIpi(BigDecimal aliqIpi) {
        this.aliqIpi = aliqIpi;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }

    public String getCstPis() {
        return cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getAliqPisPerc() {
        return aliqPisPerc;
    }

    public void setAliqPisPerc(BigDecimal aliqPisPerc) {
        this.aliqPisPerc = aliqPisPerc;
    }

    public BigDecimal getQuantBcPis() {
        return quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }

    public BigDecimal getAliqPisReais() {
        return aliqPisReais;
    }

    public void setAliqPisReais(BigDecimal aliqPisReais) {
        this.aliqPisReais = aliqPisReais;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public String getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getAliqCofinsPerc() {
        return aliqCofinsPerc;
    }

    public void setAliqCofinsPerc(BigDecimal aliqCofinsPerc) {
        this.aliqCofinsPerc = aliqCofinsPerc;
    }

    public BigDecimal getQuantBcCofins() {
        return quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }

    public BigDecimal getAliqCofinsReais() {
        return aliqCofinsReais;
    }

    public void setAliqCofinsReais(BigDecimal aliqCofinsReais) {
        this.aliqCofinsReais = aliqCofinsReais;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }

    @Override
    public int hashCode() {
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegC170)) {
            return false;
        }
        RegC170 other = (RegC170) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC170[ id=" + id + " ]";
    }

}
