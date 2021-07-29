package br.com.maratonajava.introducao;
/**
 * Curso Java Completo - Aula 22: Arrays parte 5 arrays multidimencionais
 * 
 * Valores padrões pós declaração 
        byte, short, long, int, float, double : 0 
        char : '\u0000' ESPAÇO EM BRANCO
        boolean: false
        reference: null
 */
public class A22_Arrays6 {
    public static void main(String[] args) {        
        //Array de arrays, com referencia para arrays de tamanhos diferentes
        int[][] dias = new int[3][]; //pelo menos, no primeiro colchete é necessário informar o tamanho
        //int [][] dias = {{0,0},{1,2,3},{0,0,0,0}}; //outra forma de iniciar valores
        
        dias[0] = new int[2];
        dias[1] = new int[]{1,2,3};
        dias[2] = new int[4];
       
        for(int[] dia : dias){ //foreach 
            System.out.println("");
            for(int aux : dia){
                System.out.println(aux);
            }
        }
    }
}
