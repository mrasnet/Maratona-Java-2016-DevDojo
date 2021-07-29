package br.com.maratonajava.javacore.classes.aula56_modificador_final;

/**
 * Curso Java Completo - Aula 56: Modificador Final
 */
public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Honda Civic");
        carro.setMarca("Honda");
        carro.getComprador().setNome("Matheus");
        
        System.out.println(carro);
        System.out.println("-------------");
        carro.imprime();
        System.out.println("Velocidade LIM: "+Carro.VELOCIDADE_LIMITE);
    }
    
}
