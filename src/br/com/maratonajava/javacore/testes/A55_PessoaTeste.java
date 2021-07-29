package br.com.maratonajava.javacore.testes;

import br.com.maratonajava.javacore.classes.A55_Pessoa;

/**
 * Curso Java Completo - Aula 55: Sobrescrita de métodos
 */
public class A55_PessoaTeste {
    public static void main(String[] args) {
        A55_Pessoa p = new A55_Pessoa();
        A55_Pessoa p2 = new A55_Pessoa();
        p.setNome("Carlos");
        p.setIdade(20);
        p2.setNome("Juliana");
        p2.setIdade(19);
        /*  O método toString pertence a super classe Object, ao sobrescrever esse método em A55_Pessoa, sua função muda para a necessidade da classe 
            como definimos. Nesse caso, usar somente a var de ref. funciona e não retornará o endereço de memoria, uma vez que definimos a sobrescrita
            do método toString */
        System.out.println(p); 
        System.out.println(p2); 
    }
}
