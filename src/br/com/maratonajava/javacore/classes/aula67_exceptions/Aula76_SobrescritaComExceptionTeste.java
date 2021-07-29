package br.com.maratonajava.javacore.classes.aula67_exceptions;

/**
 * Curso Java Completo - Aula 76: Exceptions e regras para sobrescrita pt 10
 */
public class Aula76_SobrescritaComExceptionTeste {
    public static void main(String[] args) {
        Aula76_Funcionario f = new Aula76_Funcionario();
        Aula76_Pessoa p = new Aula76_Pessoa();
        
        /* f.salvar();    - Se chamarmos dessa forma (sem tratamento e com o método da classe Funcionário sem lançar nenhuma exceção), é possível
        pq um método sobrescrito pode por motivos de implementação não lançar as exceções defindas no método da superclasse */
       // p.salvar();     - Para esse caso é necessário fazer o tratamento das exceções
    }
}
