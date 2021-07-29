package br.com.maratonajava.javacore.classes.aula67_exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/*
 * Curso Java Completo - Aula 72: Tratamento de multiplas exceções pt 06
 * Curso Java Completo - Aula 73: Exceptions: Multi-catch pt 07
 */
public class Aula72_73_MultiplasRuntimeExceptions {
    public static void main(String[] args) {
        //Muita das coisas feitas aqui, sua forma varia nas versões mais recentes do java, aqui são referentes ao java 6
        //tratamento de multiplas exceções servem tanto para exceções do tipo checked e unchecked
        /* Quando se esta trabalhando com multiplas exceções: Uma classe mais genérica (superclasse) não pode vir antes de suas subclasses no catch,
        se não terá um código unreachable */
        try{
            throw new ArithmeticException();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        catch(IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }
        catch(ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
        catch(RuntimeException e){ /* Se o catch com o RuntimeException viesse antes das outras catches, as demais nunca seriam executadas por serem 
            classes filhas de RuntimeException, logo, todas as exceções seriam capturadas, fazendo o restante do código perder o sentido, o que daria
            um erro de compilação.
            
            Logo, se tiver multiplas exceções, e se tiverem na mesma herança manter sempre abaixo os mais genéricos */
            System.out.println("Dentro do RuntimeException");
        }
        
        
        /* Chamada de um método que pode lançar duas exceções (ou mais). No Java 7, é possível fazer multicatch da seguinte forma:
        Regras: Quando se está trabalhando com multicatch não se pode colocar classes que estão na mesma linha de herança (Não se pode colocar uma 
        subclasse e uma superclasse)
        
        Quando se tem um método que lança varias exceções - a partir do java 7 - usar Exception dentro de um catch não significa que estará capturando 
        todas as exceções, significa que o java está tentando evitar o programador de duplicar o código */ 
        try{
            talvezLanceException();
        }catch(SQLException | FileNotFoundException e){//captura uma SQLException OU*** uma FileNotFoundException 
       
        }
        /* catch(Exception e){//Esse catch poderia substituir o acima, entretanto, pode não ser a melhor abordagem
            
        }*/
    }    
    
    private static void talvezLanceException() throws SQLException, FileNotFoundException {
    
    }
}
