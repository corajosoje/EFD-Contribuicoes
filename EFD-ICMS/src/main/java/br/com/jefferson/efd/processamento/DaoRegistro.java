package br.com.jefferson.efd.processamento;//.DaoRegistro

import br.com.jefferson.efd.config.xmlversion;
import br.com.jefferson.efd.exception.LeitorExeption;
import br.com.jefferson.efd.util.ObjectFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class DaoRegistro {

    private static final Logger log = LogManager.getLogger(DaoRegistro.class.getName());
    private static final SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy");
    private static final xmlversion layout = ObjectFactory.getLayout();
    private final EntityManager entityManager;
    //Mapa de Nivel - IdPai
    private final Map<Integer, Long> NivelPai = new HashMap<>();

    public DaoRegistro(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private EntityManager getEntityManager() {
        return this.entityManager;
    }

    public static void main(String[] args) throws Exception {

        DaoRegistro teste = new DaoRegistro(ObjectFactory.getEntityManager());
        String sped = "|0000|015|1|01122021|31122021|NIKE DO BRASIL COMERCIO E PARTICIPACOES LTDA|59546515000134||SP|142595262117|3518800|||A|0|";

        String[] campos = sped.split("\\|");
        // for (String campo : campos) {System.out.println(campo);}

        log.trace("Pegando Classe e criando instancia");
        long id_pai = 1, linha = 1;

        Class<?> forName = Class.forName("br.com.jefferson.efd.blocos.Reg" + campos[1]);
        Object newInstance = forName.getConstructor().newInstance();

        log.trace("Inserindo registros padrões");
        Method method;

        log.trace("Inserindo ID_PAI");
        method = forName.getMethod("setIdPai", long.class);
        method.invoke(newInstance, id_pai);

        log.trace("Inserindo HASH");
        method = forName.getMethod("setHash", String.class);
        method.invoke(newInstance, "87c3812b3f42a3889eaba5797ed2832");

        log.trace("Inserindo linha");
        method = forName.getMethod("setLinha", long.class);
        method.invoke(newInstance, linha);

        xmlversion.Registro registro = DaoRegistro.layout.getRegistro(campos[1]);
        for (xmlversion.Campo campo : registro.getCampo()) {

            log.trace("criando metodo set para o campo " + campo.getPosicao() + " : " + campo.getColuna());
            String metodo = "set" + teste.priMaiuscula(campo.getColuna());
            log.debug("Metodo: " + metodo);

            log.trace("Invocando metodo para a instancia");
            switch (campo.getTipo()) {
                case "C": {
                    method = forName.getMethod(metodo, String.class);
                    method.invoke(newInstance, campos[campo.getPosicao()]);
                    break;
                }
                case "I": {
                    method = forName.getMethod(metodo, int.class);
                    method.invoke(newInstance, Integer.parseInt(campos[campo.getPosicao()]));
                    break;
                }
                case "R": {
                    method = forName.getMethod(metodo, BigDecimal.class);
                    method.invoke(newInstance, new BigDecimal(campos[campo.getPosicao()].replace(",", ".")));
                    break;
                }
                case "D": {

                    try {
                        method = forName.getMethod(metodo, Date.class);
                        method.invoke(newInstance, formato.parse(campos[campo.getPosicao()]));
                    } catch (ParseException ex) {
                        throw new LeitorExeption("Não foi possivel converter o campo para data " + campos[1], ex);
                    }
                    break;
                }
                default:
                    log.error("Campo tipo " + campo.getTipo() + " não é reconhecido");
                    throw new LeitorExeption("Campo tipo " + campo.getTipo() + " não é reconhecido");
            }

        }
        Method methodget = forName.getMethod("getReg");
        log.trace("Resultado method Get: " + methodget.invoke(newInstance));
        EntityManager manager = teste.getEntityManager();
        manager.getTransaction().begin();
        manager.persist(newInstance);

        manager.getTransaction().commit();
        manager.close();
        //  
    }

    public long persist(String sped, String hash, long linha) {
        if (sped == null || sped.length() < 7) {
            return 0;
        } else if (sped.substring(0, 1).equals("|")
                && sped.substring(5, 6).equals("|")
                && sped.substring(sped.length() - 1).equals("|")) {
            log.trace("Metodo persist da classe " + getClass().getName());
            String[] campos = sped.split("\\|", -1);
            try {
                log.debug("Linha Registro da EFD: " + sped);
                log.trace("Verificando linha registro");
                if (campos == null) {
                    throw new LeitorExeption("Não foi possivel interpertar registro: " + sped);
                }

                log.trace("Verificando Id Pai");

                //Com base no primeiro campo que é o registro, puxa do laytout os campos para o banco de dados
                xmlversion.Registro registro = DaoRegistro.layout.getRegistro(campos[1]);
                long id_pai;
                if ("0000".equals(campos[1])) {
                    id_pai = 0;
                    NivelPai.put(0, id_pai);
                    NivelPai.put(1, id_pai);
                    NivelPai.put(2, id_pai);
                    NivelPai.put(3, id_pai);
                    NivelPai.put(4, id_pai);
                    NivelPai.put(5, id_pai);
                    NivelPai.put(6, id_pai);
                } else {
                    log.trace("Registro nivel: " + registro.getNivel() + " Pregando nivel: " + (registro.getNivel() - 1));
                    id_pai = NivelPai.get(registro.getNivel() - 1);
                }

                log.trace("Pegando Classe e criando instancia: br.com.jefferson.efd.blocos.Reg" + campos[1]);
                log.trace("Quantidade de campos: " + campos.length);
                Class<?> forName = Class.forName("br.com.jefferson.efd.blocos.Reg" + campos[1]);
                Object newInstance = forName.getConstructor().newInstance();

                log.trace("Inserindo registros padrões");
                Method method;

                log.trace("Inserindo ID_PAI");
                method = forName.getMethod("setIdPai", long.class);
                method.invoke(newInstance, id_pai);

                log.trace("Inserindo HASH");
                method = forName.getMethod("setHash", String.class);
                method.invoke(newInstance, hash);

                log.trace("Inserindo linha");
                method = forName.getMethod("setLinha", long.class);
                method.invoke(newInstance, linha);

                for (xmlversion.Campo campo : registro.getCampo()) {

                    log.trace("criando metodo set para o campo " + campo.getPosicao() + " : " + campo.getColuna());
                    String metodo = "set" + priMaiuscula(campo.getColuna());

                    log.trace("Invocando metodo " + metodo + " para a instancia, campo: "
                            + campo.getPosicao() + " - " + campo.getColuna() + " - " + campo.getTipo()
                            + " Valor: " + campos[campo.getPosicao()]);
                    if (!campos[campo.getPosicao()].equals("")) {
                        switch (campo.getTipo()) {
                            case "C": {
                                method = forName.getMethod(metodo, String.class);
                                method.invoke(newInstance, campos[campo.getPosicao()]);
                                break;
                            }
                            case "I": {
                                method = forName.getMethod(metodo, int.class);
                                method.invoke(newInstance, Integer.parseInt(campos[campo.getPosicao()]));
                                break;
                            }
                            case "R": {
                                method = forName.getMethod(metodo, BigDecimal.class);
                                method.invoke(newInstance, new BigDecimal(campos[campo.getPosicao()].replace(",", ".")));
                                break;
                            }
                            case "D": {

                                try {
                                    method = forName.getMethod(metodo, Date.class);
                                    method.invoke(newInstance, formato.parse(campos[campo.getPosicao()]));
                                } catch (ParseException ex) {
                                    throw new LeitorExeption("Não foi possivel converter o campo para data " + campos[1], ex);
                                }
                                break;
                            }
                            default:
                                log.error("Campo tipo " + campo.getTipo() + " não é reconhecido");
                                throw new LeitorExeption("Campo tipo " + campo.getTipo() + " não é reconhecido");
                        }
                    } else {
                        log.trace("Campo Vazio");
                    }

                }

                getEntityManager().persist(newInstance);
                getEntityManager().flush();

                method = forName.getMethod("getId");
                NivelPai.replace(registro.getNivel(), (long) method.invoke(newInstance));
                return (long) method.invoke(newInstance);

            } catch (ClassNotFoundException ex) {
                throw new LeitorExeption("Não foi possivel carregar a classe " + campos[1], ex);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                throw new LeitorExeption("Não foi possivel instanciar a classe " + campos[1], ex);
            }
        } else {
            return 0;
        }
    }

    private String priMaiuscula(String word) {
        String compose = "";

        for (String print : word.split("_")) {
            compose = compose + print.substring(0, 1).toUpperCase() + print.substring(1).toLowerCase() + "_";
        }
        return compose.replace("_", "");
    }
}
