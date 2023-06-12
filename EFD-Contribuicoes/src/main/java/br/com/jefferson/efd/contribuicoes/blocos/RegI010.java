package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_i010")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegI010.findAll", query = "SELECT r FROM RegI010 r"),
    @NamedQuery(name = "RegI010.findById", query = "SELECT r FROM RegI010 r WHERE r.id = :id"),
    @NamedQuery(name = "RegI010.findByIdPai", query = "SELECT r FROM RegI010 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegI010.findByLinha", query = "SELECT r FROM RegI010 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegI010.findByHashfile", query = "SELECT r FROM RegI010 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegI010.findByReg", query = "SELECT r FROM RegI010 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegI010.findByCnpj", query = "SELECT r FROM RegI010 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "RegI010.findByIndAtiv", query = "SELECT r FROM RegI010 r WHERE r.indAtiv = :indAtiv"),
    @NamedQuery(name = "RegI010.findByInfoCompl", query = "SELECT r FROM RegI010 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 2)
public class RegI010 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegI001 idPai;

    @Override
    public RegI001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegI001) idPai;
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
    private List<RegI100> regI100;

    public List<RegI100> getRegI100() {
        return regI100;
    }

    public void setRegI100(List<RegI100> regI100) {
        this.regI100 = regI100;
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
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_ATIV")
    private String indAtiv;

    public String getIndAtiv() {
        return this.indAtiv;
    }

    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
    }

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "INFO_COMPL")
    private String infoCompl;

    public String getInfoCompl() {
        return this.infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
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
        final RegI010 other = (RegI010) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegI010{" + "id=" + id + '}';
    }
}
