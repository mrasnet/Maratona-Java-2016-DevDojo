package br.com.maratonajava.classes_utilitarias.aula84a88_datas;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Curso Java Completo - Aula 85: Formatação de datas com DateFormat
 * 
 * É uma classe simples, onde se tem 6 formas utilizadas para formatar datas
 */
public class A85_DateFormatTeste {
    public static void main(String[] args) {
    //DateFormat também é uma classe abstrata
    Calendar c = Calendar.getInstance();
    DateFormat[] dfa = new DateFormat[6];//É possível utilizar o new pq aqui estamos inicializando um array
    //foi utilizado um array para demonstrar as 6 formas de formatação
    dfa[0] = DateFormat.getInstance();
    //Vamos chamar esse método mais vezes pq ele é sobrecarregado - args: estilo e localização - não vamos utilizar localização no momento
    dfa[1] = DateFormat.getDateInstance();
    dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT); 
    dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
    dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
    dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
    //dependendo da JVM utilizada, a forma de exibição (IDIOMA e formatação) pode diferir
    for(DateFormat df : dfa){
        //é necessário retorna um objeto tipo Date, por isso o getTime
        System.out.println(df.format(c.getTime()));
    }
    }
}
