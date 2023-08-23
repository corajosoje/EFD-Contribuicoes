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
@Table(name = "reg_p001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegP001.findAll", query = "SELECT r FROM RegP001 r"),
    @NamedQuery(name = "RegP001.findById", query = "SELECT r FROM RegP001 r WHERE r.id = :id"),
    @NamedQuery(name = "RegP001.findByIdPai", query = "SELECT r FROM RegP001 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegP001.findByLinha", query = "SELECT r FROM RegP001 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegP001.findByHashfile", query = "SELECT r FROM RegP001 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegP001.findByReg", query = "SELECT r FROM RegP001 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegP001.findByIndMov", query = "SELECT r FROM RegP001 r WHERE r.indMov = :indMov")})
@Registros(nivel = 1)
public class RegP001 implements Serializable, BlocoSped {

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
    private List<RegP010> regP010;

    public List<RegP010> getRegP010() {
        return regP010;
    }

    public void setRegP010(List<RegP010> regP010) {
        this.regP010 = regP010;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegP200> regP200;

    public List<RegP200> getRegP200() {
        return regP200;
    }

    public void setRegP200(List<RegP200> regP200) {
        this.regP200 = regP200;
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
        final RegP001 other = (RegP001) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegP001{" + "id=" + id + '}';
    }
}
