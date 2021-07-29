package br.com.maratonajava.javacore.classes.aula57_enumeracao;

/**
 * Curso Java Completo - Aula 57: Enumeração pt 01
 * Curso Java Completo - Aula 58: Enumeração pt 02
 * Curso Java Completo - Aula 59: Enumeração pt 03
 * 
 * Alguns dos conceitos aqui raramente serão aplicados na vida real, e são estudados mais para a certificação***
 */
public enum TipoCliente {
    //Enum é um tipo especial de classe
    //os atributos declarados aqui são constantes
    //É possível ter valores inteiros, strings e até mesmo multiplos valores separados por vírgulas dentro das constantes
    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica"){
        //Constant specific class body:
        @Override
        public String getId(){ //Aqui Pessoa jurídica sobrescreve getId para retornar um valor diferente para Id
            return "B";
        }
    }; //as contantes da enum tem que ser declaradas na primeira linha
    private int tipo; //atributos tem que vir depois das constantes.
    private String nome;

    //O construtor é sempre chamado apenas pela a própria classe no momento de iniciliazar os atributos
    private TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }
    
    /* Para garantir que ambas enum não compartilhem de um mesmo valor para um atributo é possível fazer uma sobrescrita de um método na declaração 
    de uma das enum */
    public String getId(){
        return "A";
    }
    
    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

}
