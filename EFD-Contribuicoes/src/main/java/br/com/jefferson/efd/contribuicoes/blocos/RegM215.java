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
@Table(name = "reg_m215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegM215.findAll", query = "SELECT r FROM RegM215 r"),
    @NamedQuery(name = "RegM215.findById", query = "SELECT r FROM RegM215 r WHERE r.id = :id"),
    @NamedQuery(name = "RegM215.findByIdPai", query = "SELECT r FROM RegM215 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegM215.findByLinha", query = "SELECT r FROM RegM215 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegM215.findByHashfile", query = "SELECT r FROM RegM215 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegM215.findByReg", query = "SELECT r FROM RegM215 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegM215.findByIndAjBc", query = "SELECT r FROM RegM215 r WHERE r.indAjBc = :indAjBc"),
    @NamedQuery(name = "RegM215.findByVlAjBc", query = "SELECT r FROM RegM215 r WHERE r.vlAjBc = :vlAjBc"),
    @NamedQuery(name = "RegM215.findByCodAjBc", query = "SELECT r FROM RegM215 r WHERE r.codAjBc = :codAjBc"),
    @NamedQuery(name = "RegM215.findByNumDoc", query = "SELECT r FROM RegM215 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegM215.findByDescrAjBc", query = "SELECT r FROM RegM215 r WHERE r.descrAjBc = :descrAjBc"),
    @NamedQuery(name = "RegM215.findByDtRef", query = "SELECT r FROM RegM215 r WHERE r.dtRef = :dtRef"),
    @NamedQuery(name = "RegM215.findByCodCta", query = "SELECT r FROM RegM215 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegM215.findByCnpj", query = "SELECT r FROM RegM215 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "RegM215.findByInfoCompl", query = "SELECT r FROM RegM215 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 4)
public class RegM215 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegM210 idPai;

    @Override
    public RegM210 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegM210) idPai;
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
    @Column(name = "IND_AJ_BC")
    private String indAjBc;

    public String getIndAjBc() {
        return this.indAjBc;
    }

    public void setIndAjBc(String indAjBc) {
        this.indAjBc = indAjBc;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_AJ_BC", precision = 15, scale = 6)
    private BigDecimal vlAjBc;

    public BigDecimal getVlAjBc() {
        return this.vlAjBc;
    }

    public void setVlAjBc(BigDecimal vlAjBc) {
        this.vlAjBc = vlAjBc;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_AJ_BC")
    private String codAjBc;

    public String getCodAjBc() {
        return this.codAjBc;
    }

    public void setCodAjBc(String codAjBc) {
        this.codAjBc = codAjBc;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "NUM_DOC")
    private String numDoc;

    public String getNumDoc() {
        return this.numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "DESCR_AJ_BC")
    private String descrAjBc;

    public String getDescrAjBc() {
        return this.descrAjBc;
    }

    public void setDescrAjBc(String descrAjBc) {
        this.descrAjBc = descrAjBc;
    }
    @Campos(posicao = 7, tipo = 'D')
    @Column(name = "DT_REF")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtRef;

    public Date getDtRef() {
        return this.dtRef;
    }

    public void setDtRef(Date dtRef) {
        this.dtRef = dtRef;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "INFO_COMPL")
    private String infoCompl;

    public String getInfoCompl() {
        return this.infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
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
        final RegM215 other = (RegM215) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegM215{" + "id=" + id + '}';
    }
}
