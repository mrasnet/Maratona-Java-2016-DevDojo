package br.com.maratonajava.javacore.classes.aula45_uml;

/**
 * Curso Java Completo - Aula 45: UML e Associação de classes
 */
public class Endereco {
    private String rua;
    private String bairro;
    private String estado;
    /* private Pessoa[] pessoa;  - uml cardinalidade: um endereço possui muitas pessoas, porém isso torna a classe muito 
    acoplada com a classe pessoa, impedido assim de utilizar ela em outros projetos - nesse caso teremos então apenas 
    um relacionamento unidirecional, e não bidirecional como nos outros */
    //Geralmente em diagramas de classes não se coloca os atributos de relacionamento
}
