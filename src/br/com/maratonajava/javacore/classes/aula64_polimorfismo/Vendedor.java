package br.com.maratonajava.javacore.classes.aula64_polimorfismo;

/**
 * Curso Java Completo - Aula 64: Polimorfismo pt 01
 * 
 * Polimorfismo: uma var de referencia pode se comportar de diferentes formas com base no tipo do objeto a qual ela está referenciando
 */
public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome,salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (this.totalVendas*0.05);
    }    
    
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
}
