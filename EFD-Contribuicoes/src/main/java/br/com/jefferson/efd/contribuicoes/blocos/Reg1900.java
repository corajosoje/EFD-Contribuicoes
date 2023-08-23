package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
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
@Table(name = "reg_1900")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1900.findAll", query = "SELECT r FROM Reg1900 r"),
    @NamedQuery(name = "Reg1900.findById", query = "SELECT r FROM Reg1900 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1900.findByIdPai", query = "SELECT r FROM Reg1900 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1900.findByLinha", query = "SELECT r FROM Reg1900 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1900.findByHashfile", query = "SELECT r FROM Reg1900 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1900.findByReg", query = "SELECT r FROM Reg1900 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1900.findByCnpj", query = "SELECT r FROM Reg1900 r WHERE r.cnpj = :cnpj"),
    @NamedQuery(name = "Reg1900.findByCodMod", query = "SELECT r FROM Reg1900 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "Reg1900.findBySer", query = "SELECT r FROM Reg1900 r WHERE r.ser = :ser"),
    @NamedQuery(name = "Reg1900.findBySubSer", query = "SELECT r FROM Reg1900 r WHERE r.subSer = :subSer"),
    @NamedQuery(name = "Reg1900.findByCodSit", query = "SELECT r FROM Reg1900 r WHERE r.codSit = :codSit"),
    @NamedQuery(name = "Reg1900.findByVlTotRec", query = "SELECT r FROM Reg1900 r WHERE r.vlTotRec = :vlTotRec"),
    @NamedQuery(name = "Reg1900.findByQuantDoc", query = "SELECT r FROM Reg1900 r WHERE r.quantDoc = :quantDoc"),
    @NamedQuery(name = "Reg1900.findByCstPis", query = "SELECT r FROM Reg1900 r WHERE r.cstPis = :cstPis"),
    @NamedQuery(name = "Reg1900.findByCstCofins", query = "SELECT r FROM Reg1900 r WHERE r.cstCofins = :cstCofins"),
    @NamedQuery(name = "Reg1900.findByCfop", query = "SELECT r FROM Reg1900 r WHERE r.cfop = :cfop"),
    @NamedQuery(name = "Reg1900.findByInfCompl", query = "SELECT r FROM Reg1900 r WHERE r.infCompl = :infCompl"),
    @NamedQuery(name = "Reg1900.findByCodCta", query = "SELECT r FROM Reg1900 r WHERE r.codCta = :codCta")})
@Registros(nivel = 2)
public class Reg1900 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1001 idPai;

    @Override
    public Reg1001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg1001) idPai;
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
    @Column(name = "CNPJ")
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    public String getCodMod() {
        return this.codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    public String getSer() {
        return this.ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "SUB_SER")
    private int subSer;

    public int getSubSer() {
        return this.subSer;
    }

    public void setSubSer(int subSer) {
        this.subSer = subSer;
    }
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_SIT")
    private String codSit;

    public String getCodSit() {
        return this.codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_TOT_REC", precision = 15, scale = 6)
    private BigDecimal vlTotRec;

    public BigDecimal getVlTotRec() {
        return this.vlTotRec;
    }

    public void setVlTotRec(BigDecimal vlTotRec) {
        this.vlTotRec = vlTotRec;
    }
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "QUANT_DOC")
    private int quantDoc;

    public int getQuantDoc() {
        return this.quantDoc;
    }

    public void setQuantDoc(int quantDoc) {
        this.quantDoc = quantDoc;
    }
    @Campos(posicao = 9, tipo = 'C')
    @Column(name = "CST_PIS")
    private String cstPis;

    public String getCstPis() {
        return this.cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CST_COFINS")
    private String cstCofins;

    public String getCstCofins() {
        return this.cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    @Campos(posicao = 11, tipo = 'I')
    @Column(name = "CFOP")
    private int cfop;

    public int getCfop() {
        return this.cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }
    @Campos(posicao = 12, tipo = 'C')
    @Column(name = "INF_COMPL")
    private String infCompl;

    public String getInfCompl() {
        return this.infCompl;
    }

    public void setInfCompl(String infCompl) {
        this.infCompl = infCompl;
    }
    @Campos(posicao = 13, tipo = 'C')
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
        final Reg1900 other = (Reg1900) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg1900{" + "id=" + id + '}';
    }
}
