package br.com.maratonajava.classes_utilitarias.aula89a94_ExpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Curso Java Completo - Aula 90: Expressões regulares pt 02
 * 
 * Os metas caracteres ajudam a facilitar a exp. regular. Haverá situações onde uma exp. regular pode conter de 20 a 30 caracteres em diante, o que torna 
 * complicado de entender, devido a isso, os meta caracteres foram criados para facilitar a busca de determinados caracteres
 * 
 * Há vários tipos de Meta Caracteres, mas os principais são:
 *  \d  - todos os digitos
 *  \D  - tudo que não for digito
 *  \s  - espaços em branco: \t \n \f \r
 *  \S  - caracteres que não são espaços em branco
 *  \w  - caracteres de palavras: a-z A-Z, digitos e o underline
 *  \W  - tudo que não for caractere de palavra (tudo que não está incluso no \w)
 */
public class A90_ExpRegularesMetaCharTeste {
     public static void main(String[] args) {   
        //devido o contrabarra ser utilizado no java, temos que utilizar um caractere de escape (que é uma contrabarra), para poder usar a contrabarra
        String regex = "\\w";
        String texto = "#@aba2123bab3311a\t_";  
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 012345678901234567890123456789");//apenas exemplifica os indices 
        System.out.println("Expressão: "+matcher.pattern());
        
        System.out.println("Posições encontradas: ");
        //Enquanto o matcher for encontrando o padrão dentro do texto, 'matcher.start' retorna as posições onde esse padrão foi encontrado
        while(matcher.find()){
            System.out.print(matcher.start()+" ");
        }
        System.out.println("");
    }
}
