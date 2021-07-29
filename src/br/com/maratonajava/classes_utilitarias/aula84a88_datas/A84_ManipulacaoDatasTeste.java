package br.com.maratonajava.classes_utilitarias.aula84a88_datas;

import java.util.Calendar;
import java.util.Date;

/**
 * Curso Java Completo - Aula 84: Datas com Date e Calendar
 * 
 * Com relação a datas, a classe Date é a primeira do java e atualmente obsoleta, agora temos outras classes como a Calendar e Timer (mais atual),
 * mas ainda sim, a classe Date ainda fornece alguns métodos que podem ser utilizados, apesar de não fornecer suporte a internalização.
 * 
 * Para trabalhar com datas, números e moedas, se utiliza as seguintes classes: NumberFormate, Locale, Calendar, Date, DateFormat
 */
public class A84_ManipulacaoDatasTeste {
    public static void main(String[] args) {
        /* Apesar de depreciados os métodos, é possível também colocar um valor em milisegundos (é possivel separar com underline numeros muito grandes),
        e o método converte para uma data correspondente. Quando queremos apenas a data atual, não colocamos nada no parâmetro do método */
        Date data = new Date(); 
        System.out.println(data);
        data.setTime(data.getTime()+3000_000L);//getTime retorna a hora em milisegundos, soma com os 300000mls e esse valor é setado com setTime em data
        System.out.println(data);//trabalhar com a classe Date é obsoleto e complicado
        
        /* Calendar é uma classe abstrata e para instanciar um objeto é necessário chamar um método estático.
        Com um conjunto extenso de classes e subclasses, se o desenvolvedor tiver utilizando nas Americas, provavelmente utilizará o calendario gregoriano,
        tem muitas opções nessa classe, e por isso é bem mais completa do que a classe Date, e bem mais simples de trabalhar */
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //É possível utilizar ambos em conjunto - ex.: se tem uma data num objeto do tipo Date e se quer passar para um objeto do tipo calendar
        //As duas linhas abaixo foram comentadas para visualizar o processo feito na linha 43
        //c.setTime(data); 
        //System.out.println(c);
        
        //Em alguns países consideram o domingo como o primeiro dia da semana, ex.: EUA. Na França o primeiro dia da semana é a segunda-feira
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        //o método get recebe como parâmetros int fields que são constantes
        System.out.println("O dia do mês: "+(c.get(Calendar.DAY_OF_MONTH)));
        System.out.println("O dia da semana: "+(c.get(Calendar.DAY_OF_WEEK)));
        System.out.println("O dia da semana em mês: "+(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)));//N sei oq porra é isso
        System.out.println("O dia do ano: "+(c.get(Calendar.DAY_OF_YEAR)));
        
        Date data2 = c.getTime();//c.getTime retorna um calendar
        System.out.println("Hora atual: "+data2);
        //Adicionando horas à hora de um calendar
        c.add(Calendar.HOUR, 2);//soma duas horas à hora daquele calendar - arg1 define a constante, arg2 a quantidade de horas
        data2 = c.getTime();
        System.out.println("Hora atual somada a 2 horas: "+data2);
        
        c.add(Calendar.MONTH, 3);//o ano aqui a depender do mês, pula pro próximo
        data2 = c.getTime();
        System.out.println("Data atual somando 3 mêses: "+data2);
        //utilizando o roll, se altera apenas aquele campo, diferente do add que correspondentemente altera os demais campos para refletir o valor colocado
        c.roll(Calendar.MONTH, 3);//o ano aqui continua o mesmo, com o add a depender do mês mudaria o ano pro próximo
        data2 = c.getTime();
        System.out.println("a data anterior somando 3 mêses, sem passar o ano: "+data2);
              
    }
}
