package br.com.maratonajava.javacore.classes.aula67_exceptions;

/**
 * Curso Java Completo - Aula 71: Exceptions: bloco finally pt 05
 */
public class Aula71_CheckedExceptionsTeste_blocoFinally {
    public static void main(String[] args) {
        abrirArquivo();
    }
    
    public static void abrirArquivo(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Executando a leitura do arquivo");
            System.out.println("Escrevendo no arquivo");
            throw new Exception(); //simula o lançamento de uma exceção 
            
        }catch(Exception e){
            System.out.println("Dentro do bloco catch");
            e.printStackTrace();
        }finally{/* Há situações que um dado código necessita sempre ser executado, havendo exceção lançada ou não. ex.: quando se trabalha com uma
            bases de dados, é necessário fechar a conexão, ou quando precisa fechar um arquivo que foi aberto. colocar a instrução responsável dentro 
            de um bloco finally é a solução, uma vez que esse bloco sempre será executado. */
            System.out.println("Fechando o arquivo");
        }
        /* Se nosso método retornasse algo, o bloco finally seria executado antes do retorno. É possível ainda usar try + finally somente, porém o mais 
        comum é try + catch + finally */
    }
}
