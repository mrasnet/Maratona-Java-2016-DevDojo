package br.com.maratonajava.javacore.testes;

import br.com.maratonajava.javacore.classes.A38a40_Funcionario;
/**
 * Curso Java Completo - Aula 38: Sobrecarga de métodos
 * Curso Java Completo - Aula 39: Construtores e sobrecarga de construtores pt 01
 * Curso Java Completo - Aula 40: Construtores e sobrecarga de construtores pt 02
 */
public class A38a40_FuncionarioTeste {
    public static void main(String[] args) {
        A38a40_Funcionario func = new A38a40_Funcionario("Matheus", "222.333.444-99", 8000, "12343219");
        A38a40_Funcionario func2 = new A38a40_Funcionario();
        
        func.imprime();
        System.out.println();
        
        func.init("Matheus", "222.333.444-99", 10500, "12343219");
        func.imprime();
        System.out.println(); //saltando uma linha
        //Se alteresse o init sem utilizar sobrecarga, o código aqui iria quebrar
        //A JVM executa o método que corresponde com os parâmetros passados
        func2.init("Cristina", "111.222.333-88", 1700); 
        func2.imprime();
    }
}
