package br.com.maratonajava.classes_utilitarias.aula80a83_strings;

/**
 * Curso Java Completo - Aula 82: Performance das Strings
 */
public class A82_StringPerformanceTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();//pega do sistema o tempo atual em milisegundos
        concatString(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String: "+(fim-inicio)+" ms");/* Aqui realiza a diferença entre o tempo final e inicial para mostrar o tempo gasto 
        na execução do método concatString - responsável por gerar várias strings - aqui com o intuito de demonstrar como gerar strings em dados contextos 
        pode consumir muito recursos computacionais */
        
        //Com stringBuilder leva bem menos tempo para realizar o mesmo processo
        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: "+(fim-inicio)+" ms");
        /* A única diferença entre as classes StringBuilder e StringBuffer: métodos da stringbuffer são todos sincronizados, protegidos contra acesso de
        multiplas threads no mesmo método, logo, um é utilizado em ambientes multithread e o outro não. 
        Em questão de performance o StringBuilder é melhor, pq o StringBuffer ainda tem que se preocupar em proteger os métodos, oq consume processamento */
        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer: "+(fim-inicio)+" ms");
    }
    
    private static void concatString(int tam){
        String str = "";
        for(int i=0; i<tam; i++){ //Aqui muitas strings serão geradas na memória
            str+=i;
        }
    }
    
    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for(int i=0; i<tam; i++){ 
            sb.append(i);
        }
    }
    
    private static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for(int i=0; i<tam; i++){ 
            sb.append(i);
        }
    }
}
