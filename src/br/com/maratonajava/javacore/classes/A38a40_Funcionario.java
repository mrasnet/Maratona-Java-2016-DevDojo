package br.com.maratonajava.javacore.classes;
/**
 * Curso Java Completo - Aula 38: Sobrecarga de métodos
 * Curso Java Completo - Aula 39: Construtores e sobrecarga de construtores pt 01
 * Curso Java Completo - Aula 40: Construtores e sobrecarga de construtores pt 02
 */
public class A38a40_Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    /* Se após o desenvolvimento de um sistema surja um novo atributo a ser adicionado, a sobrecarga permite não quebrar
    o código que utiliza um determinado método, sem necessidade de alterar a assinatura(parametros) desse método,
    assim sendo necessário apenas criar um novo método de mesmo nome incorporando em sua assinatura os antigos atributos
    mais os novos que vieram posteriormente. */
    private String rg; //adicionado posteriormente
    
    //construtor - Curso Java Completo - Aula 39: Construtores e sobrecarga de construtores pt 01
    //regra para criação de construtor: modificador de acesso + nome da classe
    public A38a40_Funcionario(String nome, String cpf, double salario, String rg){
    //this() : forma especial de chamar um construtor dentro de outro - Curso Java Completo - Aula 40: Construtores e sobrecarga de construtores pt 02
        this();//Construtor só pode ser chamado dentro de construtor, e essa chamada tem que ser na primeira linha do bloco
        init(nome,cpf,salario,rg); //metodo com sobrecarga
    }
    //O outro construtor, funciona pq incorpora os conceitos de sobrecarga
    public A38a40_Funcionario(){
        System.out.println("Chamou o segundo construtor");
    }
    
    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    /*
    sobrecarga regra: um método pode assumir o mesmo nome de outro, porem seu total ou tipo de parametros diferem,
    o tipo de retorno ou o modificador de acesso não influenciam em nada
    */
    public void init(String nome, String cpf, double salario, String rg){
        init(nome,cpf,salario);//chama o primeiro init() já definido para setar os valores comuns
        this.rg = rg; //seta o atributo restante
    }
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.rg);
        System.out.println(this.salario);
    }
}
