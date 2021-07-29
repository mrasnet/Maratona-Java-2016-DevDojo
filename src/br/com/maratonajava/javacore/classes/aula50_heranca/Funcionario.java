package br.com.maratonajava.javacore.classes.aula50_heranca;

/**
 * Curso Java Completo - Aula 50: Herança pt 01
 * Curso Java Completo - Aula 51: Herança parte 2 e referência super
 * Curso Java Completo - Aula 52: Herança e Modificador Protected pt 03
 * Curso Java Completo - Aula 53: Herança e construtores pt 04
 */
public class Funcionario extends Pessoa{//Não existe multipla herança no Java
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco,double salario) {
        //Super tem que ser a primeira linha no construtor. Também não se pode usar o super e o this (para chamar outro construtor) juntos
        super(nome, cpf, endereco);
        this.salario = salario;
    }
    
    @Override
    public void imprime(){//Na sobrescrita de métodos a assinatura do método tem que ser a mesma definida na sua superclasse 
        super.imprime(); //chama o método imprime da classe pai
        System.out.println("Salario: "+this.salario); 
        
        this.imprimeReciboPagamento();
    }
    //super.<atributo> permite acessar atributos protected definidos na classe pai dentro de classes filhas
    public void imprimeReciboPagamento(){
        System.out.println("\nEu "+super.nome+" alego ter recebido o pagamento de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
 
}
