package br.com.jefferson.efd.processamento;//ToSqlScript

import br.com.jefferson.efd.blocos.Reg0000;
import br.com.jefferson.efd.exception.ScriptExeption;
import br.com.jefferson.efd.interfaces.BlocoSped;
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
import javax.persistence.JoinColumn;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class ToSqlScript {

    private final Reg0000 sped;
    private int linha = 0;
    private final static int LIMITE = 30;
    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(ToSqlScript.class.getName());

    public ToSqlScript(Reg0000 sped) {
        this.sped = sped;
    }

    private void gravarLinhaTxt(String texto, BufferedWriter br) throws IOException {

        if (linha == LIMITE) {
            br.write("GO");
            br.newLine();
            linha = 0;
        }
        br.write(texto);
        br.newLine();
        linha++;
    }

    public void gerarScript(File outputFile) throws ScriptExeption, IOException {
        log.info("Iniciando geracao de script sql");
        BufferedWriter br = null;
        try {
            //Fluxo de saida de um arquivo
            OutputStream os = new FileOutputStream(outputFile); // nome do arquivo que será escrito
            Writer wr = new OutputStreamWriter(os); // criação de um escritor
            br = new BufferedWriter(wr); // adiciono a um escritor de buffer

            //Primeiro registro
            log.debug("Inserindo primeiro Script");
            gravarLinhaTxt("USE EFDICMS;", br);
            gravarLinhaTxt("GO", br);
            //gravarLinhaTxt("BEGIN TRANSACTION;",br);

            for (Object nivel1 : writeObjectsScript(br, sped)) {
                log.debug("Inserindo script nivel 1 " + nivel1.getClass().getName());
                for (Object nivel2 : writeObjectsScript(br, nivel1)) {
                    log.debug("Inserindo script nivel 2 " + nivel2.getClass().getName());
                    for (Object nivel3 : writeObjectsScript(br, nivel2)) {
                        log.debug("Inserindo script nivel 3 " + nivel3.getClass().getName());
                        for (Object nivel4 : writeObjectsScript(br, nivel3)) {
                            log.debug("Inserindo script nivel 14 " + nivel4.getClass().getName());
                            for (Object nivel5 : writeObjectsScript(br, nivel4)) {
                                log.debug("Inserindo script nivel 5 " + nivel5.getClass().getName());
                                for (Object nivel6 : writeObjectsScript(br, nivel5)) {
                                    log.debug("Inserindo script nivel 6 " + nivel6.getClass().getName());
                                    for (Object nivel7 : writeObjectsScript(br, nivel6)) {
                                        log.debug("Inserindo script nivel 7 " + nivel7.getClass().getName());
                                        gravarLinhaTxt(sqlScript(nivel7), br);
                                    }
                                }
                            }
                        }
                    }

                }
            }

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
            throw new ScriptExeption(ex);
        } finally {
            br.close();
        }

    }

    private List<Object> writeObjectsScript(BufferedWriter br, Object nivel) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, IOException, InvocationTargetException {

        if (nivel instanceof java.util.ArrayList) {
            log.debug("Registro é um lista");

            for (Object nivel2 : (ArrayList) nivel) {
                for (Object nivel3 : writeObjectsScript(br, nivel2)) {
                    for (Object nivel4 : writeObjectsScript(br, nivel3)) {
                        for (Object nivel5 : writeObjectsScript(br, nivel4)) {
                            for (Object nivel6 : writeObjectsScript(br, nivel5)) {
                                for (Object nivel7 : writeObjectsScript(br, nivel6)) {

                                }
                            }
                        }
                    }
                }

            }
        } else {
            log.debug("Criando registro " + nivel.getClass().getName());
            gravarLinhaTxt(sqlScript(nivel), br);
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
        return subs;
    }

    public String sqlScript(Object objeto) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuilder script = new StringBuilder();
        script.append("INSERT INTO [dbo].[");
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
            log.debug("Campo: " + field.getName() + " Tipo: " + field.getGenericType());
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
        return script.toString().replace(",)", ")");
    }

    private static String priMaiuscula(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

}
