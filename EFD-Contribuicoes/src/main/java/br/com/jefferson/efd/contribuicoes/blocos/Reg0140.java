package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.ManyToOne;
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
@Table(name = "reg_0140")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0140.findAll", query = "SELECT r FROM Reg0140 r"),
    @NamedQuery(name = "Reg0140.findById", query = "SELECT r FROM Reg0140 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0140.findByIdPai", query = "SELECT r FROM Reg0140 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0140.findByLinha", query = "SELECT r FROM Reg0140 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0140.findByHashfile", query = "SELECT r FROM Reg0140 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0140.findByReg", query = "SELECT r FROM Reg0140 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0140.findByCodEst", query = "SELECT r FROM Reg0140 r WHERE r.codEst = :codEst"),
    @NamedQuery(name = "Reg0140.findByNome", query = "SELECT r FROM Reg0140 r WHERE r.nome = :nome"),
    @NamedQuery(name = "Reg0140.findByCnpj", query = "SELECT r FROM Reg0140 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "Reg0140.findByUf", query = "SELECT r FROM Reg0140 r WHERE r.uf = :uf"),
    @NamedQuery(name = "Reg0140.findByIe", query = "SELECT r FROM Reg0140 r WHERE r.ie = :ie"),
    @NamedQuery(name = "Reg0140.findByCodMun", query = "SELECT r FROM Reg0140 r WHERE r.codMun = :codMun"),
    @NamedQuery(name = "Reg0140.findByIm", query = "SELECT r FROM Reg0140 r WHERE r.im = :im"),
    @NamedQuery(name = "Reg0140.findBySuframa", query = "SELECT r FROM Reg0140 r WHERE r.suframa = :suframa")})
@Registros(nivel = 2)
public class Reg0140 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    @Override
    public Reg0001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0145 reg0145;

    public Reg0145 getReg0145() {
        return reg0145;
    }

    public void setReg0145(Reg0145 reg0145) {
        this.reg0145 = reg0145;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0150> reg0150;

    public List<Reg0150> getReg0150() {
        return reg0150;
    }

    public void setReg0150(List<Reg0150> reg0150) {
        this.reg0150 = reg0150;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0190> reg0190;

    public List<Reg0190> getReg0190() {
        return reg0190;
    }

    public void setReg0190(List<Reg0190> reg0190) {
        this.reg0190 = reg0190;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0200> reg0200;

    public List<Reg0200> getReg0200() {
        return reg0200;
    }

    public void setReg0200(List<Reg0200> reg0200) {
        this.reg0200 = reg0200;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0400> reg0400;

    public List<Reg0400> getReg0400() {
        return reg0400;
    }

    public void setReg0400(List<Reg0400> reg0400) {
        this.reg0400 = reg0400;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<Reg0450> reg0450;

    public List<Reg0450> getReg0450() {
        return reg0450;
    }

    public void setReg0450(List<Reg0450> reg0450) {
        this.reg0450 = reg0450;
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
    @Column(name = "COD_EST")
    private String codEst;

    public String getCodEst() {
        return this.codEst;
    }

    public void setCodEst(String codEst) {
        this.codEst = codEst;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "NOME")
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "UF")
    private String uf;

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "IE")
    private String ie;

    public String getIe() {
        return this.ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;

    public String getCodMun() {
        return this.codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "IM")
    private String im;

    public String getIm() {
        return this.im;
    }

    public void setIm(String im) {
        this.im = im;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "SUFRAMA")
    private String suframa;

    public String getSuframa() {
        return this.suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
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
        final Reg0140 other = (Reg0140) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0140{" + "id=" + id + '}';
    }
}
