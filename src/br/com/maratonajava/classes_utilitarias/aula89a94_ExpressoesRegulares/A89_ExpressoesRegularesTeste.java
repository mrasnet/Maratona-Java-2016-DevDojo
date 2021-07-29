package br.com.maratonajava.classes_utilitarias.aula89a94_ExpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Curso Java Completo - Aula 89: Expressões regulares pt 01
 * 
 * Expresssões Regulares (ou regex) é como uma linguagem dentro de outra linguagem, várias linguagens oferecem suporte para Expressões Regulares. Ela é 
 * muito poderosa quando precisamos utilizar padrões para buscar informações dentro de grandes arquivos de texto.
 * 
 * No Java iremos utilizar duas classes para trabalhar com expressões regulares, a primeira será a 'Pattern', e a segunda a 'matcher'
 * A primeira será responsável por buscar padrões e a segunda por encontrar esses padrões.
 */
public class A89_ExpressoesRegularesTeste {
    public static void main(String[] args) {
        String regex = "aba";
        /* O comportamento das exp. regulares: No geral, vão sempre começar da esquerda para a direita, e uma vez que aquela posição foi utilizada em uma 
        expressão, exp. regulares não reutilizam a posição de um char que já deu 'match' */
        String texto = "abababa";//aqui é considerado o aba de 0 a 2, mas não será considerado o aba da posição 2 a 4
        //Expressão Regular é um monte de meta caracteres que nós vamos montar uma expressão e precisamos compilá-la    
        Pattern pattern = Pattern.compile(regex);
        //Esse padrão irá procurar dentro do texto
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 0123456789");//apenas exemplifica os indices 
        System.out.println("Expressão: "+matcher.pattern());
        
        System.out.println("Posições encontradas: ");
        //Enquanto o matcher for encontrando o padrão dentro do texto, 'matcher.start' retorna as posições onde esse padrão foi encontrado
        while(matcher.find()){
            System.out.print(matcher.start()+" ");
        }
        System.out.println("");
    }
}
