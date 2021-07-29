package br.com.maratonajava.javacore.testes;

import br.com.maratonajava.javacore.classes.A35a37_ExerEstudante;
/**
 * Curso Java Completo - Aula 35: Exercício sobre métodos
 * Curso Java Completo - Aula 37: Modificador de acesso private, get e set pt 01
 * Curso Java Completo - Aula 37: Modificador de acesso private, get e set pt 02
 */
public class A35a37_ExerEstudanteTeste {
    public static void main(String[] args) {
        A35a37_ExerEstudante estudante = new A35a37_ExerEstudante();
        estudante.setNome("Jéssica Lopes");
        estudante.setIdade(21); 
        /* O código abaixo não compila sem o casting, pois todos os literais com ponto flutuante são considerados double
        pelo o java. E float não pode receber um double sem perda de informação, para fazer isso funcionar podemos escrever
        o seguinte: ex.: float x = 0.0f;  - Java orientação a objetos Caelum */
        estudante.setNotas(new float[]{5 , 7.5f, 10});
        //A letra f, que pode ser maiúscula ou minúscula, indica que aquele literal deve ser tratado como um float.
        estudante.imprimir();
    }
}
