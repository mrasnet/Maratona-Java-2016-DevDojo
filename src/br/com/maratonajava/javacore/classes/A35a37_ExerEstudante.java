package br.com.maratonajava.javacore.classes;
/**
 * Curso Java Completo - Aula 35: Exercício sobre métodos
 * Curso Java Completo - Aula 37: Modificador de acesso private, get e set pt 01
 * Curso Java Completo - Aula 37: Modificador de acesso private, get e set pt 02
 */
public class A35a37_ExerEstudante {
    private String nome;
    private int idade;
    private float[] notas;
    
    public void imprimir(){
        String dados = "Nome: "+this.nome+"\nIdade: "+this.idade;
        
        if(this.notas!=null){
            dados+="\nNota 1: "+this.notas[0]+
            "\nNota 2: "+this.notas[1]+
            "\nNota 3: "+this.notas[2];
        }else{
            System.out.println(dados+"\n\nO Aluno não possui notas!");      
            return; //return sem nenhum valor, dentro de uma condição num método void faz retornar pro método que o chamou
        }
        
        System.out.println(calMedia(dados));
    }
    
    public String calMedia(String dados){
        float media =((this.notas[0]+this.notas[1]+this.notas[2])/this.notas.length);
        if(media>=6)
            dados+="\nMédia Final: "+media+"\n\nAluno(a) Aprovado!";
        else
            dados+="\nMédia Final: "+media+"\n\nAluno(a) Reprovado!";   
        
        return dados;
    }
    
    //Curso Java Completo - Aula 37: Modificador de acesso private, get e set pt 02
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float[] getNotas() {
        return notas;
    }
    //************ 
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNotas(float[] notas) {
        this.notas = notas;
    } 
}
