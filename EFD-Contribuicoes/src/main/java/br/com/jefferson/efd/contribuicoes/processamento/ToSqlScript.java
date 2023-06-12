package br.com.jefferson.efd.contribuicoes.processamento;//ToSqlScript

import br.com.jefferson.efd.contribuicoes.blocos.Reg0000;
import br.com.jefferson.efd.contribuicoes.exceptions.ScriptException;
import br.com.jefferson.efd.contribuicoes.interfaces.BlocoSped;
import br.com.jefferson.efd.contribuicoes.util.ObjectFactory;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Table;
import org.apache.logging.log4j.LogManager;
import java.io.File;
import java.io.FileNotFoundException;
import javax.persistence.JoinColumn;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class ToSqlScript {

    private final Reg0000 sped;
    private int linha = 0, fileNumber = 1, totalLinha = 0;
    private File originalFile;
    private static final int 
            LIMITEGO = Integer.parseInt(ObjectFactory.getConfigPropertie("prop.contrib.script.limiteGO")),
            LIMITE_LINHA = Integer.parseInt(ObjectFactory.getConfigPropertie("prop.contrib.script.limitelinha"));
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(ToSqlScript.class.getName());
    private static final String 
            PREFIX = ObjectFactory.getJPAPropertie("prop.contrib.server.prefixbd"), 
            BANCO = ObjectFactory.getJPAPropertie("prop.contrib.server.schema");
    private BufferedWriter bw = null;

    public ToSqlScript(Reg0000 sped) {
        this.sped = sped;
    }

    private void gravarLinhaTxt(String texto) throws ScriptException, IOException {
        if (this.bw == null) {
            throw new ScriptException("Writer está nulo");
        }
        log.debug("Gerando linha no arquivo");
        if (linha >= LIMITEGO) {
            this.bw.write("GO");
            this.bw.newLine();
            linha = 0;
            totalLinha++;
        }
        this.bw.write(texto);
        this.bw.newLine();
        linha++;
        totalLinha++;
        if (totalLinha >= LIMITE_LINHA) {
            inicializarWriter();
            totalLinha = 0;
        }
        log.debug("Finalizada a geração de linha");

    }

    private void inicializarWriter() throws FileNotFoundException, IOException, ScriptException {
        if (this.originalFile == null) {
            throw new ScriptException("Arquivo de out está nulo");
        }
        if (fileNumber == 1) {
            log.info("Inicializando primeiro arquivo");
            OutputStream os = new FileOutputStream(this.originalFile); // nome do arquivo que será escrito
            Writer wr = new OutputStreamWriter(os); // Criação de um escritor
            this.bw = new BufferedWriter(wr); // adiciono a um escritor de buffer
            //Primeiro registro
            log.debug("Inserindo primeiro Script");

            this.bw.write("USE " + BANCO + ";");
            this.bw.newLine();
            this.bw.write("GO");
            this.bw.newLine();
            fileNumber++;
            if (this.bw == null) {
                throw new ScriptException("Writer não conseguiu ser iniciado com o InicializarWriter()");
            }
        } else {
            log.info("Encerrando arquivo " + (fileNumber - 1));
            this.bw.flush();
            this.bw.close();
            log.info("Inicializando arquivo " + fileNumber);

            File otherfile = new File(this.originalFile.getAbsolutePath().replace(".sql", fileNumber + ".sql"));
            this.bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(otherfile)));
            //Primeiro registro
            log.debug("Inserindo primeiro Script");

            this.bw.write("USE " + BANCO + ";");
            this.bw.newLine();
            this.bw.write("GO");
            this.bw.newLine();
            fileNumber++;
            if (bw == null) {
                throw new ScriptException("Writer não conseguiu ser iniciado com o InicializarWriter()");
            }
        }

    }

    public void gerarScript(File outputFile) throws ScriptException, IOException {

        this.originalFile = outputFile;
        log.info("Iniciando geracao de script sql");

        try {
            //Fluxo de saida de um arquivo
            inicializarWriter();
            if (this.bw == null) {
                throw new ScriptException("Writer não conseguiu ser iniciado");
            }

            //gravarLinhaTxt("BEGIN TRANSACTION;",br);
            for (Object nivel1 : writeObjectsScript(sped)) {
                log.debug("Inserindo script nivel 1 " + nivel1.getClass().getName());
                for (Object nivel2 : writeObjectsScript(nivel1)) {
                    log.debug("Inserindo script nivel 2 " + nivel2.getClass().getName());
                    for (Object nivel3 : writeObjectsScript(nivel2)) {
                        log.debug("Inserindo script nivel 3 " + nivel3.getClass().getName());
                        for (Object nivel4 : writeObjectsScript(nivel3)) {
                            log.debug("Inserindo script nivel 14 " + nivel4.getClass().getName());
                            for (Object nivel5 : writeObjectsScript(nivel4)) {
                                log.debug("Inserindo script nivel 5 " + nivel5.getClass().getName());
                                for (Object nivel6 : writeObjectsScript(nivel5)) {
                                    log.debug("Inserindo script nivel 6 " + nivel6.getClass().getName());
                                    for (Object nivel7 : writeObjectsScript(nivel6)) {
                                        log.debug("Inserindo script nivel 7 " + nivel7.getClass().getName());
                                        gravarLinhaTxt(sqlScript(nivel7));
                                    }
                                }
                            }
                        }
                    }

                }
            }

            log.debug("Finalizado os laços");
            /*
            br.write("IF @@ERROR = 0");
            br.newLine();
            br.write("    COMMIT");
            br.newLine();
            br.write("ELSE");
            br.newLine();
            br.write("    ROLLBACK");
            br.newLine();
            br.write("GO");
            br.newLine();
             */
        } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            log.error("Exception lançada ", ex);
            throw new ScriptException(ex);
        } catch (Exception ex) {
            log.error("Exception generica lançada ", ex);
            throw new ScriptException(ex);
        } finally {
            log.debug("Fechando writer");
            this.bw.flush();
            this.bw.close();
        }

    }

    private List<Object> writeObjectsScript(Object nivel) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, IOException, InvocationTargetException, ScriptException {

        if (nivel instanceof java.util.ArrayList) {
            log.debug("Registro é um lista");

            for (Object nivel2 : (ArrayList) nivel) {
                log.debug("Nivel 2 do writeObjectsScript");
                for (Object nivel3 : writeObjectsScript(nivel2)) {
                    log.debug("Nivel 3 do writeObjectsScript");
                    for (Object nivel4 : writeObjectsScript(nivel3)) {
                        log.debug("Nivel 4 do writeObjectsScript");
                        for (Object nivel5 : writeObjectsScript(nivel4)) {
                            log.debug("Nivel 5 do writeObjectsScript");
                            for (Object nivel6 : writeObjectsScript(nivel5)) {
                                log.debug("Nivel 6 do writeObjectsScript");
                                for (Object nivel7 : writeObjectsScript(nivel6)) {
                                    log.debug("Nivel 7 do writeObjectsScript");

                                }
                            }
                        }
                    }
                }

            }
        } else {
            log.debug("Criando registro " + nivel.getClass().getName());
            gravarLinhaTxt(sqlScript(nivel));
        }
        List<Object> returnAllSubs = returnAllSubs(nivel);
        log.debug("Total de Subclasses " + returnAllSubs.size());
        return returnAllSubs;
    }

    private List<Object> returnAllSubs(Object objeto) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //javax.persistence.OneToMany; mappedBy = "idPai"
        //javax.persistence.OneToOne;
        ArrayList<Object> subs = new ArrayList<>();
        Class forName = objeto.getClass();
        Method method;
        //Pega todos os campos da classe
        for (Field declaredField : objeto.getClass().getDeclaredFields()) {
            // Seleciona somente os que tem a anotação de objeto filho
            if (declaredField.isAnnotationPresent(javax.persistence.OneToMany.class)) {
                //Ve se o objeto são os filhos
                if (declaredField.getAnnotation(javax.persistence.OneToMany.class).mappedBy().equals("idPai")) {
                    //Faz o metodo get do campos 
                    String metodo = "get" + priMaiuscula(declaredField.getName());
                    method = forName.getMethod(metodo);
                    Object invoke = method.invoke(objeto);

                    //caso esteja preenchido retorna
                    if (invoke != null) {
                        subs.add(invoke);
                    }
                }
            } else if (declaredField.isAnnotationPresent(javax.persistence.OneToOne.class)) {
                if (declaredField.getAnnotation(javax.persistence.OneToOne.class).mappedBy().equals("idPai")) {

                    String metodo = "get" + priMaiuscula(declaredField.getName());
                    method = forName.getMethod(metodo);
                    Object invoke = method.invoke(objeto);
                    if (invoke != null) {
                        subs.add(invoke);
                    }
                }
            }
        }
        log.debug("Total de subclasses: " + subs.size());
        return subs;
    }

    public String sqlScript(Object objeto) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuilder script = new StringBuilder();
        script.append("INSERT INTO [").append(PREFIX).append("].[");
        Table ClassAnnotation = objeto.getClass().getAnnotation(javax.persistence.Table.class);
        script.append(ClassAnnotation.name()).append("] (");

        ArrayList<Field> fields = new ArrayList<>();
        Method method;
        Class forName = objeto.getClass();

        //Pega todos os objetos que tem a anotação
        for (Field declaredField : objeto.getClass().getDeclaredFields()) {
            if (declaredField.isAnnotationPresent(javax.persistence.Column.class)
                    || declaredField.isAnnotationPresent(javax.persistence.Id.class)) {
                fields.add(declaredField);
            } else if (declaredField.isAnnotationPresent(javax.persistence.JoinColumn.class)) {
                JoinColumn annotation = declaredField.getAnnotation(javax.persistence.JoinColumn.class);
                if (annotation.name().equals("ID_PAI")) {
                    fields.add(declaredField);
                }
            }
        }

        //coloca os campos de insert
        String valores = ") VALUES (";

        for (int i = 0; i < fields.size(); i++) {
            Field field = fields.get(i);
            log.trace("Campo: " + field.getName() + " Tipo: " + field.getGenericType());
            if (field.isAnnotationPresent(javax.persistence.Id.class)) {
                String metodo = "set" + priMaiuscula(field.getName());
                method = forName.getMethod(metodo);
                method.invoke(objeto);
            }

            //Pegando valor da variavel
            String metodo = "get" + priMaiuscula(field.getName());
            method = forName.getMethod(metodo);
            Object toString = method.invoke(objeto);

            //Verificando se a variavel está preenchida
            //Caso não esteja nem é colocado no insert
            if (toString != null) {

                if (field.isAnnotationPresent(javax.persistence.Column.class)
                        || field.isAnnotationPresent(javax.persistence.Id.class)) {
                    Column CollumAnotation = field.getAnnotation(javax.persistence.Column.class);
                    script.append("[").append(CollumAnotation.name()).append("] ");
                } else if (field.isAnnotationPresent(javax.persistence.JoinColumn.class)) {
                    JoinColumn annotation = field.getAnnotation(javax.persistence.JoinColumn.class);
                    if (annotation.name().equals("ID_PAI")) {
                        script.append("[").append(annotation.name()).append("] ");
                    }
                }

                if (toString instanceof Date) {
                    valores += "'" + sdf.format(toString) + "'";
                } else if (toString instanceof String) {
                    valores += "N'" + toString.toString().replace("'", "") + "'";
                } else if (toString instanceof BlocoSped) {
                    valores += "N'" + ((BlocoSped) (toString)).getId() + "'";
                } else {
                    valores += toString.toString();
                }

                //Caso não seja o ultimo colocar uma virgula para separa
                if (i != fields.size() - 1) {
                    script.append(",");
                    valores += ",";
                }
            } else {
                log.debug("Campo é nulo");
            }
        }

        //coloca os valores dos inserts
        script.append(valores);

        script.append(");");
        log.debug("Linha gerada " + script.toString().replace(",)", ")"));
        return script.toString().replace(",)", ")");
    }

    private static String priMaiuscula(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

}
