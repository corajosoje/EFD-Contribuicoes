package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_e530")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegE530.findAll", query = "SELECT r FROM RegE530 r"),
    @NamedQuery(name = "RegE530.findById", query = "SELECT r FROM RegE530 r WHERE r.id = :id"),
    @NamedQuery(name = "RegE530.findByIdPai", query = "SELECT r FROM RegE530 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegE530.findByLinha", query = "SELECT r FROM RegE530 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegE530.findByHashfile", query = "SELECT r FROM RegE530 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegE530.findByReg", query = "SELECT r FROM RegE530 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegE530.findByIndAj", query = "SELECT r FROM RegE530 r WHERE r.indAj = :indAj"),
    @NamedQuery(name = "RegE530.findByVlAj", query = "SELECT r FROM RegE530 r WHERE r.vlAj = :vlAj"),
    @NamedQuery(name = "RegE530.findByCodAj", query = "SELECT r FROM RegE530 r WHERE r.codAj = :codAj"),
    @NamedQuery(name = "RegE530.findByIndDoc", query = "SELECT r FROM RegE530 r WHERE r.indDoc = :indDoc"),
    @NamedQuery(name = "RegE530.findByNumDoc", query = "SELECT r FROM RegE530 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegE530.findByDescrAj", query = "SELECT r FROM RegE530 r WHERE r.descrAj = :descrAj")})
@Registros(nivel = 4)
public class RegE530 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegE520 idPai;

    public RegE520 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegE520) idPai;
    }

    public RegE530() {
    }

    public RegE530(Long id) {
        this.id = id;
    }

    public RegE530(Long id, RegE520 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegE531> regE531;

    public List<RegE531> getRegE531() {
        return regE531;
    }

    public void setRegE531(List<RegE531> regE531) {
        this.regE531 = regE531;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "IND_AJ")
    private String indAj;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_AJ", precision = 15, scale = 6)
    private BigDecimal vlAj;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_AJ")
    private String codAj;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "IND_DOC")
    private String indDoc;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "DESCR_AJ")
    private String descrAj;

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

    public String getIndAj() {
        return indAj;
    }

    public void setIndAj(String indAj) {
        this.indAj = indAj;
    }

    public BigDecimal getVlAj() {
        return vlAj;
    }

    public void setVlAj(BigDecimal vlAj) {
        this.vlAj = vlAj;
    }

    public String getCodAj() {
        return codAj;
    }

    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }

    public String getIndDoc() {
        return indDoc;
    }

    public void setIndDoc(String indDoc) {
        this.indDoc = indDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getDescrAj() {
        return descrAj;
    }

    public void setDescrAj(String descrAj) {
        this.descrAj = descrAj;
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
        if (!(object instanceof RegE530)) {
            return false;
        }
        RegE530 other = (RegE530) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegE530[ id=" + id + " ]";
    }

}
