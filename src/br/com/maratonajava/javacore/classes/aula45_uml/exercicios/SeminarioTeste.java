package br.com.maratonajava.javacore.classes.aula45_uml.exercicios;

/**
 * Curso Java Completo - Aula 46: Exercício associação pt 01
 * Curso Java Completo - Aula 49: Exercício associação pt 04
 */
public class SeminarioTeste {
    public static void main(String[] args) {
   
        Professor prof = new Professor("William Suane","Engenheiro de Software - SCRUM Master - OCP");
        Local local = new Local("Rua Deboassa","Alto das Maravilhas");
        Local local2 = new Local("Rua João José","Liberdade");
   
        Aluno[] aluno = new Aluno[5];
        aluno[0] = new Aluno("Matheus",25);
        aluno[1] = new Aluno("Daniel", 23);
        aluno[2] = new Aluno("Davi", 20);
        aluno[3] = new Aluno("Jessica", 21);
        aluno[4] = new Aluno("Bárbara", 26);
        
        Aluno[] aluno2 = new Aluno[3];
        aluno2[0] = new Aluno("Angelica",25);
        aluno2[1] = new Aluno("Gisele", 23);
        aluno2[2] = new Aluno("Geovana", 19);
      
        Seminario semi = new Seminario("Orientação a objetos com JAVA", aluno, prof, local);
        Seminario semi2 = new Seminario("Ontologia e Web Dinâmica", aluno2, prof, local2);
        prof.setSeminario(new Seminario[]{semi, semi2});
        
        aluno[0].setSeminario(semi);
        aluno[1].setSeminario(semi);
        aluno[2].setSeminario(semi);
        aluno[3].setSeminario(semi);
        aluno[4].setSeminario(semi);
        
        aluno2[0].setSeminario(semi2);
        aluno2[1].setSeminario(semi2);
        aluno2[2].setSeminario(semi2);
        
        System.out.println(semi2.retornaRelatorio());
        Aluno art = new Aluno("Arthur", 23);
        semi2.setAluno(art);
        art.setSeminario(semi2);
        System.out.println(semi2.retornaRelatorio());
        
        prof.setSeminario(new Seminario("Spring MVC", null, prof, local));
        
        System.out.println(semi.retornaRelatorio());
        Aluno elo = new Aluno("Eloyzze", 15);
        semi.setAluno(elo);
        elo.setSeminario(semi);
        System.out.println(semi.retornaRelatorio());
        
    }
}
