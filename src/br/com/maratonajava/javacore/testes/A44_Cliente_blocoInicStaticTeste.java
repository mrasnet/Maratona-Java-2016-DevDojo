package br.com.maratonajava.javacore.testes;

import br.com.maratonajava.javacore.classes.A44_Cliente_blocoInicStatic;

/**
 * Curso Java Completo - Aula 44: Blocos de inicialização estático
 */
public class A44_Cliente_blocoInicStaticTeste {
    public static void main(String[] args) {
        A44_Cliente_blocoInicStatic c = new A44_Cliente_blocoInicStatic();
        System.out.println("exibindo parcelas possíveis");
        
        for(int i : A44_Cliente_blocoInicStatic.getParcelas()){
            System.out.print(i+" ");
        }
        
        System.out.println("\nTamanho: "+A44_Cliente_blocoInicStatic.getParcelas().length);
    }
}
