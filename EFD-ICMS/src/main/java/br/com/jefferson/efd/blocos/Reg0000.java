package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import br.com.jefferson.efd.interfaces.BlocoSped;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_0000")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0000.findAll", query = "SELECT r FROM Reg0000 r"),
    @NamedQuery(name = "Reg0000.findByLinha", query = "SELECT r FROM Reg0000 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0000.findByHashfile", query = "SELECT r FROM Reg0000 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0000.findByReg", query = "SELECT r FROM Reg0000 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0000.findByCodVer", query = "SELECT r FROM Reg0000 r WHERE r.codVer = :codVer"),
    @NamedQuery(name = "Reg0000.findByCodFin", query = "SELECT r FROM Reg0000 r WHERE r.codFin = :codFin"),
    @NamedQuery(name = "Reg0000.findByDtIni", query = "SELECT r FROM Reg0000 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "Reg0000.findByDtFin", query = "SELECT r FROM Reg0000 r WHERE r.dtFin = :dtFin"),
    @NamedQuery(name = "Reg0000.findByNome", query = "SELECT r FROM Reg0000 r WHERE r.nome = :nome"),
    @NamedQuery(name = "Reg0000.findByCnpj", query = "SELECT r FROM Reg0000 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "Reg0000.findByCpf", query = "SELECT r FROM Reg0000 r WHERE r.cpf = :cpf"),
    @NamedQuery(name = "Reg0000.findByUf", query = "SELECT r FROM Reg0000 r WHERE r.uf = :uf"),
    @NamedQuery(name = "Reg0000.findByIe", query = "SELECT r FROM Reg0000 r WHERE r.ie = :ie"),
    @NamedQuery(name = "Reg0000.findByCodMun", query = "SELECT r FROM Reg0000 r WHERE r.codMun = :codMun"),
    @NamedQuery(name = "Reg0000.findByIm", query = "SELECT r FROM Reg0000 r WHERE r.im = :im"),
    @NamedQuery(name = "Reg0000.findBySuframa", query = "SELECT r FROM Reg0000 r WHERE r.suframa = :suframa"),
    @NamedQuery(name = "Reg0000.findByIndPerfil", query = "SELECT r FROM Reg0000 r WHERE r.indPerfil = :indPerfil"),
    @NamedQuery(name = "Reg0000.findByIndAtiv", query = "SELECT r FROM Reg0000 r WHERE r.indAtiv = :indAtiv")})
@Registros(nivel = 0)
public class Reg0000 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

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
    @Column(name = "COD_VER")
    private String codVer;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_FIN")
    private String codFin;
    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    private Date dtIni;
    @Campos(posicao = 5, tipo = 'D')
    @Column(name = "DT_FIN")
    @Temporal(TemporalType.DATE)
    private Date dtFin;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "NOME")
    private String nome;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "CPF")
    private String cpf;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "UF")
    private String uf;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "IE")
    private String ie;
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_MUN")
    private String codMun;
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "IM")
    private String im;
    @Campos(posicao = 13, tipo = 'C')
    @Column(name = "SUFRAMA")
    private String suframa;
    @Campos(posicao = 14, tipo = 'C')
    @Column(name = "IND_PERFIL")
    private String indPerfil;
    @Campos(posicao = 15, tipo = 'I')
    @Column(name = "IND_ATIV")
    private int indAtiv;

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
    private RegB001 regB001;

    public RegB001 getRegB001() {
        return regB001;
    }

    public void setRegB001(RegB001 regB001) {
        this.regB001 = regB001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegB990 regB990;

    public RegB990 getRegB990() {
        return regB990;
    }

    public void setRegB990(RegB990 regB990) {
        this.regB990 = regB990;
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
    private RegE001 regE001;

    public RegE001 getRegE001() {
        return regE001;
    }

    public void setRegE001(RegE001 regE001) {
        this.regE001 = regE001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegE990 regE990;

    public RegE990 getRegE990() {
        return regE990;
    }

    public void setRegE990(RegE990 regE990) {
        this.regE990 = regE990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegG001 regG001;

    public RegG001 getRegG001() {
        return regG001;
    }

    public void setRegG001(RegG001 regG001) {
        this.regG001 = regG001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegG990 regG990;

    public RegG990 getRegG990() {
        return regG990;
    }

    public void setRegG990(RegG990 regG990) {
        this.regG990 = regG990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegH001 regH001;

    public RegH001 getRegH001() {
        return regH001;
    }

    public void setRegH001(RegH001 regH001) {
        this.regH001 = regH001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegH990 regH990;

    public RegH990 getRegH990() {
        return regH990;
    }

    public void setRegH990(RegH990 regH990) {
        this.regH990 = regH990;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegK001 regK001;

    public RegK001 getRegK001() {
        return regK001;
    }

    public void setRegK001(RegK001 regK001) {
        this.regK001 = regK001;
    }
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private RegK990 regK990;

    public RegK990 getRegK990() {
        return regK990;
    }

    public void setRegK990(RegK990 regK990) {
        this.regK990 = regK990;
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

    public Reg0000() {
    }

    public Reg0000(String hashfile) {
        this.hashfile = hashfile;
    }

    public Reg0000(long idPai, String hashfile) {

        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + 1;
    }

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

    public String getCodVer() {
        return codVer;
    }

    public void setCodVer(String codVer) {
        this.codVer = codVer;
    }

    public String getCodFin() {
        return codFin;
    }

    public void setCodFin(String codFin) {
        this.codFin = codFin;
    }

    public Date getDtIni() {
        return dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    public Date getDtFin() {
        return dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getIndPerfil() {
        return indPerfil;
    }

    public void setIndPerfil(String indPerfil) {
        this.indPerfil = indPerfil;
    }

    public int getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(int indAtiv) {
        this.indAtiv = indAtiv;
    }

    @Override
    public int hashCode() {
        int hashfile = 3;
        hashfile = 43 * hashfile + Objects.hashCode(this.hashfile);
        return hashfile;
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
        return Objects.equals(this.hashfile, other.hashfile);
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0000[ hashfile=" + hashfile + " ]";
    }

    @Override
    public BlocoSped getIdPai() {
        return null;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
    }

}
