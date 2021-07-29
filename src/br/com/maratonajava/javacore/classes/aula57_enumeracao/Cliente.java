package br.com.maratonajava.javacore.classes.aula57_enumeracao;

/**
 * Curso Java Completo - Aula 57: Enumeração pt 01
 * Curso Java Completo - Aula 58: Enumeração pt 02
 * Curso Java Completo - Aula 59: Enumeração pt 03
 * 
 * Alguns dos conceitos aqui raramente serão aplicados na vida real, e são estudados mais para a certificação***
 */
public class Cliente {
    //Enumerações tem duas formas de criar: uma é como classe e outra é como atributo
    //Como classe: na criação se define o tipo como "enum" e não "class"
    private String nome;
    private TipoCliente tipoCliente;
    //Como atributo
    public enum TipoPagamento{//define o conjunto de valores para qual a var tipoPagamento poderá assumir
        AVISTA, APRAZO;
    }
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }
    
    @Override
    public String toString(){
        return "\nNome: "+this.nome+"\nTipo: "+this.tipoCliente.getNome()+"\nTipo pagamento: "+this.tipoPagamento+
                "\nNumero tipo: "+this.tipoCliente.getTipo();
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }   
}
