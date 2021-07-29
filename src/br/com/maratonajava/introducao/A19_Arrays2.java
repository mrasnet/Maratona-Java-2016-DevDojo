package br.com.maratonajava.introducao;

/**
 * Curso Java Completo - Aula 19: Arrays parte 2
 * 
 * Valores padrões pós declaração 
        byte, short, long, int, float, double : 0 
        char : '\u0000' ESPAÇO EM BRANCO
        boolean: false
        reference: null
*/
public class A19_Arrays2 {
    
    public static void main(String[] args) {
        int[] idades = new int[3];
        
        //imprime as posições com seus valores padrões pós declaração
        System.out.println("idade 1: "+idades[0]);
        System.out.println("idade 2: "+idades[1]);
        System.out.println("idade 3: "+idades[2]);
    }
}
