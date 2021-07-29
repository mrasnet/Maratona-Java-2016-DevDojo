package br.com.maratonajava.javacore.classes.aula50_heranca;
/**
 * Curso Java Completo - Aula 50: Herança pt 01
 * Curso Java Completo - Aula 51: Herança parte 2 e referência super
 * Curso Java Completo - Aula 52: Herança e Modificador Protected pt 03
 * Curso Java Completo - Aula 53: Herança e construtores pt 04
 * Curso Java Completo - Aula 54: Herança e Sequência de inicialização pt 05
 * 
 * Ordem de execução 
 * 1. Espaço em memória é alocado para o objeto sendo construído;
 * 2. Cada um dos atributos do objeto é criado e inicializado com os valores default;
 * 3. O construtor da superclasse é chamado;
 * 4. A inicialização dos atributos via declaração e o código do bloco de incialização da superclasse
 * 5. O código do construtor da superclasse é chamado;
 * 6. Passo 4 para a subclasse é executado;
 * 7. O código do construtor da subclasse é executado.
 */
public class TestaHeranca {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua da macaca");
        endereco.setBairro("Bairro pacífico");

        Pessoa p = new Pessoa("Carlos", "111.111.222-33",endereco);
        p.imprime();
        System.out.println("\n-----------------------------------");
        Funcionario f = new Funcionario("Matheus","222.222.333-99",endereco,1500);
        f.imprime(); 
    
    }
}
