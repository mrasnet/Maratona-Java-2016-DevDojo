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
public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

   public Professor(String nome, String especialidade) {
       this.nome = nome;
       this.especialidade = especialidade;
   }
   
   public String imprime(){
       String dados="\n---------- Dados Professor ----------\n";
       
       dados+="\nNome: "+this.nome;
       dados+="\nEspecialidade: "+this.especialidade;
       if(this.seminario!=null && this.seminario.length!=0){
           dados+="\n\n------ Lista Seminários ------";         
               for(int i=0; i<this.seminario.length;i++){
                   dados+="\n"+(i+1)+": "+this.seminario[i].getTitulo();
                }
       }else{
           dados+="\nEsse professor ainda não possui seminários cadastrados";
       } 
       return dados+="\n";
   }
           
   public String getNome(){
       return this.nome;
   }
   
   public String getEspecialidade(){
       return this.especialidade;
   }
   
   public Seminario[] getSeminario() {
        return seminario;
   }

   public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
   }
   
   public void setSeminario(Seminario seminario){
        Seminario[] seminarioAtualizado;
        seminarioAtualizado = new Seminario[this.seminario.length+1];
        
        for(int i = 0 ; i<this.seminario.length; i++){
            seminarioAtualizado[i] = this.seminario[i];
        }
        seminarioAtualizado[seminarioAtualizado.length-1] = seminario;
        this.seminario = seminarioAtualizado;
   }
}
