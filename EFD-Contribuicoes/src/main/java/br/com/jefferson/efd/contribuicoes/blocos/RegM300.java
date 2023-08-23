package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_m300")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM300.findAll", query = "SELECT r FROM RegM300 r"),
    @NamedQuery(name = "RegM300.findById", query = "SELECT r FROM RegM300 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM300.findByIdPai", query = "SELECT r FROM RegM300 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM300.findByLinha", query = "SELECT r FROM RegM300 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM300.findByHashfile", query = "SELECT r FROM RegM300 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM300.findByReg", query = "SELECT r FROM RegM300 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM300.findByCodCont", query = "SELECT r FROM RegM300 r WHERE r.codCont = :codCont"),
    @NamedQuery(name = "RegM300.findByVlContApurDifer", query = "SELECT r FROM RegM300 r WHERE r.vlContApurDifer = :vlContApurDifer"),
    @NamedQuery(name = "RegM300.findByNatCredDesc", query = "SELECT r FROM RegM300 r WHERE r.natCredDesc = :natCredDesc"),
    @NamedQuery(name = "RegM300.findByVlCredDescDifer", query = "SELECT r FROM RegM300 r WHERE r.vlCredDescDifer = :vlCredDescDifer"),
    @NamedQuery(name = "RegM300.findByVlContDiferAnt", query = "SELECT r FROM RegM300 r WHERE r.vlContDiferAnt = :vlContDiferAnt"),
    @NamedQuery(name = "RegM300.findByPerApur", query = "SELECT r FROM RegM300 r WHERE r.perApur = :perApur"),
    @NamedQuery(name = "RegM300.findByDtReceb", query = "SELECT r FROM RegM300 r WHERE r.dtReceb = :dtReceb")})
@Registros(nivel = 2)
public class RegM300 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM001 idPai;

    @Override
    public RegM001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM001) idPai;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @PrePersist
    @Override
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }
    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Override
    public long getLinha() {
        return this.linha;
    }

    @Override
    public void setLinha(long linha) {
        this.linha = linha;
    }
    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Override
    public String getHashfile() {
        return this.hashfile;
    }

    @Override
    public void setHash(String hashfile) {
        this.hashfile = hashfile;
    }
    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Override
    public String getReg() {
        return this.reg;
    }

    @Override
    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'C')
    @Column(name = "COD_CONT")
    private String codCont;

    public String getCodCont() {
        return this.codCont;
    }

    public void setCodCont(String codCont) {
        this.codCont = codCont;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_CONT_APUR_DIFER", precision = 15, scale = 6)
    private BigDecimal vlContApurDifer;

    public BigDecimal getVlContApurDifer() {
        return this.vlContApurDifer;
    }

    public void setVlContApurDifer(BigDecimal vlContApurDifer) {
        this.vlContApurDifer = vlContApurDifer;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "NAT_CRED_DESC")
    private String natCredDesc;

    public String getNatCredDesc() {
        return this.natCredDesc;
    }

    public void setNatCredDesc(String natCredDesc) {
        this.natCredDesc = natCredDesc;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_CRED_DESC_DIFER", precision = 15, scale = 6)
    private BigDecimal vlCredDescDifer;

    public BigDecimal getVlCredDescDifer() {
        return this.vlCredDescDifer;
    }

    public void setVlCredDescDifer(BigDecimal vlCredDescDifer) {
        this.vlCredDescDifer = vlCredDescDifer;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_CONT_DIFER_ANT", precision = 15, scale = 6)
    private BigDecimal vlContDiferAnt;

    public BigDecimal getVlContDiferAnt() {
        return this.vlContDiferAnt;
    }

    public void setVlContDiferAnt(BigDecimal vlContDiferAnt) {
        this.vlContDiferAnt = vlContDiferAnt;
    }
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "PER_APUR")
    private int perApur;

    public int getPerApur() {
        return this.perApur;
    }

    public void setPerApur(int perApur) {
        this.perApur = perApur;
    }
    @Campos(posicao = 8, tipo = 'D')
    @Column(name = "DT_RECEB")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtReceb;

    public Date getDtReceb() {
        return this.dtReceb;
    }

    public void setDtReceb(Date dtReceb) {
        this.dtReceb = dtReceb;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final RegM300 other = (RegM300) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM300{" + "id=" + id + '}';
    }
}
