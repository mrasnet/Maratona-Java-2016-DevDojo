package br.com.maratonajava.javacore.testes;

import br.com.maratonajava.javacore.classes.A27a33_Calculadora_varargs;
/**
 * inic. Curso Java Completo - Aula 27: Introdução a métodos
 * Curso Java Completo - Aula 33: Passagem de parâmetros varargs
 */
public class A27a33_Calculadora_varargsTeste {
    public static void main(String[] args) {
        A27a33_Calculadora_varargs calc = new A27a33_Calculadora_varargs();
        int num = 12, num2 = 6;
        
        //Para tipos primitivos, quando se passa um como argumento para um método, se está passando na verdade uma cópia
        calc.Soma(num, num2);
        calc.Subtrai(num, num2);
        calc.multiplica(num, num2);
        System.out.println("A divisão é "+calc.divide(num, num2));
        System.out.println("---------------------");
        
        calc.divideNumeros(20, 0);
        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(numeros);
        //ou... passando números diretamente no argumento, no caso o tipo especificado no método cria um vetor
        calc.somaVarArgs(1,2,3,4,5);
    }
}
