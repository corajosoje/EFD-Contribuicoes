package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_e313")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE313.findAll", query = "SELECT r FROM RegE313 r"),
    @NamedQuery(name = "RegE313.findById", query = "SELECT r FROM RegE313 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE313.findByIdPai", query = "SELECT r FROM RegE313 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE313.findByLinha", query = "SELECT r FROM RegE313 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE313.findByHash", query = "SELECT r FROM RegE313 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE313.findByReg", query = "SELECT r FROM RegE313 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE313.findByCodPart", query = "SELECT r FROM RegE313 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegE313.findByCodMod", query = "SELECT r FROM RegE313 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegE313.findBySer", query = "SELECT r FROM RegE313 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegE313.findBySub", query = "SELECT r FROM RegE313 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegE313.findByNumDoc", query = "SELECT r FROM RegE313 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegE313.findByChvDoce", query = "SELECT r FROM RegE313 r WHERE r.chvDoce = :chvDoce"),
    @NamedQuery(name = "RegE313.findByDtDoc", query = "SELECT r FROM RegE313 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegE313.findByCodItem", query = "SELECT r FROM RegE313 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegE313.findByVlAjItem", query = "SELECT r FROM RegE313 r WHERE r.vlAjItem = :vlAjItem")})
@Registros(nivel = 5)
public class RegE313 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE311 idPai;

    public RegE311 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE311) idPai;
    }

    public RegE313() {
    }

    public RegE313(Long id) {
        this.id = id;
    }

    public RegE313(Long id, RegE311 idPai, long linha, String hash) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hash = hash;
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
    @Column(name = "HASH")
    private String hash;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "SUB")
    private int sub;
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CHV_DOCe")
    private String chvDoce;
    @Campos(posicao = 8, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_AJ_ITEM")
    private BigDecimal vlAjItem;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
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

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getVlAjItem() {
        return vlAjItem;
    }

    public void setVlAjItem(BigDecimal vlAjItem) {
        this.vlAjItem = vlAjItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegE313)) {
            return false;
        }
        RegE313 other = (RegE313) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE313[ id=" + id + " ]";
    }

}
