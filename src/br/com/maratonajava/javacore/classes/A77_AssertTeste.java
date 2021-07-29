package br.com.maratonajava.javacore.classes;

/**
 * Curso Java Completo - Aula 77: Assertivas
 * 
 * Assertivas : Se usa quando se quer verificar valores que podem vir a não ser o valor esperado, lança um erro (não é uma exceção). 
 * Assert é usado para teste, pra ter certeza que o que você espera vai acontecer, exception é algo que não deveria acontecer e aconteceu
 * Boa prática: Utilizar asserts em métodos privados somente
 */
public class A77_AssertTeste {
    public static void main(String[] args) {
        calculaSalario(-1000);
        //diasdaSemana(9);
    }
    
    private static void calculaSalario(double salario){
        /* Para garantir que um valor de salario nunca seja menor que zero temos que usar um if else porém haverá casos onde o uso de condicionais quando
        se tem muitas verificações não se torna a melhor estratégia.
        if(salario>0)
            //Essa linha faz cálculo com salario
        else
            System.out.println("Se chegou aqui, ferrou!"); */
        /* Utilizando asserts é possível garantir que sempre teremos um dado valor que estamos esperando, eliminando a necessidade do uso do if else */
        
        /* Só precisamos fazer a verificação dentro do assert. Aqui estamos dizendo que a dada condição tem que ser TRUE, pq caso contrário significa que 
        temos um erro. Com isso podemos garantir que na fase de teste o salário é sempre maior que zero. No caso o programa só vai executar nesse fluxo 
        de execução esperado, caso contrário, obtivermos um erro, o programa termina a execução para que possamos concertar esse dado comportamento */
        assert(salario>0) : "O salário não pode ser menor do que ZERO. Salario: "+salario; //podemos passar uma mensagem igual num sout - println
        //assert condição - (com ou sem parenteses) forma mais simples de definição
    }
    //assert em métodos públicos 
    public static void diasdaSemana(int dia){
        switch(dia){
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            default: assert false;/* Nesse caso, se o valor do dia não for nenhum dos presumidos, o programa deve apontar um erro, pq para nós não 
            interessa um valor diferente dos definidos */
        }
    }
    
    /* if(cod()==10){}
    olhando esse código, vamos dizer que cod() sempre deve retornar um valor == 10, no método cod() o valor la nunca poderá retornar um valor diferente, 
    ai por acaso… outro programador que está no mesmo projeto que o seu, vai e muda isso dentro do metodo cod() fazendo ele retornar outro valor, 
    ai, o que vc faz? bom, quero garantir que meu código está ok… entao uso assertivas para testar as partes que defini que nao podem mudar - qdo 
    vc compila com assertivas e ativa elas… se a linha acima for diferente vai lançar uma exceção entao vc vai saber que alguem mudou aonde nao devia…
    hehe isso é show de bola… a desculpa para o gerente de projetos - Olha na minha máquina rodou, pq aqui nao? - isso nao cola hehe… 
    
    Regras de Assertivas:
    Nao usar para testar métodos públicos;
    Nao causar efeitos colaterais;
    A primeira instrução deve ser sempre boolean assert boolean;
    
    No Eclipse, para ativar o assert
    Vá no properties do projeto, em Run/Debug Settings selecione o main de sua aplicação(se não houver uma, escolha new e escolha a classe com o 
    main(String[] args))
    Com a classe main abra o edit… Na aba (x)arguments o:
    Programm Arguments será os args[0]…args[args.length -1] da aplicação.
    na VM Arguments você pode passar os argumentos para JVM, como o -cp para executar o classpath , -ea que significa 'enable assertions' e outros comandos.
    
    Para executar o comando assert com o NetBeans 6.5 faça o seguinte:

    Vá nas propriedades do seu projeto, clicando com o botão direito do mouse em cima dele e escolhendo o menu (popup) propriedades;
    Na TreeView, escolha a opção [EXECUTAR] No campo [opções da VM] insira o seguinte texto: '-ea',  rode o projeto !!!
    não se esqueça de que para visualizar uma assert a condicional testada por ela deve ser falsa:
    assert false: "minha primeira asserção";
    
    Para remover o comando apenas apagar o -ea, ou desabilitar explicitamente com o -da
    Para ativar para uma dada classe: -ea:pocote_nome.classe_nome 
    Desabilitar para todas e habilitar para uma especifica: -da -ea:pocote_nome.classe_nome */
    
}
