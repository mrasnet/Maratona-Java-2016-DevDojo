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
public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String imprime(){
        String dados="--------- Dados do Aluno ---------";
        dados+="\nNome: "+this.nome;
        dados+="\nIdade: "+this.idade;
        if(this.seminario!=null){
            dados+="\nSeminário inscrito: "+this.seminario.getTitulo();
        }else{
            dados+="\nSeminário inscrito: Este aluno não está inscrito em nenhum seminário";
        }
        
        return dados+="\n";
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
