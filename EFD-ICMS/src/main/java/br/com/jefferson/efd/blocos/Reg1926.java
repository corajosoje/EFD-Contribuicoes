
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "reg_1926")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1926.findAll", query = "SELECT r FROM Reg1926 r"),
    @NamedQuery(name = "Reg1926.findById", query = "SELECT r FROM Reg1926 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1926.findByIdPai", query = "SELECT r FROM Reg1926 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1926.findByLinha", query = "SELECT r FROM Reg1926 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1926.findByHash", query = "SELECT r FROM Reg1926 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1926.findByReg", query = "SELECT r FROM Reg1926 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1926.findByCodOr", query = "SELECT r FROM Reg1926 r WHERE r.codOr = :codOr"),
    @NamedQuery(name = "Reg1926.findByVlOr", query = "SELECT r FROM Reg1926 r WHERE r.vlOr = :vlOr"),
    @NamedQuery(name = "Reg1926.findByDtVcto", query = "SELECT r FROM Reg1926 r WHERE r.dtVcto = :dtVcto"),
    @NamedQuery(name = "Reg1926.findByCodRec", query = "SELECT r FROM Reg1926 r WHERE r.codRec = :codRec"),
    @NamedQuery(name = "Reg1926.findByNumProc", query = "SELECT r FROM Reg1926 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "Reg1926.findByIndProc", query = "SELECT r FROM Reg1926 r WHERE r.indProc = :indProc"),
    @NamedQuery(name = "Reg1926.findByProc", query = "SELECT r FROM Reg1926 r WHERE r.proc = :proc"),
    @NamedQuery(name = "Reg1926.findByTxtCompl", query = "SELECT r FROM Reg1926 r WHERE r.txtCompl = :txtCompl"),
    @NamedQuery(name = "Reg1926.findByMesRef", query = "SELECT r FROM Reg1926 r WHERE r.mesRef = :mesRef")})
public class Reg1926 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_PAI")
    private long idPai;
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private long hash;
    @Column(name = "REG")
    private String reg;
    @Column(name = "COD_OR")
    private String codOr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_OR")
    private BigDecimal vlOr;
    @Column(name = "DT_VCTO")
    @Temporal(TemporalType.DATE)
    private Date dtVcto;
    @Column(name = "COD_REC")
    private String codRec;
    @Column(name = "NUM_PROC")
    private String numProc;
    @Column(name = "IND_PROC")
    private String indProc;
    @Column(name = "PROC")
    private String proc;
    @Column(name = "TXT_COMPL")
    private String txtCompl;
    @Column(name = "MES_REF")
    private String mesRef;

    public Reg1926() {
    }

    public Reg1926(Long id) {
        this.id = id;
    }

    public Reg1926(Long id, long idPai, long linha, long hash) {
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

    public long getIdPai() {
        return idPai;
    }

    public void setIdPai(long idPai) {
        this.idPai = idPai;
    }

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
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
        if (!(object instanceof Reg1926)) {
            return false;
        }
        Reg1926 other = (Reg1926) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1926[ id=" + id + " ]";
    }

}
