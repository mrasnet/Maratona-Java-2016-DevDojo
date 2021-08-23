package br.com.maratonajava.classes_utilitarias.aula103a114_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Curso Java Completo - Aula 103: NIO pt 01 Introdução as novas classes Path, Paths, Files
 * 
 * Se aprofundando um pouco mais sobre entrada/saída:
 * 
 * Tudo que vimos até agora no pacote Java IO é considerado como apenas o básico. A certificação oracle considera isso fundamental - nada mais que isso
 * Iremos utilizar o novo pacote introduzido no Java 7 - NIO ( NEW IO ) - novas classes, interfaces, código melhorado foi introduzido juntamente com
 * esse pacote.
 * 
 * Existem 3 classes que devemos reparar bastante e que podem acabar nos confundindo:
 * 
 * 1. Path      - (interface) - introduzida para substituir a classe File, nada mais é do que uma conversão que ocorre entre as duas - conversão entre objetos
 * 
 * E para trabalhar com o Path foram introduzidas mais 2 classes: 
 * 2. Paths     - (classe concreta) - para criar um 'Path' temos que utilizar a classe 'Paths' 
 * 3. Files     - possui métodos estáticos que irão trabalhar com os objetos do tipo Path - novas operações básicas - copiar, deletar arquivos
 * 
 * Como podemos ver a diferença nos nomes são muito parecidas, entretanto, no código é muito igual. Essas são então, as três classes básicas do pacote NIO
 */
public class A103_criandoPathTeste {
    public static void main(String[] args) {
        //Pegando um Path - o arg do método get recebe um 'var args' podemos fazer das seguintes formas:
        Path p = Paths.get("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\"
            + "classes_utilitarias\\aula103a114_NIO\\arquivo.txt");
        //Separando com virgula no nome do arquivo - retirando os \\
        Path p2 = Paths.get("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\"
            + "classes_utilitarias\\aula103a114_NIO", "arquivo.txt");
        //Separando com virgula um ou mais diretórios
        Path p3 = Paths.get("C:", "Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\"
            + "classes_utilitarias\\aula103a114_NIO", "arquivo.txt");
        //Até mesmo separando tudo da seguinte forma se quisersssemos
        Path p4 = Paths.get("C:", "Users", "Neto", "Desktop", "workspaceback-end", "MARATONAJAVA", "src", "br", "com", "maratonajava",
               "classes_utilitarias", "aula103a114_NIO", "arquivo.txt");
        
        //Essa é uma das novidades do pacote NIO - por um lado fica maior, porém pode ser melhor de visualizar
        
    }
}