package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
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
@Table(name = "reg_c171")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC171.findAll", query = "SELECT r FROM RegC171 r"),
    @NamedQuery(name = "RegC171.findById", query = "SELECT r FROM RegC171 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC171.findByIdPai", query = "SELECT r FROM RegC171 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC171.findByLinha", query = "SELECT r FROM RegC171 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC171.findByHashfile", query = "SELECT r FROM RegC171 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC171.findByReg", query = "SELECT r FROM RegC171 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC171.findByNumTanque", query = "SELECT r FROM RegC171 r WHERE r.numTanque = :numTanque"),
    @NamedQuery(name = "RegC171.findByQtde", query = "SELECT r FROM RegC171 r WHERE r.qtde = :qtde")})
@Registros(nivel = 4)
public class RegC171 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC170 idPai;

    public RegC170 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC170) idPai;
    }

    public RegC171() {
    }

    public RegC171(Long id) {
        this.id = id;
    }

    public RegC171(Long id, RegC170 idPai, long linha, String hashfile) {
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
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "NUM_TANQUE")
    private String numTanque;
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "QTDE", precision = 15, scale = 6)
    private BigDecimal qtde;

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

    public String getNumTanque() {
        return numTanque;
    }

    public void setNumTanque(String numTanque) {
        this.numTanque = numTanque;
    }

    public BigDecimal getQtde() {
        return qtde;
    }

    public void setQtde(BigDecimal qtde) {
        this.qtde = qtde;
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
        if (!(object instanceof RegC171)) {
            return false;
        }
        RegC171 other = (RegC171) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC171[ id=" + id + " ]";
    }

}
