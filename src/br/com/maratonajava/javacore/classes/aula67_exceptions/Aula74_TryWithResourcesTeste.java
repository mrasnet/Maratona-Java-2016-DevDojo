package br.com.maratonajava.javacore.classes.aula67_exceptions;

import java.io.*;
/**
 * Curso Java Completo - Aula 74 : Exceptions: try-with-resources pt 08
 */
public class Aula74_TryWithResourcesTeste {
    public static void main(String[] args) {
        lerArquivo03();//Chamando o método lerArquivo03
    }
    
    public static void lerArquivo(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("text.txt"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally{
           try{/* É necessário fechar o leitor, porém o mesmo pode lançar uma exceção que tem que ser tratada. Poderiamos criar um método que se 
               encarregaria disso, entretando seria jogar a responsabilidade para outro. No Java 6, temos essa forma de escrever o código, porém
               não é visualmente agradável*/
               if(reader!=null) //Não o bastante, ainda precisamos verificar se a referencia não é nula
                    reader.close();
           }catch(IOException e){
               e.printStackTrace();
           } 
        }
    }
    //A partir do Java 7 é possível pedir para que o próprio java se encarregue da tarefa de fechar os recursos usados, usando o try-with-resources
    public static void lerArquivo02() throws IOException{
        /* A regra para a declaração de variáveis dentro do parenteses do try: Se pode ter mais de uma, entretanto, somente variáveis de objetos cuja as
        as classes implementem as interfaces Autocloseable ou Closeable */ 
        /* Da seguinte forma, não precisamos nos preocupar em fechar, pq independente de se ter uma exceção, retorno ou nada (código fluindo normalmente), 
        O java vai se encarregar de fechar o recurso que está sendo usado. Outra coisa nova é o uso do catch que é desnecessário, sendo necessário apenas
        lançar a exceção na assinatura do método. Apesar de ser recomendado o uso do catch */ 
        try(Reader reader = new BufferedReader(new FileReader("text.txt"))){
           
        }/*catch(IOException e){    //A vantagem aqui está na quantidade de código que se faz desnecessário
            e.printStackTrace();
        }*/      
    }
    
     
     public static void lerArquivo03(){
        /* Estamos declarando as var leitor1 e leitor2 que implementam a interface AutoCloseable, mas em nenhum momento escrevemos a utilização do método
        close. Ao compilar, o main chamará o LerArquivo03, será possível observar que o próprio java - sozinho - chamou ambos os métodos de cada, fechando
        os recursos, e fez isso na ordem inversa da declaração */
        try( Aula74_Leitor1 leitor1 = new Aula74_Leitor1();
              Aula74_Leitor2 leitor2 = new Aula74_Leitor2() ){
         
        }catch(Exception e){
             e.printStackTrace();
        }
     }
}
