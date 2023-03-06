package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1700")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1700.findAll", query = "SELECT r FROM Reg1700 r"),
    @NamedQuery(name = "Reg1700.findById", query = "SELECT r FROM Reg1700 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1700.findByIdPai", query = "SELECT r FROM Reg1700 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1700.findByLinha", query = "SELECT r FROM Reg1700 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1700.findByHashfile", query = "SELECT r FROM Reg1700 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1700.findByReg", query = "SELECT r FROM Reg1700 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1700.findByCodDisp", query = "SELECT r FROM Reg1700 r WHERE r.codDisp = :codDisp"),
    @NamedQuery(name = "Reg1700.findByCodMod", query = "SELECT r FROM Reg1700 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "Reg1700.findBySer", query = "SELECT r FROM Reg1700 r WHERE r.ser = :ser"),
    @NamedQuery(name = "Reg1700.findBySub", query = "SELECT r FROM Reg1700 r WHERE r.sub = :sub"),
    @NamedQuery(name = "Reg1700.findByNumDocIni", query = "SELECT r FROM Reg1700 r WHERE r.numDocIni = :numDocIni"),
    @NamedQuery(name = "Reg1700.findByNumDocFin", query = "SELECT r FROM Reg1700 r WHERE r.numDocFin = :numDocFin"),
    @NamedQuery(name = "Reg1700.findByNumAut", query = "SELECT r FROM Reg1700 r WHERE r.numAut = :numAut")})
@Registros(nivel = 2)
public class Reg1700 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    public Reg1001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg1001) idPai;
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
    @Column(name = "COD_DISP")
    private String codDisp;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "SUB")
    private String sub;

    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "NUM_DOC_INI")
    private int numDocIni;

    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "NUM_DOC_FIN")
    private int numDocFin;

    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "NUM_AUT")
    private int numAut;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg1710> reg1710;

    public List<Reg1710> getReg1710() {
        return reg1710;
    }

    public void setReg1710(List<Reg1710> reg1710) {
        this.reg1710 = reg1710;
    }

    public Reg1700() {
    }

    public Reg1700(String id) {
        this.id = id;
    }

    public Reg1700(String id, Reg1001 idPai, long linha, String hashfile) {
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
