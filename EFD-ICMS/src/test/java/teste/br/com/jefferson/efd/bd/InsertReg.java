package teste.br.com.jefferson.efd.bd;

import br.com.jefferson.efd.annotations.Campos;
import br.com.jefferson.efd.annotations.Registros;
import br.com.jefferson.efd.blocos.Reg0000;
import br.com.jefferson.efd.exception.LeitorExeption;
import br.com.jefferson.efd.util.ObjectFactory;
import br.com.jefferson.efd.util.Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author 88717
 */
public class InsertReg {

    private static final Logger log = LogManager.getLogger("LoggerTest");
    private static final SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy");

    public static void main(String[] args) throws Exception {
        String arquivo = "D:\\Receita BX\\Arquivos Centauro\\Escrituração Fiscal Digital\\06347409000165\\"
                + "06347409006872-0623186220601-20220901-20220930-0-950FF25A1A03852F74B5E3154555155F30BE2168-SPED-EFD.txt";
        File file = new File(arquivo);

        //Classe Leitor
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int count = (int) reader.lines().count();
        log.trace("Processando " + count + " linhas do arquivo " + file.getName());

        String hashCode = Util.getHash(file);
        reader = new BufferedReader(new FileReader(arquivo));
        String conteudo = reader.readLine();
        int linha = 1;

        log.trace("Primeira linha: " + conteudo);

        //Linha para a Nova implementação
        Reg0000 sped = new Reg0000();
        Object nivel1 = null;
        Object nivel2 = null;
        Object nivel3 = null;
        Object nivel4 = null;
        Object nivel5 = null;
        Object nivel6 = null;

        while (true) {
            if (conteudo != null) {
                log.trace("Linha: " + linha + " - Registro: " + conteudo);

                //Começo da nova implementação
                if (conteudo == null) {
                } else if (conteudo.length() < 7) {

                    log.trace("Fim do arquivo");
                    break;
                } else if (conteudo.substring(0, 1).equals("|")
                        && conteudo.substring(5, 6).equals("|")
                        && conteudo.substring(conteudo.length() - 1).equals("|")) {

                    String[] campos = conteudo.split("\\|", -1);
                    log.debug("Linha Registro da EFD: " + conteudo);
                    log.trace("Verificando linha registro");
                    if (campos == null) {
                        throw new LeitorExeption("Não foi possivel interpertar registro: " + conteudo);
                    }

                    Method method;

                    if ("0000".equals(campos[1])) {
                        log.trace("Inserindo registros padrões do Registro 0000");
                        Class forName = sped.getClass();
                        log.trace("Inserindo HASH: " + hashCode);
                        method = forName.getMethod("setHash", String.class);
                        method.invoke(sped, hashCode);

                        log.trace("Inserindo linha: " + linha);
                        method = forName.getMethod("setLinha", long.class);
                        method.invoke(sped, linha);

                        for (Field field : sped.getClass().getDeclaredFields()) {
                            if (field.isAnnotationPresent(Campos.class)) {
                                preencherObjeto(campos, field, sped);
                            }
                        }
                    } else if ("9999".equals(campos[1])) {
                        Class<?> forName = Class.forName("br.com.jefferson.efd.blocos.Reg" + campos[1]);
                        Object newInstance = forName.getConstructor().newInstance();

                        log.debug("Trabalhando na classe: " + "br.com.jefferson.efd.blocos.Reg" + campos[1]);

                        log.trace("Inserindo HASH: " + hashCode);
                        method = forName.getMethod("setHash", String.class);
                        method.invoke(newInstance, hashCode);

                        log.trace("Inserindo linha: " + linha);
                        method = forName.getMethod("setLinha", long.class);
                        method.invoke(newInstance, linha);

                        for (Field field : forName.getDeclaredFields()) {
                            if (field.isAnnotationPresent(Campos.class)) {
                                //fazer verificação de versão com a versão do arquivo
                                preencherObjeto(campos, field, newInstance);
                            }
                        }
                    } else {
                        Class<?> forName = Class.forName("br.com.jefferson.efd.blocos.Reg" + campos[1]);
                        Object newInstance = forName.getConstructor().newInstance();

                        log.debug("Trabalhando na classe: " + "br.com.jefferson.efd.blocos.Reg" + campos[1] + " Quantidade de campos:" + campos.length);

                        log.trace("Inserindo HASH: " + hashCode);
                        method = forName.getMethod("setHash", String.class);
                        method.invoke(newInstance, hashCode);

                        log.trace("Inserindo linha: " + linha);
                        method = forName.getMethod("setLinha", long.class);
                        method.invoke(newInstance, linha);

                        int nivel = forName.getAnnotation(Registros.class).nivel();

                        for (Field field : forName.getDeclaredFields()) {
                            if (field.isAnnotationPresent(Campos.class)) {
                                //fazer verificação de versão com a versão do arquivo
                                preencherObjeto(campos, field, newInstance);
                            }
                        }

                        method = forName.getMethod("setIdPai", Object.class);

                        switch (nivel) {
                            case 1:
                                log.trace("Inserindo no registro pai " + sped.getClass().getSimpleName());
                                method.invoke(newInstance, sped);

                                preencherSuperior(sped, newInstance);
                                nivel1 = newInstance;
                                break;
                            case 2:
                                log.trace("Inserindo no registro pai " + nivel1.getClass().getSimpleName());
                                method.invoke(newInstance, nivel1);

                                preencherSuperior(nivel1, newInstance);

                                nivel2 = newInstance;
                                break;
                            case 3:
                                log.trace("Inserindo no registro pai " + nivel2.getClass().getSimpleName());
                                method.invoke(newInstance, nivel2);

                                preencherSuperior(nivel2, newInstance);

                                nivel3 = newInstance;
                                break;
                            case 4:
                                log.trace("Inserindo no registro pai " + nivel3.getClass().getSimpleName());

                                method.invoke(newInstance, nivel3);

                                preencherSuperior(nivel3, newInstance);

                                nivel4 = newInstance;
                                break;
                            case 5:
                                log.trace("Inserindo no registro pai " + nivel4.getClass().getSimpleName());

                                method.invoke(newInstance, nivel4);
                                preencherSuperior(nivel4, newInstance);

                                nivel5 = newInstance;
                                break;
                            case 6:
                                log.trace("Inserindo no registro pai " + nivel5.getClass().getSimpleName());

                                method.invoke(newInstance, nivel4);
                                preencherSuperior(nivel5, newInstance);

                                nivel6 = newInstance;
                                break;
                        }
                    }

                }
            } else {
                break;
            }
            conteudo = reader.readLine();
            linha++;
        }
        //Fim da nova implementação
        log.trace("Processo finalizado");

        log.trace("Iniciando Manager");
        EntityManager entityManager = ObjectFactory.getEntityManager();
        log.trace("Verificando duplicidade");
        try {
            Reg0000 verif = entityManager.createNamedQuery("Reg0000.findByHash", Reg0000.class).setParameter("hash", hashCode).getSingleResult();
            if (verif == null) {
                log.trace("Iniciando Transação");
                entityManager.getTransaction().begin();
                log.trace("Persistindo Sped");
                entityManager.persist(sped);
                entityManager.getTransaction().commit();
            } else {
                log.trace("Objeto retornado da verificação não é nulo");
                log.trace("Arquivo do Sped já gravado no banco de dados");
            }
        } catch (javax.persistence.NoResultException ex) {
            log.trace(":NoResult: Iniciando Transação!");
            entityManager.getTransaction().begin();
            log.trace("Persistindo Sped");
            entityManager.persist(sped);
            entityManager.getTransaction().commit();
        }
        log.trace("Fechando Manager");
        entityManager.close();
        reader.close();
    }

    private static void preencherSuperior(Object superiorInstance, Object newInstance) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method;
        Class<?> forName = newInstance.getClass();
        Class superior = superiorInstance.getClass();

        log.debug("Verificando campo: " + forName.getSimpleName().substring(0, 1).toLowerCase() + forName.getSimpleName().substring(1)
                + " da classe " + superior.getSimpleName());
        Field field = superior.getDeclaredField(forName.getSimpleName().substring(0, 1).toLowerCase() + forName.getSimpleName().substring(1));
        if (field.isAnnotationPresent(OneToMany.class)) {
            log.trace("Anotação OneToMany encontrada, pegando lista: " + "get" + priMaiuscula(forName.getSimpleName()) + " da classe " + superior.getSimpleName());
            method = superior.getMethod("get" + priMaiuscula(forName.getSimpleName()));
            List objects = (List) method.invoke(superiorInstance);
            if (objects == null) {
                objects = new ArrayList<>();
            }
            objects.add(newInstance);
            log.trace("Inserindo registro filho com : " + "set" + priMaiuscula(forName.getSimpleName()) + " na classe " + superior.getSimpleName());
            method = superior.getMethod("set" + priMaiuscula(forName.getSimpleName()), List.class);
            method.invoke(superiorInstance, objects);
        } else if (field.isAnnotationPresent(OneToOne.class)) {
            log.trace("Anotação OneToOne encontrada");
            log.trace("Inserindo registro filho com : " + "set" + priMaiuscula(forName.getSimpleName()) + " na classe " + superior.getSimpleName());
            method = superior.getMethod("set" + priMaiuscula(forName.getSimpleName()), forName);
            method.invoke(superiorInstance, newInstance);
        } else {
            log.trace("Anotação não encontrada");
        }
    }

    private static void preencherObjeto(String[] campos, Field field, Object newInstance) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        Class forName = newInstance.getClass();
        Method method;
        Campos informacoes = field.getAnnotation(Campos.class);
        String metodo = "set" + priMaiuscula(field.getName());
        String dadoSped = "";
        try {
            dadoSped = campos[informacoes.posicao()];
            log.debug("Invocando Metodo: " + metodo + " : "
                    + ((dadoSped.equals("")) ? "Campo Vazio" : dadoSped));

        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            log.debug("Campo não descrito no Sped");
        }

        if (!dadoSped.equals("")) {

            switch (informacoes.tipo()) {
                case 'C': {
                    method = forName.getMethod(metodo, String.class);
                    method.invoke(newInstance, campos[informacoes.posicao()]);
                    break;
                }
                case 'I': {
                    method = forName.getMethod(metodo, int.class);
                    method.invoke(newInstance, Integer.parseInt(campos[informacoes.posicao()]));
                    break;
                }
                case 'R': {
                    method = forName.getMethod(metodo, BigDecimal.class);
                    method.invoke(newInstance, new BigDecimal(campos[informacoes.posicao()].replace(",", ".")));
                    break;
                }
                case 'D': {

                    try {
                        method = forName.getMethod(metodo, Date.class);
                        method.invoke(newInstance, formato.parse(campos[informacoes.posicao()]));
                    } catch (ParseException ex) {
                        throw new LeitorExeption("Não foi possivel converter o campo para data " + campos[1], ex);
                    }
                    break;
                }
                default:
                    log.error("Campo tipo " + informacoes.tipo() + " não é reconhecido");
                    throw new LeitorExeption("Campo tipo " + informacoes.tipo() + " não é reconhecido");
            }
        }

    }

    private static String priMaiuscula(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
