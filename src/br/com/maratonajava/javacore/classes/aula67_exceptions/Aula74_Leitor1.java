package br.com.maratonajava.javacore.classes.aula67_exceptions;

/**
 * Curso Java Completo - Aula 74 : Exceptions: try-with-resources pt 08
 */
public class Aula74_Leitor1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando o leitor 1");
    }  
}
