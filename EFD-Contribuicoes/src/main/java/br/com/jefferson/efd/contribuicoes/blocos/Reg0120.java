package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.sped.annotations.Campos;
import br.com.jefferson.sped.annotations.Registros;
import br.com.jefferson.sped.interfaces.BlocoSped;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
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
@Table(name = "reg_0120")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg0120.findAll", query = "SELECT r FROM Reg0120 r"),
    @NamedQuery(name = "Reg0120.findById", query = "SELECT r FROM Reg0120 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg0120.findByIdPai", query = "SELECT r FROM Reg0120 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg0120.findByLinha", query = "SELECT r FROM Reg0120 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg0120.findByHashfile", query = "SELECT r FROM Reg0120 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg0120.findByReg", query = "SELECT r FROM Reg0120 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg0120.findByMesRefer", query = "SELECT r FROM Reg0120 r WHERE r.mesRefer = :mesRefer"),
    @NamedQuery(name = "Reg0120.findByInfComp", query = "SELECT r FROM Reg0120 r WHERE r.infComp = :infComp")})
@Registros(nivel = 2)
public class Reg0120 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
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
    @Column(name = "MES_REFER")
    private String mesRefer;

    public String getMesRefer() {
        return this.mesRefer;
    }

    public void setMesRefer(String mesRefer) {
        this.mesRefer = mesRefer;
    }
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "INF_COMP")
    private String infComp;

    public String getInfComp() {
        return this.infComp;
    }

    public void setInfComp(String infComp) {
        this.infComp = infComp;
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
        final Reg0120 other = (Reg0120) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reg0120{" + "id=" + id + '}';
    }
}
