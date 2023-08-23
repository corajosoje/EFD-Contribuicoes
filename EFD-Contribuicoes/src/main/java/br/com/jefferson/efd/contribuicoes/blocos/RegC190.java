package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "reg_c190")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC190.findAll", query = "SELECT r FROM RegC190 r"),
    @NamedQuery(name = "RegC190.findById", query = "SELECT r FROM RegC190 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC190.findByIdPai", query = "SELECT r FROM RegC190 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC190.findByLinha", query = "SELECT r FROM RegC190 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC190.findByHashfile", query = "SELECT r FROM RegC190 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC190.findByReg", query = "SELECT r FROM RegC190 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC190.findByCodMod", query = "SELECT r FROM RegC190 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC190.findByDtRefIni", query = "SELECT r FROM RegC190 r WHERE r.dtRefIni = :dtRefIni"),
    @NamedQuery(name = "RegC190.findByDtRefFin", query = "SELECT r FROM RegC190 r WHERE r.dtRefFin = :dtRefFin"),
    @NamedQuery(name = "RegC190.findByCodItem", query = "SELECT r FROM RegC190 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegC190.findByCodNcm", query = "SELECT r FROM RegC190 r WHERE r.codNcm = :codNcm"),
    @NamedQuery(name = "RegC190.findByExIpi", query = "SELECT r FROM RegC190 r WHERE r.exIpi = :exIpi"),
    @NamedQuery(name = "RegC190.findByVlTotItem", query = "SELECT r FROM RegC190 r WHERE r.vlTotItem = :vlTotItem")})
@Registros(nivel = 3)
public class RegC190 implements Serializable, BlocoSped {

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
    private List<RegC191> regC191;

    public List<RegC191> getRegC191() {
        return regC191;
    }

    public void setRegC191(List<RegC191> regC191) {
        this.regC191 = regC191;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC195> regC195;

    public List<RegC195> getRegC195() {
        return regC195;
    }

    public void setRegC195(List<RegC195> regC195) {
        this.regC195 = regC195;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC198> regC198;

    public List<RegC198> getRegC198() {
        return regC198;
    }

    public void setRegC198(List<RegC198> regC198) {
        this.regC198 = regC198;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC199> regC199;

    public List<RegC199> getRegC199() {
        return regC199;
    }

    public void setRegC199(List<RegC199> regC199) {
        this.regC199 = regC199;
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
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_REF_INI")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRefIni;

    public Date getDtRefIni() {
        return this.dtRefIni;
    }

    public void setDtRefIni(Date dtRefIni) {
        this.dtRefIni = dtRefIni;
    }
    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_REF_FIN")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRefFin;

    public Date getDtRefFin() {
        return this.dtRefFin;
    }

    public void setDtRefFin(Date dtRefFin) {
        this.dtRefFin = dtRefFin;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;

    public String getCodItem() {
        return this.codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_NCM")
    private String codNcm;

    public String getCodNcm() {
        return this.codNcm;
    }

    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "EX_IPI")
    private String exIpi;

    public String getExIpi() {
        return this.exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_TOT_ITEM", precision = 15, scale = 6)
    private BigDecimal vlTotItem;

    public BigDecimal getVlTotItem() {
        return this.vlTotItem;
    }

    public void setVlTotItem(BigDecimal vlTotItem) {
        this.vlTotItem = vlTotItem;
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
        final RegC190 other = (RegC190) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC190{" + "id=" + id + '}';
    }
}
