package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1050")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1050.findAll", query = "SELECT r FROM Reg1050 r"),
    @NamedQuery(name = "Reg1050.findById", query = "SELECT r FROM Reg1050 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1050.findByIdPai", query = "SELECT r FROM Reg1050 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1050.findByLinha", query = "SELECT r FROM Reg1050 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1050.findByHashfile", query = "SELECT r FROM Reg1050 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1050.findByReg", query = "SELECT r FROM Reg1050 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1050.findByDtRef", query = "SELECT r FROM Reg1050 r WHERE r.dtRef = :dtRef"),
    @NamedQuery(name = "Reg1050.findByIndAjBc", query = "SELECT r FROM Reg1050 r WHERE r.indAjBc = :indAjBc"),
    @NamedQuery(name = "Reg1050.findByCnpj", query = "SELECT r FROM Reg1050 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "Reg1050.findByVlAjTot", query = "SELECT r FROM Reg1050 r WHERE r.vlAjTot = :vlAjTot"),
    @NamedQuery(name = "Reg1050.findByVlAjCst01", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst01 = :vlAjCst01"),
    @NamedQuery(name = "Reg1050.findByVlAjCst02", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst02 = :vlAjCst02"),
    @NamedQuery(name = "Reg1050.findByVlAjCst03", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst03 = :vlAjCst03"),
    @NamedQuery(name = "Reg1050.findByVlAjCst04", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst04 = :vlAjCst04"),
    @NamedQuery(name = "Reg1050.findByVlAjCst05", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst05 = :vlAjCst05"),
    @NamedQuery(name = "Reg1050.findByVlAjCst06", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst06 = :vlAjCst06"),
    @NamedQuery(name = "Reg1050.findByVlAjCst07", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst07 = :vlAjCst07"),
    @NamedQuery(name = "Reg1050.findByVlAjCst08", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst08 = :vlAjCst08"),
    @NamedQuery(name = "Reg1050.findByVlAjCst09", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst09 = :vlAjCst09"),
    @NamedQuery(name = "Reg1050.findByVlAjCst49", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst49 = :vlAjCst49"),
    @NamedQuery(name = "Reg1050.findByVlAjCst99", query = "SELECT r FROM Reg1050 r WHERE r.vlAjCst99 = :vlAjCst99"),
    @NamedQuery(name = "Reg1050.findByIndAprop", query = "SELECT r FROM Reg1050 r WHERE r.indAprop = :indAprop"),
    @NamedQuery(name = "Reg1050.findByNumRec", query = "SELECT r FROM Reg1050 r WHERE r.numRec = :numRec"),
    @NamedQuery(name = "Reg1050.findByInfoCompl", query = "SELECT r FROM Reg1050 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 2)
public class Reg1050 implements Serializable, BlocoSped {

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
    @Column(name = "DT_REF")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRef;

    public Date getDtRef() {
        return this.dtRef;
    }

    public void setDtRef(Date dtRef) {
        this.dtRef = dtRef;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_AJ_BC")
    private String indAjBc;

    public String getIndAjBc() {
        return this.indAjBc;
    }

    public void setIndAjBc(String indAjBc) {
        this.indAjBc = indAjBc;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_AJ_TOT", precision = 15, scale = 6)
    private BigDecimal vlAjTot;

    public BigDecimal getVlAjTot() {
        return this.vlAjTot;
    }

    public void setVlAjTot(BigDecimal vlAjTot) {
        this.vlAjTot = vlAjTot;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_AJ_CST01", precision = 15, scale = 6)
    private BigDecimal vlAjCst01;

    public BigDecimal getVlAjCst01() {
        return this.vlAjCst01;
    }

    public void setVlAjCst01(BigDecimal vlAjCst01) {
        this.vlAjCst01 = vlAjCst01;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_AJ_CST02", precision = 15, scale = 6)
    private BigDecimal vlAjCst02;

    public BigDecimal getVlAjCst02() {
        return this.vlAjCst02;
    }

    public void setVlAjCst02(BigDecimal vlAjCst02) {
        this.vlAjCst02 = vlAjCst02;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_AJ_CST03", precision = 15, scale = 6)
    private BigDecimal vlAjCst03;

    public BigDecimal getVlAjCst03() {
        return this.vlAjCst03;
    }

    public void setVlAjCst03(BigDecimal vlAjCst03) {
        this.vlAjCst03 = vlAjCst03;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_AJ_CST04", precision = 15, scale = 6)
    private BigDecimal vlAjCst04;

    public BigDecimal getVlAjCst04() {
        return this.vlAjCst04;
    }

    public void setVlAjCst04(BigDecimal vlAjCst04) {
        this.vlAjCst04 = vlAjCst04;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_AJ_CST05", precision = 15, scale = 6)
    private BigDecimal vlAjCst05;

    public BigDecimal getVlAjCst05() {
        return this.vlAjCst05;
    }

    public void setVlAjCst05(BigDecimal vlAjCst05) {
        this.vlAjCst05 = vlAjCst05;
    }
    @Campos(posicao = 11, tipo = 'R')
    @Column(name = "VL_AJ_CST06", precision = 15, scale = 6)
    private BigDecimal vlAjCst06;

    public BigDecimal getVlAjCst06() {
        return this.vlAjCst06;
    }

    public void setVlAjCst06(BigDecimal vlAjCst06) {
        this.vlAjCst06 = vlAjCst06;
    }
    @Campos(posicao = 12, tipo = 'R')
    @Column(name = "VL_AJ_CST07", precision = 15, scale = 6)
    private BigDecimal vlAjCst07;

    public BigDecimal getVlAjCst07() {
        return this.vlAjCst07;
    }

    public void setVlAjCst07(BigDecimal vlAjCst07) {
        this.vlAjCst07 = vlAjCst07;
    }
    @Campos(posicao = 13, tipo = 'R')
    @Column(name = "VL_AJ_CST08", precision = 15, scale = 6)
    private BigDecimal vlAjCst08;

    public BigDecimal getVlAjCst08() {
        return this.vlAjCst08;
    }

    public void setVlAjCst08(BigDecimal vlAjCst08) {
        this.vlAjCst08 = vlAjCst08;
    }
    @Campos(posicao = 14, tipo = 'R')
    @Column(name = "VL_AJ_CST09", precision = 15, scale = 6)
    private BigDecimal vlAjCst09;

    public BigDecimal getVlAjCst09() {
        return this.vlAjCst09;
    }

    public void setVlAjCst09(BigDecimal vlAjCst09) {
        this.vlAjCst09 = vlAjCst09;
    }
    @Campos(posicao = 15, tipo = 'R')
    @Column(name = "VL_AJ_CST49", precision = 15, scale = 6)
    private BigDecimal vlAjCst49;

    public BigDecimal getVlAjCst49() {
        return this.vlAjCst49;
    }

    public void setVlAjCst49(BigDecimal vlAjCst49) {
        this.vlAjCst49 = vlAjCst49;
    }
    @Campos(posicao = 16, tipo = 'R')
    @Column(name = "VL_AJ_CST99", precision = 15, scale = 6)
    private BigDecimal vlAjCst99;

    public BigDecimal getVlAjCst99() {
        return this.vlAjCst99;
    }

    public void setVlAjCst99(BigDecimal vlAjCst99) {
        this.vlAjCst99 = vlAjCst99;
    }
    @Campos(posicao = 17, tipo = 'C')
    @Column(name = "IND_APROP")
    private String indAprop;

    public String getIndAprop() {
        return this.indAprop;
    }

    public void setIndAprop(String indAprop) {
        this.indAprop = indAprop;
    }
    @Campos(posicao = 18, tipo = 'C')
    @Column(name = "NUM_REC")
    private String numRec;

    public String getNumRec() {
        return this.numRec;
    }

    public void setNumRec(String numRec) {
        this.numRec = numRec;
    }
    @Campos(posicao = 19, tipo = 'C')
    @Column(name = "INFO_COMPL")
    private String infoCompl;

    public String getInfoCompl() {
        return this.infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
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
        final Reg1050 other = (Reg1050) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1050{" + "id=" + id + '}';
    }
}
