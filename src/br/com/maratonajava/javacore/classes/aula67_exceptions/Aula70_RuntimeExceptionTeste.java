package br.com.maratonajava.javacore.classes.aula67_exceptions;

/**
 * Curso Java Completo - Aula 70: Exceptions: lançamento de exceção pt 04
 */
public class Aula70_RuntimeExceptionTeste {
    public static void main(String[] args) {
        //Erros em tempo de execução(RuntimeException) não precisam ser tratados (com try e catch) apesar de serem aqui
        try{
            divisao(10, 0);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());//Retorna uma mensagem de erro que pode ser exibida ao cliente dependendo da organização do código
            e.printStackTrace();//retorna a mensagem de erro que pode ser lida por um desenvolvedor
        }
        
        System.out.println("exemplo texto");
    }
    
    private static void divisao(int num, int num2){ // adicionar na assinatura aqui 'throws IllegalArgumentException' é opcional
        if(num2==0){
            throw new IllegalArgumentException("Passe um valor diferente de ZERO");/* Permite adicionar como argumento uma mensagem para facilitar a 
        leitura da exceção */
        }
        int result = num/num2;
        System.out.println(result);
    }
}
