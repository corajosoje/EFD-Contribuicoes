package br.com.jefferson.efd.contribuicoes.processamento;//Leitor

import br.com.jefferson.efd.contribuicoes.annotations.*;
import br.com.jefferson.efd.contribuicoes.blocos.Reg0000;
import br.com.jefferson.efd.contribuicoes.exceptions.LeitorException;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import br.com.jefferson.efd.contribuicoes.util.ObjectFactory;
import br.com.jefferson.efd.contribuicoes.util.Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class Leitor {

    public static final Logger log = LogManager.getLogger(Leitor.class.getName());
    private static final SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy");

    /**
     * Pasta onde está os resgistros
     */
    private static final String BLOCO = "br.com.jefferson.efd.contribuicoes.blocos";

    private final BufferedReader reader;

    private final int linhas;
    private final String hashCode;

    private final Reg0000 sped = new Reg0000();
    private Object nivel1 = null, nivel2 = null, nivel3 = null, nivel4 = null, nivel5 = null, nivel6 = null;

    public Leitor(File file) throws FileNotFoundException, IOException {
        //File file = new File(pathToFile);
        //FileReader fileReader = new FileReader(file);

        this.hashCode = Util.getHash(file);
        BufferedReader FreshReader = new BufferedReader(new FileReader(file));
        this.linhas = (int) FreshReader.lines().count();
        FreshReader.close();
        this.reader = new BufferedReader(new FileReader(file));
    }

    /**
     *
     * @return numero de linhas do arquivo
     */
    public int getLinhas() {
        return linhas;
    }

    /**
     * Verifica se a linha é um registro Sped
     *
     * @param conteudo linha de um registro para verificar
     * @return assimilado ao conteudo Sped
     */
    public static boolean verificaLinhaSped(String conteudo) {

        if (conteudo.length() < 7 || conteudo.equals("") || conteudo == null) {
            log.trace("Fim do arquivo");
            return false;
        } else {
            return (conteudo.substring(0, 1).equals("|")
                    && conteudo.substring(5, 6).equals("|")
                    && conteudo.substring(conteudo.length() - 1).equals("|"));
        }
    }

    public Reg0000 getSped() {
        return this.sped;
    }

    public boolean verificarDuplicidade() {
        log.trace("Verificando duplicidado do arquivo no banco de dados pelo hash: " + hashCode);
        EntityManager manager = null;
        try {
            manager = ObjectFactory.getEntityManager();
            Reg0000 verif = manager.createNamedQuery("Reg0000.findByHashfile", Reg0000.class).setParameter("hashfile", hashCode).getSingleResult();
            return verif != null;
        } catch (javax.persistence.NoResultException ex) {
            return false;
        } finally {
            manager.close();
        }
    }

    public String getlinha() throws IOException {
        String linha = this.reader.readLine();
        log.trace("Linha Registro da EFD metodo getlinha : " + linha);
        return linha;
    }

    /**
     * Verifica e retorna os campos de um registro Sped
     *
     * @param linha Linha do arquivo Sped
     * @return campos em ordem da linha do arquivo
     */
    private String[] getCampos(String linha) {
        if (verificaLinhaSped(linha)) {
            return linha.split("\\|", -1);
        } else {
            throw new LeitorException("Linha não é um registro Sped");
        }
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
                        throw new LeitorException("Não foi possivel converter o campo para data " + campos[1], ex);
                    }
                    break;
                }
                default:
                    log.error("Campo tipo " + informacoes.tipo() + " não é reconhecido");
                    throw new LeitorException("Campo tipo " + informacoes.tipo() + " não é reconhecido");
            }
        }

    }

    private static String priMaiuscula(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public void processarLinha(String conteudo, int linha) {
        if (conteudo == null) {
            log.trace("Linha passada para o metodo é nula");
        } else {
            String[] campos = getCampos(conteudo);
            log.debug("Linha Registro da EFD: " + conteudo);
            log.trace("Verificando linha registro");
            if (campos == null) {
                throw new LeitorException("Não foi possivel interpertar registro: " + conteudo);
            }
            Method method;
            try {
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
                    Class<?> forName = Class.forName(BLOCO + ".Reg" + campos[1]);
                    Object newInstance = forName.getConstructor().newInstance();

                    log.debug("Trabalhando na classe: " + BLOCO + ".Reg" + campos[1]);

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
                    Class<?> forName = Class.forName(BLOCO + ".Reg" + campos[1]);
                    Object newInstance = forName.getConstructor().newInstance();

                    log.debug("Trabalhando na classe: " + BLOCO + ".Reg" + campos[1] + " Quantidade de campos:" + campos.length);

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
                    method = forName.getMethod("setIdPai", BlocoSped.class);

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
            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException | InstantiationException | NoSuchFieldException ex) {
                throw new LeitorException(ex);
            }
        }
    }

    public void gravar() {
        EntityManager manager = null;
        try {
            manager = ObjectFactory.getEntityManager();
            log.trace("Iniciando Transação");
            manager.getTransaction().begin();
            log.trace("Persistindo Sped");
            manager.persist(sped);
            manager.getTransaction().commit();
        } finally {
            log.trace("Fechando manager");
            manager.close();
        }
    }

    public void close() {
        log.trace("Fechando Reader");
        try {
            this.reader.close();
        } catch (IOException ex) {
            throw new LeitorException("Não foi possivel fechar o reader", ex);
        }
    }
}
