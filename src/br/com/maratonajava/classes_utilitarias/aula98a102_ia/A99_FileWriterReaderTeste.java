package br.com.maratonajava.classes_utilitarias.aula98a102_ia;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Curso Java Completo - Aula 99: IO pt 02 FileWriter e FileReader
 * 
 * Principais classes que iremos utilizar: 
 * 
 * 1. File               - classe mais básica para criação de arquivos
 * 2. FileReader         - permite criar e ler arquivos - não é muito otimizada para a leitura de grandes arquivos
 * 3. BufferedReader     - uma otimização da FileReader - boa para a leitura de arquivos grandes uma vez que cria um buffer na memória
 * 4. FileWriter         - mesma coisa da FileReader com a diferença que ao invés de ler, escreve no arquivo
 * 5. BufferedWriter    - otimização da FileWriter, muito mais utilizada
 * 
 * Como se pode ver, utilizar as classes FileWriter e FileReader não é tão prático, ex.: como quando precisamos dar um enter ao escrever - com '\n' - 
 * como quando precisamos inicializar um array para ler o conteúdo do arquivo. Por esse motivo foram criadas as classes BufferedWriter e BufferedReader
 */
public class A99_FileWriterReaderTeste {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\classes_utilitarias\\"
        + "aula98a102_io\\arquivo2.txt");
        
        /*FileWriter recebe um filename ou um arquivo file. Iremos passar um file, porque conforme iremos ver nas próximas aulas, quando começamos a 
        trabalhar com io começamos a encadear diversas classes, essas sendo altamente coesivas (com finalidades muito específicas).

        Aqui, diferentemente do que ocorre ao criar um objeto File, que após ainda necessita do 'createNewFile' para de fato criar o arquivo, ao instanciar
        o objeto do FileWriter, o arquivo já é criado.
        */
        try (FileWriter fw = new FileWriter(file);  //try with resources        - no final fecha automaticamente os arquivos
            FileReader fr = new FileReader(file)){
            //O parâmetro boolean é referente ao 'append', irá anexar tudo ao que já existe no arquivo, sem sobrescrever - por padrão sobrescreve - 'false'
            //ex.: FileWriter fw = new FileWriter(file, true); 
            
            fw.write("Escrevendo minha primeira mensagem num arquivo do Java\nPulando uma linha");
            /* Toda vez que escrevemos num arquivo, de alguma forma estamos trabalhando com buffer, por isso durante o processo, pode ser que alguma coisa
            que escrevemos fique nesse buffer, e para garantirmos que tudo que tá lá venha para o arquivo, temos que dar um 'flush' no arquivo. */
            fw.flush();
            //fw.close();    
                 
            char[] in = new char[500]; 
            //read recebe um array de char e retorna o número de caracteres lidos - no array será armazenados os caracteres do arquivo
            int size = fr.read(in);
            
            System.out.println("Tamanho: "+size);
            for(char c : in){
                System.out.print(c);
            }
            //fr.close();
                    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
