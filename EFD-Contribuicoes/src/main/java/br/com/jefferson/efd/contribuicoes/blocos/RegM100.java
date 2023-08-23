package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_m100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM100.findAll", query = "SELECT r FROM RegM100 r"),
    @NamedQuery(name = "RegM100.findById", query = "SELECT r FROM RegM100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM100.findByIdPai", query = "SELECT r FROM RegM100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM100.findByLinha", query = "SELECT r FROM RegM100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM100.findByHashfile", query = "SELECT r FROM RegM100 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM100.findByReg", query = "SELECT r FROM RegM100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM100.findByCodCred", query = "SELECT r FROM RegM100 r WHERE r.codCred = :codCred"),
    @NamedQuery(name = "RegM100.findByIndCredOri", query = "SELECT r FROM RegM100 r WHERE r.indCredOri = :indCredOri"),
    @NamedQuery(name = "RegM100.findByAliqPis", query = "SELECT r FROM RegM100 r WHERE r.aliqPis = :aliqPis"),
    @NamedQuery(name = "RegM100.findByQuantBcPis", query = "SELECT r FROM RegM100 r WHERE r.quantBcPis = :quantBcPis"),
    @NamedQuery(name = "RegM100.findByAliqPisQuant", query = "SELECT r FROM RegM100 r WHERE r.aliqPisQuant = :aliqPisQuant"),
    @NamedQuery(name = "RegM100.findByVlCred", query = "SELECT r FROM RegM100 r WHERE r.vlCred = :vlCred"),
    @NamedQuery(name = "RegM100.findByVlAjusAcres", query = "SELECT r FROM RegM100 r WHERE r.vlAjusAcres = :vlAjusAcres"),
    @NamedQuery(name = "RegM100.findByVlAjusReduc", query = "SELECT r FROM RegM100 r WHERE r.vlAjusReduc = :vlAjusReduc"),
    @NamedQuery(name = "RegM100.findByVlCredDif", query = "SELECT r FROM RegM100 r WHERE r.vlCredDif = :vlCredDif"),
    @NamedQuery(name = "RegM100.findByVlCredDisp", query = "SELECT r FROM RegM100 r WHERE r.vlCredDisp = :vlCredDisp"),
    @NamedQuery(name = "RegM100.findByIndDescCred", query = "SELECT r FROM RegM100 r WHERE r.indDescCred = :indDescCred"),
    @NamedQuery(name = "RegM100.findByVlCredDesc", query = "SELECT r FROM RegM100 r WHERE r.vlCredDesc = :vlCredDesc"),
    @NamedQuery(name = "RegM100.findBySldCred", query = "SELECT r FROM RegM100 r WHERE r.sldCred = :sldCred")})
@Registros(nivel = 2)
public class RegM100 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM001 idPai;

    @Override
    public RegM001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM001) idPai;
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
    private List<RegM105> regM105;

    public List<RegM105> getRegM105() {
        return regM105;
    }

    public void setRegM105(List<RegM105> regM105) {
        this.regM105 = regM105;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM110> regM110;

    public List<RegM110> getRegM110() {
        return regM110;
    }

    public void setRegM110(List<RegM110> regM110) {
        this.regM110 = regM110;
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
    @Column(name = "COD_CRED")
    private String codCred;

    public String getCodCred() {
        return this.codCred;
    }

    public void setCodCred(String codCred) {
        this.codCred = codCred;
    }
    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "IND_CRED_ORI")
    private int indCredOri;

    public int getIndCredOri() {
        return this.indCredOri;
    }

    public void setIndCredOri(int indCredOri) {
        this.indCredOri = indCredOri;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_BC_PIS", precision = 15, scale = 6)
    private BigDecimal vlBcPis;

    public BigDecimal getVlBcPis() {
        return this.vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "ALIQ_PIS", precision = 15, scale = 6)
    private BigDecimal aliqPis;

    public BigDecimal getAliqPis() {
        return this.aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "QUANT_BC_PIS", precision = 15, scale = 6)
    private BigDecimal quantBcPis;

    public BigDecimal getQuantBcPis() {
        return this.quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "ALIQ_PIS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqPisQuant;

    public BigDecimal getAliqPisQuant() {
        return this.aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_CRED", precision = 15, scale = 6)
    private BigDecimal vlCred;

    public BigDecimal getVlCred() {
        return this.vlCred;
    }

    public void setVlCred(BigDecimal vlCred) {
        this.vlCred = vlCred;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_AJUS_ACRES", precision = 15, scale = 6)
    private BigDecimal vlAjusAcres;

    public BigDecimal getVlAjusAcres() {
        return this.vlAjusAcres;
    }

    public void setVlAjusAcres(BigDecimal vlAjusAcres) {
        this.vlAjusAcres = vlAjusAcres;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_AJUS_REDUC", precision = 15, scale = 6)
    private BigDecimal vlAjusReduc;

    public BigDecimal getVlAjusReduc() {
        return this.vlAjusReduc;
    }

    public void setVlAjusReduc(BigDecimal vlAjusReduc) {
        this.vlAjusReduc = vlAjusReduc;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_CRED_DIF", precision = 15, scale = 6)
    private BigDecimal vlCredDif;

    public BigDecimal getVlCredDif() {
        return this.vlCredDif;
    }

    public void setVlCredDif(BigDecimal vlCredDif) {
        this.vlCredDif = vlCredDif;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_CRED_DISP", precision = 15, scale = 6)
    private BigDecimal vlCredDisp;

    public BigDecimal getVlCredDisp() {
        return this.vlCredDisp;
    }

    public void setVlCredDisp(BigDecimal vlCredDisp) {
        this.vlCredDisp = vlCredDisp;
    }
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "IND_DESC_CRED")
    private String indDescCred;

    public String getIndDescCred() {
        return this.indDescCred;
    }

    public void setIndDescCred(String indDescCred) {
        this.indDescCred = indDescCred;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_CRED_DESC", precision = 15, scale = 6)
    private BigDecimal vlCredDesc;

    public BigDecimal getVlCredDesc() {
        return this.vlCredDesc;
    }

    public void setVlCredDesc(BigDecimal vlCredDesc) {
        this.vlCredDesc = vlCredDesc;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "SLD_CRED", precision = 15, scale = 6)
    private BigDecimal sldCred;

    public BigDecimal getSldCred() {
        return this.sldCred;
    }

    public void setSldCred(BigDecimal sldCred) {
        this.sldCred = sldCred;
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
        final RegM100 other = (RegM100) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM100{" + "id=" + id + '}';
    }
}
