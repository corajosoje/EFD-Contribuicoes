package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_m410")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM410.findAll", query = "SELECT r FROM RegM410 r"),
    @NamedQuery(name = "RegM410.findById", query = "SELECT r FROM RegM410 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM410.findByIdPai", query = "SELECT r FROM RegM410 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM410.findByLinha", query = "SELECT r FROM RegM410 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM410.findByHashfile", query = "SELECT r FROM RegM410 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM410.findByReg", query = "SELECT r FROM RegM410 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM410.findByNatRec", query = "SELECT r FROM RegM410 r WHERE r.natRec = :natRec"),
    @NamedQuery(name = "RegM410.findByVlRec", query = "SELECT r FROM RegM410 r WHERE r.vlRec = :vlRec"),
    @NamedQuery(name = "RegM410.findByCodCta", query = "SELECT r FROM RegM410 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegM410.findByDescCompl", query = "SELECT r FROM RegM410 r WHERE r.descCompl = :descCompl")})
@Registros(nivel = 3)
public class RegM410 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM400 idPai;

    @Override
    public RegM400 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM400) idPai;
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
    @Column(name = "NAT_REC")
    private String natRec;

    public String getNatRec() {
        return this.natRec;
    }

    public void setNatRec(String natRec) {
        this.natRec = natRec;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_REC", precision = 15, scale = 6)
    private BigDecimal vlRec;

    public BigDecimal getVlRec() {
        return this.vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "DESC_COMPL")
    private String descCompl;

    public String getDescCompl() {
        return this.descCompl;
    }

    public void setDescCompl(String descCompl) {
        this.descCompl = descCompl;
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
        final RegM410 other = (RegM410) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM410{" + "id=" + id + '}';
    }
}
