package br.com.maratonajava.introducao;

/*
 * Curso Java Completo - Aula 16: Exercício estrutura de repetição
 */
public class A16_Exercicio05 {
    
    public static void main(String[] args) {
        int valor = 10000; //prática recomendada para se evitar alterar o valor no laço, caso o valor venha a mudar.  
        for(int i=1 ; i<=valor; i++){
            if(i%2==0)
                System.out.println(i);
        } 
    }
}
