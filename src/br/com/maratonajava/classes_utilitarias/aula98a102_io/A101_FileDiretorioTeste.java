package br.com.maratonajava.classes_utilitarias.aula98a102_io;

import java.io.File;
import java.io.IOException;

/**
 * Curso Java Completo - Aula 101: IO pt 04 Classe File para diretórios
 * 
 * Utilizaremos novamente a classe File, agora com foco em diretórios   - antes utilizamos File para a criação de arquivos, porém podemos usá-la também para
 * trabalhar com diretórios.
 */
public class A101_FileDiretorioTeste {
    //Apesar de não ser recomendado, adicionamos na assinatura do main o throws IOException, apenas para termos o bloco de código mais 'limpo'
    public static void main(String[] args) throws IOException {
        //Uma vez que o diretório já existe, não será criado novamente, a var irá fazer referencia ao que já existe     - igual como arquivos
        File diretorio = new File("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\classes_utilitarias\\"
        + "aula98a102_io\\folder");
        boolean b = diretorio.mkdir();//mkdir cria um diretório e retorna um boolean    - retorna false se já tiver sido criado
        System.out.println("Diretorio criado? "+b);
        //Para criar o arquivo no diretório criado, poderiamos informar o caminho absoluto, entretanto temos a seguinte forma mais prática:
        File arquivo = new File(diretorio,"arquivo4.txt");//passando como argumento ambos diretório e nome do arquivo 
        boolean b2 = arquivo.createNewFile();
        System.out.println("Arquivo criado? "+b2);
        
        /* renomeando o arquivo      - Ao executar a primeira vez o arquivo será renomeado - substituído - porém ao re-executarmos o programa, como o 
        arquivo foi renomeado, seu antigo nome ficou disponível, assim é recriado aquele arquivo novamente, mas não é renomeado porque já existe um com o 
        mesmo nome definido - o anteriormente renomeado */
        File arquivoNovo = new File(diretorio, "arquivo renomeado.txt");
        boolean b3 = arquivo.renameTo(arquivoNovo);
        System.out.println("Arquivo renomeado? "+b3);
        //renomeando o diretório        - mesma coisa aqui, ao reexecutarmos o programa, recriou o diretório - também recriou os arquivos nesse diretório
        File diretorioNovo = new File("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\classes_utilitarias\\"
        + "aula98a102_io\\folder2");
        boolean b4 = diretorio.renameTo(diretorioNovo);
        System.out.println("Diretório renomeado? "+b4);
        //Se os arquivos ou diretórios criados forem deletados, ao reexecurtamos o programa os arquivos serão recriados
        
        //Essa é a forma mais básica e rápida para buscar arquivos em diretórios, veremos posteriormente outras formas muito mais robustas 
        buscarArquivos();
    }
    
    public static void buscarArquivos(){
        File file = new File("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\classes_utilitarias\\"
        + "aula98a102_io\\folder2");
        
        System.out.println("\nLista arquivos:");
        String[] arquivosList = file.list();//file.list retorna um array de strings
        for(String arquivo : arquivosList){
            System.out.println(arquivo);
        }
    }
}
