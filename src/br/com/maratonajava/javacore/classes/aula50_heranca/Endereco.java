package br.com.maratonajava.javacore.classes.aula50_heranca;

/**
 * Curso Java Completo - Aula 50: Herança pt 01
 * Curso Java Completo - Aula 51: Herança parte 2 e referência super
 * Curso Java Completo - Aula 52: Herança e Modificador Protected pt 03
 * Curso Java Completo - Aula 53: Herança e construtores pt 04
 */
public class Endereco {
    private String rua;
    private String bairro;
   
    public String imprime(){
        String dados="\nRua: "+rua+"\nBairro: "+bairro;
        
        return dados;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}