package br.com.maratonajava.javacore.classes.aula60_clss_abstratas;

/**
 * Curso Java Completo - Aula 60: Classes abstratas pt 01
 * Curso Java Completo - Aula 61: Classes abstratas pt 02
 */
public abstract class Pessoa {
    protected String nome;
    /* A primeira classe concreta (não abstrata) terá que sobrescrever os métodos abstratos definidos numa classe abstrata. Nesse caso, Gerente e Vendedor
    são concretas, e Funcionario é abstrato. Se uma classe abstrata filha de outra classe abstrata implementar um método abstrato de sua classe pai, suas
    classes filhas não precisarão implementar o mesmo método (Isso é feito quando o comportamento do método é o mesmo para ambas as classes filhas). */ 
    public abstract void imprime();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
