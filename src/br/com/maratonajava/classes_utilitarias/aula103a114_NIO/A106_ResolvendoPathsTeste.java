package br.com.maratonajava.classes_utilitarias.aula103a114_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Curso Java Completo - Aula 106: NIO pt 04 Resolvendo paths
 * 
 * As vezes recebemos o caminho de um path separadamente - dois paths - , juntar as partes para criar um caminho é 'resolver um path'
 * 
 */
public class A106_ResolvendoPathsTeste {
    public static void main(String[] args) {
        //Para utilizar o 'Paths.get' não necessariamente o caminho tem que existir - aqui os exemplos são hipotéticos
        Path dir = Paths.get("home\\Desktop");
        Path arquivo = Paths.get("workspace\\projeto\\arquivoProjeto.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);
        
        //O 'resolve' é basicamente isso. O problema é quando temos caminhos absolutos e caminhos relativos
        Path absoluto = Paths.get("/home/Desktop");// o uso do ' / ' é na forma como é utilizado no Linux
        Path relativo = Paths.get("workspace");
        Path file = Paths.get("file.txt");
        
        /* NOTA: Diferença entre Caminho Absoluto x Caminho Relatvo - com relação a um diretório especifico, temos:
        *Com o absoluto, em qualquer diretório que se esteja, se desejarmos acessá-lo, podemos - informando o caminho completo até ele
        *Com o relativo, será buscado através do diretorio em que se esteja - não utilizamos a BARRA para o primeiro diretório - assim será buscado a partir
        do diretório que se está.
        
        Em '1' temos um caminho absoluto e um caminho relativo, o caminho relativo pode ser conectado ao absoluto
        A exemplo do que ocorre em 4 e 5, é tentado resolver o caminho absoluto com outro contexto - temos um caminho absoluto sendo conectado a um relativo,
        porém, o caminho absoluto é 'absoluto', não necessita nada antes dele - ele mesmo se resolve - por esse motivo ele foi repetido em '4' e '5'. 
        
        Assim, sempre que tentarmos utilizar um caminho relativo/file para resolver com um caminho absoluto, será retornado o caminho absoluto apenas. Do 
        contrário, funciona normalmente.
        
        Em '6' temos um arquivo que tenta resolver com um caminho relativo, porém o resultado não é algo válido para nós.
        */
        System.out.println("1 absoluto com relativo:    "+absoluto.resolve(relativo));
        System.out.println("2 absoluto com arquivo:     "+absoluto.resolve(file));
        System.out.println("3 relativo com arquivo:     "+relativo.resolve(file));
        System.out.println("4 relativo com absoluto:    "+relativo.resolve(absoluto));
        System.out.println("5 arquivo com absoluto:     "+file.resolve(absoluto));
        System.out.println("6 arquivo com relativo:     "+file.resolve(relativo));
        
    }
}
