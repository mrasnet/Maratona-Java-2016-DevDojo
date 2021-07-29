package br.com.maratonajava.javacore.testes;

import br.com.maratonajava.javacore.classes.A42a43_Carro_ModificadorStatic;

/**
 * Curso Java Completo - Aula 42: Modificador static
 * Curso Java Completo - Aula 43: Métodos Estáticos 
 */
public class A42a43_Carro_ModificadorStaticTeste {
    public static void main(String[] args){
        A42a43_Carro_ModificadorStatic c1 = new A42a43_Carro_ModificadorStatic("BMW",280);
        A42a43_Carro_ModificadorStatic c2 = new A42a43_Carro_ModificadorStatic("Audi",275);
        A42a43_Carro_ModificadorStatic c3 = new A42a43_Carro_ModificadorStatic("Mercedes",290);
        
        c1.imprime();
        c2.imprime();
        c3.imprime();
        
        System.out.println("\n############# Mudando velocidade Limite ###############\n");
        
        A42a43_Carro_ModificadorStatic.setVelocidadeLimite(220);
        
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
