package br.com.maratonajava.javacore.classes.aula67_exceptions;

/**
 * Curso Java Completo - Aula 67: Exceptions pt 01
 */
public class Aula67_ErrorTeste {
    public static void main(String[] args) {
        stackOverflowError();
    }
    
    public static void stackOverflowError(){
        stackOverflowError();//Erro de recursão infinita, o método vai ficar se chamando infinitamente
        /* Quando se chama um método e esse método chama outro método e assim por diante, temos uma pilha(stack), se algum erro(exceção) for lançado 
        em algum desses métodos, ele vai retornar pro método anterior caso o próprio não trate a exceção(Não se trata erro), que posteriomente no método 
        main lançará aquele erro(exceção) específico (Se também não for tratado no main). Quando se tem um problema de stackOverFlow, a pilha(stack) 
        estourou o espaço disponível de memória */
        
        //Um Error não é uma exception, pois não é filha dessa classe, mas ambas são filhas da classe throwable    
    }
}
