package br.com.jefferson.efd.contribuicoes.interfaces;

/**
 *
 * @author Jefferson Oliveira
 */
public interface BlocoSped {

    public String getId();

    public void setId();

    public long getLinha();

    public void setLinha(long linha);

    public String getHashfile();

    public void setHash(String hashfile);

    public String getReg();

    public void setReg(String reg);

    public BlocoSped getIdPai();

    public void setIdPai(BlocoSped idPai);
}
