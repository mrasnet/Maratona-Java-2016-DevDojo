package br.com.maratonajava.classes_utilitarias.aula80a83_strings;

/**
 * Curso Java Completo - Aula 83: StringBuilder and StringBuffer
 */
public class A83_StringBuilderTeste {
    public static void main(String[] args) {
    //Uma String não é uma StringBuilder, devido isso também a forma de concatenar é diferente da usada em Strings
    String s = "Uma frase comum";
    StringBuilder sb = new StringBuilder(16);//o inteiro referece a capacidade. 16 é o valor padrão se não passado nenhum argumento
    //Toda vez que se quiser adicionar uma string ao stringBuilder, será utilizado o append - ao utilizar o append, se está reaproveitando o mesmo objeto
    sb.append("Uma frase comum");
    sb.append(" teste");
    System.out.println(sb);//var de ref. dentro de um sout, oq será retornado é o método toString
    
    //Alguns métodos interessantes: 
    System.out.println(sb.reverse());//retorna o inverso da string
    System.out.println(sb); //ainda invertida
    System.out.println(sb.reverse());//re-inverte para a ordem inicial
    System.out.println(sb.delete(0, 2));//deleta de arg1(começa do zero) até arg2(começa do um)
    System.out.println(sb.insert(2, "###"));//insere uma string na posição arg1(começa do zero) 
    //os mesmo métodos servem para o StringBuffer devido ambos serem praticamente a mesma coisa
    }
}
