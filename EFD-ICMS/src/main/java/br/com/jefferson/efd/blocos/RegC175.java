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
@Table(name = "reg_c175")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC175.findAll", query = "SELECT r FROM RegC175 r"),
    @NamedQuery(name = "RegC175.findById", query = "SELECT r FROM RegC175 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC175.findByIdPai", query = "SELECT r FROM RegC175 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC175.findByLinha", query = "SELECT r FROM RegC175 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC175.findByHashfile", query = "SELECT r FROM RegC175 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC175.findByReg", query = "SELECT r FROM RegC175 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC175.findByIndVeicOper", query = "SELECT r FROM RegC175 r WHERE r.indVeicOper = :indVeicOper"),
    @NamedQuery(name = "RegC175.findByCnpj", query = "SELECT r FROM RegC175 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "RegC175.findByUf", query = "SELECT r FROM RegC175 r WHERE r.uf = :uf"),
    @NamedQuery(name = "RegC175.findByChassiVeic", query = "SELECT r FROM RegC175 r WHERE r.chassiVeic = :chassiVeic")})
@Registros(nivel = 4)
public class RegC175 implements Serializable {

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

    public RegC175() {
    }

    public RegC175(String id) {
        this.id = id;
    }

    public RegC175(String id, RegC170 idPai, long linha, String hashfile) {
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
    @Column(name = "IND_VEIC_OPER")
    private String indVeicOper;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "UF")
    private String uf;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CHASSI_VEIC")
    private String chassiVeic;

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

    public String getIndVeicOper() {
        return indVeicOper;
    }

    public void setIndVeicOper(String indVeicOper) {
        this.indVeicOper = indVeicOper;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getChassiVeic() {
        return chassiVeic;
    }

    public void setChassiVeic(String chassiVeic) {
        this.chassiVeic = chassiVeic;
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
        if (!(object instanceof RegC175)) {
            return false;
        }
        RegC175 other = (RegC175) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC175[ id=" + id + " ]";
    }

}
