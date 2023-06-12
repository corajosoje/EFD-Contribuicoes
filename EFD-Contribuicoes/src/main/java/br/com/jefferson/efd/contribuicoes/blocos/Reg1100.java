package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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
@Table(name = "reg_1100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1100.findAll", query = "SELECT r FROM Reg1100 r"),
    @NamedQuery(name = "Reg1100.findById", query = "SELECT r FROM Reg1100 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1100.findByIdPai", query = "SELECT r FROM Reg1100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1100.findByLinha", query = "SELECT r FROM Reg1100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1100.findByHashfile", query = "SELECT r FROM Reg1100 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1100.findByReg", query = "SELECT r FROM Reg1100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1100.findByPerApuCred", query = "SELECT r FROM Reg1100 r WHERE r.perApuCred = :perApuCred"),
    @NamedQuery(name = "Reg1100.findByOrigCred", query = "SELECT r FROM Reg1100 r WHERE r.origCred = :origCred"),
    @NamedQuery(name = "Reg1100.findByCnpjSuc", query = "SELECT r FROM Reg1100 r WHERE r.cnpjSuc = :cnpjSuc"),
    @NamedQuery(name = "Reg1100.findByCodCred", query = "SELECT r FROM Reg1100 r WHERE r.codCred = :codCred"),
    @NamedQuery(name = "Reg1100.findByVlCredApu", query = "SELECT r FROM Reg1100 r WHERE r.vlCredApu = :vlCredApu"),
    @NamedQuery(name = "Reg1100.findByVlCredExtApu", query = "SELECT r FROM Reg1100 r WHERE r.vlCredExtApu = :vlCredExtApu"),
    @NamedQuery(name = "Reg1100.findByVlTotCredApu", query = "SELECT r FROM Reg1100 r WHERE r.vlTotCredApu = :vlTotCredApu"),
    @NamedQuery(name = "Reg1100.findByVlCredDescPaAnt", query = "SELECT r FROM Reg1100 r WHERE r.vlCredDescPaAnt = :vlCredDescPaAnt"),
    @NamedQuery(name = "Reg1100.findByVlCredPerPaAnt", query = "SELECT r FROM Reg1100 r WHERE r.vlCredPerPaAnt = :vlCredPerPaAnt"),
    @NamedQuery(name = "Reg1100.findByVlCredDcompPaAnt", query = "SELECT r FROM Reg1100 r WHERE r.vlCredDcompPaAnt = :vlCredDcompPaAnt"),
    @NamedQuery(name = "Reg1100.findBySdCredDispEfd", query = "SELECT r FROM Reg1100 r WHERE r.sdCredDispEfd = :sdCredDispEfd"),
    @NamedQuery(name = "Reg1100.findByVlCredDescEfd", query = "SELECT r FROM Reg1100 r WHERE r.vlCredDescEfd = :vlCredDescEfd"),
    @NamedQuery(name = "Reg1100.findByVlCredPerEfd", query = "SELECT r FROM Reg1100 r WHERE r.vlCredPerEfd = :vlCredPerEfd"),
    @NamedQuery(name = "Reg1100.findByVlCredDcompEfd", query = "SELECT r FROM Reg1100 r WHERE r.vlCredDcompEfd = :vlCredDcompEfd"),
    @NamedQuery(name = "Reg1100.findByVlCredTrans", query = "SELECT r FROM Reg1100 r WHERE r.vlCredTrans = :vlCredTrans"),
    @NamedQuery(name = "Reg1100.findByVlCredOut", query = "SELECT r FROM Reg1100 r WHERE r.vlCredOut = :vlCredOut"),
    @NamedQuery(name = "Reg1100.findBySldCredFim", query = "SELECT r FROM Reg1100 r WHERE r.sldCredFim = :sldCredFim")})
@Registros(nivel = 2)
public class Reg1100 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    @Override
    public Reg1001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg1001) idPai;
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
    private List<Reg1101> reg1101;

    public List<Reg1101> getReg1101() {
        return reg1101;
    }

    public void setReg1101(List<Reg1101> reg1101) {
        this.reg1101 = reg1101;
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "PER_APU_CRED")
    private int perApuCred;

    public int getPerApuCred() {
        return this.perApuCred;
    }

    public void setPerApuCred(int perApuCred) {
        this.perApuCred = perApuCred;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "ORIG_CRED")
    private String origCred;

    public String getOrigCred() {
        return this.origCred;
    }

    public void setOrigCred(String origCred) {
        this.origCred = origCred;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CNPJ_SUC")
    private String cnpjSuc;

    public String getCnpjSuc() {
        return this.cnpjSuc;
    }

    public void setCnpjSuc(String cnpjSuc) {
        this.cnpjSuc = cnpjSuc;
    }

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_CRED")
    private String codCred;

    public String getCodCred() {
        return this.codCred;
    }

    public void setCodCred(String codCred) {
        this.codCred = codCred;
    }

    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_CRED_APU", precision = 15, scale = 6)
    private BigDecimal vlCredApu;

    public BigDecimal getVlCredApu() {
        return this.vlCredApu;
    }

    public void setVlCredApu(BigDecimal vlCredApu) {
        this.vlCredApu = vlCredApu;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_CRED_EXT_APU", precision = 15, scale = 6)
    private BigDecimal vlCredExtApu;

    public BigDecimal getVlCredExtApu() {
        return this.vlCredExtApu;
    }

    public void setVlCredExtApu(BigDecimal vlCredExtApu) {
        this.vlCredExtApu = vlCredExtApu;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_TOT_CRED_APU", precision = 15, scale = 6)
    private BigDecimal vlTotCredApu;

    public BigDecimal getVlTotCredApu() {
        return this.vlTotCredApu;
    }

    public void setVlTotCredApu(BigDecimal vlTotCredApu) {
        this.vlTotCredApu = vlTotCredApu;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_CRED_DESC_PA_ANT", precision = 15, scale = 6)
    private BigDecimal vlCredDescPaAnt;

    public BigDecimal getVlCredDescPaAnt() {
        return this.vlCredDescPaAnt;
    }

    public void setVlCredDescPaAnt(BigDecimal vlCredDescPaAnt) {
        this.vlCredDescPaAnt = vlCredDescPaAnt;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_CRED_PER_PA_ANT", precision = 15, scale = 6)
    private BigDecimal vlCredPerPaAnt;

    public BigDecimal getVlCredPerPaAnt() {
        return this.vlCredPerPaAnt;
    }

    public void setVlCredPerPaAnt(BigDecimal vlCredPerPaAnt) {
        this.vlCredPerPaAnt = vlCredPerPaAnt;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_CRED_DCOMP_PA_ANT", precision = 15, scale = 6)
    private BigDecimal vlCredDcompPaAnt;

    public BigDecimal getVlCredDcompPaAnt() {
        return this.vlCredDcompPaAnt;
    }

    public void setVlCredDcompPaAnt(BigDecimal vlCredDcompPaAnt) {
        this.vlCredDcompPaAnt = vlCredDcompPaAnt;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "SD_CRED_DISP_EFD", precision = 15, scale = 6)
    private BigDecimal sdCredDispEfd;

    public BigDecimal getSdCredDispEfd() {
        return this.sdCredDispEfd;
    }

    public void setSdCredDispEfd(BigDecimal sdCredDispEfd) {
        this.sdCredDispEfd = sdCredDispEfd;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_CRED_DESC_EFD", precision = 15, scale = 6)
    private BigDecimal vlCredDescEfd;

    public BigDecimal getVlCredDescEfd() {
        return this.vlCredDescEfd;
    }

    public void setVlCredDescEfd(BigDecimal vlCredDescEfd) {
        this.vlCredDescEfd = vlCredDescEfd;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_CRED_PER_EFD", precision = 15, scale = 6)
    private BigDecimal vlCredPerEfd;

    public BigDecimal getVlCredPerEfd() {
        return this.vlCredPerEfd;
    }

    public void setVlCredPerEfd(BigDecimal vlCredPerEfd) {
        this.vlCredPerEfd = vlCredPerEfd;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_CRED_DCOMP_EFD", precision = 15, scale = 6)
    private BigDecimal vlCredDcompEfd;

    public BigDecimal getVlCredDcompEfd() {
        return this.vlCredDcompEfd;
    }

    public void setVlCredDcompEfd(BigDecimal vlCredDcompEfd) {
        this.vlCredDcompEfd = vlCredDcompEfd;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_CRED_TRANS", precision = 15, scale = 6)
    private BigDecimal vlCredTrans;

    public BigDecimal getVlCredTrans() {
        return this.vlCredTrans;
    }

    public void setVlCredTrans(BigDecimal vlCredTrans) {
        this.vlCredTrans = vlCredTrans;
    }
    @Campos(posicao = 17, tipo = 'R')
    @Column(name = "VL_CRED_OUT", precision = 15, scale = 6)
    private BigDecimal vlCredOut;

    public BigDecimal getVlCredOut() {
        return this.vlCredOut;
    }

    public void setVlCredOut(BigDecimal vlCredOut) {
        this.vlCredOut = vlCredOut;
    }
    @Campos(posicao = 18, tipo = 'R')
    @Column(name = "SLD_CRED_FIM", precision = 15, scale = 6)
    private BigDecimal sldCredFim;

    public BigDecimal getSldCredFim() {
        return this.sldCredFim;
    }

    public void setSldCredFim(BigDecimal sldCredFim) {
        this.sldCredFim = sldCredFim;
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
        final Reg1100 other = (Reg1100) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1100{" + "id=" + id + '}';
    }
}
