package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.exceptions.BlocoException;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_0000")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0000.findAll", query = "SELECT r FROM Reg0000 r"),
    @NamedQuery(name = "Reg0000.findById", query = "SELECT r FROM Reg0000 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0000.findByLinha", query = "SELECT r FROM Reg0000 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0000.findByHashfile", query = "SELECT r FROM Reg0000 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0000.findByReg", query = "SELECT r FROM Reg0000 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0000.findByCodVer", query = "SELECT r FROM Reg0000 r WHERE r.codVer = :codVer"),
    @NamedQuery(name = "Reg0000.findByTipoEscrit", query = "SELECT r FROM Reg0000 r WHERE r.tipoEscrit = :tipoEscrit"),
    @NamedQuery(name = "Reg0000.findByIndSitEsp", query = "SELECT r FROM Reg0000 r WHERE r.indSitEsp = :indSitEsp"),
    @NamedQuery(name = "Reg0000.findByNumRecAnterior", query = "SELECT r FROM Reg0000 r WHERE r.numRecAnterior = :numRecAnterior"),
    @NamedQuery(name = "Reg0000.findByDtIni", query = "SELECT r FROM Reg0000 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "Reg0000.findByDtFin", query = "SELECT r FROM Reg0000 r WHERE r.dtFin = :dtFin"),
    @NamedQuery(name = "Reg0000.findByNome", query = "SELECT r FROM Reg0000 r WHERE r.nome = :nome"),
    @NamedQuery(name = "Reg0000.findByCnpj", query = "SELECT r FROM Reg0000 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "Reg0000.findByUf", query = "SELECT r FROM Reg0000 r WHERE r.uf = :uf"),
    @NamedQuery(name = "Reg0000.findByCodMun", query = "SELECT r FROM Reg0000 r WHERE r.codMun = :codMun"),
    @NamedQuery(name = "Reg0000.findBySuframa", query = "SELECT r FROM Reg0000 r WHERE r.suframa = :suframa"),
    @NamedQuery(name = "Reg0000.findByIndNatPj", query = "SELECT r FROM Reg0000 r WHERE r.indNatPj = :indNatPj"),
    @NamedQuery(name = "Reg0000.findByIndAtiv", query = "SELECT r FROM Reg0000 r WHERE r.indAtiv = :indAtiv")})
@Registros(nivel = 0)
public class Reg0000 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @Override
    public void setIdPai(BlocoSped idPai) {
        throw new BlocoException("Bloco não tem ID PAI");
    }

    @Override
    public BlocoSped getIdPai() {
        throw new BlocoException("Bloco não tem ID PAI");
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
    private Reg0001 reg0001;

    public Reg0001 getReg0001() {
        return reg0001;
    }

    public void setReg0001(Reg0001 reg0001) {
        this.reg0001 = reg0001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0990 reg0990;

    public Reg0990 getReg0990() {
        return reg0990;
    }

    public void setReg0990(Reg0990 reg0990) {
        this.reg0990 = reg0990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1001 reg1001;

    public Reg1001 getReg1001() {
        return reg1001;
    }

    public void setReg1001(Reg1001 reg1001) {
        this.reg1001 = reg1001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg1990 reg1990;

    public Reg1990 getReg1990() {
        return reg1990;
    }

    public void setReg1990(Reg1990 reg1990) {
        this.reg1990 = reg1990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg9001 reg9001;

    public Reg9001 getReg9001() {
        return reg9001;
    }

    public void setReg9001(Reg9001 reg9001) {
        this.reg9001 = reg9001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg9990 reg9990;

    public Reg9990 getReg9990() {
        return reg9990;
    }

    public void setReg9990(Reg9990 reg9990) {
        this.reg9990 = reg9990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegA001 regA001;

    public RegA001 getRegA001() {
        return regA001;
    }

    public void setRegA001(RegA001 regA001) {
        this.regA001 = regA001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegA990 regA990;

    public RegA990 getRegA990() {
        return regA990;
    }

    public void setRegA990(RegA990 regA990) {
        this.regA990 = regA990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC001 regC001;

    public RegC001 getRegC001() {
        return regC001;
    }

    public void setRegC001(RegC001 regC001) {
        this.regC001 = regC001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegC990 regC990;

    public RegC990 getRegC990() {
        return regC990;
    }

    public void setRegC990(RegC990 regC990) {
        this.regC990 = regC990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegD001 regD001;

    public RegD001 getRegD001() {
        return regD001;
    }

    public void setRegD001(RegD001 regD001) {
        this.regD001 = regD001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegD990 regD990;

    public RegD990 getRegD990() {
        return regD990;
    }

    public void setRegD990(RegD990 regD990) {
        this.regD990 = regD990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegF001 regF001;

    public RegF001 getRegF001() {
        return regF001;
    }

    public void setRegF001(RegF001 regF001) {
        this.regF001 = regF001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegF990 regF990;

    public RegF990 getRegF990() {
        return regF990;
    }

    public void setRegF990(RegF990 regF990) {
        this.regF990 = regF990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegI001 regI001;

    public RegI001 getRegI001() {
        return regI001;
    }

    public void setRegI001(RegI001 regI001) {
        this.regI001 = regI001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegI990 regI990;

    public RegI990 getRegI990() {
        return regI990;
    }

    public void setRegI990(RegI990 regI990) {
        this.regI990 = regI990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegM001 regM001;

    public RegM001 getRegM001() {
        return regM001;
    }

    public void setRegM001(RegM001 regM001) {
        this.regM001 = regM001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegM990 regM990;

    public RegM990 getRegM990() {
        return regM990;
    }

    public void setRegM990(RegM990 regM990) {
        this.regM990 = regM990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegP001 regP001;

    public RegP001 getRegP001() {
        return regP001;
    }

    public void setRegP001(RegP001 regP001) {
        this.regP001 = regP001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegP990 regP990;

    public RegP990 getRegP990() {
        return regP990;
    }

    public void setRegP990(RegP990 regP990) {
        this.regP990 = regP990;
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
    @Column(name = "COD_VER")
    private String codVer;

    public String getCodVer() {
        return this.codVer;
    }

    public void setCodVer(String codVer) {
        this.codVer = codVer;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "TIPO_ESCRIT")
    private String tipoEscrit;

    public String getTipoEscrit() {
        return this.tipoEscrit;
    }

    public void setTipoEscrit(String tipoEscrit) {
        this.tipoEscrit = tipoEscrit;
    }

    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "IND_SIT_ESP")
    private int indSitEsp;

    public int getIndSitEsp() {
        return this.indSitEsp;
    }

    public void setIndSitEsp(int indSitEsp) {
        this.indSitEsp = indSitEsp;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "NUM_REC_ANTERIOR")
    private String numRecAnterior;

    public String getNumRecAnterior() {
        return this.numRecAnterior;
    }

    public void setNumRecAnterior(String numRecAnterior) {
        this.numRecAnterior = numRecAnterior;
    }
    @Campos(posicao = 6, tipo = 'D')
    @Column(name = "DT_INI")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtIni;

    public Date getDtIni() {
        return this.dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }
    @Campos(posicao = 7, tipo = 'D')
    @Column(name = "DT_FIN")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtFin;

    public Date getDtFin() {
        return this.dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }

    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "NOME")
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "UF")
    private String uf;

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;

    public String getCodMun() {
        return this.codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "SUFRAMA")
    private String suframa;

    public String getSuframa() {
        return this.suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "IND_NAT_PJ")
    private String indNatPj;

    public String getIndNatPj() {
        return this.indNatPj;
    }

    public void setIndNatPj(String indNatPj) {
        this.indNatPj = indNatPj;
    }

    @Campos(posicao = 14, tipo = 'I')
    @Column(name = "IND_ATIV")
    private int indAtiv;

    public int getIndAtiv() {
        return this.indAtiv;
    }

    public void setIndAtiv(int indAtiv) {
        this.indAtiv = indAtiv;
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
        final Reg0000 other = (Reg0000) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0000{" + "id=" + id + '}';
    }

}
