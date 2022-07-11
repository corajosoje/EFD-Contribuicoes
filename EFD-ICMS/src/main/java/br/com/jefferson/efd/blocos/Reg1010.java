
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
@Table(name = "reg_1010")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1010.findAll", query = "SELECT r FROM Reg1010 r"),
    @NamedQuery(name = "Reg1010.findById", query = "SELECT r FROM Reg1010 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1010.findByIdPai", query = "SELECT r FROM Reg1010 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1010.findByLinha", query = "SELECT r FROM Reg1010 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1010.findByHash", query = "SELECT r FROM Reg1010 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg1010.findByReg", query = "SELECT r FROM Reg1010 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1010.findByIndExp", query = "SELECT r FROM Reg1010 r WHERE r.indExp = :indExp"),
    @NamedQuery(name = "Reg1010.findByIndCcrf", query = "SELECT r FROM Reg1010 r WHERE r.indCcrf = :indCcrf"),
    @NamedQuery(name = "Reg1010.findByIndComb", query = "SELECT r FROM Reg1010 r WHERE r.indComb = :indComb"),
    @NamedQuery(name = "Reg1010.findByIndUsina", query = "SELECT r FROM Reg1010 r WHERE r.indUsina = :indUsina"),
    @NamedQuery(name = "Reg1010.findByIndVa", query = "SELECT r FROM Reg1010 r WHERE r.indVa = :indVa"),
    @NamedQuery(name = "Reg1010.findByIndEe", query = "SELECT r FROM Reg1010 r WHERE r.indEe = :indEe"),
    @NamedQuery(name = "Reg1010.findByIndCart", query = "SELECT r FROM Reg1010 r WHERE r.indCart = :indCart"),
    @NamedQuery(name = "Reg1010.findByIndForm", query = "SELECT r FROM Reg1010 r WHERE r.indForm = :indForm"),
    @NamedQuery(name = "Reg1010.findByIndAer", query = "SELECT r FROM Reg1010 r WHERE r.indAer = :indAer"),
    @NamedQuery(name = "Reg1010.findByIndGiaf1", query = "SELECT r FROM Reg1010 r WHERE r.indGiaf1 = :indGiaf1"),
    @NamedQuery(name = "Reg1010.findByIndGiaf3", query = "SELECT r FROM Reg1010 r WHERE r.indGiaf3 = :indGiaf3"),
    @NamedQuery(name = "Reg1010.findByIndGiaf4", query = "SELECT r FROM Reg1010 r WHERE r.indGiaf4 = :indGiaf4"),
    @NamedQuery(name = "Reg1010.findByIndRestRessarcComplIcms", query = "SELECT r FROM Reg1010 r WHERE r.indRestRessarcComplIcms = :indRestRessarcComplIcms")})
public class Reg1010 implements Serializable {

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
    @Column(name = "IND_EXP")
    private String indExp;
    @Column(name = "IND_CCRF")
    private String indCcrf;
    @Column(name = "IND_COMB")
    private String indComb;
    @Column(name = "IND_USINA")
    private String indUsina;
    @Column(name = "IND_VA")
    private String indVa;
    @Column(name = "IND_EE")
    private String indEe;
    @Column(name = "IND_CART")
    private String indCart;
    @Column(name = "IND_FORM")
    private String indForm;
    @Column(name = "IND_AER")
    private String indAer;
    @Column(name = "IND_GIAF1")
    private String indGiaf1;
    @Column(name = "IND_GIAF3")
    private String indGiaf3;
    @Column(name = "IND_GIAF4")
    private String indGiaf4;
    @Column(name = "IND_REST_RESSARC_COMPL_ICMS")
    private String indRestRessarcComplIcms;

    public Reg1010() {
    }

    public Reg1010(Long id) {
        this.id = id;
    }

    public Reg1010(Long id, long idPai, long linha, long hash) {
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

    public String getIndExp() {
        return indExp;
    }

    public void setIndExp(String indExp) {
        this.indExp = indExp;
    }

    public String getIndCcrf() {
        return indCcrf;
    }

    public void setIndCcrf(String indCcrf) {
        this.indCcrf = indCcrf;
    }

    public String getIndComb() {
        return indComb;
    }

    public void setIndComb(String indComb) {
        this.indComb = indComb;
    }

    public String getIndUsina() {
        return indUsina;
    }

    public void setIndUsina(String indUsina) {
        this.indUsina = indUsina;
    }

    public String getIndVa() {
        return indVa;
    }

    public void setIndVa(String indVa) {
        this.indVa = indVa;
    }

    public String getIndEe() {
        return indEe;
    }

    public void setIndEe(String indEe) {
        this.indEe = indEe;
    }

    public String getIndCart() {
        return indCart;
    }

    public void setIndCart(String indCart) {
        this.indCart = indCart;
    }

    public String getIndForm() {
        return indForm;
    }

    public void setIndForm(String indForm) {
        this.indForm = indForm;
    }

    public String getIndAer() {
        return indAer;
    }

    public void setIndAer(String indAer) {
        this.indAer = indAer;
    }

    public String getIndGiaf1() {
        return indGiaf1;
    }

    public void setIndGiaf1(String indGiaf1) {
        this.indGiaf1 = indGiaf1;
    }

    public String getIndGiaf3() {
        return indGiaf3;
    }

    public void setIndGiaf3(String indGiaf3) {
        this.indGiaf3 = indGiaf3;
    }

    public String getIndGiaf4() {
        return indGiaf4;
    }

    public void setIndGiaf4(String indGiaf4) {
        this.indGiaf4 = indGiaf4;
    }

    public String getIndRestRessarcComplIcms() {
        return indRestRessarcComplIcms;
    }

    public void setIndRestRessarcComplIcms(String indRestRessarcComplIcms) {
        this.indRestRessarcComplIcms = indRestRessarcComplIcms;
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
        if (!(object instanceof Reg1010)) {
            return false;
        }
        Reg1010 other = (Reg1010) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1010[ id=" + id + " ]";
    }

}
