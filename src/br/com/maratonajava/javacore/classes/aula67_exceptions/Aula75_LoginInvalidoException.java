package br.com.maratonajava.javacore.classes.aula67_exceptions;

/**
 * Curso Java Completo - Aula 75: Exceptions customizadas pt 09
 */
public class Aula75_LoginInvalidoException extends Exception{
    /* Além das classes do próprio java que extendem a classe Exception, podemos em nossos projetos, ter situações onde uma dada regra de negócio seja 
    muito especifica, e apesar das classes exceptions do java cobrir a maior parte dos casos, pode haver a necessidade de termos de criar as nossas próprias
    exceções.
    É boa prática usar o nome Exception sempre no final do nome da classe. 
    Essas classes sempre irão extender a classe Exception, assim temos uma exception do tipo checked */
    
    //Criando um construtor que retorna a mensagem da exceção para a classe super
    public Aula75_LoginInvalidoException(){
        super("Usuário ou senha inválida");
    }
    /* Importante: Nunca colocar nenhum tipo de tratamento nas classes de exception, então sempre que criar uma classe de exceção customizada não tentar
    colocar métodos ou outra coisa para tratar, pq o ciclo de vida de software pode ser mais longo do que se imagina, e um tratamento anteriormente feito,
    posteriormente pode não ser mais válido. Logo, **classes de exceção não devem tratar nenhum tipo de exceção*** */
}
