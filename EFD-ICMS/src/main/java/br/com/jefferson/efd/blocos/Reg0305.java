package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_0305")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0305.findAll", query = "SELECT r FROM Reg0305 r"),
    @NamedQuery(name = "Reg0305.findById", query = "SELECT r FROM Reg0305 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0305.findByIdPai", query = "SELECT r FROM Reg0305 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0305.findByLinha", query = "SELECT r FROM Reg0305 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0305.findByHash", query = "SELECT r FROM Reg0305 r WHERE r.hash = :hash"),
    @NamedQuery(name = "Reg0305.findByReg", query = "SELECT r FROM Reg0305 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0305.findByCodCcus", query = "SELECT r FROM Reg0305 r WHERE r.codCcus = :codCcus"),
    @NamedQuery(name = "Reg0305.findByFunc", query = "SELECT r FROM Reg0305 r WHERE r.func = :func"),
    @NamedQuery(name = "Reg0305.findByVidaUtil", query = "SELECT r FROM Reg0305 r WHERE r.vidaUtil = :vidaUtil")})
@Registros(nivel = 3)
public class Reg0305 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0300 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;

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

    public Reg0305(Long id) {
        this.id = id;
    }

    public Reg0305(Long id, Reg0300 idPai, long linha, String hash) {
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

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
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
