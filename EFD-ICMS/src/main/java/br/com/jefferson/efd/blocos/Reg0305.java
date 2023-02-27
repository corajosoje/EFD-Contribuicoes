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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_0305")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0305.findAll", query = "SELECT r FROM Reg0305 r"),
    @NamedQuery(name = "Reg0305.findById", query = "SELECT r FROM Reg0305 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0305.findByIdPai", query = "SELECT r FROM Reg0305 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0305.findByLinha", query = "SELECT r FROM Reg0305 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0305.findByHashfile", query = "SELECT r FROM Reg0305 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0305.findByReg", query = "SELECT r FROM Reg0305 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0305.findByCodCcus", query = "SELECT r FROM Reg0305 r WHERE r.codCcus = :codCcus"),
    @NamedQuery(name = "Reg0305.findByFunc", query = "SELECT r FROM Reg0305 r WHERE r.func = :func"),
    @NamedQuery(name = "Reg0305.findByVidaUtil", query = "SELECT r FROM Reg0305 r WHERE r.vidaUtil = :vidaUtil")})
@Registros(nivel = 3)
public class Reg0305 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0300 idPai;

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
    @Column(name = "COD_CCUS")
    private String codCcus;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "FUNC")
    private String func;

    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "VIDA_UTIL")
    private int vidaUtil;

    public Reg0305() {
    }

    public Reg0305(String id) {
        this.id = id;
    }

    public Reg0305(String id, Reg0300 idPai, long linha, String hashfile) {
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

    public Reg0300 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0300) idPai;
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

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
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
        if (!(object instanceof Reg0305)) {
            return false;
        }
        Reg0305 other = (Reg0305) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0305[ id=" + id + " ]";
    }

}
