package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
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
    @NamedQuery(name = "Reg0000.findByHash", query = "SELECT r FROM Reg0000 r WHERE r.hash = :hash"),
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
public class Reg0000 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Id
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;

    @Column(name = "REG")
    @Campos(posicao = 1, tipo = 'C')
    private String reg;

    @Column(name = "COD_VER")
    @Campos(posicao = 2, tipo = 'C')
    private String codVer;

    @Column(name = "COD_FIN")
    @Campos(posicao = 3, tipo = 'C')
    private String codFin;

    @Column(name = "DT_INI")
    @Temporal(TemporalType.DATE)
    @Campos(posicao = 4, tipo = 'D')
    private Date dtIni;

    @Column(name = "DT_FIN")
    @Temporal(TemporalType.DATE)
    @Campos(posicao = 5, tipo = 'D')
    private Date dtFin;

    @Column(name = "NOME")
    @Campos(posicao = 6, tipo = 'C')
    private String nome;

    @Column(name = "CNPJ")
    @Campos(posicao = 7, tipo = 'C')
    private String cnpj;

    @Column(name = "CPF")
    @Campos(posicao = 8, tipo = 'C')
    private String cpf;

    @Column(name = "UF")
    @Campos(posicao = 9, tipo = 'C')
    private String uf;

    @Column(name = "IE")
    @Campos(posicao = 10, tipo = 'C')
    private String ie;

    @Column(name = "COD_MUN")
    @Campos(posicao = 11, tipo = 'C')
    private String codMun;

    @Column(name = "IM")
    @Campos(posicao = 12, tipo = 'C')
    private String im;

    @Column(name = "SUFRAMA")
    @Campos(posicao = 13, tipo = 'C')
    private String suframa;

    @Column(name = "IND_PERFIL")
    @Campos(posicao = 14, tipo = 'C')
    private String indPerfil;

    @Campos(posicao = 15, tipo = 'C')
    @Column(name = "IND_ATIV")
    private String indAtiv;

    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0001 reg0001;

    public Reg0000() {
    }

    public Reg0000(String hash) {
        this.hash = hash;
    }

    public Reg0000(long idPai, String hash) {

        this.linha = linha;
        this.hash = hash;
    }

    public long getLinha() {
        return linha;
    }

    public void setLinha(long linha) {
        this.linha = linha;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
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

    public String getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
    }

    public Reg0001 getReg0001() {
        return reg0001;
    }

    public void setReg0001(Reg0001 reg0001) {
        this.reg0001 = reg0001;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.hash);
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
        return Objects.equals(this.hash, other.hash);
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0000[ hash=" + hash + " ]";
    }

}
