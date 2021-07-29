package br.com.maratonajava.javacore.classes.aula67_exceptions;

/**
 * Curso Java Completo - Aula 75: Exceptions customizadas pt 09
 */
public class Aula75_LoginInvalidoExceptionTeste {
    public static void main(String[] args) {
        /* Aqui somos obrigados a tratar a exceção que pode possivelmente ser lançada. Soluções: ou usa-se um try-catch ou adiciona na assinatura do main
        a exceção */
        try {
            Logar();
        } catch (Aula75_LoginInvalidoException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("continuando o programa...");
    }
 
    private static void Logar() throws Aula75_LoginInvalidoException{
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "112";
        //Verifica se o usuário e senha do "banco" são iguais aos "digitados pelo o usuário"
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new Aula75_LoginInvalidoException();//lança a exceção se for diferentes os dados
        }else{
            System.out.println("Logado");
        }
    } 
}
