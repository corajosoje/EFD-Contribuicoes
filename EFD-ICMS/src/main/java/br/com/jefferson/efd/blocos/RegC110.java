package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reg_c110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC110.findAll", query = "SELECT r FROM RegC110 r"),
    @NamedQuery(name = "RegC110.findById", query = "SELECT r FROM RegC110 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC110.findByIdPai", query = "SELECT r FROM RegC110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC110.findByLinha", query = "SELECT r FROM RegC110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC110.findByHash", query = "SELECT r FROM RegC110 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC110.findByReg", query = "SELECT r FROM RegC110 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC110.findByCodInf", query = "SELECT r FROM RegC110 r WHERE r.codInf = :codInf"),
    @NamedQuery(name = "RegC110.findByTxtCompl", query = "SELECT r FROM RegC110 r WHERE r.txtCompl = :txtCompl")})
@Registros(nivel = 3)
public class RegC110 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;
    @Basic(optional = false)
    @Column(name = "HASH")
    private String hash;
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_INF")
    private String codInf;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "TXT_COMPL")
    private String txtCompl;

    public RegC110() {
    }

    public RegC110(Long id) {
        this.id = id;
    }

    public RegC110(Long id, RegC100 idPai, long linha, String hash) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hash = hash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC111> regC111;

    public List<RegC111> getRegC111() {
        return regC111;
    }

    public void setRegC111(List<RegC111> regC111) {
        this.regC111 = regC111;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC112> regC112;

    public List<RegC112> getRegC112() {
        return regC112;
    }

    public void setRegC112(List<RegC112> regC112) {
        this.regC112 = regC112;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC113> regC113;

    public List<RegC113> getRegC113() {
        return regC113;
    }

    public void setRegC113(List<RegC113> regC113) {
        this.regC113 = regC113;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC114> regC114;

    public List<RegC114> getRegC114() {
        return regC114;
    }

    public void setRegC114(List<RegC114> regC114) {
        this.regC114 = regC114;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC115> regC115;

    public List<RegC115> getRegC115() {
        return regC115;
    }

    public void setRegC115(List<RegC115> regC115) {
        this.regC115 = regC115;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegC116> regC116;

    public List<RegC116> getRegC116() {
        return regC116;
    }

    public void setRegC116(List<RegC116> regC116) {
        this.regC116 = regC116;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegC110)) {
            return false;
        }
        RegC110 other = (RegC110) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC110[ id=" + id + " ]";
    }

}
