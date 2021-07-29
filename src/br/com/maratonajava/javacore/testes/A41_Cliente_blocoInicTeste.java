package br.com.maratonajava.javacore.testes;

import br.com.maratonajava.javacore.classes.A41_Cliente_blocoInic;

/**
 * Curso Java Completo - Aula 41: Blocos de inicialização
 */
public class A41_Cliente_blocoInicTeste {
    
    public static void main(String[] args) {
        A41_Cliente_blocoInic c = new A41_Cliente_blocoInic();
        
        System.out.println("exibindo parcelas possíveis");
        
        for(int i : c.getParcelas()){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
