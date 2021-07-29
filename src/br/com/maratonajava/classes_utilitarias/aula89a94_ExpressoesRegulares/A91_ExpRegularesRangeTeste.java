package br.com.maratonajava.classes_utilitarias.aula89a94_ExpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Curso Java Completo - Aula 91: Expressões regulares pt 03
 * 
 * Como procurar um range de caracteres
 *  ex.:
 * "[abc]"                      - procura as ocorrencias de a,b e c minúsculas
 * "[abcABC]"                   - procura as ocorrencias de a, b, c, A, B, C
 * "[a-zA-Z]"                   - procura as ocorrencias no internvalo de a à z, e, A à Z
 * "[a-zA-Z0-9]"                - procura as ocorrencias no internvalo a-zA-Z e digitos de 0 à 9 (exp. 0-9)
 */
public class A91_ExpRegularesRangeTeste {
    public static void main(String[] args) {   
        //String regex = "[a-zA-Z0-9]";
        //String texto = "cafeBABE";  
        //Em Java caso se queira imprimir um número hexadecimal, esse número hexadecimal é representado começando com ZERO, X ou x , e um número
        int numeroexa = 0x123;
        //regex aqui, define a procura as ocorrencias de números hexadecimais, porém, não está bem definida (veja em Quantificadores - próxima aula)
        String regex = "0[xX][0-9a-fA-F]"; 
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";  
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 01234567890123456789");//apenas exemplifica os indices 
        System.out.println("Expressão: "+matcher.pattern());
        
        System.out.println("Posições encontradas: ");
        /* Enquanto o matcher.find for encontrando o padrão dentro do texto, 'matcher.start' retorna as posições e 'matcher.group' retorna os resultados */
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
        System.out.println();
        System.out.println("Número hexadecimal: "+numeroexa);
    }
}
