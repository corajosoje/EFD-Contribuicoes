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
@Table(name = "reg_c490")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC490.findAll", query = "SELECT r FROM RegC490 r"),
    @NamedQuery(name = "RegC490.findById", query = "SELECT r FROM RegC490 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC490.findByIdPai", query = "SELECT r FROM RegC490 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC490.findByLinha", query = "SELECT r FROM RegC490 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC490.findByHashfile", query = "SELECT r FROM RegC490 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC490.findByReg", query = "SELECT r FROM RegC490 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC490.findByDtDocIni", query = "SELECT r FROM RegC490 r WHERE r.dtDocIni = :dtDocIni"),
    @NamedQuery(name = "RegC490.findByDtDocFin", query = "SELECT r FROM RegC490 r WHERE r.dtDocFin = :dtDocFin"),
    @NamedQuery(name = "RegC490.findByCodMod", query = "SELECT r FROM RegC490 r WHERE r.codMod = :codMod")})
@Registros(nivel = 3)
public class RegC490 implements Serializable, BlocoSped {

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
    private List<RegC491> regC491;

    public List<RegC491> getRegC491() {
        return regC491;
    }

    public void setRegC491(List<RegC491> regC491) {
        this.regC491 = regC491;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC495> regC495;

    public List<RegC495> getRegC495() {
        return regC495;
    }

    public void setRegC495(List<RegC495> regC495) {
        this.regC495 = regC495;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC499> regC499;

    public List<RegC499> getRegC499() {
        return regC499;
    }

    public void setRegC499(List<RegC499> regC499) {
        this.regC499 = regC499;
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
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_DOC_INI")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDocIni;

    public Date getDtDocIni() {
        return this.dtDocIni;
    }

    public void setDtDocIni(Date dtDocIni) {
        this.dtDocIni = dtDocIni;
    }
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_DOC_FIN")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDocFin;

    public Date getDtDocFin() {
        return this.dtDocFin;
    }

    public void setDtDocFin(Date dtDocFin) {
        this.dtDocFin = dtDocFin;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
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
        final RegC490 other = (RegC490) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC490{" + "id=" + id + '}';
    }
}
