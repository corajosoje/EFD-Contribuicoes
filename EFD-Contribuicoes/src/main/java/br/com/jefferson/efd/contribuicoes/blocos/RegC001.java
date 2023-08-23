package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC001.findAll", query = "SELECT r FROM RegC001 r"),
    @NamedQuery(name = "RegC001.findById", query = "SELECT r FROM RegC001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC001.findByIdPai", query = "SELECT r FROM RegC001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC001.findByLinha", query = "SELECT r FROM RegC001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC001.findByHashfile", query = "SELECT r FROM RegC001 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC001.findByReg", query = "SELECT r FROM RegC001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC001.findByIndMov", query = "SELECT r FROM RegC001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class RegC001 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0000 idPai;

    @Override
    public Reg0000 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0000) idPai;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @PrePersist
    @Override
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Override
    public long getLinha() {
        return this.linha;
    }

    @Override
    public void setLinha(long linha) {
        this.linha = linha;
    }
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Override
    public String getHashfile() {
        return this.hashfile;
    }

    @Override
    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC010> regC010;

    public List<RegC010> getRegC010() {
        return regC010;
    }

    public void setRegC010(List<RegC010> regC010) {
        this.regC010 = regC010;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Override
    public String getReg() {
        return this.reg;
    }

    @Override
    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_MOV")
    private String indMov;

    public String getIndMov() {
        return this.indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegC001 other = (RegC001) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC001{" + "id=" + id + '}';
    }
}
