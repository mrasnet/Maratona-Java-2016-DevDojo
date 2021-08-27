package br.com.maratonajava.classes_utilitarias.aula103a114_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Curso Java Completo - Aula 107: NIO pt 05 Relativizando paths
 * 
 * Relativizar path é quando temos dois paths e queremos eliminar o que tem em comum entre eles.
 */
public class A107_RelativizarPathTeste {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/desktop");
        Path classe = Paths.get("/home/desktop/workspace/java/Pessoa.java");
        //O queremos é relativizar esse caminho, nós queremos saber a partir do primeiro como chegar no segundo - 'Pessoa.java'
        Path pathToClass = dir.relativize(classe);
        System.out.println("Caminho relativo: "+pathToClass+"\n");
        
        //Porém nem sempre tudo ocorre tão perfeito assim:
        Path absoluto1 = Paths.get("/home/desktop");
        Path absoluto2 = Paths.get("/Users/local");
        Path absoluto3 = Paths.get("/home/desktop/workspace/java/Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/Funcionario.java");
        
        //Leitura: "Como estou no path1 como chegar no path2"
        System.out.println("1 absoluto1 com absoluto3: "+absoluto1.relativize(absoluto3));
        System.out.println("2 absoluto3 com absoluto1: "+absoluto3.relativize(absoluto1));
        //Se não tem nada em comum significa dizer que possivilmente estão na mesma raiz 
        System.out.println("3 absoluto1 com absoluto2: "+absoluto1.relativize(absoluto2));
        System.out.println("4 absoluto1 com relativo1: "+relativo1.relativize(relativo2));
        /* No 5 temos uma exceção em tempo de execução 'IllegalArgumentException' - o java não consegue descobrir como fazer o caminho do absoluto para o 
        relativo. Mesmo que seja voltado para a raiz, o java não sabe para onde ir depois, não há como saber em que pasta 'temp' está localizado */
        System.out.println("5 absoluto1 com relativo2: "+absoluto1.relativize(relativo1));
        
    }
}
