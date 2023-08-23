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
@Table(name = "reg_f010")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF010.findAll", query = "SELECT r FROM RegF010 r"),
    @NamedQuery(name = "RegF010.findById", query = "SELECT r FROM RegF010 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF010.findByIdPai", query = "SELECT r FROM RegF010 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF010.findByLinha", query = "SELECT r FROM RegF010 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF010.findByHashfile", query = "SELECT r FROM RegF010 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF010.findByReg", query = "SELECT r FROM RegF010 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF010.findByCnpj", query = "SELECT r FROM RegF010 r WHERE r.cnpj = :cnpj")})
@Registros(nivel = 2)
public class RegF010 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegF001 idPai;

    @Override
    public RegF001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegF001) idPai;
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
    private List<RegF100> regF100;

    public List<RegF100> getRegF100() {
        return regF100;
    }

    public void setRegF100(List<RegF100> regF100) {
        this.regF100 = regF100;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF120> regF120;

    public List<RegF120> getRegF120() {
        return regF120;
    }

    public void setRegF120(List<RegF120> regF120) {
        this.regF120 = regF120;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF130> regF130;

    public List<RegF130> getRegF130() {
        return regF130;
    }

    public void setRegF130(List<RegF130> regF130) {
        this.regF130 = regF130;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF150> regF150;

    public List<RegF150> getRegF150() {
        return regF150;
    }

    public void setRegF150(List<RegF150> regF150) {
        this.regF150 = regF150;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF200> regF200;

    public List<RegF200> getRegF200() {
        return regF200;
    }

    public void setRegF200(List<RegF200> regF200) {
        this.regF200 = regF200;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF500> regF500;

    public List<RegF500> getRegF500() {
        return regF500;
    }

    public void setRegF500(List<RegF500> regF500) {
        this.regF500 = regF500;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF510> regF510;

    public List<RegF510> getRegF510() {
        return regF510;
    }

    public void setRegF510(List<RegF510> regF510) {
        this.regF510 = regF510;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF525> regF525;

    public List<RegF525> getRegF525() {
        return regF525;
    }

    public void setRegF525(List<RegF525> regF525) {
        this.regF525 = regF525;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF550> regF550;

    public List<RegF550> getRegF550() {
        return regF550;
    }

    public void setRegF550(List<RegF550> regF550) {
        this.regF550 = regF550;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF560> regF560;

    public List<RegF560> getRegF560() {
        return regF560;
    }

    public void setRegF560(List<RegF560> regF560) {
        this.regF560 = regF560;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF600> regF600;

    public List<RegF600> getRegF600() {
        return regF600;
    }

    public void setRegF600(List<RegF600> regF600) {
        this.regF600 = regF600;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF700> regF700;

    public List<RegF700> getRegF700() {
        return regF700;
    }

    public void setRegF700(List<RegF700> regF700) {
        this.regF700 = regF700;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegF800> regF800;

    public List<RegF800> getRegF800() {
        return regF800;
    }

    public void setRegF800(List<RegF800> regF800) {
        this.regF800 = regF800;
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
        final RegF010 other = (RegF010) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF010{" + "id=" + id + '}';
    }
}
