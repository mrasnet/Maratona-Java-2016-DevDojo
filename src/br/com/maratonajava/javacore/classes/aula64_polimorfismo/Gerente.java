package br.com.maratonajava.javacore.classes.aula64_polimorfismo;

/**
 * Curso Java Completo - Aula 64: Polimorfismo pt 01
 * 
 * Polimorfismo: uma var de referencia pode se comportar de diferentes formas com base no tipo do objeto a qual ela está referenciando
 */
public class Gerente extends Funcionario{
    private double participacaoNosLucros;
    
    public Gerente(String nome, double salario, double participacaoNosLucros) {
        super(nome, salario);
        this.participacaoNosLucros = participacaoNosLucros;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + this.participacaoNosLucros;
    }    
  
    public double getParticipacaoNosLucros() {
        return participacaoNosLucros;
    }

    public void setParticipacaoNosLucros(double participacaoNosLucros) {
        this.participacaoNosLucros = participacaoNosLucros;
    }
    
}
