package br.com.maratonajava.javacore.classes.aula62_interfaces;

/**
 * Curso Java Completo - Aula 62: Interfaces pt 01
 * Curso Java Completo - Aula 63: Interfaces pt 02
 * 
 * Uma interface diz o que se deve fazer e não como fazer
 */
public interface Tributavel {//convenção para nomes de interface: <nome>+sufixo(el) (transforma em adjetivo)
//quando não é possivel usar o nome da interface dessa forma se coloca um I a frente do nome da interface
//Não se extende uma interface, se implementa ***, e todos os métodos são abstratos.
//Em interfaces, mesmo que não se queira na declaração definir um método como abstract, ele será por padrão 'public abstract'
//Todos os atributos de uma interface são considerados constantes.    
public static final double IMPOSTO = 0.2; //por padrão, todas as variáveis são 'public static final'

//Quando se cria um método que está sendo sobrescrito numa classe, o modificador de acesso não pode ser mais restritivo 
//ordem: private > default (pacote - quando não põem nada) > protected  > public
public abstract void calculaImposto();

}
