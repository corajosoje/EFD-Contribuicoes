package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 88717
 */
@Entity
@Table(name = "reg_1110")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reg1110.findAll", query = "SELECT r FROM Reg1110 r"),
    @NamedQuery(name = "Reg1110.findById", query = "SELECT r FROM Reg1110 r WHERE r.id = :id"),
    @NamedQuery(name = "Reg1110.findByIdPai", query = "SELECT r FROM Reg1110 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "Reg1110.findByLinha", query = "SELECT r FROM Reg1110 r WHERE r.linha = :linha"),
    @NamedQuery(name = "Reg1110.findByHashfile", query = "SELECT r FROM Reg1110 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "Reg1110.findByReg", query = "SELECT r FROM Reg1110 r WHERE r.reg = :reg"),
    @NamedQuery(name = "Reg1110.findByCodPart", query = "SELECT r FROM Reg1110 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "Reg1110.findByCodMod", query = "SELECT r FROM Reg1110 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "Reg1110.findBySer", query = "SELECT r FROM Reg1110 r WHERE r.ser = :ser"),
    @NamedQuery(name = "Reg1110.findByNumDoc", query = "SELECT r FROM Reg1110 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "Reg1110.findByDtDoc", query = "SELECT r FROM Reg1110 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "Reg1110.findByChvNfe", query = "SELECT r FROM Reg1110 r WHERE r.chvNfe = :chvNfe"),
    @NamedQuery(name = "Reg1110.findByNrMemo", query = "SELECT r FROM Reg1110 r WHERE r.nrMemo = :nrMemo"),
    @NamedQuery(name = "Reg1110.findByQtd", query = "SELECT r FROM Reg1110 r WHERE r.qtd = :qtd"),
    @NamedQuery(name = "Reg1110.findByUnid", query = "SELECT r FROM Reg1110 r WHERE r.unid = :unid")})
@Registros(nivel = 4)
public class Reg1110 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private Reg1105 idPai;

    public Reg1105 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (Reg1105) idPai;
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
    @Column(name = "COD_PART")
    private String codPart;

    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;

    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "SER")
    private String ser;

    @Campos(posicao = 5, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;

    @Campos(posicao = 6, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;

    @Campos(posicao = 7, tipo = 'C')
    @Column(name = "CHV_NFE")
    private String chvNfe;

    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "NR_MEMO")
    private int nrMemo;

    @Campos(posicao = 9, tipo = 'R')
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD", precision = 15, scale = 6)
    private BigDecimal qtd;

    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "UNID")
    private String unid;

    public Reg1110() {
    }

    public Reg1110(Long id) {
        this.id = id;
    }

    public Reg1110(Long id, Reg1105 idPai, long linha, String hashfile) {
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

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public int getNrMemo() {
        return nrMemo;
    }

    public void setNrMemo(int nrMemo) {
        this.nrMemo = nrMemo;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
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
        if (!(object instanceof Reg1110)) {
            return false;
        }
        Reg1110 other = (Reg1110) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.Reg1110[ id=" + id + " ]";
    }

}
