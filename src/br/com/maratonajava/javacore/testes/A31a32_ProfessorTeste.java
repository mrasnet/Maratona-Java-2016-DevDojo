package br.com.maratonajava.javacore.testes;

import br.com.maratonajava.javacore.classes.A31a32_Professor;

/**
 * Aula 31: Métodos com parâmetros tipo reference pt 01
 * Aula 32: Passagem de objeto como parâmetro e this pt 02
 */
public class A31a32_ProfessorTeste {
    public static void main(String[] args) {
        A31a32_Professor prof = new A31a32_Professor();
        A31a32_Professor prof2 = new A31a32_Professor();
    
        prof.cpf="123.456.789-98";
        prof.matricula="123456789";
        prof.nome="Juliana";
        prof.rg="11223344";
        
        prof2.cpf="123.222.889-99";
        prof2.matricula="123459998";
        prof2.nome="Patrício";
        prof2.rg="11225555";
        //quando passa tipo reference como argumento, a variável de parâmetro do método fará referencia ao objeto passado no argumento 
        prof.imprime(prof); //Assim, tá passando o endereço do objeto na memória
        //prof e não prof2 tá chamando o método, não ocorre erro pq é o objeto para qual está sendo feita a referencia o mais importante      
        prof.imprime(prof2); 
        System.out.println("\nCom this... *****");
        //Aula 32: Passagem de objeto como parâmetro e this pt 02
        //Aqui, imprime o objeto sem precisar usar esse mesmo objeto como argumento, o que seria redundancia, logo o mais recomendado! 
        prof.imprime2();
        prof2.imprime2();
    }
}
