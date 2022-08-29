package br.com.jefferson.efd.blocos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1700")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1700.findAll", query = "SELECT r FROM Reg1700 r"),
    @NamedQuery(name = "Reg1700.findById", query = "SELECT r FROM Reg1700 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1700.findByIdPai", query = "SELECT r FROM Reg1700 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1700.findByLinha", query = "SELECT r FROM Reg1700 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1700.findByHash", query = "SELECT r FROM Reg1700 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1700.findByReg", query = "SELECT r FROM Reg1700 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1700.findByCodDisp", query = "SELECT r FROM Reg1700 r WHERE r.codDisp = :codDisp"),
    @NamedQuery(name = "Reg1700.findByCodMod", query = "SELECT r FROM Reg1700 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "Reg1700.findBySer", query = "SELECT r FROM Reg1700 r WHERE r.ser = :ser"),
    @NamedQuery(name = "Reg1700.findBySub", query = "SELECT r FROM Reg1700 r WHERE r.sub = :sub"),
    @NamedQuery(name = "Reg1700.findByNumDocIni", query = "SELECT r FROM Reg1700 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "Reg1700.findByNumDocFin", query = "SELECT r FROM Reg1700 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "Reg1700.findByNumAut", query = "SELECT r FROM Reg1700 r WHERE r.numAut = :numAut")})
public class Reg1700 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_PAI")
    private long idPai;
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "COD_DISP")
    private String codDisp;
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "SER")
    private String ser;
    @Column(name = "SUB")
    private String sub;
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;
    @Column(name = "NUM_AUT")
    private int numAut;

    public Reg1700() {
    }

    public Reg1700(Long id) {
        this.id = id;
    }

    public Reg1700(Long id, long idPai, long linha, String hash) {
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

    public long getIdPai() {
        return idPai;
    }

    public void setIdPai(long idPai) {
        this.idPai = idPai;
    }

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

    public String getCodDisp() {
        return codDisp;
    }

    public void setCodDisp(String codDisp) {
        this.codDisp = codDisp;
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

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(int numDocIni) {
        this.numDocIni = numDocIni;
    }

    public int getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(int numDocFin) {
        this.numDocFin = numDocFin;
    }

    public int getNumAut() {
        return numAut;
    }

    public void setNumAut(int numAut) {
        this.numAut = numAut;
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
        if (!(object instanceof Reg1700)) {
            return false;
        }
        Reg1700 other = (Reg1700) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1700[ id=" + id + " ]";
    }

}
