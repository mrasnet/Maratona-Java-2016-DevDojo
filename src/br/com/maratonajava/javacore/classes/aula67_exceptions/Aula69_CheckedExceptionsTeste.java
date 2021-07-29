package br.com.maratonajava.javacore.classes.aula67_exceptions;

import java.io.File;
import java.io.IOException;

/**
 * Curso Java Completo - Aula 69: Exceptions: Exceções checked pt 03
 */
public class Aula69_CheckedExceptionsTeste {
    public static void main(String[] args){
        criarArquivo();
        
    }
    public static void criarArquivo(){
        File file = new File("Teste.txt");
        /* Todas as classes que são subsclasses de exception quando colocadas no catch precisam ter um método dentro do try que possivelmente lance alguma
        exceção dessa classe. Caso não tenha apresentará um erro de compilação  */
        try{
            System.out.println("Arquivo criado? "+file.createNewFile());//o arquivo criado fica dentro da pasta do projeto
        }catch(IOException e){
            e.printStackTrace(); //imprime o tipo de exceção
        }
    }
}
