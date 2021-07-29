package br.com.maratonajava.introducao;

/**
 *
 * Curso Java Completo - Aula 21: Arrays parte 4 arrays multidimensionais
 * 
 * Valores padrões pós declaração 
        byte, short, long, int, float, double : 0 
        char : '\u0000' ESPAÇO EM BRANCO
        boolean: false
        reference: null
 */
public class A21_Arrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2]; //pelo menos, no primeiro colchete é necessário informar o tamanho
        dias[0][0] = 30;
        dias[0][1] = 31; 
        dias[1][0] = 28;
        dias[1][1] = 29;
        
        System.out.println("tamanho do array1: "+dias[0].length);
        System.out.println("tamanho do array2: "+dias[1].length);
        System.out.println("\nCom For convencional...");
        
        for(int i = 0; i<dias.length; i++){
            System.out.println("endereço de memória: "+dias[i]); //imprime o endereço de memória do array
            
            for(int j = 0; j<dias[i].length; j++){ //Todo array em java é um tipo de dado referencial, logo, objeto.
                System.out.println(dias[i][j]);
            }
        }
        
       System.out.println("\nCom Foreach...");
       
       for(int[] ref : dias){ //imprimir o array multiD. com foreach
           System.out.println("endereço de memória: "+ref);
           
           for(int dia : ref){
               System.out.println(dia);
           }
       }
    }
}
