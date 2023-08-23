package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
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
@Table(name = "reg_f600")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF600.findAll", query = "SELECT r FROM RegF600 r"),
    @NamedQuery(name = "RegF600.findById", query = "SELECT r FROM RegF600 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF600.findByIdPai", query = "SELECT r FROM RegF600 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF600.findByLinha", query = "SELECT r FROM RegF600 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF600.findByHashfile", query = "SELECT r FROM RegF600 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF600.findByReg", query = "SELECT r FROM RegF600 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF600.findByIndNatRet", query = "SELECT r FROM RegF600 r WHERE r.indNatRet = :indNatRet"),
    @NamedQuery(name = "RegF600.findByDtRet", query = "SELECT r FROM RegF600 r WHERE r.dtRet = :dtRet"),
    @NamedQuery(name = "RegF600.findByVlBcRet", query = "SELECT r FROM RegF600 r WHERE r.vlBcRet = :vlBcRet"),
    @NamedQuery(name = "RegF600.findByVlRet", query = "SELECT r FROM RegF600 r WHERE r.vlRet = :vlRet"),
    @NamedQuery(name = "RegF600.findByCodRec", query = "SELECT r FROM RegF600 r WHERE r.codRec = :codRec"),
    @NamedQuery(name = "RegF600.findByIndNatRec", query = "SELECT r FROM RegF600 r WHERE r.indNatRec = :indNatRec"),
    @NamedQuery(name = "RegF600.findByCnpj", query = "SELECT r FROM RegF600 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "RegF600.findByVlRetPis", query = "SELECT r FROM RegF600 r WHERE r.vlRetPis = :vlRetPis"),
    @NamedQuery(name = "RegF600.findByVlRetCofins", query = "SELECT r FROM RegF600 r WHERE r.vlRetCofins = :vlRetCofins"),
    @NamedQuery(name = "RegF600.findByIndDec", query = "SELECT r FROM RegF600 r WHERE r.indDec = :indDec")})
@Registros(nivel = 3)
public class RegF600 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegF010 idPai;

    @Override
    public RegF010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegF010) idPai;
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_NAT_RET")
    private String indNatRet;

    public String getIndNatRet() {
        return this.indNatRet;
    }

    public void setIndNatRet(String indNatRet) {
        this.indNatRet = indNatRet;
    }

    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_RET")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRet;

    public Date getDtRet() {
        return this.dtRet;
    }

    public void setDtRet(Date dtRet) {
        this.dtRet = dtRet;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_BC_RET", precision = 15, scale = 6)
    private BigDecimal vlBcRet;

    public BigDecimal getVlBcRet() {
        return this.vlBcRet;
    }

    public void setVlBcRet(BigDecimal vlBcRet) {
        this.vlBcRet = vlBcRet;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_RET", precision = 15, scale = 6)
    private BigDecimal vlRet;

    public BigDecimal getVlRet() {
        return this.vlRet;
    }

    public void setVlRet(BigDecimal vlRet) {
        this.vlRet = vlRet;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_REC")
    private String codRec;

    public String getCodRec() {
        return this.codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "IND_NAT_REC")
    private int indNatRec;

    public int getIndNatRec() {
        return this.indNatRec;
    }

    public void setIndNatRec(int indNatRec) {
        this.indNatRec = indNatRec;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "VL_RET_PIS", precision = 15, scale = 6)
    private BigDecimal vlRetPis;

    public BigDecimal getVlRetPis() {
        return this.vlRetPis;
    }

    public void setVlRetPis(BigDecimal vlRetPis) {
        this.vlRetPis = vlRetPis;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_RET_COFINS", precision = 15, scale = 6)
    private BigDecimal vlRetCofins;

    public BigDecimal getVlRetCofins() {
        return this.vlRetCofins;
    }

    public void setVlRetCofins(BigDecimal vlRetCofins) {
        this.vlRetCofins = vlRetCofins;
    }
    @Campos(posicao = 11, tipo = 'I')
    @Column(name = "IND_DEC")
    private int indDec;

    public int getIndDec() {
        return this.indDec;
    }

    public void setIndDec(int indDec) {
        this.indDec = indDec;
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
        final RegF600 other = (RegF600) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF600{" + "id=" + id + '}';
    }
}
