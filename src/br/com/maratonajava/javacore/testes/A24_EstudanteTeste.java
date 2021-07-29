package br.com.maratonajava.javacore.testes;

import br.com.maratonajava.javacore.classes.A24_Estudante;
/**
 * Curso Java Completo - Aula 24: Introdução a classes parte 1
 */
public class A24_EstudanteTeste {
    //classes no java tem que ser altamente coesivas (realizar apenas suas responsabilidades)
    //Baixa coesão é algo ruim no java, é querer fazer/ter tudo numa classe, deixando-a menos especializada 
    public static void main(String[] args) {
        A24_Estudante estudante = new A24_Estudante();
        
        estudante.nome="Hatake Kakashi";
        estudante.matricula="1212";
        estudante.idade=25;
    
        System.out.println("Nome: "+estudante.nome+", matricula: "+estudante.matricula+
                ", idade: "+estudante.idade);
    }
}
