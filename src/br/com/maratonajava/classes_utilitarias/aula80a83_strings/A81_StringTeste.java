package br.com.maratonajava.classes_utilitarias.aula80a83_strings;

/*
 * Curso Java Completo - Aula 81: String pt 02

    1. charAt(arg)              - retorna o char na posição informada
    2. equals()                 - Para comparar objetos o recomendado é utilizar sempre o equals()
    3. equalsIgnoreCase(arg)    - Compara ignorando o case sensitive
    4. length()                 - retorna o tamanho da string, para vetores é usado o atributo 'length' (sem parenteses - é atributo***)
    5. replace(arg1, arg2)      - retorna uma string com substituição de caracteres
    6. toLowerCase()            - retorna a string toda minúscula
    7. toUpperCase()            - retorna a string toda maiúscula
    8. substring(arg1, arg2)    - retorna uma string a partir dos argumentos informados - arg1 = inicio / arg2 = fim
    9. trim()                   - Irá remover os espaços contido no INICIO e FIM da string
 */

public class A81_StringTeste {
    public static void main(String[] args) {
        String nome = "Naruto";
        
        System.out.println("retorna o char na posição informada: "+nome.charAt(0));//retorna o char na posição informada
        System.out.println(nome.equals("naruto"));
        System.out.println(nome.equalsIgnoreCase("naruto"));//Compara ignorando o case sensitive
        System.out.println(nome.length());/* Quando estamos usando arrays usamos apenas o length, mas com strings length é um método, logo, length().
        Com string a posição também inicia do ZERO, semelhante ao array */
        System.out.println(nome.replace('N', 'X')); //retorna uma string fazendo a substituição de caracteres
        System.out.println(nome);//Imprimindo a var nome aqui, ela ainda continua com o valor antigo
        System.out.println(nome.toLowerCase());//retorna a string toda minúscula
        System.out.println(nome.toUpperCase());//retorna a string toda maiúscula
        
        String numeros = "123456789";
        System.out.println(numeros.substring(0, 2));/* retorna uma string a partir da posição informada no primeiro argumento (começa do ZERO), até
        a posição informada no segundo argumento ( o segundo argumento diferentemente não começa do zero, e sim do UM )*/
        
        nome = "    Naruto     ";
        System.out.println(nome);
        System.out.println(nome.trim());//Irá remover os espaços contido no INICIO e FIM da string
         
    }
}
