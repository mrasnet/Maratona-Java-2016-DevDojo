package br.com.maratonajava.javacore.classes;
/**
 * Curso Java Completo - Aula 42: Modificador static
 * Curso Java Completo - Aula 43: Métodos Estáticos 
 */
public class A42a43_Carro_ModificadorStatic {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite=240;
    
    //static define um atributo da classe em si, e não especifico de um objeto
    public A42a43_Carro_ModificadorStatic(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public A42a43_Carro_ModificadorStatic() {
    }
    
    public void imprime(){
        System.out.println("----------------------------------------");
        System.out.println("Nome do carro: "+this.nome);
        System.out.println("Velocidade Max: "+this.velocidadeMax);
        System.out.println("Velocidade Lim: "+velocidadeLimite);
    }
    
    public String getCarro() {
        return nome;
    }

    public void setCarro(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    //quando há duas variáveis com mesmo nome, uma de escopo maior e outra menor, o java dará prioridade a var de escopo mais próximo
    public static void setVelocidadeLimite(double velocidadeLimite){
        A42a43_Carro_ModificadorStatic.velocidadeLimite = velocidadeLimite;
    }
    //Não se pode e não se deve, acessar atributos não estáticos atráves de métodos estáticos.
    //Um método pode ser estático se esse não acessar atributos não estáticos(podendo ou não ter parâmetros)
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }
}
