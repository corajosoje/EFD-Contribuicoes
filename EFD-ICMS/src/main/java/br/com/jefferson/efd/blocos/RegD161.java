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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_d161")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegD161.findAll", query = "SELECT r FROM RegD161 r"),
    @NamedQuery(name = "RegD161.findById", query = "SELECT r FROM RegD161 r WHERE r.id = :id"),
    @NamedQuery(name = "RegD161.findByIdPai", query = "SELECT r FROM RegD161 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegD161.findByLinha", query = "SELECT r FROM RegD161 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegD161.findByHashfile", query = "SELECT r FROM RegD161 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegD161.findByReg", query = "SELECT r FROM RegD161 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegD161.findByIndCarga", query = "SELECT r FROM RegD161 r WHERE r.indCarga = :indCarga"),
    @NamedQuery(name = "RegD161.findByCnpjCpfCol", query = "SELECT r FROM RegD161 r WHERE r.cnpjCpfCol = :cnpjCpfCol"),
    @NamedQuery(name = "RegD161.findByIeCol", query = "SELECT r FROM RegD161 r WHERE r.ieCol = :ieCol"),
    @NamedQuery(name = "RegD161.findByCodMunCol", query = "SELECT r FROM RegD161 r WHERE r.codMunCol = :codMunCol"),
    @NamedQuery(name = "RegD161.findByCnpjCpfEntg", query = "SELECT r FROM RegD161 r WHERE r.cnpjCpfEntg = :cnpjCpfEntg"),
    @NamedQuery(name = "RegD161.findByIeEntg", query = "SELECT r FROM RegD161 r WHERE r.ieEntg = :ieEntg"),
    @NamedQuery(name = "RegD161.findByCodMunEntg", query = "SELECT r FROM RegD161 r WHERE r.codMunEntg = :codMunEntg")})
@Registros(nivel = 4)
public class RegD161 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegD160 idPai;

    public RegD160 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegD160) idPai;
    }

    public RegD161() {
    }

    public RegD161(String id) {
        this.id = id;
    }

    public RegD161(String id, RegD160 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "IND_CARGA")
    private int indCarga;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CNPJ_CPF_COL")
    private String cnpjCpfCol;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "IE_COL")
    private String ieCol;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MUN_COL")
    private String codMunCol;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "CNPJ_CPF_ENTG")
    private String cnpjCpfEntg;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "IE_ENTG")
    private String ieEntg;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_MUN_ENTG")
    private String codMunEntg;

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

    public int getIndCarga() {
        return indCarga;
    }

    public void setIndCarga(int indCarga) {
        this.indCarga = indCarga;
    }

    public String getCnpjCpfCol() {
        return cnpjCpfCol;
    }

    public void setCnpjCpfCol(String cnpjCpfCol) {
        this.cnpjCpfCol = cnpjCpfCol;
    }

    public String getIeCol() {
        return ieCol;
    }

    public void setIeCol(String ieCol) {
        this.ieCol = ieCol;
    }

    public String getCodMunCol() {
        return codMunCol;
    }

    public void setCodMunCol(String codMunCol) {
        this.codMunCol = codMunCol;
    }

    public String getCnpjCpfEntg() {
        return cnpjCpfEntg;
    }

    public void setCnpjCpfEntg(String cnpjCpfEntg) {
        this.cnpjCpfEntg = cnpjCpfEntg;
    }

    public String getIeEntg() {
        return ieEntg;
    }

    public void setIeEntg(String ieEntg) {
        this.ieEntg = ieEntg;
    }

    public String getCodMunEntg() {
        return codMunEntg;
    }

    public void setCodMunEntg(String codMunEntg) {
        this.codMunEntg = codMunEntg;
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
        if (!(object instanceof RegD161)) {
            return false;
        }
        RegD161 other = (RegD161) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegD161[ id=" + id + " ]";
    }

}
