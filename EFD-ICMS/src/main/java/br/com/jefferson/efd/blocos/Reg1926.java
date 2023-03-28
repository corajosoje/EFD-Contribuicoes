package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
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
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_1926")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1926.findAll", query = "SELECT r FROM Reg1926 r"),
    @NamedQuery(name = "Reg1926.findById", query = "SELECT r FROM Reg1926 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1926.findByIdPai", query = "SELECT r FROM Reg1926 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1926.findByLinha", query = "SELECT r FROM Reg1926 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1926.findByHashfile", query = "SELECT r FROM Reg1926 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1926.findByReg", query = "SELECT r FROM Reg1926 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1926.findByCodOr", query = "SELECT r FROM Reg1926 r WHERE r.codOr = :codOr"),
    @NamedQuery(name = "Reg1926.findByVlOr", query = "SELECT r FROM Reg1926 r WHERE r.vlOr = :vlOr"),
    @NamedQuery(name = "Reg1926.findByDtVcto", query = "SELECT r FROM Reg1926 r WHERE r.dtVcto = :dtVcto"),
    @NamedQuery(name = "Reg1926.findByCodRec", query = "SELECT r FROM Reg1926 r WHERE r.codRec = :codRec"),
    @NamedQuery(name = "Reg1926.findByNumProc", query = "SELECT r FROM Reg1926 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "Reg1926.findByIndProc", query = "SELECT r FROM Reg1926 r WHERE r.indProc = :indProc"),
    @NamedQuery(name = "Reg1926.findByProce", query = "SELECT r FROM Reg1926 r WHERE r.proce = :proce"),
    @NamedQuery(name = "Reg1926.findByTxtCompl", query = "SELECT r FROM Reg1926 r WHERE r.txtCompl = :txtCompl"),
    @NamedQuery(name = "Reg1926.findByMesRef", query = "SELECT r FROM Reg1926 r WHERE r.mesRef = :mesRef")})
@Registros(nivel = 5)
public class Reg1926 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1920 idPai;

    public Reg1920 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg1920) idPai;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_OR")
    private String codOr;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_OR", precision = 15, scale = 6)
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
    @Column(name = "PROCE")
    private String proce;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "TXT_COMPL")
    private String txtCompl;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "MES_REF")
    private String mesRef;

    public Reg1926() {
    }

    public Reg1926(String id) {
        this.id = id;
    }

    public Reg1926(String id, Reg1920 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHashfile() {
        return hashfile;
    }

    public void setHash(String hashfile) {
        this.hashfile = hashfile;
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

    public String getProce() {
        return proce;
    }

    public void setProce(String proce) {
        this.proce = proce;
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
        int hashfile = 0;
        hashfile += (id != null ? id.hashCode() : 0);
        return hashfile;
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
