package br.com.maratonajava.javacore.classes;

/**
 *
 * Curso Java Completo - Aula 31: Métodos com parâmetros tipo reference pt 01
 * Curso Java Completo - Aula 32: Passagem de objeto como parâmetro e this pt 02
 */
public class A31a32_Professor {
    public String nome;
    public String matricula;
    public String cpf;
    public String rg;
    
    public void imprime(A31a32_Professor aux){
        System.out.println("------------------");
        System.out.println("Nome: "+aux.nome);
        System.out.println("Matricula: "+aux.matricula);
        System.out.println("CPF: "+aux.cpf);
        System.out.println("RG: "+aux.rg);
        
    }
    //Aula 32: Passagem de objeto como parâmetro e this pt 02
    public void imprime2(){
        System.out.println("------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("CPF: "+this.cpf);
        System.out.println("RG: "+this.rg);     
    }
}
