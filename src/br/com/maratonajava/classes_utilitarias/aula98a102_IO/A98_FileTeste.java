package br.com.maratonajava.classes_utilitarias.aula98a102_IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Curso Java Completo - Aula 98: IO pt 01 Classe File para arquivos
 * 
 * Principais classes que iremos utilizar: 
 * 
 * 1. File               - classe mais básica para criação de arquivos
 * 2. FileReader         - permite criar e ler arquivos - não é muito otimizada para a leitura de grandes arquivos
 * 3. BufferedReader     - uma otimização da FileReader - boa para a leitura de arquivos grandes uma vez que cria um buffer na memória
 * 4. FileWriter         - mesma coisa da FileReader com a diferença que ao invés de ler, escreve no arquivo
 * 5. BufferedWriter     - otimização da FileWriter, muito mais utilizada
 * 
 * Alguns métodos interessantes do File:
 *      createNewFile       - cria o arquivo      - retorna um boolean
 *      canRead             - verifica se o arquivo tem permição para leitura   - retorna um boolean
 *      getPath             - retorna o path como definido no construtor do File
 *      getAbsolutePath     - retorna o caminho completo        - quando o arquivo é criado só com o nome fica mais clara a diferença
 *      isDirectory         - Para saber se é um diretório sem arquivo      - retorna um boolean
 *      isHidden            - Para saber se um arquivo é oculto             - retorna um boolean
 *      lastModified        - retorna um long                   - tempo em milisegundos da última modificação do arquivo
 *      exists              - verifica se o arquivo existe      - retorna um boolean
 *      delete              - deleta o arquivo                  - retorna um boolean
 */
public class A98_FileTeste {
    public static void main(String[] args) {
        /* Caso seja colocado apenas o nome do arquivo, o mesmo será criado dentro da pasta do projeto. Caso queiramos que seja criado dentro de um 
        diretório específico, temos que informar o diretório:   - como estamos usando Windows, usamos o char de escape 'contra-barra' para podermos escrever 
        o contra-barra */
        //File file = new File("arquivo.txt");  
        File file = new File("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\classes_utilitarias\\"
        + "aula98a102_io\\arquivo.txt");
        
        try {
            /* Para criar o arquivo precisamos chamar o 'createNewFile' que retornará um boolean e precisa de um tratamento de exceção  - o arquivo só será
            criado se não existir  */
            System.out.println("Arquivo criado? "+file.createNewFile());
            System.out.println("Arquivo tem permição de leitura? "+file.canRead());
            System.out.println("Path do arquivo: "+file.getPath()); 
            System.out.println("Path completo do arquivo: "+file.getAbsolutePath()); 
            System.out.println("É diretório? "+file.isDirectory());
            System.out.println("É um arquivo oculto? "+file.isHidden());
            //passamos o retorno do 'lastModified' para o construtor do Date para nos retornar a data com um mínimo de formatação
            System.out.println("Última modificação: "+new Date(file.lastModified()));
            
            if(file.exists())
                System.out.println("Arquivo excluído? "+file.delete());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
