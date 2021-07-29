package br.com.maratonajava.javacore.classes.aula67_exceptions;

import java.io.FileNotFoundException;

/**
 * Curso Java Completo - Aula 76: Exceptions e regras para sobrescrita pt 10
 */
public class Aula76_Funcionario extends Aula76_Pessoa{
    /* Ao sobrescrever um método de uma superclasse que lança alguma exceção, é possível definir que esse não lance nenhuma exceção. Isso é possível pq a
    implementação do método sobrescrito pode ser totalmente diferente.
    
    Ainda se quiser, poderá ser sobrescrito lançando uma ou mais exceções definidas no método da superclasse.
    
    Haverá um erro de compilação se tentar lançar uma exceção que não tenha sido definida no método da superclasse, ou se a exceção for superclasse das 
    exceções definidas no método da superclasse, a não ser que seja do tipo RuntimeException ou subclasse dessa.
    
    E é possível declarar classes filhas das definidas no método da superclasse.
    */
    public void salvar() throws FileNotFoundException{}//FileNotFoundException é subclasse de IOException
}
