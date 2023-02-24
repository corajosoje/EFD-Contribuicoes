package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c510")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC510.findAll", query = "SELECT r FROM RegC510 r"),
    @NamedQuery(name = "RegC510.findById", query = "SELECT r FROM RegC510 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC510.findByIdPai", query = "SELECT r FROM RegC510 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC510.findByLinha", query = "SELECT r FROM RegC510 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC510.findByHashfile", query = "SELECT r FROM RegC510 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC510.findByReg", query = "SELECT r FROM RegC510 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC510.findByNumItem", query = "SELECT r FROM RegC510 r WHERE r.numItem = :numItem"),
    @NamedQuery(name = "RegC510.findByCodItem", query = "SELECT r FROM RegC510 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC510.findByCodClass", query = "SELECT r FROM RegC510 r WHERE r.codClass = :codClass"),
    @NamedQuery(name = "RegC510.findByQtd", query = "SELECT r FROM RegC510 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "RegC510.findByUnid", query = "SELECT r FROM RegC510 r WHERE r.unid = :unid"),
    @NamedQuery(name = "RegC510.findByVlItem", query = "SELECT r FROM RegC510 r WHERE r.vlItem = :vlItem"),
    @NamedQuery(name = "RegC510.findByVlDesc", query = "SELECT r FROM RegC510 r WHERE r.vlDesc = :vlDesc"),
    @NamedQuery(name = "RegC510.findByCstIcms", query = "SELECT r FROM RegC510 r WHERE r.cstIcms = :cstIcms"),
    @NamedQuery(name = "RegC510.findByCfop", query = "SELECT r FROM RegC510 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "RegC510.findByVlBcIcms", query = "SELECT r FROM RegC510 r WHERE r.vlBcIcms = :vlBcIcms"),
    @NamedQuery(name = "RegC510.findByAliqIcms", query = "SELECT r FROM RegC510 r WHERE r.aliqIcms = :aliqIcms"),
    @NamedQuery(name = "RegC510.findByVlIcms", query = "SELECT r FROM RegC510 r WHERE r.vlIcms = :vlIcms"),
    @NamedQuery(name = "RegC510.findByVlBcIcmsSt", query = "SELECT r FROM RegC510 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC510.findByAliqSt", query = "SELECT r FROM RegC510 r WHERE r.aliqSt = :aliqSt"),
    @NamedQuery(name = "RegC510.findByVlIcmsSt", query = "SELECT r FROM RegC510 r WHERE r.vlIcmsSt = :vlIcmsSt"),
    @NamedQuery(name = "RegC510.findByIndRec", query = "SELECT r FROM RegC510 r WHERE r.indRec = :indRec"),
    @NamedQuery(name = "RegC510.findByCodPart", query = "SELECT r FROM RegC510 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC510.findByVlPis", query = "SELECT r FROM RegC510 r WHERE r.vlPis = :vlPis"),
    @NamedQuery(name = "RegC510.findByVlCofins", query = "SELECT r FROM RegC510 r WHERE r.vlCofins = :vlCofins"),
    @NamedQuery(name = "RegC510.findByCodCta", query = "SELECT r FROM RegC510 r WHERE r.codCta = :codCta")})
@Registros(nivel = 3)
public class RegC510 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC500 idPai;

    public RegC500 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC500) idPai;
    }

    public RegC510() {
    }

    public RegC510(Long id) {
        this.id = id;
    }

    public RegC510(Long id, RegC500 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
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
    @Column(name = "COD_CLASS")
    private String codClass;
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
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CFOP")
    private String cfop;
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_BC_ICMS", precision = 15, scale = 6)
    private BigDecimal vlBcIcms;
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "ALIQ_ICMS", precision = 15, scale = 6)
    private BigDecimal aliqIcms;
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_ICMS", precision = 15, scale = 6)
    private BigDecimal vlIcms;
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlBcIcmsSt;
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "ALIQ_ST", precision = 15, scale = 6)
    private BigDecimal aliqSt;
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_ICMS_ST", precision = 15, scale = 6)
    private BigDecimal vlIcmsSt;
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "IND_REC")
    private String indRec;
    @Campos(posicao = 18, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 19, tipo = 'R')
    @Column(name = "VL_PIS", precision = 15, scale = 6)
    private BigDecimal vlPis;
    @Campos(posicao = 20, tipo = 'R')
    @Column(name = "VL_COFINS", precision = 15, scale = 6)
    private BigDecimal vlCofins;
    @Campos(posicao = 21, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

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

    public String getCodClass() {
        return codClass;
    }

    public void setCodClass(String codClass) {
        this.codClass = codClass;
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

    public String getIndRec() {
        return indRec;
    }

    public void setIndRec(String indRec) {
        this.indRec = indRec;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
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

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
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
        if (!(object instanceof RegC510)) {
            return false;
        }
        RegC510 other = (RegC510) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC510[ id=" + id + " ]";
    }

}
