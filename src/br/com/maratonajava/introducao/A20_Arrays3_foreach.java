package br.com.maratonajava.introducao;
/**
 *
 * Curso Java Completo - Aula 20: Arrays parte 3 foreach
 * 
 * Valores padrões pós declaração 
        byte, short, long, int, float, double : 0 
        char : '\u0000' ESPAÇO EM BRANCO
        boolean: false
        reference: null
 */
public class A20_Arrays3_foreach {
    
    public static void main(String[] args) {
        int[] numeros = new int[5]; //forma convencional
        int[] numeros2 = {1,2,3,4,5}; //segunda forma de declaração, com inicialização
        int[] numeros3 = new int[]{1,2,3,4,5}; //terceira forma, combinação das outras duas.
        
        //foreach - o tipo da var de controle tem que ser o tipo declarado no array
        for(int aux : numeros2){ 
            System.out.println(aux);
        }
        
    }
}
