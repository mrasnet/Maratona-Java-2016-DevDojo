package br.com.maratonajava.javacore.classes;
/**
 * inic. Curso Java Completo - Aula 27: Introdução a métodos
 */
public class A27a33_Calculadora_varargs {
    
    public void Soma(int num, int num2){
        System.out.println("A soma é "+(num+num2));
    }
    public void Subtrai(int num, int num2){
        System.out.println("A subtração é "+(num-num2));
    }
    public void multiplica(int num, int num2){
        System.out.println("O produto é "+(num*num2));
    }
    public double divide(int num, int num2){
        return num/num2;
    }
    //Em métodos tipo void é possível usar o comando return (sem qualquer valor) no lugar de um break dentro de uma estru. condicional.
    public void divideNumeros(int num, int num2){
        if(num2!=0){
            System.out.println(num/num2);
            return;
        }
        System.out.println("Não é possível dividir por zero");
    }
    //Curso Java Completo - Aula 33: Passagem de parâmetros varargs
    public void somaArray(int[] numeros){
        int soma=0;
        for(int num : numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
    //tipo VarArgs recebe um vetor ou um conjunto de valores separados por vírgulas, transformando esses num vetor
    /* 
       #Só é possível ter um varargs por assinatura de método;
       #Deve vir por último caso exista a declaração de outras variáveis no parâmetro.
    */
    public void somaVarArgs(int... numeros){
        int soma=0;
        for(int num : numeros){
            soma+=num;
        }
        System.out.println(soma);
    }   
}
