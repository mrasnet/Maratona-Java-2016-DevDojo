package br.com.maratonajava.javacore.classes.aula62_interfaces;

/**
 * Curso Java Completo - Aula 62: Interfaces pt 01
 * Curso Java Completo - Aula 63: Interfaces pt 02
 */
public class Carro implements Tributavel, Transportavel {
    /* Uma interface pode ser implementada por mais de uma classe, e o comportamento dos métodos sobrescritos podem diferir completamente da forma que é
    sobrescrito em outra classe que implementa os mesmos métodos */
    @Override
    public void calculaImposto() {
        System.out.println("devolver valor do imposto");
    }

    @Override
    public void calculaFrete() {
        System.out.println("calcula o valor da frete");
    }
    
}
