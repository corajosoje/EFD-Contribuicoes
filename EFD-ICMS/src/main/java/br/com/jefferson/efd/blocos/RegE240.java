package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_e240")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE240.findAll", query = "SELECT r FROM RegE240 r"),
    @NamedQuery(name = "RegE240.findById", query = "SELECT r FROM RegE240 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE240.findByIdPai", query = "SELECT r FROM RegE240 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE240.findByLinha", query = "SELECT r FROM RegE240 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE240.findByHashfile", query = "SELECT r FROM RegE240 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE240.findByReg", query = "SELECT r FROM RegE240 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE240.findByCodPart", query = "SELECT r FROM RegE240 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegE240.findByCodMod", query = "SELECT r FROM RegE240 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegE240.findBySer", query = "SELECT r FROM RegE240 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegE240.findBySub", query = "SELECT r FROM RegE240 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegE240.findByNumDoc", query = "SELECT r FROM RegE240 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegE240.findByDtDoc", query = "SELECT r FROM RegE240 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegE240.findByCodItem", query = "SELECT r FROM RegE240 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegE240.findByVlAjItem", query = "SELECT r FROM RegE240 r WHERE r.vlAjItem = :vlAjItem"),
    @NamedQuery(name = "RegE240.findByChvDoce", query = "SELECT r FROM RegE240 r WHERE r.chvDoce = :chvDoce")})
@Registros(nivel = 5)
public class RegE240 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE220 idPai;

    public RegE220 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegE220) idPai;
    }

    public RegE240() {
    }

    public RegE240(String id) {
        this.id = id;
    }

    public RegE240(String id, RegE220 idPai, long linha, String hashfile) {
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
    @Column(name = "VL_AJ_ITEM", precision = 15, scale = 6)
    private BigDecimal vlAjItem;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CHV_DOCe")
    private String chvDoce;

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

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
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
        if (!(object instanceof RegE240)) {
            return false;
        }
        RegE240 other = (RegE240) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE240[ id=" + id + " ]";
    }

}
