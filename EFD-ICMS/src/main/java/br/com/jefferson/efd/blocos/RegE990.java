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
@Table(name = "reg_e990")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE990.findAll", query = "SELECT r FROM RegE990 r"),
    @NamedQuery(name = "RegE990.findById", query = "SELECT r FROM RegE990 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE990.findByIdPai", query = "SELECT r FROM RegE990 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE990.findByLinha", query = "SELECT r FROM RegE990 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE990.findByHashfile", query = "SELECT r FROM RegE990 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE990.findByReg", query = "SELECT r FROM RegE990 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE990.findByQtdLinE", query = "SELECT r FROM RegE990 r WHERE r.qtdLinE = :qtdLinE")})
@Registros(nivel = 1)
public class RegE990 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0000 idPai;

    public Reg0000 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg0000) idPai;
    }

    public RegE990() {
    }

    public RegE990(String id) {
        this.id = id;
    }

    public RegE990(String id, Reg0000 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "QTD_LIN_E")
    private int qtdLinE;

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

    public int getQtdLinE() {
        return qtdLinE;
    }

    public void setQtdLinE(int qtdLinE) {
        this.qtdLinE = qtdLinE;
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
        if (!(object instanceof RegE990)) {
            return false;
        }
        RegE990 other = (RegE990) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE990[ id=" + id + " ]";
    }

}
