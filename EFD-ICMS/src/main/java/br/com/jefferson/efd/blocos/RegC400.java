
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
@Table(name = "reg_c400")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC400.findAll", query = "SELECT r FROM RegC400 r"),
    @NamedQuery(name = "RegC400.findById", query = "SELECT r FROM RegC400 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC400.findByIdPai", query = "SELECT r FROM RegC400 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC400.findByLinha", query = "SELECT r FROM RegC400 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC400.findByHash", query = "SELECT r FROM RegC400 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC400.findByReg", query = "SELECT r FROM RegC400 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC400.findByCodMod", query = "SELECT r FROM RegC400 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC400.findByEcfMod", query = "SELECT r FROM RegC400 r WHERE r.ecfMod = :ecfMod"),
    @NamedQuery(name = "RegC400.findByEcfFab", query = "SELECT r FROM RegC400 r WHERE r.ecfFab = :ecfFab"),
    @NamedQuery(name = "RegC400.findByEcfCx", query = "SELECT r FROM RegC400 r WHERE r.ecfCx = :ecfCx")})
public class RegC400 implements Serializable {

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
    @Column(name = "COD_MOD")
    private String codMod;
    @Column(name = "ECF_MOD")
    private String ecfMod;
    @Column(name = "ECF_FAB")
    private String ecfFab;
    @Column(name = "ECF_CX")
    private String ecfCx;

    public RegC400() {
    }

    public RegC400(Long id) {
        this.id = id;
    }

    public RegC400(Long id, long idPai, long linha, long hash) {
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

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getEcfMod() {
        return ecfMod;
    }

    public void setEcfMod(String ecfMod) {
        this.ecfMod = ecfMod;
    }

    public String getEcfFab() {
        return ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }

    public String getEcfCx() {
        return ecfCx;
    }

    public void setEcfCx(String ecfCx) {
        this.ecfCx = ecfCx;
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
        if (!(object instanceof RegC400)) {
            return false;
        }
        RegC400 other = (RegC400) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC400[ id=" + id + " ]";
    }

}
