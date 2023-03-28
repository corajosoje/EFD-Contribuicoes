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
@Table(name = "reg_e116")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE116.findAll", query = "SELECT r FROM RegE116 r"),
    @NamedQuery(name = "RegE116.findById", query = "SELECT r FROM RegE116 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE116.findByIdPai", query = "SELECT r FROM RegE116 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE116.findByLinha", query = "SELECT r FROM RegE116 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE116.findByHashfile", query = "SELECT r FROM RegE116 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE116.findByReg", query = "SELECT r FROM RegE116 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE116.findByCodOr", query = "SELECT r FROM RegE116 r WHERE r.codOr = :codOr"),
    @NamedQuery(name = "RegE116.findByVlOr", query = "SELECT r FROM RegE116 r WHERE r.vlOr = :vlOr"),
    @NamedQuery(name = "RegE116.findByDtVcto", query = "SELECT r FROM RegE116 r WHERE r.dtVcto = :dtVcto"),
    @NamedQuery(name = "RegE116.findByCodRec", query = "SELECT r FROM RegE116 r WHERE r.codRec = :codRec"),
    @NamedQuery(name = "RegE116.findByNumProc", query = "SELECT r FROM RegE116 r WHERE r.numProc = :numProc"),
    @NamedQuery(name = "RegE116.findByIndProc", query = "SELECT r FROM RegE116 r WHERE r.indProc = :indProc"),
    @NamedQuery(name = "RegE116.findByProc", query = "SELECT r FROM RegE116 r WHERE r.proc = :proc"),
    @NamedQuery(name = "RegE116.findByTxtCompl", query = "SELECT r FROM RegE116 r WHERE r.txtCompl = :txtCompl"),
    @NamedQuery(name = "RegE116.findByMesRef", query = "SELECT r FROM RegE116 r WHERE r.mesRef = :mesRef")})
@Registros(nivel = 4)
public class RegE116 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE110 idPai;

    public RegE110 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegE110) idPai;
    }

    public RegE116() {
    }

    public RegE116(String id) {
        this.id = id;
    }

    public RegE116(String id, RegE110 idPai, long linha, String hashfile) {
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
        if (!(object instanceof RegE116)) {
            return false;
        }
        RegE116 other = (RegE116) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE116[ id=" + id + " ]";
    }

}
