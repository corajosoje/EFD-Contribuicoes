package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
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
@Table(name = "reg_c195")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC195.findAll", query = "SELECT r FROM RegC195 r"),
    @NamedQuery(name = "RegC195.findById", query = "SELECT r FROM RegC195 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC195.findByIdPai", query = "SELECT r FROM RegC195 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC195.findByLinha", query = "SELECT r FROM RegC195 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC195.findByHashfile", query = "SELECT r FROM RegC195 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC195.findByReg", query = "SELECT r FROM RegC195 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC195.findByCodObs", query = "SELECT r FROM RegC195 r WHERE r.codObs = :codObs"),
    @NamedQuery(name = "RegC195.findByTxtCompl", query = "SELECT r FROM RegC195 r WHERE r.txtCompl = :txtCompl")})
@Registros(nivel = 3)
public class RegC195 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC100 idPai;

    public RegC100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC100) idPai;
    }

    public RegC195() {
    }

    public RegC195(Long id) {
        this.id = id;
    }

    public RegC195(Long id, RegC100 idPai, long linha, String hashfile) {
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
    private List<RegC197> regC197;

    public List<RegC197> getRegC197() {
        return regC197;
    }

    public void setRegC197(List<RegC197> regC197) {
        this.regC197 = regC197;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_OBS")
    private String codObs;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "TXT_COMPL")
    private String txtCompl;

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

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
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
        if (!(object instanceof RegC195)) {
            return false;
        }
        RegC195 other = (RegC195) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC195[ id=" + id + " ]";
    }

}
