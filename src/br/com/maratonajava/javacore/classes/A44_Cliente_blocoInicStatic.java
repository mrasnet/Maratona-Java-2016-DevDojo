package br.com.maratonajava.javacore.classes;

/**
 * Curso Java Completo - Aula 44: Bloco de inicialização estático
 */
public class A44_Cliente_blocoInicStatic {
    // Regra de inicialização no Java - ordem de execução:
    // 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe (executado apenas uma vez)
    // 1 - Aloca espaço na memoria para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores inicializados
    // 3 - Bloco de inicialização é executado
    // 4 - O construtor é executado
    private static int[] parcelas;
    
    // Bloco de inicialização - apesar de poder ser colocado em qualquer posição dentro da classe, é recomendado sempre antes do construtor
    // Pode ser utilizado no lugar do construtor para inicializar os atributos, porém não recebe parâmetros
    // Um bloco de inic. não estático pode acessar atributos estáticos
    
    // Nesse caso, o bloco será executado apenas uma vez pela JVM (no momento que carregar a classe), mesmo que declare mais de um objeto na memória.
    static { 
        System.out.println("Dentro do bloco de inicialização estático");
        parcelas = new int[100];
        for(int i=1; i<=100; i++){
            parcelas[i-1]=i;
        }
    }
    //Se houver mais de um bloco de inic. estático, serão executados por ordem
    static{
        System.out.println("Dentro do segundo Bloco de Inic. Estático");
    }
    
    public A44_Cliente_blocoInicStatic(){
        System.out.println("dentro do construtor");
    }
    //método muda para estático pois agora faz referencia à um atributo estático
    public static int[] getParcelas() {
        return parcelas;
    }
}