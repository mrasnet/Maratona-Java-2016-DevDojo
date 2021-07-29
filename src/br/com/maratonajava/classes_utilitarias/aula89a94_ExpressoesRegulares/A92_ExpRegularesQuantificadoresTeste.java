package br.com.maratonajava.classes_utilitarias.aula89a94_ExpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Curso Java Completo - Aula 92: Expressões regulares pt 04
 * 
 * Quantificadores nas Expressões Regulares: É uma forma de dizer que devemos procurar por uma ou mais ocorrencias de determinada expressão
 * Basicamente temos 4 tipos de quantificadores:
 *   ?        - zero ou uma
 *   *        - zero ou mais
 *   +        - uma ou mais
 *  [n,m]     - de n à m ocorrencias (customizado)
 * 
 * Meta Caracteres úteis:
 *  ( )       - utilizado para agrupar expressões
 *   |        - (pipe)utilizado como OU lógico
 *   $        - (cifrão)utilizado para fim de linha - quiser encontrar algo que esteja no final da linha
 * 
 *  agrupamento:    
 *  ex.:
 *  o(v|c)o      - estamos dizendo para pegar algo que incia com 'o' seguido de 'v' ou 'c', seguido de 'o' novamente -  ovo, oco, cairiam nessa definição;
 *  maca(rr|c)ão - 'macarrão' ou 'macacão', cairiam nessa regra;
 */
public class A92_ExpRegularesQuantificadoresTeste {
     public static void main(String[] args) {  
        /* Anteriormente, ao compilar percebemos que é retornado os números hexadecimais válidos, entretanto, esses valores não estão completos como 
        definimos no texto. Então, tivemos que mudar a nossa expressão regular para podermos pegar os valores corretos */
       
        //Em Java caso se queira imprimir um número hexadecimal, esse número hexadecimal é representado começando com ZERO, X ou x , e um número
        int numeroexa = 0x123;
        
        /* Aqui, precisamos utilizar o agrupamento, nesse caso, o agrupamento vai servir para a parte '[0-9a-fA-F]', pq essa parte por definição pode se 
        repetir mais de uma vez, ou seja, buscamos um valor que comece com 0, X ou x, seguido de um caractere que pode ser '0-9a-fA-F', assim como
        o caractere seguido desse deverá também ser algo como '0-9a-fA-F', se esse existir. Do contrário, só interpretaria um caractere após o '0[Xx]'. */
        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";/* Aqui, a expressão '[0-9a-fA-F]' tem que repetir de 'UMA à mais vezes', por isso foi acrescentado o '+', 
        e ao chegar no espaço em branco, volta a procurar começando com 0[Xx]. Ainda, sabendo que o espaço em branco é um delimitador da expressão, assim 
        como o final de linha, acrescentamos na expressão '(\\s|$)', que diz que ao final da expressão deverá conter um espaço em branco ou simplesmente 
        nada (final de linha)*/
        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";  
        Pattern pattern = Pattern.compile(regex); //Agora irá buscar os valores hexadecimais corretos
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 012345678901234567890123456789");//apenas exemplifica os indices 
        System.out.println("Expressão: "+matcher.pattern());
        
        System.out.println("Posições encontradas: ");
        /* Enquanto o matcher.find for encontrando o padrão dentro do texto, 'matcher.start' retorna as posições e 'matcher.group' retorna os resultados */
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
        System.out.println();
        System.out.println("Número hexadecimal: "+numeroexa);
    }
}
