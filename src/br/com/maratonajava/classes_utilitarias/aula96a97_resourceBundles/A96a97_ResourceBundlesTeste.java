package br.com.maratonajava.classes_utilitarias.aula96a97_resourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Curso Java Completo - Aula 96: Resource Bundles pt 01
 * Curso Java Completo - Aula 97: Resource Bundles pt 02 (literalmente só ensina a criar pelo o IDE intellij)
 * 
 * Internacionalização   - Imagine que estamos criando um sistema e surge a seguinte tarefa, traduzir todas as mensagens de saída do sistema para um idioma 
 * estrangeiro.
 * Solução: resource bundle = pacote de recursos    - é um arquivo onde colocamos todas as mensagens de texto, sendo essas preparadas de acordo com o idioma
 * da mensagem;
 * 
 * Regras para criação e uso do arquivo Resource Bundle:
 * 1. O Java irá procurar esse arquivo dentro do pacote, dentro do class path (dentro do pacote padrão - src);
 * 2. Podemos dar vários tipos de nomes, entretanto segue a regra: nomeArquivo_idioma_país.properties   - ex.: arquivo_en_US.properties 
 * 3. Incorpora herança e sobrescrita dos keys
 * 
 * Vantagem em utilizar o Resource Bundle:
 * Uma vez que nossos arquivos Resource Bundle estão prontos, podemos mudar o idioma apenas mudando a localização em tempo de execução
 * 
 * Ordem em que os Resource Bundles serão procurados - processo recursivo do Java para procurar os Resource Bundles:
 * suponhamos que estamos bucando o seguinte Resource Bundle referente à definição: 
 * ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("fr","CA"));
 * 
 * 1. O Java vai tentar buscar o arquivo 'messages_fr_CA.properties'
 * 2. Caso não encontre, irá buscar o arquivo 'messages_fr.properties'
 * 3. Caso também não encontre o anterior, irá buscar na localização padrão da máquina, aqui, 'messages_pt_BR.properties'
 * 4. Caso também não encontre o anterior, irá buscar no idioma padrão da máquina, aqui, 'messages_pt.properties'
 * 5. Caso não encontre, irá buscar apenas pelo o baseName 'messages.properties'
 * 6. Caso também não encontre, irá lançar uma exceção 'MissingResourceException' 
 */
public class A96a97_ResourceBundlesTeste {
    public static void main(String[] args) {
        /* O construtor do ResourceBundle é sobrecarregado, no caso abaixo, esse recebe uma string com o baseName (oq vem antes do primeiro underline no 
        nome do arquivo), em seguida temos que passar um locale. Caso não seja passado, o locale irá ficar o padrão do sistema operacional. */
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en","US"));
        
        /* Para pegar as mensagens chamamos o método 'getString' que recebe uma string key definida. Se passarmos uma key que não existe será lançada uma 
        exceção em tempo de execução */
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));//Aqui, acessa a key definida no messages.properties genérico
        System.out.println();
        //'Locale.getDefault()' irá retornar o locale padrão do sistema operacional, que no presente caso, é PT-BR
        rb = ResourceBundle.getBundle("messages", Locale.getDefault());
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));//Aqui, acessa a mesma key show, só que sobrescrita em 'messages_pt_BR.properties'
         
    }
}
