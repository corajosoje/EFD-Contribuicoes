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
@Table(name = "reg_1800")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1800.findAll", query = "SELECT r FROM Reg1800 r"),
    @NamedQuery(name = "Reg1800.findById", query = "SELECT r FROM Reg1800 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1800.findByIdPai", query = "SELECT r FROM Reg1800 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1800.findByLinha", query = "SELECT r FROM Reg1800 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1800.findByHashfile", query = "SELECT r FROM Reg1800 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1800.findByReg", query = "SELECT r FROM Reg1800 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1800.findByIncImob", query = "SELECT r FROM Reg1800 r WHERE r.incImob = :incImob"),
    @NamedQuery(name = "Reg1800.findByRecRecebRet", query = "SELECT r FROM Reg1800 r WHERE r.recRecebRet = :recRecebRet"),
    @NamedQuery(name = "Reg1800.findByRecFinRet", query = "SELECT r FROM Reg1800 r WHERE r.recFinRet = :recFinRet"),
    @NamedQuery(name = "Reg1800.findByBcRet", query = "SELECT r FROM Reg1800 r WHERE r.bcRet = :bcRet"),
    @NamedQuery(name = "Reg1800.findByAliqRet", query = "SELECT r FROM Reg1800 r WHERE r.aliqRet = :aliqRet"),
    @NamedQuery(name = "Reg1800.findByVlRecUni", query = "SELECT r FROM Reg1800 r WHERE r.vlRecUni = :vlRecUni"),
    @NamedQuery(name = "Reg1800.findByDtRecUni", query = "SELECT r FROM Reg1800 r WHERE r.dtRecUni = :dtRecUni"),
    @NamedQuery(name = "Reg1800.findByCodRec", query = "SELECT r FROM Reg1800 r WHERE r.codRec = :codRec")})
@Registros(nivel = 2)
public class Reg1800 implements Serializable, BlocoSped {

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
    private List<Reg1809> reg1809;

    public List<Reg1809> getReg1809() {
        return reg1809;
    }

    public void setReg1809(List<Reg1809> reg1809) {
        this.reg1809 = reg1809;
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
    @Column(name = "INC_IMOB")
    private String incImob;

    public String getIncImob() {
        return this.incImob;
    }

    public void setIncImob(String incImob) {
        this.incImob = incImob;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "REC_RECEB_RET", precision = 15, scale = 6)
    private BigDecimal recRecebRet;

    public BigDecimal getRecRecebRet() {
        return this.recRecebRet;
    }

    public void setRecRecebRet(BigDecimal recRecebRet) {
        this.recRecebRet = recRecebRet;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "REC_FIN_RET", precision = 15, scale = 6)
    private BigDecimal recFinRet;

    public BigDecimal getRecFinRet() {
        return this.recFinRet;
    }

    public void setRecFinRet(BigDecimal recFinRet) {
        this.recFinRet = recFinRet;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "BC_RET", precision = 15, scale = 6)
    private BigDecimal bcRet;

    public BigDecimal getBcRet() {
        return this.bcRet;
    }

    public void setBcRet(BigDecimal bcRet) {
        this.bcRet = bcRet;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "ALIQ_RET", precision = 15, scale = 6)
    private BigDecimal aliqRet;

    public BigDecimal getAliqRet() {
        return this.aliqRet;
    }

    public void setAliqRet(BigDecimal aliqRet) {
        this.aliqRet = aliqRet;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_REC_UNI", precision = 15, scale = 6)
    private BigDecimal vlRecUni;

    public BigDecimal getVlRecUni() {
        return this.vlRecUni;
    }

    public void setVlRecUni(BigDecimal vlRecUni) {
        this.vlRecUni = vlRecUni;
    }
    @Campos(posicao = 8, tipo = 'D')
    @Column(name = "DT_REC_UNI")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRecUni;

    public Date getDtRecUni() {
        return this.dtRecUni;
    }

    public void setDtRecUni(Date dtRecUni) {
        this.dtRecUni = dtRecUni;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "COD_REC")
    private String codRec;

    public String getCodRec() {
        return this.codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
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
        final Reg1800 other = (Reg1800) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1800{" + "id=" + id + '}';
    }
}
