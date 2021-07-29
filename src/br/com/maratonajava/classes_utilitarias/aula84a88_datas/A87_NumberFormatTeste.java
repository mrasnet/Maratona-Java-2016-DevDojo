package br.com.maratonajava.classes_utilitarias.aula84a88_datas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
/**
 *
 * Curso Java Completo - Aula 87: Formatação de números e moeda com NumberFormat
 */
public class A87_NumberFormatTeste {
    public static void main(String[] args){
        float valor = 12345.6789f;
        Locale localjp = new Locale("JP");
        NumberFormat[] nf = new NumberFormat[4];
        
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(localjp);
        nf[2] = NumberFormat.getCurrencyInstance();
        nf[3] = NumberFormat.getCurrencyInstance(localjp); 
        
        //observe como o divisor de milhar e casas decimais mudam de acordo com o país, assim como o simbolo de moeda
        for(NumberFormat numf : nf){
            System.out.println(numf.format(valor));
        }
        
        //método úteis
        NumberFormat nf2 = NumberFormat.getInstance();
        System.out.println("Fração máxima de digitos: "+nf2.getMaximumFractionDigits());
        System.out.println(nf2.format(valor));
        //alterando o número de casas depois do ponto/virgula
        nf2.setMaximumFractionDigits(1);
        System.out.println("Fração máxima de digitos: "+nf2.getMaximumFractionDigits());
        System.out.println(nf2.format(valor));
        
        String numero = "9876,54321";
        try {
            System.out.println("A partir de uma string: "+nf2.parse(numero));
            //seta para a parte inteira somente, desconsidera casas decimais
            nf2.setParseIntegerOnly(true);
            System.out.println("desconsidera casas decimais: "+nf2.parse(numero));
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
}
