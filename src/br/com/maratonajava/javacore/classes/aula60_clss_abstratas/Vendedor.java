package br.com.maratonajava.javacore.classes.aula60_clss_abstratas;

/**
 * Curso Java Completo - Aula 60: Classes abstratas pt 01
 * Curso Java Completo - Aula 61: Classes abstratas pt 02
 */
public class Vendedor extends Funcionario{
    private int totalVendas;
    
    public Vendedor(){
    }

    public Vendedor(String nome, String clt, double salario, int totalVendas) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
        this.totalVendas = totalVendas;
    }
    
    @Override
    public void calculaSalario(){
       this.salario += (this.totalVendas*0.05);
    }
    
    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

}
