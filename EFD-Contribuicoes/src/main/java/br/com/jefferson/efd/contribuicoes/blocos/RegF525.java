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
@Table(name = "reg_f525")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegF525.findAll", query = "SELECT r FROM RegF525 r"),
    @NamedQuery(name = "RegF525.findById", query = "SELECT r FROM RegF525 r WHERE r.id = :id"),
    @NamedQuery(name = "RegF525.findByIdPai", query = "SELECT r FROM RegF525 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegF525.findByLinha", query = "SELECT r FROM RegF525 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegF525.findByHashfile", query = "SELECT r FROM RegF525 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegF525.findByReg", query = "SELECT r FROM RegF525 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegF525.findByVlRec", query = "SELECT r FROM RegF525 r WHERE r.vlRec = :vlRec"),
    @NamedQuery(name = "RegF525.findByIndRec", query = "SELECT r FROM RegF525 r WHERE r.indRec = :indRec"),
    @NamedQuery(name = "RegF525.findByCnpjCpf", query = "SELECT r FROM RegF525 r WHERE r.cnpjCpf = :cnpjCpf"),
    @NamedQuery(name = "RegF525.findByNumDoc", query = "SELECT r FROM RegF525 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegF525.findByCodItem", query = "SELECT r FROM RegF525 r WHERE r.codItem = :codItem"),
    @NamedQuery(name = "RegF525.findByVlRecDet", query = "SELECT r FROM RegF525 r WHERE r.vlRecDet = :vlRecDet"),
    @NamedQuery(name = "RegF525.findByCstPis", query = "SELECT r FROM RegF525 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "RegF525.findByCstCofins", query = "SELECT r FROM RegF525 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "RegF525.findByInfoCompl", query = "SELECT r FROM RegF525 r WHERE r.infoCompl = :infoCompl"),
    @NamedQuery(name = "RegF525.findByCodCta", query = "SELECT r FROM RegF525 r WHERE r.codCta = :codCta")})
@Registros(nivel = 3)
public class RegF525 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegF010 idPai;

    @Override
    public RegF010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegF010) idPai;
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
    @Campos(posicao = 2, tipo = 'R')
    @Column(name = "VL_REC", precision = 15, scale = 6)
    private BigDecimal vlRec;

    public BigDecimal getVlRec() {
        return this.vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_REC")
    private String indRec;

    public String getIndRec() {
        return this.indRec;
    }

    public void setIndRec(String indRec) {
        this.indRec = indRec;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "CNPJ_CPF")
    private String cnpjCpf;

    public String getCnpjCpf() {
        return this.cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
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
    @Column(name = "COD_ITEM")
    private String codItem;

    public String getCodItem() {
        return this.codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_REC_DET", precision = 15, scale = 6)
    private BigDecimal vlRecDet;

    public BigDecimal getVlRecDet() {
        return this.vlRecDet;
    }

    public void setVlRecDet(BigDecimal vlRecDet) {
        this.vlRecDet = vlRecDet;
    }
    @Campos(posicao = 8, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
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
    @Campos(posicao = 11, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    public String getCodCta() {
        return this.codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
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
        final RegF525 other = (RegF525) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegF525{" + "id=" + id + '}';
    }
}
