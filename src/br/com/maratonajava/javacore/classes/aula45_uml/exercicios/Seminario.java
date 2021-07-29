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
public class Seminario { 
    private String titulo;
    private Aluno[] aluno;
    private Professor professor;
    private Local local;
    
    public Seminario(String titulo, Aluno[] aluno, Professor prof, Local local){
        this.titulo = titulo;
        this.aluno = aluno;
        this.professor = prof;
        this.local = local;
    }
    
    public String retornaRelatorio(){
        String texto="------------- Relatório -----------------------------";
        texto += "\nNome do seminário: "+this.titulo+"\n";
        
        if(this.professor!=null){
            texto += this.professor.imprime(); 
        }    
        else{
            texto+="\nO seminário ainda não possui um professor cadastrado";
        }
        
        if(this.local!=null){
            texto += this.local.imprime();
        }    
        else{
            texto += "\nO seminário ainda não possui um endereço cadastrado";
        }
        
        texto += "\n\n--------------- Lista participantes (alunos) ---------------\n";
        if(this.aluno!=null && this.aluno.length!=0){
            for(int i=0; i<aluno.length;i++){
              texto += "\n --------------- Aluno "+(i+1)+" "+aluno[i].imprime();
            }
        }else{
            texto+="\nEsse Seminário ainda não possui alunos cadastrados";
        }    
        
        return texto+="\n";
    }
    
     public String getTitulo() {
        return titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Local getLocal() {
        return local;
    }
    
    public void setAluno(Aluno aluno){
        Aluno[] listaAlunosAtualizada;
        listaAlunosAtualizada = new Aluno[this.aluno.length+1];
        
        for(int i = 0; i<this.aluno.length; i++){
            listaAlunosAtualizada[i] = this.aluno[i];
        }
        listaAlunosAtualizada[listaAlunosAtualizada.length-1] = aluno;
        this.aluno = listaAlunosAtualizada;
   }
    
}
