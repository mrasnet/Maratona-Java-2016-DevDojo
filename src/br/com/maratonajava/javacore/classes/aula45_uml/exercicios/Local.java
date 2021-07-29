package br.com.maratonajava.javacore.classes.aula45_uml.exercicios;
/**
 * Curso Java Completo - Aula 46: Exercício associação pt 01
 * 
 * Crie um Sistema que gerencia seminários:
 * 
 * Deverá cadastrar os seminários, cadastrar os alunos, cadastrar os professores e cadastrar um local;
 * Um aluno poderá estar em apenas um seminário;
 * Um seminário poderá ter nenhum ou vários alunos;
 * Um professor poderá ministrar um ou vários seminários;
 * Um seminário só poderá ter um professor;
 * Um seminário deverá ter um local;
 * 
 * atributos aparte -------
 * Seminário: título;
 * Aluno: Nome e idade;
 * Professor: Nome e especialidade;
 * Local: Rua e bairro;
 */
public class Local {
    private String rua;
    private String bairro;

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }
    
    public String imprime(){
        String dados="\n---------- Endereço ----------";
        dados+="\nRua: "+this.rua;
        dados+="\nBairro: "+this.bairro;
        
        return dados+="\n";
    }
    
    public String getRua(){
        return this.rua;
    }
    public String getBairro(){
        return this.bairro;
    }
}
