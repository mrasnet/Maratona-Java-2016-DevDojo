package br.com.maratonajava.classes_utilitarias.aula84a88_datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * Curso Java Completo - Aula 86: Internacionalização com a classe Locale
 * 
 * Incluir localização à data e padrão de internacionalização. 
 */
public class A86_LocaleTeste {
    public static void main(String[] args) {
        //Para passar o idioma: Padrão ISO3 - ex.: PT = portugues / BR = Brasil / EN = ingles / US = USA
        //Há construtores que definem apenas o idioma ou idioma + país
        Locale localitaly = new Locale("it", "IT");//Italiano padrão
        Locale localswtzlnd = new Locale("it", "CH");//Italiano da Suíça
        Locale localjap = new Locale("ja", "JP");//Japão
        Locale localus = new Locale("en", "US");//USA
        
        Calendar c = Calendar.getInstance();
        //c.set(2021, Calendar.JULY, 2); //descomente para visualizar com uma data definida 
        
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localitaly);
        //é necessário retorna um objeto tipo Date, por isso o getTime
        System.out.println("Italiano padrão: "+( df.format(c.getTime())) ); 
        
        df = DateFormat.getDateInstance(DateFormat.FULL, localswtzlnd);
        System.out.println("Italiano da Suíça: "+( df.format(c.getTime())) );
        //Podemos pegar localização baseada no sistema operacional, requisição vinda da Web ou baseada na escolha do usuário, tem várias formas
        df = DateFormat.getDateInstance(DateFormat.FULL, localjap);
        System.out.println("Japão: "+( df.format(c.getTime())) );
        df = DateFormat.getDateInstance(DateFormat.FULL, localus);
        System.out.println("USA: "+( df.format(c.getTime())) );
        
        //métodos úteis de Locale
        System.out.println("");
        System.out.println("País: "+(localjap.getDisplayCountry()));
        System.out.println("Idioma: "+localjap.getDisplayLanguage());
        //passando o objeto locale no construtor getDisplayLanguage, esse retorna o idioma na linguagem do locale passado
        System.out.println("Idioma: "+localjap.getDisplayLanguage(localjap));
        //retorna o idioma inglês escrito em japonês, no caso, o parametro do método descreve em que idioma queremos que seja exibido
        System.out.println("Idioma: "+localus.getDisplayLanguage(localjap));
            
    }
}
