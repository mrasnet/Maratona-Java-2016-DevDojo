package br.com.maratonajava.javacore.classes.aula50_heranca;

/**
 * Curso Java Completo - Aula 50: Herança pt 01
 * Curso Java Completo - Aula 51: Herança parte 2 e referência super
 * Curso Java Completo - Aula 52: Herança e Modificador Protected pt 03
 * Curso Java Completo - Aula 53: Herança e construtores pt 04
 */
public class Pessoa {
    //Toda classe no Java é filha da classe Object
    //Protected permite que classes no mesmo pacote ou classes filhas acessem seus atributos
    //Caso não quiséssemos o modificador de acesso protected, poderíamos deixar private e usar os getters and setters para acessar os atributos de classe
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    //No diagrama de classes, o modificador de acesso protected é representado pela a #(hastag)

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public Pessoa(){}
    
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.print("CPF: "+this.cpf);
        System.out.println(this.endereco.imprime());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
