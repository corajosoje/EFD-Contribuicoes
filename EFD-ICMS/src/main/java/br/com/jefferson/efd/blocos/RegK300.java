package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_k300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK300.findAll", query = "SELECT r FROM RegK300 r"),
    @NamedQuery(name = "RegK300.findById", query = "SELECT r FROM RegK300 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK300.findByIdPai", query = "SELECT r FROM RegK300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK300.findByLinha", query = "SELECT r FROM RegK300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK300.findByHashfile", query = "SELECT r FROM RegK300 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK300.findByReg", query = "SELECT r FROM RegK300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK300.findByDtProd", query = "SELECT r FROM RegK300 r WHERE r.dtProd = :dtProd")})
@Registros(nivel = 3)
public class RegK300 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK100 idPai;

    public RegK100 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegK100) idPai;
    }

    public RegK300() {
    }

    public RegK300(String id) {
        this.id = id;
    }

    public RegK300(String id, RegK100 idPai, long linha, String hashfile) {
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK301> regK301;

    public List<RegK301> getRegK301() {
        return regK301;
    }

    public void setRegK301(List<RegK301> regK301) {
        this.regK301 = regK301;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegK302> regK302;

    public List<RegK302> getRegK302() {
        return regK302;
    }

    public void setRegK302(List<RegK302> regK302) {
        this.regK302 = regK302;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_PROD")
    @Temporal(TemporalType.DATE)
    private Date dtProd;

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

    public Date getDtProd() {
        return dtProd;
    }

    public void setDtProd(Date dtProd) {
        this.dtProd = dtProd;
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
        if (!(object instanceof RegK300)) {
            return false;
        }
        RegK300 other = (RegK300) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK300[ id=" + id + " ]";
    }

}
