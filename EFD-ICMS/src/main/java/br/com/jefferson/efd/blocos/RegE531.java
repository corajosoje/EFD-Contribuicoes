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
@Table(name = "reg_e531")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE531.findAll", query = "SELECT r FROM RegE531 r"),
    @NamedQuery(name = "RegE531.findById", query = "SELECT r FROM RegE531 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE531.findByIdPai", query = "SELECT r FROM RegE531 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE531.findByLinha", query = "SELECT r FROM RegE531 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE531.findByHash", query = "SELECT r FROM RegE531 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE531.findByReg", query = "SELECT r FROM RegE531 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE531.findByCodPart", query = "SELECT r FROM RegE531 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegE531.findByCodMod", query = "SELECT r FROM RegE531 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegE531.findBySer", query = "SELECT r FROM RegE531 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegE531.findBySub", query = "SELECT r FROM RegE531 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegE531.findByNumDoc", query = "SELECT r FROM RegE531 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegE531.findByDtDoc", query = "SELECT r FROM RegE531 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegE531.findByCodItem", query = "SELECT r FROM RegE531 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegE531.findByVlAjItem", query = "SELECT r FROM RegE531 r WHERE r.vlAjItem = :vlAjItem"),
    @NamedQuery(name = "RegE531.findByChvNfe", query = "SELECT r FROM RegE531 r WHERE r.chvNfe = :chvNfe")})
@Registros(nivel = 5)
public class RegE531 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE530 idPai;

    public RegE530 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE530) idPai;
    }

    public RegE531() {
    }

    public RegE531(Long id) {
        this.id = id;
    }

    public RegE531(Long id, RegE530 idPai, long linha, String hash) {
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
    @Campos(posicao = 7, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_AJ_ITEM")
    private BigDecimal vlAjItem;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CHV_NFE")
    private String chvNfe;

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

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
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
        if (!(object instanceof RegE531)) {
            return false;
        }
        RegE531 other = (RegE531) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE531[ id=" + id + " ]";
    }

}
