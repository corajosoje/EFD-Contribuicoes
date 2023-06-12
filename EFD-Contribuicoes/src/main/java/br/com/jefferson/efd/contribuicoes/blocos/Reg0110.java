package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "reg_0110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0110.findAll", query = "SELECT r FROM Reg0110 r"),
    @NamedQuery(name = "Reg0110.findById", query = "SELECT r FROM Reg0110 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0110.findByIdPai", query = "SELECT r FROM Reg0110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0110.findByLinha", query = "SELECT r FROM Reg0110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0110.findByHashfile", query = "SELECT r FROM Reg0110 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0110.findByReg", query = "SELECT r FROM Reg0110 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0110.findByCodIncTrib", query = "SELECT r FROM Reg0110 r WHERE r.codIncTrib = :codIncTrib"),
    @NamedQuery(name = "Reg0110.findByIndAproCred", query = "SELECT r FROM Reg0110 r WHERE r.indAproCred = :indAproCred"),
    @NamedQuery(name = "Reg0110.findByCodTipoCont", query = "SELECT r FROM Reg0110 r WHERE r.codTipoCont = :codTipoCont"),
    @NamedQuery(name = "Reg0110.findByIndRegCum", query = "SELECT r FROM Reg0110 r WHERE r.indRegCum = :indRegCum")})
@Registros(nivel = 2)
public class Reg0110 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg0001 idPai;

    @Override
    public Reg0001 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (Reg0001) idPai;
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
    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private Reg0111 reg0111;

    public Reg0111 getReg0111() {
        return reg0111;
    }

    public void setReg0111(Reg0111 reg0111) {
        this.reg0111 = reg0111;
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
    @Campos(posicao = 3, tipo = 'I')
    @Column(name = "IND_APRO_CRED")
    private int indAproCred;

    public int getIndAproCred() {
        return this.indAproCred;
    }

    public void setIndAproCred(int indAproCred) {
        this.indAproCred = indAproCred;
    }
    @Campos(posicao = 4, tipo = 'I')
    @Column(name = "COD_TIPO_CONT")
    private int codTipoCont;

    public int getCodTipoCont() {
        return this.codTipoCont;
    }

    public void setCodTipoCont(int codTipoCont) {
        this.codTipoCont = codTipoCont;
    }
    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "IND_REG_CUM")
    private int indRegCum;

    public int getIndRegCum() {
        return this.indRegCum;
    }

    public void setIndRegCum(int indRegCum) {
        this.indRegCum = indRegCum;
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
        final Reg0110 other = (Reg0110) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0110{" + "id=" + id + '}';
    }
}
