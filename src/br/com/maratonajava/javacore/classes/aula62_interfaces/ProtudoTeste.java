package br.com.maratonajava.javacore.classes.aula62_interfaces;

/**
 * Curso Java Completo - Aula 62: Interfaces pt 01
 * Curso Java Completo - Aula 63: Interfaces pt 02
 * 
 * Uma interface diz o que se deve fazer e não como fazer
 */
public class ProtudoTeste {
    public static void main(String[] args) {
        //Interface pode criar uma var de referencia mas não pode instanciar um objeto. Exceto em "classes anonimas"
        Produto p = new Produto("Notebook",4,3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
