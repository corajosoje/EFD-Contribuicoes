package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_e250")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE250.findAll", query = "SELECT r FROM RegE250 r"),
    @NamedQuery(name = "RegE250.findById", query = "SELECT r FROM RegE250 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE250.findByIdPai", query = "SELECT r FROM RegE250 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE250.findByLinha", query = "SELECT r FROM RegE250 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE250.findByHash", query = "SELECT r FROM RegE250 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegE250.findByReg", query = "SELECT r FROM RegE250 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE250.findByCodOr", query = "SELECT r FROM RegE250 r WHERE r.codOr = :codOr"),
    @NamedQuery(name = "RegE250.findByVlOr", query = "SELECT r FROM RegE250 r WHERE r.vlOr = :vlOr"),
    @NamedQuery(name = "RegE250.findByDtVcto", query = "SELECT r FROM RegE250 r WHERE r.dtVcto = :dtVcto"),
    @NamedQuery(name = "RegE250.findByCodRec", query = "SELECT r FROM RegE250 r WHERE r.codRec = :codRec"),
    @NamedQuery(name = "RegE250.findByNumProc", query = "SELECT r FROM RegE250 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "RegE250.findByIndProc", query = "SELECT r FROM RegE250 r WHERE r.indProc = :indProc"),
    @NamedQuery(name = "RegE250.findByProc", query = "SELECT r FROM RegE250 r WHERE r.proc = :proc"),
    @NamedQuery(name = "RegE250.findByTxtCompl", query = "SELECT r FROM RegE250 r WHERE r.txtCompl = :txtCompl"),
    @NamedQuery(name = "RegE250.findByMesRef", query = "SELECT r FROM RegE250 r WHERE r.mesRef = :mesRef")})
@Registros(nivel = 4)
public class RegE250 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE210 idPai;

    public RegE210 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE210) idPai;
    }

    public RegE250() {
    }

    public RegE250(Long id) {
        this.id = id;
    }

    public RegE250(Long id, RegE210 idPai, long linha, String hash) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hash = hash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_OR")
    private String codOr;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_OR")
    private BigDecimal vlOr;
    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_VCTO")
    @Temporal(TemporalType.DATE)
    private Date dtVcto;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_REC")
    private String codRec;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "NUM_PROC")
    private String numProc;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "IND_PROC")
    private String indProc;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "PROC")
    private String proc;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "TXT_COMPL")
    private String txtCompl;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "MES_REF")
    private String mesRef;

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getCodOr() {
        return codOr;
    }

    public void setCodOr(String codOr) {
        this.codOr = codOr;
    }

    public BigDecimal getVlOr() {
        return vlOr;
    }

    public void setVlOr(BigDecimal vlOr) {
        this.vlOr = vlOr;
    }

    public Date getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }

    public String getCodRec() {
        return codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIndProc() {
        return indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public String getMesRef() {
        return mesRef;
    }

    public void setMesRef(String mesRef) {
        this.mesRef = mesRef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegE250)) {
            return false;
        }
        RegE250 other = (RegE250) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE250[ id=" + id + " ]";
    }

}
