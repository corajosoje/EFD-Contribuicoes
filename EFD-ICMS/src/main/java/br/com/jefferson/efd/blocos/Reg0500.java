
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
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
@Table(name = "reg_0500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0500.findAll", query = "SELECT r FROM Reg0500 r"),
    @NamedQuery(name = "Reg0500.findById", query = "SELECT r FROM Reg0500 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0500.findByIdPai", query = "SELECT r FROM Reg0500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0500.findByLinha", query = "SELECT r FROM Reg0500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0500.findByHash", query = "SELECT r FROM Reg0500 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0500.findByReg", query = "SELECT r FROM Reg0500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0500.findByDtAlt", query = "SELECT r FROM Reg0500 r WHERE r.dtAlt = :dtAlt"),
    @NamedQuery(name = "Reg0500.findByCodNatCc", query = "SELECT r FROM Reg0500 r WHERE r.codNatCc = :codNatCc"),
    @NamedQuery(name = "Reg0500.findByIndCta", query = "SELECT r FROM Reg0500 r WHERE r.indCta = :indCta"),
    @NamedQuery(name = "Reg0500.findByNivel", query = "SELECT r FROM Reg0500 r WHERE r.nivel = :nivel"),
    @NamedQuery(name = "Reg0500.findByCodCta", query = "SELECT r FROM Reg0500 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "Reg0500.findByNomeCta", query = "SELECT r FROM Reg0500 r WHERE r.nomeCta = :nomeCta")})
public class Reg0500 implements Serializable {

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
    @Column(name = "DT_ALT")
    @Temporal(TemporalType.DATE)
    private Date dtAlt;
    @Column(name = "COD_NAT_CC")
    private String codNatCc;
    @Column(name = "IND_CTA")
    private String indCta;
    @Column(name = "NIVEL")
    private String nivel;
    @Column(name = "COD_CTA")
    private String codCta;
    @Column(name = "NOME_CTA")
    private String nomeCta;

    public Reg0500() {
    }

    public Reg0500(Long id) {
        this.id = id;
    }

    public Reg0500(Long id, long idPai, long linha, long hash) {
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

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getCodNatCc() {
        return codNatCc;
    }

    public void setCodNatCc(String codNatCc) {
        this.codNatCc = codNatCc;
    }

    public String getIndCta() {
        return indCta;
    }

    public void setIndCta(String indCta) {
        this.indCta = indCta;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getNomeCta() {
        return nomeCta;
    }

    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
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
        if (!(object instanceof Reg0500)) {
            return false;
        }
        Reg0500 other = (Reg0500) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0500[ id=" + id + " ]";
    }

}
