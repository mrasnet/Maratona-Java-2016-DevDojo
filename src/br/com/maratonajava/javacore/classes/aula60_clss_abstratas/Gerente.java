package br.com.maratonajava.javacore.classes.aula60_clss_abstratas;

/**
 * Curso Java Completo - Aula 60: Classes abstratas pt 01
 * Curso Java Completo - Aula 61: Classes abstratas pt 02
 */
public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }
    
    @Override
    public void calculaSalario(){
       this.salario += (this.salario*0.2);
    }
    
}
