package br.com.maratonajava.javacore.classes.aula67_exceptions;

/**
 * Curso Java Completo - Aula 68: Exceptions pt 02
 * Curso Java Completo - Aula 69: Exceptions: Exceções checked pt 03
 */
public class Aula68_69_RuntimeExceptionTeste {
    public static void main(String[] args) {
        //int a = 10, b = 0;
        /* Erros de RuntimeException (Erro em tempo de execução) geralmente são erros de lógica que podem ser tratados através de uma ou mais condicionais.
        É possível executar o programa, pois o compilador permite */
        /*if(b!=0){ 
            int c = a/b; 
            System.out.println(c);
        }*/
          
        /* Exceções podem ser do tipo checked e unchecked: no tipo checked é necessário tratar, no unchecked não é necessário.
        Se tentar executar um programa que não trate uma exception do tipo checked, o compilador não permite executar, pois é obrigatório tratar.
            
        Todas as classes filhas de RuntimeException (e incluindo essa) são do tipo unchecked;
        Todas as classes filhas de Exception (e incluindo essa) são do tipo checked  (exceto RuntimeException)  */
        
        /* try e catch podem ser usados tanto para exceções do tipo checked e unchecked */
        try{
            int[] a = new int[2];
            System.out.println(a[2]);
            System.out.println("Imprimindo depois da possível execução");
        }catch(ArrayIndexOutOfBoundsException e){/* RuntimeException (menos específica) - Sempre tentar pegar as exceções mais específicas possíveis: 
            ArrayIndexOutOfBoundsException (mais específica) */
            e.printStackTrace();/* Exibe o mesmo "código" que mostra no console quando ocorre uma exceção, a diferença é que o restante do código 
            continua funcionando, pois o programa não "quebra"  */
        }    
        /* Mesmo que tenha sido lançado um ArrayIndexOutOfBoundsException, capturamos uma RuntimeException (ANTES). Isso é devido ao polimorfismo,
        entretanto as boas regras dizem que se tem que trabalhar com a classe mais específica possível, porque ela pode ter informações valiosas sobre 
        o erro. */
        System.out.println("Fora do bloco catch");
    }
}
