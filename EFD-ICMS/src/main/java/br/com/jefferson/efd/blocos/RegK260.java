package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_k260")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegK260.findAll", query = "SELECT r FROM RegK260 r"),
    @NamedQuery(name = "RegK260.findById", query = "SELECT r FROM RegK260 r WHERE r.id = :id"),
    @NamedQuery(name = "RegK260.findByIdPai", query = "SELECT r FROM RegK260 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegK260.findByLinha", query = "SELECT r FROM RegK260 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegK260.findByHashfile", query = "SELECT r FROM RegK260 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegK260.findByReg", query = "SELECT r FROM RegK260 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegK260.findByCodOpOs", query = "SELECT r FROM RegK260 r WHERE r.codOpOs = :codOpOs"),
    @NamedQuery(name = "RegK260.findByCodItem", query = "SELECT r FROM RegK260 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegK260.findByDtSaida", query = "SELECT r FROM RegK260 r WHERE r.dtSaida = :dtSaida"),
    @NamedQuery(name = "RegK260.findByQtdSaida", query = "SELECT r FROM RegK260 r WHERE r.qtdSaida = :qtdSaida"),
    @NamedQuery(name = "RegK260.findByDtRet", query = "SELECT r FROM RegK260 r WHERE r.dtRet = :dtRet"),
    @NamedQuery(name = "RegK260.findByQtdRet", query = "SELECT r FROM RegK260 r WHERE r.qtdRet = :qtdRet")})
@Registros(nivel = 3)
public class RegK260 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegK100 idPai;

    public RegK100 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegK100) idPai;
    }

    public RegK260() {
    }

    public RegK260(Long id) {
        this.id = id;
    }

    public RegK260(Long id, RegK100 idPai, long linha, String hashfile) {
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
    private List<RegK265> regK265;

    public List<RegK265> getRegK265() {
        return regK265;
    }

    public void setRegK265(List<RegK265> regK265) {
        this.regK265 = regK265;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_OP_OS")
    private String codOpOs;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_ITEM")
    private String codItem;
    @Campos(posicao = 4, tipo = 'D')
    @Column(name = "DT_SAIDA")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "QTD_SAIDA", precision = 15, scale = 6)
    private BigDecimal qtdSaida;
    @Campos(posicao = 6, tipo = 'D')
    @Column(name = "DT_RET")
    @Temporal(TemporalType.DATE)
    private Date dtRet;
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "QTD_RET", precision = 15, scale = 6)
    private BigDecimal qtdRet;

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

    public String getCodOpOs() {
        return codOpOs;
    }

    public void setCodOpOs(String codOpOs) {
        this.codOpOs = codOpOs;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public BigDecimal getQtdSaida() {
        return qtdSaida;
    }

    public void setQtdSaida(BigDecimal qtdSaida) {
        this.qtdSaida = qtdSaida;
    }

    public Date getDtRet() {
        return dtRet;
    }

    public void setDtRet(Date dtRet) {
        this.dtRet = dtRet;
    }

    public BigDecimal getQtdRet() {
        return qtdRet;
    }

    public void setQtdRet(BigDecimal qtdRet) {
        this.qtdRet = qtdRet;
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
        if (!(object instanceof RegK260)) {
            return false;
        }
        RegK260 other = (RegK260) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegK260[ id=" + id + " ]";
    }

}
