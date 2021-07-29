package br.com.maratonajava.javacore.classes.aula67_exceptions;

import java.io.File;
import java.io.IOException;

/**
 * Curso Java Completo - Aula 70: Exceptions: lançamento de exceção pt 04
 */
public class Aula70_CheckedExceptionsTeste {
     public static void main(String[] args){
         try {
             /* As vezes a responsabilidade em tratar uma determinada exceção pode ser de quem chama um método que pode lançar uma exceção, e não do método
             em si. */
             /* Quando um método trata uma exceção (ou não) e lança essa para o método que o chamou, esse último deverá fazer o tratamento */
             /* Nesse caso, se não adicionássemos a chamada dentro do try, teriamos que declarar na assinatura do método main "throws IOException",
             porém, como já estamos no método main, declarar "throws IOException", pode parar o programa já que não há outro método que venha antes do 
             main que possa tratar a exceção */
             criarArquivo();
         } catch (IOException e) {
             e.printStackTrace();
         }
        
    }
    public static void criarArquivo() throws IOException{
        File file = new File("Teste.txt");
        
        try{
            System.out.println("Arquivo criado? "+file.createNewFile());
        }catch(IOException e){
            e.printStackTrace(); 
            throw e; //trata a exceção e devolve para quem chamou poder realizar também alguma forma de tratamento (pode vir a ser a melhor forma)
        }
    }
}
