package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_0145")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0145.findAll", query = "SELECT r FROM Reg0145 r"),
    @NamedQuery(name = "Reg0145.findById", query = "SELECT r FROM Reg0145 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0145.findByIdPai", query = "SELECT r FROM Reg0145 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0145.findByLinha", query = "SELECT r FROM Reg0145 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0145.findByHashfile", query = "SELECT r FROM Reg0145 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0145.findByReg", query = "SELECT r FROM Reg0145 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0145.findByCodIncTrib", query = "SELECT r FROM Reg0145 r WHERE r.codIncTrib = :codIncTrib"),
    @NamedQuery(name = "Reg0145.findByVlRecTot", query = "SELECT r FROM Reg0145 r WHERE r.vlRecTot = :vlRecTot"),
    @NamedQuery(name = "Reg0145.findByVlRecAtiv", query = "SELECT r FROM Reg0145 r WHERE r.vlRecAtiv = :vlRecAtiv"),
    @NamedQuery(name = "Reg0145.findByVlRecDemaisAtiv", query = "SELECT r FROM Reg0145 r WHERE r.vlRecDemaisAtiv = :vlRecDemaisAtiv"),
    @NamedQuery(name = "Reg0145.findByInfoCompl", query = "SELECT r FROM Reg0145 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 3)
public class Reg0145 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0140 idPai;

    @Override
    public Reg0140 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0140) idPai;
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

    public String getReg() {
        return this.reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }
    @Campos(posicao = 2, tipo = 'I')
    @Column(name = "COD_INC_TRIB")
    private int codIncTrib;

    public int getCodIncTrib() {
        return this.codIncTrib;
    }

    public void setCodIncTrib(int codIncTrib) {
        this.codIncTrib = codIncTrib;
    }
    @Campos(posicao = 3, tipo = 'R')
    @Column(name = "VL_REC_TOT", precision = 15, scale = 6)
    private BigDecimal vlRecTot;

    public BigDecimal getVlRecTot() {
        return this.vlRecTot;
    }

    public void setVlRecTot(BigDecimal vlRecTot) {
        this.vlRecTot = vlRecTot;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_REC_ATIV", precision = 15, scale = 6)
    private BigDecimal vlRecAtiv;

    public BigDecimal getVlRecAtiv() {
        return this.vlRecAtiv;
    }

    public void setVlRecAtiv(BigDecimal vlRecAtiv) {
        this.vlRecAtiv = vlRecAtiv;
    }
    @Campos(posicao = 5, tipo = 'R')
    @Column(name = "VL_REC_DEMAIS_ATIV", precision = 15, scale = 6)
    private BigDecimal vlRecDemaisAtiv;

    public BigDecimal getVlRecDemaisAtiv() {
        return this.vlRecDemaisAtiv;
    }

    public void setVlRecDemaisAtiv(BigDecimal vlRecDemaisAtiv) {
        this.vlRecDemaisAtiv = vlRecDemaisAtiv;
    }
    @Campos(posicao = 6, tipo = 'C')
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
        final Reg0145 other = (Reg0145) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0145{" + "id=" + id + '}';
    }
}
