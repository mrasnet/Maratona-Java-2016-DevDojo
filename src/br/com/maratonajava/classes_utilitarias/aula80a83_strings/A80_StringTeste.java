package br.com.maratonajava.classes_utilitarias.aula80a83_strings;

/*
 * Curso Java Completo - Aula 80: String pt 01
 */
public class A80_StringTeste {
    public static void main(String[] args) {
        /* strings no java são imutáveis. Isso significa que sempre que tentamos gerar uma string a partir de outra, não estamos alterando essa, e sim 
        criando uma nova internamente que ficará contida na String constant pool do java (espaço onde são armazenadas as string no java).
        
        E quando estamos "criando uma nova string", o java procura na String constante pool se uma mesma string com os devidos mesmos caracteres já existe 
        - com o objetivo de economizar recursos de memória.  
        */
        String nome = "Matheus";
        //String sobrenome = new String("Souza"); //Segunda forma de declaração - redundante ***
        
        nome.concat(" Souza"); //Aqui vai ser criado um novo objeto string " Souza", adicionado à String constante pool e depois será retornado.
        System.out.println("Ao imprimir aqui a var 'nome', seu valor ainda será apenas: "+nome);
        /* busca na String constante pool se já tem uma string " Souza", retorna e concatena com a variável de referencia nome */
        nome = nome.concat(" Souza");
        System.out.println("Ao imprimir aqui a var 'nome', seu valor agora será: "+nome); //aqui imprime nome+" Souza"
        /* Aqui não estamos criando uma nova string ao declararmos uma nova variável de referencia. Como a string usada já existe no String constate pool, 
        o java apenas busca essa string (Matheus), e atribui à variável criada */
        String noome = "Matheus";
        String sobrenome = "Hatake";
        /* Aqui estamos: 1. criando uma var de ref. nova; 2. criando um novo objeto string; 3. adicionando essa string à String constant pool do java */
        String Soobrenome = new String("Hatake"); /* Aqui apesar da string passada já existir na StrConstPool do java, devido o "new" utilizado, estamos
        criando um novo objeto de string com o mesmo valor */
   
    }
    
}

