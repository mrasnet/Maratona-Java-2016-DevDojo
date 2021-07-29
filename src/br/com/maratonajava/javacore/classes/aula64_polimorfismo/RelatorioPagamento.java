package br.com.maratonajava.javacore.classes.aula64_polimorfismo;

/**
 * Curso Java Completo - Aula 64: Polimorfismo pt 01
 * Curso Java Completo - Aula 66: Polimorfismo pt 02
 * 
 * Polimorfismo: uma var de referencia pode se comportar de diferentes formas com base no tipo do objeto a qual ela está referenciando
 */
public class RelatorioPagamento {
    /*
    public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("\n------- Relatório de Pagamento para a Gerencia -------");
        gerente.calcularPagamento();
        System.out.println("\nNome: "+gerente.getNome()+"\nSalário desse mês: "+gerente.getSalario());
    }
    
    public void relatorioPagamentoVendedor(Vendedor vendedor){
        System.out.println("\n------- Relatório de Pagamento para Vendedores -------");
        vendedor.calcularPagamento();
        System.out.println("\nNome: "+vendedor.getNome()+"\nSalário desse mês: "+vendedor.getSalario());
    }
    */
    public void relatorioPagamentoGenerico(Funcionario funcionario){//Parâmetro polimórfico
        System.out.println("\n------- Relatório de Pagamento -------");
        //Quem executará os métodos serão o objeto do tipo Gerente ou do tipo Funcionario, aqui funcionario apenas faz referencia a um desses dois objetos.
        funcionario.calcularPagamento();//Assim, o calculaPagamento() a ser chamado será o correspondente de cada um.
        System.out.println("\nNome: "+funcionario.getNome()+"\nSalário desse mês: "+funcionario.getSalario());
        //Não será possível chamar métodos ou acessar atributos que foram definidos apenas nas subclasses. Por isso, é necessário o casting.
        //casting explícito
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação nos lucros: "+g.getParticipacaoNosLucros());
        }
        if(funcionario instanceof Vendedor){
            //outra forma de fazer numa única linha dentro do 'system.out.print', dessa forma não se tem uma variável de referencia
            System.out.println("Total de vendas: "+((Vendedor)funcionario).getTotalVendas());
        }
    }    
}
