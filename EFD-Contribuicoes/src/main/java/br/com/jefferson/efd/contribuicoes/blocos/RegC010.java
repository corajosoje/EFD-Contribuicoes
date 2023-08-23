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
@Table(name = "reg_c010")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC010.findAll", query = "SELECT r FROM RegC010 r"),
    @NamedQuery(name = "RegC010.findById", query = "SELECT r FROM RegC010 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC010.findByIdPai", query = "SELECT r FROM RegC010 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC010.findByLinha", query = "SELECT r FROM RegC010 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC010.findByHashfile", query = "SELECT r FROM RegC010 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC010.findByReg", query = "SELECT r FROM RegC010 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC010.findByCnpj", query = "SELECT r FROM RegC010 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "RegC010.findByIndEscri", query = "SELECT r FROM RegC010 r WHERE r.indEscri = :indEscri")})
@Registros(nivel = 2)
public class RegC010 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC001 idPai;

    @Override
    public RegC001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegC001) idPai;
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
    private List<RegC100> regC100;

    public List<RegC100> getRegC100() {
        return regC100;
    }

    public void setRegC100(List<RegC100> regC100) {
        this.regC100 = regC100;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC180> regC180;

    public List<RegC180> getRegC180() {
        return regC180;
    }

    public void setRegC180(List<RegC180> regC180) {
        this.regC180 = regC180;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC190> regC190;

    public List<RegC190> getRegC190() {
        return regC190;
    }

    public void setRegC190(List<RegC190> regC190) {
        this.regC190 = regC190;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC380> regC380;

    public List<RegC380> getRegC380() {
        return regC380;
    }

    public void setRegC380(List<RegC380> regC380) {
        this.regC380 = regC380;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC395> regC395;

    public List<RegC395> getRegC395() {
        return regC395;
    }

    public void setRegC395(List<RegC395> regC395) {
        this.regC395 = regC395;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC400> regC400;

    public List<RegC400> getRegC400() {
        return regC400;
    }

    public void setRegC400(List<RegC400> regC400) {
        this.regC400 = regC400;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC490> regC490;

    public List<RegC490> getRegC490() {
        return regC490;
    }

    public void setRegC490(List<RegC490> regC490) {
        this.regC490 = regC490;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC500> regC500;

    public List<RegC500> getRegC500() {
        return regC500;
    }

    public void setRegC500(List<RegC500> regC500) {
        this.regC500 = regC500;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC600> regC600;

    public List<RegC600> getRegC600() {
        return regC600;
    }

    public void setRegC600(List<RegC600> regC600) {
        this.regC600 = regC600;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC860> regC860;

    public List<RegC860> getRegC860() {
        return regC860;
    }

    public void setRegC860(List<RegC860> regC860) {
        this.regC860 = regC860;
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
    @Column(name = "IND_ESCRI")
    private String indEscri;

    public String getIndEscri() {
        return this.indEscri;
    }

    public void setIndEscri(String indEscri) {
        this.indEscri = indEscri;
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
        final RegC010 other = (RegC010) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegC010{" + "id=" + id + '}';
    }
}
