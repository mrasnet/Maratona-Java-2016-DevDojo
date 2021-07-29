package br.com.maratonajava.javacore.classes.aula60_clss_abstratas;

/**
 * Curso Java Completo - Aula 60: Classes abstratas pt 01
 * Curso Java Completo - Aula 61: Classes abstratas pt 02
 */
public abstract class Funcionario extends Pessoa {
    //Classes abstratas não podem ser instanciadas, servem apenas para serem extendidas
    //Não se pode ter uma classe abstrata com "final": ex.: final abstract classe...
    protected String clt;
    protected double salario;
    
    
    @Override
    public String toString(){
        return "\nNome: "+this.nome+"\nCLT: "+this.clt+"\nSalario: "+this.salario;
    }
    //Ao definir um método como abstrato, a classe também deverá ser abstrata, e esse método não tem corpo.
    /* se define um metodo concreto numa classe abstrata quando esse método for ser usado da mesma forma por todas as suas subclasses */
    //métodos abstratos deverão ser sobrescritos nas classes filhas
    public abstract void calculaSalario();
    
    /* "imprime" apesar de ser um método abstrato da classe abstrata Pessoa, pode ser sobrescrito numa classe abstrata filha. dessa forma, evitou ter que 
    sobrescrever nas duas classes concretas filhas de Funcionario. Isso é possível pq uma classe abstrata pode ter métodos abstratos e não abstratos 
    (concretos) */
    @Override
    public void imprime() {
        System.out.println("\nNome: "+this.nome+"\nCLT: "+this.clt+"\nSalario: "+this.salario);
    }
    
    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
       
}
