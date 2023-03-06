package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
@Table(name = "reg_c860")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC860.findAll", query = "SELECT r FROM RegC860 r"),
    @NamedQuery(name = "RegC860.findById", query = "SELECT r FROM RegC860 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC860.findByIdPai", query = "SELECT r FROM RegC860 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC860.findByLinha", query = "SELECT r FROM RegC860 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC860.findByHashfile", query = "SELECT r FROM RegC860 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC860.findByReg", query = "SELECT r FROM RegC860 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC860.findByCodMod", query = "SELECT r FROM RegC860 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC860.findByNrSat", query = "SELECT r FROM RegC860 r WHERE r.nrSat = :nrSat"),
    @NamedQuery(name = "RegC860.findByDtDoc", query = "SELECT r FROM RegC860 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC860.findByDocIni", query = "SELECT r FROM RegC860 r WHERE r.docIni = :docIni"),
    @NamedQuery(name = "RegC860.findByDocFim", query = "SELECT r FROM RegC860 r WHERE r.docFim = :docFim")})
@Registros(nivel = 2)
public class RegC860 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC001 idPai;

    public RegC001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC001) idPai;
    }

    public RegC860() {
    }

    public RegC860(String id) {
        this.id = id;
    }

    public RegC860(String id, RegC001 idPai, long linha, String hashfile) {
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
    private List<RegC870> regC870;

    public List<RegC870> getRegC870() {
        return regC870;
    }

    public void setRegC870(List<RegC870> regC870) {
        this.regC870 = regC870;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC890> regC890;

    public List<RegC890> getRegC890() {
        return regC890;
    }

    public void setRegC890(List<RegC890> regC890) {
        this.regC890 = regC890;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC895> regC895;

    public List<RegC895> getRegC895() {
        return regC895;
    }

    public void setRegC895(List<RegC895> regC895) {
        this.regC895 = regC895;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "NR_SAT")
    private int nrSat;
    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "DOC_INI")
    private int docIni;
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "DOC_FIM")
    private int docFim;

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

    public int getNrSat() {
        return nrSat;
    }

    public void setNrSat(int nrSat) {
        this.nrSat = nrSat;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public int getDocIni() {
        return docIni;
    }

    public void setDocIni(int docIni) {
        this.docIni = docIni;
    }

    public int getDocFim() {
        return docFim;
    }

    public void setDocFim(int docFim) {
        this.docFim = docFim;
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
        if (!(object instanceof RegC860)) {
            return false;
        }
        RegC860 other = (RegC860) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC860[ id=" + id + " ]";
    }

}
