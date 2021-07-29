package br.com.maratonajava.javacore.classes.aula62_interfaces;

/**
 * Curso Java Completo - Aula 62: Interfaces pt 01
 * Curso Java Completo - Aula 63: Interfaces pt 02
 * 
 * A leitura: Produto é um Tributável e um transportável (Produto implements Tributavel, Transportavel)
 */
public class Produto implements Tributavel, Transportavel {
    /* Quando se implementa uma interface é obrigatório implementar seus métodos abstratos (todos os métodos de uma interface são abstratos - menos os 
    declarados com default na assinatura do método) */
    //É possível implementar mais de uma interface
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return "\nNome: "+this.nome+"\nPeso: "+this.peso+"\nPreço: "+this.preco+
                "\nPreço Final (com imposto): "+this.precoFinal+"\nValor Frete: "+this.valorFrete;
    }
    
    @Override
    public void calculaImposto() {
        this.precoFinal = this.preco+(this.preco*IMPOSTO);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco/this.peso*0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
    
}
