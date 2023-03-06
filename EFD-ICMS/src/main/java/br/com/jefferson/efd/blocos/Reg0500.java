package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.interfaces.BlocoSped;
import br.com.jefferson.efd.annotations.Registros;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrePersist;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_0500")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0500.findAll", query = "SELECT r FROM Reg0500 r"),
    @NamedQuery(name = "Reg0500.findById", query = "SELECT r FROM Reg0500 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0500.findByIdPai", query = "SELECT r FROM Reg0500 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0500.findByLinha", query = "SELECT r FROM Reg0500 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0500.findByHashfile", query = "SELECT r FROM Reg0500 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0500.findByReg", query = "SELECT r FROM Reg0500 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0500.findByDtAlt", query = "SELECT r FROM Reg0500 r WHERE r.dtAlt = :dtAlt"),
    @NamedQuery(name = "Reg0500.findByCodNatCc", query = "SELECT r FROM Reg0500 r WHERE r.codNatCc = :codNatCc"),
    @NamedQuery(name = "Reg0500.findByIndCta", query = "SELECT r FROM Reg0500 r WHERE r.indCta = :indCta"),
    @NamedQuery(name = "Reg0500.findByNivel", query = "SELECT r FROM Reg0500 r WHERE r.nivel = :nivel"),
    @NamedQuery(name = "Reg0500.findByCodCta", query = "SELECT r FROM Reg0500 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "Reg0500.findByNomeCta", query = "SELECT r FROM Reg0500 r WHERE r.nomeCta = :nomeCta")})
@Registros(nivel = 2)
public class Reg0500 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    @Basic(optional = false)
    @Column(name = "LINHA")
    private long linha;

    @Basic(optional = false)
    @Column(name = "HASHFILE")
    private String hashfile;

    @Campos(posicao = 1, tipo = 'C')
    @Column(name = "REG")
    private String reg;

    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_ALT")
    @Temporal(TemporalType.DATE)
    private Date dtAlt;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_NAT_CC")
    private String codNatCc;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "IND_CTA")
    private String indCta;

    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "NIVEL")
    private int nivel;

    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "COD_CTA")
    private String codCta;

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "NOME_CTA")
    private String nomeCta;

    public Reg0500() {
    }

    public Reg0500(String id) {
        this.id = id;
    }

    public Reg0500(String id, Reg0001 idPai, long linha, String hashfile) {
        this.id = id;
        this.idPai = idPai;
        this.linha = linha;
        this.hashfile = hashfile;
    }

    public String getId() {
        return id;
    }

    @PrePersist
    public void setId() {
        this.id = this.hashfile + "." + this.linha;
    }

    public Reg0001 getIdPai() {
        return idPai;
    }

    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
    }

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

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getCodNatCc() {
        return codNatCc;
    }

    public void setCodNatCc(String codNatCc) {
        this.codNatCc = codNatCc;
    }

    public String getIndCta() {
        return indCta;
    }

    public void setIndCta(String indCta) {
        this.indCta = indCta;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getNomeCta() {
        return nomeCta;
    }

    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
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
        if (!(object instanceof Reg0500)) {
            return false;
        }
        Reg0500 other = (Reg0500) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg0500[ id=" + id + " ]";
    }

}
