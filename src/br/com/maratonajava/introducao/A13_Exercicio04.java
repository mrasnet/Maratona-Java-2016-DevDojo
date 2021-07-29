package br.com.maratonajava.introducao;

/**
 *
 * Curso Java Completo - Aula 13: Controle de fluxo switch e exercícios
 */
public class A13_Exercicio04 {
    
    public static void main(String[] args) {
        int dia=7;
        //tipos aceitados pelo o switch: char, int, byte, short, enum e String
        switch(dia){
            case 2: 
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia útil"); break;
            case 7: 
            case 1: System.out.println("Final de Semana"); break;
                
            default: System.out.println("Valor inválido!");    
        }
    }
}
