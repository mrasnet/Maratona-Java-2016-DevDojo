package br.com.maratonajava.javacore.classes.aula60_clss_abstratas;

/**
 * Curso Java Completo - Aula 60: Classes abstratas pt 01
 * Curso Java Completo - Aula 61: Classes abstratas pt 02
 */
public class FuncionarioTeste {
    public static void main(String[] args) {
     Gerente geren = new Gerente("Juliana","22233-44",2000);
     Vendedor vend = new Vendedor("Ana","22323-44",1500,5000);
     geren.calculaSalario();
     vend.calculaSalario();
     System.out.println(geren);
     System.out.println(vend);
     
     System.out.println("------------------");
     geren.imprime();
     vend.imprime();
     
    }   
}
