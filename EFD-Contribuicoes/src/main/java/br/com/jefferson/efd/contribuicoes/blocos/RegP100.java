package br.com.jefferson.efd.contribuicoes.blocos;

import br.com.jefferson.efd.contribuicoes.annotations.Campos;
import br.com.jefferson.efd.contribuicoes.annotations.Registros;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Entity
@Table(name = "reg_p100")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegP100.findAll", query = "SELECT r FROM RegP100 r"),
    @NamedQuery(name = "RegP100.findById", query = "SELECT r FROM RegP100 r WHERE r.id = :id"),
    @NamedQuery(name = "RegP100.findByIdPai", query = "SELECT r FROM RegP100 r WHERE r.idPai = :idPai"),
    @NamedQuery(name = "RegP100.findByLinha", query = "SELECT r FROM RegP100 r WHERE r.linha = :linha"),
    @NamedQuery(name = "RegP100.findByHashfile", query = "SELECT r FROM RegP100 r WHERE r.hashfile = :hashfile"),
    @NamedQuery(name = "RegP100.findByReg", query = "SELECT r FROM RegP100 r WHERE r.reg = :reg"),
    @NamedQuery(name = "RegP100.findByDtIni", query = "SELECT r FROM RegP100 r WHERE r.dtIni = :dtIni"),
    @NamedQuery(name = "RegP100.findByDtFin", query = "SELECT r FROM RegP100 r WHERE r.dtFin = :dtFin"),
    @NamedQuery(name = "RegP100.findByVlRecTotEst", query = "SELECT r FROM RegP100 r WHERE r.vlRecTotEst = :vlRecTotEst"),
    @NamedQuery(name = "RegP100.findByCodAtivEcon", query = "SELECT r FROM RegP100 r WHERE r.codAtivEcon = :codAtivEcon"),
    @NamedQuery(name = "RegP100.findByVlRecAtivEstab", query = "SELECT r FROM RegP100 r WHERE r.vlRecAtivEstab = :vlRecAtivEstab"),
    @NamedQuery(name = "RegP100.findByVlExc", query = "SELECT r FROM RegP100 r WHERE r.vlExc = :vlExc"),
    @NamedQuery(name = "RegP100.findByVlBcCont", query = "SELECT r FROM RegP100 r WHERE r.vlBcCont = :vlBcCont"),
    @NamedQuery(name = "RegP100.findByAliqCont", query = "SELECT r FROM RegP100 r WHERE r.aliqCont = :aliqCont"),
    @NamedQuery(name = "RegP100.findByVlContApu", query = "SELECT r FROM RegP100 r WHERE r.vlContApu = :vlContApu"),
    @NamedQuery(name = "RegP100.findByCodCta", query = "SELECT r FROM RegP100 r WHERE r.codCta = :codCta"),
    @NamedQuery(name = "RegP100.findByInfoCompl", query = "SELECT r FROM RegP100 r WHERE r.infoCompl = :infoCompl")})
@Registros(nivel = 3)
public class RegP100 implements Serializable, BlocoSped {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAI", nullable = false)
    private RegP010 idPai;

    @Override
    public RegP010 getIdPai() {
        return idPai;
    }

    @Override
    public void setIdPai(BlocoSped idPai) {
        this.idPai = (RegP010) idPai;
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegP110> regP110;

    public List<RegP110> getRegP110() {
        return regP110;
    }

    public void setRegP110(List<RegP110> regP110) {
        this.regP110 = regP110;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idPai")
    private List<RegP199> regP199;

    public List<RegP199> getRegP199() {
        return regP199;
    }

    public void setRegP199(List<RegP199> regP199) {
        this.regP199 = regP199;
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
    @Campos(posicao = 2, tipo = 'D')
    @Column(name = "DT_INI")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtIni;

    public Date getDtIni() {
        return this.dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }
    @Campos(posicao = 3, tipo = 'D')
    @Column(name = "DT_FIN")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtFin;

    public Date getDtFin() {
        return this.dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }
    @Campos(posicao = 4, tipo = 'R')
    @Column(name = "VL_REC_TOT_EST", precision = 15, scale = 6)
    private BigDecimal vlRecTotEst;

    public BigDecimal getVlRecTotEst() {
        return this.vlRecTotEst;
    }

    public void setVlRecTotEst(BigDecimal vlRecTotEst) {
        this.vlRecTotEst = vlRecTotEst;
    }
    @Campos(posicao = 5, tipo = 'C')
    @Column(name = "COD_ATIV_ECON")
    private String codAtivEcon;

    public String getCodAtivEcon() {
        return this.codAtivEcon;
    }

    public void setCodAtivEcon(String codAtivEcon) {
        this.codAtivEcon = codAtivEcon;
    }
    @Campos(posicao = 6, tipo = 'R')
    @Column(name = "VL_REC_ATIV_ESTAB", precision = 15, scale = 6)
    private BigDecimal vlRecAtivEstab;

    public BigDecimal getVlRecAtivEstab() {
        return this.vlRecAtivEstab;
    }

    public void setVlRecAtivEstab(BigDecimal vlRecAtivEstab) {
        this.vlRecAtivEstab = vlRecAtivEstab;
    }
    @Campos(posicao = 7, tipo = 'R')
    @Column(name = "VL_EXC", precision = 15, scale = 6)
    private BigDecimal vlExc;

    public BigDecimal getVlExc() {
        return this.vlExc;
    }

    public void setVlExc(BigDecimal vlExc) {
        this.vlExc = vlExc;
    }
    @Campos(posicao = 8, tipo = 'R')
    @Column(name = "VL_BC_CONT", precision = 15, scale = 6)
    private BigDecimal vlBcCont;

    public BigDecimal getVlBcCont() {
        return this.vlBcCont;
    }

    public void setVlBcCont(BigDecimal vlBcCont) {
        this.vlBcCont = vlBcCont;
    }
    @Campos(posicao = 9, tipo = 'R')
    @Column(name = "ALIQ_CONT", precision = 15, scale = 6)
    private BigDecimal aliqCont;

    public BigDecimal getAliqCont() {
        return this.aliqCont;
    }

    public void setAliqCont(BigDecimal aliqCont) {
        this.aliqCont = aliqCont;
    }
    @Campos(posicao = 10, tipo = 'R')
    @Column(name = "VL_CONT_APU", precision = 15, scale = 6)
    private BigDecimal vlContApu;

    public BigDecimal getVlContApu() {
        return this.vlContApu;
    }

    public void setVlContApu(BigDecimal vlContApu) {
        this.vlContApu = vlContApu;
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
    @Campos(posicao = 12, tipo = 'C')
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
        final RegP100 other = (RegP100) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "RegP100{" + "id=" + id + '}';
    }
}
