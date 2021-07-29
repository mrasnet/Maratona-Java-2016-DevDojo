package br.com.maratonajava.classes_utilitarias.aula84a88_datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * Curso Java Completo - Aula 88: Datas personalizadas com SimpleDateFormat
 */
public class A88_SimpleDateFormatTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        /* o construtor do SimpleDateFormat é sobrecarregado, assim, também podemos passar um padrão, esse padrão é oque será utilizado para personalizar
        nosso padrão de datas.
        Entretanto, esse padrão não é qualquer tipo de padrão, há umas 'regrinhas' que temos que seguir:
        Na documentação da SimpleDateFormat, em 'Date and Time Patterns', temos todas as letras que podemos usar num dado padrão */
        String mascara = "EEE, d MMM yyyy 'às' HH:mm:ss Z";//'ás' vai ser utilizado como palavra
        //Tudo que se encontra entre aspas simples é ignorado da tabela de letras de formatação e é considerado palavra (Não converte)
        String mascara2 = "'Angicos-RN, ' yyyy.MM.dd G 'às' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        SimpleDateFormat sdf2 = new SimpleDateFormat(mascara2);
        
        System.out.println(sdf.format(c.getTime()));
        System.out.println(sdf2.format(c.getTime()));
    }
}
