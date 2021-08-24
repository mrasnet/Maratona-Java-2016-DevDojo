package br.com.maratonajava.classes_utilitarias.aula103a114_NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Curso Java Completo - Aula 103: NIO pt 01 Introdução as novas classes Path, Paths, Files
 * Curso Java Completo - Aula 104: NIO pt 02 Uso básico das classes Path, Paths, Files
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
public class A103a104_criandoPathTeste {
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
        
        /* Essa é uma das novidades do pacote NIO - por um lado fica maior, porém pode ser melhor de visualizar. Iremos utilizar os mesmo métodos utilizados
        com a classe File, só que com as classe Path, Paths e Files */
        System.out.println("Caminho: "+p4.toAbsolutePath());
        
        //Principais métodos que temos na classe Files:
        
        //Podemos realizar conversões entre File e Path da seguinte forma:
        File file = p4.toFile(); //Path possui o método 'toFile' para retornar um File
        Path path = file.toPath();//File possui o método 'toPath' para retornar um Path
        
        //Para criar um novo diretório, não usamos 'mkdir'
        Path path1 = Paths.get("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\"
            + "classes_utilitarias\\aula103a114_NIO", "pasta");
        
        //estamos indicando pastas e subpastas - nota: aparentemente não precisamos informar todo o caminho, até certo caminho já funciona - pesquisar depois 
        Path arquivo = Paths.get("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\"
            + "classes_utilitarias\\aula103a114_NIO", "pasta", "subpasta", "sub-subpasta", "arquivo.txt");
        
        try {
            /* A classe File retorna false caso se tente criar um mesmo arquivo/diretório duas vezes, porém a Files irá retornar uma execeção em tempo de 
            execução. */
            
            //Para criarmos um único diretório, usaremos 'createDirectory', caso queiramos criar mais de um, usaremos o 'createDirectories'
            if(Files.notExists(path1))//Aqui só irá criar se não existir
                Files.createDirectory(path1);
            
            /* 'getParent' retorna todas as pastas menos a última. Dessa forma conseguimos utilizar o Path 'arquivo' para criar somente as pastas, já que
            sem o 'getParent' iria transformar 'arquivo.txt' em uma pasta também. Lembrando que 'createDirectories' não necessita ser utilizado junto do
            'getParent', aqui está sendo usado para demonstração apenas. */
            if(Files.notExists(arquivo.getParent()))
                Files.createDirectories(arquivo.getParent());
            
            //Criando um arquivo    - temos também o método 'exists'
            if(Files.notExists(arquivo))
                Files.createFile(arquivo);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //Copiando arquivos e renomeando - se tentarmos copiar novamente com o mesmo nome iremos receber um 'FileAlreadyExistsException'.
        //Diretório de onde vai ser copiado
        Path source = Paths.get("C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\classes_utilitarias\\"
        + "aula98a102_io\\folder\\arquivo4.txt");
        //As seguintes formas funcionam, porém alguma delas podem ser consideradas 'gambiarra'.
        //Path target = Paths.get(path1.toAbsolutePath()                +"\\arquivo4Copiado.txt");
        //Path target = Paths.get(path1.toAbsolutePath().toString()     +"\\arquivo4Copiado.txt");
        //Path target = Paths.get(path1.toString()                      +"\\arquivo4Copiado.txt");
        
        //Dessa forma funciona abolutamente normal
        Path target = Paths.get(path1+"\\arquivo4Copiado.txt");
        
        try {
            /* Com o 'copyOptions' podemos mudar a regra definida por padrão definindo um 'replace' para arquivos que já existem. Assim quando um arquivo
            de mesmo nome já existir, esse será substituído pelo o novo. */
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);//Há várias opções no 'StandardCopyOption'
            
            //Temos o metodo 'delete' porém temos também o 'deleteIfExists' que deleta somente se o arquivo existir - retorna true ou false
            Files.deleteIfExists(target);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}