package br.com.maratonajava.classes_utilitarias;

import java.util.Scanner;

/**
 * Curso Java Completo - Aula 95: Tokens e Delimitadores com String e Scanner
 * 
 * Em algum momento iremos precisar utilizar tokens - iremos precisar pegar uma string e seraparar ela usando algum caractere delimitador
 * Ter conhecimento de tokens ajuda muito em determinados tipos de problemas
 */
public class A95_Tokens_eDelimitadores_comString_eScannerTeste {
    public static void main(String[] args) {
        /* Precisamos separar cada um dos nomes e guardá-los em variáveis, os nomes são 'tokens', e a vírgula será o delimitador utilizado aqui - podemos
        utilizar o que quisermos como delimitador, assim como uma expressão regular */
        String str = "William, Paulo, Joana, Camila, John, Matheus";
        /* Temos 3 formas de trabalhar com delimitadores e tokens, mas iremos utilizar somente duas das formas: 
        1. Através da classe String     - Essa é a forma mais simples de trabalhar com Tokens
        2. Através da classe Scanner    - Essa é muito mais preparada e oferece muito mais recursos
        */
        //o método split separa os tokens através do delimitador passado no argumento - recebe uma regex ou string e retorna um array
        String[] tokens = str.split(",");
        for(String token : tokens){
            System.out.println(token.trim());//o método trim do String retira os espaços em branco
        }  
        System.out.println();
        
        //Com Scanner   - o construtor do scanner é sobrecarregado, havendo assim várias opções, pode receber um arquivo, uma string... que é oq vamos usar
        Scanner scan = new Scanner("1 true 100 oi");
        
        //A forma mais simples de trabalhar é transformando tudo para String - diferentemente da classe String, temos que usar um while
        while(scan.hasNext()){//verifica se existe uma próxima posição no objeto utilizando o espaço em branco como delimitador
            System.out.println(scan.next());//aqui acessa essa próxima posição e muda o indice automaticamente - retorna uma string
        }
        System.out.println();
        
        /* Quando trabalhamos com a classe String utilizando o 'split', por mais que se tenha números, ele irá transformar tudo para string, mas quando 
        trabalhamos com a classe Scanner temos a opção de pegar aquele token e fazer uma conversão automaticamente, e por padrão a classe Scanner utiliza
        o espaço em branco como delimitador, caso queiramos trocar temos que fazer a var de referencia do Scanner chamar o 'useDelimiter' que recebe um 
        pattern ou uma string: ex.: scan.useDelimiter(string) - ou pattern       - mas aqui iremos utilizar o padrão mesmo - espaço em branco */
        
        //Agora aqui, queremos pegar os valores e converté-los para os tipos primitivos
        Scanner scan2 = new Scanner("1 true 100 oi");
        while(scan2.hasNext()){
            if(scan2.hasNextInt()){//verifica se o próximo é do tipo inteiro
                int i = scan2.nextInt(); //retorna o inteiro
                System.out.println("int: "+i);
                
            }else if(scan2.hasNextBoolean()){//verifica se o próximo é do tipo boolean
                boolean b = scan2.nextBoolean();//retorna o boolean
                System.out.println("Boolean: "+b);
                
            }else{//caso não seja nenhum tipo primitivo, seja uma string
                System.out.println("String: "+scan2.next());
            }
        }
    }//Assim, caso queiramos trabalhar de uma forma mais dinâmica, podemos utilizar o Scanner, do contrário, de forma mais simples, podemos usar o String
}
