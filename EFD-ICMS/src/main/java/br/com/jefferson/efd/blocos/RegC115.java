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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_c115")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC115.findAll", query = "SELECT r FROM RegC115 r"),
    @NamedQuery(name = "RegC115.findById", query = "SELECT r FROM RegC115 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC115.findByIdPai", query = "SELECT r FROM RegC115 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC115.findByLinha", query = "SELECT r FROM RegC115 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC115.findByHashfile", query = "SELECT r FROM RegC115 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC115.findByReg", query = "SELECT r FROM RegC115 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC115.findByIndCarga", query = "SELECT r FROM RegC115 r WHERE r.indCarga = :indCarga"),
    @NamedQuery(name = "RegC115.findByCnpjCol", query = "SELECT r FROM RegC115 r WHERE r.cnpjCol = :cnpjCol"),
    @NamedQuery(name = "RegC115.findByIeCol", query = "SELECT r FROM RegC115 r WHERE r.ieCol = :ieCol"),
    @NamedQuery(name = "RegC115.findByCpfCol", query = "SELECT r FROM RegC115 r WHERE r.cpfCol = :cpfCol"),
    @NamedQuery(name = "RegC115.findByCodMunCol", query = "SELECT r FROM RegC115 r WHERE r.codMunCol = :codMunCol"),
    @NamedQuery(name = "RegC115.findByCnpjEntg", query = "SELECT r FROM RegC115 r WHERE r.cnpjEntg = :cnpjEntg"),
    @NamedQuery(name = "RegC115.findByIeEntg", query = "SELECT r FROM RegC115 r WHERE r.ieEntg = :ieEntg"),
    @NamedQuery(name = "RegC115.findByCpfEntg", query = "SELECT r FROM RegC115 r WHERE r.cpfEntg = :cpfEntg"),
    @NamedQuery(name = "RegC115.findByCodMunEntg", query = "SELECT r FROM RegC115 r WHERE r.codMunEntg = :codMunEntg")})
@Registros(nivel = 4)
public class RegC115 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC110 idPai;

    public RegC110 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC110) idPai;
    }

    public RegC115() {
    }

    public RegC115(String id) {
        this.id = id;
    }

    public RegC115(String id, RegC110 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_CARGA")
    private String indCarga;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "CNPJ_COL")
    private String cnpjCol;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "IE_COL")
    private String ieCol;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "CPF_COL")
    private String cpfCol;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_MUN_COL")
    private String codMunCol;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CNPJ_ENTG")
    private String cnpjEntg;
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "IE_ENTG")
    private String ieEntg;
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CPF_ENTG")
    private String cpf­Entg;
    @Campos(posicao = 10, tipo = 'C')
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

    public String getIndCarga() {
        return indCarga;
    }

    public void setIndCarga(String indCarga) {
        this.indCarga = indCarga;
    }

    public String getCnpjCol() {
        return cnpjCol;
    }

    public void setCnpjCol(String cnpjCol) {
        this.cnpjCol = cnpjCol;
    }

    public String getIeCol() {
        return ieCol;
    }

    public void setIeCol(String ieCol) {
        this.ieCol = ieCol;
    }

    public String getCpfCol() {
        return cpfCol;
    }

    public void setCpfCol(String cpfCol) {
        this.cpfCol = cpfCol;
    }

    public String getCodMunCol() {
        return codMunCol;
    }

    public void setCodMunCol(String codMunCol) {
        this.codMunCol = codMunCol;
    }

    public String getCnpjEntg() {
        return cnpjEntg;
    }

    public void setCnpjEntg(String cnpjEntg) {
        this.cnpjEntg = cnpjEntg;
    }

    public String getIeEntg() {
        return ieEntg;
    }

    public void setIeEntg(String ieEntg) {
        this.ieEntg = ieEntg;
    }

    public String getCpfEntg() {
        return cpfEntg;
    }

    public void setCpfEntg(String cpfEntg) {
        this.cpfEntg = cpfEntg;
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
        if (!(object instanceof RegC115)) {
            return false;
        }
        RegC115 other = (RegC115) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC115[ id=" + id + " ]";
    }

}
