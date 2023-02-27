package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1105")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1105.findAll", query = "SELECT r FROM Reg1105 r"),
    @NamedQuery(name = "Reg1105.findById", query = "SELECT r FROM Reg1105 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1105.findByIdPai", query = "SELECT r FROM Reg1105 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1105.findByLinha", query = "SELECT r FROM Reg1105 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1105.findByHashfile", query = "SELECT r FROM Reg1105 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1105.findByReg", query = "SELECT r FROM Reg1105 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1105.findByCodMod", query = "SELECT r FROM Reg1105 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "Reg1105.findBySer", query = "SELECT r FROM Reg1105 r WHERE r.ser = :ser"),
    @NamedQuery(name = "Reg1105.findByNumDoc", query = "SELECT r FROM Reg1105 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "Reg1105.findByChvNfe", query = "SELECT r FROM Reg1105 r WHERE r.chvNfe = :chvNfe"),
    @NamedQuery(name = "Reg1105.findByDtDoc", query = "SELECT r FROM Reg1105 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "Reg1105.findByCodItem", query = "SELECT r FROM Reg1105 r WHERE r.codItem = :codItem")})
@Registros(nivel = 3)
public class Reg1105 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1100 idPai;

    public Reg1100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1100) idPai;
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
    @Column(name = "COD_MOD")
    private String codMod;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CHV_NFE")
    private String chvNfe;

    @Campos(posicao = 6, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1110> reg1110;

    public List<Reg1110> getReg1110() {
        return reg1110;
    }

    public void setReg1110(List<Reg1110> reg1110) {
        this.reg1110 = reg1110;
    }

    public Reg1105() {
    }

    public Reg1105(String id) {
        this.id = id;
    }

    public Reg1105(String id, Reg1100 idPai, long linha, String hashfile) {
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

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
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

    @Override
    public int hashCode() {
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reg1105)) {
            return false;
        }
        Reg1105 other = (Reg1105) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1105[ id=" + id + " ]";
    }

}
