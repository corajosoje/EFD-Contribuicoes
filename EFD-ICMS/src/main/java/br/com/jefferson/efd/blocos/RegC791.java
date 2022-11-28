package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_c791")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC791.findAll", query = "SELECT r FROM RegC791 r"),
    @NamedQuery(name = "RegC791.findById", query = "SELECT r FROM RegC791 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC791.findByIdPai", query = "SELECT r FROM RegC791 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC791.findByLinha", query = "SELECT r FROM RegC791 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC791.findByHash", query = "SELECT r FROM RegC791 r WHERE r.hash = :hash"),
    @NamedQuery(name = "RegC791.findByReg", query = "SELECT r FROM RegC791 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC791.findByUf", query = "SELECT r FROM RegC791 r WHERE r.uf = :uf"),
    @NamedQuery(name = "RegC791.findByVlBcIcmsSt", query = "SELECT r FROM RegC791 r WHERE r.vlBcIcmsSt = :vlBcIcmsSt"),
    @NamedQuery(name = "RegC791.findByVlIcmsSt", query = "SELECT r FROM RegC791 r WHERE r.vlIcmsSt = :vlIcmsSt")})
@Registros(nivel = 4)
public class RegC791 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC790 idPai;

    public RegC790 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC790) idPai;
    }

    public RegC791() {
    }

    public RegC791(Long id) {
        this.id = id;
    }

    public RegC791(Long id, RegC790 idPai, long linha, String hash) {
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
    @Column(name = "UF")
    private String uf;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_BC_ICMS_ST")
    private BigDecimal vlBcIcmsSt;
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_ICMS_ST")
    private BigDecimal vlIcmsSt;

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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
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
        if (!(object instanceof RegC791)) {
            return false;
        }
        RegC791 other = (RegC791) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC791[ id=" + id + " ]";
    }

}
