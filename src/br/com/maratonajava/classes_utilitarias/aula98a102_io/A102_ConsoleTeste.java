package br.com.maratonajava.classes_utilitarias.aula98a102_io;

import java.io.Console;

/**
 * Curso Java Completo - Aula 102: IO pt 05 Classe Console
 * 
 * Provavelmente não iremos utilizar essa classe porque ela trabalha diretamente com entrada de dados via terminal, mas para certificação temos que saber
 * ao menos o básico dela.
 * Primeira coisa, é que, essa classe ela não poderá ser usada no IDE. Como precisamos ter acesso a um terminal, diretamente do IDE a gente não consegue.
 */
public class A102_ConsoleTeste {
    public static void main(String[] args) {
        /* Essa é a forma que conseguimos obter o console, entretanto se executarmos será retornado nulo porque não podemos trabalhar com console aqui,
        mas podemos criar nosso código e executá-lo via linha de comando. */
        //System.out.println(System.console());
        
        Console c = System.console();
        //Utilizando o formato informamos que o que será lido são caracteres - %s - Apenas uma questão de formatação
        char[] pw = c.readPassword("%s", "pw: ");
        /* Se tratando de leitura, o readline retorna uma string, enquanto que o readPassword retorna um array de char, devido strings ficarem salvas no 
        pool the strings do java */
        for(char pass : pw){
            c.format("%c ", pass); //aqui formatamos a saída
        }
        c.format("\n");//aqui apenas pulamos a linha
        
        String texto;
        //Ctrl C para parar a execução do laço no terminal
        while(true){
            texto = c.readLine("%s", "Digite: ");//%s irá receber a string
            c.format("Esse texto - %s - foi digitado\n", texto);//%s irá substituir oq passarmos depois da virgula
        }
    }
    
    /* 
    -- Salve o código num bloco de notas com a extensão .java e rode pelo terminal do cmd (Windows) ***
    - enquanto digitarmos o password os cararecteres não aparecem 
    
    -----------------------------------------------------------------------------------------------------
    import java.io.Console;

    public class A102ConsoleTeste {
        public static void main(String[] args) {
        
            Console c = System.console();
            char[] pw = c.readPassword("%s", "pw: ");

            for(char pass : pw){
                c.format("%c ", pass); 
            }
            c.format("\n");
        
            String texto;
            while(true){
                texto = c.readLine("%s", "Digite: ");
                c.format("Esse texto - %s - foi digitado\n", texto);
            }
        }
    }
    ------------------------------------------------------------------------------------------------------
    Essa é a forma de ler caracteres recebendo password utilizando a classe console, assim como texto digitado pelo o usuário - utilizando o terminal
    porque pelo o IDE não consegue reconhecer o teclado.
*/
}
