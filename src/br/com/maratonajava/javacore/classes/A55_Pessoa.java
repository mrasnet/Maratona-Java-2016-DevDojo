package br.com.maratonajava.javacore.classes;

/**
 * Curso Java Completo - Aula 55: Sobrescrita de métodos
 */
public class A55_Pessoa {
    private String nome;
    private int idade;

     /* Sobrescrita é diferente de sobrecarga, a assinatura tem que ser semelhante (modificadores de acesso, somente os menos privados possíveis), e a
    sobrescrita deve atender as necessidades da classe em questão. A sobrescrita permite mudar o comportamento de um método definido numa super classe para
    se adaptar a classe filha em questão. A vantagem da sobrescrita é quando se utiliza polimorfismo.
    Geralmente para esse caso, aqui definimos como necessidade a impressão dos dados para um objeto dessa classe */
    @Override //utilizar o metodo toString para impressão, simplifica muito na hora de debugar o código, algo que pode vir a ser feito bastante. 
    public String toString() { 
        return "Nome: "+this.nome+", idade: "+this.idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
  
}
