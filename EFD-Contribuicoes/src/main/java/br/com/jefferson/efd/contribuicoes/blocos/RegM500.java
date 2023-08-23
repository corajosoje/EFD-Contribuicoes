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
@Table(name = "reg_m500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM500.findAll", query = "SELECT r FROM RegM500 r"),
    @NamedQuery(name = "RegM500.findById", query = "SELECT r FROM RegM500 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM500.findByIdPai", query = "SELECT r FROM RegM500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM500.findByLinha", query = "SELECT r FROM RegM500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM500.findByHashfile", query = "SELECT r FROM RegM500 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM500.findByReg", query = "SELECT r FROM RegM500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM500.findByCodCred", query = "SELECT r FROM RegM500 r WHERE r.codCred = :codCred"),
    @NamedQuery(name = "RegM500.findByIndCredOri", query = "SELECT r FROM RegM500 r WHERE r.indCredOri = :indCredOri"),
    @NamedQuery(name = "RegM500.findByAliqCofins", query = "SELECT r FROM RegM500 r WHERE r.aliqCofins = :aliqCofins"),
    @NamedQuery(name = "RegM500.findByQuantBcCofins", query = "SELECT r FROM RegM500 r WHERE r.quantBcCofins = :quantBcCofins"),
    @NamedQuery(name = "RegM500.findByAliqCofinsQuant", query = "SELECT r FROM RegM500 r WHERE r.aliqCofinsQuant = :aliqCofinsQuant"),
    @NamedQuery(name = "RegM500.findByVlCred", query = "SELECT r FROM RegM500 r WHERE r.vlCred = :vlCred"),
    @NamedQuery(name = "RegM500.findByVlAjusAcres", query = "SELECT r FROM RegM500 r WHERE r.vlAjusAcres = :vlAjusAcres"),
    @NamedQuery(name = "RegM500.findByVlAjusReduc", query = "SELECT r FROM RegM500 r WHERE r.vlAjusReduc = :vlAjusReduc"),
    @NamedQuery(name = "RegM500.findByVlCredDisp", query = "SELECT r FROM RegM500 r WHERE r.vlCredDisp = :vlCredDisp"),
    @NamedQuery(name = "RegM500.findByIndDescCred", query = "SELECT r FROM RegM500 r WHERE r.indDescCred = :indDescCred"),
    @NamedQuery(name = "RegM500.findByVlCredDesc", query = "SELECT r FROM RegM500 r WHERE r.vlCredDesc = :vlCredDesc"),
    @NamedQuery(name = "RegM500.findBySldCred", query = "SELECT r FROM RegM500 r WHERE r.sldCred = :sldCred")})
@Registros(nivel = 2)
public class RegM500 implements Serializable, BlocoSped {

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
    private List<RegM505> regM505;

    public List<RegM505> getRegM505() {
        return regM505;
    }

    public void setRegM505(List<RegM505> regM505) {
        this.regM505 = regM505;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegM510> regM510;

    public List<RegM510> getRegM510() {
        return regM510;
    }

    public void setRegM510(List<RegM510> regM510) {
        this.regM510 = regM510;
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
    @Column(name = "VL_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal vlBcCofins;

    public BigDecimal getVlBcCofins() {
        return this.vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "ALIQ_COFINS", precision = 15, scale = 6)
    private BigDecimal aliqCofins;

    public BigDecimal getAliqCofins() {
        return this.aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "QUANT_BC_COFINS", precision = 15, scale = 6)
    private BigDecimal quantBcCofins;

    public BigDecimal getQuantBcCofins() {
        return this.quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "ALIQ_COFINS_QUANT", precision = 15, scale = 6)
    private BigDecimal aliqCofinsQuant;

    public BigDecimal getAliqCofinsQuant() {
        return this.aliqCofinsQuant;
    }

    public void setAliqCofinsQuant(BigDecimal aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
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
    @Column(name = "VL_CRED_DIFER", precision = 15, scale = 6)
    private BigDecimal vlCredDifer;

    public BigDecimal getVlCredDifer() {
        return this.vlCredDifer;
    }

    public void setVlCredDifer(BigDecimal vlCredDifer) {
        this.vlCredDifer = vlCredDifer;
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
        final RegM500 other = (RegM500) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM500{" + "id=" + id + '}';
    }
}
