package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
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
@Registros(nivel = 3)
public class RegC860 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC010 idPai;

    @Override
    public RegC010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC010) idPai;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @PrePersist
    @Override
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Override
    public long getLinha() {
        return this.linha;
    }

    @Override
    public void setLinha(long linha) {
        this.linha = linha;
    }
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Override
    public String getHashfile() {
        return this.hashfile;
    }

    @Override
    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC870> regC870;

    public List<RegC870> getRegC870() {
        return regC870;
    }

    public void setRegC870(List<RegC870> regC870) {
        this.regC870 = regC870;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC880> regC880;

    public List<RegC880> getRegC880() {
        return regC880;
    }

    public void setRegC880(List<RegC880> regC880) {
        this.regC880 = regC880;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC890> regC890;

    public List<RegC890> getRegC890() {
        return regC890;
    }

    public void setRegC890(List<RegC890> regC890) {
        this.regC890 = regC890;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Override
    public String getReg() {
        return this.reg;
    }

    @Override
    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NR_SAT")
    private String nrSat;

    public String getNrSat() {
        return this.nrSat;
    }

    public void setNrSat(String nrSat) {
        this.nrSat = nrSat;
    }

    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDoc;

    public Date getDtDoc() {
        return this.dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "DOC_INI")
    private int docIni;

    public int getDocIni() {
        return this.docIni;
    }

    public void setDocIni(int docIni) {
        this.docIni = docIni;
    }
    @Campos(posicao = 6, tipo = 'I')
    @Column(name = "DOC_FIM")
    private int docFim;

    public int getDocFim() {
        return this.docFim;
    }

    public void setDocFim(int docFim) {
        this.docFim = docFim;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
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
        final RegC860 other = (RegC860) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC860{" + "id=" + id + '}';
    }
}
