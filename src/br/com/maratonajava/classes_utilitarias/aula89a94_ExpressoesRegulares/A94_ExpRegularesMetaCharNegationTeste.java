package br.com.maratonajava.classes_utilitarias.aula89a94_ExpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Curso Java Completo - Aula 94: Expressões regulares pt 06
 * 
 * Meta caractere de Negação ^ (acento circunflexo): utilizado para excluir algo que não queremos na expressão regular
 * 
 * ex.: [^abc]      - aqui estamos dizendo que queremos algo que não seja 'a', 'b' ou 'c'. Dependendo da lógica aplicada, o meta caractere de negação pode 
 * vir a ser muito útil.
 */
public class A94_ExpRegularesMetaCharNegationTeste {
    public static void main(String[] args) {  
        //Em uma lista de arquivos, queremos pegar todos os arquivos que tenham 'proj'
        String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagram, texto, foto";  
        //Uma forma simples de utilizar o char de negação: queremos tudo que comece com 'proj' e seja seguido de qualquer coisa que não seja vírgula
        String regex = "proj([^,])*"; //queremos isso ZERO ou MAIS vezes - Quantificador (* = zero ou mais vezes)
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 012345678901234567890123456789");//apenas exemplifica os indices 
        System.out.println("Expressão: "+matcher.pattern());
        
        System.out.println("Posições encontradas: ");
        /* Enquanto o matcher.find for encontrando o padrão dentro do texto, 'matcher.start' retorna as posições e 'matcher.group' retorna os resultados */
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
        System.out.println(); 
    }
    /* NOTA QUE PODE VIR A SER ÚTIL: 
       obs: Para utilizar o caractere "\" na expressão (sem valer como caractere de escape e sim como o caractere de texto normal) usar "\\x{005C}", 
       onde "\\x" é para "\x" e "{005C}" é o código hexadecimal no padrão Unicode para "\". Também pode-se usar "\\u005C". */
}
