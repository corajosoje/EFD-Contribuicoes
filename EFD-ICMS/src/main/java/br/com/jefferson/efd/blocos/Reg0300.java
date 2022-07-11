
package br.com.jefferson.efd.blocos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_0300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0300.findAll", query = "SELECT r FROM Reg0300 r"),
    @NamedQuery(name = "Reg0300.findById", query = "SELECT r FROM Reg0300 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0300.findByIdPai", query = "SELECT r FROM Reg0300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0300.findByLinha", query = "SELECT r FROM Reg0300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0300.findByHash", query = "SELECT r FROM Reg0300 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0300.findByReg", query = "SELECT r FROM Reg0300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0300.findByCodIndBem", query = "SELECT r FROM Reg0300 r WHERE r.codIndBem = :codIndBem"),
    @NamedQuery(name = "Reg0300.findByIdentMerc", query = "SELECT r FROM Reg0300 r WHERE r.identMerc = :identMerc"),
    @NamedQuery(name = "Reg0300.findByDescrItem", query = "SELECT r FROM Reg0300 r WHERE r.descrItem = :descrItem"),
    @NamedQuery(name = "Reg0300.findByCodPrnc", query = "SELECT r FROM Reg0300 r WHERE r.codPrnc = :codPrnc"),
    @NamedQuery(name = "Reg0300.findByCodCta", query = "SELECT r FROM Reg0300 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "Reg0300.findByNrParc", query = "SELECT r FROM Reg0300 r WHERE r.nrParc = :nrParc")})
public class Reg0300 implements Serializable {

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
    @Column(name = "COD_IND_BEM")
    private String codIndBem;
    @Column(name = "IDENT_MERC")
    private String identMerc;
    @Column(name = "DESCR_ITEM")
    private String descrItem;
    @Column(name = "COD_PRNC")
    private String codPrnc;
    @Column(name = "COD_CTA")
    private String codCta;
    @Column(name = "NR_PARC")
    private String nrParc;

    public Reg0300() {
    }

    public Reg0300(Long id) {
        this.id = id;
    }

    public Reg0300(Long id, long idPai, long linha, long hash) {
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

    public String getCodIndBem() {
        return codIndBem;
    }

    public void setCodIndBem(String codIndBem) {
        this.codIndBem = codIndBem;
    }

    public String getIdentMerc() {
        return identMerc;
    }

    public void setIdentMerc(String identMerc) {
        this.identMerc = identMerc;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public String getCodPrnc() {
        return codPrnc;
    }

    public void setCodPrnc(String codPrnc) {
        this.codPrnc = codPrnc;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getNrParc() {
        return nrParc;
    }

    public void setNrParc(String nrParc) {
        this.nrParc = nrParc;
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
        if (!(object instanceof Reg0300)) {
            return false;
        }
        Reg0300 other = (Reg0300) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0300[ id=" + id + " ]";
    }

}
