package br.com.maratonajava.classes_utilitarias;

/**
 * Curso Java Completo - Aula 78: Classes Wrapper pt 01
 * Curso Java Completo - Aula 79: Classes Wrapper pt 02
 */
public class A78a79_WrappersTeste {
    public static void main(String[] args) {
        /* Tipos primitivos do java */
    byte bytePrimitivo = 1;
    short shortPrimitivo = 1;
    int intePrimitivo = 10;
    long longPrimitivo = 10L;
    float floatPrimitivo = 10F;
    double doublePrimitivo = 10D;
    char charPrimitivo = 'A';
    boolean booleanPrimitivo = true;
    
    /* Para escrever classes wrappers: com exceção do char e do int, só precisa escrever com a primeira letra maiúscula para criar um wrapper daquele tipo.
    A partir daqui estamos trabalhando com objeto e não mais tipos primitivos, e as regras de herança e polimorfismo se aplicam aqui */
    Byte byteWrapper = 1;
    Short shortWrapper = 1;
    Integer integerWrapper = 1;//até 127 é considerado Byte. Para Byte, Short e Integer é possível atribuir um valor inteiro sem problemas
    Long longWrapper = 10L;//Se removermos o L, estamos falando que o Long vai receber um inteiro primitivo, oq não é permitido
    Float floatWrapper = 10F;
    Double doubleWrapper = 10D;//Long, Float e Double, são subclasses de Number, atenção com as regras de polimorfismo entre classes na mesma hierarquia.
    Character characterWrapper = 'A';
    Boolean booleanWrapper = true;
    
    /* Autoboxing: passar um tipo primitivo para uma wrapper
       Unboxing: o processo inverso do descrito acima */
    //As formas utilizadas abaixo para fazer atribuição são redundantes e servem apenas para mostrar o comportamento dos wrappers
    Integer inteiro = new Integer("10");//Todos com exceção do char, aceitam também strings como argumento
    Integer inteiro2 = new Integer(10);
    Boolean booleano = new Boolean("TrUe");//também podemos passar uma string, a diferença é que nessa não é case-sensitive
    
    System.out.println(inteiro);
    System.out.println(inteiro2);
    System.out.println(booleano);
    
    //Para realizar converções, todos os wrappers dos tipos primitivos possuem um método parse
    String valor = "20";
    Float f = Float.parseFloat(valor);
    System.out.println(valor);
    
    //Para retornar um wrapper a partir de um tipo primitivo: podemos passar tanto o valor primitivo ou uma string
    Long longvalor = Long.valueOf(10L);
    
    //alguns métodos do character
        System.out.println(Character.isDigit('A'));//verifica se o char passado é um digito
        System.out.println(Character.isLetter('A'));//verifica se o char passado é uma letra
        System.out.println("Letra ou digito? : "+Character.isLetterOrDigit('A'));//verifica se o char passado é uma letra ou número
        System.out.println(Character.isUpperCase('A'));//verifica se o char passado é maiúsculo
        System.out.println(Character.isLowerCase('A'));//verifica se o char passado é minúsculo
        System.out.println(Character.toUpperCase('a'));//passa para minúsculo
        System.out.println(Character.toLowerCase('A'));//passa para minúsculo
         
    }
}
    
