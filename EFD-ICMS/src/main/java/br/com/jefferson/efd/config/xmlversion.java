package br.com.jefferson.efd.config;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@XmlRootElement(name = "layout")
@XmlType(propOrder = {"registro"})
public class xmlversion {

    @XmlAttribute
    private String versao;

    @XmlElement
    private List<Registro> registro;

    public String getVersao() {
        return versao;
    }

    public List<Registro> getRegistro() {
        return registro;
    }

    public Registro getRegistro(String idRegistro) {
        for (Registro registro : getRegistro()) {
            if (registro.getCodigo().equals(idRegistro)) {
                return registro;
            }
        }
        return null;
    }

    public static class Registro {

        @XmlAttribute
        private String codigo;

        @XmlAttribute
        private String perfil;

        @XmlAttribute
        private Integer nivel;

        @XmlElement
        private List<Campo> campo;

        public String getCodigo() {
            return codigo;
        }

        public List<Campo> getCampo() {
            return campo;
        }

        public String getPerfil() {
            return perfil;
        }

        public Integer getNivel() {
            return nivel;
        }

    }

    public static class Campo {

        @XmlAttribute
        private int posicao;

        @XmlElement
        private String coluna;

        @XmlElement
        private String tipo;

        @XmlElement
        private String descricao;

        public int getPosicao() {
            return posicao;
        }

        public String getColuna() {
            return coluna;
        }

        public String getTipo() {
            return tipo;
        }

        public String getDescricao() {
            return descricao;
        }

    }
}
