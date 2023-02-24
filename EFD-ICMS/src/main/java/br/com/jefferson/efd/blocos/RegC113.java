package br.com.jefferson.efd.blocos;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; import javax.persistence.SequenceGenerator;
import java.io.Serializable;
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
@Table(name = "reg_c113")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegC113.findAll", query = "SELECT r FROM RegC113 r"),
    @NamedQuery(name = "RegC113.findById", query = "SELECT r FROM RegC113 r WHERE r.id = :id"),
    @NamedQuery(name = "RegC113.findByIdPai", query = "SELECT r FROM RegC113 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegC113.findByLinha", query = "SELECT r FROM RegC113 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegC113.findByHashfile", query = "SELECT r FROM RegC113 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegC113.findByReg", query = "SELECT r FROM RegC113 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegC113.findByIndOper", query = "SELECT r FROM RegC113 r WHERE r.indOper = :indOper"),
    @NamedQuery(name = "RegC113.findByIndEmit", query = "SELECT r FROM RegC113 r WHERE r.indEmit = :indEmit"),
    @NamedQuery(name = "RegC113.findByCodPart", query = "SELECT r FROM RegC113 r WHERE r.codPart = :codPart"),
    @NamedQuery(name = "RegC113.findByCodMod", query = "SELECT r FROM RegC113 r WHERE r.codMod = :codMod"),
    @NamedQuery(name = "RegC113.findBySer", query = "SELECT r FROM RegC113 r WHERE r.ser = :ser"),
    @NamedQuery(name = "RegC113.findBySub", query = "SELECT r FROM RegC113 r WHERE r.sub = :sub"),
    @NamedQuery(name = "RegC113.findByNumDoc", query = "SELECT r FROM RegC113 r WHERE r.numDoc = :numDoc"),
    @NamedQuery(name = "RegC113.findByDtDoc", query = "SELECT r FROM RegC113 r WHERE r.dtDoc = :dtDoc"),
    @NamedQuery(name = "RegC113.findByChvDoce", query = "SELECT r FROM RegC113 r WHERE r.chvDoce = :chvDoce")})
@Registros(nivel = 4)
public class RegC113 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")    @SequenceGenerator(name = "seq_post", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegC110 idPai;

    public RegC110 getIdPai() {
        return idPai;
    }

    public void setIdPai(Object idPai) {
        this.idPai = (RegC110) idPai;
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
    @Column(name = "IND_OPER")
    private String indOper;
    @Campos(posicao = 3, tipo = 'C')
    @Column(name = "IND_EMIT")
    private String indEmit;
    @Campos(posicao = 4, tipo = 'C')
    @Column(name = "COD_PART")
    private String codPart;
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_MOD")
    private String codMod;
    @Campos(posicao = 6, tipo = 'C')
    @Column(name = "SER")
    private String ser;
    @Campos(posicao = 7, tipo = 'I')
    @Column(name = "SUB")
    private int sub;
    @Campos(posicao = 8, tipo = 'I')
    @Column(name = "NUM_DOC")
    private int numDoc;
    @Campos(posicao = 9, tipo = 'D')
    @Column(name = "DT_DOC")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;
    @Campos(posicao = 10, tipo = 'C')
    @Column(name = "CHV_DOCe")
    private String chvDoce;

    public RegC113() {
    }

    public RegC113(Long id) {
        this.id = id;
    }

    public RegC113(Long id, RegC110 idPai, long linha, String hashfile) {
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

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
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

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
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

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
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
        if (!(object instanceof RegC113)) {
            return false;
        }
        RegC113 other = (RegC113) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jefferson.efd.blocos.RegC113[ id=" + id + " ]";
    }

}
