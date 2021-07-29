package br.com.maratonajava.javacore.classes.aula64_polimorfismo;

/**
 * Curso Java Completo - Aula 64: Polimorfismo pt 01
 * Curso Java Completo - Aula 65: Polimorfismo pt 02
 * 
 * Polimorfismo: uma var de referencia pode se comportar de diferentes formas com base no tipo do objeto a qual ela está referenciando
 */
public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo",5000,2000);
        Vendedor v = new Vendedor("Yuri",2000,20000);
        RelatorioPagamento relatoriopagment = new RelatorioPagamento();
        
        //relatoriopagment.relatorioPagamentoGerente(g);
        //relatoriopagment.relatorioPagamentoVendedor(v);
        
        /* A var de referencia da superclasse pode chamar os métodos da subclasse porque quem executa os métodos é sempre o objeto. Só funciona quando se 
        tem herança */
        /* Abaixo se tem uma espécie de casting para var do tipo reference, assim como um float cabe inteiramente dentro de um double, uma subclasse cabe
        dentro de sua superclasse (Não inteiramente nesse caso). */ 
        
        //Funcionario f = g;
        //System.out.println("------------- *** ---------------");
        //System.out.println(f.getSalario());
        
        relatoriopagment.relatorioPagamentoGenerico(g);
        relatoriopagment.relatorioPagamentoGenerico(v);
    }
}
