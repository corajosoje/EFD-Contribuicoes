package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c174")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC174.findAll", query = "SELECT r FROM RegC174 r"),
    @NamedQuery(name = "RegC174.findById", query = "SELECT r FROM RegC174 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC174.findByIdPai", query = "SELECT r FROM RegC174 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC174.findByLinha", query = "SELECT r FROM RegC174 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC174.findByHashfile", query = "SELECT r FROM RegC174 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC174.findByReg", query = "SELECT r FROM RegC174 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC174.findByIndArm", query = "SELECT r FROM RegC174 r WHERE r.indArm = :indArm"),
    @NamedQuery(name = "RegC174.findByNumArm", query = "SELECT r FROM RegC174 r WHERE r.numArm = :numArm"),
    @NamedQuery(name = "RegC174.findByDescrCompl", query = "SELECT r FROM RegC174 r WHERE r.descrCompl = :descrCompl")})
@Registros(nivel = 4)
public class RegC174 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC170 idPai;

    public RegC170 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC170) idPai;
    }

    public RegC174() {
    }

    public RegC174(String id) {
        this.id = id;
    }

    public RegC174(String id, RegC170 idPai, long linha, String hashfile) {
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
    @Column(name = "IND_ARM")
    private String indArm;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NUM_ARM")
    private String numArm;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "DESCR_COMPL")
    private String descrCompl;

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

    public String getIndArm() {
        return indArm;
    }

    public void setIndArm(String indArm) {
        this.indArm = indArm;
    }

    public String getNumArm() {
        return numArm;
    }

    public void setNumArm(String numArm) {
        this.numArm = numArm;
    }

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
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
        if (!(object instanceof RegC174)) {
            return false;
        }
        RegC174 other = (RegC174) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC174[ id=" + id + " ]";
    }

}
