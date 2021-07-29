package br.com.maratonajava.javacore.classes.aula64_polimorfismo;

/**
 * Curso Java Completo - Aula 64: Polimorfismo pt 01
 * 
 * Polimorfismo: uma var de referencia pode se comportar de diferentes formas com base no tipo do objeto a qual ela está referenciando
 */
public abstract class Funcionario {
   protected String nome;
   protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
   
   @Override
   public String toString(){
       return "\nNome: "+this.nome+"\nSalario: "+this.salario;
   }
   
   public abstract void calcularPagamento();
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
      
}
