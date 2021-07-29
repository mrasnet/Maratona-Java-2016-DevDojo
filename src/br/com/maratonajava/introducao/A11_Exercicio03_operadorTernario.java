package br.com.maratonajava.introducao;

/**
 *
 * Curso Java Completo - Aula 11: Controle de fluxo: Tabela verdade e mais.
 * Operador Ternário
 */
public class A11_Exercicio03_operadorTernario {

    public static void main(String[] args) {
        double salario = 4000;
        double taxaImposto;
        /*
        if (salario < 1000) {
            imposto = "5%";
        } else if (salario >= 1000 && salario < 2000) {
            imposto = "10%";
        } else if (salario >= 2000 && salario < 4000) {
            imposto = "15%";
        } else {
            imposto = "20%"; //salario superior a 4000 
        }
        */        
        
        // estrutura do operador ternário : <var> = <condição> ? <true> : <false>; 
        //Ou simplesmente: <condição> ? <true> : <false>; , se dentro de um sout
        //Com operador ternário (Nesse caso, temos operador ternário dentro de operador ternário), não recomendado! 
        taxaImposto = salario <1000 ? 0.05 : salario >= 1000 && salario < 2000 ? 0.10 
                : salario >= 2000 && salario < 4000 ? 0.15 : 0.20;
                
        System.out.println("O imposto para o salário de "+salario+" é de: "+(taxaImposto*100)+"%, ---> R$"+salario*taxaImposto);
    }
}
