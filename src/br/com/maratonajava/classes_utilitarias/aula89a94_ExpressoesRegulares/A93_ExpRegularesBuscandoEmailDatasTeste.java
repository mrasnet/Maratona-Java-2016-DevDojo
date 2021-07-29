package br.com.maratonajava.classes_utilitarias.aula89a94_ExpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Curso Java Completo - Aula 93: Expressões regulares pt 05
 * 
 */
public class A93_ExpRegularesBuscandoEmailDatasTeste {
     public static void main(String[] args) {  
        //o ponto '.' é um caractere utilizado pelas as expressões regulares, por isso temos que utilizar o char de escape
        // . = coringa, isso significa que onde tem ponto podemos ter qualquer caractere no lugar
        /* definimos no regex que tudo antes de @ pode conter ([a-zA-Z0-9\\._-]), seguido de @, uma palavra '([a-zA-Z])+' - provedor - , seguido com a 
        seguinte expressão que nos diz que podemos ter uma palavra '.palavra' - (\\.([a-zA-Z])+)+ - que pode se repetir uma ou mais vezes */
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //Ou, "([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"
        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.br, teste@mail";  
        /* Diferença entre buscar e validar: em '#@!abrao@mail' ao adicionar '.br', ele será retornado ao compilar, isso pq quando montamos uma expressão 
        regular, estamos querendo encontrar um padrão dentro de um texto, e buscar não deve ser confundido com validar. Se quisermos validar um texto,
        podemos utilizar o método 'pattern.matches', que também tem na classe String, e nesse último é mais fácil utilizar */
        System.out.println("Email válido? "+"#@!abrao@mail.br".matches(regex));//Não precisamos criar uma var de referencia
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 012345678901234567890123456789");//apenas exemplifica os indices 
        System.out.println("Expressão: "+matcher.pattern());
        
        System.out.println("Posições encontradas: ");
        /* Enquanto o matcher.find for encontrando o padrão dentro do texto, 'matcher.start' retorna as posições e 'matcher.group' retorna os resultados */
        while(matcher.find()){
            //Para buscar usamos o 'matcher.group()' e para validar o 'string.matches(regex)' - ou pattern.matches(regex)
            System.out.println(matcher.start()+" "+matcher.group()); 
        }
        System.out.println();
        
        //DATAS 
        /* aqui estamos definindo um intervalo: [n,m], also: [n] = 'n' digitos - [n, ] = de n à infinito. Forma longa: Ex.: \\d\\d/\\d\\d/\\d\\d\\d\\d - 
        formato: dd/mm/yyyy. Ao definir ano com intervalo, valores de ano com 2 digitos também serão válidos. 
        Na expressão anterior "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+", no lugar do + final, poderiamos colocar [2], se quisessemos que a
        última palavra se repetisse no máximo duas vezes, assim: "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)[2]".
        Na aula, o exemplo usado que funcionava é "\\d[2]/\\d[2]/\\d[2,4]", entretanto, aqui funciona somente se substituir o colchete por chaves.
        Há ainda outro problema, a seguinte expressão ainda retornaria valores de ano com 3 digitos, por isso, foi feita a substituição abaixo. */
        String regex2 = "\\d{2}/\\d{2}/(\\d{4}|\\d{2})(\\s|$)";/* Ou, também: \\d{2}/\\d{2}/(\\d{4}|\\d{2}(\\D|$))
        Datas com ano 01/01/'001' conta como \\d{2} já que para contar 3 casas, passou pelo 2 e não vai nem chegar a contar \\d{4}. Por isso, o '(\\s|$)' 
        vai definir que sempre tenhamos um espaço em branco ou final de linha ao fim da expressão (principalmente) para anos com 2 digitos.
        Ainda, declarar primeiro o maior número nas chaves, será considerado como prioridade.*/
        String texto2 = "05/10/2010 05/05/2015 1/1/10 01/05/95 01/05/021";  
        Pattern pattern2 = Pattern.compile(regex2); 
        Matcher matcher2 = pattern2.matcher(texto2);

        System.out.println("Texto:  "+texto2);
        System.out.println("Indice: 012345678901234567890123456789");
        System.out.println("Expressão: "+matcher2.pattern());
        
        System.out.println("Posições encontradas: ");
 
        while(matcher2.find()){
            System.out.println(matcher2.start()+" "+matcher2.group()); 
        }
        System.out.println();
    }
}
