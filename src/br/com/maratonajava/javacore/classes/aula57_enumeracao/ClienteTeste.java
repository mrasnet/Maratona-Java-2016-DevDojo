package br.com.maratonajava.javacore.classes.aula57_enumeracao;

/**
 * Curso Java Completo - Aula 57: Enumeração pt 01
 * Curso Java Completo - Aula 58: Enumeração pt 02
 * Curso Java Completo - Aula 59: Enumeração pt 03
 * 
 * Alguns dos conceitos aqui raramente serão aplicados na vida real, e são estudados mais para a certificação***
 */
public class ClienteTeste {
    public static void main(String[] args) {
        //Enumeração se chama da mesma forma que se chama um atributo estático 
        Cliente c = new Cliente("Marcos", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        //dessa forma garante-se que o usuário da classe não passe um valor diferente dos definidos em TipoCliente e Cliente
        System.out.println(c);
        
        System.out.println("\nID: "+TipoCliente.PESSOA_FISICA.getId());
        System.out.println("ID: "+TipoCliente.PESSOA_JURIDICA.getId());
    }
}
