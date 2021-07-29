package br.com.maratonajava.javacore.classes;

/**
 * Curso Java Completo - Aula 41: Blocos de inicialização
 */
public class A41_Cliente_blocoInic {
    // Regra de inicialização no Java - ordem de execução:
    // 1 - Aloca espaço na memória para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inializado com seus valores default ou valores inicializados
    // 3 - Bloco de inicialização é executado
    // 4 - O construtor é executado
    private int[] parcelas;
    
    // Bloco de inicialização - apesar de poder ser colocado em qualquer posição dentro da classe, é recomendado sempre antes do construtor
    // Pode ser utilizado no lugar do construtor para inicializar os atributos, porém não recebe parâmetros
    { 
        System.out.println("Dentro do bloco de inicialização");
        parcelas = new int[100];
        for(int i=1; i<=100; i++){
            parcelas[i-1]=i;
        }
    }
    
    public A41_Cliente_blocoInic(){
        System.out.println("dentro do construtor");
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
